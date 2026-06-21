package com.tsf.shell.e.e.d.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends l {
    private l b;
    private ArrayList c;
    private d d;
    private f e;
    private h f;
    private int h;
    private float a = 0.0f;
    private final int g = 50;

    public d(h hVar) {
        this.f = hVar;
    }

    public void a(ArrayList arrayList, f fVar) {
        this.e = fVar;
        this.c = arrayList;
        this.b = new l();
        int i = 0;
        Iterator it = this.c.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                final g gVar = (g) it.next();
                final e eVar = new e(gVar.a, gVar.b, fVar);
                com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(eVar) { // from class: com.tsf.shell.e.e.d.a.d.1
                    @Override // com.censivn.C3DEngine.b.d.a
                    public void a(MotionEvent motionEvent) {
                        if (gVar.c()) {
                            gVar.a(d.this.f);
                            gVar.e.removeFromParent();
                            gVar.e.a();
                            eVar.addChild(gVar.e);
                            d.this.d = gVar.e;
                            d.this.a(eVar);
                            d.this.a(gVar.h, com.censivn.C3DEngine.b.b.a.a(500.0f));
                        } else {
                            d.this.f.d();
                        }
                        gVar.a();
                    }
                };
                gVar.c = eVar;
                gVar.h = i2;
                eVar.setMouseEventListener(aVar);
                i = i2 + 1;
            } else {
                addChild(this.b);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f) {
        int size = this.c.size();
        int i2 = i + 1;
        this.h = i2;
        if (i2 < size) {
            int i3 = 0;
            for (int i4 = size - 1; i4 >= i2; i4--) {
                g gVar = (g) this.c.get(i4);
                e eVar = gVar.c;
                x xVar = new x();
                xVar.f(gVar.g);
                xVar.h(gVar.f - f);
                xVar.a(50);
                xVar.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(eVar);
                w.a(eVar, VEasing.Linear.easeNone, xVar);
                i3++;
            }
        }
    }

    private void d() {
        int size = this.c.size();
        int i = this.h;
        if (i < size) {
            int i2 = 0;
            for (int i3 = i; i3 < size; i3++) {
                g gVar = (g) this.c.get(i3);
                e eVar = gVar.c;
                x xVar = new x();
                xVar.a(255);
                xVar.b(i2 * 80);
                xVar.f(gVar.g);
                xVar.h(gVar.f);
                xVar.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(eVar);
                w.a(eVar, VEasing.Linear.easeNone, xVar);
                i2++;
            }
        }
    }

    public void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.c.removeFromParent();
            if (gVar.b()) {
                this.b.addChild(gVar.c);
            }
        }
        this.a = c();
        f();
        this.b.position().x = 0.0f;
        this.b.position().y = 0.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.b.numChildren()) {
                e eVar = (e) this.b.getChildAt(i2);
                x xVar = new x();
                xVar.f(0.0f);
                xVar.a(255);
                xVar.b(i2 * 80);
                xVar.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(eVar);
                w.a(eVar, VEasing.Linear.easeNone, xVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public boolean b() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
            e();
            d();
            return false;
        }
        for (int i = 0; i < this.b.numChildren(); i++) {
            final e eVar = (e) this.b.getChildAt(i);
            x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.d.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    eVar.b();
                }
            };
            xVar.f(-this.a);
            xVar.a(0);
            if (i == this.b.numChildren() - 1) {
                xVar.a(new Runnable() { // from class: com.tsf.shell.e.e.d.a.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.removeFromParent();
                    }
                });
            }
            w.a(eVar);
            w.a(eVar, 500, xVar);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        for (int i = 0; i < this.b.numChildren(); i++) {
            e eVar2 = (e) this.b.getChildAt(i);
            if (eVar2 != eVar) {
                x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.d.4
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                    }
                };
                xVar.a(50);
                w.a(eVar2);
                w.a(eVar2, 500, xVar);
                eVar2.mouseEnabled(false);
            } else {
                eVar2.mouseSkip(true);
            }
        }
    }

    private void e() {
        for (int i = 0; i < this.b.numChildren(); i++) {
            e eVar = (e) this.b.getChildAt(i);
            x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.d.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                }
            };
            xVar.a(255);
            w.a(eVar);
            w.a(eVar, 500, xVar);
            eVar.mouseSkip(false);
            eVar.mouseEnabled(true);
        }
    }

    public float c() {
        if (this.a == 0.0f) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.b.numChildren()) {
                    break;
                }
                float a = ((e) this.b.getChildAt(i2)).a();
                if (a > this.a) {
                    this.a = a;
                }
                i = i2 + 1;
            }
        }
        return this.a;
    }

    private void f() {
        float f = this.e.a;
        float f2 = this.e.b;
        int size = this.c.size();
        float f3 = f;
        for (int i = 0; i < size; i++) {
            g gVar = (g) this.c.get(i);
            e eVar = gVar.c;
            eVar.position().y = f3;
            gVar.f = f3;
            gVar.g = 0.0f;
            eVar.position().x = -this.a;
            eVar.alpha(0.0f);
            f3 -= f2;
        }
    }
}
