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
### Session 3: `utils/` (26 classes) + `services/` (5 classes) = 31 classes

#### `utils/` (26 files a-z)
- a → PackageManagerHelper, b → OEMComponentResolver, c → ReusableBitmapHolder, d → LazyBitmapFactory
- e → SelectionDotRenderer, f → PercentToAlphaConverter, g → StatusBarHelper, h → ItemInfoListSorter
- i → IntentResolver, j → DimensionParser, k → MarketLinkHandler, l → ErrorThrower
- m → FlurryAnalyticsLogger, n → FeedbackComposer, o → FileSystemHelper, p → ColorMatrixImageFilter
- q → BitmapTransformationHelper, r → DimensionHelper, s → GLShaderCompiler, t → SignatureVerifier
- u → DeviceInfoCollector, v → ExternalFilesDirResolver, w → HapticFeedbackManager, x → GraphicsEngineBridge
- y → PercentClamper, z → ZipArchiver

#### `services/` (5 classes)
- A → NotifierConnector, b → ForegroundServiceManager, c → ServiceLifecycleManager, d → ToggleServiceConnector
- a/a → NotifierCounterInterface

### Session 4: `f/` workspace3D → v1 mapping (7 classes renamed)

| Old File | New Name | Description | Evidence Source |
|----------|----------|-------------|----------------|
| `f/f/g.java` | `WorkspacePage.java` | Main workspace page container | v1 workspace3D.h.a (943 lines, full algorithm) |
| `f/i/B.java` | `PageItem.java` | Base page item (extends C3DEngine.b.v) | v1 workspace3D.k.j |
| `f/i/C.java` | `ShortcutItem.java` | App shortcut item (extends PageItem) | v1 workspace3D.k inner class |
| `f/f/j.java` | `PageAnimationState.java` | Animation state tracking utility | Inferred from code (state array/dirty management) |
| `f/f/a/h.java` | `FolderPage.java` | Folder content page (extends WorkspacePage) | v3_to_v1_mapping.json: workspace3D.h.a.x |
| `f/h/d.java` | `WorkspaceTouchController.java` | Workspace touch/scroll event handler | v3_to_v1_mapping.json: workspace3D.e.a |
| `f/e/c/a/d.java` | `PageScrollState.java` | Page scroll transition state (extends VObject3dContainer, 13 methods, onDrawStart) | Frida method enumeration trace |

### Session 5: Priority Targets from Frida Mapping (7 classes)
| v3 File | New Name | Description | v1 Source |
|---------|----------|-------------|-----------|
| `f/i/a/a.java` | `WallpaperTouchHandler.java` | Wallpaper touch events (tap/swipe) | workspace3D.a.a |
| `f/i/_b/c/a.java` | `WidgetPageItem.java` | Widget item on workspace (extends PageItem) | workspace3D.k.c.a.a |
| `f/i/_b/d/b.java` | `WorkspaceShortcutItem.java` | Main workspace shortcut (extends ShortcutItem) | workspace3D.k.c.b.c |
| `f/i/_b/d/i.java` | `ScrollingIndicator.java` | Folder page indicator dots | workspace3D.k.c.b.an |
| `f/i/_b/d/k.java` | `ItemPositionAnimator.java` | Item grid position/animation controller | workspace3D.g.p |
| `f/c/a/b/a.java` | `DrawerMenuParams.java` | Drawer menu animation params struct | workspace3D.e.c.a |
| `f/e/h/a.java` | `PhotoPicker.java` | Photo picker activity result handler | workspace3D.g.e.d |

