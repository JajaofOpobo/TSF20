package android.support.v4.f;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class j implements Iterator, Map.Entry {
    int a;
    final /* synthetic */ f d;
    boolean c = false;
    int b = -1;

    j(f fVar) {
        this.d = fVar;
        this.a = fVar.a() - 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.a(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, 0);
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, 1);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.a(this.b, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b.a(entry.getKey(), this.d.a(this.b, 0)) && b.a(entry.getValue(), this.d.a(this.b, 1));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object a = this.d.a(this.b, 0);
        Object a2 = this.d.a(this.b, 1);
        return (a2 != null ? a2.hashCode() : 0) ^ (a == null ? 0 : a.hashCode());
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
