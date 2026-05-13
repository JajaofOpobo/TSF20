package com.tsf.shell.e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.e.d;
import com.tsf.shell.utils.g;
/* loaded from: classes.dex */
public class e extends FrameLayout {
    private f a;
    private boolean b;
    private MotionEvent c;
    private com.tsf.shell.f.i.b.b.a d;
    private com.tsf.shell.f.i.a.c e;

    public e(Context context) {
        super(context);
        this.b = false;
        g.a(this);
    }

    public void setWorkspace(f fVar) {
        this.a = fVar;
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
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(obtain);
                    }
                });
                break;
            case 2:
                b(motionEvent);
                break;
        }
        return this.b;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(obtain);
                    }
                });
                break;
            case 2:
                b(motionEvent);
                break;
        }
        return true;
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

    public void a(d.a aVar) {
        com.tsf.shell.f.i.b.b.a a;
        if (!this.b && aVar.a != null && aVar.a.isInTouchMode() && this.a.getCurrentScreenLayout() != null && (a = com.tsf.shell.manager.a.l.a(aVar.a)) != null) {
            com.censivn.C3DEngine.a.d.b(true);
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
            com.censivn.C3DEngine.a.d.b(false);
            d.b bVar = (d.b) this.d.g.getLayoutParams();
            if (com.tsf.shell.manager.a.h.d.b()) {
                float[] a = com.tsf.shell.manager.a.h.d.a();
                b = (int) ((a[0] - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                c = (int) (((-a[1]) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            } else {
                b = (int) ((this.d.position().x - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                c = (int) (((-this.d.position().y) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            }
            int[] iArr = {b, c, bVar.d, bVar.e};
            if (bVar.d + b > com.censivn.C3DEngine.b.b.a.x) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.x - bVar.d;
            } else if (b < com.censivn.C3DEngine.b.b.a.v) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.v;
            }
            if (bVar.e + c > com.censivn.C3DEngine.b.b.a.y) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.y - bVar.e;
            } else if (c < com.censivn.C3DEngine.b.b.a.w) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.w;
            }
            ItemInfo K = this.d.K();
            if (com.censivn.C3DEngine.b.b.a.O) {
                int i = iArr[0];
                bVar.a = i;
                K.cellX = i;
                int i2 = iArr[1];
                bVar.b = i2;
                K.cellY = i2;
            } else {
                int i3 = iArr[0];
                bVar.a = i3;
                K.cellXH = i3;
                int i4 = iArr[1];
                bVar.b = i4;
                K.cellYH = i4;
            }
            final com.tsf.shell.f.f.g n = com.tsf.shell.manager.a.h.n();
            final com.tsf.shell.f.i.b.b.a aVar = this.d;
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.3
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
                com.tsf.shell.e.a(b.i.out_of_space);
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
