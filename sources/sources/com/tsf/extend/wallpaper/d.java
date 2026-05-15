package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static d a = new d();
    private SQLiteOpenHelper b = a.a(com.tsf.extend.h.b());

    private d() {
        try {
            this.b.setWriteAheadLoggingEnabled(true);
        } catch (Throwable th) {
        }
        c();
    }

    public void a(Context context) {
    }

    public static d a() {
        return a;
    }

    private static class a extends SQLiteOpenHelper {
        private static a a = null;

        public static synchronized a a(Context context) {
            if (a == null) {
                a = new a(context);
            }
            return a;
        }

        public a(Context context) {
            super(context, "c.db", (SQLiteDatabase.CursorFactory) null, 22);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            com.tsf.extend.a.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.tsf.extend.a.a(sQLiteDatabase, i, i2);
            onCreate(sQLiteDatabase);
        }
    }

    public int a(Map<String, com.tsf.extend.a> map) {
        SQLiteDatabase sQLiteDatabaseD;
        int i = 0;
        System.out.println("----------------------- SAVE LOCAL : " + map);
        if (map != null && (sQLiteDatabaseD = d()) != null) {
            try {
                for (com.tsf.extend.a aVar : map.values()) {
                    ContentValues contentValuesB = aVar.b();
                    if (sQLiteDatabaseD.update("app_category", contentValuesB, "pkg_name=?", new String[]{aVar.c()}) > 0) {
                        i++;
                    } else {
                        i = sQLiteDatabaseD.insert("app_category", null, contentValuesB) > 0 ? i + 1 : i;
                    }
                }
            } catch (Exception e) {
            }
        }
        return i;
    }

    private SQLiteDatabase d() {
        return this.b.getWritableDatabase();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, com.tsf.extend.a> b() throws java.lang.Throwable {
        /*
            r10 = this;
            r9 = 0
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r10.d()     // Catch: java.lang.Exception -> Le
        La:
            if (r0 != 0) goto L14
            r0 = r8
        Ld:
            return r0
        Le:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r9
            goto La
        L14:
            java.lang.String r1 = "app_category"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L56
            if (r1 == 0) goto L44
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            if (r0 <= 0) goto L44
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            if (r0 == 0) goto L44
        L2e:
            com.tsf.extend.a r0 = new com.tsf.extend.a     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.tsf.extend.a r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r2 = r0.c()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r8.put(r2, r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            if (r0 != 0) goto L2e
        L44:
            if (r1 == 0) goto L49
            r1.close()
        L49:
            r0 = r8
            goto Ld
        L4b:
            r0 = move-exception
            r1 = r9
        L4d:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L49
            r1.close()
            goto L49
        L56:
            r0 = move-exception
            r1 = r9
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            throw r0
        L5e:
            r0 = move-exception
            goto L58
        L60:
            r0 = move-exception
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.d.b():java.util.Map");
    }

    public boolean c() {
        return true;
    }
}
