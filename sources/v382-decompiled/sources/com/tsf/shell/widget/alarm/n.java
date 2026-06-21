package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.Calendar;

/* loaded from: classes.dex */
public class n implements b {
    public static com.tsf.shell.widget.alarm.b.c a;
    private VObject3dContainer b;
    private VRectangle c;
    private VRectangle d;
    private VRectangle e;
    private VRectangle f;
    private VRectangle g;
    private Context h;
    private VRectangle i;
    private VRectangle j;
    private String k;
    private VRectangle l;
    private VRectangle m;
    private com.tsf.shell.widget.alarm.b.b n;
    private boolean o;

    public n(VObject3dContainer vObject3dContainer, Context context) {
        this.b = vObject3dContainer;
        this.h = context;
        f();
        c();
        d();
        AlarmWidget.a(this);
    }

    private void f() {
        if (a == null) {
            a = new com.tsf.shell.widget.alarm.b.c(AlarmWidget.h, AlarmWidget.c);
        }
    }

    public void c() {
        this.n = new com.tsf.shell.widget.alarm.b.b(this.h, AlarmWidget.c);
        this.i = new VRectangle(256.0f, 64.0f);
        this.i.position().spX(0.0f);
        this.i.position().spY(0.0f);
        this.i.position().spZ(40.0f);
        this.i.textures().addElement(this.n.g());
        this.n.a.a(this.i);
        this.b.addChild(this.i);
        this.j = new VRectangle(256.0f, 64.0f);
        this.j.position().spX(0.0f);
        this.j.position().spY(-100.0f);
        this.j.position().spZ(60.0f);
        this.j.textures().addElement(this.n.g());
        this.n.b.a(this.j);
        this.b.addChild(this.j);
        this.c = new VRectangle(41.0f, 86.0f);
        this.c.position().spX((-74.5f) - 12.5f);
        this.c.position().spY(-45.0f);
        this.c.position().spZ(80.0f);
        this.c.textures().addElement(a.g());
        a.a(this.c, 1);
        this.b.addChild(this.c);
        this.d = new VRectangle(41.0f, 86.0f);
        this.d.position().spX((-33.5f) - 12.5f);
        this.d.position().spY(-45.0f);
        this.d.position().spZ(80.0f);
        this.d.textures().addElement(a.g());
        a.a(this.d, 2);
        this.b.addChild(this.d);
        this.e = new VRectangle(26.0f, 86.0f);
        this.e.position().spX(0.0f - 12.5f);
        this.e.position().spY(-45.0f);
        this.e.position().spZ(80.0f);
        this.e.textures().addElement(a.g());
        a.c.a(this.e);
        this.b.addChild(this.e);
        this.f = new VRectangle(41.0f, 86.0f);
        this.f.position().spX(33.5f - 12.5f);
        this.f.position().spY(-45.0f);
        this.f.position().spZ(80.0f);
        this.f.textures().addElement(a.g());
        a.a(this.f, 3);
        this.b.addChild(this.f);
        this.g = new VRectangle(41.0f, 86.0f);
        this.g.position().spX((-12.5f) + 74.5f);
        this.g.position().spY(-45.0f);
        this.g.position().spZ(80.0f);
        this.g.textures().addElement(a.g());
        a.a(this.g, 4);
        this.b.addChild(this.g);
        this.m = new VRectangle(31.0f, 43.0f);
        this.m.position().spX(101.5f);
        this.m.position().spY((-45.0f) + 10.0f);
        this.m.position().spZ(80.0f);
        this.m.textures().addElement(a.g());
        a.b.a(this.m);
        this.b.addChild(this.m);
        this.l = new VRectangle(50.0f, 22.0f);
        this.l.position().spX(99.5f);
        this.l.position().spY((-45.0f) - 10.0f);
        this.l.position().spZ(80.0f);
        this.l.textures().addElement(AlarmWidget.a.g());
        this.b.addChild(this.l);
    }

    public void a(boolean z) {
        this.i.visible(Boolean.valueOf(z));
        this.j.visible(Boolean.valueOf(z));
        this.l.visible(Boolean.valueOf(z));
        this.m.visible(Boolean.valueOf(z && this.o));
        this.c.visible(Boolean.valueOf(z));
        this.d.visible(Boolean.valueOf(z));
        this.e.visible(Boolean.valueOf(z));
        this.f.visible(Boolean.valueOf(z));
        this.g.visible(Boolean.valueOf(z));
    }

    public void d() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (DateFormat.is24HourFormat(this.h)) {
            this.k = "kk";
            this.l.visible(false);
        } else {
            this.k = "h";
            this.l.visible(true);
        }
        int parseInt = Integer.parseInt(DateFormat.format(this.k, calendar).toString());
        int parseInt2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
        new p(this, this.c, a.a[parseInt / 10], 0);
        new p(this, this.d, a.a[parseInt % 10], VEasing.Back.easeIn);
        new p(this, this.f, a.a[parseInt2 / 10], VEasing.Linear.easeNone);
        new p(this, this.g, a.a[parseInt2 % 10], 600);
    }

    private void g() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(9) == 0) {
            new p(this, this.l, AlarmWidget.a.b[0], 0);
        } else {
            new p(this, this.l, AlarmWidget.a.b[1], 0);
        }
        this.l.updateUvsVBO();
    }

    @Override // com.tsf.shell.widget.alarm.b
    public void a() {
        d();
    }

    @Override // com.tsf.shell.widget.alarm.b
    public void b() {
        g();
        h();
    }

    private void h() {
        this.n.f();
        new p(this, this.i, this.n, this.n.a, 0, false);
        new p(this, this.j, this.n, this.n.b, 100, true);
    }

    public void b(boolean z) {
        u.c("refreshAlarmStat :" + z);
        this.o = z;
        if (z) {
            this.m.visible(true);
        } else {
            this.m.visible(false);
        }
    }

    public void e() {
        ah.a(new VObject3d[]{this.l}, AlarmWidget.a.g().id, AlarmWidget.a.e(), 300, 150, 500);
        ah.a(new VObject3d[]{this.c, this.d, this.e, this.f, this.g, this.m}, a.g().id, a.b(), 300, 150, 50);
        ah.a(new VObject3d[]{this.i, this.j}, this.n.g().id, this.n.b(), 300, 150, 500);
    }
}
