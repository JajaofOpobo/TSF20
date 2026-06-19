# Deobfuscation Progress

## Class Renames Completed (~132 classes)

### Session 1: `manager/app/` (27 classes) + `e/` (6 classes) = 33 classes
| Old File | New Name | Description |
|----------|----------|-------------|
| `a.java` | `AppListManager.java` | App list management |
| `f.java` | `LauncherAppInfo.java` | App info model |
| `h.java` | `StateHub.java` | Static utility hub |
| `j.java` | `TaskScheduler.java` | Scheduling/animation |
| `b.java` | `ObserverManager.java` | Observer/listener manager |
| `c.java` | `AppListModel.java` | App list data model |
| `e.java` | `DataCoordinator.java` | Coordinator/facade |
| `d.java` | `FolderManager.java` | Folder data management |
| `i.java` | `WidgetManager.java` | Widget/overlay controller |
| `k.java` | `StateManager.java` | State data provider |
| `p.java` | `WidgetAnimator.java` | Widget animation/positioning |
| `g.java` | `WidgetPanelController.java` | Widget panel/recent apps |
| `t.java` | `TextureCache.java` | Texture caching utility |
| `w.java` | `ServiceProvider.java` | Singleton service access point |
| `o.java` | `ServiceFactory.java` | Service provider factory |
| `q.java` | `Notifier.java` | Notification/toast utility |
| `n.java` | `PanelStateManager.java` | Widget panel lifecycle |
| `A.java` | `FeatureConfig.java` | Feature flag/config check |
| `B.java` | `PreferenceProvider.java` | Preference/settings accessor |
| `l.java` | `WidgetLayoutManager.java` | Widget layout handler |
| `s.java` | `CallbackHandler.java` | Deferred callback handler |
| `z.java` | `ObjectRegistry.java` | Object register/unregister |
| `r.java` | `EventHandler.java` | App event handler |
| `D.java` | `Initializer.java` | Static initializer |
| `u.java` | `ActionHandler.java` | Generic action handler |
| `x.java` | `PositionAnimator.java` | Position animation utility |
| `y.java` | `SimpleHandler.java` | Simple handler |
| `e/a-f` | TSFAppWidgetHost, WidgetContainer, TSFAppWidgetHostView, CellLayout, DragLayer, Workspace3D | Widget rendering views |

### Session 2: Full `manager/` rename (~79 classes)

#### `manager/action/` (6 + 2 + 6 = 14 classes)
- a-f → ActionDatabaseHelper, ActionManager, ShortcutCreator, ActionSelectorAdapter, ActionModel, GestureHandler
- toggle/A-B → TogglePanelManager, ToggleAction
- toggle/a-a-f → ToggleActionWifi, Brightness, Connector, MobileData, Volume, Flashlight

#### `manager/bind/` (4 classes)
- a-d → ShellBindContext, ShellBindController, ShellBindCallback, ShellBindStub

#### `manager/p/` (6 classes)
- a-f → ThemeTransitionAnimator, GestureTipElement, TipsDialogManager, ThemePreferenceStore, ThemePreferenceProvider, PreferenceToggle

#### `manager/f/` (4 classes)
- a-d → ScreenFadeController, WorkspaceScene, LauncherInitController, ViewportController

#### `manager/v/` (6 classes)
- a-f → FlagHelper, AnimationHelper, ObjectHelper, SimpleHelper, ScreenHelper, StateAccessor

#### `manager/b/` (6 classes)
- a-f → BackupDataAdapter, BackupRestoreManager, BackupEntry, BackupExportManager, ConfigManager, TempPreferenceManager

#### `manager/c/` (4 classes)
- A, b, c → ContactDatabaseHelper, ContactManager, ContactsProviderHelper
- a/a/a → ContactModel

#### `manager/j/` (5 classes)
- a-d, i → RateFaceView, RateDialog, RateDialogController, TexturedBackground, LayoutContainer

#### `manager/m/` (5 classes)
- a-d, f → DragSortContainer, SideMenuManager, AddItemButton, SideMenuIndicator, UnknownStub

