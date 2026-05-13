package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.extend.C1318a;
import com.tsf.extend.C1547h;
import java.util.Map;
/* renamed from: com.tsf.extend.wallpaper.d */
/* loaded from: classes.dex */
public class C2064d {

    /* renamed from: a */
    private static C2064d f6736a = new C2064d();

    /* renamed from: b */
    private SQLiteOpenHelper f6737b = C2065a.m6537a(C1547h.m8290b());

    private C2064d() {
        try {
            this.f6737b.setWriteAheadLoggingEnabled(true);
        } catch (Throwable th) {
        }
        m6539c();
    }

    /* renamed from: a */
    public void m6542a(Context context) {
    }

    /* renamed from: a */
    public static C2064d m6543a() {
        return f6736a;
    }

    /* renamed from: com.tsf.extend.wallpaper.d$a */
    /* loaded from: classes.dex */
    private static class C2065a extends SQLiteOpenHelper {

        /* renamed from: a */
        private static C2065a f6738a = null;

        /* renamed from: a */
        public static synchronized C2065a m6537a(Context context) {
            C2065a c2065a;
            synchronized (C2065a.class) {
                if (f6738a == null) {
                    f6738a = new C2065a(context);
                }
                c2065a = f6738a;
            }
            return c2065a;
        }

        public C2065a(Context context) {
            super(context, "c.db", (SQLiteDatabase.CursorFactory) null, 22);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C1318a.m9035a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C1318a.m9034a(sQLiteDatabase, i, i2);
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public int m6541a(Map<String, C1318a> map) {
        SQLiteDatabase m6538d;
        int i = 0;
        System.out.println("----------------------- SAVE LOCAL : " + map);
        if (map != null && (m6538d = m6538d()) != null) {
            try {
                for (C1318a c1318a : map.values()) {
                    ContentValues m9032b = c1318a.m9032b();
                    if (m6538d.update("app_category", m9032b, "pkg_name=?", new String[]{c1318a.m9029c()}) > 0) {
                        i++;
                    } else {
                        i = m6538d.insert("app_category", null, m9032b) > 0 ? i + 1 : i;
                    }
                }
            } catch (Exception e) {
            }
        }
        return i;
    }

    /* renamed from: d */
    private SQLiteDatabase m6538d() {
        return this.f6737b.getWritableDatabase();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, com.tsf.extend.C1318a> m6540b() {
        /*
            r10 = this;
            r9 = 0
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r10.m6538d()     // Catch: java.lang.Exception -> Le
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
            com.tsf.extend.a r0 = r0.m9038a(r1)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r2 = r0.m9029c()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.C2064d.m6540b():java.util.Map");
    }

    /* renamed from: c */
    public boolean m6539c() {
        return true;
    }
}
