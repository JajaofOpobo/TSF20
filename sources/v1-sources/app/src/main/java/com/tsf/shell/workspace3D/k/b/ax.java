package com.tsf.shell.workspace3D.k.b;

import android.view.MotionEvent;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ax extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ au a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(au auVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = auVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (a.a) {
            bf.l().j();
            a.a(false);
            this.a.j();
            return;
        }
        com.tsf.shell.au.a(R.string.notic_widget_animation_enable, R.string.public_action_ok, new ay(this), null);
    }
}
