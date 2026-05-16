package com.tsf.shell.data.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.tsf.shell.data.LegacyLauncherContract;
import com.tsf.shell.data.local.dao.ApplicationDao;
import com.tsf.shell.data.local.dao.DockDao;
import com.tsf.shell.data.local.dao.FavoriteDao;
import com.tsf.shell.data.local.dao.MenuDao;
import com.tsf.shell.data.local.dao.FolderDao;
import com.tsf.shell.data.local.dao.QuickLaunchDao;
import com.tsf.shell.data.local.dao.SlidingDockDao;
import com.tsf.shell.data.local.entity.ApplicationItem;
import com.tsf.shell.data.local.entity.FolderItem;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.data.local.entity.MenuItem;
import com.tsf.shell.data.local.entity.QuickLaunchItem;
import com.tsf.shell.data.local.entity.SlidingDockItem;

@Database(
        entities = {FavoriteItem.class, ApplicationItem.class, DockItem.class, MenuItem.class, SlidingDockItem.class, QuickLaunchItem.class, FolderItem.class},
        version = LegacyLauncherContract.DATABASE_VERSION,
        exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase INSTANCE;

    public abstract FavoriteDao favoriteDao();
    public abstract ApplicationDao applicationDao();
    public abstract DockDao dockDao();
    public abstract MenuDao menuDao();
    public abstract SlidingDockDao slidingDockDao();
    public abstract QuickLaunchDao quickLaunchDao();
    public abstract FolderDao folderDao();

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            LegacyLauncherContract.ROOM_DATABASE_NAME)
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}