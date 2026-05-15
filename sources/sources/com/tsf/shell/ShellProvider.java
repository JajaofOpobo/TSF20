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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        Cursor cursorQuery;
        synchronized (this) {
            b bVar = new b(uri, str, strArr2);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(bVar.a);
            cursorQuery = sQLiteQueryBuilder.query(this.b.getWritableDatabase(), strArr, bVar.b, bVar.c, null, null, str2);
            cursorQuery.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uriWithAppendedId = null;
        synchronized (this) {
            long jInsert = this.b.getWritableDatabase().insert(new b(uri).a, null, contentValues);
            if (jInsert > 0) {
                uriWithAppendedId = ContentUris.withAppendedId(uri, jInsert);
                a(uriWithAppendedId);
            }
        }
        return uriWithAppendedId;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete;
        synchronized (this) {
            b bVar = new b(uri, str, strArr);
            iDelete = this.b.getWritableDatabase().delete(bVar.a, bVar.b, bVar.c);
            if (iDelete > 0) {
                a(uri);
            }
        }
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate;
        synchronized (this) {
            try {
                b bVar = new b(uri, str, strArr);
                iUpdate = this.b.getWritableDatabase().update(bVar.a, contentValues, bVar.b, bVar.c);
                if (iUpdate > 0) {
                    a(uri);
                }
            } catch (Exception e) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                String str2 = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    str2 = str2 + stackTraceElement.toString() + "  '\\'";
                }
                HashMap map = new HashMap();
                map.put("update database error", str2);
                m.a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", map);
                return 0;
            }
        }
        return iUpdate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r3.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r3.endTransaction();
        a(r11);
        r0 = r12.length;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int bulkInsert(android.net.Uri r11, android.content.ContentValues[] r12) {
        /*
            r10 = this;
            r0 = 0
            monitor-enter(r10)
            com.tsf.shell.ShellProvider$b r2 = new com.tsf.shell.ShellProvider$b     // Catch: java.lang.Throwable -> L37
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L37
            com.tsf.shell.ShellProvider$a r1 = r10.b     // Catch: java.lang.Throwable -> L37
            android.database.sqlite.SQLiteDatabase r3 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L37
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L37
            int r4 = r12.length     // Catch: java.lang.Throwable -> L3a
            r1 = r0
        L12:
            if (r1 >= r4) goto L2b
            java.lang.String r5 = r2.a     // Catch: java.lang.Throwable -> L3a
            r6 = 0
            r7 = r12[r1]     // Catch: java.lang.Throwable -> L3a
            long r6 = r3.insert(r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 >= 0) goto L28
            r3.endTransaction()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L37
        L27:
            return r0
        L28:
            int r1 = r1 + 1
            goto L12
        L2b:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3a
            r3.endTransaction()     // Catch: java.lang.Throwable -> L37
            r10.a(r11)     // Catch: java.lang.Throwable -> L37
            int r0 = r12.length     // Catch: java.lang.Throwable -> L37
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L37
            goto L27
        L37:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            r0 = move-exception
            r3.endTransaction()     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.ShellProvider.bulkInsert(android.net.Uri, android.content.ContentValues[]):int");
    }

    private void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }

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
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM " + str, null);
            int i = (cursorRawQuery == null || !cursorRawQuery.moveToNext()) ? -1 : (int) cursorRawQuery.getLong(0);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
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
            String string;
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
                    Cursor cursorQuery = sQLiteDatabase.query("configuration", null, null, null, null, null, null);
                    cursorQuery.moveToNext();
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("screenorder"));
                    try {
                        cursorQuery.close();
                    } catch (Exception e) {
                    }
                } catch (Exception e2) {
                    string = "";
                }
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS configuration");
                com.tsf.shell.manager.b.e.i(string);
            }
        }
    }

    static class b {
        public final String a;
        public final String b;
        public final String[] c;

        b(Uri uri, String str, String[] strArr) {
            if (uri.getPathSegments().size() == 1) {
                this.a = uri.getPathSegments().get(0);
                this.b = str;
                this.c = strArr;
            } else {
                if (uri.getPathSegments().size() != 2) {
                    throw new IllegalArgumentException("Invalid URI: " + uri);
                }
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
