package com.tsf.shell.manager.f;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.i;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.p;
import com.tsf.shell.d.h;

/* loaded from: classes.dex */
public class e implements k {
    private com.censivn.C3DEngine.a.k a;
    private l b;
    private l c;
    private VObject3dContainer d;
    private p e;
    private com.tsf.shell.e.b.a f;
    private i g;
    private h h;
    private FrameLayout i;
    private l j;

    public e(h hVar) {
        com.tsf.shell.manager.a.b.a(this);
        this.h = hVar;
        this.i = new FrameLayout(this.h.getContext());
        this.g = new i() { // from class: com.tsf.shell.manager.f.e.1
            @Override // com.censivn.C3DEngine.b.c.i
            public void a() {
                if (e.this.f != null) {
                    e.this.f.a(4, null);
                }
            }
        };
    }

    public l a() {
        return this.c;
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.i.getParent() == null) {
            this.h.addView(this.i);
        }
        this.i.addView(view, layoutParams);
    }

    public void a(View view) {
        this.i.removeView(view);
        if (this.i.getChildCount() == 0) {
            this.h.removeView(this.i);
        }
    }

    public void a(com.censivn.C3DEngine.a.k kVar) {
        this.a = kVar;
        this.b = new l();
        this.j = new l() { // from class: com.tsf.shell.manager.f.e.2
            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public boolean removeChild(j jVar) {
                boolean removeChild = super.removeChild(jVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChild;
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public j removeChildAt(int i) {
                j removeChildAt = super.removeChildAt(i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChildAt;
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public void addChild(j jVar) {
                if (parent() == null) {
                    e.this.a.addChild(this);
                }
                super.addChild(jVar);
            }

            @Override // com.censivn.C3DEngine.b.f.l
            public void addChildAt(j jVar, int i) {
                if (parent() == null) {
                    e.this.a.addChild(this);
                }
                super.addChildAt(jVar, i);
            }
        };
        this.d = new VObject3dContainer() { // from class: com.tsf.shell.manager.f.e.3
            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildStart(VObject3d vObject3d) {
            }

            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildEnd(VObject3d vObject3d) {
            }
        };
        this.c = (l) this.d.getVirtualTarget();
        this.e = new p();
        this.e.setAABBPX(-2.1474836E9f, -2.1474836E9f, -2.1474836E9f, 2.1474836E9f, 2.1474836E9f, 2.1474836E9f);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.manager.f.e.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (e.this.f != null) {
                    e.this.f.a(4, null);
                }
            }
        });
        this.b.addChild(this.e);
        this.b.addChild(this.c);
    }

    public l a(com.tsf.shell.e.b.a aVar) {
        if (aVar == null) {
            return null;
        }
        this.e.alpha(0.0f);
        com.tsf.shell.manager.a.h.H();
        com.censivn.C3DEngine.b.c.c.a(aVar);
        this.f = aVar;
        this.a.addChild(this.b);
        com.tsf.shell.manager.a.s.a(this.g);
        return this.c;
    }

    public void b() {
        this.a.removeChild(this.b);
        com.tsf.shell.manager.a.h.I();
        com.censivn.C3DEngine.b.c.c.b(this.f);
        com.tsf.shell.manager.a.s.b(this.g);
        this.f = null;
    }

    public void c() {
        a((Runnable) null);
    }

    public void a(Runnable runnable) {
        a(runnable, ItemInfo.APP_INTENT);
    }

    public void a(Runnable runnable, int i) {
        com.tsf.shell.manager.a.c.a(runnable, i);
    }

    public void d() {
        a((Runnable) null, true);
    }

    public void b(Runnable runnable) {
        a(runnable, true);
    }

    public void a(final Runnable runnable, boolean z) {
        com.tsf.shell.manager.a.c.a(new Runnable() { // from class: com.tsf.shell.manager.f.e.5
            @Override // java.lang.Runnable
            public void run() {
                e.this.e();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
    }

    public void a(j jVar, boolean z) {
        if (z) {
            Number3d.TEMPNUMBER3D.reset();
            jVar.position().setAllFrom(jVar.localToGlobal(Number3d.TEMPNUMBER3D));
            jVar.removeFromParent();
        }
        this.j.addChild(jVar);
        this.j.setZOrderOnTop();
    }

    public void a(j jVar) {
        a(jVar, false);
    }

    public void a(j jVar, int i) {
        this.j.addChildAt(jVar, i);
        this.j.setZOrderOnTop();
    }

    public void b(j jVar) {
        this.j.removeChild(jVar);
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        if (this.f != null) {
            this.f.a(i, i2, i3, i4);
        }
    }
}
