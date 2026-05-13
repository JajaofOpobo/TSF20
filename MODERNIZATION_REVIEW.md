# TSF20 Modernization Review

> Created: 2026-05-13
> Agent: Codex
> Purpose: coordination file for code review findings, modernization plan, and future implementation notes.
> Harmonized: Best points from this review and opencode's review were merged into `TSF_SHELL_PLAN.md` on 2026-05-13. Treat `TSF_SHELL_PLAN.md` as the master coordination plan.

## Working Rules for Parallel Agents

- Do not overwrite another agent's notes. Append dated entries under the relevant section.
- Keep implementation work linked to a specific phase and feature area.
- Preserve TSF Shell behavior before replacing internals. If behavior is unclear, document the source file or resource that proves it.
- Prefer small migration slices that can be built and tested on modern Android independently.

## Current Review Scope

- Local repo: `C:\Users\Jaja\AndroidStudioProjects\TSF20`
- Remote repo: `https://github.com/JajaofOpobo/TSF20`
- Decompiled APK source: `sources`
- Raw APK/resource extraction: `source`, `resources`
- Current Android stub project: `app`

## Findings Log

| Date | Area | Finding | Evidence |
|------|------|---------|----------|
| 2026-05-13 | Coordination | Review started; existing `TSF_SHELL_PLAN.md` found and preserved. | `TSF_SHELL_PLAN.md` |
| 2026-05-13 | Coordination | Harmonized this review with opencode's review. The merged master plan now lives in `TSF_SHELL_PLAN.md`. | `TSF_SHELL_PLAN.md`, `MODERNIZATION_REVIEW.md` |
| 2026-05-13 | Phase 1 | Replaced placeholder `com.example.tsf20` app with minimal `com.tsf.shell` HOME launcher shell and added legacy launcher schema constants/tests. | `app/src/main/AndroidManifest.xml`, `app/src/main/java/com/tsf/shell/HomeActivity.java`, `app/src/main/java/com/tsf/shell/data/LegacyLauncherContract.java` |
| 2026-05-13 | Current app | The checked-in `app` module is an Android Studio stub, not the revived launcher. It uses `com.example.tsf20`, a sample `MainActivity`, and a sample JNI library. | `app/src/main/AndroidManifest.xml`, `app/src/main/java/com/example/tsf20/MainActivity.kt`, `app/src/main/cpp/CMakeLists.txt` |
| 2026-05-13 | Recovered source | Decompiled launcher source is substantial: 842 files under `com.tsf.shell` and 175 files under `com.censivn.C3DEngine`. | `sources/com/tsf/shell`, `sources/com/censivn/C3DEngine` |
| 2026-05-13 | Entry point | Original launcher entry is `Home`, which extends deprecated/removed `ActivityGroup` and initializes a custom C3DEngine view plus 2D workspace. | `sources/com/tsf/shell/Home.java` |
| 2026-05-13 | Startup gate | `ShellActivity` routes either to a GDPR/summary screen or back to the HOME activity. This behavior should be preserved but rewritten with modern navigation. | `sources/com/tsf/shell/ShellActivity.java` |
| 2026-05-13 | Persistence | `ShellProvider` stores launcher layout in SQLite tables: `favorites`, `application`, `dock`, `slidingdock`, `menu`, and `quicklaunch`. Database version is 34. | `sources/com/tsf/shell/ShellProvider.java` |
| 2026-05-13 | Customization | Gesture settings include home/back actions, double tap, one-finger swipes, pinch in/out, and two-finger swipes in four directions. | `resources/res/xml/preferences_gesture.xml` |
| 2026-05-13 | Customization | Advanced settings include memory permanence, home key patch, and restart shell. | `resources/res/xml/preferences_advanced.xml` |
| 2026-05-13 | Themes/plugins | Theme discovery depends on package queries for `com.tsf.shell.themes`, GO Launcher themes, ADW themes, font packs, widgets, and icon designer providers. Modern Android requires explicit package visibility declarations or replacement APIs. | `sources/com/tsf/shell/plugin`, `sources/com/tsf/shell/theme/inside` |
| 2026-05-13 | Services | Original code has foreground/persistence services and accessibility service hooks. Modern Android requires foreground service types, notification channels, user-visible purpose, and tighter lifecycle control. | `sources/com/tsf/shell/services` |
| 2026-05-13 | Dependencies | Original source embeds old Flurry analytics and ACRA crash reporting. These should be removed or replaced behind opt-in telemetry abstractions. | `sources/com/flurry`, `sources/org/acra`, `Home.java` |
| 2026-05-13 | Native/graphics | APK contains only armeabi native libraries and raw 3D assets, including `widget_airship.3DS`. Modern Android requires ABI strategy and likely a renderer rewrite or compatibility layer. | `source/lib/armeabi`, `resources/res/raw` |

## Proposed Work Log

| Date | Phase | Proposal | Status |
|------|-------|----------|--------|
| 2026-05-13 | Planning | Audit manifest, Gradle setup, launcher entry points, 3D engine APIs, plugins, widgets, permissions, and external dependencies. | Complete |

## Modernization Plan

### Phase 0: Preserve and Prove Behavior

