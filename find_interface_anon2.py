import os, re

basedir = "sources/sources"
count = 0
found = []

for root, dirs, files in os.walk(basedir):
    for fname in files:
        if not fname.endswith(".java"):
            continue
        fpath = os.path.join(root, fname)
        with open(fpath, "r", errors="ignore") as f:
            content = f.read()
        
        clean = re.sub(r"/\*.*?\*/", "", content, flags=re.DOTALL)
        clean = re.sub(r"//.*", "", clean)
        
        lines = clean.split("\n")
        
        depth = 0
        interfaces = []  # list of (name, start_line, depth_at_open)
        
        for i, line in enumerate(lines):
            stripped = line.strip()
            if not stripped:
                continue
            
            opens = stripped.count("{")
            closes = stripped.count("}")
            
            # Check for interface declaration
            m = re.search(r"\binterface\s+(\w+)", stripped)
            if m:
                # The interface opens at the next {
                interfaces.append((m.group(1), i, depth))
            
            depth += opens - closes
        
        # Now scan for fields inside each interface
        for iface_name, iface_line, iface_depth in interfaces:
            # Find the start of the interface body
            # Fields are at depth = iface_depth + 1
            body_start = -1
            for j in range(iface_line, len(lines)):
                stripped = lines[j].strip()
                opens = stripped.count("{")
                if opens > 0:
                    body_start = j
                    break
            
            if body_start < 0:
                continue
            
            # Scan from body_start until depth drops back to iface_depth
            for j in range(body_start + 1, len(lines)):
                stripped = lines[j].strip()
                if not stripped:
                    continue
                
                # Calculate depth at this line
                opens = stripped.count("{")
                closes = stripped.count("}")
                
                # Skip beyond interface
                if j > iface_line and closes > opens:
                    break
                
                # Skip method/default/static declarations
                if re.search(r"^\s*(default|void|abstract|static)\b", lines[j]):
                    continue
                
                # Skip annotations
                if re.search(r"^\s*@", lines[j]):
                    continue
                
                # Look for = new at what should be field level
                eq_pos = stripped.find("=")
                if eq_pos > 0 and " new " in stripped[eq_pos:]:
                    # Make sure this isn't a method declaration
                    paren_before_eq = stripped.find("(", 0, eq_pos)
                    if paren_before_eq == -1:
                        m2 = re.search(r"=\s*new\s+(\w+)", stripped)
                        if m2:
                            count += 1
                            found.append((fpath, iface_name, j + 1, stripped))

print(f"Found {count} interfaces with anonymous class field initializers:")
for fp, iface, ln, line in found:
    rel = os.path.relpath(fp)
    print(f"  {rel}:{ln} (interface {iface}) {line[:80]}")