### Session 6: Scene Graph & Transition Effects (30 classes)
| v3 File | New Name | Description | Evidence |
|---------|----------|-------------|----------|
| `f/e/c/a/b.java` | `PageContainer.java` | Page wrapper (extends VRectangle) | Frida scene graph (3 leaves) |
| `f/e/c/a/c.java` | `ScrollManager.java` | Page transition orchestrator | Frida transition queue trace |
| `f/e/c/a/a.java` | `PageFrame.java` | Page rendering surface | Frida scene evidence |
| `f/e/c/a/e.java` | `ScrollOffset.java` | Scroll position data + comparator | Frida method enum (2 methods) |
| `f/h/a/a/a/b.java` | `WorkspaceSceneRoot.java` | Workspace 3D scene root | Frida scene graph (root node) |
| `f/f/f.java` | `TransitionRenderer.java` | Transition render base (bitmap creation) | Code analysis (100 lines) |
| `f/f/l.java` | `PageTransitionEffect.java` | Abstract page transition effect | Frida trace |
| `f/f/i.java` | `ItemPageTransition.java` | Abstract item transition effect | Code analysis |
| `f/f/C.java` | `TransitionManager.java` | Abstract effect manager | Code analysis |
| `f/f/e.java` | `TransitionConfig.java` | Transition config/selector | Code analysis |
| `f/f/b/A.java` | `ClothTransition.java` | Cloth page transition | Constructor string |
| `f/f/b/b.java` | `CrossfadeTransition.java` | Crossfade transition | Constructor string |
| `f/f/b/c.java` | `CubeInsideTransition.java` | Cube (inside) transition | Constructor string |
| `f/f/b/d.java` | `CubeOutsideTransition.java` | Cube (outside) transition | Constructor string |
| `f/f/b/e.java` | `CurveTransition.java` | Curve transition | Constructor string |
| `f/f/b/f.java` | `CylinderTransition.java` | Cylinder transition | Constructor string |
| `f/f/b/g.java` | `FlipTransition.java` | Flip transition | Constructor string |
| `f/f/b/h.java` | `FlyInTransition.java` | Fly-in transition | Constructor string |
| `f/f/b/i.java` | `FoldPageTransition.java` | Fold page transition | Constructor string |
| `f/f/b/j.java` | `HorizontalFlipTransition.java` | Horizontal flip transition | Constructor string |
| `f/f/b/k.java` | `PageTurnTransition.java` | Page turn transition | Constructor string |
| `f/f/b/l.java` | `RollTransition.java` | Roll transition | Constructor string |
| `f/f/b/m.java` | `ScaleInOutTransition.java` | Scale in/out transition | Constructor string |
| `f/f/b/n.java` | `WaveZoomOutTransition.java` | Wave zoom out transition | Constructor string |
| `f/f/b/o.java` | `SlopeInsideTransition.java` | Slope (inside) transition | Constructor string |
| `f/f/b/p.java` | `SlopeOutsideTransition.java` | Slope (outside) transition | Constructor string |
| `f/f/b/q.java` | `StackTransition.java` | Stack transition | Constructor string |
| `f/f/b/r.java` | `SmoothTransition.java` | Smooth transition | Constructor string |
| `f/f/b/s.java` | `WaveTransition.java` | Wave transition | Constructor string |
| `f/f/b/t.java` | `WindmillTransition.java` | Windmill transition | Constructor string |
| v3 File | New Name | Description | v1 Source |
|---------|----------|-------------|-----------|
| `f/i/a/a.java` | `WallpaperTouchHandler.java` | Wallpaper touch events (tap/swipe) | workspace3D.a.a |
| `f/i/_b/c/a.java` | `WidgetPageItem.java` | Widget item on workspace (extends PageItem) | workspace3D.k.c.a.a |
| `f/i/_b/d/b.java` | `WorkspaceShortcutItem.java` | Main workspace shortcut (extends ShortcutItem) | workspace3D.k.c.b.c |
| `f/i/_b/d/i.java` | `ScrollingIndicator.java` | Folder page indicator dots | workspace3D.k.c.b.an |
| `f/i/_b/d/k.java` | `ItemPositionAnimator.java` | Item grid position/animation controller | workspace3D.g.p |
| `f/c/a/b/a.java` | `DrawerMenuParams.java` | Drawer menu animation params struct | workspace3D.e.c.a |
| `f/e/h/a.java` | `PhotoPicker.java` | Photo picker activity result handler | workspace3D.g.e.d |

### Session 6: Frida Runtime Data Discoveries

#### Loaded Classes (Frida enumeration, stable 1320 classes)
- ~93% loaded by frame 1 (1224 of 1320)
- Remaining ~7% = alarm widgets + C3DEngine lazy objects
- No KSM classes loaded

#### Scene Graph (Frida tree dump, 57 mutations, 3 roots)
- Root: `f.h.a.a.a.b` → `VObject3dContainer` → `VObject3dContainer` (3 kids: `f.e.c.a.b`, `f.e.c.a.c`, `f.e.c.a.b`)
- Each page in 3-page workspace = one `f.e.c.a.b` (PageContainer) with `f.e.c.a.c` as special type
- Other roots: wallpaper menu buttons, alarm widget

#### Page Transition Pipeline (Frida trace, known hooks)
- `f.e.c.a.a` → `a(b,b)` and `b(float,float)` — transition orchestrator (takes two page containers)
- `f.e.c.a.d` → `PageScrollState` — 13 methods, per-frame scroll state with onDrawStart
- `f.e.c.a.e` → `a(e)`, `b(e)` — comparator for scroll state ordering (2 methods)

#### v3_to_v1_mapping.json (262 confirmed mappings)
- 24 `f.*` mappings confirmed via Frida Class.forName reflection
- Key C3DEngine b.f.* renames: b.f.f→d.b, b.f.i→b.r, b.f.j→b.v, b.f.k→e.b

#### Subpackage Structure (from Frida data + v3 source)
- `f.e.c.a` = page scroll/transition (containers: a/b/c, state: d, comparator: e)
- `f.f.a` = page content types (A/B/C/D/e/f/g/FolderPage/h + subpackages _a-d, b-d)
- `f.f.b` = transition effects (A + a-t = 21 files: Cloth, Cube, Flip, etc.)
- `f.h` = workspace interaction (A/B/b/c/WorkspaceTouchController/e/f)
- `f.i._b` = item subpackages (a-e: item info, item animation, drawing)
- `f.e._a` through `f.e._i` = 9 underscore-subpackages (layout strategies, state machines)

