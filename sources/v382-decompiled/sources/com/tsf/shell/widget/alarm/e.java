package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;

/* loaded from: classes.dex */
public class e extends VObject3dContainer implements com.tsf.shell.widget.alarm.c.g {
    public static boolean a;
    private v A;
    private v B;
    private com.tsf.shell.widget.alarm.c.c C;
    private VRectangle D;
    private i E;
    private Cursor h;
    private int i;
    private int j;
    private String k;
    private com.tsf.shell.widget.alarm.AlarmUtils.b l;
    private boolean m;
    private String n;
    private TextureElement o;
    private TextureElement p;
    private TextureElement q;
    private m t;
    private m u;
    private com.tsf.shell.widget.alarm.c.j v;
    private com.tsf.shell.widget.alarm.c.e w;
    private com.tsf.shell.widget.alarm.c.a x;
    private h y;
    private VRectangle z;
    private VWidgetContainer b = AlarmWidget.b;
    private VTextureManager c = AlarmWidget.c;
    private VObjectManager d = AlarmWidget.d;
    private VMessageQueueManager e = AlarmWidget.e;
    private Context f = AlarmWidget.h;
    private com.tsf.shell.widget.alarm.service.g g = AlarmWidget.k;
    private float r = 1.2f;
    private float s = VInformation.Scale();

    public e() {
        h();
        i();
        a();
        d();
    }

    public void a(h hVar) {
        this.y = hVar;
        this.y.a(a);
    }

    private void g() {
        u.c("============SetData=================" + this.i + ":" + this.j);
        this.t.a(this.i);
        this.u.a(this.j);
        this.v.a(this.l.b());
        this.w.a(a);
        this.x.a(this.i < 12 && this.i > 0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        this.t.d();
        this.u.d();
    }

    private void h() {
        Bitmap a2 = aj.a(this.f, "back_big_circle");
        this.o = this.c.createTexture(a2, false);
        a2.recycle();
        Bitmap a3 = aj.a(this.f, "back_small_circle");
        this.p = this.c.createTexture(a3, false);
        a3.recycle();
        Bitmap a4 = aj.a(this.f, "back_time_bar_bg");
        this.q = this.c.createTexture(a4, false);
        a4.recycle();
    }

    private void i() {
        this.E = new i();
        this.d.addObject(this.E);
        this.E.doubleSidedEnabled(j.a.a);
        this.E.textures().addElement(this.o);
        this.E.calAABB();
        this.E.setMouseEventListener(new f(this, this.E));
        addChild(this.E);
        this.z = new VRectangle(380.0f / this.r, 380.0f / this.r, 1, 1);
        this.z.position().spZ(40.0f);
        this.d.addObject(this.z);
        this.z.textures().addElement(this.p);
        addChild(this.z);
        this.D = new VRectangle(261.0f / this.r, 53.0f / this.r, 1, 1);
        this.d.addObject(this.D);
        this.D.position().spZ(80.0f);
        this.D.position().spX(161.875f / this.r);
        this.D.textures().addElement(this.q);
        addChild(this.D);
        this.B = new v();
        this.B.textures().addElement(v.a);
        this.B.position().spZ(80.0f);
        this.B.position().spX(100.0f);
        this.B.position().spY(-2.0f);
        addChild(this.B);
        this.A = new v();
        this.A.textures().addElement(v.b);
        this.A.position().spZ(80.0f);
        this.A.position().spX(156.0f);
        this.A.position().spY(-2.0f);
        addChild(this.A);
        this.C = new com.tsf.shell.widget.alarm.c.c();
        this.C.position().spX(-180.0f);
        this.C.position().spY(-150.0f);
        this.C.position().spZ(0.0f);
        this.C.a(com.tsf.shell.widget.alarm.c.c.a.f, com.tsf.shell.widget.alarm.c.c.a.e);
        addChild(this.C);
        this.v = new com.tsf.shell.widget.alarm.c.j(this);
        this.t = new m(this.z, this.B, 3, 1, 1);
        this.u = new m(this.E, this.A, -1, 5, 0);
        this.x = new com.tsf.shell.widget.alarm.c.a();
        this.B.a(this.x);
        addChild(this.x);
        this.w = new com.tsf.shell.widget.alarm.c.e();
        this.w.a(this);
        addChild(this.w);
        this.C.a(new Runnable() { // from class: com.tsf.shell.widget.alarm.e.1
            @Override // java.lang.Runnable
            public void run() {
                new g(e.this).start();
                AlarmWidget.b();
            }
        });
    }

    public void a() {
        this.h = com.tsf.shell.widget.alarm.AlarmUtils.i.b(this.f);
        if (this.h == null) {
            com.tsf.shell.widget.alarm.AlarmUtils.i.a(this.f);
            this.h.close();
            this.h = com.tsf.shell.widget.alarm.AlarmUtils.i.b(this.f);
        }
        u.b("mCursor Count():" + this.h.getCount());
        if (this.h.getCount() > 0) {
            Alarm a2 = com.tsf.shell.widget.alarm.AlarmUtils.i.a(this.f, 1);
            a = a2.b;
            this.k = a2.h;
            this.i = a2.c;
            this.j = a2.d;
            this.l = a2.e;
            this.m = a2.g;
            this.n = a2.i == null ? "silent" : a2.i.toString();
            u.b("Info:" + a + ":" + this.k + ":" + this.i + ":" + this.j);
        }
        this.h.close();
        g();
    }

    private void b(boolean z) {
        a = z;
        if (this.y != null) {
            this.y.a(a);
        }
        new g(this).start();
    }

    @Override // com.tsf.shell.widget.alarm.c.g
    public void a(boolean z) {
        b(z);
    }

    public void b() {
        this.v.a(true);
        this.w.visible(true);
        this.x.visible(true);
        this.z.visible(true);
        this.A.visible(true);
        this.B.visible(true);
        this.C.visible(true);
        this.D.visible(true);
    }

    public void c() {
        this.v.a();
    }

    public void d() {
        this.v.a(false);
        this.w.visible(false);
        this.x.visible(false);
        this.z.visible(false);
        this.A.visible(false);
        this.B.visible(false);
        this.C.visible(false);
        this.D.visible(false);
    }

    public void e() {
        this.v.b();
    }

    public void f() {
        com.tsf.shell.widget.alarm.c.h.a();
        this.w.a();
        v.a();
        ah.a(new VObject3d[]{this.E}, this.o.id, aj.a(this.f, "back_big_circle"), 250, 250, 50);
        ah.a(new VObject3d[]{this.z}, this.p.id, aj.a(this.f, "back_small_circle"), 250, 250, 50);
        ah.a(new VObject3d[]{this.D}, this.q.id, aj.a(this.f, "back_time_bar_bg"), 250, 250, 50);
        this.E.doubleSidedEnabled(j.a.a);
    }
}
