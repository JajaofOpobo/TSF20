import zipfile
import os
import sys
import subprocess

apk_path = r"C:\Users\Jaja\AndroidStudioProjects\TSF20\com.tsf.shell_3.9.4-30904_minAPI8(armeabi)(nodpi)_apkmirror.com.apk"
output_dir = r"C:\Users\Jaja\AndroidStudioProjects\TSF20\decompiled"

os.makedirs(output_dir, exist_ok=True)

print(f"Extracting APK to {output_dir}...")

with zipfile.ZipFile(apk_path, 'r') as zip_ref:
    zip_ref.extractall(output_dir)

print("APK extracted successfully!")

# Check what's inside
for root, dirs, files in os.walk(output_dir):
    level = root.replace(output_dir, '').count(os.sep)
    indent = ' ' * 2 * level
    print(f'{indent}{os.path.basename(root)}/')
    subindent = ' ' * 2 * (level + 1)
    for file in files[:10]:
        print(f'{subindent}{file}')
    if len(files) > 10:
        print(f'{subindent}... and {len(files) - 10} more files')