package com.tsf.shell.f.i._b.d;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemPositionAnimator {
    private static int b = 800;
    private WorkspaceShortcutItem c;
    private com.censivn.C3DEngine.b.f.BaseRenderable d;
    private com.tsf.shell.f.i.PageItem e;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float r;
    private com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase u;
    private boolean n = false;
    private boolean o = false;
    private boolean p = true;
    private boolean s = false;
    private boolean t = false;
    boolean a = false;
    private ArrayList<float[]> g = new ArrayList<>();
    private com.censivn.C3DEngine.b.f.BaseRenderable f = new com.censivn.C3DEngine.b.f.BaseRenderable() { // from class: com.tsf.shell.f.i._b.d.ItemPositionAnimator.1
        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawEnd() {
            k.this.i();
        }
    };
    private com.tsf.shell.f.b.ShellKeyEventHandler q = new com.tsf.shell.f.WorkspaceShortcutItem.ShellKeyEventHandler() { // from class: com.tsf.shell.f.i._b.d.ItemPositionAnimator.2
        @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && k.this.t) {
                k.this.b();
            }
        }

        @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void b(int i, KeyEvent keyEvent) {
        }
    };

    public ItemPositionAnimator(WorkspaceShortcutItem bVar) {
        this.c = bVar;
        this.e = this.c;
    }

    public void a() {
        this.f.destroy();
        this.WidgetItemGrid.clear();
        this.g = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f.removeFromParent();
        this.n = false;
        this.o = false;
        this.p = true;
        this.WidgetItemGrid.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.WidgetItemAnimation.K().container != -1 || (this.WidgetItemAnimation.K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            this.WidgetItemAnimation.localToGlobal(Number3d.TEMPNUMBER3D);
            this.u = com.tsf.shell.f.WidgetItemState.DrawerPanelController(this.e);
            ((com.censivn.C3DEngine.b.f.BaseRenderable) this.WidgetItemAnimation.parent()).replaceChild(this.e, this.u);
            this.WidgetItemAnimation.position().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.r = this.WidgetItemAnimation.rotation().z;
        if (this.r != 0.0f) {
            this.s = true;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
            dVar.e(0.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 250, dVar);
        } else {
            if (this.WidgetItemAnimation.scale().x != 1.0f) {
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 250, dVar2);
            }
            this.s = false;
        }
        WorkspaceShortcutItem.m.b(this.c);
        com.tsf.shell.WidgetItemLayout.ShellDataParser().a("LineViewer");
        this.WidgetItemState.o(false);
        this.WidgetItemAnimation.mouseSkip(true);
        this.WidgetItemAnimation.removeFromParent();
        com.censivn.C3DEngine.b.f.BaseRenderable jVarA = com.tsf.shell.manager.app.TaskScheduler.a(this.q);
        com.tsf.shell.manager.app.TaskScheduler.c();
        jVarA.addChild(this.e);
        com.tsf.shell.manager.app.ObserverManager.b(Home.b());
    }

    public void a(final boolean z) {
        this.t = false;
        Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = this.WidgetItemLayout.children().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase) it.next()).mouseEnabled(false);
        }
        if (this.u != null) {
            this.r = this.u.rotation().z;
        }
        if (!z) {
            this.WidgetItemAnimation.rotation().z = this.r;
        }
        this.WidgetItemState.a(new Runnable() { // from class: com.tsf.shell.f.i._b.d.ItemPositionAnimator.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.app.TaskScheduler.b(new Runnable() { // from class: com.tsf.shell.f.i._b.d.ItemPositionAnimator.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!k.this.s) {
                            if (k.this.u != null && k.this.WidgetItemAnimation.scale().x != k.this.u.scale().x) {
                                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
                                dVar.l(k.this.u.scale().x);
                                dVar.m(k.this.u.scale().y);
                                com.censivn.C3DEngine.b.g.TweenUtils.a(k.this.e);
                                com.censivn.C3DEngine.b.g.TweenUtils.a(k.this.e, 250, dVar);
                            }
                        } else if (!z) {
                            if (k.this.u != null) {
                                k.this.WidgetItemAnimation.scale().setAllFrom(k.this.u.scale());
                            }
                        } else {
                            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.WidgetItemGrid.TweenParams();
                            if (k.this.u != null) {
                                dVar2.l(k.this.u.scale().x);
                                dVar2.m(k.this.u.scale().y);
                            }
                            dVar2.e(k.this.r);
                            com.censivn.C3DEngine.b.g.TweenUtils.a(k.this.e);
                            com.censivn.C3DEngine.b.g.TweenUtils.a(k.this.e, 250, dVar2);
                        }
                        com.tsf.shell.f.f.WorkspacePage gVarN = com.tsf.shell.manager.app.StateHub.n();
                        k.this.WidgetItemAnimation.removeFromParent();
                        if (k.this.u != null) {
                            ((com.censivn.C3DEngine.b.f.BaseRenderable) k.this.u.parent()).replaceChild(k.this.u, k.this.e);
                            com.tsf.shell.f.WidgetItemState.DrawerPanelController(k.this.u);
                            k.this.u = null;
                        } else {
                            gVarN.a(k.this.e);
                        }
                        k.this.WidgetItemAnimation.mouseSkip(false);
                        k.this.WidgetItemState.o(true);
                        com.tsf.shell.manager.app.TaskScheduler.b();
                        com.tsf.shell.WidgetItemLayout.ShellDataParser().b("LineViewer");
                        k.this.i = 0;
                        k.this.f();
                        com.tsf.shell.manager.app.ObserverManager.c(Home.b());
                    }
                });
            }
        }, z);
        this.a = false;
    }

    public void b() {
        a(true);
    }

    private void h() {
        this.f.setAnimationObjectState(false);
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.o && this.i > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.h) {
                    com.censivn.C3DEngine.b.f.IRenderable childAt = this.WidgetItemLayout.getChildAt(i2);
                    float[] fArr = this.WidgetItemGrid.get((int) ((((i2 / this.h) * 0.9f) + 0.1f) * this.i));
                    PositionNumber3d positionNumber3dPosition = childAt.position();
                    positionNumber3dPosition.x = (float) (((double) positionNumber3dPosition.x) + (((double) (fArr[0] - childAt.position().x)) * 0.2d));
                    PositionNumber3d positionNumber3dPosition2 = childAt.position();
                    positionNumber3dPosition2.y = (float) (((double) positionNumber3dPosition2.y) + (((double) (fArr[1] - childAt.position().y)) * 0.2d));
                    Number3d number3dRotation = childAt.rotation();
                    number3dRotation.z = (float) (((double) number3dRotation.z) + (((double) (0.0f - childAt.rotation().z)) * 0.5d));
                    if (childAt.scale().x < 1.0f) {
                        Number3d number3dScale = childAt.scale();
                        number3dScale.x = (float) (((double) number3dScale.x) + (((double) (1.0f - childAt.scale().x)) * 0.1d));
                        childAt.scale().y = childAt.scale().x;
                        if (1.0f - childAt.scale().x < 0.05d) {
                            childAt.scale().x = 1.0f;
                            childAt.scale().y = 1.0f;
                        }
                    }
                    if (this.n && i2 == 0 && GraphicsEngineBridge.b(childAt.position().x, childAt.position().y, fArr[0], fArr[1]) < 5.0f) {
                        this.o = true;
                        ItemPositionAnimator();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean c() {
        return this.a;
    }

    public void a(MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.p) {
            this.a = false;
            this.p = false;
            com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.i._b.d.ItemPositionAnimator.4
                @Override // java.lang.Runnable
                public void run() {
                    k.this.g();
                    k.this.n = false;
                    k.this.f.setAnimationObjectState(true);
                    k.this.WidgetItemAnimation.addChild(k.this.f);
                    k.this.WidgetItemGrid.clear();
                    k.this.d = k.this.WidgetItemState.aF();
                    k.this.h = k.this.WidgetItemLayout.numChildren();
                    for (int i = 0; i < k.this.h; i++) {
                        k.this.WidgetItemGrid.add(new float[]{0.0f, 0.0f});
                    }
                    k.this.i = k.this.h;
                    Number3d number3dLocalToGlobal = k.this.WidgetItemLayout.localToGlobal(new Number3d(0.0f, 0.0f, 0.0f));
                    k.this.j = (int) (com.censivn.C3DEngine.b.b.ScreenConstants.H + number3dLocalToGlobal.x);
                    k.this.k = (int) (com.censivn.C3DEngine.b.b.ScreenConstants.I - number3dLocalToGlobal.y);
                    k.this.l = motionEvent2.getX();
                    k.this.m = motionEvent2.getY();
                    Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = k.this.WidgetItemLayout.children().iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase bVar = (com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase) it.next();
                        bVar.alpha(255.0f);
                        bVar.visible(true);
                        bVar.g(1.0f);
                        bVar.mouseEnabled(true);
                    }
                    k.this.a = true;
                }
            });
        }
        if (this.i <= b && this.a) {
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            int iB = (int) (GraphicsEngineBridge.b(x, y, this.l, this.m) / 5.0f);
            if (iB >= 1) {
                float f = (x - this.l) / iB;
                float f2 = (y - this.m) / iB;
                for (int i = 0; i < iB; i++) {
                    this.WidgetItemGrid.add(new float[]{(((i + 1) * f) + this.l) - this.j, this.k - (((i + 1) * f2) + this.m)});
                    this.i++;
                }
                this.l = x;
                this.m = y;
            }
        }
    }

    public void d() {
        this.p = true;
        this.n = true;
    }

    public void e() {
    }
}
