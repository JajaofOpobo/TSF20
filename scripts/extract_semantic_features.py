#!/usr/bin/env python3
import os
import re
import json
import sys

# Regex definitions
STRING_REGEX = re.compile(r'"((?:[^"\\]|\\.)*)"')
PACKAGE_REGEX = re.compile(r'package\s+([\w\.]+);')

# Simple parser to extract classes, fields, methods, and strings from a Java file
def parse_java_file(filepath):
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()

    # Find package name
    pkg_match = PACKAGE_REGEX.search(content)
    package = pkg_match.group(1) if pkg_match else ""

    # Extract all string literals first
    all_strings = STRING_REGEX.findall(content)
    # Clean up strings: ignore very short or empty or just space strings
    filtered_strings = []
    for s in all_strings:
        # Unescape basic chars if needed
        s_clean = s.strip()
        if len(s_clean) >= 4:
            filtered_strings.append(s_clean)

    # Let's parse classes, fields, and methods.
    # Since decompiled Java is quite uniform, we can do a line-by-line scanning approach
    # to find class declarations, methods, and fields.
    
    classes = []
    current_class = None
    class_stack = []

    # To handle inner classes, we track class scopes.
    # We can split the content into tokens or scan lines.
    lines = content.split('\n')
    
    # Simple regexes for class, method, field declarations
    # Match: public class Home extends ActivityGroup implements ...
    CLASS_DECL_RE = re.compile(r'(?:public|protected|private|static|final|abstract|\s)*\b(class|interface|enum)\b\s+([A-Za-z0-9_$]+)(?:\s+extends\s+([A-Za-z0-9_$.<>]+))?(?:\s+implements\s+([A-Za-z0-9_$,.<>\s]+))?')
    
    # Match: public void a(float f, float f2) { or private final BroadcastReceiver d = new A();
    # We want to distinguish fields and methods.
    # Method usually has (param1, param2) and either throws or ends with { or ; (if abstract)
    # Field ends with = value; or ;
    # Let's match methods:
    METHOD_RE = re.compile(r'(?:public|protected|private|static|final|synchronized|abstract|native|\s)+\b([A-Za-z0-9_$<>_\[\]]+)\b\s+([A-Za-z0-9_$]+)\s*\(([^)]*)\)\s*(?:throws\s+[^{;]+)?(?:\{|;)')
    
    # Let's match fields:
    FIELD_RE = re.compile(r'(?:public|protected|private|static|final|transient|volatile|\s)+\b([A-Za-z0-9_$<>_\[\]]+)\b\s+([A-Za-z0-9_$]+)\s*(?:=|;)')

    # Also capture all string literals on a per-line basis so we can associate them with the current class scope
    for line in lines:
        line_stripped = line.strip()
        if not line_stripped or line_stripped.startswith('//') or line_stripped.startswith('/*') or line_stripped.startswith('*'):
            continue
            
        # Check for class declaration
        class_match = CLASS_DECL_RE.search(line_stripped)
        if class_match:
            c_type, c_name, c_extends, c_implements = class_match.groups()
            
            # Resolve full class name
            parent_prefix = ".".join(class_stack)
            full_name = f"{package}.{parent_prefix}.{c_name}" if parent_prefix else f"{package}.{c_name}"
            full_name = full_name.replace("..", ".")
            
            # Setup class entry
            current_class = {
                "name": c_name,
                "fullname": full_name,
                "type": c_type,
                "extends": c_extends.strip() if c_extends else "",
                "implements": [i.strip() for i in c_implements.split(',')] if c_implements else [],
                "methods": [],
                "fields": [],
                "strings": []
            }
            classes.append(current_class)
            class_stack.append(c_name)
            
            # Also associate class-level strings
            # We will distribute strings by line occurrence
            
        # Parse strings on this line and add to current class if any
        line_strings = STRING_REGEX.findall(line_stripped)
        if current_class:
            for ls in line_strings:
                ls_clean = ls.strip()
                if len(ls_clean) >= 4:
                    current_class["strings"].append(ls_clean)

        # Parse method
        method_match = METHOD_RE.search(line_stripped)
        if method_match and current_class:
            ret_type, m_name, params = method_match.groups()
            # Clean parameter types (e.g. "float f, float f2" -> ["float", "float"])
            param_list = []
            if params.strip():
                for p in params.split(','):
                    parts = p.strip().split()
                    if parts:
                        # Take the type (usually first part, ignoring annotations like @NonNull)
                        # We just want the base type
                        type_part = parts[0]
                        if type_part.startswith('@') and len(parts) > 1:
                            type_part = parts[1]
                        param_list.append(type_part)
            
            current_class["methods"].append({
                "name": m_name,
                "return": ret_type,
                "params": param_list
            })
            continue # If it's a method, it's not a field

        # Parse field
        field_match = FIELD_RE.search(line_stripped)
        if field_match and current_class:
            f_type, f_name = field_match.groups()
            # Filter out language keywords that might match by accident
            if f_type not in ('return', 'throw', 'new', 'import', 'package', 'class', 'extends', 'implements'):
                current_class["fields"].append({
                    "name": f_name,
                    "type": f_type
                })

        # Basic tracking of scope end (if we see a closing brace, though this is heuristic,
        # it is usually okay for simple files. If we get mismatched class_stack, we'll clamp it)
        # Better yet, let's keep class_stack representing class nesting.
        # Since java file matches class name with filename, the top level class stack has 1 element.
        # We can also detect brace count, but line-by-line class declaration is usually enough.
        # If class_stack gets too deep or mismatched, we can reset it on new top-level declarations.
        
    return classes

def scan_directory(dir_path):
    all_features = {}
    print(f"Scanning directory: {dir_path}")
    count = 0
    for root, _, files in os.walk(dir_path):
        for file in files:
            if file.endswith('.java'):
                filepath = os.path.join(root, file)
                try:
                    classes = parse_java_file(filepath)
                    for cls in classes:
                        fullname = cls["fullname"]
                        all_features[fullname] = cls
                    count += 1
                except Exception as e:
                    print(f"Error parsing {filepath}: {e}")
    print(f"Finished parsing {count} files. Extracted {len(all_features)} classes.")
    return all_features

def main():
    if len(sys.argv) < 3:
        print("Usage: extract_semantic_features.py <source_dir> <output_json>")
        sys.exit(1)
        
    source_dir = sys.argv[1]
    output_json = sys.argv[2]
    
    features = scan_directory(source_dir)
    
    # Ensure parent dir of output exists
    os.makedirs(os.path.dirname(os.path.abspath(output_json)), exist_ok=True)
    
    with open(output_json, 'w', encoding='utf-8') as f:
        json.dump(features, f, indent=2)
    print(f"Features saved to {output_json}")

if __name__ == '__main__':
    main()
