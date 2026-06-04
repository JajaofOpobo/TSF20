package android.support.v4.view;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class y extends DataSetObserver implements ba, bb {
    final /* synthetic */ PagerTitleStrip a;
    private int b;

    private y(PagerTitleStrip pagerTitleStrip) {
        this.a = pagerTitleStrip;
    }

    /* synthetic */ y(PagerTitleStrip pagerTitleStrip, byte b) {
        this(pagerTitleStrip);
    }

    @Override // android.support.v4.view.bb
    public final void a(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.a.a(i, f, false);
    }

    @Override // android.support.v4.view.bb
    public final void a_(int i) {
        float f;
        if (this.b == 0) {
            this.a.a(this.a.a.b(), this.a.a.a());
            f = this.a.g;
            this.a.a(this.a.a.b(), f >= 0.0f ? this.a.g : 0.0f, true);
        }
    }

    @Override // android.support.v4.view.bb
    public final void b(int i) {
        this.b = i;
    }

    @Override // android.support.v4.view.ba
    public final void a(v vVar, v vVar2) {
        this.a.a(vVar, vVar2);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        float f;
        this.a.a(this.a.a.b(), this.a.a.a());
        f = this.a.g;
        this.a.a(this.a.a.b(), f >= 0.0f ? this.a.g : 0.0f, true);
    }
}