- Create a feature inventory from the decompiled source and resources before rewriting: desktop pages, folders, dock, app drawer effects, gestures, theme/plugin formats, widgets, backup/restore, wallpaper, alarms, and shortcuts.
- Keep original assets under a clearly named `legacy-assets` or `legacy-reference` area; do not blend decompiled source into production code without review.
- Add reference docs for database schema, settings keys, intent actions, plugin actions, and resource formats.
- Decide package strategy early. Keeping `com.tsf.shell` maximizes theme/plugin compatibility; using a new package reduces signing/identity confusion but requires import bridges.

### Phase 1: Buildable Modern Launcher Skeleton

- Replace the stub `com.example.tsf20` app with a real launcher package, HOME intent filter, adaptive icon, and Android 12+ exported declarations.
- Remove sample JNI/CMake unless native rendering is intentionally reintroduced.
- Use Kotlin-first app architecture, but allow Java interop for carefully ported legacy logic.
- Add modules/packages for `launcher-core`, `launcher-data`, `launcher-render`, `theme-engine`, `plugin-bridge`, and `legacy-reference` if this remains a single repo.
- Baseline: compile/target SDK 36 is already configured; keep min SDK 24 unless broad device support requires 23. Add desugaring only if needed.

### Phase 2: Data and App Model

- Recreate `ShellProvider` schema as Room or a tested SQLiteOpenHelper compatibility layer.
- Add import/migration support from legacy table names: `favorites`, `application`, `dock`, `slidingdock`, `menu`, `quicklaunch`.
- Rebuild app discovery using `LauncherApps`, `UserHandle`, pinned shortcuts, and explicit package visibility queries.
- Add tests for layout persistence, icon/theme overrides, hidden apps, folders, app widgets, and upgrade/import paths.

### Phase 3: Rendering Strategy

- Do not attempt a direct whole-app decompile-to-Kotlin conversion. Port the C3DEngine concepts into a modern renderer boundary first.
- Recommended path: custom OpenGL ES renderer for the TSF desktop/folder/app-drawer effects, hosted in a `GLSurfaceView` or `TextureView`, with Compose or regular Android Views for settings and dialogs.
- Alternative path: libGDX can speed up scene primitives/tweening but may fight launcher lifecycle, AppWidgetHost, and Android View interop.
- Preserve C3DEngine public concepts as domain interfaces: scene, object/container, texture manager, tween/easing, hit testing, message queue, and launcher item info.
- Build effects incrementally: static desktop grid, drag/drop, dock, app drawer, folders, then transition effects.

### Phase 4: Widgets, Plugins, and Customization

- Rebuild AppWidgetHost support with modern widget binding flow and restore behavior.
- Preserve TSF 3D widgets as in-app renderer-backed components where possible; treat third-party plugin widgets as explicit compatibility work.
- Recreate gesture preferences exactly first, then add modern action targets such as notification shade alternatives, app search, lock screen-safe actions, and shortcuts.
- Implement theme import in layers: built-in theme assets, TSF theme package bridge, icon pack bridge, then editor/custom theme tooling.
- Replace legacy external storage writes with Storage Access Framework or app-scoped storage.

### Phase 5: Android Compatibility and Policy

- Remove or replace blocked/privileged permissions such as `READ_LOGS`, `PERSISTENT_ACTIVITY`, broad external storage writes, and silent system toggles.
- Add Android 11+ `<queries>` for theme/icon/font/plugin discovery.
- Use notification channels and foreground service types for any persistent service; avoid always-on memory permanence unless user-enabled and justified.
- Replace dynamic receiver registrations with Android 13+ compatible flags where required.
- Handle runtime permissions through a single permission broker with rationale UI.
- Replace direct status bar/setting toggles with user-facing panels/intents where platform restrictions require it.

### Phase 6: Observability, Testing, and Release

- Remove Flurry and bundled ACRA. Add opt-in crash reporting only after privacy review.
- Add unit tests for database, model conversion, theme parsing, and gesture/action mapping.
- Add instrumentation tests for HOME launch, app drawer load, drag/drop, folder creation, widget binding, rotation, locale change, and backup/restore.
- Add graphics golden/smoke tests for critical 3D transitions once renderer stabilizes.
- Use staged milestones: buildable launcher, usable launcher, feature parity preview, compatibility beta, release candidate.

## Suggested First Implementation Slice

1. Replace stub manifest/activity with a minimal modern HOME launcher shell.
2. Create data models for legacy `favorites` and `application` rows plus import tests.
3. Build a simple launcher grid/app drawer using modern package discovery.
4. Add a renderer abstraction with a non-3D implementation first, then swap in OpenGL effects.
5. Port gestures and settings keys once the launcher shell is navigable.

## Risks

- Decompiled code has obfuscated names and some unsupported decompiler output, so blind conversion will be slow and fragile.
- Package/theme compatibility depends on original package name and signing expectations.
- Android background, storage, package visibility, and privileged setting restrictions mean some old behavior must become user-mediated.
- Native `armeabi` libraries cannot be shipped as-is for modern device coverage; replacement or multi-ABI rebuild is needed.
- AppWidgetHost and OpenGL scene interop is the hardest technical area after launcher data migration.

## Open Questions

- Should the revived launcher keep the original package name `com.tsf.shell` for compatibility with themes/plugins, or use a new package and provide import bridges?
- Should the first modern build be a faithful Java/Kotlin port of selected decompiled modules, or a clean launcher shell that incrementally reimplements TSF features?
- Which Android baseline is preferred: min SDK 23/24 for broad support, or 26+ to simplify background limits and launcher shortcuts?
