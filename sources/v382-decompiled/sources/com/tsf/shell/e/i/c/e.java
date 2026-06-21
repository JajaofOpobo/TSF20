package com.tsf.shell.e.i.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends i {
    private l k;
    private m l;
    private m m;
    private m n;
    private m o;
    private TextureElement p = new TextureElement(0, false);
    private TextureElement q = new TextureElement(0, false);
    private TextureElement r = new TextureElement(0, false);

    public e() {
        b(true);
    }

    @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
    public void b() {
        com.censivn.C3DEngine.a.g().a(this.p);
        com.censivn.C3DEngine.a.g().a(this.q);
        com.censivn.C3DEngine.a.g().a(this.r);
    }

    private void p() {
        if (this.p.id == 0) {
            Bitmap a = x.a(R.drawable.cloud2);
            com.censivn.C3DEngine.a.g().a(this.p, a);
            a.recycle();
            Bitmap a2 = x.a(R.drawable.animals4);
            com.censivn.C3DEngine.a.g().a(this.r, a2);
            a2.recycle();
            Bitmap a3 = x.a(R.drawable.animals3);
            com.censivn.C3DEngine.a.g().a(this.q, a3);
            a3.recycle();
        }
    }

    @Override // com.tsf.shell.e.i.c.i
    public j a(boolean z) {
        if (this.k == null) {
            this.k = q();
        } else {
            p();
        }
        return this.k;
    }

    private l q() {
        p();
        l lVar = new l();
        this.l = new m(242.0f * com.censivn.C3DEngine.b.b.a.c, 150.0f * com.censivn.C3DEngine.b.b.a.c, false) { // from class: com.tsf.shell.e.i.c.e.1
            float a = 30.0f * com.censivn.C3DEngine.b.b.a.c;
            int d = 10;
            double e = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                position().y = this.a + (((float) Math.sin(this.e * this.d)) * 10.0f * com.censivn.C3DEngine.b.b.a.c);
                this.d++;
            }
        };
        this.m = new f(this, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 200.0f, com.censivn.C3DEngine.b.b.a.c * 3.0f, true, true);
        this.m.position().z = 100.0f * com.censivn.C3DEngine.b.b.a.c;
        this.n = new f(this, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 180.0f, com.censivn.C3DEngine.b.b.a.c * 3.0f, false, true);
        this.n.position().z = (-100.0f) * com.censivn.C3DEngine.b.b.a.c;
        this.o = new f(this, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 54.0f, com.censivn.C3DEngine.b.b.a.c * 70.0f, com.censivn.C3DEngine.b.b.a.c * 0.4f, true, false);
        this.o.position().y = (-100.0f) * com.censivn.C3DEngine.b.b.a.c;
        this.l.textures().addElement(this.p);
        this.m.textures().addElement(this.q);
        this.n.textures().addElement(this.q);
        this.o.textures().addElement(this.r);
        lVar.addChild(this.n);
        lVar.addChild(this.l);
        lVar.addChild(this.m);
        lVar.addChild(this.o);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        jVar.doubleSidedEnabled(true);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        if (jVar.rotation().y == 0.0f) {
            xVar.d(180.0f);
        } else {
            xVar.d(0.0f);
        }
        w.a(jVar);
        w.a(jVar, 300, xVar);
    }
}
