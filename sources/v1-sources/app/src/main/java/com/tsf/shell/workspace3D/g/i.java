package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {
    private static TextureElement a;
    private static TextureElement b;
    private static TextureElement c;
    private static com.tsf.shell.workspace3D.k.a.a d;
    private static com.censivn.C3DEngine.b.v e;
    private static com.censivn.C3DEngine.b.r f;
    private static com.censivn.C3DEngine.b.r g;
    private static com.censivn.C3DEngine.b.r h;
    private static com.censivn.C3DEngine.b.r i;
    private static String j;
    private static ViewGroup.LayoutParams x = new ViewGroup.LayoutParams(-1, -1);
    private ArrayList m;
    private o n;
    private com.censivn.C3DEngine.b.r o;
    private y q;
    private float t;
    private float u;
    private com.censivn.C3DEngine.e.a.a v;
    private boolean k = true;
    private boolean l = false;
    private boolean p = false;
    private boolean s = false;
    private boolean w = true;
    private ArrayList r = new ArrayList();

    static {
        a = null;
        b = null;
        c = null;
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        j = com.censivn.C3DEngine.a.c().getString(R.string.notic_line_picker_overflow);
        d = new com.tsf.shell.workspace3D.k.a.a(com.censivn.C3DEngine.a.c());
        com.censivn.C3DEngine.b.v vVar = new com.censivn.C3DEngine.b.v();
        e = vVar;
        vVar.a_(true);
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.PICKER_LINE);
        a = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
        Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.PICKER_FOCUS);
        c = com.censivn.C3DEngine.a.f().a(bitmap2, true);
        bitmap2.recycle();
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(5.0f, 10.0f, 1, 1, true);
        f = bVar;
        bVar.c((Boolean) false);
        for (int i2 = 0; i2 < 4; i2++) {
            f.E().pxY(i2, f.E().pxY(i2) + 10.0f);
        }
        f.z().c(a);
        f.L().y = 6.0f;
        e.d(f);
        Bitmap bitmap3 = themeShellDescription.getBitmap(ThemeShellDescription.PICKER_POINT);
        b = com.censivn.C3DEngine.a.f().a(bitmap3, true);
        bitmap3.recycle();
        com.censivn.C3DEngine.e.b bVar2 = new com.censivn.C3DEngine.e.b(32.0f, 32.0f, 1, 1, true);
        i = bVar2;
        bVar2.z().c(b);
        com.censivn.C3DEngine.e.b bVar3 = new com.censivn.C3DEngine.e.b(32.0f, 32.0f, 1, 1, true);
        g = bVar3;
        bVar3.z().c(b);
        e.d(g);
        com.censivn.C3DEngine.e.b bVar4 = new com.censivn.C3DEngine.e.b(128.0f, 128.0f, 1, 1, true);
        h = bVar4;
        bVar4.z().c(c);
    }

    public final void a(o oVar) {
        this.n = oVar;
    }

    public final void a(com.censivn.C3DEngine.b.r rVar) {
        this.o = rVar;
    }

    public final void a() {
        this.s = true;
    }

    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!this.l) {
            com.censivn.C3DEngine.a.a().b(new j(this, motionEvent, motionEvent2));
        }
    }

    public static boolean a(com.censivn.C3DEngine.b.r rVar, float f2, float f3, float f4, float f5) {
        Number3d clone = rVar.L().m2clone();
        clone.x += com.censivn.C3DEngine.a.n;
        clone.y = com.censivn.C3DEngine.a.o - clone.y;
        if (a(f2, f3, f4, f5, rVar.al() + clone.x, rVar.am() + clone.y, rVar.ao() + clone.x, rVar.am() + clone.y) || a(f2, f3, f4, f5, rVar.ao() + clone.x, rVar.am() + clone.y, rVar.ao() + clone.x, rVar.ap() + clone.y) || a(f2, f3, f4, f5, rVar.al() + clone.x, rVar.ap() + clone.y, rVar.ao() + clone.x, rVar.ap() + clone.y) || a(f2, f3, f4, f5, rVar.al() + clone.x, rVar.am() + clone.y, rVar.al() + clone.x, rVar.ap() + clone.y)) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MotionEvent motionEvent) {
        this.q = this.n.c();
        if (this.q != null) {
            this.q.a(this);
            if (motionEvent == null) {
                this.q.c();
            } else {
                float[] a2 = com.censivn.C3DEngine.h.a.a(motionEvent, new float[2]);
                this.q.a((int) a2[0], (int) a2[1]);
                y yVar = this.q;
                y.f();
            }
            h();
        }
        return this.q == null;
    }

    private void h() {
        if (e.P() != null) {
            m mVar = new m(this);
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(mVar);
            bf.m();
            e.Q();
            bf.m();
            h.Q();
            bf.m();
            i.Q();
            if (this.v != null) {
                this.v.Q();
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(false);
        }
        this.r.clear();
    }

    public final void a(MotionEvent motionEvent) {
        if (this.l) {
            this.l = false;
            return;
        }
        this.k = true;
        h();
        if (this.p) {
            if (this.q == null) {
                if (b(motionEvent)) {
                    this.n.a();
                }
            } else {
                y yVar = this.q;
                y.d();
                if (!this.q.b()) {
                    this.n.a();
                } else {
                    com.censivn.C3DEngine.b.m d2 = com.censivn.C3DEngine.b.m.d();
                    y yVar2 = this.q;
                    d2.a(y.a(), true);
                    if (this.q != null && this.q.b()) {
                        y yVar3 = this.q;
                        y.a().f(null);
                    }
                }
            }
            this.p = false;
        }
    }

    static /* synthetic */ void a(float f2) {
        f.E().pxY(2, f2);
        f.E().pxY(3, f2);
        g.L().y = 18.0f + f2;
    }

    static /* synthetic */ void a(i iVar, MotionEvent motionEvent) {
        float[] b2 = com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY());
        e.L().x = b2[0];
        e.L().y = b2[1];
        bf.m().a(e);
        if (iVar.v != null) {
            e.d(iVar.v);
        }
        if (iVar.s) {
            bf.m().a(h);
            h.L().x = b2[0];
            h.L().y = b2[1];
        }
        i.L().x = b2[0];
        i.L().y = b2[1];
        bf.m().a(i);
        n nVar = new n();
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(nVar);
    }

    static /* synthetic */ void a(i iVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        float x2 = motionEvent2.getX() - motionEvent.getX();
        float atan = motionEvent2.getY() - motionEvent.getY() > 0.0f ? ((float) (Math.atan(x2 / r3) / 0.017453292519943295d)) + 180.0f : (float) (Math.atan(x2 / r3) / 0.017453292519943295d);
        e.M().z = atan;
        if ((atan < 181.0f) && ((atan > (-1.0f) ? 1 : (atan == (-1.0f) ? 0 : -1)) > 0)) {
            if (iVar.w) {
                iVar.w = false;
                if (iVar.v != null) {
                    com.censivn.C3DEngine.e.a.c a2 = iVar.v.a(0);
                    a2.i = true;
                    a2.j = true;
                    a2.d();
                    return;
                }
                return;
            }
            return;
        }
        if (iVar.w) {
            return;
        }
        iVar.w = true;
        if (iVar.v != null) {
            com.censivn.C3DEngine.e.a.c a3 = iVar.v.a(0);
            a3.i = false;
            a3.j = false;
            a3.d();
        }
    }

    private static boolean a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = ((d4 - d2) * (d9 - d7)) - ((d5 - d3) * (d8 - d6));
        if (d10 == 0.0d) {
            return false;
        }
        double d11 = (((d3 - d7) * (d8 - d6)) - ((d2 - d6) * (d9 - d7))) / d10;
        double d12 = (((d3 - d7) * (d4 - d2)) - ((d2 - d6) * (d5 - d3))) / d10;
        if (d11 < 0.0d || d11 > 1.0d || d12 < 0.0d || d12 > 1.0d) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.q = null;
    }
}
