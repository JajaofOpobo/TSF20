package com.tsf.shell.manager.f;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.a.SceneGraph;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.EmptyRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ViewportController implements e.a {
    public static class b extends com.censivn.C3DEngine.b.c.d.b {
        public void a() {
        }
    }

    private g a;
    private BaseRenderable b;
    private BaseRenderable c;
    private VObject3dContainer d;
    private EmptyRenderable e;
    private com.tsf.shell.f.b.ShellKeyEventHandler f;
    private d.b g;
    private com.tsf.shell.e.DragLayer h;
    private FrameLayout i;
    private BaseRenderable j;

    public ViewportController(com.tsf.shell.e.DragLayer eVar) {
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.h = eVar;
        this.i = new FrameLayout(this.h.getContext());
        this.g = new d.b() { // from class: com.tsf.shell.manager.f.ViewportController.1
            @Override // com.censivn.C3DEngine.b.c.d.b
            public void a() {
                if (d.this.f != null) {
                    d.this.f.a(4, null);
                }
            }
        };
    }

    public BaseRenderable a() {
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
        this.b = new BaseRenderable();
        this.j = new BaseRenderable() { // from class: com.tsf.shell.manager.f.ViewportController.2
            @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
            public boolean removeChild(i iVar) {
                boolean zRemoveChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return zRemoveChild;
            }

            @Override // com.censivn.C3DEngine.b.f.BaseRenderable
            public i removeChildAt(int i) {
                i iVarRemoveChildAt = super.removeChildAt(i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return iVarRemoveChildAt;
            }

            @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
            public void addChild(i iVar) {
                if (parent() == null) {
                    d.this.a.addChild(this);
                }
                super.addChild(iVar);
            }

            @Override // com.censivn.C3DEngine.b.f.BaseRenderable
            public void addChildAt(i iVar, int i) {
                if (parent() == null) {
                    d.this.a.addChild(this);
                }
                super.addChildAt(iVar, i);
            }
        };
        this.d = new VObject3dContainer() { // from class: com.tsf.shell.manager.f.ViewportController.3
            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildStart(VObject3d vObject3d) {
            }

            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildEnd(VObject3d vObject3d) {
            }
        };
        this.c = (j) this.d.getVirtualTarget();
        this.e = new EmptyRenderable();
        this.e.setAABBPX(-2.1474836E9f, -2.1474836E9f, -2.1474836E9f, 2.1474836E9f, 2.1474836E9f, 2.1474836E9f);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.manager.f.ViewportController.4
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

    public BaseRenderable a(com.tsf.shell.f.b.ShellKeyEventHandler aVar) {
        if (aVar == null) {
            return null;
        }
        this.e.alpha(0.0f);
        com.tsf.shell.manager.app.StateHub.H();
        com.censivn.C3DEngine.b.c.b.a(aVar);
        this.f = aVar;
        this.a.addChild(this.b);
        com.tsf.shell.manager.app.CallbackHandler.a(this.g);
        return this.c;
    }

    public void b() {
        this.a.removeChild(this.b);
        com.tsf.shell.manager.app.StateHub.I();
        com.censivn.C3DEngine.b.c.b.b(this.f);
        com.tsf.shell.manager.app.CallbackHandler.b(this.g);
        this.f = null;
    }

    public void c() {
        a((Runnable) null);
    }

    public void a(Runnable runnable) {
        a(runnable, ItemInfo.APP_INTENT);
    }

    public void a(Runnable runnable, int i) {
        com.tsf.shell.manager.app.AppListModel.a(runnable, i);
    }

    public void d() {
        a((Runnable) null, true);
    }

    public void b(Runnable runnable) {
        a(runnable, true);
    }

    public void a(final Runnable runnable, boolean z) {
        com.tsf.shell.manager.app.AppListModel.a(new Runnable() { // from class: com.tsf.shell.manager.f.ViewportController.5
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
