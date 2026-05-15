package com.tsf.shell.data.repository;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tsf.shell.data.local.AppDatabase;
import com.tsf.shell.data.local.dao.ApplicationDao;
import com.tsf.shell.data.local.dao.DockDao;
import com.tsf.shell.data.local.dao.FavoriteDao;
import com.tsf.shell.data.local.entity.ApplicationItem;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LauncherRepository {

    public static final int CONTAINER_DESKTOP = 0;
    public static final int CONTAINER_DOCK = 2;
    public static final int CONTAINER_DRAWER = -1;

    private final Context context;
    private final FavoriteDao favoriteDao;
    private final DockDao dockDao;
    private final ApplicationDao applicationDao;
    private final ExecutorService executor;

    private final MutableLiveData<List<LaunchableApp>> allApps = new MutableLiveData<>();

    public LauncherRepository(Context context) {
        this.context = context.getApplicationContext();
        AppDatabase db = AppDatabase.getInstance(context);
        this.favoriteDao = db.favoriteDao();
        this.dockDao = db.dockDao();
        this.applicationDao = db.applicationDao();
        this.executor = Executors.newSingleThreadExecutor();
    }

    public LiveData<List<LaunchableApp>> getAllApps() {
        loadApps();
        return allApps;
    }

    public void loadApps() {
        executor.execute(() -> {
            List<LaunchableApp> apps = new ArrayList<>();
            PackageManager pm = context.getPackageManager();
            Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
            mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            try {
                List<ApplicationInfo> infos;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    infos = pm.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(PackageManager.GET_META_DATA));
                } else {
                    infos = pm.getInstalledApplications(PackageManager.GET_META_DATA);
                }
                
                for (ApplicationInfo info : infos) {
                    if (pm.getLaunchIntentForPackage(info.packageName) == null) continue;
                    if ((info.flags & ApplicationInfo.FLAG_SYSTEM) != 0 && !isUserApp(info)) continue;

                    LaunchableApp app = new LaunchableApp();
                    app.packageName = info.packageName;
                    app.title = info.loadLabel(pm).toString();
                    app.icon = pm.getApplicationIcon(info);
                    app.intent = pm.getLaunchIntentForPackage(info.packageName).toUri(0);
                    apps.add(app);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            apps.sort((a, b) -> a.title.compareToIgnoreCase(b.title));
            allApps.postValue(apps);
        });
    }

    private boolean isUserApp(ApplicationInfo info) {
        return (info.flags & ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) != 0;
    }

    public LiveData<List<FavoriteItem>> getDesktopItems() {
        return favoriteDao.getByContainer(CONTAINER_DESKTOP);
    }

    public LiveData<List<DockItem>> getDockItems() {
        return dockDao.getAll();
    }

    public void insertFavorite(FavoriteItem item, OnCompleteListener listener) {
        executor.execute(() -> {
            favoriteDao.insert(item);
            if (listener != null) listener.onComplete();
        });
    }

    public void deleteFavorite(FavoriteItem item, OnCompleteListener listener) {
        executor.execute(() -> {
            favoriteDao.delete(item);
            if (listener != null) listener.onComplete();
        });
    }

    public void updateItemPosition(long id, int screen, int cellX, int cellY, OnCompleteListener listener) {
        executor.execute(() -> {
            List<FavoriteItem> items = favoriteDao.getByContainerSync(CONTAINER_DESKTOP);
            for (FavoriteItem item : items) {
                if (item.id == id) {
                    item.screen = screen;
                    item.cellX = cellX;
                    item.cellY = cellY;
                    favoriteDao.update(item);
                    break;
                }
            }
            if (listener != null) listener.onComplete();
        });
    }

    public void getMaxScreen(OnResultListener<Integer> listener) {
        executor.execute(() -> {
            int max = favoriteDao.getMaxScreen(CONTAINER_DESKTOP);
            if (listener != null) listener.onResult(max);
        });
    }

    public void shutdown() {
        executor.shutdown();
    }

    public interface OnCompleteListener {
        void onComplete();
    }

    public interface OnResultListener<T> {
        void onResult(T result);
    }

    public static class LaunchableApp {
        public String packageName;
        public String title;
        public Drawable icon;
        public String intent;
    }
}