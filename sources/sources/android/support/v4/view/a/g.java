package android.support.v4.view.a;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.a.h;
import android.support.v4.view.a.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {
    private static final a a;
    private final Object b;

    interface a {
        Object a(g gVar);
    }

    static class d implements a {
        d() {
        }

        @Override // android.support.v4.view.a.g.a
        public Object a(g gVar) {
            return null;
        }
    }

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
                    List<android.support.v4.view.a.b> listA = gVar.a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = listA.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(listA.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.v4.view.a.h.a
                public Object a(int i) {
                    android.support.v4.view.a.b bVarA = gVar.a(i);
                    if (bVarA == null) {
                        return null;
                    }
                    return bVarA.a();
                }
            });
        }
    }

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
                    List<android.support.v4.view.a.b> listA = gVar.a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = listA.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(listA.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.v4.view.a.i.a
                public Object a(int i) {
                    android.support.v4.view.a.b bVarA = gVar.a(i);
                    if (bVarA == null) {
                        return null;
                    }
                    return bVarA.a();
                }

                @Override // android.support.v4.view.a.i.a
                public Object b(int i) {
                    android.support.v4.view.a.b bVarB = gVar.b(i);
                    if (bVarB == null) {
                        return null;
                    }
                    return bVarB.a();
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
