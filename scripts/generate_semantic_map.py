#!/usr/bin/env python3
import json
import sys
from collections import Counter

# Identify the conceptual parent of a class
def resolve_concept_parent(name, cls, all_classes):
    # 1. Nesting parent (e.g., com.tsf.shell.Home.AnonymousClass10 -> com.tsf.shell.Home)
    if "." in name:
        parts = name.split(".")
        parent = ".".join(parts[:-1])
        if parent in all_classes:
            return parent
            
    # 2. Field parent (synthetic outer reference)
    for f in cls.get("fields", []):
        t = f["type"]
        pkg = name.rsplit(".", 1)[0]
        # Try relative name first
        full_t = f"{pkg}.{t}"
        if full_t in all_classes and full_t != name:
            if len(f["name"]) <= 2 or "this" in f["name"]:
                return full_t
    return None

def normalize_type(t, mapping, pkg_context=""):
    if not t:
        return ""
    # Strip arrays and generics for signature comparison
    t_clean = t.replace("[]", "").split("<")[0].strip()
    
    # Check if fully qualified is in mapping
    if t_clean in mapping:
        return mapping[t_clean]
        
    # Check if relative name is in same package
    if pkg_context:
        full_t = f"{pkg_context}.{t_clean}"
        if full_t in mapping:
            return mapping[full_t]
            
    # If it is a standard library class, keep it
    if t_clean.startswith(("java.", "android.", "javax.", "org.acra", "com.google.android", "com.badlogic.gdx")):
        return t_clean
        
    # Basic primitive or simple common types
    if t_clean in ("int", "boolean", "float", "double", "long", "short", "byte", "char", "void", "String", "Object", "Class", "Integer", "Boolean", "Float", "Double", "Long"):
        return t_clean
        
    # Otherwise, return a generic placeholder to avoid matching on obfuscated names
    return "?"

def get_normalized_signature(cls, mapping):
    fullname = cls.get("fullname", "")
    pkg = fullname.rsplit(".", 1)[0] if "." in fullname else ""
    
    methods = []
    for m in cls.get("methods", []):
        ret = normalize_type(m.get("return"), mapping, pkg)
        params = [normalize_type(p, mapping, pkg) for p in m.get("params", [])]
        methods.append(f"{ret}({','.join(params)})")
    methods.sort()
    
    fields = [normalize_type(f.get("type"), mapping, pkg) for f in cls.get("fields", [])]
    fields.sort()
    
    sig = {
        "type": cls.get("type", "class"),
        "extends": normalize_type(cls.get("extends"), mapping, pkg),
        "implements": sorted([normalize_type(i, mapping, pkg) for i in cls.get("implements", [])]),
        "methods": methods,
        "fields": fields
    }
    return json.dumps(sig, sort_keys=True)

def build_string_frequencies(features):
    str_counts = Counter()
    for cls in features.values():
        unique_cls_strings = set(cls.get("strings", []))
        for s in unique_cls_strings:
            str_counts[s] += 1
    return str_counts

def is_obfuscated_name(name):
    last = name.split(".")[-1]
    # If the class name is a single letter or a JADX fallback pattern (e.g. C0079a, Class_1, etc.)
    # or starts with lowercase or is just digits
    if len(last) <= 2:
        return True
    if last[0].islower():
        return True
    # If it is a class name like 'aa', 'ab', 'C0012a'
    if len(last) == 3 and last[0].isupper() and last[1:].islower():
        # E.g. 'Ab' is probably obfuscated if the second is lower
        return True
    # If JADX obfuscation fallback (e.g. Cxxxx)
    if last.startswith("C") and len(last) >= 4 and last[1:4].isdigit():
        return True
    return False

