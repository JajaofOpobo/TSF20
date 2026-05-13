# TSF Shell Revival Project - Harmonized Tracking Document

> Project: Revive TSF Shell 3D Launcher for Modern Android
> Last Updated: 2026-05-13
> Coordination status: Harmonized from opencode and Codex reviews

---

## AI Agent Log

| Date | Agent | Action |
|------|-------|--------|
| 2026-05-13 | opencode | Initial analysis, APK decompilation, workspace cleanup |
| 2026-05-13 | opencode | Added agent identification to log |
| 2026-05-13 | Codex | Created detailed modernization review and Android compatibility plan |
| 2026-05-13 | Codex | Harmonized opencode and Codex reviews into this master tracking document |
| 2026-05-13 | Codex | Started Phase 1 implementation: replaced placeholder app with a minimal `com.tsf.shell` launcher shell and legacy schema constants |

---

## Working Rules for Parallel Agents

- Treat this file as the master coordination plan.
- Append dated findings instead of replacing another agent's notes.
- Keep implementation work tied to a phase and feature area.
- Preserve TSF Shell behavior before replacing internals. If behavior is unclear, document the source file or resource that proves it.
- Prefer small migration slices that can be built and tested on modern Android independently.
- Keep `MODERNIZATION_REVIEW.md` as supporting detail; keep this file concise enough to steer implementation.

---

## Current Status

### Phase: Analysis Complete

- APK extracted to `source/`, Java decompiled to `sources/`, resources extracted to `resources/`.
- Current Gradle `app` module now starts as a minimal modern `com.tsf.shell` launcher shell.
- Original launcher architecture and major feature areas have been identified.
- Modernization must be an incremental rebuild/port, not a blind decompile-to-Kotlin conversion.

---

## Current Project Structure

```
TSF20/
├── source/                       # Raw APK contents
│   ├── AndroidManifest.xml       # Binary AXML from APK
│   ├── classes.dex
│   ├── resources.arsc
│   ├── assets/                   # Images, HTML, data files
│   └── lib/armeabi/              # Legacy native libraries
├── sources/                      # Decompiled Java source from jadx
│   ├── com/tsf/shell/            # Main launcher code
│   ├── com/censivn/C3DEngine/    # Custom 3D engine
│   ├── com/flurry/               # Legacy analytics
│   └── org/acra/                 # Legacy crash reporting
├── resources/res/                # Extracted Android resources
├── app/                          # Current placeholder Android app module
├── gradle/                       # Gradle wrapper/version catalog
├── MODERNIZATION_REVIEW.md       # Detailed Codex review notes
└── TSF_SHELL_PLAN.md             # Master plan and coordination file
```

---

## Key Architecture Findings

| Area | Finding | Evidence |
|------|---------|----------|
| Launcher entry | `Home` is the original HOME activity and extends deprecated `ActivityGroup`; it initializes C3DEngine plus a 2D workspace. | `sources/com/tsf/shell/Home.java` |
| Startup flow | `ShellActivity` gates startup through a GDPR/summary screen or returns to the HOME activity. Preserve the behavior with modern navigation. | `sources/com/tsf/shell/ShellActivity.java` |
| App module | Current `app` package is `com.example.tsf20` with sample `MainActivity` and JNI. It should be replaced by the revived launcher shell. | `app/src/main` |
| Data model | `ShellProvider` stores launcher state in SQLite tables: `favorites`, `application`, `dock`, `slidingdock`, `menu`, and `quicklaunch`; DB version is 34. | `sources/com/tsf/shell/ShellProvider.java` |
| Renderer | `com.censivn.C3DEngine` is central to the TSF experience: scenes, objects, textures, tweening, hit testing, message queue, shader/rendering concepts. | `sources/com/censivn/C3DEngine` |
| Customization | Gesture settings include home/back actions, double tap, swipe up/down, pinch in/out, and two-finger swipes in four directions. | `resources/res/xml/preferences_gesture.xml` |
| Advanced settings | Memory permanence, home-key patch, and restart shell are explicit user-facing settings. | `resources/res/xml/preferences_advanced.xml` |
| Themes/plugins | Theme/plugin discovery uses package queries for TSF themes, GO Launcher themes, ADW themes, font packs, widgets, and icon designer providers. | `sources/com/tsf/shell/plugin`, `sources/com/tsf/shell/theme` |
| Services | Foreground/persistence and accessibility service hooks exist; modern Android requires stricter lifecycle, notification, and user-consent handling. | `sources/com/tsf/shell/services` |
| Legacy dependencies | Flurry and bundled ACRA should not be carried forward directly. Add opt-in telemetry only after privacy review. | `sources/com/flurry`, `sources/org/acra` |
| Native/assets | Native libs are legacy `armeabi`; raw assets include 3D/widget/media resources such as `widget_airship.3DS`. | `source/lib/armeabi`, `resources/res/raw` |

