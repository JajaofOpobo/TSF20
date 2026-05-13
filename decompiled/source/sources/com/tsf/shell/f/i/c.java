package com.tsf.shell.f.i;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.f.e.e;
import com.tsf.shell.f.f.g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends b {
    private static k b;
    public static TextureElement f;
    public static TextureElement g;
    public static TextureElement h;
    public static int j = (int) (6.0f * com.censivn.C3DEngine.b.b.a.a);
    private boolean a;
    public int i;
    private boolean k;
    private int l;
    private float m;
    private float n;

    public c(ItemInfo itemInfo) {
        super(itemInfo);
        this.a = false;
        this.k = false;
        this.l = 0;
        this.i = 0;
        this.m = 0.75f;
        this.n = 0.75f;
    }

    public com.tsf.shell.f.e.f.b ag() {
        if (parent() == null) {
            return null;
        }
        if (parent() instanceof com.tsf.shell.f.e.f.b) {
            return (com.tsf.shell.f.e.f.b) parent();
        }
        if (z() != null) {
            return (com.tsf.shell.f.e.f.b) z().S();
        }
        return null;
    }

    @Override // com.tsf.shell.f.i.b
    public void m_() {
        if (!this.a) {
            ai();
        } else {
            this.a = false;
        }
    }

    @Override // com.tsf.shell.f.i.b
    public void c() {
        super.c();
        if (as() && !L()) {
            ax();
        }
    }

    @Override // com.tsf.shell.f.i.b
    public void n_() {
        super.n_();
    }

    @Override // com.tsf.shell.f.i.b
    public void aa() {
        super.aa();
        k();
    }

    private void k() {
        if (com.tsf.shell.manager.a.v.e.d() != null) {
            com.tsf.shell.manager.a.v.e.d().a(true);
        }
    }

    public void ah() {
        this.a = true;
    }

    @Override // com.tsf.shell.f.i.b
    public void ab() {
        super.ab();
        this.a = true;
    }

    @Override // com.tsf.shell.f.i.b
    public void o_() {
        if (as() && (getMouseEventListener() instanceof com.tsf.shell.f.i.a.c) && !((com.tsf.shell.f.i.a.c) getMouseEventListener()).a()) {
            ax();
        }
        super.o_();
    }

    @Override // com.tsf.shell.f.i.b
    public void p_() {
        super.p_();
        this.a = true;
    }

    public void ai() {
        if (ag() != null && !D()) {
            ArrayList<Integer> s = ag().s();
            com.tsf.shell.manager.a.v.e.d().a(this, ag().d(), ag().r(), s);
        }
    }

    @Override // com.tsf.shell.f.i.b
    public void g() {
        if (ao()) {
            ar();
        }
        super.g();
    }

    public ArrayList<Integer> a(ArrayList<Integer> arrayList) {
        return arrayList;
    }

    public static void aj() {
        if (f == null) {
            int a = (int) com.censivn.C3DEngine.b.b.a.a(120.0f);
            f = ThemeManager.mix.appMutilChoice.getTextureElement(ThemeShellDescription.APP_MULTI_CHOICE, a, a);
            g = ThemeManager.mix.appMutilChoice.getTextureElement(ThemeShellDescription.APP_MULTI_NOT_CHOICE, a, a);
        }
    }

    public void ak() {
        this.l = 1;
    }

    public void al() {
        this.l = 0;
    }

    public void am() {
        if (!this.k) {
            aj();
            if (b == null) {
                b = new k(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, 1, 1, false);
                h = new TextureElement(f.id, false);
                b.textures().addElementWithoutVerify(h);
                b.position().x = (com.tsf.shell.manager.o.b.a.T / 2) - (45.0f * com.censivn.C3DEngine.b.b.a.c);
                b.position().y = (com.tsf.shell.manager.o.b.a.U / 2) - (25.0f * com.censivn.C3DEngine.b.b.a.c);
            }
            this.m = 0.75f;
            if (ao()) {
                this.n = 1.0f;
            } else {
                this.n = 0.75f;
            }
            this.k = true;
        }
    }

    public void an() {
        this.k = false;
        this.l = 0;
        this.n = 0.75f;
    }

    public boolean ao() {
        return this.l == 1;
    }

    public void ap() {
        if (A() != null) {
            if (ao()) {
                ar();
            } else {
                aq();
            }
        }
    }

    public void aq() {
        this.n = 1.0f;
        this.l = 1;
        A().f();
        A().a(this);
    }

    public void ar() {
        this.n = 0.75f;
        this.l = 0;
        A().b(this);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.k) {
            b.alpha(alpha());
            this.m += (this.n - this.m) * 0.15f;
            b.scale().setAll(this.m, this.m, 1.0f);
            if (this.l == 0) {
                h.id = g.id;
            } else {
                h.id = f.id;
            }
            b.dispatchDraw();
        }
    }

    public void a(c cVar) {
        e.c(this);
        e.d(cVar);
    }

    public void b(ArrayList<c> arrayList) {
        if (arrayList.size() > 0) {
            e.c(this);
            e.a(arrayList);
            return;
        }
        al();
        an();
    }

    public boolean as() {
        return e.a(this);
    }

    public int at() {
        return e.a();
    }

    public boolean au() {
        return e.b(this);
    }

    public ArrayList<c> av() {
        return e.b();
    }

    public ArrayList<c> aw() {
        return e.c();
    }

    public void ax() {
        int i;
        if (as() && z() != null) {
            g z = z();
            if (z.c(this)) {
                ArrayList<c> aw = aw();
                com.censivn.C3DEngine.b.h.b.c cVar = new com.censivn.C3DEngine.b.h.b.c(z, true);
                if (400 > com.censivn.C3DEngine.b.b.a.D) {
                    i = (com.censivn.C3DEngine.b.b.a.D / 2) - 20;
                } else {
                    i = VEasing.Back.easeIn;
                }
                cVar.a(i, i);
                ArrayList<b> arrayList = new ArrayList<>();
                Iterator<c> it = aw.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                arrayList.add(0, this);
                cVar.a(arrayList);
            }
        }
    }

    public void ay() {
        if (as()) {
            j jVar = (j) parent();
            int childIndexOf = jVar.getChildIndexOf(this);
            ArrayList<c> aw = aw();
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                c cVar = aw.get(i);
                com.censivn.C3DEngine.b.g.c.a(cVar);
                Number3d.TEMPNUMBER3D.reset();
                cVar.localToGlobal(Number3d.TEMPNUMBER3D);
                jVar.globalToLocal(Number3d.TEMPNUMBER3D);
                cVar.position().x = Number3d.TEMPNUMBER3D.x;
                cVar.position().y = Number3d.TEMPNUMBER3D.y;
                cVar.removeFromParent();
                jVar.addChildAt(cVar, childIndexOf);
            }
        }
    }
}
