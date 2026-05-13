package android.support.v4.view.a;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.a.h;
import android.support.v4.view.a.i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g {
    private static final a a;
    private final Object b;

    /* loaded from: classes.dex */
    interface a {
        Object a(g gVar);
    }

    /* loaded from: classes.dex */
    static class d implements a {
        d() {
        }

        @Override // android.support.v4.view.a.g.a
        public Object a(g gVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class b extends d {
        b() {
        }

        @Override // android.support.v4.view.a.g.d, android.support.v4.view.a.g.a
        public Object a(final g gVar) {
            return h.a(new h.a() { // from class: android.support.v4.view.a.g.b.1
                @Override // android.support.v4.view.a.h.a
                public boolean a(int i, int i2, Bundle bundle) {
                    return gVar.a(i, i2, bundle);
                }

                @Override // android.support.v4.view.a.h.a
                public List<Object> a(String str, int i) {
                    List<android.support.v4.view.a.b> a = gVar.a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.v4.view.a.h.a
                public Object a(int i) {
                    android.support.v4.view.a.b a = gVar.a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.a();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    static class c extends d {
        c() {
        }

        @Override // android.support.v4.view.a.g.d, android.support.v4.view.a.g.a
        public Object a(final g gVar) {
            return i.a(new i.a() { // from class: android.support.v4.view.a.g.c.1
                @Override // android.support.v4.view.a.i.a
                public boolean a(int i, int i2, Bundle bundle) {
                    return gVar.a(i, i2, bundle);
                }

                @Override // android.support.v4.view.a.i.a
                public List<Object> a(String str, int i) {
                    List<android.support.v4.view.a.b> a = gVar.a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.v4.view.a.i.a
                public Object a(int i) {
                    android.support.v4.view.a.b a = gVar.a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.a();
                }

                @Override // android.support.v4.view.a.i.a
                public Object b(int i) {
                    android.support.v4.view.a.b b = gVar.b(i);
                    if (b == null) {
                        return null;
                    }
                    return b.a();
                }
            });
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            a = new b();
        } else {
            a = new d();
        }
    }

    public g() {
        this.b = a.a(this);
    }

    public g(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public android.support.v4.view.a.b a(int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public List<android.support.v4.view.a.b> a(String str, int i) {
        return null;
    }

    public android.support.v4.view.a.b b(int i) {
        return null;
    }
}
