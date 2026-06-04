package com.tsf.shell.workspace3D.j;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.R;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.view.SettingLayout;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class a implements at, SettingLayout.onValueChange {
    private ViewGroup.LayoutParams b;
    private Runnable c;
    private Runnable d;
    private View e;
    private SettingLayout f;
    private SettingLayout g;
    private boolean i = false;
    private a a = this;
    private com.censivn.C3DEngine.b.v h = new b(this);

    public a() {
        this.h.a(new com.censivn.C3DEngine.b.l(this.h));
        c cVar = new c(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(cVar);
        this.c = new d(this);
        this.d = new e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.i) {
            this.i = false;
            aq.b(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(this.d);
        }
    }

    public final void a() {
        if (!this.i) {
            this.i = true;
            aq.a(this);
            this.h.az();
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(this.c);
        }
    }

    static /* synthetic */ void f(a aVar) {
        aVar.f.setTitle(com.censivn.C3DEngine.h.a.c(R.string.mn_background_transparency));
        aVar.f.setPrecent(com.tsf.shell.a.t.n() / 255.0f);
        aVar.g.setTitle(com.censivn.C3DEngine.h.a.c(R.string.mn_button_transparency));
        aVar.g.setPrecent(com.tsf.shell.a.t.o() / 255.0f);
        bf.m().a(aVar.e, aVar.b);
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.view.SettingLayout.onValueChange
    public final void onSeekChange(View view, float f) {
        if (view == this.f) {
            bf.s().c((int) (255.0f * f));
        } else {
            bf.s().a((int) (255.0f * f));
        }
    }

    @Override // com.tsf.shell.view.SettingLayout.onValueChange
    public final void onSeekChangeComplete(View view) {
        if (view == this.f) {
            bf.s().p();
        } else {
            bf.s().q();
        }
    }
}
