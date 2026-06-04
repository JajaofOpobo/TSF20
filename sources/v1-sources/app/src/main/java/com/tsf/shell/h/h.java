package com.tsf.shell.h;

import android.view.View;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class h implements View.OnClickListener {
    final /* synthetic */ g a;

    h(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Home.d().a(this.a.a());
    }
}
