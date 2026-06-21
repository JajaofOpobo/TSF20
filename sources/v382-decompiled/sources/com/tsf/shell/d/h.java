package com.tsf.shell.d;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;
import com.tsf.shell.k;

/* loaded from: classes.dex */
public class h extends FrameLayout {
    private i a;
    private boolean b;
    private MotionEvent c;
    private com.tsf.shell.e.i.b.b.a d;
    private com.tsf.shell.e.i.a.c e;

    public h(Context context) {
        super(context);
        this.b = false;
        com.tsf.shell.utils.g.a(this);
    }

    public void setWorkspace(i iVar) {
        this.a = iVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.c = MotionEvent.obtain(motionEvent);
                break;
            case 1:
            case 3:
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.d.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        h.this.a(obtain);
                    }
                });
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.d.h.2
                    @Override // java.lang.Runnable
                    public void run() {
                        h.this.a(obtain);
                    }
                });
                break;
            case 2:
                b(motionEvent);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i) {
        return this.a != null && this.a.dispatchUnhandledMove(view, i);
    }

    private void b(MotionEvent motionEvent) {
        if (this.b && this.e != null) {
            this.e.a(this.c, motionEvent);
        }
    }

    public void a(f fVar) {
        com.tsf.shell.e.i.b.b.a a;
        if (!this.b && fVar.a != null && fVar.a.isInTouchMode() && this.a.getCurrentScreenLayout() != null && (a = com.tsf.shell.manager.a.l.a(fVar.a)) != null) {
            com.censivn.C3DEngine.a.h.b(true);
            com.tsf.shell.manager.a.h.b(a.z() != null ? a.z() : com.tsf.shell.manager.a.h.o());
            com.tsf.shell.manager.a.h.H();
            this.b = true;
            this.d = a;
            this.e = a.getMouseEventListener();
            this.e.e(this.c);
            this.e.c(this.c);
        }
    }

    public void a(MotionEvent motionEvent) {
        int b;
        int c;
        if (this.b) {
            com.censivn.C3DEngine.a.h.b(false);
            g gVar = (g) this.d.g.getLayoutParams();
            if (com.tsf.shell.manager.a.h.d.b()) {
                float[] a = com.tsf.shell.manager.a.h.d.a();
                b = (int) ((a[0] - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                c = (int) (((-a[1]) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            } else {
                b = (int) ((this.d.position().x - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                c = (int) (((-this.d.position().y) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            }
            int[] iArr = {b, c, gVar.d, gVar.e};
            if (gVar.d + b > com.censivn.C3DEngine.b.b.a.x) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.x - gVar.d;
            } else if (b < com.censivn.C3DEngine.b.b.a.v) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.v;
            }
            if (gVar.e + c > com.censivn.C3DEngine.b.b.a.y) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.y - gVar.e;
            } else if (c < com.censivn.C3DEngine.b.b.a.w) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.w;
            }
            ItemInfo K = this.d.K();
            if (com.censivn.C3DEngine.b.b.a.O) {
                int i = iArr[0];
                gVar.a = i;
                K.cellX = i;
                int i2 = iArr[1];
                gVar.b = i2;
                K.cellY = i2;
            } else {
                int i3 = iArr[0];
                gVar.a = i3;
                K.cellXH = i3;
                int i4 = iArr[1];
                gVar.b = i4;
                K.cellYH = i4;
            }
            final com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
            final com.tsf.shell.e.i.b.b.a aVar = this.d;
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.d.h.3
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null && aVar.g != null) {
                        aVar.g.requestLayout();
                        if (!n.ad()) {
                            aVar.g.b();
                        }
                    }
                }
            });
            int i5 = K.height * K.width;
            if (n.s() != null && !n.s().a(i5, this.d.g)) {
                com.tsf.shell.manager.a.h.y();
                k.a(R.string.out_of_space);
            }
            com.tsf.shell.manager.a.h.I();
            this.b = false;
            this.e.d(motionEvent);
            this.e.f(motionEvent);
            this.e = null;
            this.d = null;
        }
    }
}
