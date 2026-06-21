package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
public class q extends VObject3dContainer implements b, h, com.tsf.shell.widget.alarm.service.j {
    public t a;
    private VWidgetContainer b = AlarmWidget.b;
    private VTextureManager c = AlarmWidget.c;
    private VObjectManager d = AlarmWidget.d;
    private VMessageQueueManager e = AlarmWidget.e;
    private Context f = AlarmWidget.h;
    private com.tsf.shell.widget.alarm.service.g g = AlarmWidget.k;
    private n h;
    private com.tsf.shell.widget.alarm.b.g i;
    private VRectangle j;
    private VRectangle k;
    private VRectangle l;
    private VRectangle m;
    private ak n;
    private y o;
    private com.tsf.shell.widget.alarm.c.c p;

    public q() {
        h();
    }

    private void h() {
        this.a = new t();
        addChild(this.a);
        this.o = new y();
        addChild(this.o);
        this.h = new n(this, this.f);
        this.i = new com.tsf.shell.widget.alarm.b.g(this.f, this.c);
        this.i.a("--", "--", "--", "--");
        this.j = new VRectangle(100.0f, 64.0f, 1, 1);
        this.j.position().spY(66.0f);
        this.j.position().spZ(60.0f);
        this.d.addObject(this.j);
        this.j.textures().addElement(this.i.g());
        this.i.a.a(this.j);
        addChild(this.j);
        this.k = new VRectangle(75.0f, 64.0f, 1, 1);
        this.k.position().spX(-70.0f);
        this.k.position().spY(66.0f);
        this.k.position().spZ(40.0f);
        this.d.addObject(this.k);
        this.k.textures().addElement(this.i.g());
        this.i.b.a(this.k);
        addChild(this.k);
        this.l = new VRectangle(75.0f, 64.0f, 1, 1);
        this.l.position().spX(70.0f);
        this.l.position().spY(66.0f);
        this.l.position().spZ(40.0f);
        this.d.addObject(this.l);
        this.l.textures().addElement(this.i.g());
        this.i.c.a(this.l);
        addChild(this.l);
        this.m = new VRectangle(256.0f, 64.0f, 1, 1);
        this.m.position().spX(0.0f);
        this.m.position().spY(36.0f);
        this.m.position().spZ(50.0f);
        this.d.addObject(this.m);
        this.m.textures().addElement(this.i.g());
        this.i.d.a(this.m);
        addChild(this.m);
        this.n = new ak();
        addChild(this.n);
        this.p = new com.tsf.shell.widget.alarm.c.c();
        this.p.position().spX(-180.0f);
        this.p.position().spY(-150.0f);
        this.p.position().spZ(0.0f);
        this.p.a(com.tsf.shell.widget.alarm.c.c.a.h, com.tsf.shell.widget.alarm.c.c.a.g);
        this.p.a(new Runnable() { // from class: com.tsf.shell.widget.alarm.q.1
            @Override // java.lang.Runnable
            public void run() {
                AlarmWidget.a();
            }
        });
        addChild(this.p);
        this.g.a(this);
        AlarmWidget.l.i.a(this);
        c();
        AlarmWidget.a((b) this);
    }

    public void c() {
        AlarmWidget.k.a(new com.tsf.shell.widget.alarm.service.h() { // from class: com.tsf.shell.widget.alarm.q.2
            @Override // com.tsf.shell.widget.alarm.service.h
            public void a(com.tsf.shell.widget.alarm.service.d dVar) {
                u.c("RequestUpdate RequestUpdate RequestUpdate");
                dVar.a(false);
            }
        });
    }

    @Override // com.tsf.shell.widget.alarm.service.j
    public void a(int i, byte[] bArr) {
        AlarmWidget.l.m.b();
        com.tsf.shell.widget.alarm.d.c cVar = (com.tsf.shell.widget.alarm.d.c) com.tsf.shell.widget.alarm.d.c.a(bArr);
        cVar.b();
        a(cVar);
    }

    public void a(final com.tsf.shell.widget.alarm.d.c cVar) {
        this.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.q.3
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap;
                if (cVar.j != null) {
                    bitmap = BitmapFactory.decodeByteArray(cVar.j, 0, cVar.j.length);
                    cVar.j = null;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    q.this.n.a(bitmap);
                }
                if (com.tsf.shell.widget.alarm.setting.j.b) {
                    q.this.i.a(cVar.d, cVar.e, cVar.f, cVar.b);
                } else {
                    q.this.i.a(cVar.g, cVar.h, cVar.i, cVar.b);
                }
                new s(q.this, q.this.k, q.this.i, q.this.i.b, 100, false);
                new s(q.this, q.this.l, q.this.i, q.this.i.c, VEasing.Back.easeIn, false);
                new s(q.this, q.this.j, q.this.i, q.this.i.a, 300, false);
                new s(q.this, q.this.m, q.this.i, q.this.i.d, VEasing.Linear.easeNone, true);
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    @Override // com.tsf.shell.widget.alarm.h
    public void a(boolean z) {
        this.h.b(z);
    }

    @Override // com.tsf.shell.widget.alarm.b
    public void a() {
    }

    @Override // com.tsf.shell.widget.alarm.b
    public void b() {
        c();
    }

    public void d() {
    }

    public void e() {
        this.j.visible(true);
        this.k.visible(true);
        this.l.visible(true);
        this.m.visible(true);
        this.n.visible(true);
        this.o.visible(true);
        this.h.a(true);
        this.p.visible(true);
    }

    public void f() {
        this.j.visible(false);
        this.k.visible(false);
        this.l.visible(false);
        this.m.visible(false);
        this.n.visible(false);
        this.o.visible(false);
        this.h.a(false);
        this.p.visible(false);
    }

    public void g() {
        ah.a(new VObject3d[]{this.k, this.j, this.l, this.m}, this.i.g().id, this.i.e(), 300, 150, 500);
        this.h.e();
        this.a.a();
        this.o.a();
    }
}
