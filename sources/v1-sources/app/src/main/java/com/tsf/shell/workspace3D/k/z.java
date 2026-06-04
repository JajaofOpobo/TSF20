package com.tsf.shell.workspace3D.k;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class z extends j {
    private static com.censivn.C3DEngine.e.b H;
    private static TextureElement I;
    private static TextureElement J;
    private static TextureElement K;
    private com.tsf.shell.workspace3D.g.c.a E;
    private ArrayList Q;
    private static com.tsf.shell.workspace3D.g.c.a a = new com.tsf.shell.workspace3D.g.c.a();
    private static com.tsf.shell.workspace3D.g.c.a C = new com.tsf.shell.workspace3D.g.c.a();
    private static ArrayList D = new ArrayList();
    public static int B = (int) (6.0f * com.censivn.C3DEngine.a.a);
    private boolean G = false;
    private boolean O = false;
    private int P = 0;
    public int A = 0;
    private float R = 0.65f;
    private float S = 0.65f;
    private Runnable F = new aa(this);

    public final com.tsf.shell.workspace3D.g.c.o aK() {
        if (P() == null) {
            return null;
        }
        if (P() instanceof com.tsf.shell.workspace3D.g.c.o) {
            return (com.tsf.shell.workspace3D.g.c.o) P();
        }
        if (bc() != null) {
            return (com.tsf.shell.workspace3D.g.c.o) bc().ba();
        }
        return null;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public void b_() {
        super.b_();
        if (bz() && !bf()) {
            bG();
        }
        com.tsf.shell.tips.b.a(9);
        com.tsf.shell.tips.b.a(4);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public void a_() {
        super.a_();
        if (!this.G) {
            bw();
        } else {
            this.G = false;
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void bq() {
        super.bq();
        aH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
        if (this.E != null) {
            this.E.b();
            this.E = null;
        }
    }

    public final void bv() {
        this.G = true;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aI() {
        super.aI();
        com.censivn.C3DEngine.a.a().c(this.F);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void d_() {
        if (bz() && (aw() instanceof com.tsf.shell.workspace3D.a.d) && !((com.tsf.shell.workspace3D.a.d) aw()).b()) {
            bG();
        }
        super.d_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public void e_() {
        super.e_();
    }

    public final void bw() {
        com.tsf.shell.workspace3D.g.c.a aVar;
        if (aK() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("widget container callback is null", toString());
            com.flurry.android.t.a("EVENT_ISSUSE_WIDGET_MENU_CONTAINER", hashMap);
        } else if (!aY()) {
            if (a.a()) {
                aVar = !C.a() ? C : null;
            } else {
                aVar = a;
            }
            this.E = aVar;
            if (this.E != null) {
                ArrayList aP = aK().aP();
                ArrayList aO = aK().aO();
                D.clear();
                this.E.a(this, com.censivn.C3DEngine.a.a * 50.0f, a(D), aO, aP);
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public void n() {
        if (bz()) {
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                bf.l().a((j) it.next());
            }
            bE();
        }
        if (bA()) {
            bC();
        }
        super.n();
    }

    public ArrayList a(ArrayList arrayList) {
        return arrayList;
    }

    public final void bx() {
        if (I == null) {
            ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
            Bitmap bitmap = themeShellDescription.getBitmap(600);
            I = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
            Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.APP_MULTI_NOT_CHOICE);
            J = com.censivn.C3DEngine.a.f().a(bitmap2, true);
            bitmap2.recycle();
        }
        if (H == null) {
            H = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1, true);
            K = new TextureElement(I.id, false);
            H.z().b(K);
            H.L().x = 32.0f * com.censivn.C3DEngine.a.a;
            H.L().y = 55.0f * com.censivn.C3DEngine.a.a;
        }
        this.R = 0.65f;
        if (bA()) {
            this.S = 1.0f;
        } else {
            this.S = 0.65f;
        }
        this.O = true;
    }

    public final void by() {
        this.O = false;
        this.P = 0;
        this.S = 0.65f;
    }

    public final boolean bz() {
        return (this.Q == null || this.Q.size() == 0) ? false : true;
    }

    public final boolean bA() {
        return this.P == 1;
    }

    public final void bB() {
        if (aV() != null) {
            if (bA()) {
                bC();
                return;
            }
            this.S = 1.0f;
            this.P = 1;
            aV().a();
            aV().e().add(this);
        }
    }

    public final void bC() {
        this.S = 0.65f;
        this.P = 0;
        aV().e().remove(this);
    }

    @Override // com.censivn.C3DEngine.b.v
    public void aF() {
        super.aF();
        if (this.O) {
            H.b(I());
            this.R += (this.S - this.R) * 0.15f;
            H.N().setAll(this.R, this.R, 1.0f);
            if (this.P == 0) {
                K.id = J.id;
            } else {
                K.id = I.id;
            }
            H.f();
        }
    }

    public final void a(z zVar) {
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        if (zVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            this.A++;
        }
        zVar.by();
        zVar.a((Boolean) true);
        zVar.Q();
        zVar.N().setAll(1.0f, 1.0f, 1.0f);
        this.Q.add(zVar);
        int size = this.Q.size();
        a(zVar, 0);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.f(B * size);
        uVar.h(size * B);
        uVar.j(1.0f);
        uVar.k(1.0f);
        uVar.a(255);
        uVar.e(0.0f);
        com.censivn.C3DEngine.g.s.a(zVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
    }

    public final boolean bD() {
        return this.A > 0 || (this instanceof com.tsf.shell.workspace3D.k.c.b.ac);
    }

    public final void bE() {
        this.A = 0;
        this.Q.clear();
    }

    public final void bF() {
        if (this.Q != null && this.Q.size() != 0) {
            com.censivn.C3DEngine.b.v vVar = (com.censivn.C3DEngine.b.v) P();
            int f = vVar.f(this);
            int size = this.Q.size();
            for (int i = 0; i < size; i++) {
                j jVar = (j) this.Q.get(i);
                com.censivn.C3DEngine.g.s.a(jVar);
                Number3d.TEMPNUMBER3D.reset();
                jVar.c(Number3d.TEMPNUMBER3D);
                vVar.d(Number3d.TEMPNUMBER3D);
                jVar.L().x = Number3d.TEMPNUMBER3D.x;
                jVar.L().y = Number3d.TEMPNUMBER3D.y;
                jVar.Q();
                vVar.a(jVar, f);
            }
            bE();
        }
    }

    public final void bG() {
        if (this.Q == null || this.Q.size() == 0) {
            return;
        }
        com.tsf.shell.workspace3D.h.a bc = bc();
        if (bc.i(this)) {
            bc.j(this);
            int size = this.Q.size();
            for (int i = 0; i < size; i++) {
                j jVar = (j) this.Q.get(i);
                com.censivn.C3DEngine.g.s.a(jVar);
                jVar.L().x = L().x + (B * (i + 1));
                jVar.L().y = L().y + (B * (i + 1));
                jVar.Q();
            }
            com.tsf.shell.workspace3D.g.b.b bVar = new com.tsf.shell.workspace3D.g.b.b(bc, true, true);
            int i2 = 400 > com.censivn.C3DEngine.a.j ? (com.censivn.C3DEngine.a.j / 2) - 20 : 200;
            bVar.a(i2, i2);
            this.Q.add(this);
            bVar.a(this.Q);
            bE();
        }
    }

    public final ArrayList bH() {
        return this.Q;
    }
}
