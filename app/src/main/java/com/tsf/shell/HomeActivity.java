package com.tsf.shell;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.data.local.entity.FolderItem;
import com.tsf.shell.data.repository.LauncherRepository;
import com.tsf.shell.render.LibGDXRenderer;
import com.tsf.shell.ui.AppDrawerActivity;
import com.tsf.shell.ui.dialog.IconEditDialog;
import com.tsf.shell.ui.dialog.PowerMenuDialog;
import com.tsf.shell.ui.effect.WallpaperBlurEffect;
import com.tsf.shell.ui.view.ArchShortcutMenu;
import com.tsf.shell.ui.view.DesktopPage;
import com.tsf.shell.ui.view.DesktopPagerView;
import com.tsf.shell.ui.view.DockView;
import com.tsf.shell.ui.view.FolderView;
import com.tsf.shell.ui.view.LassoSelectionView;
import com.tsf.shell.ui.view.PageIndicator;
import com.tsf.shell.ui.view.SideMenuBar;
import com.tsf.shell.settings.GestureEngine;
import com.tsf.shell.settings.LauncherPreferences;
import com.tsf.shell.theme.ThemeManager;
import com.tsf.shell.widget.LauncherWidgetHost;
import com.tsf.shell.widget.WidgetPickerActivity;
import com.tsf.shell.util.NotificationHelper;
import com.tsf.shell.util.PermissionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class HomeActivity extends AppCompatActivity {

    private LauncherRepository repository;
    private LibGDXRenderer renderer;
    private DockView dockView;
    private DesktopPagerView pagerView;
    private PageIndicator pageIndicator;
    private LauncherWidgetHost widgetHost;
    private final Map<Integer, AppWidgetHostView> widgetViews = new HashMap<>();
    private LauncherPreferences prefs;
    private GestureEngine gestureEngine;
    private LassoSelectionView lassoView;
    private boolean lassoMode;
    private WallpaperBlurEffect wallpaperBlur;
    private ThemeManager themeManager;
    private SideMenuBar sideMenuBar;
    private FolderView folderView;
    private static final int REQUEST_PICK_WIDGET = 100;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NotificationHelper.createChannels(this);
        if (!PermissionHelper.hasNotificationPermission(this)) {
            PermissionHelper.requestNotificationPermission(this);
        }
        setContentView(R.layout.activity_home);
        configureSystemBars();
        initializeLauncher();
    }

    private void initializeLauncher() {
        renderer = new LibGDXRenderer(this);
        renderer.initialize();
        repository = new LauncherRepository(this);
        themeManager = ThemeManager.getInstance(this);
        wallpaperBlur = new WallpaperBlurEffect();

        FrameLayout desktopContainer = findViewById(R.id.desktop_container);
        FrameLayout dockContent = findViewById(R.id.dock_content);

        ImageButton appDrawerButton = findViewById(R.id.app_drawer_button);
        ImageButton settingsButton = findViewById(R.id.settings_button);

        GLSurfaceView glSurfaceView = renderer.getSurfaceView();
        glSurfaceView.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT));
        desktopContainer.addView(glSurfaceView, 0);

        pagerView = new DesktopPagerView(this);
        pagerView.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT));
        desktopContainer.addView(pagerView, 1);

        prefs = new LauncherPreferences(this);
        gestureEngine = new GestureEngine(this, createGestureCallback());
        pagerView.setGestureEngine(gestureEngine);

        pageIndicator = findViewById(R.id.page_indicator);
        pagerView.setOnPageChangeListener(page -> {
            pageIndicator.setCurrentPage(page);
            renderer.setPage(page);
        });

        dockView = new DockView(this);
        dockView.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        dockContent.addView(dockView);

        dockView.setOnDockItemClickListener(this::onDockItemClick);
        dockView.setOnDockItemLongClickListener(this::onDockItemLongClick);

        widgetHost = new LauncherWidgetHost(this);
        widgetHost.startListening();

        appDrawerButton.setOnClickListener(v -> openAppDrawer());
        appDrawerButton.setOnLongClickListener(v -> {
            toggleLassoMode();
            return true;
        });
        settingsButton.setOnClickListener(v -> openSettings());
        settingsButton.setOnLongClickListener(v -> {
            Intent intent = new Intent(this, WidgetPickerActivity.class);
            startActivityForResult(intent, REQUEST_PICK_WIDGET);
            return true;
        });

        setupLassoView();
        setupSideMenu();
        setupFolderView();
        applyWallpaperBlur();
        observeData();
    }

    private void setupLassoView() {
        lassoView = new LassoSelectionView(this);
        addContentView(lassoView, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        lassoView.setOnSelectionListener(selected -> {
            if (selected.isEmpty()) return;
            showLassoActions(selected);
        });
    }

    private void showLassoActions(List<FavoriteItem> selected) {
        String[] options = {"Delete", "Add to Folder", "Cancel"};
        new android.app.AlertDialog.Builder(this)
                .setTitle(selected.size() + " items selected")
                .setItems(options, (dialog, which) -> {
                    if (which == 0) {
                        repository.deleteItems(selected, () -> runOnUiThread(() -> {
                            lassoView.clearSelection();
                            Toast.makeText(this, selected.size() + " items deleted", Toast.LENGTH_SHORT).show();
                        }));
                    } else if (which == 1) {
                        createFolderWithItems(selected);
                    }
                    lassoMode = false;
                    lassoView.setLassoMode(false);
                })
                .setOnCancelListener(d -> {
                    lassoMode = false;
                    lassoView.setLassoMode(false);
                })
                .show();
    }

    private void toggleLassoMode() {
        lassoMode = !lassoMode;
        lassoView.setLassoMode(lassoMode);
        if (lassoMode) {
            List<FavoriteItem> all = new ArrayList<>();
            for (int i = 0; i < pagerView.getChildCount(); i++) {
                View v = pagerView.getChildAt(i);
                if (v instanceof DesktopPage) {
                    all.addAll(((DesktopPage) v).getItems());
                }
            }
            lassoView.setItems(all);
            Toast.makeText(this, "Drag to select items", Toast.LENGTH_SHORT).show();
        } else {
            lassoView.clearSelection();
        }
    }

    private void setupSideMenu() {
        sideMenuBar = findViewById(R.id.side_menu_bar);
        List<SideMenuBar.MenuItem> menuItems = new ArrayList<>();

        SideMenuBar.MenuItem themes = new SideMenuBar.MenuItem();
        themes.label = "Themes";
        themes.iconText = "Th";
        themes.action = () -> applyNextTheme();
        menuItems.add(themes);

        SideMenuBar.MenuItem lasso = new SideMenuBar.MenuItem();
        lasso.label = "Select";
        lasso.iconText = "S";
        lasso.action = () -> toggleLassoMode();
        menuItems.add(lasso);

        SideMenuBar.MenuItem folders = new SideMenuBar.MenuItem();
        folders.label = "Folder";
        folders.iconText = "F";
        folders.action = () -> createFolderWithItems(null);
        menuItems.add(folders);

        SideMenuBar.MenuItem settings = new SideMenuBar.MenuItem();
        settings.label = "Settings";
        settings.iconText = "Sg";
        settings.action = () -> openSettings();
        menuItems.add(settings);

        sideMenuBar.setItems(menuItems);
    }

    private void setupFolderView() {
        folderView = new FolderView(this);
        folderView.setVisibility(View.GONE);
        addContentView(folderView, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        folderView.setOnItemClickListener(item -> {
            folderView.close();
            onDesktopItemClick(item);
        });
        folderView.setOnFolderCloseListener(() -> {
            pagerView.setVisibility(View.VISIBLE);
        });
    }

    private void createFolderWithItems(List<FavoriteItem> itemsToAdd) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Folder name");
        final android.widget.EditText input = new android.widget.EditText(this);
        input.setHint("My Folder");
        builder.setView(input);
        builder.setPositiveButton("Create", (dialog, which) -> {
            String name = input.getText().toString().trim();
            if (name.isEmpty()) name = "Folder";
            FolderItem folder = new FolderItem();
            folder.title = name;
            folder.container = LauncherRepository.CONTAINER_DESKTOP;
            folder.screen = pagerView.getCurrentPage();
            folder.cellX = pagerView.getWidth() / 2;
            folder.cellY = pagerView.getHeight() / 2;
            repository.insertFolder(folder, id -> {
                runOnUiThread(() -> {
                    Toast.makeText(this, "Folder created", Toast.LENGTH_SHORT).show();
                });
            });
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }

    private void applyWallpaperBlur() {
        Bitmap blur = wallpaperBlur.getBlurredWallpaper(this, 25f);
        if (blur != null) {
            pagerView.setBackground(new BitmapDrawable(getResources(), blur));
        }
    }

    private void observeData() {
        repository.getDesktopItems().observe(this, items -> {
            if (items == null) return;
            Map<Integer, List<FavoriteItem>> grouped = new HashMap<>();
            int maxScreen = 0;
            Map<Integer, FavoriteItem> widgetItems = new HashMap<>();
            for (FavoriteItem item : items) {
                int screen = item.screen;
                if (!grouped.containsKey(screen)) {
                    grouped.put(screen, new ArrayList<>());
                }
                grouped.get(screen).add(item);
                if (screen > maxScreen) maxScreen = screen;
                if (item.itemType == FavoriteItem.TYPE_WIDGET) {
                    widgetItems.put(item.appWidgetId, item);
                }
            }
            pagerView.removeAllPages();
            int pageCount = Math.max(maxScreen + 1, 1);
            for (int i = 0; i < pageCount; i++) {
                DesktopPage page = new DesktopPage(this);
                List<FavoriteItem> pageItems = grouped.get(i);
                if (pageItems != null) {
                    page.setItems(pageItems);
                }
                page.setOnItemClickListener(this::onDesktopItemClick);
                page.setOnItemLongClickListener(this::onDesktopItemLongClick);
                page.setOnEmptySpaceLongClickListener((x, y) -> {
                    if (!lassoMode) toggleLassoMode();
                });
                page.setOnDragEndListener(item -> {
                    repository.updateItemPosition(item, null);
                });
                pagerView.addPage(page);
            }
            pageIndicator.setPageCount(pageCount);
            pageIndicator.setCurrentPage(0);
            renderer.setPageCount(pageCount);
            rebuildWidgetOverlays(widgetItems);
            pagerView.post(() -> {
                int n = pagerView.getChildCount();
                View[] views = new View[n];
                for (int i = 0; i < n; i++) {
                    views[i] = pagerView.getChildAt(i);
                }
                renderer.updateAllPageTextures(views);
            });
        });

        repository.getDockItems().observe(this, items -> {
            if (items != null) {
                dockView.setItems(items);
            }
        });

        repository.getAllApps().observe(this, apps -> {
            if (apps != null && apps.isEmpty()) {
                Toast.makeText(this, "No apps found", Toast.LENGTH_SHORT).show();
            }
        });

        renderer.setDesktopView(pagerView);
    }

    private GestureEngine.GestureCallback createGestureCallback() {
        return new GestureEngine.GestureCallback() {
            @Override
            public void onDoubleTap() {
                executeAction(prefs.getGestureAction(LauncherPreferences.KEY_DOUBLE_TAP));
            }

            @Override
            public void onSwipeUp() {
                executeAction(prefs.getGestureAction(LauncherPreferences.KEY_SWIPE_UP));
            }

            @Override
            public void onSwipeDown() {
                executeAction(prefs.getGestureAction(LauncherPreferences.KEY_SWIPE_DOWN));
            }

            @Override
            public void onPinchIn() {
                executeAction(prefs.getGestureAction(LauncherPreferences.KEY_PINCH_IN));
            }

            @Override
            public void onPinchOut() {
                executeAction(prefs.getGestureAction(LauncherPreferences.KEY_PINCH_OUT));
            }

            @Override
            public void onTwoFingerSwipe(int direction) {
                String key;
                switch (direction) {
                    case GestureEngine.DIR_UP: key = LauncherPreferences.KEY_TWO_UP; break;
                    case GestureEngine.DIR_DOWN: key = LauncherPreferences.KEY_TWO_DOWN; break;
                    case GestureEngine.DIR_LEFT: key = LauncherPreferences.KEY_TWO_LEFT; break;
                    case GestureEngine.DIR_RIGHT: key = LauncherPreferences.KEY_TWO_RIGHT; break;
                    default: return;
                }
                executeAction(prefs.getGestureAction(key));
            }
        };
    }

    private void executeAction(int action) {
        switch (action) {
            case LauncherPreferences.ACTION_HOME:
                pagerView.setCurrentPage(0);
                break;
            case LauncherPreferences.ACTION_BACK:
                onBackPressed();
                break;
            case LauncherPreferences.ACTION_APP_DRAWER:
                openAppDrawer();
                break;
            case LauncherPreferences.ACTION_SEARCH:
                onSearchRequested();
                break;
            case LauncherPreferences.ACTION_MENU:
                if (sideMenuBar != null) sideMenuBar.toggle();
                break;
            case LauncherPreferences.ACTION_LOCK:
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
                    lockScreen();
                }
                break;
            case LauncherPreferences.ACTION_SCREENSHOT:
                takeScreenshot();
                break;
            case LauncherPreferences.ACTION_POWER:
                showPowerMenu();
                break;
        }
    }

    private void lockScreen() {
        try {
            android.app.admin.DevicePolicyManager dpm = (android.app.admin.DevicePolicyManager)
                    getSystemService(Context.DEVICE_POLICY_SERVICE);
            if (dpm != null) dpm.lockNow();
        } catch (Exception ignored) {}
    }

    private void takeScreenshot() {
        try {
            Process process = Runtime.getRuntime().exec("screencap -p " + getExternalFilesDir(null) + "/screenshot.png");
            process.waitFor();
            Toast.makeText(this, "Screenshot saved", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Screenshot failed", Toast.LENGTH_SHORT).show();
        }
    }

    private void showPowerMenu() {
        PowerMenuDialog.show(this);
    }

    private void applyNextTheme() {
        List<ThemeManager.ThemeInfo> themes = themeManager.getInstalledThemes();
        if (themes.isEmpty()) {
            Toast.makeText(this, "No themes found", Toast.LENGTH_SHORT).show();
            return;
        }
        String current = themeManager.getCurrentThemePackage();
        int nextIdx = 0;
        if (current != null) {
            for (int i = 0; i < themes.size(); i++) {
                if (themes.get(i).packageName.equals(current)) {
                    nextIdx = (i + 1) % themes.size();
                    break;
                }
            }
        }
        String nextPkg = themes.get(nextIdx).packageName;
        themeManager.applyTheme(nextPkg);
        pagerView.invalidate();
        Toast.makeText(this, "Theme: " + themes.get(nextIdx).label, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent event) {
        if (lassoMode) return lassoView.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_PICK_WIDGET && resultCode == RESULT_OK && data != null) {
            String providerStr = data.getStringExtra("provider");
            String label = data.getStringExtra("label");
            int minW = data.getIntExtra("minWidth", 2);
            int minH = data.getIntExtra("minHeight", 2);
            if (providerStr != null) {
                ComponentName provider = ComponentName.unflattenFromString(providerStr);
                placeWidget(provider, label, minW, minH);
            }
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void placeWidget(ComponentName provider, String label, int minW, int minH) {
        try {
            int appWidgetId = widgetHost.allocateAppWidgetId();
            AppWidgetManager mgr = AppWidgetManager.getInstance(this);
            if (!mgr.bindAppWidgetIdIfAllowed(appWidgetId, provider)) {
                widgetHost.deleteAppWidgetId(appWidgetId);
                Toast.makeText(this, "Widget permission denied", Toast.LENGTH_SHORT).show();
                return;
            }
            AppWidgetProviderInfo info = mgr.getAppWidgetInfo(appWidgetId);
            if (info == null) {
                widgetHost.deleteAppWidgetId(appWidgetId);
                Toast.makeText(this, "Widget info not found", Toast.LENGTH_SHORT).show();
                return;
            }
            float density = getResources().getDisplayMetrics().density;
            int w = (int) (info.minWidth * density);
            int h = (int) (info.minHeight * density);
            AppWidgetHostView hostView = widgetHost.createView(this, appWidgetId, info);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(w, h);
            hostView.setLayoutParams(lp);
            hostView.measure(
                    View.MeasureSpec.makeMeasureSpec(w, View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(h, View.MeasureSpec.EXACTLY));
            hostView.layout(0, 0, w, h);

            float cx = pagerView.getWidth() / 2f;
            float cy = pagerView.getHeight() / 2f;
            widgetViews.put(appWidgetId, hostView);

            FavoriteItem item = new FavoriteItem();
            item.title = label != null ? label : "Widget";
            item.container = LauncherRepository.CONTAINER_DESKTOP;
            item.itemType = FavoriteItem.TYPE_WIDGET;
            item.appWidgetId = appWidgetId;
            item.appWidgetProvider = provider.flattenToString();
            item.screen = pagerView.getCurrentPage();
            item.cellX = (int) cx;
            item.cellY = (int) cy;
            item.spanX = minW;
            item.spanY = minH;
            item.packageName = provider.getPackageName();
            repository.insertFavorite(item, () -> {
                pagerView.addOverlayView(appWidgetId, hostView, cx, cy);
            });
        } catch (Exception e) {
            Toast.makeText(this, "Failed to add widget", Toast.LENGTH_SHORT).show();
        }
    }

    private void rebuildWidgetOverlays(Map<Integer, FavoriteItem> widgetItems) {
        Set<Integer> activeIds = new HashSet<>(widgetItems.keySet());
        for (Map.Entry<Integer, FavoriteItem> entry : widgetItems.entrySet()) {
            int id = entry.getKey();
            FavoriteItem item = entry.getValue();
            if (item == null) continue;
            AppWidgetHostView hostView = widgetViews.get(id);
            if (hostView == null) {
                AppWidgetManager mgr = AppWidgetManager.getInstance(this);
                AppWidgetProviderInfo info = mgr.getAppWidgetInfo(id);
                if (info != null) {
                    hostView = widgetHost.createView(this, id, info);
                    float density = getResources().getDisplayMetrics().density;
                    int w = (int) (info.minWidth * density);
                    int h = (int) (info.minHeight * density);
                    ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(w, h);
                    hostView.setLayoutParams(lp);
                    hostView.measure(
                            View.MeasureSpec.makeMeasureSpec(w, View.MeasureSpec.EXACTLY),
                            View.MeasureSpec.makeMeasureSpec(h, View.MeasureSpec.EXACTLY));
                    hostView.layout(0, 0, w, h);
                    widgetViews.put(id, hostView);
                }
            }
            if (hostView != null) {
                pagerView.addOverlayView(id, hostView, item.cellX, item.cellY);
            }
        }
        Set<Integer> removedIds = new HashSet<>(widgetViews.keySet());
        removedIds.removeAll(activeIds);
        for (int id : removedIds) {
            widgetViews.remove(id);
        }
    }

    private void onDesktopItemClick(FavoriteItem item) {
        if (item == null) return;
        if (item.itemType == FavoriteItem.TYPE_FOLDER) {
            openFolder(item);
            return;
        }
        if (item.intent != null) {
            try {
                Intent intent = Intent.parseUri(item.intent, 0);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, "Cannot launch: " + item.title, Toast.LENGTH_SHORT).show();
            }
        } else if (item.packageName != null) {
            launchApp(item.packageName);
        }
    }

    private void onDesktopItemLongClick(FavoriteItem item, float x, float y) {
        if (item == null) return;
        ArchShortcutMenu.show(this, item, x, y, new ArchShortcutMenu.ActionCallback() {
            @Override
            public void onEdit(FavoriteItem it) {
                IconEditDialog.show(HomeActivity.this, it, (editedItem, newName) -> {
                    editedItem.title = newName;
                    repository.updateItemPosition(editedItem, null);
                });
            }

            @Override
            public void onRemove(FavoriteItem it) {
                repository.deleteFavorite(it, () -> runOnUiThread(() ->
                        Toast.makeText(HomeActivity.this, "Removed: " + it.title, Toast.LENGTH_SHORT).show()));
            }

            @Override
            public void onAppInfo(FavoriteItem it) {
                if (it.packageName != null) {
                    Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                    intent.setData(Uri.parse("package:" + it.packageName));
                    startActivity(intent);
                }
            }

            @Override
            public void onCreateShortcut(FavoriteItem it) {
                Intent intent = new Intent(Intent.ACTION_CREATE_SHORTCUT);
                intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, it.title);
                if (it.intent != null) {
                    try {
                        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, Intent.parseUri(it.intent, 0));
                    } catch (Exception ignored) {}
                }
                startActivity(intent);
            }
        });
    }

    private void openFolder(FavoriteItem folderItem) {
        folderView.setTitle(folderItem.title);
        List<FavoriteItem> folderContents = new ArrayList<>();
        folderContents.add(folderItem);
        folderView.setItems(folderContents);
        folderView.open();
        pagerView.setVisibility(View.INVISIBLE);
    }

    private void onDockItemLongClick(DockItem item) {
        if (item == null) return;
        FavoriteItem fav = new FavoriteItem();
        fav.title = item.title;
        fav.intent = item.intent;
        fav.packageName = item.packageName;
        fav.className = item.className;
        fav.container = LauncherRepository.CONTAINER_DESKTOP;
        fav.itemType = FavoriteItem.TYPE_APPLICATION;
        pagerView.addItemToCurrentPage(fav);
        repository.insertFavorite(fav, null);
        Toast.makeText(this, "Added: " + item.title, Toast.LENGTH_SHORT).show();
    }

    private void onDockItemClick(DockItem item) {
        if (item != null) {
            if (item.intent != null) {
                try {
                    Intent intent = Intent.parseUri(item.intent, 0);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } catch (Exception e) {
                    if (item.packageName != null) {
                        launchApp(item.packageName);
                    }
                }
            } else if (item.packageName != null) {
                launchApp(item.packageName);
            }
        }
    }

    private void launchApp(String packageName) {
        Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Cannot launch: " + packageName, Toast.LENGTH_SHORT).show();
        }
    }

    private void openAppDrawer() {
        Intent intent = new Intent(this, AppDrawerActivity.class);
        startActivity(intent);
    }

    private void openSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (widgetHost != null) {
            widgetHost.startListening();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (widgetHost != null) {
            widgetHost.stopListening();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        executor.execute(() -> repository.loadApps());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (widgetHost != null) {
            widgetHost.stopListening();
        }
        if (renderer != null) {
            renderer.release();
        }
        if (wallpaperBlur != null) {
            wallpaperBlur.release();
        }
        if (repository != null) {
            repository.shutdown();
        }
        executor.shutdown();
    }

    private void configureSystemBars() {
        Window window = getWindow();
        window.setStatusBarColor(getColor(R.color.launcher_background));
        window.setNavigationBarColor(getColor(R.color.launcher_background));

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            WindowInsetsController controller = window.getInsetsController();
            if (controller != null) {
                controller.hide(WindowInsets.Type.statusBars());
                controller.setSystemBarsBehavior(
                        WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            }
        } else {
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
    }
}