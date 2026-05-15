# TSF Shell Revival Project - Revised Plan

> Project: Revive TSF Shell 3D Launcher for Modern Android
> Last Updated: 2026-05-15
> Primary Source: TSF Shell 3.9.4 Prime

---

## CRITICAL CORRECTION

**The build was NOT actually compiling the decompiled code.** 

The `sourceSets` paths in `build.gradle.kts` were incorrect (`sources/sources` instead of `../sources/sources`), causing Gradle to skip compilation of 870+ Java files. The resulting APK was an empty shell containing only the modern skeleton UI.

---

## Current Status: THREE PATH OPTIONS

### Option A: Java Recompile (High Risk)
- **Status**: Decompiled Java has 870+ `goto` statements and syntax errors
- **Effort**: Months of manual fixes required
- **Risk**: Very High
- **Outcome**: Uncertain

### Option B: Smali Patching (Medium Risk)
- **Method**: Use `apktool` on original APK, patch Smali directly
- **Pros**: Bypasses Java compilation errors
- **Cons**: Still blocked by 32-bit native libs
- **Risk**: Medium

### Option C: Engine Rewrite (Recommended)
- **Method**: Extract assets, rebuild rendering engine from scratch using modern OpenGL ES
- **Pros**: 100% modern, 64-bit compatible
- **Cons**: Complete rebuild, not a "port"
- **Risk**: Medium (known scope)

---

## Recommended Path: Hybrid "Strangler Fig"

1. **Fix native libs**:
   - `libandenginephysicsbox2dextension.so`: Download AndEngine Box2D source, rebuild for arm64-v8a (open source)
   - `libkcmutil.so`: Stub out JNI methods in Java (79KB suggests simple utilities)

2. **If Java recompile fails**: Pivot to Smali patching or Engine Rewrite

3. **Preserve assets**: Extract all 3D models, textures, icons from `resources-Prime/`

---

## Updated Implementation Plan

### Phase 0: Verification (CURRENT)

- [ ] Fix sourceSets path and attempt actual compilation
- [ ] Count Java syntax errors to determine feasibility
- [ ] If errors < 100: proceed with fixes
- [ ] If errors > 1000: pivot to alternative approach

### Phase 1: Native Library Resolution

- [ ] Download AndEngine Box2D extension source
- [ ] Compile for arm64-v8a, x86_64
- [ ] Stub `libkcmutil.so` JNI methods in Java

### Phase 2: Code Integration (if viable)

- [ ] Fix decompiled Java syntax errors
- [ ] Wire original Home.java or rebuild ActivityGroup logic
- [ ] Connect ShellProvider database

### Phase 3: Modern Android Compliance

- [ ] Fix runtime permissions
- [ ] Add foreground service types
- [ ] Remove blocked permissions (READ_LOGS)

---

## Key Files & Assets

| Asset | Location | Purpose |
|-------|----------|---------|
| Decompiled Java | `sources/sources/com/tsf/shell/` | 842 classes |
| 3D Engine | `sources/sources/com/censivn/C3DEngine/` | 175 classes |
| Resources | `resources-Prime/res/` | Layouts, strings, drawables |
| 3D Assets | `resources-Prime/assets/` | Models, textures |
| Native Libs | `resources-Prime/lib/armeabi/` | .so files (32-bit) |

---

## Next Steps

1. Attempt build with corrected sourceSets paths
2. Assess error count
3. Decide on approach based on results