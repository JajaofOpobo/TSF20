package com.tsf.shell.workspace3D.h;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ab {
    private int B;
    private a F;
    private TextureElement K;
    private com.censivn.C3DEngine.b.v M;
    final /* synthetic */ l a;
    private float b;
    private ThemeDescription c;
    private TextureElement d;
    private com.censivn.C3DEngine.e.b e;
    private com.censivn.C3DEngine.b.v f;
    private com.censivn.C3DEngine.b.v g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float r;
    private float s;
    private float t;
    private float w;
    private a x;
    private Number3d y;
    private float z;
    private float p = 32.0f;
    private float q = -50.0f;
    private boolean u = false;
    private boolean v = false;
    private boolean A = false;
    private int C = 1;
    private int D = 2;
    private int E = 0;
    private Number3d N = new Number3d(0.0f, 0.0f, 0.0f);
    private com.censivn.C3DEngine.e.b L = new com.censivn.C3DEngine.e.b(106.0f * com.censivn.C3DEngine.a.b, 106.0f * com.censivn.C3DEngine.a.b, (byte) 0);
    private TextureElement H = com.tsf.shell.workspace3D.bf.s().a();
    private TextureElement I = com.tsf.shell.workspace3D.bf.s().c();
    private TextureElement J = com.tsf.shell.workspace3D.bf.s().d();
    private com.censivn.C3DEngine.e.b G = new com.censivn.C3DEngine.e.b(this.H.width * com.censivn.C3DEngine.a.b, this.H.height * com.censivn.C3DEngine.a.b, (byte) 0);

    public ab(l lVar) {
        this.a = lVar;
        this.G.N().setAll(0.0f, 0.0f, 1.0f);
        this.G.z().c(this.H);
        this.G.a(3.0f, 3.0f, 3.0f);
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(this.J.width * com.censivn.C3DEngine.a.b, this.J.height * com.censivn.C3DEngine.a.b, (byte) 0);
        bVar.z().c(this.J);
        ThemeDockDescription themeDockDescription = ThemeManager.getInstance().getCurrentThemeDescription().dock;
        bVar.L().x = themeDockDescription.dockTrashcanButtonPointOffsetX * com.censivn.C3DEngine.a.b;
        bVar.L().y = themeDockDescription.dockTrashcanButtonPointOffsetY * com.censivn.C3DEngine.a.b;
        this.M = new com.censivn.C3DEngine.b.v();
        PositionNumber3d L = this.M.L();
        PositionNumber3d L2 = this.G.L();
        float f = com.censivn.C3DEngine.a.h + (100.0f * com.censivn.C3DEngine.a.b);
        L2.y = f;
        L.y = f;
        this.M.d(bVar);
        this.b = 0.017453292f;
        this.k = com.censivn.C3DEngine.a.j;
        this.r = (-this.k) - (200.0f * com.censivn.C3DEngine.a.b);
        this.s = (com.censivn.C3DEngine.a.g + ((int) (Math.sin(this.b * this.p) * this.k))) - (100.0f * com.censivn.C3DEngine.a.b);
        this.z = (float) (this.r + (Math.cos(this.b * this.p) * this.k));
        this.t = ((float) (this.s - (Math.sin(this.b * this.p) * this.k))) - (l.b / 2);
        this.l = 360.0f / (((float) ((this.k * 2.0f) * 3.141592653589793d)) / (l.a - 40));
        this.n = this.l / (l.a - 40);
        this.m = this.l * this.b;
        this.g = new com.censivn.C3DEngine.b.v();
        this.f = new ac(this);
        this.c = ThemeManager.getInstance().getCurrentThemeDescription();
        this.e = new com.censivn.C3DEngine.e.b(64.0f, 64.0f);
        this.e.L().x = com.censivn.C3DEngine.a.e + (com.censivn.C3DEngine.a.a * 38.0f);
        this.e.L().y = com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.a * 38.0f);
        this.e.c((Boolean) false);
        this.e.e(false);
        af afVar = new af(this, this.e);
        this.e.a(2.0f, 2.0f, 2.0f);
        this.e.a((com.censivn.C3DEngine.b.l) afVar);
    }

    public final void a() {
        this.k = com.censivn.C3DEngine.a.j;
        this.r = (-this.k) - (200.0f * com.censivn.C3DEngine.a.b);
        this.s = (com.censivn.C3DEngine.a.g + ((int) (Math.sin(this.b * this.p) * this.k))) - (100.0f * com.censivn.C3DEngine.a.b);
        this.z = (float) (this.r + (Math.cos(this.b * this.p) * this.k));
        this.t = ((float) (this.s - (Math.sin(this.b * this.p) * this.k))) - (l.b / 2);
        this.l = 360.0f / (((float) ((2.0f * this.k) * 3.141592653589793d)) / (l.a - 40));
        this.n = this.l / (l.a - 40);
        this.m = this.l * this.b;
        if (this.h) {
            com.censivn.C3DEngine.g.s.a(this.f);
            this.f.L().z = this.r;
            this.f.M().x = this.p;
            this.f.L().y = this.s;
            this.f.M().y = this.w;
            Iterator it = this.a.i.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != this.F) {
                    com.censivn.C3DEngine.g.s.a(aVar);
                    an b = b(aVar);
                    aVar.L().setAll(b.a, 0.0f, b.b);
                    aVar.M().setAll(0.0f, b.c, 0.0f);
                    aVar.N().setAll(1.0f, 1.0f, 1.0f);
                }
            }
        }
        this.e.L().x = com.censivn.C3DEngine.a.e + (com.censivn.C3DEngine.a.a * 38.0f);
        this.e.L().y = com.censivn.C3DEngine.a.g - (com.censivn.C3DEngine.a.a * 38.0f);
    }

    public final boolean b() {
        return this.h;
    }

    public final com.censivn.C3DEngine.e.b c() {
        return this.L;
    }

    static /* synthetic */ void A(ab abVar) {
        if (abVar.h || abVar.u) {
            return;
        }
        abVar.L.z().d();
        if (abVar.K != null) {
            com.censivn.C3DEngine.a.f().a(abVar.K);
        }
        Bitmap bitmap = abVar.c.shell.getBitmap(511);
        abVar.K = com.censivn.C3DEngine.a.f().a(bitmap, false);
        bitmap.recycle();
        abVar.L.z().c(abVar.K);
        if (abVar.d == null) {
            Bitmap bitmap2 = abVar.c.shell.getBitmap(ThemeShellDescription.PAGE_PREVIEW_EDIT_EXIT_BUTTON);
            abVar.d = com.censivn.C3DEngine.a.f().a(bitmap2, true);
            bitmap2.recycle();
            abVar.e.z().c(abVar.d);
        }
        abVar.e.Q();
        abVar.a.f.d(abVar.e);
        abVar.e.e(false);
        abVar.e.N().setAll(0.0f, 0.0f, 1.0f);
        ag agVar = new ag(abVar);
        agVar.j(1.0f);
        agVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(abVar.e);
        agVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
        com.censivn.C3DEngine.g.s.a(abVar.e, ThemeShellDescription.PAGE_PREVIEW_SELECT, agVar);
        l.h(abVar.a);
        abVar.h = true;
        abVar.u = true;
        abVar.j = 90.0f;
        abVar.w = abVar.j - (abVar.a.k.p() * abVar.l);
        Iterator it = abVar.a.i.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.n();
            Number3d c = aVar.c(new Number3d());
            Number3d a = aVar.a(new Number3d());
            aVar.Q();
            abVar.f.d(c);
            aVar.L().setAllFrom(c);
            aVar.M().setAllFrom(a);
            aVar.Q();
            abVar.f.d(aVar);
            abVar.a(aVar, 750);
        }
        abVar.g();
        abVar.g.Q();
        abVar.f.Q();
        abVar.a.f.a(abVar.g, 1);
        abVar.a.f.a(abVar.f, 1);
        ai aiVar = new ai(abVar);
        if (abVar.a.l < 13) {
            abVar.f();
        }
        com.censivn.C3DEngine.g.s.a(abVar.f);
        aiVar.i(abVar.r);
        aiVar.c(abVar.p);
        aiVar.h(abVar.s);
        aiVar.d(abVar.w);
        com.censivn.C3DEngine.g.s.a(abVar.f, 750, aiVar);
    }

    private void a(MotionEvent motionEvent) {
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        this.N.reset();
        this.M.c(this.N);
        this.M.M().z = com.censivn.C3DEngine.h.a.d(this.N.x, this.N.y, a[0], a[1]) - 90.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.F = this.a.M();
        this.F.n();
        this.F.a(-1);
        this.F.M().x = this.q;
        this.F.M().y = 0.0f;
        this.F.M().z = 0.0f;
        this.F.L().x = 0.0f;
        this.F.L().z = this.z - (((0.0f - this.t) + 50.0f) / 2.0f);
        this.F.L().y = com.censivn.C3DEngine.a.h;
        this.F.h(true);
        this.F.j(false);
        this.g.d(this.F);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.h(0.0f);
        uVar.f(0.0f);
        uVar.j(1.0f);
        uVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(this.F, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    private void g() {
        this.i = this.j - ((this.f.aB() - 1) * this.l);
    }

    private void a(a aVar, int i) {
        aVar.e(false);
        al alVar = new al(this, aVar);
        com.censivn.C3DEngine.g.s.a(aVar);
        an b = b(aVar);
        alVar.f(b.a);
        alVar.i(b.b);
        alVar.h(0.0f);
        alVar.c(0.0f);
        alVar.d(b.c);
        alVar.j(1.0f);
        alVar.k(1.0f);
        com.censivn.C3DEngine.g.s.a(aVar, i, alVar);
    }

    private an b(a aVar) {
        an anVar = new an(this);
        int p = aVar.p();
        anVar.a = (float) (Math.cos((p * (-this.m)) - 3.141592653589793d) * this.k);
        anVar.b = (float) (Math.sin((p * (-this.m)) - 3.141592653589793d) * this.k);
        anVar.c = (p * this.l) - 90.0f;
        return anVar;
    }

    static /* synthetic */ void i(ab abVar) {
        if (!abVar.h || abVar.u) {
            return;
        }
        ArrayList arrayList = (ArrayList) abVar.g.aD().clone();
        if (abVar.g.aB() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((com.censivn.C3DEngine.b.r) it.next());
                if (aVar.p() == -1) {
                    if (aVar.o()) {
                        abVar.d(aVar);
                    } else {
                        abVar.b(aVar, ThemeShellDescription.PAGE_PREVIEW_SELECT);
                    }
                }
            }
        }
        abVar.a.F.a(abVar.a.k);
        abVar.e.e(false);
        ah ahVar = new ah(abVar);
        ahVar.j(0.0f);
        ahVar.k(0.0f);
        com.censivn.C3DEngine.g.s.a(abVar.e);
        com.censivn.C3DEngine.g.s.a(abVar.e, 250, ahVar);
        abVar.u = true;
        for (int i = 0; i < abVar.a.l; i++) {
            a aVar2 = (a) abVar.a.i.get(i);
            if (i > 0) {
                if (i == 1) {
                    if (abVar.a.l == 2) {
                        aVar2.b((a) null);
                        aVar2.a((a) null);
                    } else {
                        aVar2.b((a) abVar.a.i.get(i + 1));
                        aVar2.a((a) abVar.a.i.get(abVar.a.l - 1));
                    }
                } else if (i != abVar.a.l - 1) {
                    aVar2.b((a) abVar.a.i.get(i + 1));
                    aVar2.a((a) abVar.a.i.get(i - 1));
                } else if (abVar.a.l == 3) {
                    aVar2.b((a) null);
                    aVar2.a((a) abVar.a.i.get(i - 1));
                } else {
                    aVar2.b((a) abVar.a.i.get(1));
                    aVar2.a((a) abVar.a.i.get(i - 1));
                }
            }
            aVar2.m();
            Number3d c = aVar2.c(new Number3d());
            Number3d a = aVar2.a(new Number3d());
            aVar2.Q();
            aVar2.e(true);
            abVar.a.g.d(c);
            aVar2.L().setAllFrom(c);
            aVar2.M().setAllFrom(a);
            abVar.a.g.d(aVar2);
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            com.censivn.C3DEngine.g.s.a(aVar2);
            abVar.a.F.a(uVar, aVar2);
            com.censivn.C3DEngine.g.s.a(aVar2, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        }
        com.censivn.C3DEngine.g.s.a(abVar.f, ThemeShellDescription.PAGE_PREVIEW_SELECT, new am(abVar));
        abVar.f.L().z = 0.0f;
        abVar.f.L().y = 0.0f;
        abVar.f.M().x = 0.0f;
        abVar.f.M().y = 0.0f;
        abVar.a.k.az();
        abVar.a.d();
    }

    public final void d() {
        this.v = true;
        float f = this.f.M().y;
        this.o = f;
        this.w = f;
        this.f.a_(true);
        com.censivn.C3DEngine.b.v vVar = this.f;
        com.censivn.C3DEngine.b.v.u();
    }

    public final void e() {
        this.v = false;
    }

    public final void a(float f) {
        this.w += this.n * f;
    }

    public final void b(float f) {
        this.w = this.o + (this.n * f);
    }

    public final void a(a aVar, MotionEvent motionEvent) {
        if (aVar.aG() != -1 && !aVar.o() && this.a.l > 2) {
            this.G.Q();
            this.M.Q();
            this.a.f.d(this.G);
            this.a.f.d(this.M);
            aj ajVar = new aj(this);
            ajVar.j(1.0f);
            ajVar.k(1.0f);
            com.censivn.C3DEngine.g.s.a(this.G);
            ajVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
            com.censivn.C3DEngine.g.s.a(this.G, ThemeShellDescription.PAGE_PREVIEW_SELECT, ajVar);
        }
        a(motionEvent);
        com.tsf.shell.g.h.a();
        this.x = aVar;
        aVar.a_(true);
        Number3d c = aVar.c(new Number3d());
        Number3d a = aVar.a(new Number3d());
        aVar.Q();
        this.g.d(c);
        this.g.b(a);
        aVar.L().setAllFrom(c);
        aVar.M().setAllFrom(a);
        this.g.d(aVar);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        com.censivn.C3DEngine.g.s.a(aVar);
        uVar.j(1.1f);
        uVar.k(1.1f);
        uVar.d(0.0f);
        com.censivn.C3DEngine.g.s.a(aVar, 250, uVar);
        if (aVar.s() != null && (aVar.s() instanceof Number3d)) {
            this.y = (Number3d) aVar.s();
            this.y.x = this.x.L().x;
            this.y.y = this.x.L().y;
            return;
        }
        this.y = this.x.L().m2clone();
        this.y.z = this.z;
    }

    public final void b(a aVar, MotionEvent motionEvent) {
        boolean z;
        if (aVar.aG() == -1 || aVar.o() || this.a.l <= 2) {
            z = false;
        } else {
            ak akVar = new ak(this);
            akVar.j(0.0f);
            akVar.k(0.0f);
            com.censivn.C3DEngine.g.s.a(this.G);
            akVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
            com.censivn.C3DEngine.g.s.a(this.G, ThemeShellDescription.PAGE_PREVIEW_SELECT, akVar);
            c(aVar);
            z = true;
        }
        this.B = this.E;
        aVar.a_(false);
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        if (a[1] - this.t > -50.0f) {
            a(a[0], a[1], aVar);
            b(aVar, 250);
            if (aVar.o()) {
                aVar.h(false);
                this.a.O();
                this.F = null;
                if (this.a.l < 13) {
                    f();
                }
            }
        } else {
            if (aVar.p() != -1) {
                aVar.a((Object) this.y.m2clone());
                int p = aVar.p();
                int size = this.a.i.size();
                aVar.a(-1);
                this.a.i.remove(aVar);
                this.a.i.add(aVar);
                for (int i = p; i < size; i++) {
                    a aVar2 = (a) this.a.i.get(i);
                    if (aVar2.p() != -1) {
                        aVar2.a(i);
                        a(aVar2, 250);
                    }
                }
                g();
            }
            if (aVar.aY() == 0 && z) {
                d(aVar);
                z = false;
            } else {
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                com.censivn.C3DEngine.g.s.a(aVar);
                uVar.j(1.0f);
                uVar.k(1.0f);
                uVar.d(0.0f);
                uVar.e(0.0f);
                com.censivn.C3DEngine.g.s.a(aVar, 250, uVar);
            }
        }
        if (z) {
            float[] a2 = com.censivn.C3DEngine.h.a.a(motionEvent);
            if (this.G.b(a2[0], a2[1])) {
                d(aVar);
            }
        }
    }

    public final void a(a aVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent2);
        this.x.L().x = this.y.x + ((motionEvent2.getX() - motionEvent.getX()) * 1.3f);
        this.x.L().y = this.y.y - (motionEvent2.getY() - motionEvent.getY());
        a(motionEvent2);
        com.censivn.C3DEngine.a.a().b(new ad(this, a, aVar, motionEvent2));
    }

    static /* synthetic */ void a(ab abVar, a aVar) {
        if (abVar.A) {
            return;
        }
        abVar.A = true;
        aVar.a((short) 180, (short) 255, (short) 50, (short) 0);
        abVar.G.z().d();
        abVar.G.z().c(abVar.I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(a aVar) {
        if (this.A) {
            this.A = false;
            aVar.K();
            this.G.z().d();
            this.G.z().c(this.H);
        }
    }

    static /* synthetic */ void a(ab abVar, float f, float f2, a aVar) {
        if (f > (com.censivn.C3DEngine.a.j / 2) - (com.censivn.C3DEngine.a.a * 50.0f)) {
            abVar.B = abVar.C;
        } else if (f < (-r0) + (com.censivn.C3DEngine.a.a * 50.0f)) {
            abVar.B = abVar.D;
        } else {
            abVar.a(f, f2, aVar);
        }
    }

    private void a(float f, float f2, a aVar) {
        a aVar2;
        this.B = this.E;
        com.censivn.C3DEngine.b.r b = this.f.b(f, f2, true);
        if (b != null) {
            if (b == null) {
                float f3 = this.f.M().y;
                if (f3 > this.j) {
                    f3 = this.j;
                } else if (f3 < this.i) {
                    f3 = this.i;
                }
                aVar2 = (a) this.a.i.get(((int) (((this.j - f3) / (this.j - this.i)) * (this.f.aB() - 1))) + 1);
            } else {
                aVar2 = (a) b.P();
            }
            if (aVar2.aG() == -1 && aVar == (aVar2 = this.a.l())) {
                aVar.a(1);
                return;
            }
            int p = aVar2.p();
            int size = p == -1 ? this.a.i.size() - 1 : p;
            int p2 = aVar.p();
            if (p2 == -1) {
                int size2 = this.a.i.size();
                for (int i = size; i < size2; i++) {
                    a aVar3 = (a) this.a.i.get(i);
                    if (aVar3.p() != -1) {
                        aVar3.a(i + 1);
                        a(aVar3, 250);
                    }
                }
                this.a.i.remove(aVar);
                this.a.i.add(size, aVar);
                aVar.a(size);
                return;
            }
            if (size > p2) {
                int i2 = p2 + 1;
                while (true) {
                    int i3 = i2;
                    if (i3 >= size + 1) {
                        this.a.i.remove(aVar);
                        this.a.i.add(size, aVar);
                        aVar.a(size);
                        return;
                    } else {
                        a aVar4 = (a) this.a.i.get(i3);
                        aVar4.a(i3 - 1);
                        a(aVar4, 250);
                        i2 = i3 + 1;
                    }
                }
            } else {
                for (int i4 = size; i4 < p2; i4++) {
                    a aVar5 = (a) this.a.i.get(i4);
                    aVar5.a(i4 + 1);
                    a(aVar5, 250);
                }
                this.a.i.remove(aVar);
                this.a.i.add(size, aVar);
                aVar.a(size);
            }
        }
    }

    private void d(a aVar) {
        if (this.a.k == aVar) {
            this.a.a((a) this.a.i.get(0), false);
        }
        if (this.a.p == aVar) {
            this.a.a((a) this.a.i.get(1));
        }
        ae aeVar = new ae(this, aVar);
        aeVar.j(0.0f);
        aeVar.k(0.0f);
        aeVar.l(0.0f);
        aeVar.f(0.0f);
        aeVar.h(com.censivn.C3DEngine.a.h);
        com.censivn.C3DEngine.g.s.a(aVar);
        com.censivn.C3DEngine.g.s.a(aVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, aeVar);
        l.a(this.a, aVar);
        this.a.O();
    }

    private void b(a aVar, int i) {
        Number3d c = aVar.c(new Number3d());
        Number3d a = aVar.a(new Number3d());
        aVar.Q();
        this.f.d(c);
        this.f.b(a);
        a.z = 0.0f;
        a.x = 0.0f;
        a.y = 0.0f;
        aVar.L().setAllFrom(c);
        aVar.M().x = 0.0f;
        aVar.M().y = -this.f.M().y;
        aVar.M().z = 0.0f;
        aVar.a((Object) null);
        if (aVar.p() == -1) {
            aVar.a(this.f.aB());
        }
        this.f.d(aVar);
        g();
        this.a.i.remove(aVar);
        this.a.i.add(aVar.p(), aVar);
        a(aVar, i);
    }

    public final void a(a aVar) {
        if (!aVar.o()) {
            if (this.a.p == aVar) {
                this.a.a(aVar, false);
                return;
            } else {
                this.a.a(aVar);
                return;
            }
        }
        a(0.0f, this.t, aVar);
        b(aVar, ThemeShellDescription.PAGE_PREVIEW_SELECT);
        aVar.h(false);
        this.a.O();
        this.F = null;
        if (this.a.l < 13) {
            f();
        }
    }
}
