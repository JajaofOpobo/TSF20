# TSF20 Supervisor Audit Report & Execution Plan

> **Supersedes**: previous `implementation_plan.md` (v2) — counts were from v1.9.9.7.6 reference, not v3.9.4  
> **Replaces**: CODEBASE_AUDIT §10 recommended actions — this plan is the single source of truth for next steps  
> **Cataloged by**: opencode 2026-06-02

## Executive Summary

TSF20 is a **reverse-engineering revival** of TSF Shell v3.9.4 — a 3D Android launcher from 2019. The project started off track, prompting a strategic pivot: the codebase was reconstructed by cross-referencing a less-obfuscated older v1.x version and mapping out the runtime behavior using Frida on a rooted emulator. 

**This reconnaissance and mapping phase is now officially complete.** The runtime architecture, page transitions, rendering pipelines, and scene graphs are fully documented in `docs/runtime_analysis.md` and related files. We are now at a critical juncture: taking the 1,500+ decompiled files and running the fix pipeline to produce a compiling build.

> [!CAUTION]
> **Three concrete issues threaten momentum:**
> 1. **JDK version mismatch** — system has JDK 11, build requires JDK 17 (AGP 8.8.2 mandates it)
> 2. **Fix scripts are broken** — all hardcode `/home/ubuntu/` paths, will fail on this machine (`/home/jaja/`)
> 3. **Dual source trees are confusing** — `sources/sources/` (1,523 decompiled files) and `app/src/main/java/` (62 Room/data files) exist separately, build only sees `sources/sources/` via a commented-out `sourceSets` block

---

## Course Corrections Required

### 1. JDK 17 Must Be Installed
- System currently has **JDK 11.0.31** — AGP 8.8.2 requires JDK 17+
- **This blocks everything** — no build can succeed without it

### 2. Fix Script Paths Must Be Updated
- All scripts reference `/home/ubuntu/Documents/TSF20/sources/sources` 
- Must be updated to `/home/jaja/Documents/TSF20/sources/sources`
- Without this, the entire fix pipeline silently operates on non-existent paths

### 3. Source Tree Strategy Must Be Decided
- **Option A (recommended):** Keep decompiled sources in `sources/sources/`, point `build.gradle.kts` at them via `sourceSets`, move the 62 Room/data files into `sources/sources/` 
- **Option B:** Copy all 1,523 decompiled files into `app/src/main/java/` — but this makes the fix scripts' path assumptions wrong
- The commented-out `sourceSets` block in `build.gradle.kts` (lines 36-40) suggests **Option A** was intended

---

## Phase 0: Environment Setup (3 tasks)

| # | Task | Command / Action | Verify |
|---|------|-----------------|--------|
| 0.1 | Install JDK 17 | `sudo apt install -y openjdk-17-jdk` | `java -version` → `openjdk version "17.x.x"` |
| 0.2 | Set JAVA_HOME | `export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64` and add to `~/.bashrc` | `echo $JAVA_HOME` shows path |
| 0.3 | Verify Gradle wrapper | `cd /home/jaja/Documents/TSF20 && ./gradlew --version` | Gradle 8.12, JVM 17 |

---

## Phase 1: Obsolete File Cleanup & Archival (2 tasks)

| # | Task | Details |
|---|------|---------|
| 1.1 | Archive obsolete fix scripts | Move scripts tagged `OBSOLETE` in `fix_scripts_CATALOG.md` into `archive/scripts/`. Delete `scripts/legacy/`. |
| 1.2 | Label obsolete build logs | Move old build logs (`build-output-linux*.txt`, etc.) except latest representatives into `archive/logs/`. |

---

## Phase 2: Fix Script Path Migration (4 tasks)

| # | Task | Command | Verify |
|---|------|---------|--------|
| 2.1 | Identify all hardcoded paths | `grep -rn "/home/ubuntu" scripts/` | List all occurrences |
| 2.2 | Replace paths in scripts | `sed -i 's|/home/ubuntu|/home/jaja|g' scripts/*.py` | `grep -rn "/home/ubuntu"` returns empty |
| 2.3 | Update build-output file references | Check scripts for docs path references | No `/home/ubuntu` remains |
| 2.4 | Generate fresh build output | `./gradlew compileDebugJavaWithJavac 2>&1 \| tee docs/build-output-fresh.txt` | Baseline for fix pipeline |

---

## Phase 3: Source Tree Consolidation (3 tasks)

| # | Task | Action | Verify |
|---|------|--------|--------|
| 3.1 | Uncomment `sourceSets` in `app/build.gradle.kts` | Remove comment markers from `sourceSets` block so `java.srcDir("../sources/sources")` is active | Lines are uncommented |
| 3.2 | Check for class conflicts | `comm -12 <(find app/src/main/java -name "*.java" -exec basename {} \; \| sort) <(find sources/sources -name "*.java" -exec basename {} \; \| sort)` | Document duplicates |
| 3.3 | Move Room/data classes if needed | If conflicts found, move data classes into `sources/sources/` tree | Build sees all sources |

---

## Phase 4: Fix Pipeline Execution (9 tasks — strict order)

