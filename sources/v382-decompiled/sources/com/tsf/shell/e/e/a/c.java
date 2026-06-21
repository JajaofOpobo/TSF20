package com.tsf.shell.e.e.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.shell.e.i.b.e.i;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    private static l b;
    private static m c;
    private static boolean d;
    private static h e;
    private static b f;
    private static d g;
    private static a i;
    private static ArrayList j;
    private static ArrayList k;
    private static com.tsf.shell.manager.a.c l;
    private static float a = 0.0f;
    private static boolean h = false;

    private static void h() {
        if (!d) {
            f = new b();
            g = new d();
            b = new l() { // from class: com.tsf.shell.e.e.a.c.1
                @Override // com.censivn.C3DEngine.b.f.j
                public void onKillFocus() {
                    c.b();
                }
            };
            l = new com.tsf.shell.manager.a.c() { // from class: com.tsf.shell.e.e.a.c.2
                @Override // com.tsf.shell.manager.a.c
                public void a() {
                    c.a();
                    c.e.b();
                }
            };
            b.alpha(0.0f);
            c = new m(com.censivn.C3DEngine.b.b.a.D, 308.0f * com.censivn.C3DEngine.b.b.a.b, false);
            b.addChild(c);
            e = new h(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.b * (-80.0f), com.censivn.C3DEngine.b.b.a.b * 80.0f, com.tsf.shell.manager.o.b.a.T) { // from class: com.tsf.shell.e.e.a.c.3
                @Override // com.censivn.C3DEngine.b.h.b.h
                public j a(int i2, j jVar) {
                    j jVar2;
                    if (jVar == null) {
                        jVar2 = com.tsf.shell.manager.o.b.a.b();
                        ((com.censivn.C3DEngine.b.f.a.a) jVar2).a(true);
                        jVar2.calAABB();
                    } else {
                        jVar2 = jVar;
                    }
                    jVar2.textures().clear();
                    jVar2.textures().addElement(((i) c.j.get(i2)).aZ());
                    return jVar2;
                }

                @Override // com.censivn.C3DEngine.b.h.b.h
                public int e() {
                    return c.j.size();
                }

                @Override // com.censivn.C3DEngine.b.h.b.h
                public void a(j jVar, int i2) {
                    c.i.a(jVar, (i) c.j.get(i2));
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
            b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(b) { // from class: com.tsf.shell.e.e.a.c.4
                com.censivn.C3DEngine.b.d.a a;

                @Override // com.censivn.C3DEngine.b.d.a
                public void e(MotionEvent motionEvent) {
                    float[] a2 = x.a(motionEvent);
                    j hittingTarget = this.c.getHittingTarget(a2[0], a2[1], true);
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
        ArrayList d2 = com.tsf.shell.manager.a.w.a().a.d();
        if (k != null) {
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!k.contains(iVar.bd())) {
                    j.add(iVar);
                }
            }
            d2.clear();
            return;
        }
        Iterator it2 = d2.iterator();
        while (it2.hasNext()) {
            j.add((i) it2.next());
        }
    }

    public static void a(a aVar, ArrayList arrayList) {
        if (j != null) {
            j.clear();
        }
        k = arrayList;
        j = new ArrayList();
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
            com.censivn.C3DEngine.b.c.c.b(f);
            com.tsf.shell.manager.a.b.b(g);
            c();
        }
    }

    private static void i() {
        b.mouseEnabled(false);
        b.setFocus();
        h = true;
        com.censivn.C3DEngine.b.c.c.a(f);
        com.tsf.shell.manager.a.b.a(g);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.a.c.5
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.b.mouseEnabled(true);
            }
        };
        xVar.a(255);
        xVar.h(a);
        com.censivn.C3DEngine.b.g.w.a(b);
        com.censivn.C3DEngine.b.g.w.a(b, 500, xVar);
    }

    protected static void c() {
        h = false;
        i.i();
        b.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.a.c.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.b.removeFromParent();
                c.i.h();
                c.i = null;
                c.j.clear();
            }
        };
        xVar.a(0);
        xVar.h(a - (300.0f * com.censivn.C3DEngine.b.b.a.b));
        com.censivn.C3DEngine.b.g.w.a(b);
        com.censivn.C3DEngine.b.g.w.a(b, 500, xVar);
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
