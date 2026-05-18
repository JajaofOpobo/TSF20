import os, re

basedir = os.path.join(os.getcwd(), "sources", "sources")
found = 0
total_static_final = 0

for root, dirs, files in os.walk(basedir):
    for fname in files:
        if not fname.endswith(".java"):
            continue
        fpath = os.path.join(root, fname)
        with open(fpath, "r", errors="ignore") as f:
            content = f.read()
        
        # Remove block comments
        clean = re.sub(r"/\*.*?\*/", "", content, flags=re.DOTALL)
        
        lines = clean.split("\n")
        in_block = False
        
        for i, line in enumerate(lines):
            stripped = line.strip()
            if not stripped:
                continue
            
            # Find all static final declarations
            # Pattern: [modifiers] Type Name = ...;
            # Look for "static final" without "private" before them
            # Remove single-line comments first
            code_part = re.sub(r"//.*", "", stripped)
            
            # Check for NEWCLASS pattern: = new Type(...) or = new Type() {
            # or = Type(...) { -- anonymous class from generic type
            if "static" in code_part and "final" in code_part and "private" not in code_part:
                if "= new " in code_part and "{" in code_part:
                    # This could be "= new Type() {" (anonymous class)
                    # or "= new Type()" (no anonymous class)
                    # Check for "{" after "= new"
                    eq_pos = code_part.find("= new ")
                    brace_after_new = code_part.find("{", eq_pos)
                    if brace_after_new >= 0:
                        # Check if "{" is before ";"
                        semi_pos = code_part.find(";", eq_pos)
                        if semi_pos == -1 or brace_after_new < semi_pos:
                            # This is an anonymous class initializer
                            found += 1
                            rel = os.path.relpath(fpath, basedir)
                            print(f"NON-PRIVATE STATIC FINAL WITH ANON CLASS: {rel}:{i+1}")
                            print(f"  {code_part[:120]}")

print(f"\nTotal non-private static final fields with anonymous classes: {found}")
