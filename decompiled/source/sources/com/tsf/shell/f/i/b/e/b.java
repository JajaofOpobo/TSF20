package com.tsf.shell.f.i.b.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.f.e.m;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b extends com.tsf.shell.f.i.c implements m {
    private static int[] a = {0, 0};
    private static ArrayList<a> v = new ArrayList<>();
    private static int w = 0;
    private static int x = 2;
    private boolean b;
    public com.censivn.C3DEngine.b.f.a.a k;
    public com.censivn.C3DEngine.b.f.a.b l;
    public com.censivn.C3DEngine.b.f.a.b m;
    public com.tsf.shell.manager.o.a n;
    public boolean o;
    private boolean p;
    private float q;
    private boolean r;
    private com.tsf.shell.f.d.a.a s;
    private boolean t;
    private a u;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void k();

    public b(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar) {
        super(launcherShortcut3DInfo);
        this.b = true;
        this.p = true;
        this.r = false;
        this.o = false;
        this.t = false;
        this.n = aVar;
        useVBO(false);
        i(false);
        this.k = aF();
        this.l = this.k.a(0);
        this.m = this.k.a(1);
        c(1.2f);
        k(true);
        aO();
        setMouseEventListener(aH());
        addChild(this.k);
        j(true);
    }

    public void f(float f) {
        this.q = f;
    }

    public float az() {
        return this.q;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        aA();
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void a(com.tsf.shell.f.e.f fVar) {
        if (fVar instanceof b) {
            a((com.censivn.C3DEngine.b.f.i) ((b) fVar));
        }
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void d(com.tsf.shell.f.e.f fVar) {
        if (fVar instanceof b) {
            b((com.censivn.C3DEngine.b.f.i) ((b) fVar));
        }
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void e(com.tsf.shell.f.e.f fVar) {
        if ((fVar instanceof b) && this.u != null) {
            com.tsf.shell.f.i.b.d.b a2 = a((b) fVar, false);
            a2.K().screen = K().screen;
            a2.ad();
            a2.setMouseEventListener(new com.tsf.shell.f.i.a.c(a2));
        }
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public boolean a(com.tsf.shell.f.e.f fVar, float f, float f2) {
        return (fVar instanceof com.tsf.shell.f.i.c) && ((com.tsf.shell.f.i.c) fVar).au();
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public boolean b(com.tsf.shell.f.e.f fVar) {
        return fVar instanceof b;
    }

    public void aA() {
        if (!this.r) {
            if (this.k.textures().size() == 0 || this.k.textures().get(0).textureElement.id == 0) {
                this.r = true;
                q();
                return;
            }
            this.r = true;
        }
    }

    public void aB() {
        k();
    }

    public boolean aC() {
        return this.r;
    }

    public void aD() {
        this.r = false;
    }

    private void q() {
        if (!t()) {
            k();
        }
    }

    public com.tsf.shell.manager.o.a aE() {
        return this.n;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public boolean doubleSidedEnabled() {
        return this.k.doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void doubleSidedEnabled(boolean z) {
        this.k.doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void alpha(float f) {
        this.k.alpha(f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float alpha() {
        return this.k.alpha();
    }

    public com.censivn.C3DEngine.b.f.a.a aF() {
        return this.n.b();
    }

    public int[] aG() {
        a[0] = this.n.H;
        a[1] = this.n.I;
        return a;
    }

    public com.tsf.shell.f.i.a.c aH() {
        return new com.tsf.shell.f.i.a.d(this);
    }

    public void l(boolean z) {
        this.p = z;
    }

    public boolean aI() {
        return this.p;
    }

    @Override // com.tsf.shell.f.i.c, com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void g(com.tsf.shell.f.e.f fVar) {
        I();
        super.g(fVar);
    }

    public static void a(Bitmap bitmap) {
    }

    public float aJ() {
        return this.m.o.x;
    }

    public void g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.m.o.x) {
            this.m.o.x = f;
            this.m.o.y = f;
            this.m.f();
            if (f == 0.0f) {
                aL();
            } else if (!this.m.l()) {
                aM();
            }
        }
    }

    public boolean aK() {
        return !this.m.l();
    }

    public void aL() {
        if (this.m.l()) {
            this.m.a((Boolean) false);
            aO();
        }
    }

    public void aM() {
        if (!this.m.l()) {
            this.m.a((Boolean) true);
            aO();
        }
    }

    public void aN() {
        this.b = false;
    }

    public void aO() {
        if (this.n != null) {
            this.n.a(this, this.m.l());
        }
    }

    public void a(Number3d number3d, Number3d number3d2) {
        b(number3d, number3d2);
    }

    public void a(com.tsf.shell.f.d.a.a aVar) {
        b(aVar);
    }

    public void b(Number3d number3d, Number3d number3d2) {
        if (this.b) {
            this.s = com.tsf.shell.manager.a.v.b.a(this, number3d, number3d2);
        }
    }

    public void aP() {
        if (this.b) {
            this.s = com.tsf.shell.manager.a.v.b.a(this);
        }
    }

    public void b(com.tsf.shell.f.d.a.a aVar) {
        if (this.b) {
            com.tsf.shell.manager.a.v.b.a(this, aVar);
        }
    }

    public void aQ() {
        if (aC()) {
            aP();
        }
    }

    public void l() {
        w.b();
    }

    @Override // com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        this.n = null;
        this.s = null;
        super.g();
    }

    @Override // com.tsf.shell.f.e.m
    public boolean e_() {
        return this.t;
    }

    @Override // com.tsf.shell.f.e.m
    public void b(boolean z) {
        this.t = z;
    }

    @Override // com.tsf.shell.f.e.m
    public boolean d() {
        return true;
    }

    public boolean a(com.censivn.C3DEngine.b.f.i iVar) {
        if (this.u == null) {
            this.u = aS();
        }
        if (this.u == null) {
            return false;
        }
        this.u.a.a(this, this.u.b, iVar);
        return true;
    }

    public void b(com.censivn.C3DEngine.b.f.i iVar) {
        if (this.u != null) {
            this.u.a.a(iVar, new Runnable() { // from class: com.tsf.shell.f.i.b.e.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.u.b.removeFromParent();
                    b.this.k.visible(true);
                    b.a(b.this.u);
                    b.this.u = null;
                }
            });
        }
    }

    public com.tsf.shell.f.i.b.d.b a(b bVar, boolean z) {
        com.tsf.shell.f.i.b.d.b bVar2 = this.u.a;
        this.u.a.removeFromParent();
        this.u.a.a(this, bVar, z);
        this.u = null;
        this.k.visible(true);
        aT();
        return bVar2;
    }

    public static boolean aR() {
        return w < x || v.size() > 0;
    }

    public static a aS() {
        if (v.isEmpty()) {
            if (w >= x) {
                return null;
            }
            return aU();
        }
        return v.remove(0);
    }

    public static void aT() {
        w--;
    }

    public static a aU() {
        a aVar = new a();
        aVar.a = new com.tsf.shell.f.i.b.d.b(new LauncherDrawerFolder3DInfo(true));
        aVar.b = new h();
        w++;
        return aVar;
    }

    public static void a(a aVar) {
        aVar.b.k.textures().clear();
        v.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        public com.tsf.shell.f.i.b.d.b a;
        public h b;

        a() {
        }
    }
}
