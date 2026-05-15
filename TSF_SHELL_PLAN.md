# TSF Shell Revival Project - Harmonized Tracking Document

> Project: Revive TSF Shell 3D Launcher for Modern Android
> Last Updated: 2026-05-15
> Coordination status: Pivoted to original code integration approach

---

## AI Agent Log

| Date | Agent | Action |
|------|-------|--------|
| 2026-05-13 | opencode | Initial analysis, APK decompilation, workspace cleanup |
| 2026-05-13 | opencode | Added agent identification to log |
| 2026-05-13 | Codex | Created detailed modernization review and Android compatibility plan |
| 2026-05-13 | Codex | Harmonized opencode and Codex reviews into master tracking document |
| 2026-05-13 | Codex | Started Phase 1: replaced placeholder app with minimal `com.tsf.shell` launcher shell |
| 2026-05-15 | opencode | Built modern UI skeleton (AppDrawer, Settings, Widget picker) |
| 2026-05-15 | opencode | **PIVOT**: User clarified goal is to reuse original 3D engine, assets, transitions - NOT rebuild |

---

## Core Principle (PIVOTED)

**Goal**: Modernize the existing TSF Shell app without rewriting core functionality.

- ✅ Reuse original C3DEngine 3D rendering from `sources/com/censivn/C3DEngine/`
- ✅ Reuse original 3D transitions and effects from decompiled code
- ✅ Reuse original assets from `resources/`
- ✅ Reuse original free-form layout engine
- ✅ Reuse original 3D widgets (clock, calendar, etc.)
- ⚠️ Modernize only: target SDK, permissions, deprecated APIs, Android policy compliance

---

## Current Project Structure

```
TSF20/
├── source/                       # Raw APK contents
│   ├── AndroidManifest.xml       # Binary AXML from APK
│   ├── classes.dex
│   ├── resources.arsc
│   ├── assets/                   # Images, HTML, data files
│   └── lib/armeabi/              # Legacy native libraries (need ABI update)
├── sources/                      # Decompiled Java source from jadx
│   ├── com/tsf/shell/            # Main launcher code (Home, ShellActivity, etc.)
│   ├── com/censivn/C3DEngine/    # Custom 3D engine (KEEP - core to TSF experience)
│   ├── com/flurry/               # Legacy analytics (REMOVE)
│   └── org/acra/                 # Legacy crash reporting (REMOVE)
├── resources/res/                # Extracted Android resources (USE ORIGINAL)
├── app/                          # Modern launcher shell (to be integrated with original)
├── gradle/                       # Gradle wrapper/version catalog
├── MODERNIZATION_REVIEW.md       # Detailed Codex review notes
└── TSF_SHELL_PLAN.md             # Master plan and coordination file
```

---

## REVISED Implementation Plan

### Phase 1: Integration Preparation (Current)

**Goal**: Wire original decompiled code into modern Android shell

- [x] Create modern `com.tsf.shell` package with HOME intent filter
- [x] Add notification channels and runtime permissions
- [x] Add package visibility queries
- [x] Modern UI shell built (AppDrawer, Settings, Widget picker)
- [ ] **NEXT**: Integrate original `Home.java` as launcher entry
- [ ] **NEXT**: Integrate original `ShellActivity.java` for startup flow
- [ ] **NEXT**: Add original resources (`resources/res/`) to the app module

### Phase 2: Core Integration

**Goal**: Get original TSF functionality running in modern context

- [ ] Copy/adapt original `sources/com/tsf/shell/` into app module
- [ ] Wire original database `ShellProvider` or create compatibility layer
- [ ] Add original `C3DEngine` code with updated dependencies
- [ ] Fix deprecated `ActivityGroup` → use modern navigation
- [ ] Fix deprecated `PreferenceActivity` → use `PreferenceFragmentCompat`
- [ ] Update target SDK while preserving functionality

### Phase 3: Native Library Update

**Goal**: Get original native code working on modern devices

- [ ] Rebuild/update native libs for arm64-v8a, x86_64 (original was armeabi)
- OR use original libs with ABI shim for compatibility
- [ ] Test OpenGL ES rendering with C3DEngine

### Phase 4: Android Policy Compliance

**Goal**: Make app compatible with modern Android without breaking features

- [ ] Remove/replace blocked permissions (READ_LOGS, etc.)
- [ ] Add foreground service type declarations
- [ ] Update package visibility for Android 11+
- [ ] Handle runtime permissions properly

### Phase 5: Polish & Release

- [ ] Remove legacy Flurry/ACRA dependencies
- [ ] Add opt-in telemetry if needed
- [ ] Test all features: desktop, folders, drawer, widgets, themes, gestures

---

## Key Architecture to Preserve

| Area | Original Code | Action |
|------|---------------|--------|
| Launcher entry | `sources/com/tsf/shell/Home.java` | Integrate, fix deprecated ActivityGroup |
| Startup gate | `sources/com/tsf/shell/ShellActivity.java` | Integrate, modernize GDPR flow |
| 3D Engine | `sources/com/censivn/C3DEngine/` | **KEEP AS IS** - core to TSF |
| Database | `sources/com/tsf/shell/ShellProvider.java` | Adapt or create compatibility layer |
| Widgets | `sources/com/tsf/shell/widget/` | Integrate original 3D widgets |
| Resources | `resources/res/` | **USE ORIGINAL** - icons, layouts, strings |
| Assets | `source/assets/` | **USE ORIGINAL** - 3D models, textures |

---

## Files to Integrate

Priority list (from most important to nice-to-have):

1. `sources/com/tsf/shell/Home.java` - Main launcher
2. `sources/com/tsf/shell/ShellActivity.java` - Startup flow
3. `sources/com/tsf/shell/ShellProvider.java` - Database
4. `sources/com/censivn/C3DEngine/` - 3D rendering engine
5. `sources/com/tsf/shell/widget/` - Original widgets
6. `resources/res/` - All original resources
7. `source/assets/` - 3D assets, media files

---

## Dependencies to Remove/Replace

| Legacy | Action |
|--------|--------|
| Flurry analytics | Remove |
| ACRA crash reporting | Remove |
| `armeabi` native libs | Rebuild for modern ABIs or use ABI compatibility layer |
| ActivityGroup | Replace with fragments/Compose |
| Deprecated permissions | Remove or request at runtime |

---

## Updated Todo List

```
[IN PROGRESS] Integrate original Home.java as launcher entry
[ ] Integrate original ShellActivity.java
[ ] Add original resources to app module
[ ] Fix deprecated ActivityGroup usage
[ ] Test original 3D engine integration
[ ] Update native libs for modern ABIs
[ ] Complete Android policy compliance
[ ] Final testing and polish
```

---

## Risks & Mitigations

| Risk | Mitigation |
|------|------------|
| Obfuscated decompiled code | Keep logic as-is, only fix obvious errors |
| Deprecated APIs | Adapter pattern - wrap in modern interfaces |
| Native libs incompatible | Rebuild or use compatibility layer |
| Package identity conflicts | Keep `com.tsf.shell` package name |

---

**Next Step**: Begin integrating original `Home.java` from `sources/` into the app module. This is the entry point that initializes C3DEngine and the workspace.