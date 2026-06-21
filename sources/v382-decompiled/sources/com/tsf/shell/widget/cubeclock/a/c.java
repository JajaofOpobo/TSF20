package com.tsf.shell.widget.cubeclock.a;

/* loaded from: classes.dex */
class c implements Comparable {
    public float a = 1.0f;
    public float b = 1.0f;
    public int c = -1;
    public int d;
    final /* synthetic */ b e;

    public c(b bVar, int i) {
        this.e = bVar;
        this.d = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (this.b != cVar.b) {
            return cVar.b > this.b ? -1 : 1;
        }
        return 0;
    }
}
