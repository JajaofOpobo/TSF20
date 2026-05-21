package com.tsf.shell.e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.e.d;
import com.tsf.shell.utils.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
                final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(motionEventObtain);
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
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
            default:
                return true;
            case 1:
            case 3:
                final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(motionEventObtain);
                    }
                });
                return true;
            case 2:
                b(motionEvent);
                return true;
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

    public void a(d.a aVar) {
        com.tsf.shell.f.i.b.b.a aVarA;
        if (!this.b && aVar.a != null && aVar.a.isInTouchMode() && this.a.getCurrentScreenLayout() != null && (aVarA = com.tsf.shell.manager.a.l.a(aVar.a)) != null) {
            com.censivn.C3DEngine.a.d.b(true);
            com.tsf.shell.manager.a.h.b(aVarA.z() != null ? aVarA.z() : com.tsf.shell.manager.a.h.o());
            com.tsf.shell.manager.a.h.H();
            this.b = true;
            this.d = aVarA;
            this.e = aVarA.getMouseEventListener();
            this.e.e(this.c);
            this.e.c(this.c);
        }
    }

    public void a(MotionEvent motionEvent) {
        int iB;
        int iC;
        if (this.b) {
            com.censivn.C3DEngine.a.d.b(false);
            d.b bVar = (d.b) this.d.g.getLayoutParams();
            if (com.tsf.shell.manager.a.h.d.b()) {
                float[] fArrA = com.tsf.shell.manager.a.h.d.a();
                iB = (int) ((fArrA[0] - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                iC = (int) (((-fArrA[1]) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            } else {
                iB = (int) ((this.d.position().x - (this.d.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.a.H);
                iC = (int) (((-this.d.position().y) + com.censivn.C3DEngine.b.b.a.I) - (this.d.b.c() / 2.0f));
            }
            int[] iArr = {iB, iC, bVar.d, bVar.e};
            if (bVar.d + iB > com.censivn.C3DEngine.b.b.a.x) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.x - bVar.d;
            } else if (iB < com.censivn.C3DEngine.b.b.a.v) {
                iArr[0] = com.censivn.C3DEngine.b.b.a.v;
            }
            if (bVar.e + iC > com.censivn.C3DEngine.b.b.a.y) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.y - bVar.e;
            } else if (iC < com.censivn.C3DEngine.b.b.a.w) {
                iArr[1] = com.censivn.C3DEngine.b.b.a.w;
            }
            ItemInfo itemInfoK = this.d.K();
            if (com.censivn.C3DEngine.b.b.a.O) {
                int i = iArr[0];
                bVar.a = i;
                itemInfoK.cellX = i;
                int i2 = iArr[1];
                bVar.b = i2;
                itemInfoK.cellY = i2;
            } else {
                int i3 = iArr[0];
                bVar.a = i3;
                itemInfoK.cellXH = i3;
                int i4 = iArr[1];
                bVar.b = i4;
                itemInfoK.cellYH = i4;
            }
            final com.tsf.shell.f.f.g gVarN = com.tsf.shell.manager.a.h.n();
            final com.tsf.shell.f.i.b.b.a aVar = this.d;
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.3
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null && aVar.g != null) {
                        aVar.g.requestLayout();
                        if (!gVarN.ad()) {
                            aVar.g.b();
                        }
                    }
                }
            });
            int i5 = itemInfoK.height * itemInfoK.width;
            if (gVarN.s() != null && !gVarN.s().a(i5, this.d.g)) {
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
