import os, subprocess, sys, shutil, tempfile, glob

sources_dir = os.path.join(os.getcwd(), "sources", "sources")
build_gradle = os.path.join(os.getcwd(), "app", "build.gradle.kts")

# Get all .java files in sources/sources
all_files = []
for root, dirs, files in os.walk(sources_dir):
    for f in files:
        if f.endswith(".java"):
            all_files.append(os.path.relpath(os.path.join(root, f), sources_dir))

print(f"Total Java files: {len(all_files)}")

# Group files by their top-level directory
top_levels = {}
for f in all_files:
    top = f.split(os.sep)[0]
    if top not in top_levels:
        top_levels[top] = []
    top_levels[top].append(f)

for top, files in sorted(top_levels.items()):
    print(f"  {top}: {len(files)} files")

# For now, just list the sub-directories
print("\nTop-level directories:")
for top in sorted(top_levels.keys()):
    print(f"  {top}/")
