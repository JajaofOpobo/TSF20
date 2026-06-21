package com.tsf.shell.e.i;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.e.e.f;
import com.tsf.shell.e.f.g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends c {
    private static m b;
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

    public e(ItemInfo itemInfo) {
        super(itemInfo);
        this.a = false;
        this.k = false;
        this.l = 0;
        this.i = 0;
        this.m = 0.75f;
        this.n = 0.75f;
    }

    public com.tsf.shell.e.e.f.e ag() {
        if (parent() == null) {
            return null;
        }
        if (parent() instanceof com.tsf.shell.e.e.f.e) {
            return (com.tsf.shell.e.e.f.e) parent();
        }
        if (z() != null) {
            return (com.tsf.shell.e.e.f.e) z().S();
        }
        return null;
    }

    @Override // com.tsf.shell.e.i.c
    public void k_() {
        if (!this.a) {
            ai();
        } else {
            this.a = false;
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void c() {
        super.c();
        if (as() && !L()) {
            ax();
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void l_() {
        super.l_();
    }

    @Override // com.tsf.shell.e.i.c
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

    @Override // com.tsf.shell.e.i.c
    public void ab() {
        super.ab();
        this.a = true;
    }

    @Override // com.tsf.shell.e.i.c
    public void m_() {
        if (as() && (getMouseEventListener() instanceof com.tsf.shell.e.i.a.c) && !((com.tsf.shell.e.i.a.c) getMouseEventListener()).a()) {
            ax();
        }
        super.m_();
    }

    @Override // com.tsf.shell.e.i.c
    public void n_() {
        super.n_();
        this.a = true;
    }

    public void ai() {
        if (ag() != null && !D()) {
            ArrayList s = ag().s();
            com.tsf.shell.manager.a.v.e.d().a(this, ag().d(), ag().r(), s);
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void g() {
        if (ao()) {
            ar();
        }
        super.g();
    }

    public ArrayList a(ArrayList arrayList) {
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
                b = new m(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, 1, 1, false);
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

    @Override // com.censivn.C3DEngine.b.f.l
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

    public void a(e eVar) {
        f.c(this);
        f.d(eVar);
    }

    public void b(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            f.c(this);
            f.a(arrayList);
        } else {
            al();
            an();
        }
    }

    public boolean as() {
        return f.a(this);
    }

    public int at() {
        return f.a();
    }

    public boolean au() {
        return f.b(this);
    }

    public ArrayList av() {
        return f.b();
    }

    public ArrayList aw() {
        return f.c();
    }

    public void ax() {
        int i;
        if (as() && z() != null) {
            g z = z();
            if (z.c(this)) {
                ArrayList aw = aw();
                com.censivn.C3DEngine.b.h.b.c cVar = new com.censivn.C3DEngine.b.h.b.c(z, true);
                if (400 > com.censivn.C3DEngine.b.b.a.D) {
                    i = (com.censivn.C3DEngine.b.b.a.D / 2) - 20;
                } else {
                    i = VEasing.Back.easeIn;
                }
                cVar.a(i, i);
                ArrayList arrayList = new ArrayList();
                Iterator it = aw.iterator();
                while (it.hasNext()) {
                    arrayList.add((e) it.next());
                }
                arrayList.add(0, this);
                cVar.a(arrayList);
            }
        }
    }

    public void ay() {
        if (as()) {
            l lVar = (l) parent();
            int childIndexOf = lVar.getChildIndexOf(this);
            ArrayList aw = aw();
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                c cVar = (c) aw.get(i);
                w.a(cVar);
                Number3d.TEMPNUMBER3D.reset();
                cVar.localToGlobal(Number3d.TEMPNUMBER3D);
                lVar.globalToLocal(Number3d.TEMPNUMBER3D);
                cVar.position().x = Number3d.TEMPNUMBER3D.x;
                cVar.position().y = Number3d.TEMPNUMBER3D.y;
                cVar.removeFromParent();
                lVar.addChildAt(cVar, childIndexOf);
            }
        }
    }
}
