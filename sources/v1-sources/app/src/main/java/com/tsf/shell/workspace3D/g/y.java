package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y implements com.tsf.shell.at {
    private static TextureElement a;
    private static TextureElement b;
    private static com.censivn.C3DEngine.b.v c;
    private static com.censivn.C3DEngine.e.a.a d;
    private static com.censivn.C3DEngine.e.a.a e;
    private static com.censivn.C3DEngine.e.a.a f;
    private static com.censivn.C3DEngine.b.l j;
    private static y k;
    private static com.censivn.C3DEngine.g.b.b l;
    private static int n;
    private static int o;
    private com.censivn.C3DEngine.b.v p;
    private af q;
    private i r;
    private boolean s = false;
    private static int g = 5;
    private static int h = 360 / g;
    private static int i = -1;
    private static boolean m = false;

    static {
        Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.PICKER_MENU);
        a = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
        c = new com.censivn.C3DEngine.b.v();
        ab abVar = new ab();
        d = abVar;
        abVar.z().c(a);
        com.censivn.C3DEngine.e.a.c a2 = d.a(0);
        a2.d(64);
        a2.n.z = 0.0f;
        a2.a(2, 4, 3);
        a2.e();
        a(a2);
        com.censivn.C3DEngine.e.a.c a3 = d.a(1);
        a3.d(64);
        a3.n.z = h * (-1);
        a3.a(2, 4, 3);
        a3.e();
        a(a3);
        com.censivn.C3DEngine.e.a.c a4 = d.a(2);
        a4.d(64);
        a4.n.z = h * (-2);
        a4.a(2, 4, 3);
        a4.e();
        a(a4);
        com.censivn.C3DEngine.e.a.c a5 = d.a(3);
        a5.d(64);
        a5.n.z = h * (-3);
        a5.a(2, 4, 3);
        a5.e();
        a(a5);
        com.censivn.C3DEngine.e.a.c a6 = d.a(4);
        a6.d(64);
        a6.n.z = h * (-4);
        a6.a(2, 4, 3);
        a6.e();
        a(a6);
        com.censivn.C3DEngine.e.a.c a7 = d.a(5);
        a7.a(0, 2, 2);
        a7.e();
        com.censivn.C3DEngine.e.a.a aVar = new com.censivn.C3DEngine.e.a.a(6, 40, 240, 320);
        e = aVar;
        aVar.z().c(a);
        j = new ad(d);
        for (int i2 = 0; i2 < 6; i2++) {
            com.censivn.C3DEngine.e.a.c a8 = e.a(i2);
            if (i2 == 5) {
                a8.m.spX(0.0f);
                a8.m.spY(0.0f);
                a8.b();
                a8.c();
            } else {
                a8.m.spX((int) (Math.sin(0.017453292519943295d * h * i2) * 65.0d));
                a8.m.spY((int) (Math.cos(0.017453292519943295d * h * i2) * 65.0d));
                a8.b();
                a8.c();
            }
            b(i2, false);
        }
        c.d(d);
        c.d(e);
    }

    public y(com.censivn.C3DEngine.b.v vVar, af afVar) {
        this.p = vVar;
        this.q = afVar;
    }

    public static com.censivn.C3DEngine.b.l a() {
        return j;
    }

    public final boolean b() {
        return this.s;
    }

    public final void c() {
        a((int) this.p.L().x, (int) this.p.L().y);
    }

    public final void a(int i2, int i3) {
        if (!this.s) {
            m = false;
            k = this;
            this.s = true;
            c.Q();
            c.b(0.0f);
            c.N().x = 0.0f;
            c.N().y = 0.0f;
            z zVar = new z(this);
            zVar.a(255);
            zVar.j(1.0f);
            zVar.k(1.0f);
            zVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.e());
            com.censivn.C3DEngine.g.s.a(c, 380, zVar);
            n = i2;
            o = i3;
            if (i2 + (com.censivn.C3DEngine.a.a * 230.0f) > com.censivn.C3DEngine.a.f) {
                i2 = (int) (com.censivn.C3DEngine.a.f - (com.censivn.C3DEngine.a.a * 230.0f));
                m = true;
            } else if (i2 - (com.censivn.C3DEngine.a.a * 230.0f) < com.censivn.C3DEngine.a.e) {
                i2 = (int) (com.censivn.C3DEngine.a.e + (com.censivn.C3DEngine.a.a * 230.0f));
                m = true;
            }
            if (i3 + (com.censivn.C3DEngine.a.a * 150.0f) > com.censivn.C3DEngine.a.g) {
                i3 = (int) (com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.a * 150.0f));
                m = true;
            } else if (i3 - (com.censivn.C3DEngine.a.a * 150.0f) < com.censivn.C3DEngine.a.h) {
                i3 = (int) (com.censivn.C3DEngine.a.h + (com.censivn.C3DEngine.a.a * 150.0f));
                m = true;
            }
            c.L().setAll(i2, i3, 0.0f);
            bf.m().a(c);
            com.tsf.shell.aq.a(this);
        }
    }

    public final void a(int i2, boolean z) {
        if (this.s) {
            this.s = false;
            if (!z) {
                com.censivn.C3DEngine.b.m.d().a((com.censivn.C3DEngine.b.l) null, true);
            }
            com.censivn.C3DEngine.g.s.a(c);
            if (f != null) {
                com.censivn.C3DEngine.g.s.a(l);
                for (int i3 = 0; i3 < 5; i3++) {
                    com.censivn.C3DEngine.e.a.c a2 = f.a(i3);
                    a2.m.spX(0.0f);
                    a2.m.spY(0.0f);
                    a2.c();
                }
                f.b(0.0f);
                f.Q();
            }
            this.q.c(i2);
            this.r.c();
            this.p = null;
            this.q = null;
            bf.m();
            c.Q();
            k = null;
            com.tsf.shell.aq.b(this);
        }
    }

    public static void d() {
        d.az();
    }

    public final void e() {
        if (b == null) {
            l = new com.censivn.C3DEngine.g.b.b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.censivn.C3DEngine.a.c().getString(R.string.pop_menu_arrangement));
            arrayList.add(com.censivn.C3DEngine.a.c().getString(R.string.pop_menu_gather));
            arrayList.add(com.censivn.C3DEngine.a.c().getString(R.string.pop_menu_delete));
            arrayList.add(com.censivn.C3DEngine.a.c().getString(R.string.pop_menu_create_folder));
            arrayList.add(com.censivn.C3DEngine.a.c().getString(R.string.pop_menu_mulit_choice));
            Bitmap a2 = ag.a(arrayList);
            b = com.censivn.C3DEngine.a.f().a(a2, true);
            a2.recycle();
            f = new com.censivn.C3DEngine.e.a.a(5, 32, 160, 160);
            for (int i2 = 0; i2 < 5; i2++) {
                com.censivn.C3DEngine.e.a.c a3 = f.a(i2);
                a3.a(i2, 5, 1);
                a3.d();
            }
            f.z().c(b);
        }
        int[][] iArr = {new int[]{0, 126}, new int[]{160, (int) (com.censivn.C3DEngine.a.a * 54.0f)}, new int[]{136, -92}, new int[]{-136, -92}, new int[]{-166, 54}};
        f.b(0.0f);
        aa aaVar = new aa(this, iArr);
        aaVar.a(255);
        aaVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.e());
        com.censivn.C3DEngine.g.s.a(l, ThemeShellDescription.INTERACTIVE_ARRANGE_BG, aaVar);
        c.d(f);
    }

    public static void f() {
        d.az();
    }

    private static void a(com.censivn.C3DEngine.e.a.c cVar) {
        ae aeVar = new ae(d, cVar);
        cVar.D = new Number3d(0.5f, 1.0f, 1.0f);
        cVar.E = new Number3d(0.5f, 1.0f, 1.0f);
        cVar.F = new Number3d(0.5f, 1.0f, 1.0f);
        cVar.G = new Number3d(0.5f, 1.0f, 1.0f);
        cVar.c();
        cVar.l = aeVar;
    }

    static /* synthetic */ void b(int i2) {
        com.censivn.C3DEngine.b.v vVar = c;
        com.censivn.C3DEngine.b.v.u();
        if (i2 == -1) {
            if (i != -1) {
                o();
                i = -1;
                return;
            }
            return;
        }
        if (i2 != i) {
            o();
            b(i2, true);
            i = i2;
        }
    }

    static /* synthetic */ int a(MotionEvent motionEvent) {
        float[] a2 = com.censivn.C3DEngine.h.a.a(motionEvent);
        int i2 = (int) a2[0];
        int i3 = (int) a2[1];
        int i4 = (int) c.L().x;
        int i5 = (int) c.L().y;
        float b2 = com.censivn.C3DEngine.h.a.b(i4, i5, i2, i3);
        float f2 = i2 - i4;
        float atan = i3 - i5 > 0.0f ? (float) (Math.atan(f2 / r0) / 0.017453292519943295d) : ((float) (Math.atan(f2 / r0) / 0.017453292519943295d)) + 180.0f;
        if (atan < 0.0f) {
            atan += 360.0f;
        }
        float f3 = atan + (h / 2);
        if (b2 >= 50.0f * com.censivn.C3DEngine.a.a && b2 <= 200.0f * com.censivn.C3DEngine.a.a) {
            int i6 = (int) (f3 / h);
            return i6 == g ? i6 - 1 : i6;
        }
        return g;
    }

    private static void o() {
        if (i != -1) {
            b(i, false);
            i = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2, boolean z) {
        switch (i2) {
            case 0:
                if (z) {
                    e.a(i2).a(5, 0);
                    d.a(i2).a(0, 5);
                    break;
                } else {
                    e.a(i2).a(4, 0);
                    d.a(i2).a(0, 2);
                    break;
                }
            case 1:
                if (z) {
                    e.a(i2).a(5, 1);
                    d.a(i2).a(0, 5);
                    break;
                } else {
                    e.a(i2).a(4, 1);
                    d.a(i2).a(0, 2);
                    break;
                }
            case 2:
                if (z) {
                    e.a(i2).a(5, 2);
                    d.a(i2).a(0, 5);
                    break;
                } else {
                    e.a(i2).a(4, 2);
                    d.a(i2).a(0, 2);
                    break;
                }
            case 3:
                if (z) {
                    e.a(i2).a(5, 3);
                    d.a(i2).a(0, 5);
                    break;
                } else {
                    e.a(i2).a(4, 3);
                    d.a(i2).a(0, 2);
                    break;
                }
            case 4:
                if (z) {
                    e.a(i2).a(5, 4);
                    d.a(i2).a(0, 5);
                    break;
                } else {
                    e.a(i2).a(4, 4);
                    d.a(i2).a(0, 2);
                    break;
                }
            case 5:
                if (z) {
                    e.a(i2).a(5, 5);
                    d.a(i2).a(2, 0);
                    break;
                } else {
                    e.a(i2).a(4, 5);
                    d.a(i2).a(0, 0);
                    break;
                }
        }
    }

    public final void a(i iVar) {
        this.r = iVar;
    }

    @Override // com.tsf.shell.at
    public final void a(int i2) {
        if (i2 == 4) {
            com.tsf.shell.aq.b(this);
            k.a(-1, true);
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i2, KeyEvent keyEvent) {
    }
}
