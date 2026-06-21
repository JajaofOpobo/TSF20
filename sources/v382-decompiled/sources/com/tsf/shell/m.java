package com.tsf.shell;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public class m extends SQLiteOpenHelper {
    private int a;
    private int b;
    private Context c;
    private boolean d;

    m(Context context) {
        super(context, "TSFLauncher-database.db", (SQLiteDatabase.CursorFactory) null, 34);
        this.a = -1;
        this.b = -1;
        this.d = false;
        this.c = context;
        if (this.a == -1) {
            this.a = a("favorites", getWritableDatabase());
        }
        if (this.b == -1) {
            this.b = a("application", getWritableDatabase());
        }
    }

    public int a() {
        if (this.a < 0) {
            throw new RuntimeException("Error: max item id was not initialized");
        }
        this.a++;
        return this.a;
    }

    public int b() {
        if (this.b < 0) {
            throw new RuntimeException("Error: max item id was not initialized");
        }
        this.b++;
        return this.b;
    }

    private int a(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM " + str, null);
        int i = (rawQuery == null || !rawQuery.moveToNext()) ? -1 : (int) rawQuery.getLong(0);
        if (rawQuery != null) {
            rawQuery.close();
        }
        if (i == -1) {
            throw new RuntimeException("Error: could not query max item id");
        }
        return i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        b(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE quicklaunch (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into quicklaunch(child) values(?)");
        sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into dock(child) values(?)");
        sQLiteDatabase.execSQL("CREATE TABLE slidingdock (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into slidingdock(child) values(?)");
        sQLiteDatabase.execSQL("CREATE TABLE menu (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into menu(child) values(?)");
        com.tsf.shell.manager.action.h.a(sQLiteDatabase);
        this.d = true;
    }

    public void c() {
        if (this.d) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.a = 0;
            this.b = 0;
            com.tsf.shell.b.a.a.a(this, writableDatabase);
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
        sQLiteDatabase.execSQL("CREATE TABLE favorites (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,screen INTEGER,cellX TEXT,cellY TEXT,rotation TEXT,spanX TEXT,spanY TEXT,scale TEXT,itemType INTEGER,appWidgetId INTEGER NOT NULL DEFAULT -1,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,titleType INTEGER,config TEXT,packagename TEXT,classname TEXT,internal INTEGER,appWidgetProvider TEXT);");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        if (str == null || str.equals("")) {
            str = "?";
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dock");
        sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into dock(child) values('" + str + "')");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        if (str == null || str.equals("")) {
            str = "?";
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS slidingdock");
        sQLiteDatabase.execSQL("CREATE TABLE slidingdock (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into slidingdock(child) values('" + str + "')");
    }

    public static void c(SQLiteDatabase sQLiteDatabase, String str) {
        if (str == null || str.equals("")) {
            str = "?";
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS menu");
        sQLiteDatabase.execSQL("CREATE TABLE menu (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into menu(child) values('" + str + "')");
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str) {
        if (str == null || str.equals("")) {
            str = "?";
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS quicklaunch");
        sQLiteDatabase.execSQL("CREATE TABLE quicklaunch (_id INTEGER PRIMARY KEY,child TEXT);");
        sQLiteDatabase.execSQL("insert into quicklaunch(child) values('" + str + "')");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS application");
        sQLiteDatabase.execSQL("CREATE TABLE application (_id INTEGER PRIMARY KEY,mindex INTEGER,title TEXT,clickcnt INTEGER,ishide INTEGER,intent TEXT,container INTEGER,itemType INTEGER,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,titleType INTEGER,config TEXT,vercode INTEGER,vername TEXT);");
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        c.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        if (i < 30) {
            c(sQLiteDatabase);
            b(sQLiteDatabase);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS optionmenu");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS folders");
        }
        if (i < 32) {
            b(sQLiteDatabase, null);
            c(sQLiteDatabase, null);
        }
        if (i < 33) {
            try {
                Cursor query = sQLiteDatabase.query("configuration", null, null, null, null, null, null);
                query.moveToNext();
                str = query.getString(query.getColumnIndex("screenorder"));
                try {
                    query.close();
                } catch (Exception e) {
                }
            } catch (Exception e2) {
                str = "";
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS configuration");
            com.tsf.shell.manager.b.g.i(str);
        }
    }
}
