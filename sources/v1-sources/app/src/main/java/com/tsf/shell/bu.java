package com.tsf.shell;

import android.appwidget.AppWidgetHost;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes.dex */
final class bu extends SQLiteOpenHelper {
    private final Context a;
    private final AppWidgetHost b;

    bu(Context context) {
        super(context, "TSFLauncher-database.db", (SQLiteDatabase.CursorFactory) null, 10);
        this.a = context;
        this.b = new AppWidgetHost(context, 1024);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        com.tsf.shell.c.a.a.a();
        b(sQLiteDatabase);
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE configuration (_id INTEGER PRIMARY KEY,screen INTEGER,homepage INTEGER,extrascreen INTEGER,screenorder TEXT,screenscale TEXT);");
        sQLiteDatabase.execSQL("insert into configuration(screen,homepage,extrascreen,screenorder,screenscale) values(-1,-1,6,'-1,0,1,2,3,4,5,6',0)");
        sQLiteDatabase.execSQL("CREATE TABLE folders (_id INTEGER PRIMARY KEY,appWidgetId INTEGER,title TEXT,child TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE quicklaunch (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into quicklaunch(child) values(?)");
        sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into dock(child) values(?)");
        sQLiteDatabase.execSQL("CREATE TABLE theme (_id INTEGER PRIMARY KEY,theme TEXT,icon TEXT,folder TEXT,font TEXT,resetwallpaper INTEGER);");
        sQLiteDatabase.execSQL("insert into theme(resetwallpaper) values(1)");
        com.tsf.shell.action.c.a(this.a, sQLiteDatabase);
        if (this.b != null) {
            this.b.deleteHost();
            this.a.getContentResolver().notifyChange(ShellProvider.a, null);
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS optionmenu");
        sQLiteDatabase.execSQL("CREATE TABLE optionmenu (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,data BLOB);");
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
        sQLiteDatabase.execSQL("CREATE TABLE favorites (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,screen INTEGER,cellX TEXT,cellY TEXT,rotation TEXT,spanX TEXT,spanY TEXT,scale TEXT,itemType INTEGER,appWidgetId INTEGER NOT NULL DEFAULT -1,data BLOB,config TEXT,packagename TEXT,classname TEXT,internal INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("ALTER TABLE configuration ADD COLUMN screenscale TEXT NOT NULL DEFAULT 0;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e) {
                Log.e("Home.LauncherProvider", e.getMessage(), e);
            } finally {
            }
        }
        if (i < 4) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("ALTER TABLE configuration ADD COLUMN extrascreen INTEGER NOT NULL DEFAULT 6;");
                sQLiteDatabase.execSQL("ALTER TABLE configuration ADD COLUMN screenorder TEXT NOT NULL DEFAULT '-1,0,1,2,3,4,5,6';");
                sQLiteDatabase.execSQL("ALTER TABLE configuration ADD COLUMN homepage INTEGER NOT NULL DEFAULT -1;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e2) {
                Log.e("Home.LauncherProvider", e2.getMessage(), e2);
            } finally {
            }
        }
        if (i < 6) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("ALTER TABLE favorites ADD COLUMN config TEXT;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e3) {
                Log.e("Home.LauncherProvider", e3.getMessage(), e3);
            } finally {
            }
        }
        if (i < 7) {
            sQLiteDatabase.beginTransaction();
            try {
                com.tsf.shell.action.c.a(this.a, sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e4) {
                Log.e("Home.LauncherProvider", e4.getMessage(), e4);
            } finally {
            }
        }
        if (i < 8) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
                sQLiteDatabase.execSQL("insert into dock(child) values(?)");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e5) {
                Log.e("Home.LauncherProvider", e5.getMessage(), e5);
            } finally {
            }
        }
        if (i < 9) {
            sQLiteDatabase.beginTransaction();
            Cursor query = sQLiteDatabase.query("favorites", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("data");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("config");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("intent");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("container");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("itemType");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("screen");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("cellX");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("cellY");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("rotation");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("spanX");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("spanY");
            int columnIndexOrThrow15 = query.getColumnIndexOrThrow("packagename");
            int columnIndexOrThrow16 = query.getColumnIndexOrThrow("classname");
            int columnIndexOrThrow17 = query.getColumnIndexOrThrow("internal");
            ContentValues[] contentValuesArr = new ContentValues[query.getCount()];
            int i3 = 0;
            while (query.moveToNext()) {
                ContentValues contentValues = new ContentValues(query.getColumnCount());
                contentValues.put("appWidgetId", Integer.valueOf(query.getInt(columnIndexOrThrow2)));
                contentValues.put("title", query.getString(columnIndexOrThrow6));
                contentValues.put("intent", query.getString(columnIndexOrThrow5));
                contentValues.put("container", Integer.valueOf(query.getInt(columnIndexOrThrow7)));
                contentValues.put("screen", Integer.valueOf(query.getInt(columnIndexOrThrow9)));
                contentValues.put("config", query.getString(columnIndexOrThrow3));
                int i4 = query.getInt(columnIndexOrThrow10);
                contentValues.put("cellX", String.valueOf(i4) + "," + i4);
                int i5 = query.getInt(columnIndexOrThrow11);
                contentValues.put("cellY", String.valueOf(i5) + "," + i5);
                int i6 = query.getInt(columnIndexOrThrow12);
                contentValues.put("rotation", String.valueOf(i6) + "," + i6);
                int i7 = query.getInt(columnIndexOrThrow13);
                contentValues.put("spanX", String.valueOf(i7) + "," + i7);
                int i8 = query.getInt(columnIndexOrThrow14);
                contentValues.put("spanY", String.valueOf(i8) + "," + i8);
                contentValues.put("scale", "1,1");
                contentValues.put("itemType", Integer.valueOf(query.getInt(columnIndexOrThrow8)));
                contentValues.put("appWidgetId", Integer.valueOf(query.getInt(columnIndexOrThrow4)));
                contentValues.put("data", query.getBlob(columnIndexOrThrow));
                contentValues.put("packagename", query.getString(columnIndexOrThrow15));
                contentValues.put("classname", query.getString(columnIndexOrThrow16));
                contentValues.put("internal", Integer.valueOf(query.getInt(columnIndexOrThrow17)));
                contentValuesArr[i3] = contentValues;
                i3++;
            }
            b(sQLiteDatabase);
            try {
                for (ContentValues contentValues2 : contentValuesArr) {
                    sQLiteDatabase.insert("favorites", null, contentValues2);
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                query.close();
            } finally {
            }
        }
        if (i < 10) {
            sQLiteDatabase.beginTransaction();
            a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        }
    }
}
