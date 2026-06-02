# TSF20 Codebase Audit — 2026-06-02

**Auditor**: opencode  
**Project**: TSF Shell 3.9.4 reverse engineering / decompilation revival  
**Author**: Jaja (57 commits, 2026-05-13 → 2026-06-02)  
**Source**: Decompiled with JADX from obfuscated APK (ProGuard/R8)

---

## 1. Codebase Composition

| Category | Files | Quality |
|----------|-------|---------|
| Decompiled Java sources | **1,523** `.java` (~180K lines) | 🟡 Fair |
| ├── `com/tsf/shell/` | 1,026 (79% obfuscated single-letter names) | 🔴 Heavy obfuscation |
| ├── `com/censivn/C3DEngine/` | 179 (API packages readable, internals obfuscated) | 🟢 Good |
| └── `com/ksmobile/` + android support | 18 | 🟢 Good |
| Python fix/analysis scripts | **40** in `scripts/` | 🟢 Active |
| Frida JS instrumentation | **9** in `scripts/frida/` | 🟡 Moderate |
| Legacy PowerShell scripts | **5** in `scripts/legacy/` | 🔴 Obsolete |
| Documentation (`.md`) | 9 files across `docs/` + root | 🟡 Moderate |
| Frida captures / dumps | 7 files in `resources/` | 🟢 Rich |
| APK resources (smali, res, lib) | Unpacked in `resources/apk/` | 🟢 Complete |

## 2. Detailed Codebase Map

