package com.tsf.shell.manager.f;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.a.g;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.d;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.n;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements e.a {
    private g a;
    private j b;
    private j c;
    private VObject3dContainer d;
    private n e;
    private com.tsf.shell.f.b.a f;
    private d.b g;
    private com.tsf.shell.e.e h;
    private FrameLayout i;
    private j j;

    public d(com.tsf.shell.e.e eVar) {
        com.tsf.shell.manager.a.b.a(this);
        this.h = eVar;
        this.i = new FrameLayout(this.h.getContext());
        this.g = new d.b() { // from class: com.tsf.shell.manager.f.d.1
            @Override // com.censivn.C3DEngine.b.c.d.b
            public void a() {
                if (d.this.f != null) {
                    d.this.f.a(4, null);
                }
            }
        };
    }

    public j a() {
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

    public void a(g gVar) {
        this.a = gVar;
        this.b = new j();
        this.j = new j() { // from class: com.tsf.shell.manager.f.d.2
            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public boolean removeChild(i iVar) {
                boolean zRemoveChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return zRemoveChild;
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public i removeChildAt(int i) {
                i iVarRemoveChildAt = super.removeChildAt(i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return iVarRemoveChildAt;
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(i iVar) {
                if (parent() == null) {
                    d.this.a.addChild(this);
                }
                super.addChild(iVar);
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void addChildAt(i iVar, int i) {
                if (parent() == null) {
                    d.this.a.addChild(this);
                }
                super.addChildAt(iVar, i);
            }
        };
        this.d = new VObject3dContainer() { // from class: com.tsf.shell.manager.f.d.3
            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildStart(VObject3d vObject3d) {
            }

            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildEnd(VObject3d vObject3d) {
            }
        };
        this.c = (j) this.d.getVirtualTarget();
        this.e = new n();
        this.e.setAABBPX(-2.1474836E9f, -2.1474836E9f, -2.1474836E9f, 2.1474836E9f, 2.1474836E9f, 2.1474836E9f);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.manager.f.d.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (d.this.f != null) {
                    d.this.f.a(4, null);
                }
            }
        });
        this.b.addChild(this.e);
        this.b.addChild(this.c);
    }

    public j a(com.tsf.shell.f.b.a aVar) {
        if (aVar == null) {
            return null;
        }
        this.e.alpha(0.0f);
        com.tsf.shell.manager.a.h.H();
        com.censivn.C3DEngine.b.c.b.a(aVar);
        this.f = aVar;
        this.a.addChild(this.b);
        com.tsf.shell.manager.a.s.a(this.g);
        return this.c;
    }

    public void b() {
        this.a.removeChild(this.b);
        com.tsf.shell.manager.a.h.I();
        com.censivn.C3DEngine.b.c.b.b(this.f);
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
        com.tsf.shell.manager.a.c.a(new Runnable() { // from class: com.tsf.shell.manager.f.d.5
            @Override // java.lang.Runnable
            public void run() {
                d.this.e();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
    }

    public void a(i iVar, boolean z) {
        if (z) {
            Number3d.TEMPNUMBER3D.reset();
            iVar.position().setAllFrom(iVar.localToGlobal(Number3d.TEMPNUMBER3D));
            iVar.removeFromParent();
        }
        this.j.addChild(iVar);
        this.j.setZOrderOnTop();
    }

    public void a(i iVar) {
        a(iVar, false);
    }

    public void a(i iVar, int i) {
        this.j.addChildAt(iVar, i);
        this.j.setZOrderOnTop();
    }

    public void b(i iVar) {
        this.j.removeChild(iVar);
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        if (this.f != null) {
            this.f.a(i, i2, i3, i4);
        }
    }
}
