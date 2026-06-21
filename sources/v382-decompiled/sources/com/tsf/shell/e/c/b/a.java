package com.tsf.shell.e.c.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.e.e.g;
import com.tsf.shell.t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends d implements com.tsf.shell.e.i.b {
    private e a;
    private j d;
    private ArrayList e;
    private ArrayList f;
    private com.tsf.shell.e.i.b.d.b j;
    private Runnable l;
    private int n;
    private boolean g = true;
    private Number3d h = new Number3d();
    private Number3d i = new Number3d();
    private boolean k = false;
    private int m = -1;
    private a c = this;
    private com.tsf.shell.e.i.a b = new com.tsf.shell.e.i.a(this, this) { // from class: com.tsf.shell.e.c.b.a.1
        @Override // com.tsf.shell.e.i.a
        public void a(com.tsf.shell.e.i.c cVar) {
            cVar.f(a.this.c);
        }
    };

    public a(e eVar, float f, float f2, int i) {
        float f3 = 128.0f;
        this.n = 0;
        this.a = eVar;
        this.n = i;
        this.d = new m(f3, f3) { // from class: com.tsf.shell.e.c.b.a.2
            @Override // com.censivn.C3DEngine.b.f.j
            public void visible(Boolean bool) {
                super.visible(false);
            }
        };
        this.d.visible(false);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public int c() {
        return this.n;
    }

    @Override // com.tsf.shell.e.i.b
    public ArrayList b() {
        return children();
    }

    public void e() {
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public boolean a() {
        return this.a.j();
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        this.e.add(j());
        super.addChild(jVar);
        e();
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(j jVar, int i) {
        this.e.add(j());
        super.addChildAt(jVar, i);
        e();
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(j jVar) {
        boolean removeChild = super.removeChild(jVar);
        e();
        if (removeChild) {
            a((b) this.e.remove(0));
            g();
            i();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                ((com.tsf.shell.e.i.c) jVar).c = false;
                ((com.tsf.shell.e.i.c) jVar).B();
            }
            if (jVar instanceof com.tsf.shell.e.i.b.e.b) {
                ((com.tsf.shell.e.i.b.e.b) jVar).aM();
            } else if (jVar instanceof com.tsf.shell.e.i.b.d.b) {
                ((com.tsf.shell.e.i.b.d.b) jVar).aM();
            }
        }
        return removeChild;
    }

    private b j() {
        if (this.f.isEmpty()) {
            return new b();
        }
        b bVar = (b) this.f.remove(0);
        bVar.a();
        return bVar;
    }

    private void a(b bVar) {
        this.f.add(bVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (!this.g) {
            this.g = true;
            for (int i = 0; i < children().size(); i++) {
                j jVar = (j) children().get(i);
                b bVar = (b) this.e.get(i);
                if (!bVar.j) {
                    float f = jVar instanceof com.tsf.shell.e.i.b.d.b ? bVar.c : bVar.a;
                    float f2 = jVar instanceof com.tsf.shell.e.i.b.d.b ? bVar.d : bVar.b;
                    jVar.position().x += (f - jVar.position().x) * 0.15f;
                    jVar.position().y += (f2 - jVar.position().y) * 0.15f;
                    jVar.rotation().z += (bVar.e - jVar.rotation().z) * 0.15f;
                    Number3d scale = jVar.scale();
                    Number3d scale2 = jVar.scale();
                    float f3 = scale2.y + ((bVar.f - jVar.scale().x) * 0.15f);
                    scale2.y = f3;
                    scale.x = f3;
                    float alpha = jVar.alpha();
                    jVar.alpha(alpha + ((bVar.k - alpha) * 0.15f));
                    if (Math.abs(jVar.alpha() - bVar.k) < 0.2f && Math.abs(jVar.position().x - f) < 0.2f && Math.abs(jVar.position().y - f2) < 0.2f && Math.abs(jVar.scale().x - bVar.f) < 0.01f && Math.abs(jVar.rotation().z - bVar.e) < 0.2f) {
                        jVar.position().x = f;
                        jVar.position().y = f2;
                        jVar.rotation().z = bVar.e;
                        Number3d scale3 = jVar.scale();
                        Number3d scale4 = jVar.scale();
                        float f4 = bVar.f;
                        scale4.y = f4;
                        scale3.x = f4;
                        bVar.j = true;
                        jVar.alpha(bVar.k);
                    }
                    if (jVar.alpha() == 0.0f) {
                        jVar.visible(false);
                    } else {
                        jVar.visible(true);
                    }
                }
                this.g = bVar.j && this.g;
            }
            if (this.g) {
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public void a(g gVar) {
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar;
        a(cVar);
        this.d.setAABBPX(cVar.minX(), cVar.minY(), cVar.minZ(), cVar.maxX(), cVar.maxY(), cVar.maxZ());
    }

    public boolean a(int i) {
        int a = this.a.h().a();
        int numChildren = numChildren();
        if (children().contains(this.d)) {
            numChildren--;
        }
        return numChildren + i <= a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(g gVar, float f, float f2) {
        int i;
        com.tsf.shell.e.c.b.a.c b = b((j) gVar);
        if (!(gVar instanceof com.tsf.shell.e.i.e) || ((this.m == b.a || this.m == -1) && a(b.b, gVar, this.h))) {
            return false;
        }
        if (this.j != null) {
            i(gVar);
        }
        if (gVar instanceof com.tsf.shell.e.i.b.e.b) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) gVar;
            if (bVar.as()) {
                i = bVar.at() + 1;
                if (a(i)) {
                    return true;
                }
                if (this.m == -1) {
                    this.m = b.a;
                    addChildAt(this.d, this.m);
                }
                if (this.m != b.a) {
                    this.m = b.a;
                    this.d.removeFromParent();
                    addChildAt(this.d, b.a);
                    g();
                }
                return false;
            }
        }
        i = 1;
        if (a(i)) {
        }
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public void c(g gVar) {
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public void d(g gVar) {
        if (this.j != null) {
            i(gVar);
        }
        b((com.tsf.shell.e.i.c) gVar);
        if (this.d.parent() != null) {
            removeChild(this.d);
        }
        this.m = -1;
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public boolean b(g gVar) {
        return gVar instanceof com.tsf.shell.e.i.e;
    }

    @Override // com.tsf.shell.e.c.b.d, com.tsf.shell.e.e.g
    public void e(g gVar) {
        boolean z;
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar;
        if (this.j != null) {
            z = this.j.b(gVar);
            if (z) {
                this.j.e(gVar);
            }
            this.j = null;
            if (z) {
                removeChild(this.d);
            }
        } else {
            z = false;
        }
        if (!z) {
            w.a(cVar);
            globalToLocal(cVar.position());
            cVar.removeFromParent();
            cVar.clearDefaultColor();
            super.removeChild(this.d);
            if (this.m < 0) {
                this.m = 0;
            } else if (this.m > children().size()) {
                this.m = children().size();
            }
            super.addChildAt(cVar, this.m);
            a(cVar, true);
            if (cVar instanceof com.tsf.shell.e.i.e) {
                com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) cVar;
                if (eVar.as()) {
                    Iterator it = eVar.av().iterator();
                    while (it.hasNext()) {
                        a((com.tsf.shell.e.i.c) it.next(), true);
                    }
                    eVar.ay();
                }
            }
            g();
            i();
        }
        this.m = -1;
    }

    public void f() {
        for (int i = 0; i < children().size(); i++) {
            j jVar = (j) children().get(i);
            b bVar = (b) this.e.get(i);
            bVar.j = true;
            jVar.position().x = bVar.a;
            jVar.position().y = bVar.b;
            jVar.rotation().z = bVar.e;
            Number3d scale = jVar.scale();
            Number3d scale2 = jVar.scale();
            float f = bVar.f;
            scale2.y = f;
            scale.x = f;
            jVar.alpha(bVar.k);
        }
        this.g = true;
        setAnimationObjectState(false);
    }

    public void g() {
        h();
        this.g = false;
        setAnimationObjectState(true);
        invalidate();
    }

    public void h() {
        this.a.h().a(this.e, children().size());
    }

    private boolean a(int i, g gVar, Number3d number3d) {
        return i >= 0 && numChildren() != 0 && i <= numChildren() + (-1) && a(getChildAt(i), gVar, number3d.x, number3d.y);
    }

    private boolean a(j jVar, g gVar, float f, float f2) {
        if ((gVar instanceof com.tsf.shell.e.i.b.d.b) || !(jVar instanceof com.tsf.shell.e.i.b.d.b) || !jVar.calTouchCollision(f, f2)) {
            return false;
        }
        com.tsf.shell.e.i.b.d.b bVar = (com.tsf.shell.e.i.b.d.b) jVar;
        if (this.j == null) {
            this.j = bVar;
            b((com.tsf.shell.e.i.c) gVar);
            this.j.a(gVar);
        }
        this.j.f(gVar);
        return true;
    }

    private void i(g gVar) {
        this.j.d(gVar);
        this.j = null;
        a((com.tsf.shell.e.i.c) gVar);
    }

    public void i() {
        if (!this.a.e()) {
            if (this.l == null) {
                k();
            }
            if (!this.k) {
                this.k = true;
                com.censivn.C3DEngine.a.a().c(this.l);
            }
        }
    }

    private void k() {
        this.l = new Runnable() { // from class: com.tsf.shell.e.c.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                a.this.k = false;
                Iterator it = a.this.children().iterator();
                final String str = "";
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar instanceof com.tsf.shell.e.i.c) {
                        str = String.valueOf(str) + ((com.tsf.shell.e.i.c) jVar).K().id + ",";
                    }
                }
                com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.e.c.b.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str);
                        contentResolver.update(ContentUris.withAppendedId(t.a, a.this.n + 1), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    public void a(com.tsf.shell.e.i.c cVar, boolean z) {
        cVar.a(this.b);
        cVar.c = true;
        if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
            w.a(((com.tsf.shell.e.i.b.e.b) cVar).k);
            ((com.tsf.shell.e.i.b.e.b) cVar).aL();
        } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
            ((com.tsf.shell.e.i.b.d.b) cVar).aL();
        }
        if (!this.a.e() && z) {
            cVar.K().onUpdateContainer(-3);
        }
    }

    private com.tsf.shell.e.c.b.a.c b(j jVar) {
        this.h.reset();
        jVar.localToGlobal(this.h);
        return a(this.h.x, this.h.y);
    }

    private com.tsf.shell.e.c.b.a.c a(float f, float f2) {
        this.h.setAll(f, f2, 0.0f);
        this.i.setAllFrom(this.h);
        globalToLocal(this.i);
        this.a.h().a(this.h);
        if (children().size() != 0) {
            return this.a.h().a(this.i, this.e, this.m);
        }
        com.tsf.shell.e.c.b.a.c.c.a = 0;
        return com.tsf.shell.e.c.b.a.c.c;
    }

    private void a(com.tsf.shell.e.i.c cVar) {
    }

    private void b(com.tsf.shell.e.i.c cVar) {
    }

    public b a(j jVar) {
        int indexOf = children().indexOf(jVar);
        if (indexOf == -1) {
            return null;
        }
        return (b) this.e.get(indexOf);
    }
}
