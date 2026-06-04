package com.tsf.shell.h;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.R;
import com.tsf.shell.au;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class m extends FrameLayout {
    private r a;
    private boolean b;
    private MotionEvent c;
    private com.tsf.shell.workspace3D.k.a d;
    private com.tsf.shell.workspace3D.a.d e;

    public m(Context context) {
        super(context);
        this.b = false;
        com.tsf.shell.g.c.a();
    }

    public final void a(r rVar) {
        this.a = rVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.c = MotionEvent.obtain(motionEvent);
                break;
            case 1:
            case 3:
                com.censivn.C3DEngine.a.a().c(new n(this, MotionEvent.obtain(motionEvent)));
                break;
            case 2:
                b(motionEvent);
                break;
        }
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                com.censivn.C3DEngine.a.a().c(new o(this, MotionEvent.obtain(motionEvent)));
                break;
            case 2:
                b(motionEvent);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchUnhandledMove(View view, int i) {
        return this.a != null && this.a.dispatchUnhandledMove(view, i);
    }

    private void b(MotionEvent motionEvent) {
        if (this.b && this.e != null) {
            this.e.a(this.c, motionEvent);
        }
    }

    public final void a(k kVar) {
        com.tsf.shell.workspace3D.k.a a;
        if (!this.b && kVar.a != null && kVar.a.isInTouchMode() && this.a.a() != null && (a = bf.p().a(kVar.a)) != null) {
            com.censivn.C3DEngine.b.m.a(true);
            bf.j().b(a.bc());
            bf.j();
            com.tsf.shell.workspace3D.h.l.B();
            this.b = true;
            this.d = a;
            this.e = a.aH();
            this.e.e(this.c);
            this.e.c(this.c);
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (this.b) {
            com.censivn.C3DEngine.b.m.a(false);
            l lVar = (l) this.d.C.getLayoutParams();
            int n_ = (int) ((this.d.L().x - (this.d.A.n_() / 2.0f)) + com.censivn.C3DEngine.a.n);
            int o_ = (int) (((-this.d.L().y) + com.censivn.C3DEngine.a.o) - (this.d.A.o_() / 2.0f));
            int[] iArr = {n_, o_, lVar.d, lVar.e};
            if (lVar.d + n_ > com.censivn.C3DEngine.a.l) {
                iArr[0] = com.censivn.C3DEngine.a.l - lVar.d;
            } else if (n_ < 0) {
                iArr[0] = 0;
            }
            if (lVar.e + o_ > com.censivn.C3DEngine.a.m) {
                iArr[1] = com.censivn.C3DEngine.a.m - lVar.e;
            } else if (o_ < com.censivn.C3DEngine.a.i) {
                iArr[1] = com.censivn.C3DEngine.a.i;
            }
            LauncherItem3DInfo be = this.d.be();
            if (com.censivn.C3DEngine.a.q) {
                int i = iArr[0];
                lVar.a = i;
                be.cellX = i;
                int i2 = iArr[1];
                lVar.b = i2;
                be.cellY = i2;
            } else {
                int i3 = iArr[0];
                lVar.a = i3;
                be.cellXH = i3;
                int i4 = iArr[1];
                lVar.b = i4;
                be.cellYH = i4;
            }
            com.tsf.shell.workspace3D.h.a k = bf.j().k();
            p pVar = new p(this, this.d, k);
            com.censivn.C3DEngine.a.a();
            w.a(pVar);
            int i5 = be.height * be.width;
            if (k.q() != null && !k.q().a(i5, this.d.C)) {
                bf.j().t();
                au.a(R.string.out_of_space);
            }
            bf.j().C();
            this.b = false;
            this.e.d(motionEvent);
            this.e.f(motionEvent);
            this.e = null;
            this.d = null;
        }
    }
}
