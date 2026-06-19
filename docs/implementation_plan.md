# TSF20 — Revised Execution Plan (2026-06-19)

> **Updates**: 2026-06-19 — Full deobfuscation complete, Phase 10 eliminated, Phase 4 simplified  
> **Supersedes**: previous `implementation_plan.md` (2026-06-02)  
> **Authoritative sources**: actual codebase audit (opencode 2026-06-02) + Frida runtime analysis  
> **Verified against**: 1,528 decompiled Java files, 40 fix scripts, 3 build logs, bundled-libs content  
> **Cross-reference APK**: `com.tsf.shell_1.9.9.7.6-72_minAPI8(armeabi)(nodpi)_apkmirror.com.apk` — less-obfuscated v1 used for deobfuscation mapping

---

## Executive Summary

TSF20 is a reverse-engineering revival of **TSF Shell v3.9.4** — a 3D Android launcher from 2019. The reconnaissance and runtime mapping phase is complete. **All ~877 single-letter obfuscated files have been renamed to meaningful names** across the entire project. The project now has:

- **1,528 decompiled `.java` files** across 4 top-level packages — all meaningfully named
- **40 Python fix scripts** in `scripts/` to repair decompilation artifacts
- **Frida runtime traces** fully documenting page transitions, scene graph, and rendering pipeline
- **0 successful compilations** to date — the fix pipeline was designed but never executed end-to-end

---

## What Changed Since the Previous Plan

| Issue | Previous Claim | Current State |
|-------|---------------|---------------|
| Obfuscation level | 79% extreme in `com.tsf.shell` | **0%** — all 1,026 files meaningfully renamed |
| Platform | Windows (`C:\Users\Jaja\...`) | **Linux** (`/home/jaja/...`) |
| Fix scripts | Would corrupt from ambiguous single-letter names | **Safe now** — no single-letter names remain |
| Phase 10 (Deobfuscation) | Experimental / planned | **Done** — 877 files renamed across 12 sessions |
| Script paths | Hardcode `/home/jaja/` (Windows-incompatible) | `/home/jaja/` is the **native Linux path** — no adaptation needed |
| `sourceSets` | Commented out | **Uncommented** — build will compile 1,528 decompiled files |
| `app/src/main/java/` | Contains 62 Room/data files | Contains **3 stub files** only — Room entities are in `archive/app-attempt/` |
| Source count | 1,523 files | **1,528 files** — `com.tsf.extend` (296 files) was undocumented |

## Deobfuscation Completed (2026-06-19)

All single-letter obfuscated Java files across the entire project have been renamed:

| Package Domain | Files | Approach |
|----------------|-------|----------|
| `com.tsf.shell.f.*` (workspace3D) | ~530 | Frida scene graph, method enumeration, v1 cross-reference |
| `com.tsf.shell.manager.*` | ~112 | Batch rename by domain (app, bind, theme, widget, etc.) |
| `com.tsf.shell.widget.*` | ~90 | Frida runtime class loading + scene graph evidence |
| `com.tsf.shell.plugin.*` | ~80 | Frida loaded-classes + feature analysis |
| `com.tsf.shell.preference.*` | ~30 | Loaded-class evidence |
| Shell core + remaining | ~35 | Structural naming from package context |

**Key technique**: Same-package simple-name refs (`extends a`, `new b()`) were fixed via regex after each batch. 500+ cross-package reference updates applied project-wide.

---

## Revised Execution Plan

### Phase 0: Environment Setup

| # | Task | Detail |
|---|------|--------|
| 0.1 | Verify JDK | JDK 17+ required (AGP 8.8.2). Run `java -version` |
| 0.2 | Verify Gradle | `gradle-8.12` wrapper exists. Run `./gradlew --version` |
| 0.3 | Verify Android SDK | Platform 34 installed, build-tools 35.x, NDK if needed |

---

### Phase 1: Fix Script Preparation — SKIP

**Original plan**: Adapt scripts from Unix paths to Windows paths.

**Current state**: We're on Linux with `/home/jaja/Documents/TSF20` — scripts' hardcoded paths match exactly. **No changes needed.**

---

### Phase 2: Generate Baseline Build Output

| # | Task | Action |
|---|------|--------|
| 2.1 | Remove stale build outputs | Clear `docs/build-output-*.txt` except the most recent |
| 2.2 | Fresh compilation attempt | `./gradlew compileDebugJavaWithJavac 2>&1 > docs/build-output-baseline.txt` |
| 2.3 | Categorize errors | Parse output into categories A/B/C/D (see Phase 5) |

> **Note:** Previous `build-output-fresh.txt` was generated with `sourceSets` **commented out** — it compiled 0 decompiled files. The real error count will be 500+.

---

### Phase 3: Classpath & Build Configuration

The build currently has `sourceSets` pointing at `sources/sources/` but **no bundled-libs in the classpath**.