```
TSF20/                                   219M total
│
├── .git/                                 git history (57 commits, 1 author)
├── .gradle/                              Gradle 8.12 caches + libs.versions.toml
├── .idea/                                IntelliJ/Android Studio project config
│
├── app/                                  Android application module
│   ├── build.gradle.kts                  module-level build config
│   ├── proguard-rules.pro                ProGuard rules
│   ├── schemas/                          Room DB schema exports
│   └── src/main/                         Android app sources (mostly empty — decompiled sources are in sources/)
│
├── build/                                Gradle build output
│   └── reports/problems/                 problems-report.html (137KB, build validation)
│
├── docs/                                 All documentation and build logs
│   ├── CODEBASE_AUDIT_2026-06-02.md      ← This file
│   ├── C3DEngine_API_Reference.md        v1 C3DEngine API reference
│   ├── DATABASE_SCHEMA.md                TSF database schema (8 tables)
│   ├── ERROR_TRIAGE.md                   Build error triage guide (key blocker document)
│   ├── TSF_REVIVAL_AUDIT.md              Earlier project audit
│   ├── implementation_plan.md            Revival implementation plan
│   ├── package_analysis.md               APK package analysis
│   ├── build-*.txt                       Build error outputs (30 files, 3 tracks)
│   │   ├── build-output-current*.txt     Mac/WSL track (current → current5)
│   │   ├── build-output-linux*.txt       Linux track (linux → linux26)
│   │   ├── build-output-round*.txt       Post-fix round outputs (round1, round2)
│   │   ├── build-output-r*.txt           Parallel round outputs (r1, r2)
│   │   └── build-errors-phase1*.txt      Phase 1 error logs
│   ├── runtime_analysis/                 Runtime analysis artifacts
│   │   ├── captures/                     Frida capture output files
│   │   │   ├── touch_trace.txt           Touch event trace
│   │   │   └── vpage_transitions_capture.txt  Page transition capture
│   │   ├── scripts/                      Additional Frida scripts (27 .js files)
│   │   ├── shaders/                      Extracted GLSL shaders (v1)
│   │   ├── shaders_v3/                   Extracted GLSL shaders (v3.9.4)
│   │   ├── page_transition_findings.md   Page transition analysis
│   │   ├── page_transition_queue_trace.md Queue trace findings
│   │   └── tween_engine_findings.md      Tween engine mapping (v1→v3)
│   └── androguard_output.txt             Androguard static analysis dump
│
├── fix_scripts_CATALOG.md                Fix script hierarchy reference (opencode 2026-06-02)
├── runtime_analysis.md                   Primary architecture doc (19 sections, 33KB)
│
├── resources/                            APK binaries, dumps, and captures
│   ├── apk/                              Unpacked APK (apktool output)
│   │   ├── AndroidManifest.xml           App manifest (27KB)
│   │   ├── apktool.yml                   Apktool metadata
│   │   ├── lib/armeabi/                  Native libraries (.so)
│   │   │   ├── libandenginephysicsbox2dextension.so  Box2D engine wrapper (214KB)
│   │   │   └── libkcmutil.so             Kinfoc analytics SDK (79KB)
│   │   ├── res/                          Android resources (151 subdirs)
│   │   └── smali/                        Full smali bytecode (decompilation source of truth)
│   ├── shell.db                          TSF Shell SQLite database (schema extracted)
│   ├── dumpsys_package.txt               dumpsys package output
│   ├── dumpsys_providers.txt             dumpsys providers output
│   ├── frida_classes.txt                 Frida class enumeration dump
│   ├── frida_methods_dump.txt            Frida method signature dump
│   ├── objection_classes.txt             Objection class enumeration
│   └── session-ses_1c35.md               Historical session log (731KB)
│
├── scripts/                              All Python fix/analysis scripts (40 files)
│   ├── fix_*.py                          Fix pipeline scripts (24 files)
│   │   ├── fix_refs_final.py             CURRENT: type reference case fixer
│   │   ├── fix_constructors_precise.py   CURRENT: constructor name fixer
│   │   ├── fix_class_decls2.py           CURRENT: class declaration fixer
│   │   ├── fix_all.py                    CURRENT: comprehensive catch-all fixer
│   │   ├── fix_round2.py                 CURRENT: post-constructor round-2 fixer
│   │   ├── fix_filenames.py              CURRENT: file rename tool
│   │   ├── fix_clashes.py                CURRENT: package/class clash resolver
│   │   ├── fix_package_refs.py           CURRENT: package ref updater
│   │   ├── fix_parcelable_creators.py    CURRENT: Parcelable.Creator converter
│   │   ├── fix_all_refs.py               CURRENT: parallel refs-fixer
│   │   └── fix_*.py                      OBSOLETE: superseded by the above
│   ├── analyze_*.py                      Analysis utilities (5 files)
│   │   ├── analyze_tsf.py                TSF shell bytecode analysis
│   │   ├── analyze_fields.py             Field type analysis
│   │   ├── analyze_dex.py                DEX bytecode analysis
│   │   ├── analyze_errors2.py            Build error analysis
│   │   ├── analyze2.py → analyze4.py     Progressive analysis scripts
│   ├── androguard_analysis.py            Androguard static analysis
│   ├── categorize_c3dengine.py           C3DEngine 328-class categorization
│   ├── deobfuscate_java_layer.py         v1→v3 deobfuscation mapper
│   ├── extract_shaders_v3*.py            GLSL shader extractors (3 files)
│   ├── decompile_*.py                    Bytecode decompilation utilities (2 files)
│   ├── binary_search.py                  Binary search utility
│   ├── check_f_types.py                  Type checking utility
│   ├── find_anon_fields_v2.py            Anonymous field finder
│   └── find_interface_anon2.py           Interface anonymous class finder
│   ├── frida/                            Frida JavaScript instrumentation (9 files, 713 lines)
│   │   ├── runtime_analysis.js           Main runtime behavior analyzer (131 lines)
│   │   ├── full_init_trace.js            Full init method trace (131 lines)
│   │   ├── heap_scan.js                  Heap object scanner (110 lines)
│   │   ├── frida_heap_explore.js         Heap exploration (93 lines)
│   │   ├── map_app.js                    App memory mapping (119 lines)
│   │   ├── trace_init.js                 Init method tracer (60 lines)
│   │   ├── methods_dump.js               Method enumeration (35 lines)
│   │   ├── enumerate.js                  Class enumeration (17 lines)
│   │   └── enumerate_feature.js          Feature enumeration (17 lines)
│   └── legacy/                           PowerShell scripts (5 files, OBSOLETE)
│       ├── fix_constructors.ps1
│       ├── fix_declarations.ps1
│       ├── fix_declarations_and_ctors.ps1
│       ├── fix_imports.ps1
│       └── fix_name_clashes.ps1
│
├── sources/                               Decompiled Java source tree (primary target for revival)
│   ├── bundled-libs/                      Bundled library JARs (extracted classes)
│   ├── resources/                         Resource APK files
│   └── sources/                           1,523 decompiled .java files
│       ├── android/support/               Android support library stubs (2 files)
│       └── com/
│           ├── censivn/C3DEngine/         Proprietary 3D engine (179 files, 9 subpackages)
│           │   ├── api/                   Public API — readable names (55 files)
│           │   │   ├── core/              VObject3d, VObjectManager, VRenderer, VTextureManager
│           │   │   ├── effects/           VEffectsStack, VTwist, Vector3
│           │   │   ├── element/           TextureElement, Vertices, Uv, Color4
│           │   │   ├── primitives/        VRectangle, VBox, VButton, VNinePatchRectangle
│           │   │   ├── shell/             VPage, VConsole, VInformation, VTempleteLayerManager
│           │   │   └── tween/             VTween, VEasing, VTweenTarget
│           │   ├── a/                     Obfuscated (7 files)
│           │   ├── b/                     Obfuscated — C3DEngine.b.g.* tween engine (76 files)
│           │   ├── c/                     Obfuscated (12 files)
│           │   ├── common/                Shared utilities including shaders (10 files)
│           │   │   └── shader/            7 shader classes
│           │   ├── d/                     Obfuscated (2 files)
│           │   ├── e/                     Obfuscated (9 files)
│           │   ├── f/                     Obfuscated (6 files)
│           │   └── n/                     Obfuscated (1 file)
│           ├── ksmobile/                  KSMobile utility library (16 files)
│           │   └── a/                     Utility classes (blanket/fragment/vpn/traffic/volume)
│           └── tsf/shell/                 Main TSF Shell application (1,026 files, 15 subpackages)
│               ├── f/                     Page system — transitions, carousel, container (530 files)
│               │   ├── a/                 7 files
│               │   ├── b/                 app drawer handler
│               │   ├── f/                 transition effect base (f.f.f → f.f.l hierarchy)
│               │   │   └── b/             20 transition effect subclasses (Cloth, Cube, Flip, etc.)
│               │   ├── m/                 5 files
│               │   ├── n/                 Carousel engine (n$c = orbit renderer)
│               │   ├── o/                 6 files
│               │   ├── p/                 6 files
│               │   └── ... (single-letter subdirs)
│               ├── manager/               Backend managers (114 files)
│               │   ├── a/ through q/      Obfuscated sub-managers
│               │   ├── bind/              ShellModel (data binding)
│               │   ├── action/            Action system with toggle state manager
│               │   └── wallpaper/         ShellWallpaperManager
│               ├── plugin/                Plugin system (105 files)
│               │   ├── theme/             Theme management
│               │   ├── themepicker/       Theme picker UI (icon designer, indicator, preview)
│               │   ├── fontspicker/       Font picker
│               │   ├── crop/              Image crop tool
│               │   ├── classification/    Catalog activity
│               │   ├── widget/            Floating widgets
│               │   └── ... (5 more plugin subdirs)
│               ├── widget/                Widget implementations (106 files)
│               │   ├── alarm/             Alarm clock widget (full implementation, touch tracked here)
│               │   └── cubeclock/         Cube clock widget
│               ├── theme/                 Theme engine (58 files)
│               │   └── inside/            Theme parser, element manager, mix/menu system
│               ├── preference/            Settings and preference screens (37 files)
│               ├── utils/                 Utility classes (27 files)
│               ├── services/              Background services (7 files)
│               ├── activity/              Activity classes (9 files)
│               ├── component/             UI components (2 files)
│               └── e/                     Easing/interpolation helpers (6 files)
│
├── tools/                                 Java build tooling (8 files)
│   ├── PatchJar.java                      ASM bytecode patching: removes/stubs getBinaryClassName
│   ├── PatchJar.class (+ 4 inner classes) Compiled PatchJar
│   ├── GradleAgent.java                   Custom Gradle agent
│   └── PatchGradleConstants.java          Gradle constants patcher
│
├── build.gradle.kts                       Root Gradle build config
├── settings.gradle.kts                    Gradle settings (module includes)
├── gradle.properties                      Gradle JVM properties
├── local.properties                       SDK/NDK paths (machine-specific)
├── gradlew                                Gradle wrapper (Unix)
├── gradlew.bat                            Gradle wrapper (Windows)
├── gradle/wrapper/                        Gradle wrapper JAR + properties
├── TSF20.code-workspace                   VS Code workspace config
├── .gitignore                             Git ignore rules
└── fix_scripts_CATALOG.md                 Fix script hierarchy reference
```