---

## Features to Preserve

### Core Launcher

- [ ] 3D desktop with original transition/effect behavior
- [ ] 3D folders, including cubic/open-close animations
- [ ] 3D app drawer and transition effects
- [ ] Dock, sliding dock, quick launch, desktop grid, and independent item layout
- [ ] App search, install/uninstall/update handling, hidden apps, shortcuts

### Widgets

- [ ] 3D Cube Clock
- [ ] 3D Calendar widget
- [ ] Alarm widget and alarm service flow
- [ ] Weather visual assets and fallback behavior
- [ ] Standard Android `AppWidgetHost` support

### Customization

- [ ] Built-in themes and TSF theme package compatibility
- [ ] Icon/theme editor behavior where possible
- [ ] Font/style/plugin pickers
- [ ] Gesture action mapping
- [ ] Wallpaper picker/preview/upload flows where still relevant
- [ ] Backup/restore/import of legacy layouts and preferences

### Technical Compatibility

- [ ] C3DEngine behavior or replacement renderer preserving TSF visuals
- [ ] Accessibility-mediated actions where still valid and user-approved
- [ ] Foreground service behavior only where modern Android permits it
- [ ] Legacy database migration/import path

---

## Harmonized Modernization Plan

### Phase 0: Preserve and Prove Behavior

- Build a feature inventory from source and resources before rewriting.
- Document database schema, settings keys, intent actions, plugin actions, theme formats, and raw asset formats.
- Decide package strategy early:
  - `com.tsf.shell` maximizes compatibility with old themes/plugins.
  - A new package reduces identity/signing confusion but needs import bridges.
- Keep recovered source/assets as reference material; only port selected pieces after review.

### Phase 1: Buildable Modern Launcher Skeleton

- [x] Replace the stub `com.example.tsf20` app with a real launcher package and HOME intent filter.
- [x] Add Android 12+ `exported` declarations and initial package visibility queries.
- [x] Remove sample JNI/CMake unless native rendering is intentionally reintroduced.
- [ ] Add notification channels and baseline runtime permission flow.
- Use Kotlin-first architecture, with Java interop only for carefully ported legacy code.
- Suggested modules/packages: `launcher-core`, `launcher-data`, `launcher-render`, `theme-engine`, `plugin-bridge`, `legacy-reference`.
- Keep min SDK 24 unless device-support goals require 23; compile/target SDK should remain modern.

### Phase 2: Data and App Model

- Recreate `ShellProvider` schema as Room or a tested SQLiteOpenHelper compatibility layer.
- Add import/migration support from legacy tables: `favorites`, `application`, `dock`, `slidingdock`, `menu`, `quicklaunch`.
- Rebuild app discovery using `LauncherApps`, `UserHandle`, shortcuts APIs, and explicit Android 11+ package visibility declarations.
- Add tests for layout persistence, folders, hidden apps, icon overrides, widgets, and database upgrades/imports.

### Phase 3: Rendering Strategy

- Preserve C3DEngine concepts behind modern interfaces: scene, layer, object/container, texture manager, tween/easing, hit testing, renderer queue, and launcher item info.
- Recommended path: custom OpenGL ES renderer hosted in `GLSurfaceView` or `TextureView`, with Compose or regular Android Views for settings/dialogs.
- Alternative path: libGDX may accelerate primitives/tweening, but verify launcher lifecycle, AppWidgetHost interop, and Android View embedding before committing.
- Build effects incrementally: static desktop grid, drag/drop, dock, app drawer, folders, then full 3D transitions.