| # | Task | Action |
|---|------|--------|
| 3.1 | Add bundled-libs to classpath | Add `java.srcDir("../bundled-libs")` or configure per-library |
| 3.2 | Resolve android.support.v4/v7 | Option A: Add bundled-libs to classpath. Option B: Migrate to AndroidX |
| 3.3 | Check duplicate classes | `app/src/main/java/` has 3 files — no overlap with `sources/sources/` currently |
| 3.4 | Verify SDK stubs exist | `FlurryAgent`, `ACRAConstants`, `Constants` exist as stubs — confirm coverage |

> **⚠️ bundled-libs not in classpath is a silent blocker.** `ItemInfo.java` references `com.censivn.C3DEngine.b.*` (decompiled), but `Home.java` references `com.flurry.android.FlurryAgent` (in `app/src/main/java/`). Both paths must be in the build.

---

### Phase 4: Fix Pipeline Execution (Revised)

**Pipeline simplified** — steps 4.1, 4.2, 4.6 are obsolete because no single-letter files remain. Step 4.3 needs adjustment.

| Step | Script | Effect |
|------|--------|--------|
| 4.1 | ~~`fix_filenames.py`~~ | **SKIP** — No filename/classname mismatches (all files renamed to match) |
| 4.2 | ~~`fix_class_decls2.py`~~ | **SKIP** — No single-letter `class d {}` in `d.java` patterns remain |
| 4.3 | `fix_refs_final.py` | **Needs review** — Uses `git diff --diff-filter=D` → `newname=oldname.upper()` which is wrong for our renames. May need a new script that reads the actual old→new mapping instead. Cross-refs were already fixed during renaming. |
| 4.4 | **Build checkpoint 1** | `./gradlew compileDebugJavaWithJavac` → `docs/build-output-post-refs.txt` |
| 4.5 | `fix_constructors_precise.py` | Fix constructor names from build error lines (reads build output) |
| 4.6 | ~~`fix_clashes.py`~~ | **SKIP** — No class/directory name clashes (no single-letter files or dirs) |
| 4.7 | `fix_package_refs.py` | Update package declarations if needed |
| 4.8 | **Build checkpoint 2** | `compileDebugJavaWithJavac` → `docs/build-output-post-clashes.txt` |
| 4.9 | `fix_all.py` then `fix_round2.py` | Create missing type stubs, fix inner types, ambiguous imports |

---

### Phase 5: Manual Error Resolution

After the automated pipeline, remaining errors fall into categories:

| Category | Typical Error | Approach | Est. Count |
|----------|--------------|----------|------------|
| **A: cannot find symbol** | Class referenced but doesn't exist | Create stub, fix import, or correct class name | ~40 |
| **B: ambiguous reference** | ~~Same single-letter name in multiple packages~~ | **OBSOLETE** — no single-letter names remain | **0** |
| **C: package does not exist** | Package path doesn't match filesystem | Fix package declaration | ~5 |
| **D: decompilation artifacts** | `goto`, `RuntimeException`, cyclic inheritance | Manual method rewrite (~44 goto files, 21 stub files) | ~65 |
| **E: SDK stubs** | `ACRAConstants.DEFAULT_SOCKET_TIMEOUT` etc | Verify stubs cover all referenced constants | ~3 |

---

### Phase 6: ActivityGroup Migration

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

---

### Phase 7: Bundled Library Integration

| # | Task | Action |
|---|------|--------|
| 7.1 | Catalog all decompiled source refs to bundled packages | `grep -r "import com\." sources/` \| grep for `import` across sources |
| 7.2 | Create Gradle configuration for bundled-libs | Add `java.srcDir("../bundled-libs")` in `sourceSets` |
| 7.3 | Handle JNI — `libkcmutil.so` | `com.cm.kinfoc.a.a(String, String, String, int, String) → byte[]` — must match native .so |
| 7.4 | Verify ACRA/Flurry stubs cover all calls | Cross-reference `FlurryAgent.*` and `ACRAConstants.*` usage in sources |

---

### Phase 8: AndroidX Migration

| # | Task | Action |
|---|------|--------|
| 8.1 | Scan `android.support.v4`/`v7` imports | Find all 37+ affected files |
| 8.2 | Replace with AndroidX equivalents | `v4.app.Fragment` → `androidx.fragment.app.Fragment`, etc |
| 8.3 | Remove bundled support lib classes from classpath | Once migration is complete |

---

### Phase 9: Build Verification

| # | Task | Action |
|---|------|--------|
| 9.1 | `compileDebugJavaWithJavac` | 0 errors target |
| 9.2 | `assembleDebug` | Valid APK in `build/outputs/apk/` |
| 9.3 | `adb install` + smoke test | App launches without crash |

---

## Verification Gates

| Gate | Criteria |
|------|----------|
| **P2 Baseline** | Build error count recorded, no silent failures |
| **P4.4** | Error count drops from baseline |
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
| `fix_refs_final.py` uses wrong mapping algorithm | High | Medium | Must be rewritten to use actual old→new name mapping |
