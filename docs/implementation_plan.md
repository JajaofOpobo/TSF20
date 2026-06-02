# TSF20 — Revised Execution Plan (2026-06-02)

> **Supersedes**: previous `implementation_plan.md` — contained factual errors about codebase state  
> **Authoritative sources**: actual codebase audit (opencode 2026-06-02) + Frida runtime analysis  
> **Verified against**: 1,528 decompiled Java files, 40 fix scripts, 3 build logs, bundled-libs content  
> **Cross-reference APK**: `com.tsf.shell_1.9.9.7.6-72_minAPI8(armeabi)(nodpi)_apkmirror.com.apk` — less-obfuscated v1 used for deobfuscation mapping

---

## Executive Summary

TSF20 is a reverse-engineering revival of **TSF Shell v3.9.4** — a 3D Android launcher from 2019. The reconnaissance and runtime mapping phase is complete. The project now has:

- **1,528 decompiled `.java` files** across 4 top-level packages
- **40 Python fix scripts** in `scripts/` to repair decompilation artifacts
- **Frida runtime traces** fully documenting page transitions, scene graph, and rendering pipeline
- **0 successful compilations** to date — the fix pipeline was designed but never executed end-to-end

---

## What Changed Since the Previous Plan

The previous plan had three material errors that are corrected here:

| Issue | Previous Claim | Actual State |
|-------|---------------|--------------|
| Script paths | All hardcode `/home/ubuntu/` | All hardcode `/home/jaja/` — already partially fixed |
| `sourceSets` | Commented out | **Uncommented** — build will compile 1,528 decompiled files |
| `app/src/main/java/` | Contains 62 Room/data files | Contains **3 stub files** only — Room entities are in `archive/app-attempt/` |
| Source count | 1,523 files | **1,528 files** — `com.tsf.extend` (296 files) was undocumented |

Additionally, 17 build logs and the CODEBASE_AUDIT document reference counts that exclude the `com.tsf.extend` package.

---

## Codebase Reality (Code-Verified Facts)

### Source Composition

| Package | Files | Obfuscation | Notes |
|---------|-------|-------------|-------|
| `com.tsf.shell` | 1,026 | 79% extreme | Main shell — `f/` (530 files) is deeply nested single-letter obfuscation |
| `com.tsf.extend` | **296** | Minimal | **Undocumented in all prior docs** — theme store, wallpaper picker, settings UI, "extend" SDK module |
| `com.censivn.C3DEngine` | 179 | API clean, internals heavy | API (55 files) readable delegation wrapper; internals (`b.*`) single-letter obfuscated |
| `com.ksmobile` | 16 | Minimal | Utility library |
| **SDK stubs** (app/src) | **3** | — | `FlurryAgent`, `Constants`, `ACRAConstants` — all no-op stubs |

### Bundled Libraries (`sources/bundled-libs/`) — Not in Build Classpath

These are extracted JARs that exist as `.java` files but are **NOT** included in the Gradle build:

| Library | Files | Purpose |
|---------|-------|---------|
| `android.support.v4` | 180 | Legacy support lib — references exist in 37+ decompiled files |
| `android.support.v7` | 92 | Legacy appcompat |
| `com.badlogic.gdx.math` | 1 | `Vector2.java` — LibGDX math (vectors only) |
| `com.badlogic.gdx.physics.box2d` | 43 | LibGDX Box2D wrapper — powers box2d physics extension |
| `com.cm.kinfoc` | 20 | Kinfoc analytics — JNI bridge to `libkcmutil.so` |
| `com.android.volley` | 30 | HTTP networking |
| `org.acra` | 38 | ACRA crash reporting |
| Other (`com.a`, `com.b`, etc.) | ~57 | Obfuscated SDK wrappers |

> **Key finding:** LibGDX is **math and Box2D only** — NO `com.badlogic.gdx.graphics.*` exists. C3DEngine does its own OpenGL ES rendering. The "LibGDX wrapper" theory is disproven.

### Decompilation Quality Issues (Code-Verified)

