package com.tsf.extend.theme;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class e {
    private static e a;
    private List<a> b = new ArrayList();
    private u c;

    /* loaded from: classes.dex */
    public interface a {
        void a(k kVar);

        void b(k kVar);
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (a == null) {
                a = new e();
            }
            eVar = a;
        }
        return eVar;
    }

    private e() {
    }

    private u b(Context context) {
        if (this.c == null) {
            this.c = new u(com.tsf.extend.h.b());
        }
        return this.c;
    }

    private void b() {
    }

    public boolean a(Context context, k kVar) {
        b();
        boolean z = b(context).getWritableDatabase().insert("favorite_theme", null, kVar.y()) >= 0;
        if (z) {
            synchronized (this.b) {
                for (a aVar : this.b) {
                    aVar.a(kVar);
                }
            }
        }
        return z;
    }

    public boolean b(Context context, k kVar) {
        if (kVar == null || kVar.g() == null) {
            return false;
        }
        String f = ((kVar instanceof b) && ((b) kVar).e()) ? ((b) kVar).f() : kVar.g();
        b();
        boolean z = b(context).getWritableDatabase().delete("favorite_theme", "package_name=?", new String[]{f}) > 0;
        if (z) {
            synchronized (this.b) {
                for (a aVar : this.b) {
                    aVar.b(kVar);
                }
            }
        }
        return z;
    }

    public List<k> a(Context context) {
        Cursor cursor;
        Cursor cursor2;
        b();
        try {
            cursor = b(context).getWritableDatabase().query("favorite_theme", null, null, null, null, null, "_id desc");
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        ArrayList arrayList = new ArrayList();
                        do {
                            arrayList.add(k.a(cursor));
                        } while (cursor.moveToNext());
                        if (cursor != null) {
                            cursor.close();
                            return arrayList;
                        }
                        return arrayList;
                    }
                } catch (Exception e) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e2) {
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return null;
    }

    public void a(a aVar) {
        synchronized (this.b) {
            if (!this.b.contains(aVar)) {
                this.b.add(aVar);
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.b) {
            this.b.remove(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.content.Context r12, com.tsf.extend.theme.k r13) {
        /*
            r11 = this;
            r8 = 1
            r10 = 0
            r9 = 0
            if (r13 != 0) goto L6
        L5:
            return r9
        L6:
            java.lang.String r1 = r13.g()
            boolean r0 = r13 instanceof com.tsf.extend.theme.b
            if (r0 == 0) goto L69
            r0 = r13
            com.tsf.extend.theme.b r0 = (com.tsf.extend.theme.b) r0
            boolean r0 = r0.e()
            if (r0 == 0) goto L69
            com.tsf.extend.theme.b r13 = (com.tsf.extend.theme.b) r13
            java.lang.String r0 = r13.f()
            r5 = r0
        L1e:
            r11.b()
            com.tsf.extend.theme.u r0 = r11.b(r12)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            java.lang.String r1 = "favorite_theme"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            r3 = 0
            java.lang.String r4 = "package_name"
            r2[r3] = r4     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            java.lang.String r3 = "package_name= ? "
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
            if (r1 == 0) goto L52
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            if (r0 <= 0) goto L52
            r0 = r8
        L4b:
            if (r1 == 0) goto L50
            r1.close()
        L50:
            r9 = r0
            goto L5
        L52:
            r0 = r9
            goto L4b
        L54:
            r0 = move-exception
            r0 = r10
        L56:
            if (r0 == 0) goto L5
            r0.close()
            goto L5
        L5c:
            r0 = move-exception
        L5d:
            if (r10 == 0) goto L62
            r10.close()
        L62:
            throw r0
        L63:
            r0 = move-exception
            r10 = r1
            goto L5d
        L66:
            r0 = move-exception
            r0 = r1
            goto L56
        L69:
            r5 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.e.c(android.content.Context, com.tsf.extend.theme.k):boolean");
    }
}
