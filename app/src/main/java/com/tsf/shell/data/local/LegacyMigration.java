package com.tsf.shell.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.tsf.shell.data.local.dao.ApplicationDao;
import com.tsf.shell.data.local.dao.DockDao;
import com.tsf.shell.data.local.dao.FavoriteDao;
import com.tsf.shell.data.local.dao.MenuDao;
import com.tsf.shell.data.local.dao.QuickLaunchDao;
import com.tsf.shell.data.local.dao.SlidingDockDao;
import com.tsf.shell.data.local.entity.ApplicationItem;
import com.tsf.shell.data.local.entity.DockItem;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.data.local.entity.MenuItem;
import com.tsf.shell.data.local.entity.QuickLaunchItem;
import com.tsf.shell.data.local.entity.SlidingDockItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LegacyMigration {

    private static final String PREF_MIGRATED = "legacy_migrated";
    private static final String LEGACY_DB_NAME = "TSFLauncher-database.db";

    public static void run(Context context, AppDatabase roomDb) {
        if (context.getSharedPreferences("tsf_migration", Context.MODE_PRIVATE)
                .getBoolean(PREF_MIGRATED, false)) {
            return;
        }

        File legacyDbFile = context.getDatabasePath(LEGACY_DB_NAME);
        if (!legacyDbFile.exists()) {
            markMigrated(context);
            return;
        }

        LegacyDb legacyDb = new LegacyDb(context);
        SQLiteDatabase legacy = legacyDb.getReadableDatabase();

        HashMap<Integer, ContentValues> favData = new HashMap<>();
        HashMap<Integer, Long> idMap = new HashMap<>();
        try {
            migrateFavorites(legacy, roomDb.favoriteDao(), favData, idMap);
            migrateApplications(legacy, roomDb.applicationDao());
            migrateChildTable(legacy, roomDb.dockDao(), favData, idMap, "dock", DockItem.class);
            migrateChildTable(legacy, roomDb.slidingDockDao(), favData, idMap, "slidingdock", SlidingDockItem.class);
            migrateChildTable(legacy, roomDb.menuDao(), favData, idMap, "menu", MenuItem.class);
            migrateChildTable(legacy, roomDb.quickLaunchDao(), favData, idMap, "quicklaunch", QuickLaunchItem.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        legacy.close();
        legacyDb.close();

        legacyDbFile.delete();
        markMigrated(context);
    }

    private static void markMigrated(Context context) {
        context.getSharedPreferences("tsf_migration", Context.MODE_PRIVATE)
                .edit()
                .putBoolean(PREF_MIGRATED, true)
                .apply();
    }

    private static void migrateFavorites(SQLiteDatabase legacy, FavoriteDao dao,
                                          HashMap<Integer, ContentValues> favData,
                                          HashMap<Integer, Long> idMap) {
        if (!tableExists(legacy, "favorites")) return;
        Cursor c = legacy.rawQuery("SELECT * FROM favorites", null);
        List<FavoriteItem> items = new ArrayList<>();
        List<Integer> oldIds = new ArrayList<>();

        while (c.moveToNext()) {
            int oldId = c.getInt(c.getColumnIndexOrThrow("_id"));
            oldIds.add(oldId);

            ContentValues raw = new ContentValues();
            for (String col : c.getColumnNames()) {
                int idx = c.getColumnIndexOrThrow(col);
                switch (c.getType(idx)) {
                    case Cursor.FIELD_TYPE_NULL: break;
                    case Cursor.FIELD_TYPE_INTEGER: raw.put(col, c.getLong(idx)); break;
                    case Cursor.FIELD_TYPE_FLOAT: raw.put(col, c.getFloat(idx)); break;
                    case Cursor.FIELD_TYPE_STRING: raw.put(col, c.getString(idx)); break;
                    case Cursor.FIELD_TYPE_BLOB: raw.put(col, c.getBlob(idx)); break;
                }
            }
            favData.put(oldId, raw);

            FavoriteItem item = new FavoriteItem();
            item.title = c.getString(c.getColumnIndexOrThrow("title"));
            item.intent = c.getString(c.getColumnIndexOrThrow("intent"));
            item.container = c.getInt(c.getColumnIndexOrThrow("container"));
            item.screen = c.getInt(c.getColumnIndexOrThrow("screen"));
            item.cellX = parseFirstInt(c.getString(c.getColumnIndexOrThrow("cellX")));
            item.cellY = parseFirstInt(c.getString(c.getColumnIndexOrThrow("cellY")));
            item.rotation = parseFirstFloat(c.getString(c.getColumnIndexOrThrow("rotation")));
            item.spanX = parseFirstInt(c.getString(c.getColumnIndexOrThrow("spanX")));
            item.spanY = parseFirstInt(c.getString(c.getColumnIndexOrThrow("spanY")));
            item.scale = parseFirstFloat(c.getString(c.getColumnIndexOrThrow("scale")));
            item.itemType = c.getInt(c.getColumnIndexOrThrow("itemType"));
            item.appWidgetId = c.getInt(c.getColumnIndexOrThrow("appWidgetId"));
            item.iconType = c.getInt(c.getColumnIndexOrThrow("iconType"));
            item.iconPackage = c.getString(c.getColumnIndexOrThrow("iconPackage"));
            item.iconResource = c.getString(c.getColumnIndexOrThrow("iconResource"));
            item.icon = c.getBlob(c.getColumnIndexOrThrow("icon"));
            item.titleType = c.getInt(c.getColumnIndexOrThrow("titleType"));
            item.config = c.getString(c.getColumnIndexOrThrow("config"));
            item.packageName = c.getString(c.getColumnIndexOrThrow("packagename"));
            item.className = c.getString(c.getColumnIndexOrThrow("classname"));
            item.internal = c.getInt(c.getColumnIndexOrThrow("internal"));
            item.appWidgetProvider = c.getString(c.getColumnIndexOrThrow("appWidgetProvider"));
            items.add(item);
        }
        c.close();

        if (!items.isEmpty()) {
            List<Long> newIds = dao.insertAll(items);
            for (int i = 0; i < oldIds.size() && i < newIds.size(); i++) {
                idMap.put(oldIds.get(i), newIds.get(i));
            }
        }
    }

    private static void migrateApplications(SQLiteDatabase legacy, ApplicationDao dao) {
        if (!tableExists(legacy, "application")) return;
        Cursor c = legacy.rawQuery("SELECT * FROM application", null);
        List<ApplicationItem> items = new ArrayList<>();
        while (c.moveToNext()) {
            ApplicationItem item = new ApplicationItem();
            item.index = c.getInt(c.getColumnIndexOrThrow("mindex"));
            item.title = c.getString(c.getColumnIndexOrThrow("title"));
            item.clickCount = c.getInt(c.getColumnIndexOrThrow("clickcnt"));
            item.isHidden = c.getInt(c.getColumnIndexOrThrow("ishide")) != 0;
            item.intent = c.getString(c.getColumnIndexOrThrow("intent"));
            item.container = c.getInt(c.getColumnIndexOrThrow("container"));
            item.itemType = c.getInt(c.getColumnIndexOrThrow("itemType"));
            item.iconType = c.getInt(c.getColumnIndexOrThrow("iconType"));
            item.iconPackage = c.getString(c.getColumnIndexOrThrow("iconPackage"));
            item.iconResource = c.getString(c.getColumnIndexOrThrow("iconResource"));
            item.icon = c.getBlob(c.getColumnIndexOrThrow("icon"));
            item.titleType = c.getInt(c.getColumnIndexOrThrow("titleType"));
            item.config = c.getString(c.getColumnIndexOrThrow("config"));
            item.packageName = c.getString(c.getColumnIndexOrThrow("packagename"));
            item.className = c.getString(c.getColumnIndexOrThrow("classname"));
            item.versionCode = c.getInt(c.getColumnIndexOrThrow("vercode"));
            item.versionName = c.getString(c.getColumnIndexOrThrow("vername"));
            items.add(item);
        }
        c.close();
        if (!items.isEmpty()) {
            dao.insertAll(items);
        }
    }

    private static <T> void migrateChildTable(SQLiteDatabase legacy, Object dao,
                                               HashMap<Integer, ContentValues> favData,
                                               HashMap<Integer, Long> idMap,
                                               String tableName, Class<T> entityClass) {
        if (!tableExists(legacy, tableName)) return;
        Cursor c = legacy.rawQuery("SELECT child FROM " + tableName + " WHERE _id=1", null);
        if (!c.moveToFirst()) {
            c.close();
            return;
        }
        String child = c.getString(0);
        c.close();
        if (TextUtils.isEmpty(child)) return;

        String[] ids = child.split(",");
        List<T> items = new ArrayList<>();

        for (String idStr : ids) {
            if (idStr.isEmpty()) continue;
            try {
                int oldId = Integer.parseInt(idStr);
                if (!favData.containsKey(oldId)) continue;

                T item = buildFromFavData(entityClass, favData.get(oldId));
                if (item != null) {
                    items.add(item);
                }
            } catch (NumberFormatException ignored) {
            }
        }

        if (!items.isEmpty()) {
            insertEntities(dao, items, entityClass);
        }
    }

    private static <T> T buildFromFavData(Class<T> entityClass, ContentValues fav) {
        String cellXStr = fav.getAsString("cellX");
        String cellYStr = fav.getAsString("cellY");

        if (entityClass == DockItem.class) {
            DockItem item = new DockItem();
            fillItemFields(item, fav, cellXStr, cellYStr);
            item.packageName = fav.getAsString("packagename");
            item.className = fav.getAsString("classname");
            return entityClass.cast(item);
        }
        if (entityClass == SlidingDockItem.class) {
            SlidingDockItem item = new SlidingDockItem();
            fillItemFields(item, fav, cellXStr, cellYStr);
            item.packageName = fav.getAsString("packagename");
            item.className = fav.getAsString("classname");
            return entityClass.cast(item);
        }
        if (entityClass == MenuItem.class) {
            MenuItem item = new MenuItem();
            fillItemFields(item, fav, cellXStr, cellYStr);
            item.packageName = fav.getAsString("packagename");
            item.className = fav.getAsString("classname");
            return entityClass.cast(item);
        }
        if (entityClass == QuickLaunchItem.class) {
            QuickLaunchItem item = new QuickLaunchItem();
            fillItemFields(item, fav, cellXStr, cellYStr);
            item.packageName = fav.getAsString("packagename");
            item.className = fav.getAsString("classname");
            return entityClass.cast(item);
        }
        return null;
    }

    private static void fillItemFields(Object item, ContentValues cv, String cellXStr, String cellYStr) {
        if (item instanceof DockItem) {
            DockItem di = (DockItem) item;
            di.title = cv.getAsString("title");
            di.intent = cv.getAsString("intent");
            di.container = optInt(cv, "container");
            di.screen = optInt(cv, "screen");
            di.cellX = parseFirstInt(cellXStr);
            di.cellY = parseFirstInt(cellYStr);
            di.itemType = optInt(cv, "itemType");
            di.iconType = optInt(cv, "iconType");
            di.iconPackage = cv.getAsString("iconPackage");
            di.iconResource = cv.getAsString("iconResource");
            di.icon = cv.getAsByteArray("icon");
            di.titleType = optInt(cv, "titleType");
            di.config = cv.getAsString("config");
        } else if (item instanceof SlidingDockItem) {
            SlidingDockItem di = (SlidingDockItem) item;
            di.title = cv.getAsString("title");
            di.intent = cv.getAsString("intent");
            di.container = optInt(cv, "container");
            di.screen = optInt(cv, "screen");
            di.cellX = parseFirstInt(cellXStr);
            di.cellY = parseFirstInt(cellYStr);
            di.itemType = optInt(cv, "itemType");
            di.iconType = optInt(cv, "iconType");
            di.iconPackage = cv.getAsString("iconPackage");
            di.iconResource = cv.getAsString("iconResource");
            di.icon = cv.getAsByteArray("icon");
            di.titleType = optInt(cv, "titleType");
            di.config = cv.getAsString("config");
        } else if (item instanceof MenuItem) {
            MenuItem mi = (MenuItem) item;
            mi.title = cv.getAsString("title");
            mi.intent = cv.getAsString("intent");
            mi.container = optInt(cv, "container");
            mi.screen = optInt(cv, "screen");
            mi.cellX = parseFirstInt(cellXStr);
            mi.cellY = parseFirstInt(cellYStr);
            mi.itemType = optInt(cv, "itemType");
            mi.iconType = optInt(cv, "iconType");
            mi.iconPackage = cv.getAsString("iconPackage");
            mi.iconResource = cv.getAsString("iconResource");
            mi.icon = cv.getAsByteArray("icon");
            mi.titleType = optInt(cv, "titleType");
            mi.config = cv.getAsString("config");
        } else if (item instanceof QuickLaunchItem) {
            QuickLaunchItem qi = (QuickLaunchItem) item;
            qi.title = cv.getAsString("title");
            qi.intent = cv.getAsString("intent");
            qi.container = optInt(cv, "container");
            qi.screen = optInt(cv, "screen");
            qi.cellX = parseFirstInt(cellXStr);
            qi.cellY = parseFirstInt(cellYStr);
            qi.itemType = optInt(cv, "itemType");
            qi.iconType = optInt(cv, "iconType");
            qi.iconPackage = cv.getAsString("iconPackage");
            qi.iconResource = cv.getAsString("iconResource");
            qi.icon = cv.getAsByteArray("icon");
            qi.titleType = optInt(cv, "titleType");
            qi.config = cv.getAsString("config");
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> void insertEntities(Object dao, List<T> items, Class<T> entityClass) {
        if (entityClass == DockItem.class) {
            ((DockDao) dao).insertAll((List<DockItem>) items);
        } else if (entityClass == SlidingDockItem.class) {
            ((SlidingDockDao) dao).insertAll((List<SlidingDockItem>) items);
        } else if (entityClass == MenuItem.class) {
            ((MenuDao) dao).insertAll((List<MenuItem>) items);
        } else if (entityClass == QuickLaunchItem.class) {
            ((QuickLaunchDao) dao).insertAll((List<QuickLaunchItem>) items);
        }
    }

    private static int optInt(ContentValues cv, String key) {
        Integer v = cv.getAsInteger(key);
        return v != null ? v : 0;
    }

    private static int parseFirstInt(String val) {
        if (val == null) return 0;
        int comma = val.indexOf(',');
        try {
            return Integer.parseInt(comma >= 0 ? val.substring(0, comma) : val);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static float parseFirstFloat(String val) {
        if (val == null) return 0f;
        int comma = val.indexOf(',');
        try {
            return Float.parseFloat(comma >= 0 ? val.substring(0, comma) : val);
        } catch (NumberFormatException e) {
            return 0f;
        }
    }

    private static boolean tableExists(SQLiteDatabase db, String tableName) {
        Cursor c = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{tableName});
        boolean exists = c.moveToFirst();
        c.close();
        return exists;
    }

    private static class LegacyDb extends SQLiteOpenHelper {
        LegacyDb(Context context) {
            super(context, LEGACY_DB_NAME, null, 34);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}
