package com.tsf.shell.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.tsf.shell.data.local.AppDatabase;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.data.repository.LauncherRepository;
import java.util.ArrayList;
import java.util.List;

public class DatabaseSeeder {

    private static final String PREF_SEEDED = "database_seeded";

    public static void seedIfEmpty(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("tsf_seeder", Context.MODE_PRIVATE);
        if (prefs.getBoolean(PREF_SEEDED, false)) {
            return;
        }

        AppDatabase db = AppDatabase.getInstance(context);
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            try {
                List<DockItem> existingDock = db.dockDao().getAllSync();
                if (!existingDock.isEmpty()) {
                    prefs.edit().putBoolean(PREF_SEEDED, true).apply();
                    return;
                }

                List<DockItem> dockItems = new ArrayList<>();
                dockItems.add(createDockItem("Phone", "com.google.android.dialer", 0));
                dockItems.add(createDockItem("Messages", "com.google.android.apps.messaging", 1));
                dockItems.add(createDockItem("Chrome", "com.android.chrome", 2));
                dockItems.add(createDockItem("Camera", "com.android.camera2", 3));
                dockItems.add(createDockItem("Settings", "com.android.settings", 4));

                db.dockDao().insertAll(dockItems);

                List<FavoriteItem> desktopItems = new ArrayList<>();
                desktopItems.add(createDesktopItem("Settings", "com.android.settings", "com.android.settings.Settings", 200, 400));
                desktopItems.add(createDesktopItem("Photos", "com.google.android.apps.photos", "com.google.android.apps.photos.home.Home", 600, 400));
                desktopItems.add(createDesktopItem("Maps", "com.google.android.apps.maps", "com.google.android.maps.MapsActivity", 1000, 400));

                db.favoriteDao().insertAll(desktopItems);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                prefs.edit().putBoolean(PREF_SEEDED, true).apply();
                executor.shutdown();
            }
        });
    }

    private static DockItem createDockItem(String title, String packageName, int cellX) {
        DockItem item = new DockItem();
        item.title = title;
        item.packageName = packageName;
        item.container = LauncherRepository.CONTAINER_DOCK;
        item.itemType = FavoriteItem.TYPE_APPLICATION;
        item.cellX = cellX;
        return item;
    }

    private static FavoriteItem createDesktopItem(String title, String packageName, String className, int cellX, int cellY) {
        FavoriteItem item = new FavoriteItem();
        item.title = title;
        item.packageName = packageName;
        item.className = className;
        item.container = LauncherRepository.CONTAINER_DESKTOP;
        item.itemType = FavoriteItem.TYPE_APPLICATION;
        item.screen = 0;
        item.cellX = cellX;
        item.cellY = cellY;
        return item;
    }
}