| # | Script | Command | Expected Effect |
|---|--------|---------|----------------|
| 4.1 | `fix_filenames.py` | `python3 scripts/fix_filenames.py` | Rename `.java` files to match class names |
| 4.2 | `fix_class_decls2.py` | `python3 scripts/fix_class_decls2.py` | Fix `class A {}` vs `a.java` mismatches |
| 4.3 | `fix_refs_final.py` | `python3 scripts/fix_refs_final.py` | Update imports/FQ refs for renamed types |
| 4.4 | **Build checkpoint 1** | `./gradlew compileDebugJavaWithJavac 2>&1 \| tee docs/build-output-post-refs.txt` | Error count should drop dramatically |
| 4.5 | `fix_constructors_precise.py` | Point at checkpoint output, then run | Fix constructor name mismatches |
| 4.6 | `fix_clashes.py` | `python3 scripts/fix_clashes.py` | Resolve class/directory name conflicts |
| 4.7 | `fix_package_refs.py` | `python3 scripts/fix_package_refs.py` | Update refs after clash renames |
| 4.8 | **Build checkpoint 2** | `./gradlew compileDebugJavaWithJavac 2>&1 \| tee docs/build-output-post-clashes.txt` | Expect <50 errors |
| 4.9 | Error-driven fixers | Run `fix_all.py` then `fix_round2.py` against new build output | Create stubs, fix imports |

---

## Phase 5: Manual Error Resolution (8 tasks)

| # | Task | Details |
|---|------|---------|
| 5.1 | Fix cyclic inheritance (`f/e/_h/a.java`) | Class implements own inner interface — correct the `implements` clause |
| 5.2 | Create JADX interface stubs | Create `InterfaceC0025a.java`, `InterfaceC0113a.java` as empty interfaces |
| 5.3 | Fix `import com.censivn.C3DEngine.A` errors | Verify actual class name after renaming |
| 5.4 | Fix `cannot find symbol: class a` in `manager.o` | Create stub class if missing |
| 5.5 | Fix `ShellProvider.a` inner class ref | Verify inner class exists in ShellProvider.java |
| 5.6 | Fix `??` placeholder errors | `c.java:198` (cast), `c.java:92` (generic cast `(E)`) |
| 5.7 | Create SDK stubs | `ACRAConstants`, `FlurryAgent`, `FlurryConstants` |
| 5.8 | Rewrite decompilation failures | Raw bytecode stubs in `themepicker/utils/c.java` (disk cache) |

---

## Phase 6: AndroidX & API Compatibility Migration (3 tasks)

| # | Task | Action |
|---|------|--------|
| 6.1 | Support Lib Migration | Scan/replace `android.support.v4/v7` → `androidx.*` across ~37 files |
| 6.2 | Refactor `Home.java` `ActivityGroup` | Replace `extends ActivityGroup` with modern View/Fragment management |
| 6.3 | Manifest updates | Ensure `android:exported`, fix deprecated intents/flags |

---

## Phase 7: Room Annotation Processor Fix (3 tasks)

| # | Task | Action |
|---|------|--------|
| 7.1 | Re-enable Room compiler | Uncomment `room-compiler` annotation processor in `build.gradle.kts` |
| 7.2 | Fix Room entity annotations | Ensure all `@Entity`/`@Dao`/`@Database` classes compile cleanly |
| 7.3 | Test Room compilation | `./gradlew compileDebugJavaWithJavac 2>&1 \| tee docs/build-output-room.txt` |

---

## Phase 8: Build Verification (2 tasks)

| # | Task | Command | Goal |
|---|------|---------|------|
| 8.1 | Full debug build | `./gradlew assembleDebug 2>&1 \| tee docs/build-output-final.txt` | APK in `app/build/outputs/apk/debug/` |
| 8.2 | Install and smoke test | `adb install ... && adb shell am start -n com.tsf.shell/.ShellActivity` | App launches without crash |

---

## Phase 9: Deobfuscation Application (Experimental)

| # | Task | Detail |
|---|------|--------|
| 9.1 | Develop deobfuscation script | Apply `tsf_shell_deobfuscation_map.txt` (5,964 lines) to Java sources |
| 9.2 | Apply mapping | Rename classes/fields, update imports |
| 9.3 | Regression build | Verify project still builds after deobfuscation |

---

## Phase 10: Cleanup and Documentation (2 tasks)

| # | Task | Action |
|---|------|--------|
| 10.1 | Write README.md | Document purpose, architecture, status, build instructions |
| 10.2 | Consolidate build logs | Keep only `build-output-fresh.txt` as post-fix baseline |

---

## Verification Plan

### Automated Tests
1. **Build compilation gate:** `./gradlew compileDebugJavaWithJavac` must exit with **0 errors**
2. **APK assembly gate:** `./gradlew assembleDebug` must produce a valid APK
3. **Error count regression:** After each phase, verify error count decreases monotonically

### Manual Verification
1. **After Phase 8.2:** Install APK on emulator, verify launcher loads without crash
2. **After Phase 10.1:** `README.md` accurately describes how to build from scratch
