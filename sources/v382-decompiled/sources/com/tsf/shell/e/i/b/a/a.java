package com.tsf.shell.e.i.b.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.e.f;
import com.censivn.C3DEngine.e.o;
import com.censivn.C3DEngine.e.p;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends l {
    private j d;
    private l e;
    private l f;
    private boolean h;
    private m i;
    private com.censivn.C3DEngine.c.a j;
    private com.censivn.C3DEngine.c.b.b k;
    private TextureElement l;
    private int m;
    private int n;
    private boolean a = false;
    private TextureElement b = new TextureElement(0, false);
    private TextureElement c = new TextureElement(0, false);
    private int g = 0;
    private int o = 6;

    public a(boolean z) {
        this.h = false;
        this.h = z;
        h();
        i();
    }

    public void a() {
        this.a = true;
    }

    public void b() {
        this.a = false;
    }

    public void c() {
        this.g = 0;
        x xVar = new x();
        xVar.h(0.0f);
        w.a(this.f);
        w.a(this.f, 250, xVar);
    }

    private void h() {
        System.currentTimeMillis();
        f a = o.a(p.MAX_3DS, com.censivn.C3DEngine.a.d().getResources(), String.valueOf(com.censivn.C3DEngine.a.b()) + ":raw/widget_airship", true);
        a.c();
        this.d = a.b().getChildAt(0);
        this.d.removeFromParent();
    }

    private void i() {
        float f = 150.0f;
        this.f = new l() { // from class: com.tsf.shell.e.i.b.a.a.1
            private double b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (!a.this.a) {
                    position().y = ((float) Math.sin(this.b * a.this.g)) * 50.0f * com.censivn.C3DEngine.b.b.a.b;
                    a.this.g++;
                }
            }
        };
        this.e = new l() { // from class: com.tsf.shell.e.i.b.a.a.2
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                com.censivn.C3DEngine.a.e().c();
                if (a.this.a || a.this.k == null) {
                    return;
                }
                a.this.k.d((float) ((Math.cos(1.0d) * 2.0d) - (Math.random() * 2.0d)));
                a.this.j.a();
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                com.censivn.C3DEngine.a.e().d();
            }
        };
        this.d.textures().addElement(this.b);
        this.d.scale().setAll(7.0f, 7.0f, 7.0f);
        this.d.rotation().z = 28.0f;
        m mVar = new m(f, f) { // from class: com.tsf.shell.e.i.b.a.a.3
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (!a.this.a) {
                    rotation().z += 25.0f;
                }
            }
        };
        mVar.position().z = -210.0f;
        mVar.textures().addElement(this.c);
        mVar.doubleSidedEnabled(true);
        this.e.addChild(this.d);
        this.f.addChild(mVar);
        this.f.addChild(this.e);
        this.f.rotation().y = 75.0f;
        this.f.scale().setAll(com.censivn.C3DEngine.b.b.a.b * 1.1f, com.censivn.C3DEngine.b.b.a.b * 1.1f, com.censivn.C3DEngine.b.b.a.b * 1.1f);
        addChild(this.f);
        this.f.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.f) { // from class: com.tsf.shell.e.i.b.a.a.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.e();
            }
        });
        this.f.setAABBPX((-180.0f) * com.censivn.C3DEngine.b.b.a.b, (-300.0f) * com.censivn.C3DEngine.b.b.a.b, 0.0f, 180.0f * com.censivn.C3DEngine.b.b.a.b, 100.0f * com.censivn.C3DEngine.b.b.a.b, 0.0f);
        if (this.h) {
            j();
        }
        f();
    }

    private void j() {
        this.m = this.o * (this.o + 1);
        this.n = this.m + this.o;
        this.i = new m(250.0f, 150.0f, this.o, this.o, false);
        this.i.position().y = -150.0f;
        this.i.position().x = 30.0f;
        this.i.position().z = -10.0f;
        this.i.rotation().y = -90.0f;
        this.i.rotation().z = -2.5f;
        this.i.useVBO(false);
        this.j = new com.censivn.C3DEngine.c.a(this.i);
        this.k = new com.censivn.C3DEngine.c.b.b(0.7f, 2.0f);
        this.j.a(this.k);
        this.k.c(-0.3f);
        this.e.addChild(this.i);
        this.e.setAnimationObjectState(true);
        this.e.setHighPriorityAnimationObjectState(false);
        ArrayList b = this.k.b();
        com.censivn.C3DEngine.c.a.a.b bVar = (com.censivn.C3DEngine.c.a.a.b) b.get(this.m);
        bVar.d = false;
        bVar.f = false;
        bVar.e = false;
        com.censivn.C3DEngine.c.a.a.b bVar2 = (com.censivn.C3DEngine.c.a.a.b) b.get(this.n);
        bVar2.d = false;
        bVar2.f = false;
        bVar2.e = false;
        a(d());
    }

    public Bitmap d() {
        return null;
    }

    public void e() {
    }

    public void a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = com.tsf.shell.utils.x.a(R.drawable.widget_airship_flag);
        }
        if (this.l == null) {
            this.l = com.censivn.C3DEngine.a.g().a(bitmap, false);
            this.i.textures().addElement(this.l);
        } else {
            com.censivn.C3DEngine.a.g().a(this.l, bitmap);
        }
        bitmap.recycle();
    }

    public void f() {
        if (this.b.id == 0) {
            Bitmap a = com.tsf.shell.utils.x.a(R.drawable.widget_airship_body);
            com.censivn.C3DEngine.a.g().a(this.b, a);
            a.recycle();
        }
        if (this.c.id == 0) {
            Bitmap a2 = com.tsf.shell.utils.x.a(R.drawable.widget_airship_propeller);
            com.censivn.C3DEngine.a.g().a(this.c, a2);
            a2.recycle();
        }
    }

    public void g() {
        com.censivn.C3DEngine.a.g().a(this.b);
        com.censivn.C3DEngine.a.g().a(this.c);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        super.destroy();
        com.censivn.C3DEngine.a.g().a(this.b);
        com.censivn.C3DEngine.a.g().a(this.c);
        com.censivn.C3DEngine.a.g().a(this.l);
    }
}
