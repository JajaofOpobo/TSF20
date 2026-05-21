package com.tsf.shell.f.e.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.h.b.g;
import com.tsf.shell.manager.a.b;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static j b;
    private static k c;
    private static boolean d;
    private static g e;
    private static b f;
    private static d g;
    private static a i;
    private static ArrayList<com.tsf.shell.f.i.b.e.g> j;
    private static ArrayList<f> k;
    private static b.a l;
    private static float a = 0.0f;
    private static boolean h = false;

    private static void h() {
        if (!d) {
            f = new b();
            g = new d();
            b = new j() { // from class: com.tsf.shell.f.e.a.c.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onKillFocus() {
                    c.b();
                }
            };
            l = new b.a() { // from class: com.tsf.shell.f.e.a.c.2
                @Override // com.tsf.shell.manager.a.b.a
                public void a() {
                    c.a();
                    c.e.b();
                }
            };
            b.alpha(0.0f);
            c = new k(com.censivn.C3DEngine.b.b.a.D, 308.0f * com.censivn.C3DEngine.b.b.a.b, false);
            b.addChild(c);
            e = new g(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.b * (-80.0f), com.censivn.C3DEngine.b.b.a.b * 80.0f, com.tsf.shell.manager.o.b.a.T) { // from class: com.tsf.shell.f.e.a.c.3
                @Override // com.censivn.C3DEngine.b.h.b.g
                public i a(int i2, i iVar) {
                    i iVarB;
                    if (iVar == null) {
                        iVarB = com.tsf.shell.manager.o.b.a.b();
                        ((com.censivn.C3DEngine.b.f.a.a) iVarB).a(true);
                        iVarB.calAABB();
                    } else {
                        iVarB = iVar;
                    }
                    iVarB.textures().clear();
                    iVarB.textures().addElement(((com.tsf.shell.f.i.b.e.g) c.j.get(i2)).aZ());
                    return iVarB;
                }

                @Override // com.censivn.C3DEngine.b.h.b.g
                public int e() {
                    return c.j.size();
                }

                @Override // com.censivn.C3DEngine.b.h.b.g
                public void a(i iVar, int i2) {
                    c.i.a(iVar, (com.tsf.shell.f.i.b.e.g) c.j.get(i2));
                    c.j.remove(i2);
                    a(i2);
                    b();
                    if (c.j.size() == 0) {
                        c.b();
                    }
                }
            };
            b.addChild(e);
            b.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.b * (-80.0f), 0.0f, com.censivn.C3DEngine.b.b.a.A, 80.0f * com.censivn.C3DEngine.b.b.a.b, 0.0f);
            b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(b) { // from class: com.tsf.shell.f.e.a.c.4
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
        ArrayList<com.tsf.shell.f.i.b.e.g> arrayListD = com.tsf.shell.manager.a.w.a().a.d();
        if (k != null) {
            for (com.tsf.shell.f.i.b.e.g gVar : arrayListD) {
                if (!k.contains(gVar.bd())) {
                    j.add(gVar);
                }
            }
            arrayListD.clear();
            return;
        }
        Iterator<com.tsf.shell.f.i.b.e.g> it = arrayListD.iterator();
        while (it.hasNext()) {
            j.add(it.next());
        }
    }

    public static void a(a aVar, ArrayList<f> arrayList) {
        if (j != null) {
            j.clear();
        }
        k = arrayList;
        j = new ArrayList<>();
        a();
        i = aVar;
        i.e();
        h();
        com.tsf.shell.manager.a.w.a().a.a(l);
        com.tsf.shell.manager.a.w.a().a.b();
        j();
        if (b.parent() == null) {
            b.position().y = a - (300.0f * com.censivn.C3DEngine.b.b.a.b);
        } else {
            b.removeFromParent();
        }
        com.tsf.shell.manager.a.j.a(b);
        i();
    }

    public static void b() {
        if (h) {
            com.tsf.shell.manager.a.w.a().a.b(l);
            com.censivn.C3DEngine.b.c.b.b(f);
            com.tsf.shell.manager.a.b.b(g);
            c();
        }
    }

    private static void i() {
        b.mouseEnabled(false);
        b.setFocus();
        h = true;
        com.censivn.C3DEngine.b.c.b.a(f);
        com.tsf.shell.manager.a.b.a(g);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.a.c.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.b.mouseEnabled(true);
            }
        };
        dVar.a(255);
        dVar.h(a);
        com.censivn.C3DEngine.b.g.c.a(b);
        com.censivn.C3DEngine.b.g.c.a(b, 500, dVar);
    }

    protected static void c() {
        h = false;
        i.i();
        b.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.a.c.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.b.removeFromParent();
                c.i.h();
                a unused = c.i = null;
                c.j.clear();
            }
        };
        dVar.a(0);
        dVar.h(a - (300.0f * com.censivn.C3DEngine.b.b.a.b));
        com.censivn.C3DEngine.b.g.c.a(b);
        com.censivn.C3DEngine.b.g.c.a(b, 500, dVar);
    }

    private static void j() {
        b.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.b * (-80.0f), 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.b * 80.0f, 0.0f);
        c.a(com.censivn.C3DEngine.b.b.a.D);
        e.a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.b * (-80.0f), com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.b * 80.0f);
        a = com.censivn.C3DEngine.b.b.a.C + (com.tsf.shell.manager.o.b.a.U / 2.0f) + (10.0f * com.censivn.C3DEngine.b.b.a.c);
        if (h) {
            b.position().y = a;
        }
    }

    public static void a(int i2, int i3, int i4, int i5) {
        j();
    }
}
