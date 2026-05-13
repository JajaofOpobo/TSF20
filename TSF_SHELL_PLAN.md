# TSF Shell Revival Project - Tracking Document

> Last Updated: 2026-05-13
> Project: Revive TSF Shell 3D Launcher for Modern Android

---

## Current Status

### Phase: Analysis Complete ✓

- APK decompiled and extracted to `source/` and `sources/`
- Source code analyzed (Java ~1000+ classes)
- Architecture understood
- Feature set documented
- Modernization plan created

---

## Project Structure

```
TSF20/
├── source/                       # Raw APK contents (extracted)
│   ├── AndroidManifest.xml
│   ├── classes.dex
│   ├── resources.arsc
│   ├── assets/                   # Images, HTML, data files
│   └── lib/armeabi/              # Native libs (.so files)
├── sources/                     # Decompiled Java source (jadx output)
│   ├── com/tsf/shell/           # Main launcher code
│   ├── com/censivn/              # C3DEngine (3D engine)
│   └── org/acra/                 # ACRA crash reporting
├── resources/                   # Extracted resources (jadx output)
│   └── res/                      # Android resources
├── gradle/                      # Gradle wrapper
├── app/                         # (Reserved for new project)
└── TSF_SHELL_PLAN.md            # This file
```

---

## Decompiled Source Packages

| Package | Description |
|---------|-------------|
| `com.tsf.shell` | Main launcher (Home.java, ShellActivity, etc.) |
| `com.tsf.shell.activity` | Activities (PrimeActivity, PhotoSelectorActivity) |
| `com.tsf.shell.component` | ForegroundService |
| `com.tsf.shell.manager` | Managers |
| `com.tsf.shell.plugin.*` | Plugin system (theme, font, style, notice, etc.) |
| `com.tsf.shell.preference` | Preferences |
| `com.tsf.shell.services` | Services (LauncherAccessibilityService, ForegroundService) |
| `com.tsf.shell.theme` | Theme system (inside/ThemeManager) |
| `com.tsf.shell.utils` | Utilities |
| `com.tsf.shell.widget.*` | Widgets (alarm, cubeclock, a/*) |

---

## Known Features to Preserve

### Core
- [ ] 3D Desktop with 20+ transition effects
- [ ] 3D Folder system with cubic animations
- [ ] 3D App Drawer with transition effects
- [ ] Dock and desktop grid system

### Widgets
- [ ] 3D Cube Clock
- [ ] 3D Calendar Widget
- [ ] Alarm Widget with weather

### Customization
- [ ] Theme system (inside/outside themes)
- [ ] Plugin system (fonts, styles, themes)
- [ ] Gesture controls
- [ ] Backup/Restore

### Technical
- [ ] C3DEngine (custom 3D rendering - requires replacement)
- [ ] Accessibility service for gestures
- [ ] Foreground service for memory persistence

---

## Modernization Plan

### Phase 1: Foundation
- [ ] Create new Android project (Kotlin, SDK 34/24)
- [ ] Replace ActivityGroup with Activity + Fragments
- [ ] Set up Jetpack Navigation

### Phase 2: 3D Engine (CRITICAL)
- [ ] Replace AndEngine with custom OpenGL ES renderer OR libGDX
- [ ] Rebuild C3DEngine-style 3D elements
- [ ] Recreate 3D transition effects
- [ ] Rebuild 3D folder system

### Phase 3: Core Features
- [ ] Home screen with 3D dock/grid
- [ ] App drawer with 3D transitions
- [ ] Widget system (AppWidgetHost)
- [ ] Theme engine

### Phase 4: Plugins & Extras
- [ ] 3D Cube Clock widget
- [ ] Alarm system
- [ ] Notification panel plugin
- [ ] Backup/restore

### Phase 5: Polish
- [ ] Material You theming
- [ ] Gesture system updates
- [ ] Performance optimization

---

## Technical Stack Target

| Component | Technology |
|-----------|------------|
| Language | Kotlin |
| Min SDK | 24 (Android 7.0) |
| Target SDK | 34 (Android 14) |
| UI Framework | Jetpack Compose (for modern UI) |
| 3D Rendering | Custom OpenGL ES 2.0 OR libGDX |
| Navigation | Jetpack Navigation |
| DI | Hilt |
| Async | Kotlin Coroutines + Flow |
| Widgets | AppWidgetProvider + RemoteViews |

---

## Dependencies to Replace

| Old | Replacement |
|-----|-------------|
| AndEngine | Custom OpenGL ES / libGDX |
| Flurry | Firebase Analytics / Mixpanel |
| ACRA (crash reporting) | Firebase Crashlytics |
| ActivityGroup | Fragment-based navigation |

---

## Action Items

### Immediate TODO
1. [ ] Decide: Rewrite from scratch OR attempt to decompile and convert to Kotlin
2. [ ] Choose 3D engine approach (custom OpenGL ES vs libGDX)
3. [ ] Set up new project repository/branch

### Research Needed
- [ ] Investigate if C3DEngine source can be extracted
- [ ] Find any remaining TSF Shell community resources

---

## Notes for Other Agents

- The decompiled code uses obfuscated names (a.java, b.java, etc.)
- The original used a custom 3D engine called "C3DEngine" (censivn package)
- Two native .so files - libkcmutil.so and libandenginephysicsbox2dextension.so
- The original was API 8+ but we should target modern Android

---

## Changelog

| Date | Entry |
|------|-------|
| 2026-05-13 | Initial plan created - Analysis complete |
| 2026-05-13 | Cleaned up workspace - removed decompile stubs, moved decompiled sources to root |