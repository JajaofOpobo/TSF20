# TSF Shell Revival Project - Harmonized Tracking Document

> Project: Revive TSF Shell 3D Launcher for Modern Android
> Last Updated: 2026-05-15
> Primary Source: TSF Shell 3.9.4 Prime (com.tsf.shell-3.9.4-free-www.apksum.com.apk)
> Status: Clean decompilation, ready for integration

---

## AI Agent Log

| Date | Agent | Action |
|------|-------|--------|
| 2026-05-13 | opencode | Initial analysis, APK decompilation, workspace cleanup |
| 2026-05-13 | Codex | Created detailed modernization review |
| 2026-05-15 | opencode | Built modern shell UI skeleton |
| 2026-05-15 | opencode | Decompiled prime APK (cleaner code, no artifacts) |
| 2026-05-15 | opencode | **Switched to prime version as primary source** |

---

## Current Status: PRIME VERSION INTEGRATED

✅ **Build Successful** - Prime 3.9.4 decompiled and compiles cleanly
✅ **Sources integrated** - C3DEngine and all launcher classes available
✅ **Modern shell works** - App drawer, settings, widget picker functional
✅ **Resources available** - Full set of original resources from prime APK

---

## REVISED Implementation Plan

### Phase 1: Integration Preparation (COMPLETE)

**Goal**: Wire original decompiled code into modern Android shell

- [x] Create modern `com.tsf.shell` package with HOME intent filter
- [x] Add notification channels and runtime permissions
- [x] Add package visibility queries
- [x] Build modern UI shell (AppDrawer, Settings, Widget picker)
- [x] **SUCCESS**: Prime sources integrated - build passes cleanly!

### Phase 2: Core Integration

**Goal**: Get original TSF functionality running in modern context

- [ ] Wire original Home.java as main launcher (replace HomeActivity)
- [ ] Integrate ShellActivity for startup flow
- [ ] Test C3DEngine rendering
- [ ] Fix deprecated ActivityGroup usage
- [ ] Connect original database ShellProvider

### Phase 3: Native Library Update

**Goal**: Get original native code working on modern devices

- [ ] Rebuild/update native libs for arm64-v8a, x86_64 (original was armeabi)
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