| Issue | Count | Severity |
|-------|-------|----------|
| `throw new RuntimeException` stubs | **21 files** | Methods that failed to decompile — mostly shaders + utils |
| `goto` statements (JADX artifact) | **44 files** | Complex control flow — may need manual rewrite |
| `InterfaceCxxxxa` unfixed names | 5 files | JADX couldn't resolve inner interface types |
| Empty method bodies | ~12 files | Minor decompilation loss |
| `Cxxxxa` numbered class names | ~20 files | JADX fallback naming for anonymous classes |
| Cyclic inheritance known | 1 file | `f/e/_h/a.java` |

### Previous Handwritten Attempt (`archive/app-attempt/`)

62 Java files from a handwritten attempt now in `archive/`. Contains:
- Room entities, DAOs, database, repository
- `HomeActivity`, `DesktopPagerView`, `DockView` — UI scaffolding
- `LibGDXRenderer`, `PageTransitionRenderer` — rendering attempts
- These are **not in the build path** and should remain archived

---

---

### Cross-Reference Resource: v1.9.9.7.6 APK

The less-obfuscated v1 APK at the path above has already been extracted and cross-referenced against v3.9.4. The output files are:

| File | Size | Contents |
|------|------|----------|
| `docs/runtime_analysis/v1.9.9.7.6_all_classes.txt` | 71 KB | All class names from v1 (readable names) |
| `docs/runtime_analysis/v1.9.9.7.6_C3DEngine_API.txt` | 34 KB | C3DEngine API surface in v1 |
| `docs/runtime_analysis/tsf_shell_deobfuscation_map.txt` | 194 KB | 5,964-line class/package mapping v1→v3 |
| `docs/runtime_analysis/c3dengine_deobfuscation_map.txt` | 6.4 KB | C3DEngine-specific obfuscation mapping |

**When to use this resource:**
- **Phase 5 (manual resolution):** When `cannot find symbol` errors reference obfuscated names, check the map for the v1 equivalent
- **Phase 10 (deobfuscation):** Apply the full map to rename classes
- **Ad-hoc analysis:** When reading obfuscated `f.*` classes, the v1 class list may reveal original names for corresponding subpackages

The v1 APK is preserved at the original download path for future re-extraction if needed.

---

## Revised Execution Plan

### Phase 0: Environment Setup (Platform-Agnostic)

The project lives at `C:\Users\Jaja\AndroidStudioProjects\TSF20` on **Windows**. All tools must be Windows-compatible.

| # | Task | Detail |
|---|------|--------|
| 0.1 | Verify JDK | JDK 17+ required (AGP 8.8.2). System has JDK 11 → **install JDK 17** |
| 0.2 | Verify Gradle | `gradle-8.12` wrapper exists. Run `gradlew --version` |
| 0.3 | Choose script runtime | **Decision required:** Use **Git Bash** (simplest — provides `grep`, Unix paths, git) or **patch scripts for native Windows** |
| 0.4 | Verify Android SDK | Platform 34 installed, build-tools 35.x, NDK if native libs needed |

---

### Phase 1: Fix Script Windows Adaptation

**Problem:** All 10 fix scripts have hardcoded Unix paths and 4 scripts use Unix `grep` via subprocess.

#### Option A: Git Bash (Recommended)

```bash
# In Git Bash, convert all paths:
sed -i 's|/home/jaja/Documents/TSF20|/c/Users/Jaja/AndroidStudioProjects/TSF20|g' scripts/fix_*.py
```

`grep`, `git`, `python3` all work in Git Bash. No script logic changes needed.

#### Option B: Native Windows Patching

Changes needed per script:

| Script | Change | Effort |
|--------|--------|--------|
| `fix_filenames.py` | `SOURCES` path only | 1 line |
| `fix_class_decls2.py` | `SOURCES` path only | 1 line |
| `fix_refs_final.py` | `SOURCES` path + `git` subprocess → Python native | 2 lines |
| `fix_all_refs.py` | Same as above | 2 lines |
| `fix_constructors_precise.py` | `SOURCES` path + `grep` → Python file read | 3 lines |
| `fix_clashes.py` | `SOURCES` path + `os.path.sep` normalization | 2 lines |
| `fix_package_refs.py` | `SOURCES` path only | 1 line |
| `fix_all.py` | `SOURCES` path only | 1 line |
| `fix_round2.py` | `SOURCES` path + `grep` → Python file read | 3 lines |
| `fix_parcelable_creators.py` | Standalone CLI — no changes | 0 lines |