### 2.1 Package Size Breakdown

| Directory | Size | Description |
|-----------|------|-------------|
| `sources/` | ~150M | Decompiled Java (bulk of project) |
| `resources/apk/smali/` | ~40M | Smali bytecode |
| `resources/apk/res/` | ~10M | Android resources |
| `docs/` | ~5M | Build logs + analysis docs |
| `scripts/` | ~400K | Python + JS scripts |
| `build/` | ~3M | Gradle build outputs |

### 2.2 Subpackage File Heatmap

| Subpackage | Files | % of Shell | Obfuscation Level |
|-----------|-------|------------|-------------------|
| `com/tsf/shell/f/` | 530 | 51.7% | 🔴 Extreme (single-letter dirs) |
| `com/tsf/shell/manager/` | 114 | 11.1% | 🔴 Heavy |
| `com/tsf/shell/widget/` | 106 | 10.3% | 🟡 Moderate (alarm/cubeclock readable) |
| `com/tsf/shell/plugin/` | 105 | 10.2% | 🟢 Mixed (some readable names) |
| `com/tsf/shell/theme/` | 58 | 5.7% | 🟢 Mostly readable names |
| `com/tsf/shell/preference/` | 37 | 3.6% | 🟡 Moderate |
| `com/tsf/shell/utils/` | 27 | 2.6% | 🔴 Heavy (single-letter names) |
| `com/censivn/C3DEngine/api/` | 55 | — | 🟢 Readable |
| `com/censivn/C3DEngine/b/` | 76 | — | 🔴 Obfuscated (tween engine) |

