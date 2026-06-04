package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
final class w implements View.OnClickListener {
    final /* synthetic */ PagerTabStrip a;

    w(PagerTabStrip pagerTabStrip) {
        this.a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.a(this.a.a.b() - 1);
    }
}
