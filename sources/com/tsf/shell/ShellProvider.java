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
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p092c.p093a.C2229a;
import com.tsf.shell.utils.C4177m;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ShellProvider extends ContentProvider {

    /* renamed from: a */
    public static String f7174a;

    /* renamed from: c */
    private static ShellProvider f7175c;

    /* renamed from: b */
    private C2183a f7176b;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f7174a = getContext().getPackageName() + ".provider";
        C0853a.m10863a(getContext(), "ShellProvider");
        if (f7175c == null) {
            f7175c = this;
        }
        this.f7176b = new C2183a(getContext());
        return true;
    }

    /* renamed from: a */
    public static ShellProvider m6147a() {
        return f7175c;
    }

    /* renamed from: b */
    public int m6145b() {
        return this.f7176b.m6142a();
    }

    /* renamed from: c */
    public int m6144c() {
        return this.f7176b.m6138b();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        C2184b c2184b = new C2184b(uri, null, null);
        return TextUtils.isEmpty(c2184b.f7182b) ? "vnd.android.cursor.dir/" + c2184b.f7181a : "vnd.android.cursor.item/" + c2184b.f7181a;
    }

    /* renamed from: d */
    public void m6143d() {
        this.f7176b.m6135c();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (this) {
            C2184b c2184b = new C2184b(uri, str, strArr2);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(c2184b.f7181a);
            query = sQLiteQueryBuilder.query(this.f7176b.getWritableDatabase(), strArr, c2184b.f7182b, c2184b.f7183c, null, null, str2);
            query.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2 = null;
        synchronized (this) {
            long insert = this.f7176b.getWritableDatabase().insert(new C2184b(uri).f7181a, null, contentValues);
            if (insert > 0) {
                uri2 = ContentUris.withAppendedId(uri, insert);
                m6146a(uri2);
            }
        }
        return uri2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        synchronized (this) {
            C2184b c2184b = new C2184b(uri, str, strArr);
            delete = this.f7176b.getWritableDatabase().delete(c2184b.f7181a, c2184b.f7182b, c2184b.f7183c);
            if (delete > 0) {
                m6146a(uri);
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
                C2184b c2184b = new C2184b(uri, str, strArr);
                update = this.f7176b.getWritableDatabase().update(c2184b.f7181a, contentValues, c2184b.f7182b, c2184b.f7183c);
                if (update > 0) {
                    m6146a(uri);
                }
            } catch (Exception e) {
                int length = e.getStackTrace().length;
                String str2 = "";
                for (int i = 0; i < length; i++) {
                    str2 = str2 + stackTrace[i].toString() + "  '\\'";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("update database error", str2);
                C4177m.m667a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", hashMap);
                return 0;
            }
        }
        return update;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int i = 0;
        synchronized (this) {
            C2184b c2184b = new C2184b(uri);
            SQLiteDatabase writableDatabase = this.f7176b.getWritableDatabase();
            writableDatabase.beginTransaction();
            int length = contentValuesArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (writableDatabase.insert(c2184b.f7181a, null, contentValuesArr[i2]) >= 0) {
                        i2++;
                    } else {
                        writableDatabase.endTransaction();
                        break;
                    }
                } else {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    m6146a(uri);
                    i = contentValuesArr.length;
                    break;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m6146a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }

    /* renamed from: com.tsf.shell.ShellProvider$a */
    /* loaded from: classes.dex */
    public static class C2183a extends SQLiteOpenHelper {

        /* renamed from: a */
        private int f7177a;

        /* renamed from: b */
        private int f7178b;

        /* renamed from: c */
        private Context f7179c;

        /* renamed from: d */
        private boolean f7180d;

        C2183a(Context context) {
            super(context, "TSFLauncher-database.db", (SQLiteDatabase.CursorFactory) null, 34);
            this.f7177a = -1;
            this.f7178b = -1;
            this.f7180d = false;
            this.f7179c = context;
            if (this.f7177a == -1) {
                this.f7177a = m6139a("favorites", getWritableDatabase());
            }
            if (this.f7178b == -1) {
                this.f7178b = m6139a("application", getWritableDatabase());
            }
        }

        /* renamed from: a */
        public int m6142a() {
            if (this.f7177a < 0) {
                throw new RuntimeException("Error: max item id was not initialized");
            }
            this.f7177a++;
            return this.f7177a;
        }

        /* renamed from: b */
        public int m6138b() {
            if (this.f7178b < 0) {
                throw new RuntimeException("Error: max item id was not initialized");
            }
            this.f7178b++;
            return this.f7178b;
        }

        /* renamed from: a */
        private int m6139a(String str, SQLiteDatabase sQLiteDatabase) {
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
            m6141a(sQLiteDatabase);
            m6137b(sQLiteDatabase);
            sQLiteDatabase.execSQL("CREATE TABLE quicklaunch (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into quicklaunch(child) values(?)");
            sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into dock(child) values(?)");
            sQLiteDatabase.execSQL("CREATE TABLE slidingdock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into slidingdock(child) values(?)");
            sQLiteDatabase.execSQL("CREATE TABLE menu (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into menu(child) values(?)");
            C3398f.m2645a(sQLiteDatabase);
            this.f7180d = true;
        }

        /* renamed from: c */
        public void m6135c() {
            if (this.f7180d) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                this.f7177a = 0;
                this.f7178b = 0;
                C2229a.m6042a(this, writableDatabase);
            }
        }

        /* renamed from: a */
        public static void m6141a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favorites");
            sQLiteDatabase.execSQL("CREATE TABLE favorites (_id INTEGER PRIMARY KEY,title TEXT,intent TEXT,container INTEGER,screen INTEGER,cellX TEXT,cellY TEXT,rotation TEXT,spanX TEXT,spanY TEXT,scale TEXT,itemType INTEGER,appWidgetId INTEGER NOT NULL DEFAULT -1,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,titleType INTEGER,config TEXT,packagename TEXT,classname TEXT,internal INTEGER,appWidgetProvider TEXT);");
        }

        /* renamed from: a */
        public static void m6140a(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dock");
            sQLiteDatabase.execSQL("CREATE TABLE dock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into dock(child) values('" + str + "')");
        }

        /* renamed from: b */
        public static void m6136b(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS slidingdock");
            sQLiteDatabase.execSQL("CREATE TABLE slidingdock (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into slidingdock(child) values('" + str + "')");
        }

        /* renamed from: c */
        public static void m6133c(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS menu");
            sQLiteDatabase.execSQL("CREATE TABLE menu (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into menu(child) values('" + str + "')");
        }

        /* renamed from: d */
        public static void m6132d(SQLiteDatabase sQLiteDatabase, String str) {
            str = (str == null || str.equals("")) ? "?" : "?";
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS quicklaunch");
            sQLiteDatabase.execSQL("CREATE TABLE quicklaunch (_id INTEGER PRIMARY KEY,child TEXT);");
            sQLiteDatabase.execSQL("insert into quicklaunch(child) values('" + str + "')");
        }

        /* renamed from: b */
        private void m6137b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS application");
            sQLiteDatabase.execSQL("CREATE TABLE application (_id INTEGER PRIMARY KEY,mindex INTEGER,title TEXT,clickcnt INTEGER,ishide INTEGER,intent TEXT,container INTEGER,itemType INTEGER,iconType INTEGER,iconPackage TEXT,iconResource TEXT,icon BLOB,titleType INTEGER,config TEXT,vercode INTEGER,vername TEXT);");
        }

        /* renamed from: c */
        private void m6134c(SQLiteDatabase sQLiteDatabase) {
            C2225c.m6052a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            String str;
            if (i < 30) {
                m6134c(sQLiteDatabase);
                m6137b(sQLiteDatabase);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS optionmenu");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS folders");
            }
            if (i < 32) {
                m6136b(sQLiteDatabase, null);
                m6133c(sQLiteDatabase, null);
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
                C3430e.m2456i(str);
            }
        }
    }

    /* renamed from: com.tsf.shell.ShellProvider$b */
    /* loaded from: classes.dex */
    static class C2184b {

        /* renamed from: a */
        public final String f7181a;

        /* renamed from: b */
        public final String f7182b;

        /* renamed from: c */
        public final String[] f7183c;

        C2184b(Uri uri, String str, String[] strArr) {
            if (uri.getPathSegments().size() == 1) {
                this.f7181a = uri.getPathSegments().get(0);
                this.f7182b = str;
                this.f7183c = strArr;
            } else if (uri.getPathSegments().size() != 2) {
                throw new IllegalArgumentException("Invalid URI: " + uri);
            } else {
                if (!TextUtils.isEmpty(str)) {
                    throw new UnsupportedOperationException("WHERE clause not supported: " + uri);
                }
                this.f7181a = uri.getPathSegments().get(0);
                this.f7182b = "_id=" + ContentUris.parseId(uri);
                this.f7183c = null;
            }
        }

        C2184b(Uri uri) {
            if (uri.getPathSegments().size() == 1) {
                this.f7181a = uri.getPathSegments().get(0);
                this.f7182b = null;
                this.f7183c = null;
                return;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
    }
}
