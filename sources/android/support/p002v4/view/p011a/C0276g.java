package android.support.p002v4.view.p011a;

import android.os.Build;
import android.os.Bundle;
import android.support.p002v4.view.p011a.C0283h;
import android.support.p002v4.view.p011a.C0286i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: android.support.v4.view.a.g */
/* loaded from: classes.dex */
public class C0276g {

    /* renamed from: a */
    private static final InterfaceC0277a f735a;

    /* renamed from: b */
    private final Object f736b;

    /* renamed from: android.support.v4.view.a.g$a */
    /* loaded from: classes.dex */
    interface InterfaceC0277a {
        /* renamed from: a */
        Object mo12991a(C0276g c0276g);
    }

    /* renamed from: android.support.v4.view.a.g$d */
    /* loaded from: classes.dex */
    static class C0282d implements InterfaceC0277a {
        C0282d() {
        }

        @Override // android.support.p002v4.view.p011a.C0276g.InterfaceC0277a
        /* renamed from: a */
        public Object mo12991a(C0276g c0276g) {
            return null;
        }
    }

    /* renamed from: android.support.v4.view.a.g$b */
    /* loaded from: classes.dex */
    static class C0278b extends C0282d {
        C0278b() {
        }

        @Override // android.support.p002v4.view.p011a.C0276g.C0282d, android.support.p002v4.view.p011a.C0276g.InterfaceC0277a
        /* renamed from: a */
        public Object mo12991a(final C0276g c0276g) {
            return C0283h.m12990a(new C0283h.InterfaceC0285a() { // from class: android.support.v4.view.a.g.b.1
                @Override // android.support.p002v4.view.p011a.C0283h.InterfaceC0285a
                /* renamed from: a */
                public boolean mo12988a(int i, int i2, Bundle bundle) {
                    return c0276g.m12994a(i, i2, bundle);
                }

                @Override // android.support.p002v4.view.p011a.C0283h.InterfaceC0285a
                /* renamed from: a */
                public List<Object> mo12987a(String str, int i) {
                    List<C0261b> m12993a = c0276g.m12993a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = m12993a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(m12993a.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.p002v4.view.p011a.C0283h.InterfaceC0285a
                /* renamed from: a */
                public Object mo12989a(int i) {
                    C0261b m12995a = c0276g.m12995a(i);
                    if (m12995a == null) {
                        return null;
                    }
                    return m12995a.a();
                }
            });
        }
    }

    /* renamed from: android.support.v4.view.a.g$c */
    /* loaded from: classes.dex */
    static class C0280c extends C0282d {
        C0280c() {
        }

        @Override // android.support.p002v4.view.p011a.C0276g.C0282d, android.support.p002v4.view.p011a.C0276g.InterfaceC0277a
        /* renamed from: a */
        public Object mo12991a(final C0276g c0276g) {
            return C0286i.m12986a(new C0286i.InterfaceC0288a() { // from class: android.support.v4.view.a.g.c.1
                @Override // android.support.p002v4.view.p011a.C0286i.InterfaceC0288a
                /* renamed from: a */
                public boolean mo12984a(int i, int i2, Bundle bundle) {
                    return c0276g.m12994a(i, i2, bundle);
                }

                @Override // android.support.p002v4.view.p011a.C0286i.InterfaceC0288a
                /* renamed from: a */
                public List<Object> mo12983a(String str, int i) {
                    List<C0261b> m12993a = c0276g.m12993a(str, i);
                    ArrayList arrayList = new ArrayList();
                    int size = m12993a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(m12993a.get(i2).a());
                    }
                    return arrayList;
                }

                @Override // android.support.p002v4.view.p011a.C0286i.InterfaceC0288a
                /* renamed from: a */
                public Object mo12985a(int i) {
                    C0261b m12995a = c0276g.m12995a(i);
                    if (m12995a == null) {
                        return null;
                    }
                    return m12995a.a();
                }

                @Override // android.support.p002v4.view.p011a.C0286i.InterfaceC0288a
                /* renamed from: b */
                public Object mo12982b(int i) {
                    C0261b m12992b = c0276g.m12992b(i);
                    if (m12992b == null) {
                        return null;
                    }
                    return m12992b.a();
                }
            });
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f735a = new C0280c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f735a = new C0278b();
        } else {
            f735a = new C0282d();
        }
    }

    public C0276g() {
        this.f736b = f735a.mo12991a(this);
    }

    public C0276g(Object obj) {
        this.f736b = obj;
    }

    /* renamed from: a */
    public Object m12996a() {
        return this.f736b;
    }

    /* renamed from: a */
    public C0261b m12995a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean m12994a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: a */
    public List<C0261b> m12993a(String str, int i) {
        return null;
    }

    /* renamed from: b */
    public C0261b m12992b(int i) {
        return null;
    }
}
