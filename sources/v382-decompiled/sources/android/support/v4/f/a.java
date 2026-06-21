package android.support.v4.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends l implements Map {
    f a;

    private f b() {
        if (this.a == null) {
            this.a = new f() { // from class: android.support.v4.f.a.1
                @Override // android.support.v4.f.f
                protected int a() {
                    return a.this.h;
                }

                @Override // android.support.v4.f.f
                protected Object a(int i, int i2) {
                    return a.this.g[(i << 1) + i2];
                }

                @Override // android.support.v4.f.f
                protected int a(Object obj) {
                    return a.this.a(obj);
                }

                @Override // android.support.v4.f.f
                protected int b(Object obj) {
                    return a.this.b(obj);
                }

                @Override // android.support.v4.f.f
                protected Map b() {
                    return a.this;
                }

                @Override // android.support.v4.f.f
                protected void a(Object obj, Object obj2) {
                    a.this.put(obj, obj2);
                }

                @Override // android.support.v4.f.f
                protected Object a(int i, Object obj) {
                    return a.this.a(i, obj);
                }

                @Override // android.support.v4.f.f
                protected void a(int i) {
                    a.this.d(i);
                }

                @Override // android.support.v4.f.f
                protected void c() {
                    a.this.clear();
                }
            };
        }
        return this.a;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a(this.h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(Collection collection) {
        return f.c(this, collection);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public Collection values() {
        return b().f();
    }
}