### Phase 4: Widgets, Plugins, and Customization

- Rebuild Android `AppWidgetHost` support with modern binding and restore flows.
- Recreate TSF 3D widgets as in-app renderer-backed components where possible.
- Recreate gesture preferences exactly first, then add modern action targets.
- Implement theme support in layers: built-in assets, TSF theme bridge, icon pack bridge, editor/custom theme tooling.
- Replace legacy external storage writes with Storage Access Framework or app-scoped storage.

### Phase 5: Android Compatibility and Policy

- Remove or replace blocked/privileged permissions such as `READ_LOGS`, `PERSISTENT_ACTIVITY`, broad external storage writes, and silent system toggles.
- Add `<queries>` entries for theme/icon/font/plugin discovery.
- Use foreground service types and notification channels for any persistent service.
- Replace dynamic receiver registrations with Android 13+ compatible receiver flags where required.
- Replace direct status bar/settings toggles with user-facing panels or intents where platform restrictions require it.

### Phase 6: Observability, Testing, and Release

- Remove Flurry and bundled ACRA.
- Add opt-in crash reporting only after privacy review.
- Add unit tests for database, model conversion, theme parsing, and gesture/action mapping.
- Add instrumentation tests for HOME launch, app drawer load, drag/drop, folder creation, widget binding, rotation, locale change, and backup/restore.
- Add graphics smoke/golden tests for critical 3D transitions once the renderer stabilizes.
- Release milestones: buildable launcher, usable launcher, feature parity preview, compatibility beta, release candidate.

---

## Suggested First Implementation Slice

1. [x] Replace stub manifest/activity with a minimal modern HOME launcher shell.
2. [x] Create legacy data constants for `favorites` and `application` rows plus import-oriented tests.
3. [ ] Build a simple launcher grid/app drawer using modern package discovery.
4. [ ] Add a renderer abstraction with a non-3D implementation first.
5. [ ] Port gestures/settings keys after the launcher shell is navigable.
6. [ ] Introduce OpenGL effects behind the renderer abstraction.

---

## Dependencies to Replace or Reassess

| Old / Legacy | Modern Direction |
|--------------|------------------|
| `ActivityGroup` | Single Activity with fragments/Compose/navigation surfaces |
| C3DEngine direct coupling | Renderer abstraction, then custom OpenGL ES or vetted libGDX layer |
| Flurry | Remove; optional opt-in analytics later |
| ACRA | Remove; optional Crashlytics/Sentry-style crash reporting later |
| `armeabi` native libs | Replace, rebuild for modern ABIs, or remove |
| Broad external storage | SAF or app-scoped storage |
| Legacy package discovery | `LauncherApps`, shortcuts APIs, and manifest `<queries>` |
| Silent system toggles | User-mediated panels/intents |

---

## Open Questions

- Should the revived launcher keep package name `com.tsf.shell` for old theme/plugin compatibility?
- Which features are must-have for the first usable alpha: desktop/app drawer/folders only, or widgets/themes too?
- Should the first renderer milestone target visual faithfulness or implementation speed?
- Which Android baseline should be supported: min SDK 23/24 for reach, or 26+ to simplify background limits?
- Are old TSF theme/plugin APKs expected to work directly, or is import/conversion acceptable?

---

## Risks

- Decompiled code has obfuscated names and some unsupported decompiler output.
- Package/theme compatibility may depend on original package identity and signing assumptions.
- Android background, storage, package visibility, and privileged setting restrictions mean some old behavior must become user-mediated.
- Native `armeabi` libraries cannot provide modern device coverage as-is.
- AppWidgetHost plus OpenGL scene interop is likely the hardest technical integration area.
- A full rewrite risks losing TSF's feel; a full decompiled port risks fragile, unmaintainable code. The recommended path is incremental behavior-preserving replacement.