## Next Priority Targets (from high-confidence mappings)
Priority 1 (v3_to_v1_mapping.json confirmed, ready to rename):
- `f.i.a.a` → `workspace3D.a.a` - Widget page item type
- `f.i._b.c.a` → `workspace3D.k.c.a.a` - Page item animation config
- `f.i._b.d.b` → `workspace3D.k.c.b.c` - Item animation data
- `f.i._b.d.i` → `workspace3D.k.c.b.an` - Item animation state
- `f.i._b.d.k` → `workspace3D.g.p` - Item container type
- `f.c.a.b.a` → `workspace3D.e.c.a` - Drawer menu params struct
- `f.e.h.a.InterfaceC0098a` → `workspace3D.g.e.d` - Layout interface

Priority 2 (Frida scene graph evidence):
- `f.h.a.a.a.b` → Root scene node (1 kid, 3 total roots)
- `f.e.c.a.b` → Page container (used in scene graph, 2 methods)

Priority 3 (needs v1 source analysis):
- `f.f.f` → Transition base class (100 lines, parent of l + all 20 transition effects)
- `f.f.l` → TransitionEffect (61 lines, abstract page transition, extends f)
- `f.f.e` → Transition data/params
- `f.f.b/A` → ClothTransition (capital A = first transition)
- `f.f.b/a-t` → Other transitions (Cube, Flip, Cover, etc.)
Priority 1 (v3_to_v1_mapping.json confirmed, ready to rename):
- `f.i.a.a` → `workspace3D.a.a` - Widget page item type
- `f.i._b.c.a` → `workspace3D.k.c.a.a` - Page item animation config
- `f.i._b.d.b` → `workspace3D.k.c.b.c` - Item animation data
- `f.i._b.d.i` → `workspace3D.k.c.b.an` - Item animation state
- `f.i._b.d.k` → `workspace3D.g.p` - Item container type
- `f.c.a.b.a` → `workspace3D.e.c.a` - Drawer menu params struct
- `f.e.h.a.InterfaceC0098a` → `workspace3D.g.e.d` - Layout interface

Priority 2 (Frida scene graph evidence):
- `f.h.a.a.a.b` → Root scene node (1 kid, 3 total roots)
- `f.e.c.a.b` → Page container (used in scene graph, 2 methods)

Priority 3 (needs v1 source analysis):
- `f.f.f` → Transition base class (100 lines, parent of l + all 20 transition effects)
- `f.f.l` → TransitionEffect (61 lines, abstract page transition, extends f)
- `f.f.e` → Transition data/params
- `f.f.b/A` → ClothTransition (capital A = first transition)
- `f.f.b/a-t` → Other transitions (Cube, Flip, Cover, etc.)

## Available Frida Runtime Data
- `docs/runtime_analysis/v3_to_v1_mapping.json`: 262 confirmed v3→v1 mappings from runtime Class.forName reflection
- `docs/runtime_analysis/all_loaded_classes.txt`: 1266 loaded classes at runtime
- `docs/runtime_analysis/method_enumeration_output.txt`: Full method enumeration for all loaded classes
- `docs/runtime_analysis/scene_graph_trace.txt`: Scene tree dump (57 mutations, 3 roots)
- `docs/runtime_analysis/scripts/`: 28 Frida scripts (transition trace, touch trace, scene graph, etc.)
- `docs/runtime_analysis/deobfuscation_dictionary.json`: 197 manually verified v3→v1 mappings
- `docs/runtime_analysis/class_load_timing.txt`: Class load timing (667-831 pre-frame, 1224 by frame 1)
- `docs/v1_v3_mappings/high_confidence_mappings.txt`: 268 score≥5 automated mappings
- `docs/v1_v3_mappings/all_candidates.json`: 1099 candidate mappings total

## Simple-Name Reference Issue
FQN-based rename (e.g., replacing `com.tsf.shell.f.f.h` → `com.tsf.shell.f.f.a.FolderPage`) doesn't catch same-package short refs like `h` or `h.method()` in import/extends/field declarations within the same package. A targeted fix script (`fix_refs_final.py` pattern) is needed for those cases.

## Remaining Shell Errors
~100 pre-existing compilation errors in shell core files (Home.java, manager/bind/, f/c.java JADX artifacts, etc.) — mostly missing class references, resource ID issues, and JADX decompilation artifacts.

## V1 Source Reference
- V1 sources: `/home/jaja/Documents/TSF20/sources/v1-sources/app/src/main/java/com/tsf/shell/workspace3D/` (primary match for v3 f/ package)
- V3 sources: `/home/jaja/Documents/TSF20/sources/sources/com/tsf/shell/`

## Commands
- Semantic map: `python3 scripts/generate_semantic_map.py docs/runtime_analysis/v1_features.json docs/runtime_analysis/v3_features.json docs/runtime_analysis/v3_to_v1_mapping.json`
