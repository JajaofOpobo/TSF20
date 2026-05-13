package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.g.a;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class n implements b.a {
    private static TextureElement a;
    private static TextureElement b;
    private static com.censivn.C3DEngine.b.f.j c;
    private static com.censivn.C3DEngine.b.f.a.a d;
    private static com.censivn.C3DEngine.b.f.a.a e;
    private static com.censivn.C3DEngine.b.f.a.a f;
    private static com.censivn.C3DEngine.b.d.a j;
    private static n k;
    private static com.censivn.C3DEngine.b.g.b.b l;
    private static int n;
    private static int o;
    private com.censivn.C3DEngine.b.f.j p;
    private a q;
    private h r;
    private boolean s = false;
    private static int g = 5;
    private static int h = 360 / g;
    private static int i = -1;
    private static boolean m = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    static {
        p();
    }

    public n(com.censivn.C3DEngine.b.f.j jVar, a aVar) {
        this.p = jVar;
        this.q = aVar;
    }

    public com.censivn.C3DEngine.b.d.a a() {
        return j;
    }

    public boolean b() {
        return this.s;
    }

    public void c() {
        a((int) this.p.position().x, (int) this.p.position().y);
    }

    public void a(int i2, int i3) {
        if (!this.s) {
            m = false;
            k = this;
            this.s = true;
            c.removeFromParent();
            c.alpha(0.0f);
            c.scale().x = 0.0f;
            c.scale().y = 0.0f;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.n.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    n.this.e();
                }
            };
            dVar.a(255);
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a((com.censivn.C3DEngine.b.g.b) new a.C0030a.c());
            com.censivn.C3DEngine.b.g.c.a(c, 380, dVar);
            n = i2;
            o = i3;
            if (i2 + (com.censivn.C3DEngine.b.b.a.a * 230.0f) > com.censivn.C3DEngine.b.b.a.A) {
                i2 = (int) (com.censivn.C3DEngine.b.b.a.A - (com.censivn.C3DEngine.b.b.a.a * 230.0f));
                m = true;
            } else if (i2 - (com.censivn.C3DEngine.b.b.a.a * 230.0f) < com.censivn.C3DEngine.b.b.a.z) {
                i2 = (int) (com.censivn.C3DEngine.b.b.a.z + (com.censivn.C3DEngine.b.b.a.a * 230.0f));
                m = true;
            }
            if (i3 + (com.censivn.C3DEngine.b.b.a.a * 150.0f) > com.censivn.C3DEngine.b.b.a.B) {
                i3 = (int) (com.censivn.C3DEngine.b.b.a.B - (com.censivn.C3DEngine.b.b.a.a * 150.0f));
                m = true;
            } else if (i3 - (com.censivn.C3DEngine.b.b.a.a * 150.0f) < com.censivn.C3DEngine.b.b.a.C) {
                i3 = (int) (com.censivn.C3DEngine.b.b.a.C + (com.censivn.C3DEngine.b.b.a.a * 150.0f));
                m = true;
            }
            c.position().setAll(i2, i3, 0.0f);
            com.tsf.shell.manager.a.j.a(c);
            com.censivn.C3DEngine.b.c.b.a(this);
        }
    }

    public void a(int i2, boolean z) {
        if (this.s) {
            this.s = false;
            if (!z) {
                com.censivn.C3DEngine.a.d.d().a((com.censivn.C3DEngine.b.d.a) null, true);
            }
            com.censivn.C3DEngine.b.g.c.a(c);
            f();
            this.q.a(i2);
            this.r.b();
            this.p = null;
            this.q = null;
            com.tsf.shell.manager.a.j.b(c);
            k = null;
            com.censivn.C3DEngine.b.c.b.b(this);
        }
    }

    public void d() {
        d.setFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.censivn.C3DEngine.a.d().getString(b.i.pop_menu_arrangement));
            arrayList.add(com.censivn.C3DEngine.a.d().getString(b.i.pop_menu_gather));
            arrayList.add(com.censivn.C3DEngine.a.d().getString(b.i.text_delete));
            arrayList.add(com.censivn.C3DEngine.a.d().getString(b.i.pop_menu_create_folder));
            arrayList.add(com.censivn.C3DEngine.a.d().getString(b.i.pop_menu_mulit_choice));
            Bitmap a2 = o.a(arrayList);
            b = com.censivn.C3DEngine.a.g().a(a2, true);
            a2.recycle();
            f.textures().clear();
            f.textures().addElement(b);
        }
    }

    public void e() {
        if (f == null) {
            ThemeManager.mix.lasso.addElementListener(new DynamicThemeRunnable() { // from class: com.tsf.shell.f.e.n.2
                @Override // com.tsf.shell.theme.inside.mix.menu.DynamicThemeRunnable, com.tsf.shell.theme.inside.ThemeMixElementManager.DynamicThemeElement
                public void onReloadTheme(ThemeDescription themeDescription) {
                    if (n.b != null) {
                        com.censivn.C3DEngine.a.g().a(n.b);
                        TextureElement unused = n.b = null;
                    }
                    n.this.o();
                }
            });
            l = new com.censivn.C3DEngine.b.g.b.b();
            f = new com.censivn.C3DEngine.b.f.a.a(5, 32, 160, 160);
            for (int i2 = 0; i2 < 5; i2++) {
                com.censivn.C3DEngine.b.f.a.b a2 = f.a(i2);
                a2.d(0, i2, 5, 1);
                a2.g();
            }
        }
        o();
        final int[][] iArr = {new int[]{0, 126}, new int[]{160, (int) (com.censivn.C3DEngine.b.b.a.a * 54.0f)}, new int[]{136, -92}, new int[]{-136, -92}, new int[]{-166, 54}};
        f.alpha(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.n.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                for (int i3 = 0; i3 < 5; i3++) {
                    com.censivn.C3DEngine.b.f.a.b a3 = n.f.a(i3);
                    a3.m.spX(iArr[i3][0] * f2);
                    a3.m.spY(iArr[i3][1] * f2);
                    a3.f();
                }
                n.f.alpha((int) (255.0f * f2));
            }
        };
        dVar.a(255);
        dVar.a((com.censivn.C3DEngine.b.g.b) new a.C0030a.c());
        com.censivn.C3DEngine.b.g.c.a(l, 700, dVar);
        c.addChild(f);
    }

    public void f() {
        if (f != null) {
            com.censivn.C3DEngine.b.g.c.a(l);
            for (int i2 = 0; i2 < 5; i2++) {
                com.censivn.C3DEngine.b.f.a.b a2 = f.a(i2);
                a2.m.spX(0.0f);
                a2.m.spY(0.0f);
                a2.f();
            }
            f.alpha(0.0f);
            f.removeFromParent();
        }
    }

    public void g() {
        d.setFocus();
    }

    private static void p() {
        a = ThemeManager.mix.lasso.getTextureElement(ThemeShellDescription.PICKER_MENU, 240, 320);
        c = new com.censivn.C3DEngine.b.f.j();
        d = new com.censivn.C3DEngine.b.f.a.a(6, 40, 240, 320) { // from class: com.tsf.shell.f.e.n.4
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                if (n.k != null) {
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.e.n.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (n.k != null) {
                                n.k.a(-1, true);
                            }
                        }
                    });
                }
            }
        };
        d.textures().addElement(a);
        com.censivn.C3DEngine.b.f.a.b a2 = d.a(0);
        a2.d(64);
        a2.n.z = 0.0f;
        a2.d(0, 2, 4, 3);
        a2.h();
        a(a2);
        com.censivn.C3DEngine.b.f.a.b a3 = d.a(1);
        a3.d(64);
        a3.n.z = h * (-1);
        a3.d(0, 2, 4, 3);
        a3.h();
        a(a3);
        com.censivn.C3DEngine.b.f.a.b a4 = d.a(2);
        a4.d(64);
        a4.n.z = h * (-2);
        a4.d(0, 2, 4, 3);
        a4.h();
        a(a4);
        com.censivn.C3DEngine.b.f.a.b a5 = d.a(3);
        a5.d(64);
        a5.n.z = h * (-3);
        a5.d(0, 2, 4, 3);
        a5.h();
        a(a5);
        com.censivn.C3DEngine.b.f.a.b a6 = d.a(4);
        a6.d(64);
        a6.n.z = h * (-4);
        a6.d(0, 2, 4, 3);
        a6.h();
        a(a6);
        com.censivn.C3DEngine.b.f.a.b a7 = d.a(5);
        a7.d(0, 0, 2, 2);
        a7.h();
        e = new com.censivn.C3DEngine.b.f.a.a(6, 40, 240, 320);
        e.textures().addElement(a);
        j = new com.censivn.C3DEngine.b.d.a(d) { // from class: com.tsf.shell.f.e.n.5
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                n.c(n.b(motionEvent));
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (n.i != -1 && n.i != 5) {
                    w.b();
                    n.c(n.i, false);
                    n.k.a(n.i, false);
                    int unused = n.i = -1;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i2 = 5;
                if (!n.m) {
                    i2 = n.b(motionEvent2);
                } else {
                    float[] b2 = x.b(motionEvent2.getX(), motionEvent2.getY());
                    if (x.b(n.n, n.o, b2[0], b2[1]) > 50.0f) {
                        boolean unused = n.m = false;
                    }
                }
                n.c(i2);
            }
        };
        r();
        c.addChild(d);
        c.addChild(e);
    }

    private static void a(final com.censivn.C3DEngine.b.f.a.b bVar) {
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(d) { // from class: com.tsf.shell.f.e.n.6
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                n.c(bVar.J);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (n.i != -1 && n.i != 5) {
                    w.b();
                    n.c(n.i, false);
                    n.k.a(n.i, false);
                    int unused = n.i = -1;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i2 = 5;
                if (!n.m) {
                    i2 = n.b(motionEvent2);
                } else {
                    float[] b2 = x.b(motionEvent2.getX(), motionEvent2.getY());
                    if (x.b(n.n, n.o, b2[0], b2[1]) > 50.0f) {
                        boolean unused = n.m = false;
                    }
                }
                n.c(i2);
            }
        };
        bVar.D = new Number3d(0.5f, 1.0f, 1.0f);
        bVar.E = new Number3d(0.5f, 1.0f, 1.0f);
        bVar.F = new Number3d(0.5f, 1.0f, 1.0f);
        bVar.G = new Number3d(0.5f, 1.0f, 1.0f);
        bVar.f();
        bVar.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i2) {
        c.invalidate();
        if (i2 == -1) {
            if (i != -1) {
                q();
                i = -1;
                return;
            }
            return;
        }
        if (i == -1) {
        }
        if (i2 != i) {
            q();
            c(i2, true);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(MotionEvent motionEvent) {
        float f2;
        float atan;
        float[] a2 = x.a(motionEvent);
        int i2 = (int) a2[0];
        int i3 = (int) a2[1];
        int i4 = (int) c.position().x;
        int i5 = (int) c.position().y;
        float b2 = x.b(i4, i5, i2, i3);
        float f3 = i2 - i4;
        if (i3 - i5 > 0.0f) {
            atan = (float) (Math.atan(f3 / f2) / 0.017453292519943295d);
        } else {
            atan = ((float) (Math.atan(f3 / f2) / 0.017453292519943295d)) + 180.0f;
        }
        if (atan < 0.0f) {
            atan += 360.0f;
        }
        float f4 = atan + (h / 2);
        if (b2 < 50.0f * com.censivn.C3DEngine.b.b.a.a) {
            return g;
        }
        if (b2 > 200.0f * com.censivn.C3DEngine.b.b.a.a) {
            return g;
        }
        int i6 = (int) (f4 / h);
        if (i6 == g) {
            return i6 - 1;
        }
        return i6;
    }

    private static void q() {
        if (i != -1) {
            c(i, false);
            i = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i2, boolean z) {
        switch (i2) {
            case 0:
                if (z) {
                    e.a(i2).a(5, 0);
                    d.a(i2).a(0, 5);
                    return;
                }
                e.a(i2).a(4, 0);
                d.a(i2).a(0, 2);
                return;
            case 1:
                if (z) {
                    e.a(i2).a(5, 1);
                    d.a(i2).a(0, 5);
                    return;
                }
                e.a(i2).a(4, 1);
                d.a(i2).a(0, 2);
                return;
            case 2:
                if (z) {
                    e.a(i2).a(5, 2);
                    d.a(i2).a(0, 5);
                    return;
                }
                e.a(i2).a(4, 2);
                d.a(i2).a(0, 2);
                return;
            case 3:
                if (z) {
                    e.a(i2).a(5, 3);
                    d.a(i2).a(0, 5);
                    return;
                }
                e.a(i2).a(4, 3);
                d.a(i2).a(0, 2);
                return;
            case 4:
                if (z) {
                    e.a(i2).a(5, 4);
                    d.a(i2).a(0, 5);
                    return;
                }
                e.a(i2).a(4, 4);
                d.a(i2).a(0, 2);
                return;
            case 5:
                if (z) {
                    e.a(i2).a(5, 5);
                    d.a(i2).a(2, 0);
                    return;
                }
                e.a(i2).a(4, 5);
                d.a(i2).a(0, 0);
                return;
            default:
                return;
        }
    }

    private static void r() {
        for (int i2 = 0; i2 < 6; i2++) {
            com.censivn.C3DEngine.b.f.a.b a2 = e.a(i2);
            if (i2 != 5) {
                a2.m.spX((int) (Math.sin(h * i2 * 0.017453292519943295d) * 65));
                a2.m.spY((int) (Math.cos(h * i2 * 0.017453292519943295d) * 65));
                a2.d(1, 1);
                a2.f();
            } else {
                a2.m.spX(0.0f);
                a2.m.spY(0.0f);
                a2.d(1, 1);
                a2.f();
            }
            c(i2, false);
        }
    }

    public void a(h hVar) {
        this.r = hVar;
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            com.censivn.C3DEngine.b.c.b.b(this);
            k.a(-1, true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i2, KeyEvent keyEvent) {
    }
}
