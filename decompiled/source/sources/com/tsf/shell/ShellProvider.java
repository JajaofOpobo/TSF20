package com.tsf.shell;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.tsf.shell.utils.m;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ShellProvider extends ContentProvider {
    public static String a;
    private static ShellProvider c;
    private a b;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a = getContext().getPackageName() + ".provider";
        com.censivn.C3DEngine.a.a(getContext(), "ShellProvider");
        if (c == null) {
            c = this;
        }
        this.b = new a(getContext());
        return true;
    }

    public static ShellProvider a() {
        return c;
    }

    public int b() {
        return this.b.a();
    }

    public int c() {
        return this.b.b();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        b bVar = new b(uri, null, null);
        return TextUtils.isEmpty(bVar.b) ? "vnd.android.cursor.dir/" + bVar.a : "vnd.android.cursor.item/" + bVar.a;
    }

    public void d() {
        this.b.c();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (this) {
            b bVar = new b(uri, str, strArr2);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(bVar.a);
            query = sQLiteQueryBuilder.query(this.b.getWritableDatabase(), strArr, bVar.b, bVar.c, null, null, str2);
            query.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2 = null;
        synchronized (this) {
            long insert = this.b.getWritableDatabase().insert(new b(uri).a, null, contentValues);
            if (insert > 0) {
                uri2 = ContentUris.withAppendedId(uri, insert);
                a(uri2);
            }
        }
        return uri2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        synchronized (this) {
            b bVar = new b(uri, str, strArr);
            delete = this.b.getWritableDatabase().delete(bVar.a, bVar.b, bVar.c);
            if (delete > 0) {
                a(uri);
            }
        }
        return delete;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        StackTraceElement[] stackTrace;
        int update;
        synchronized (this) {
            try {
                b bVar = new b(uri, str, strArr);
                update = this.b.getWritableDatabase().update(bVar.a, contentValues, bVar.b, bVar.c);
                if (update > 0) {
                    a(uri);
                }
            } catch (Exception e) {
                int length = e.getStackTrace().length;
                String str2 = "";
                for (int i = 0; i < length; i++) {
                    str2 = str2 + stackTrace[i].toString() + "  '\\'";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("update database error", str2);
                m.a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", hashMap);
                return 0;
            }
        }
        return update;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int i = 0;
        synchronized (this) {
            b bVar = new b(uri);
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            writableDatabase.beginTransaction();
            int length = contentValuesArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (writableDatabase.insert(bVar.a, null, contentValuesArr[i2]) >= 0) {
                        i2++;
                    } else {
                        writableDatabase.endTransaction();
                        break;
                    }
                } else {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    a(uri);
                    i = contentValuesArr.length;
                    break;
                }
            }
        }
        return i;
    }

    private void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        private int a;
        private int b;
        private Context c;
        private boolean d;

        a(Context context) {
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
            com.tsf.shell.manager.action.f.a(sQLiteDatabase);
            this.d = true;
        }

        public void c() {
            if (this.d) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                this.a = 0;
                this.b = 0;
                com.tsf.shell.c.a.a.a(this, writableDatabase);
            }
        }

        public static void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
            sQLiteDatabase.execSQL("CREATE TABLE favorites (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,screen INTEGER,cellX TEXT,cellY TEXT,rotation TEXT,spanX TEXT,spanY TEXT,scale TEXT,itemType INTEGER,appWidgetId INTEGER NOT NULL DEFAULT -1,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,titleType INTEGER,config TEXT,packagename TEXT,classname TEXT,internal INTEGER,appWidgetProvider TEXT);");
        }

        public static void a(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dock");
            sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into dock(child) values('" + str + "')");
        }

        public static void b(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS slidingdock");
            sQLiteDatabase.execSQL("CREATE TABLE slidingdock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into slidingdock(child) values('" + str + "')");
        }

        public static void c(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS menu");
            sQLiteDatabase.execSQL("CREATE TABLE menu (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into menu(child) values('" + str + "')");
        }

        public static void d(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
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
                com.tsf.shell.manager.b.e.i(str);
            }
        }
    }

    /* loaded from: classes.dex */
    static class b {
        public final String a;
        public final String b;
        public final String[] c;

        b(Uri uri, String str, String[] strArr) {
            if (uri.getPathSegments().size() == 1) {
                this.a = uri.getPathSegments().get(0);
                this.b = str;
                this.c = strArr;
            } else if (uri.getPathSegments().size() != 2) {
                throw new IllegalArgumentException("Invalid URI: " + uri);
            } else {
                if (!TextUtils.isEmpty(str)) {
                    throw new UnsupportedOperationException("WHERE clause not supported: " + uri);
                }
                this.a = uri.getPathSegments().get(0);
                this.b = "_id=" + ContentUris.parseId(uri);
                this.c = null;
            }
        }

        b(Uri uri) {
            if (uri.getPathSegments().size() == 1) {
                this.a = uri.getPathSegments().get(0);
                this.b = null;
                this.c = null;
                return;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
    }
}
