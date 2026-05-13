package com.tsf.extend.theme;

import android.content.Context;
import android.database.Cursor;
import com.tsf.extend.C1547h;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.theme.e */
/* loaded from: classes.dex */
public class C1840e {

    /* renamed from: a */
    private static C1840e f5899a;

    /* renamed from: b */
    private List<InterfaceC1841a> f5900b = new ArrayList();

    /* renamed from: c */
    private C1893u f5901c;

    /* renamed from: com.tsf.extend.theme.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1841a {
        /* renamed from: a */
        void mo7351a(C1848k c1848k);

        /* renamed from: b */
        void mo7350b(C1848k c1848k);
    }

    /* renamed from: a */
    public static synchronized C1840e m7360a() {
        C1840e c1840e;
        synchronized (C1840e.class) {
            if (f5899a == null) {
                f5899a = new C1840e();
            }
            c1840e = f5899a;
        }
        return c1840e;
    }

    private C1840e() {
    }

    /* renamed from: b */
    private C1893u m7355b(Context context) {
        if (this.f5901c == null) {
            this.f5901c = new C1893u(C1547h.m8290b());
        }
        return this.f5901c;
    }

    /* renamed from: b */
    private void m7356b() {
    }

    /* renamed from: a */
    public boolean m7358a(Context context, C1848k c1848k) {
        m7356b();
        boolean z = m7355b(context).getWritableDatabase().insert("favorite_theme", null, c1848k.m7269y()) >= 0;
        if (z) {
            synchronized (this.f5900b) {
                for (InterfaceC1841a interfaceC1841a : this.f5900b) {
                    interfaceC1841a.mo7351a(c1848k);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m7354b(Context context, C1848k c1848k) {
        if (c1848k == null || c1848k.m7300g() == null) {
            return false;
        }
        String m7747f = ((c1848k instanceof C1703b) && ((C1703b) c1848k).m7748e()) ? ((C1703b) c1848k).m7747f() : c1848k.m7300g();
        m7356b();
        boolean z = m7355b(context).getWritableDatabase().delete("favorite_theme", "package_name=?", new String[]{m7747f}) > 0;
        if (z) {
            synchronized (this.f5900b) {
                for (InterfaceC1841a interfaceC1841a : this.f5900b) {
                    interfaceC1841a.mo7350b(c1848k);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public List<C1848k> m7359a(Context context) {
        Cursor cursor;
        Cursor cursor2;
        m7356b();
        try {
            cursor = m7355b(context).getWritableDatabase().query("favorite_theme", null, null, null, null, null, "_id desc");
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        ArrayList arrayList = new ArrayList();
                        do {
                            arrayList.add(C1848k.m7319a(cursor));
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

    /* renamed from: a */
    public void m7357a(InterfaceC1841a interfaceC1841a) {
        synchronized (this.f5900b) {
            if (!this.f5900b.contains(interfaceC1841a)) {
                this.f5900b.add(interfaceC1841a);
            }
        }
    }

    /* renamed from: b */
    public void m7353b(InterfaceC1841a interfaceC1841a) {
        synchronized (this.f5900b) {
            this.f5900b.remove(interfaceC1841a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7352c(android.content.Context r12, com.tsf.extend.theme.C1848k r13) {
        /*
            r11 = this;
            r8 = 1
            r10 = 0
            r9 = 0
            if (r13 != 0) goto L6
        L5:
            return r9
        L6:
            java.lang.String r1 = r13.m7300g()
            boolean r0 = r13 instanceof com.tsf.extend.theme.C1703b
            if (r0 == 0) goto L69
            r0 = r13
            com.tsf.extend.theme.b r0 = (com.tsf.extend.theme.C1703b) r0
            boolean r0 = r0.m7748e()
            if (r0 == 0) goto L69
            com.tsf.extend.theme.b r13 = (com.tsf.extend.theme.C1703b) r13
            java.lang.String r0 = r13.m7747f()
            r5 = r0
        L1e:
            r11.m7356b()
            com.tsf.extend.theme.u r0 = r11.m7355b(r12)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5c
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.C1840e.m7352c(android.content.Context, com.tsf.extend.theme.k):boolean");
    }
}
