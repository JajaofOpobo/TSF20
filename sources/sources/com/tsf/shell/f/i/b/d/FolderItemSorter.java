package com.tsf.shell.f.i.b.d;

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
public class FolderItemSorter {
    private static int b = 800;
    private FolderShortcutItem c;
    private com.censivn.C3DEngine.b.f.j d;
    private com.tsf.shell.f.i.PageItem e;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float r;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase u;
    private boolean n = false;
    private boolean o = false;
    private boolean p = true;
    private boolean s = false;
    private boolean t = false;
    boolean a = false;
    private ArrayList<float[]> g = new ArrayList<>();
    private com.censivn.C3DEngine.b.f.j f = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.i.b.d.FolderItemSorter.1
        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawEnd() {
            FolderItemSorter.this.i();
        }
    };
    private com.tsf.shell.f.b.ShellKeyEventHandler q = new com.tsf.shell.f.b.ShellKeyEventHandler() { // from class: com.tsf.shell.f.i.b.d.FolderItemSorter.2
        @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.b.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && FolderItemSorter.this.t) {
                FolderItemSorter.this.b();
            }
        }

        @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.b.a
        public void b(int i, KeyEvent keyEvent) {
        }
    };

    public FolderItemSorter(FolderShortcutItem bVar) {
        this.c = bVar;
        this.e = this.c;
    }

    public void a() {
        this.f.destroy();
        this.g.clear();
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
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.e.K().container != -1 || (this.e.K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            this.e.localToGlobal(Number3d.TEMPNUMBER3D);
            this.u = com.tsf.shell.f.c.DrawerPanelController.a(this.e);
            ((com.censivn.C3DEngine.b.f.j) this.e.parent()).replaceChild(this.e, this.u);
            this.e.position().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.r = this.e.rotation().z;
        if (this.r != 0.0f) {
            this.s = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.e(0.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar);
        } else {
            if (this.e.scale().x != 1.0f) {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar2);
            }
            this.s = false;
        }
        com.tsf.shell.f.i.b.d.FolderShortcutItem.m.b(this.c);
        com.tsf.shell.ShellDataProvider.a().a("LineViewer");
        this.c.o(false);
        this.e.mouseSkip(true);
        this.e.removeFromParent();
        com.censivn.C3DEngine.b.f.j jVarA = com.tsf.shell.manager.app.TaskScheduler.a(this.q);
        com.tsf.shell.manager.app.TaskScheduler.c();
        jVarA.addChild(this.e);
        com.tsf.shell.manager.app.ObserverManager.b(Home.b());
    }

    public void a(final boolean z) {
        this.t = false;
        Iterator<com.censivn.C3DEngine.b.f.i> it = this.d.children().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) it.next()).mouseEnabled(false);
        }
        if (this.u != null) {
            this.r = this.u.rotation().z;
        }
        if (!z) {
            this.e.rotation().z = this.r;
        }
        this.c.a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderItemSorter.3
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.app.TaskScheduler.b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderItemSorter.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!FolderItemSorter.this.s) {
                            if (FolderItemSorter.this.u != null && FolderItemSorter.this.e.scale().x != FolderItemSorter.this.u.scale().x) {
                                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                                dVar.l(FolderItemSorter.this.u.scale().x);
                                dVar.m(FolderItemSorter.this.u.scale().y);
                                com.censivn.C3DEngine.b.g.c.a(FolderItemSorter.this.e);
                                com.censivn.C3DEngine.b.g.c.a(FolderItemSorter.this.e, 250, dVar);
                            }
                        } else if (!z) {
                            if (FolderItemSorter.this.u != null) {
                                FolderItemSorter.this.e.scale().setAllFrom(FolderItemSorter.this.u.scale());
                            }
                        } else {
                            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                            if (FolderItemSorter.this.u != null) {
                                dVar2.l(FolderItemSorter.this.u.scale().x);
                                dVar2.m(FolderItemSorter.this.u.scale().y);
                            }
                            dVar2.e(FolderItemSorter.this.r);
                            com.censivn.C3DEngine.b.g.c.a(FolderItemSorter.this.e);
                            com.censivn.C3DEngine.b.g.c.a(FolderItemSorter.this.e, 250, dVar2);
                        }
                        com.tsf.shell.f.f.WorkspacePage gVarN = com.tsf.shell.manager.app.StateHub.n();
                        FolderItemSorter.this.e.removeFromParent();
                        if (FolderItemSorter.this.u != null) {
                            ((com.censivn.C3DEngine.b.f.j) FolderItemSorter.this.u.parent()).replaceChild(FolderItemSorter.this.u, FolderItemSorter.this.e);
                            com.tsf.shell.f.c.DrawerPanelController.a(FolderItemSorter.this.u);
                            FolderItemSorter.this.u = null;
                        } else {
                            gVarN.a(FolderItemSorter.this.e);
                        }
                        FolderItemSorter.this.e.mouseSkip(false);
                        FolderItemSorter.this.c.o(true);
                        com.tsf.shell.manager.app.TaskScheduler.b();
                        com.tsf.shell.ShellDataProvider.a().b("LineViewer");
                        FolderItemSorter.this.i = 0;
                        FolderItemSorter.this.f();
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
                    com.censivn.C3DEngine.b.f.i childAt = this.d.getChildAt(i2);
                    float[] fArr = this.g.get((int) ((((i2 / this.h) * 0.9f) + 0.1f) * this.i));
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
                        FolderItemSorter();
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
            com.censivn.C3DEngine.A.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderItemSorter.4
                @Override // java.lang.Runnable
                public void run() {
                    FolderItemSorter.this.g();
                    FolderItemSorter.this.n = false;
                    FolderItemSorter.this.f.setAnimationObjectState(true);
                    FolderItemSorter.this.e.addChild(FolderItemSorter.this.f);
                    FolderItemSorter.this.g.clear();
                    FolderItemSorter.this.d = FolderItemSorter.this.c.aF();
                    FolderItemSorter.this.h = FolderItemSorter.this.d.numChildren();
                    for (int i = 0; i < FolderItemSorter.this.h; i++) {
                        FolderItemSorter.this.g.add(new float[]{0.0f, 0.0f});
                    }
                    FolderItemSorter.this.i = FolderItemSorter.this.h;
                    Number3d number3dLocalToGlobal = FolderItemSorter.this.d.localToGlobal(new Number3d(0.0f, 0.0f, 0.0f));
                    FolderItemSorter.this.j = (int) (com.censivn.C3DEngine.b.b.A.H + number3dLocalToGlobal.x);
                    FolderItemSorter.this.k = (int) (com.censivn.C3DEngine.b.b.A.I - number3dLocalToGlobal.y);
                    FolderItemSorter.this.l = motionEvent2.getX();
                    FolderItemSorter.this.m = motionEvent2.getY();
                    Iterator<com.censivn.C3DEngine.b.f.i> it = FolderItemSorter.this.d.children().iterator();
                    while (it.hasNext()) {
                        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) it.next();
                        bVar.alpha(255.0f);
                        bVar.visible(true);
                        bVar.g(1.0f);
                        bVar.mouseEnabled(true);
                    }
                    FolderItemSorter.this.a = true;
                }
            });
        }
        if (this.i <= b && this.a) {
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            int iB = (int) (com.tsf.shell.utils.GraphicsEngineBridge.b(x, y, this.l, this.m) / 5.0f);
            if (iB >= 1) {
                float f = (x - this.l) / iB;
                float f2 = (y - this.m) / iB;
                for (int i = 0; i < iB; i++) {
                    this.g.add(new float[]{(((i + 1) * f) + this.l) - this.j, this.k - (((i + 1) * f2) + this.m)});
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
