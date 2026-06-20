package com.tsf.shell.f.e._a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerG;
import com.tsf.shell.manager.app.ObserverManager;
import com.tsf.shell.manager.app.LauncherAppInfo;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DropTargetItem {
    private static j b;
    private static k c;
    private static boolean d;
    private static g e;
    private static ObserverManager f;
    private static d g;
    private static a i;
    private static ArrayList<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> j;
    private static ArrayList<LauncherAppInfo> k;
    private static DropTargetKeyHandler.a l;
    private static float a = 0.0f;
    private static boolean h = false;

    private static void h() {
        if (!d) {
            f = new ObserverManager();
            g = new DropTargetIndicator();
            b = new BaseRenderable() { // from class: com.tsf.shell.f.e._a.DropTargetItem.1
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onKillFocus() {
                    c.b();
                }
            };
            l = new DropTargetKeyHandler.a() { // from class: com.tsf.shell.f.e._a.DropTargetItem.2
                @Override // com.tsf.shell.manager.app.ObserverManager.a
                public void a() {
                    c.a();
                    c.e.b();
                }
            };
            DropTargetKeyHandler.alpha(0.0f);
            c = new GridRenderable(com.censivn.C3DEngine.b.b.A.D, 308.0f * com.censivn.C3DEngine.b.b.A.b, false);
            DropTargetKeyHandler.addChild(c);
            e = new g(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.b * (-80.0f), com.censivn.C3DEngine.b.b.A.b * 80.0f, com.tsf.shell.manager.o.ButtonPresetManager.a.T) { // from class: com.tsf.shell.f.e._a.DropTargetItem.3
                @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerG
                public i a(int i2, i iVar) {
                    i iVarB;
                    if (iVar == null) {
                        iVarB = com.tsf.shell.manager.o.ButtonPresetManager.a.b();
                        ((com.censivn.C3DEngine.b.f._a.AltTextureSpriteRenderable) iVarB).a(true);
                        iVarB.calAABB();
                    } else {
                        iVarB = iVar;
                    }
                    iVarB.textures().clear();
                    iVarB.textures().addElement(((com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) c.j.get(i2)).aZ());
                    return iVarB;
                }

                @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerG
                public int e() {
                    return c.j.size();
                }

                @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerG
                public void a(i iVar, int i2) {
                    c.i.a(iVar, (com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) c.j.get(i2));
                    c.j.remove(i2);
                    a(i2);
                    DropTargetItem();
                    if (c.j.size() == 0) {
                        c.b();
                    }
                }
            };
            DropTargetKeyHandler.addChild(e);
            DropTargetKeyHandler.setAABBPX(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.b * (-80.0f), 0.0f, com.censivn.C3DEngine.b.b.A.A, 80.0f * com.censivn.C3DEngine.b.b.A.b, 0.0f);
            DropTargetKeyHandler.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(DropTargetKeyHandler) { // from class: com.tsf.shell.f.e._a.DropTargetItem.4
                com.censivn.C3DEngine.b.d.a a;

                @Override // com.censivn.C3DEngine.b.d.a
                public void e(MotionEvent motionEvent) {
                    float[] fArrA = x.a(motionEvent);
                    i hittingTarget = this.c.getHittingTarget(fArrA[0], fArrA[1], true);
                    if (hittingTarget == null) {
                        this.a = c.e.getMouseEventListener();
                    } else {
                        this.a = hittingTarget.getMouseEventListener();
                        this.a.e(motionEvent);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                    if (this.a != null) {
                        this.a.a(motionEvent, motionEvent2, f2, f3);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void f(MotionEvent motionEvent) {
                    if (this.a != null) {
                        this.a.f(motionEvent);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (this.a != null) {
                        w.b();
                        this.a.a(motionEvent);
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.a
                public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                    if (this.a != null) {
                        this.a.b(motionEvent, motionEvent2, f2, f3);
                    }
                }
            });
            d = true;
            return;
        }
        e.a();
        e.b();
    }

    public static void a() {
        j.clear();
        ArrayList<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> arrayListD = com.tsf.shell.manager.app.ServiceProvider.a().a.d();
        if (k != null) {
            for (com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual gVar : arrayListD) {
                if (!k.contains(gVar.bd())) {
                    j.add(gVar);
                }
            }
            arrayListD.clear();
            return;
        }
        Iterator<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> it = arrayListD.iterator();
        while (it.hasNext()) {
            j.add(it.next());
        }
    }

    public static void a(a aVar, ArrayList<LauncherAppInfo> arrayList) {
        if (j != null) {
            j.clear();
        }
        k = arrayList;
        j = new ArrayList<>();
        DropTargetItem();
        i = aVar;
        i.e();
        DropTargetItem();
        com.tsf.shell.manager.app.ServiceProvider.a().a.a(l);
        com.tsf.shell.manager.app.ServiceProvider.a().a.b();
        DropTargetItem();
        if (DropTargetKeyHandler.parent() == null) {
            DropTargetKeyHandler.position().y = a - (300.0f * com.censivn.C3DEngine.b.b.A.b);
        } else {
            DropTargetKeyHandler.removeFromParent();
        }
        com.tsf.shell.manager.app.TaskScheduler.a(DropTargetKeyHandler);
        DropTargetItem();
    }

    public static void b() {
        if (h) {
            com.tsf.shell.manager.app.ServiceProvider.a().a.b(l);
            com.censivn.C3DEngine.b.c.b.b(f);
            com.tsf.shell.manager.app.ObserverManager.b(g);
            DropTargetItem();
        }
    }

    private static void i() {
        DropTargetKeyHandler.mouseEnabled(false);
        DropTargetKeyHandler.setFocus();
        h = true;
        com.censivn.C3DEngine.b.c.b.a(f);
        com.tsf.shell.manager.app.ObserverManager.a(g);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._a.DropTargetItem.5
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                c.b.mouseEnabled(true);
            }
        };
        dVar.a(255);
        dVar.h(a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(DropTargetKeyHandler);
        com.censivn.C3DEngine.b.g.TweenUtils.a(b, 500, dVar);
    }

    protected static void c() {
        h = false;
        i.i();
        DropTargetKeyHandler.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._a.DropTargetItem.6
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                c.b.removeFromParent();
                c.i.h();
                a unused = c.i = null;
                c.j.clear();
            }
        };
        dVar.a(0);
        dVar.h(a - (300.0f * com.censivn.C3DEngine.b.b.A.b));
        com.censivn.C3DEngine.b.g.TweenUtils.a(DropTargetKeyHandler);
        com.censivn.C3DEngine.b.g.TweenUtils.a(b, 500, dVar);
    }

    private static void j() {
        DropTargetKeyHandler.setAABBPX(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.b * (-80.0f), 0.0f, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.b * 80.0f, 0.0f);
        c.a(com.censivn.C3DEngine.b.b.A.D);
        e.a(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.b * (-80.0f), com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.b * 80.0f);
        a = com.censivn.C3DEngine.b.b.A.C + (com.tsf.shell.manager.o.ButtonPresetManager.a.U / 2.0f) + (10.0f * com.censivn.C3DEngine.b.b.A.c);
        if (h) {
            DropTargetKeyHandler.position().y = a;
        }
    }

    public static void a(int i2, int i3, int i4, int i5) {
        DropTargetItem();
    }
}
