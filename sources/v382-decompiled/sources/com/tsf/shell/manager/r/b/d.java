package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends com.tsf.shell.e.e.g.a.d {
    public a a;
    private com.censivn.C3DEngine.b.h.b.i b;
    private l c;
    private e d;

    public void a() {
        this.b.d();
    }

    public d(String str) {
        super(str);
    }

    public void a(MotionEvent motionEvent, Object obj, com.censivn.C3DEngine.b.f.j jVar) {
    }

    public boolean b(MotionEvent motionEvent, Object obj, com.censivn.C3DEngine.b.f.j jVar) {
        return true;
    }

    public com.censivn.C3DEngine.b.f.j a(Object obj) {
        return null;
    }

    public void b(Object obj) {
    }

    public void c(Object obj) {
    }

    public boolean a(e eVar) {
        return this.d == eVar;
    }

    public void b(e eVar) {
        final boolean z;
        if (this.d == null) {
            this.d = eVar;
            this.b.d();
            this.b.e();
            return;
        }
        if (this.d != eVar) {
            this.d = eVar;
            z = true;
        } else {
            z = false;
        }
        x xVar = new x() { // from class: com.tsf.shell.manager.r.b.d.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (z) {
                    d.this.b.d();
                    d.this.b.e();
                }
                x xVar2 = new x();
                xVar2.a(255);
                xVar2.h(0.0f);
                xVar2.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(d.this.b);
                w.a(d.this.b, 500, xVar2);
            }
        };
        xVar.a(0);
        xVar.h((-this.a.getHeight()) * 0.8f);
        w.a(this.b);
        w.a(this.b, VEasing.Back.easeIn, xVar);
    }

    public com.censivn.C3DEngine.b.f.j a(Object obj, int i, com.censivn.C3DEngine.b.f.j jVar) {
        return jVar;
    }

    public void a(final a aVar, ArrayList arrayList, float f, float f2, float f3, float f4) {
        this.a = aVar;
        setFunctions(arrayList);
        this.c = new l();
        this.b = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, aVar.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, f3, f4);
        this.c.addChild(this.b);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.d.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return d.this.d.a().size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                return d.this.a(d.this.d.a().get(i), i, jVar);
            }
        });
        this.b.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.manager.r.b.d.3
            private com.censivn.C3DEngine.b.f.j b;
            private float c;
            private float d;

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.utils.w.b();
                Object obj = d.this.d.a().get(i);
                if (aVar.a()) {
                    d.this.b(obj);
                } else {
                    d.this.c(obj);
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void b(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    com.tsf.shell.utils.w.a();
                    this.b = d.this.a(d.this.d.a().get(i));
                    Number3d.TEMPNUMBER3D.reset();
                    Number3d localToGlobal = jVar.localToGlobal(Number3d.TEMPNUMBER3D);
                    this.b.position().setAllFrom(localToGlobal);
                    this.c = localToGlobal.x;
                    this.d = localToGlobal.y;
                    com.tsf.shell.manager.a.j.a(this.b);
                    d.this.a(motionEvent, d.this.d.a().get(i), this.b);
                    this.b.alpha(255.0f);
                    x xVar = new x();
                    xVar.l(1.2f);
                    xVar.m(1.2f);
                    xVar.n(1.2f);
                    w.a(this.b);
                    w.a(this.b, 500, xVar);
                    aVar.templeteHide();
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void c(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                if (!aVar.a()) {
                    if (d.this.b(motionEvent, d.this.d.a().get(i), this.b)) {
                        aVar.templeteShow();
                    }
                    this.b = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.b != null) {
                    this.b.position().x = this.c + (motionEvent2.getX() - motionEvent.getX());
                    this.b.position().y = this.d - (motionEvent2.getY() - motionEvent.getY());
                }
            }
        });
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.c;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }
}