def main():
    if len(sys.argv) < 4:
        print("Usage: generate_semantic_map.py <v1_features_json> <v3_features_json> <output_map_json>")
        sys.exit(1)
        
    v1_file = sys.argv[1]
    v3_file = sys.argv[2]
    output_file = sys.argv[3]
    
    with open(v1_file, 'r') as f:
        v1_features = json.load(f)
    with open(v3_file, 'r') as f:
        v3_features = json.load(f)
        
    print(f"Loaded {len(v1_features)} v1 classes, {len(v3_features)} v3 classes.")
    
    # Precompute concept parents
    v1_parents = {}
    for name, cls in v1_features.items():
        p = resolve_concept_parent(name, cls, v1_features)
        if p:
            v1_parents[name] = p
            
    v3_parents = {}
    for name, cls in v3_features.items():
        p = resolve_concept_parent(name, cls, v3_features)
        if p:
            v3_parents[name] = p
            
    print(f"Precomputed concept parents: {len(v1_parents)} in v1, {len(v3_parents)} in v3.")
    
    # Map: v3_class -> v1_class
    v3_to_v1 = {}
    v1_mapped = set()
    
    # --- SEEDING STAGE: Non-obfuscated Identical Names ---
    shared_names = set(v1_features.keys()).intersection(v3_features.keys())
    seed_count = 0
    for name in shared_names:
        if not is_obfuscated_name(name):
            v3_to_v1[name] = name
            v1_mapped.add(name)
            seed_count += 1
            
    print(f"Seeding Stage: Mapped {seed_count} non-obfuscated identical classes.")
    
    # Step 1: Count string frequencies
    v1_str_freqs = build_string_frequencies(v1_features)
    v3_str_freqs = build_string_frequencies(v3_features)
    
    # Heuristic: A string is valid if it appears in <= 3 classes in both versions
    # and has length >= 5.
    def is_valid_string(s):
        if len(s) < 5:
            return False
        if v1_str_freqs.get(s, 0) > 3 or v3_str_freqs.get(s, 0) > 3:
            return False
        return True

    # --- STAGE 1: String Matching ---
    # Find matching candidates for each v3 class based on shared valid strings
    candidates = {}
    for v3_name, v3_cls in v3_features.items():
        if v3_name in v3_to_v1:
            continue
        v3_strings = {s for s in v3_cls.get("strings", []) if is_valid_string(s)}
        if not v3_strings:
            continue
            
        cls_candidates = Counter()
        for v1_name, v1_cls in v1_features.items():
            if v1_name in v1_mapped:
                continue
            v1_strings = {s for s in v1_cls.get("strings", []) if is_valid_string(s)}
            shared = v3_strings.intersection(v1_strings)
            if shared:
                cls_candidates[v1_name] = len(shared)
                
        if cls_candidates:
            candidates[v3_name] = cls_candidates.most_common()

    # Resolve mutual best matches
    sorted_v3_by_score = sorted(candidates.keys(), key=lambda k: candidates[k][0][1], reverse=True)
    resolved_strings = 0
    for v3_name in sorted_v3_by_score:
        cls_candidates = candidates[v3_name]
        top_v1, top_score = cls_candidates[0]
        
        if top_v1 in v1_mapped:
            continue
            
        is_best = True
        for other_v3, other_cands in candidates.items():
            if other_v3 == v3_name:
                continue
            for o_v1, o_score in other_cands:
                if o_v1 == top_v1 and o_score > top_score:
                    is_best = False
                    break
            if not is_best:
                break
                
        if is_best:
            v3_to_v1[v3_name] = top_v1
            v1_mapped.add(top_v1)
            resolved_strings += 1
            
    print(f"Stage 1 (String Matching) mapped {resolved_strings} new classes.")

    # --- ITERATIVE SOLVER (Stages 2, 3, 4) ---
    iteration = 0
    while True:
        iteration += 1
        prev_mapped_count = len(v3_to_v1)
        print(f"\n--- Iteration {iteration} (Currently mapped: {prev_mapped_count}) ---")
        
        # 1. Concept Parent Propagation (Stage 2)
        resolved_parent_propagation = 0
        for v3_parent, v1_parent in list(v3_to_v1.items()):
            v3_children = [k for k, p in v3_parents.items() if p == v3_parent and k not in v3_to_v1]
            v1_children = [k for k, p in v1_parents.items() if p == v1_parent and k not in v1_mapped]
            
            if not v3_children or not v1_children:
                continue
                
            for v3_child in v3_children:
                v3_sig = get_normalized_signature(v3_features[v3_child], v3_to_v1)
                best_match = None
                match_count = 0
                for v1_child in v1_children:
                    v1_sig = get_normalized_signature(v1_features[v1_child], v3_to_v1)
                    if v3_sig == v1_sig:
                        best_match = v1_child
                        match_count += 1
                
                if match_count == 1:
                    v3_to_v1[v3_child] = best_match
                    v1_mapped.add(best_match)
                    resolved_parent_propagation += 1
                    
        print(f"Parent propagation mapped {resolved_parent_propagation} new classes.")
        
        # 2. Structural Signature Matching (Stage 3)
        v1_signatures = {}
        for name, cls in v1_features.items():
            if name in v1_mapped:
                continue
            sig = get_normalized_signature(cls, v3_to_v1)
            v1_signatures.setdefault(sig, []).append(name)
            
        v3_signatures = {}
        for name, cls in v3_features.items():
            if name in v3_to_v1:
                continue
            sig = get_normalized_signature(cls, v3_to_v1)
            v3_signatures.setdefault(sig, []).append(name)
            
        resolved_structural = 0
        for sig, v3_names in v3_signatures.items():
            if '"?"' in sig and sig.count('"?"') > 5:
                continue
            if len(v3_names) == 1:
                v1_names = v1_signatures.get(sig, [])
                if len(v1_names) == 1:
                    v3_name = v3_names[0]
                    v1_name = v1_names[0]
                    v3_to_v1[v3_name] = v1_name
                    v1_mapped.add(v1_name)
                    resolved_structural += 1
                    
        print(f"Unique structural signature matching mapped {resolved_structural} new classes.")
        
        # 3. Transitive Propagation (Stage 4)
        resolved_transitive = 0
        for v3_name, v1_name in list(v3_to_v1.items()):
            cls_v3 = v3_features[v3_name]
            cls_v1 = v1_features[v1_name]
            
            # Superclass propagation
            s_v3 = cls_v3.get("extends", "")
            s_v1 = cls_v1.get("extends", "")
            if s_v3 and s_v1:
                pkg_v3 = v3_name.rsplit(".", 1)[0] if "." in v3_name else ""
                pkg_v1 = v1_name.rsplit(".", 1)[0] if "." in v1_name else ""
                full_s_v3 = f"{pkg_v3}.{s_v3}" if pkg_v3 and not s_v3.startswith("com.") else s_v3
                full_s_v1 = f"{pkg_v1}.{s_v1}" if pkg_v1 and not s_v1.startswith("com.") else s_v1
                
                if full_s_v3 in v3_features and full_s_v1 in v1_features:
                    if full_s_v3 not in v3_to_v1 and full_s_v1 not in v1_mapped:
                        v3_to_v1[full_s_v3] = full_s_v1
                        v1_mapped.add(full_s_v1)
                        resolved_transitive += 1
                        
            # Interfaces propagation
            i_v3_list = cls_v3.get("implements", [])
            i_v1_list = cls_v1.get("implements", [])
            if len(i_v3_list) == 1 and len(i_v1_list) == 1:
                i_v3 = i_v3_list[0]
                i_v1 = i_v1_list[0]
                pkg_v3 = v3_name.rsplit(".", 1)[0] if "." in v3_name else ""
                pkg_v1 = v1_name.rsplit(".", 1)[0] if "." in v1_name else ""
                full_i_v3 = f"{pkg_v3}.{i_v3}" if pkg_v3 and not i_v3.startswith("com.") else i_v3
                full_i_v1 = f"{pkg_v1}.{i_v1}" if pkg_v1 and not i_v1.startswith("com.") else i_v1
                
                if full_i_v3 in v3_features and full_i_v1 in v1_features:
                    if full_i_v3 not in v3_to_v1 and full_i_v1 not in v1_mapped:
                        v3_to_v1[full_i_v3] = full_i_v1
                        v1_mapped.add(full_i_v1)
                        resolved_transitive += 1
                        
        print(f"Transitive propagation mapped {resolved_transitive} new classes.")
        
        # Stop condition
        if len(v3_to_v1) == prev_mapped_count:
            print("No new mappings found. Solver converged.")
            break
            
    # Save the output mapping dictionary
    output_data = {
        "metadata": {
            "v1_classes": len(v1_features),
            "v3_classes": len(v3_features),
            "total_mapped": len(v3_to_v1)
        },
        "mappings": v3_to_v1
    }
    
    with open(output_file, 'w') as f:
        json.dump(output_data, f, indent=2)
    print(f"\nTotal mapped after iterative resolution: {len(v3_to_v1)} / {len(v3_features)} ({len(v3_to_v1)/len(v3_features)*100:.2f}%)")
    print(f"Saved mapping dictionary to {output_file}")

if __name__ == '__main__':
    main()