#### `manager/l/` (2 classes)
- a-b → ShortcutManager, ShortcutManagerHolder

#### `manager/o/` (12 classes)
- A, b, c → ButtonMetrics, ButtonPresetManager, ThemeColorConstants
- a/a-d → TextConfig, TextLabelElement, LabelManager, EmptyLabelElement
- _a/a-d → TextConfigV2, TextLabelElementV2, LabelManagerV2, EmptyLabelElementV2

#### `manager/wallpaper/` (5 classes)
- a-e → WallpaperPreviewRenderer, WallpaperMenuPanel, BlurSettingsMenu, LiveWallpaperMenuItem, WallpaperMenuContainer

#### `manager/` top-level (1 class)
- A.java → GlobalServiceLocator

#### Manager single-file subpackages (8 classes)
- d/a → HitTargetManager, e/a → ScreenSaverDelayConfig, g/a → LayoutDimensionConstants
- h/a → ScreenLockController, i/a → PrimeEffectRenderer, k/a → TypefaceCache
- n/a → ToastOverlayController, q/a → UnreadBadgeManager

#### `manager/r/` (32 classes)
- r/A → BoundsHelper
- r/a/a-c → AppWidgetHostManager, WidgetInstanceTracker, WidgetBoundsDelegate
- r/b/A → WidgetMenuPanel, r/b/B → WidgetDecorationPanel, r/b/C → ScrollableItemListPanel
- r/b/d-e → ShortcutsPanel, TogglePanel
- r/b/a/a-c → AppListPanel, AppSelectionIndicatorBar, AppListItemCell
- r/b/b/a → SlidePanelAnimatorBase
- r/b/c/a-h → WidgetProviderInfoBar, SystemWidgetProviderBrowser, WidgetInstanceListPanel,
  WidgetPanelOrchestrator, WidgetDragDropArea, WidgetDragHandler, WidgetPanelToggle, WidgetPreviewCell
- r/c/A → IconRenderer, r/c/b → WidgetFeatureConfig, r/c/c → WidgetCompatibilityChecker
- r/c/d → MultiSelectLinePicker, r/c/e → WidgetRegistryManager, r/c/f → WidgetDefinitionFactory
- r/c/g → WidgetDeleteAnimationUtil, r/c/h → KeyEventListener
- r/c/a/a-b → WidgetInstantiator, WidgetPlacementHelper

## Key Findings
- All 27 `manager/app/` + all 6 `e/` + all 79 remaining `manager/` classes renamed = **~112 manager classes total**
- **0 remaining single-letter files in `manager/` tree**
- ~786 single-letter files remain elsewhere: `f/` (520), `widget/` (91), `plugin/` (81), `preference/` (28), `utils/` (26), `services/` (5), `theme/` (2)
- Only 2 of 19 v1 `h` package classes map to `manager/app/` (AppListManager, LauncherAppInfo)
- The other 17 v1 `h` classes (c-s) are UI/view widgets that moved to `e/` package in v3
- `manager/app/` contains many new v3 management/utility classes without v1 equivalents
- 5 stub files created for missing decompiled classes (PlaceholderManager, ActionHandler, PositionAnimator, SimpleHandler, LayoutContainer)

## Remaining Shell Errors
~100 pre-existing compilation errors in shell core files (Home.java, manager/bind/, f/c.java JADX artifacts, etc.) — mostly missing class references, resource ID issues, and JADX decompilation artifacts.

## V1 Source Reference
- V1 sources: `/home/jaja/Documents/TSF20/sources/v1-sources/app/src/main/java/com/tsf/shell/h/`
- V3 sources: `/home/jaja/Documents/TSF20/sources/sources/com/tsf/shell/`

## Commands
- Semantic map: `python3 scripts/generate_semantic_map.py docs/runtime_analysis/v1_features.json docs/runtime_analysis/v3_features.json docs/runtime_analysis/v3_to_v1_mapping.json`