## 3. Build Status

**No successful build has ever been achieved.** Three parallel build tracks exist:

| Track | Errors | Blocker | Status |
|-------|--------|---------|--------|
| `current.txt` (Mac/WSL) | **150** | `invalid method declaration; return type required` — constructor names don't match class names after rename | Script `fix_constructors_precise.py` exists but hasn't been applied to this output |
| `current3.txt` (Mac/WSL) | **200+** | 165 `cannot find symbol` + 30 ambiguous refs + package errors | Post-constructor-fix state, deeper failures |
| `linux16.txt` (Linux) | **100** | 95 `cannot find symbol` + Room annotation processor NPE crash | Earlier fix stage, NPE blocks javac |

### Error Category Breakdown (current.txt)
```
150 invalid method declaration; return type required
```

### Error Category Breakdown (current3.txt)
```
165 cannot find symbol
 12 reference to A is ambiguous
  8 reference to j is ambiguous
  6 reference to k is ambiguous
  3 package b does not exist
  1 interface expected here
  1 cannot inherit from final b
```

### Error Category Breakdown (linux16.txt)
```
 95 cannot find symbol
  2 package n does not exist
  2 cyclic inheritance involving a
  1 reference to b is ambiguous
```

## 4. Fix Pipeline (Scripts Developed but Never Run End-to-End)

| Step | Script | Purpose | Status |
|------|--------|---------|--------|
| 1 | `fix_filenames.py` | Rename `.java` files → match class names | ✅ Ready |
| 2 | `fix_class_decls2.py` | Fix `class D {` → `class d {` in `d.java` | ✅ Ready |
| 3 | `fix_refs_final.py` | Fix import/FQ/bare type refs after rename | ✅ Ready |
| 4 | `fix_constructors_precise.py` | Fix constructor names via build error lines | ✅ Ready |
| 5 | `fix_clashes.py` | Handle class/directory name clashes | ✅ Ready |
| 6 | `fix_package_refs.py` | Update refs after package renames | ✅ Ready |
| 7 | `fix_all.py` | Create missing types, fix remaining artifacts | ✅ Ready |
| 8 | `fix_round2.py` | Handle round-2 errors (inner types, ambiguous imports) | ✅ Ready |
| 9 | `fix_parcelable_creators.py` | Convert anonymous Creator → inner class | ✅ Standalone CLI |

## 5. Decompilation Quality Issues

| Issue | Count | Severity |
|-------|-------|----------|
| Method stubs (`throw RuntimeException`) | **23 files** | 🟡 — finally blocks / complex flow not recovered |
| Empty method bodies | **4 files** | 🟢 Minor |
| Cyclic inheritance | **2 files** | 🔴 Must fix manually |
| Interface naming (`InterfaceC0113a`, `InterfaceC0025a`) | **5+ files** | 🟡 Unfixed |
| Package/directory clashes | **3 known** | ✅ Fixed by `fix_clashes.py` |
| Class/filename case mismatches | **87** (Bucket 1) | ✅ Fixed |
| Wrong-case type references | **7** (Bucket 2) | 🟡 Partially fixed |

## 6. Runtime Analysis Progress

| Area | Status | Detail |
|------|--------|--------|
| Rendering pipeline | 🟢 Complete | 20 draw calls, 9 classes, 223+ frames traced |
| Scene graph | 🟢 Complete | 3 roots, 57 mutations, 2-frame build |
| Touch dispatch | 🟢 Complete | Traced to `AlarmWidget.calTouchCollision` at pixel (360,80) |
| Process architecture | 🟢 Complete | 4 processes (main, wallpaper, alarm, service) |
| Native libs | 🟢 Complete | `libkcmutil.so` (Kinfoc analytics), `libandenginephysicsbox2dextension.so` (Box2D) |
| Database schema | 🟢 Complete | 8 tables, all action/itemType/containerType constants documented |
| Activity lifecycle | 🟢 Complete | Home, ShellActivity, PersonalizationActivity traced |
| Page transitions | 🟢 Complete | 20 effect subtypes cataloged, tween engine `b.g.*` fully mapped, orbit radius formula decoded and verified at runtime (`n=937.3078`, `D=90°`) |
| Shader extraction | 🟢 Complete | 14 GLSL files (7 classes), only `ShaderColor` fragment differs from v1 |
| C3DEngine API class mapping | 🟢 Complete | 328 classes categorized (v1 → v3.9.4) |
| TSF Shell deobfuscation map | 🟡 Partial | 5,964-line map, 19 classes matched to v1 reference |

