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

## 2. Directory Layout

```
TSF20/
├── scripts/              ← 40 Python fix/analysis scripts
│   ├── frida/            ← 9 Frida JS instrumentation scripts
│   └── legacy/           ← 5 PowerShell scripts (obsolete)
├── tools/                ← 8 Java files (PatchJar, GradleAgent)
├── resources/            ← APK (smali/res/lib), shell.db, dumps
├── docs/                 ← Build logs, analysis docs, runtime traces
├── sources/sources/      ← 1,523 decompiled Java files
├── app/                  ← Android Studio / Gradle project
├── build/                ← Build output (problem reports)
├── runtime_analysis.md   ← Primary architecture doc (19 sections)
├── fix_scripts_CATALOG.md← Script hierarchy reference
├── build.gradle.kts, settings.gradle.kts, gradle*, local.properties
└── .gitignore
```

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

## 9. Recommended Immediate Actions

1. **Run the fix pipeline end-to-end** on a clean checkout:
   ```
   fix_filenames.py → fix_class_decls2.py → fix_refs_final.py →
   fix_constructors_precise.py → fix_clashes.py → fix_package_refs.py →
   fix_all.py → fix_round2.py
   ```
2. **Fix the 23 RuntimeException stubs** — hardest remaining errors, likely need CFR/Procyon
3. **Fix Room annotation processor NPE** — add missing Room annotations or adjust Room version
4. **Handle 5+ InterfaceC0xxx naming issues** — manual remap using v1 reference DEX
5. **Resolve 2 cyclic inheritance files** — manual restructure
6. **Write README.md** documenting project state and build process
7. **Consider archiving** — if revival stalls, document key architectural findings in `runtime_analysis.md` as the primary deliverable
