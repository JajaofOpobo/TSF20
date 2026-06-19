# Deobfuscation Progress

## Class Renames Completed (33 classes)

### `manager/app/` package (27 classes)
| Old File | New Name | Ref Count | Description |
|----------|----------|-----------|-------------|
| `a.java` | `AppListManager.java` | 21 | v1 `h.a` |
| `f.java` | `LauncherAppInfo.java` | 39 | v1 `h.b` |
| `h.java` | `StateHub.java` | 266 | Static utility hub |
| `j.java` | `TaskScheduler.java` | 116 | Scheduling/animation |
| `b.java` | `ObserverManager.java` | 71 | Observer/listener manager |
| `c.java` | `AppListModel.java` | 54 | App list data model |
| `e.java` | `DataCoordinator.java` | 40 | Coordinator/facade |
| `d.java` | `FolderManager.java` | 33 | Folder data management |
| `i.java` | `WidgetManager.java` | 37 | Widget/overlay controller |
| `k.java` | `StateManager.java` | 28 | State data provider |
| `p.java` | `WidgetAnimator.java` | 27 | Widget animation/positioning |
| `g.java` | `WidgetPanelController.java` | 31 | Widget panel/recent apps |
| `t.java` | `TextureCache.java` | ~20 | Texture caching utility |
| `w.java` | `ServiceProvider.java` | 73 | Singleton service access point |
| `o.java` | `ServiceFactory.java` | 38 | Service provider factory |
| `q.java` | `Notifier.java` | 41 | Notification/toast utility |
| `n.java` | `PanelStateManager.java` | 27 | Widget panel lifecycle |
| `A.java` | `FeatureConfig.java` | 24 | Feature flag/config check |
| `B.java` | `PreferenceProvider.java` | 16 | Preference/settings accessor |
| `l.java` | `WidgetLayoutManager.java` | 15 | Widget layout handler |
| `s.java` | `CallbackHandler.java` | 8 | Deferred callback handler |
| `z.java` | `ObjectRegistry.java` | 4 | Object register/unregister |
| `r.java` | `EventHandler.java` | 3 | App event handler |
| `D.java` | `Initializer.java` | 3 | Static initializer |
| `u.java` | `ActionHandler.java` | 5 | Generic action handler |
| `x.java` | `PositionAnimator.java` | 5 | Position animation utility |
| `y.java` | `SimpleHandler.java` | 1 | Simple handler |

### `e/` package (6 classes)
| Old File | New Name | v1 Equivalent |
|----------|----------|---------------|
| `a.java` | `TSFAppWidgetHost.java` | `h.c` |
| `b.java` | `WidgetContainer.java` | `h.d` |
| `c.java` | `TSFAppWidgetHostView.java` | `h.g` |
| `d.java` | `CellLayout.java` | `h.j` |
| `e.java` | `DragLayer.java` | `h.m` |
| `f.java` | `Workspace3D.java` | `h.r` |

## Key Findings
- Only 2 of 19 v1 `h` package classes map to `manager/app/` (AppListManager, LauncherAppInfo)
- The other 17 v1 `h` classes (c-s) are UI/view widgets that moved to `e/` package in v3
- `manager/app/` contains many new v3 management/utility classes without v1 equivalents
- All 27 `manager/app/` single-letter class files renamed (plus 6 `e/` classes = 33 total)
- 5 stub files created for missing decompiled classes (l, m, u, x, y)

## Remaining Manager Classes
- `v/` subpackage (6 files: v/a.java through v/f.java) — all in subpackage, not single-letter at top level
- 3 refs remain for `m.java` stub (PlaceholderManager) in `manager/r/c/d.java`
- All other old-style FQN refs eliminated

## Remaining Shell Errors
~100 pre-existing compilation errors in shell core files (Home.java, manager/r/c/, manager/bind/, manager/f/c.java JADX artifacts, etc.) — mostly missing class references, resource ID issues, and JADX decompilation artifacts.

## V1 Source Reference
- V1 sources: `/home/jaja/Documents/TSF20/sources/v1-sources/app/src/main/java/com/tsf/shell/h/`
- V3 sources: `/home/jaja/Documents/TSF20/sources/sources/com/tsf/shell/`

## Commands
- Semantic map: `python3 scripts/generate_semantic_map.py docs/runtime_analysis/v1_features.json docs/runtime_analysis/v3_features.json docs/runtime_analysis/v3_to_v1_mapping.json`
- (Find build/compile command)