## 7. Gaps & Blockers

| Gap | Impact | Notes |
|-----|--------|-------|
| **No reproducible build** | 🔴 Critical | Pipeline scripts exist but were never executed in sequence on clean sources. Unknown if end state would compile. |
| **Room annotation processor NPE** | 🔴 Blocks Linux build | `TypeElement.getNestingKind()` NPE — affects Room-annotated classes |
| **23 RuntimeException stubs** | 🟡 Moderate | Need CFR/Procyon decompilation or manual rewrite |
| **5 unfixed interface names** | 🟡 Moderate | `InterfaceC0113a` etc. — need manual mapping to actual types |
| **2 cyclic inheritance errors** | 🟡 Low | Need manual resolution |
| **No README.md** | 🟢 Minor | Easy to create |
| **Obfuscated class names (79%)** | 🟡 Persistent | Slows manual analysis, but deobfuscation map exists |

## 8. Risk Assessment

| Risk | Likelihood | Impact | Mitigation |
|------|------------|--------|------------|
| Pipeline scripts have bit-rot (hardcoded paths `/home/ubuntu/...`) | Medium | High — scripts silently fail or target wrong files | Run pipeline on clean checkout, fix regressions |
| Decompilation stubs are unfixable | Low | High — 23 methods may never produce working Java | Try CFR/Procyon as alternative decompilers |
| Build system version mismatch | Medium | Medium — Room NPE may be AGP/Gradle version issue | Pin to API 28-compatible versions |
| Key insights lost on machine teardown | Low | High | Everything is git-tracked; remote backup recommended |

## 9. Document Consolidation Log

The following documents were consolidated into this audit on 2026-06-02 and marked OBSOLETE:

| File | Lines | What It Contributed | Merged Into |
|------|-------|---------------------|-------------|
| `TSF_REVIVAL_AUDIT.md` | 307 | Forensic audit of old handwritten app attempt; feature comparison table; C3DEngine usage critique | Archived code moved to `archive/`; critique notes in §6 |
| `package_analysis.md` | 44 | Package/file count breakdown (v1 reference); third-party exclusion list; LibGDX discovery | §1 (composition), §2.2 (heatmap) |
| `ERROR_TRIAGE.md` | 136 | Build error buckets 1-4; WSL/Linux build strategy; Windows vs Linux error comparison | §3 (build status), §5 (decompilation issues) |

### Retained as Standalone Documents

| File | Reason |
|------|--------|
| `implementation_plan.md` | Roadmap — needs updating but defines the overall strategy |
| `DATABASE_SCHEMA.md` | Standalone reference — 8 tables, constants, not duplicative |
| `C3DEngine_API_Reference.md` | Standalone reference — v1 API surface, not duplicative |
| `runtime_analysis.md` (root) | Primary architecture doc (19 sections, 33KB) — too large to merge |
| `fix_scripts_CATALOG.md` (root) | Script hierarchy reference — standalone utility |

## 10. Execution Plan

The authoritative execution plan is now [`docs/implementation_plan.md`](implementation_plan.md). It supersedes this section and contains 10 phases with verification gates:

| Phase | Focus | Key Task |
|-------|-------|----------|
| 0 | Environment setup | Install JDK 17, set JAVA_HOME |
| 1 | Cleanup | Archive obsolete scripts and build logs |
| 2 | Path migration | Fix hardcoded `/home/ubuntu/` → `/home/jaja/` in all scripts |
| 3 | Source tree consolidation | Uncomment `sourceSets`, resolve class conflicts |
| 4 | Fix pipeline execution | 9-step automated fix pipeline (strict order) |
| 5 | Manual error resolution | 8 categories of remaining errors |
| 6 | AndroidX migration | Support lib migration, ActivityGroup refactor |
| 7 | Room annotation processor | Fix NPE, re-enable Room |
| 8 | Build verification | `assembleDebug`, install, smoke test |
| 9 | Deobfuscation (experimental) | Apply 5,964-line deobfuscation map |
| 10 | Documentation | README.md, build log consolidation |