The `grep` calls (2 scripts) are trivially replaceable:
```python
# Before:
result = subprocess.run(['grep', 'pattern', 'file'], capture_output=True, text=True)
# After:
with open('file') as f:
    lines = [l for l in f if 'pattern' in l]
```

---

### Phase 2: Generate Baseline Build Output

| # | Task | Action |
|---|------|--------|
| 2.1 | Remove stale build outputs | Clear `docs/build-output-*.txt` except the most recent |
| 2.2 | Fresh compilation attempt | `./gradlew compileDebugJavaWithJavac 2>&1 > docs/build-output-baseline.txt` |
| 2.3 | Categorize errors | Parse output into categories A/B/C/D (see Phase 4) |

> **Note:** Previous `build-output-fresh.txt` was generated with `sourceSets` **commented out** — it compiled 0 decompiled files. The real error count will be 500+.

---

### Phase 3: Classpath & Build Configuration

The build currently has `sourceSets` pointing at `sources/sources/` but **no bundled-libs in the classpath**.

| # | Task | Action |
|---|------|--------|
| 3.1 | Add bundled-libs to classpath | Add `java.srcDir("../bundled-libs")` or configure per-library |
| 3.2 | Resolve android.support.v4/v7 | Option A: Add bundled-libs to classpath. Option B: Migrate 37+ files to AndroidX |
| 3.3 | Check duplicate classes | `app/src/main/java/` has 3 files — no overlap with `sources/sources/` currently. After fix pipeline runs, check again |
| 3.4 | Verify SDK stubs exist | `FlurryAgent`, `ACRAConstants`, `Constants` exist as stubs — confirm they satisfy all references |

> **⚠️ bundled-libs not in classpath is a silent blocker.** The `ItemInfo.java` references `com.censivn.C3DEngine.b.*` which lives in decompiled sources, but `Home.java` references `com.flurry.android.FlurryAgent` which is in `app/src/main/java/`. Both paths must be in the build. Currently `sources/sources/` + `app/src/main/java/` are both included, but `sources/bundled-libs/` is NOT.

---

### Phase 4: Fix Pipeline Execution (Strict Order)

Run the 9-script pipeline in order. After each script, verify the build error count.

| Step | Script | Effect | Verification |
|------|--------|--------|-------------|
| 4.1 | `fix_filenames.py` | Rename .java files to match class names | No filename/classname mismatches |
| 4.2 | `fix_class_decls2.py` | Fix `class D {}` in `d.java` | Class declaration matches filename |
| 4.3 | `fix_refs_final.py` | Update import/FQ/bare refs for renamed types | 0 wrong-case references |
| 4.4 | **Build checkpoint 1** | `compileDebugJavaWithJavac` → `docs/build-output-post-refs.txt` | Error count from ~500 → should drop significantly |
| 4.5 | `fix_constructors_precise.py` | Fix constructor names from build error lines (reads `docs/build-output-post-refs.txt`) | 0 invalid method declaration errors |
| 4.6 | `fix_clashes.py` | Resolve class/directory name clashes (`a/` → `_a/`) | 0 package conflicts |
| 4.7 | `fix_package_refs.py` | Update refs after package renames | Refs match renamed packages |
| 4.8 | **Build checkpoint 2** | `compileDebugJavaWithJavac` → `docs/build-output-post-clashes.txt` | Expect <50 errors |
| 4.9 | `fix_all.py` then `fix_round2.py` | Create missing type stubs, fix inner types, ambiguous imports | Round-trip via build output |

---

### Phase 5: Manual Error Resolution

After the automated pipeline, remaining errors fall into categories (estimated >50 from `build-output-r2.txt` analysis):

| Category | Typical Error | Approach | Count* |
|----------|--------------|----------|--------|
| **A: cannot find symbol** | Class referenced but doesn't exist | Create stub, fix import, or correct class name | ~40 |
| **B: ambiguous reference** | Same class name in multiple packages (`j` in C3DEngine + shell) | Fully-qualify or rename one | ~12 |
| **C: package does not exist** | Package path doesn't match filesystem | Fix package declaration | ~5 |
| **D: decompilation artifacts** | `goto`, `RuntimeException`, cyclic inheritance | Manual method rewrite (~44 goto files, 21 stub files) | ~65 |
| **E: SDK stubs** | `ACRAConstants.DEFAULT_SOCKET_TIMEOUT` etc | Verify stubs cover all referenced constants | ~3 |

