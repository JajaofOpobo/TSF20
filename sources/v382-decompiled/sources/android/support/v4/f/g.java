package android.support.v4.f;

import java.util.Iterator;

/* loaded from: classes.dex */
final class g implements Iterator {
    final int a;
    int b;
    int c;
    boolean d = false;
    final /* synthetic */ f e;

    g(f fVar, int i) {
        this.e = fVar;
        this.a = i;
        this.b = fVar.a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object a = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.c--;
        this.b--;
        this.d = false;
        this.e.a(this.c);
    }
}
