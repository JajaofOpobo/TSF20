package com.tsf.shell;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.data.repository.LauncherRepository;
import com.tsf.shell.render.SimpleRenderer;
import com.tsf.shell.ui.view.DesktopGridView;
import com.tsf.shell.ui.view.DockView;
import com.tsf.shell.util.NotificationHelper;
import com.tsf.shell.util.PermissionHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class HomeActivity extends AppCompatActivity {

    private LauncherRepository repository;
    private SimpleRenderer renderer;
    private DockView dockView;
    private DesktopGridView desktopGrid;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NotificationHelper.createChannels(this);
        if (!PermissionHelper.hasNotificationPermission(this)) {
            PermissionHelper.requestNotificationPermission(this);
        }
        configureSystemBars();
        setContentView(R.layout.activity_main);
        initializeLauncher();
    }

    private void initializeLauncher() {
        renderer = new SimpleRenderer();
        renderer.initialize();
        repository = new LauncherRepository(this);

        FrameLayout desktopContainer = findViewById(R.id.desktop_container);
        LinearLayout dockContainer = findViewById(R.id.dock_container);

        desktopGrid = new DesktopGridView(this);
        desktopGrid.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT));
        desktopContainer.addView(desktopGrid);

        dockView = new DockView(this);
        dockView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        dockContainer.addView(dockView);

        desktopGrid.setOnItemClickListener(this::onDesktopItemClick);
        desktopGrid.setOnItemLongClickListener(this::onDesktopItemLongClick);

        dockView.setOnDockItemClickListener(this::onDockItemClick);

        repository.getDesktopItems().observe(this, items -> {
            if (items != null) {
                desktopGrid.setItems(items);
            }
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

        renderer.setDesktopView(desktopGrid);
    }

    private void onDesktopItemClick(FavoriteItem item) {
        if (item != null && item.intent != null) {
            try {
                Intent intent = Intent.parseUri(item.intent, 0);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, "Cannot launch: " + item.title, Toast.LENGTH_SHORT).show();
            }
        } else if (item != null && item.packageName != null) {
            launchApp(item.packageName);
        }
    }

    private void onDesktopItemLongClick(FavoriteItem item) {
        if (item != null) {
            Toast.makeText(this, "Long press: " + item.title, Toast.LENGTH_SHORT).show();
        }
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

    @Override
    protected void onResume() {
        super.onResume();
        executor.execute(() -> repository.loadApps());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (renderer != null) {
            renderer.release();
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