> *Estimates based on `build-output-r2.txt` — exact counts from Phase 2.2 baseline.

---

### Phase 6: ActivityGroup Migration (Was Undersized in Previous Plan)

`Home.java` extends `ActivityGroup` — this is a **navigation architecture rewrite**, not a class swap.

**What ActivityGroup does:**
- Manages child Activity lifecycle (onCreate/onStart/onResume/onPause/onStop/onDestroy)
- Maintains back stack of child activities
- Forwards key events, intent dispatch to active child
- Owns embedded view hierarchies via `getLocalActivityManager().startActivity()`

**Replacement pattern:**

| Original | Replacement |
|----------|-------------|
| `extends ActivityGroup` | `extends Activity` |
| `getLocalActivityManager().startActivity(...)` | `FragmentManager` + `FragmentTransaction` |
| `getLocalActivityManager().getCurrentActivity()` | Track active Fragment reference |
| `setContentView(w)` on child | `Fragment.onCreateView()` inflation |

This deserves its own spec document written before implementation.

---

### Phase 7: Bundled Library Integration (New)

The bundled libraries must be integrated into the build:

| # | Task | Action |
|---|------|--------|
| 7.1 | Catalog all decompiled source refs to bundled packages | `grep -r "import com\." sources/` | grep for `import` across sources |
| 7.2 | Create Gradle configuration for bundled-libs | Add `java.srcDir("../bundled-libs")` in `sourceSets`, or add each sub-package individually |
| 7.3 | Handle JNI — `libkcmutil.so` | `com.cm.kinfoc.a.a(String, String, String, int, String) → byte[]` — must match native .so. The current stub needs verification with Frida: capture actual return value from original APK, update stub |
| 7.4 | Verify ACRA/Flurry stubs cover all calls | Cross-reference `FlurryAgent.*` and `ACRAConstants.*` usage in sources against stub methods |

---

### Phase 8: AndroidX Migration

| # | Task | Action |
|---|------|--------|
| 8.1 | Scan `android.support.v4`/`v7` imports | Find all 37+ affected files |
| 8.2 | Replace with AndroidX equivalents | `v4.app.Fragment` → `androidx.fragment.app.Fragment`, etc |
| 8.3 | Remove bundled support lib classes from classpath | Once migration is complete, exclude `android/support/` from bundled-libs |

---

### Phase 9: Build Verification

| # | Task | Action |
|---|------|--------|
| 9.1 | `compileDebugJavaWithJavac` | 0 errors target |
| 9.2 | `assembleDebug` | Valid APK in `build/outputs/apk/` |
| 9.3 | `adb install` + smoke test | App launches without crash |

---

### Phase 10: Deobfuscation (Experimental)

| # | Task | Action |
|---|------|--------|
| 10.1 | Apply deobfuscation map | 5,964-line `tsf_shell_deobfuscation_map.txt` |
| 10.2 | Regression build | Verify deobfuscation doesn't break compilation |
| 10.3 | Generate readable stack traces | Map applies to source + ProGuard mapping file |

---

## Verification Gates

| Gate | Criteria |
|------|----------|
| **P2 Baseline** | Build error count recorded, no silent failures |
| **P4.4** | Error count drops from baseline (>50% reduction expected) |
| **P4.8** | <50 errors remaining |
| **P5** | 0 javac errors |
| **P9.1** | `compileDebugJavaWithJavac` exits 0 |
| **P9.2** | `assembleDebug` produces valid APK |

---

## Risks

| Risk | Likelihood | Impact | Mitigation |
|------|-----------|--------|------------|
| `goto` artifact volume requires weeks of rewrite | Medium | High | Time-box Phase 5 Category D to 2 days; route remaining to Rajawali fallback |
| ActivityGroup replacement breaks navigation | Medium | High | Write full spec with FragmentStateAdapter pattern before touching code |
| Bundled libs missing critical packages | Medium | High | Phase 3.1 catalog step must complete before pipeline runs |
| `libkcmutil.so` return value dependency | Low | Medium | Frida-capture the real return, stub returns matching value |
| Scripts fail silently on Windows paths | High | Medium | Test each script on a single file first; use Git Bash if needed |
