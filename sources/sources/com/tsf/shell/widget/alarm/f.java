package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.text.format.DateFormat;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.b.e;
import java.util.Calendar;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f implements AlarmWidget.b {
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

    public f(VObject3dContainer vObject3dContainer, Context context) {
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
        int i = Integer.parseInt(DateFormat.format(this.k, calendar).toString());
        int i2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
        new b(this, this.c, a.a[i / 10], 0);
        new b(this, this.d, a.a[i % 10], VEasing.Back.easeIn);
        new b(this, this.f, a.a[i2 / 10], VEasing.Linear.easeNone);
        new b(this, this.g, a.a[i2 % 10], 600);
    }

    private void g() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(9) == 0) {
            new b(this, this.l, AlarmWidget.a.b[0], 0);
        } else {
            new b(this, this.l, AlarmWidget.a.b[1], 0);
        }
        this.l.updateUvsVBO();
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.b
    public void a() {
        d();
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.b
    public void b() {
        g();
        h();
    }

    private void h() {
        this.n.f();
        new b(this.i, this.n, this.n.a, 0, false);
        new b(this.j, this.n, this.n.b, 100, true);
    }

    public void b(boolean z) {
        i.c("refreshAlarmStat :" + z);
        this.o = z;
        if (z) {
            this.m.visible(true);
        } else {
            this.m.visible(false);
        }
    }

    public void e() {
        o.a(new VObject3d[]{this.l}, AlarmWidget.a.g().id, AlarmWidget.a.e(), 300, 150, 500);
        o.a(new VObject3d[]{this.c, this.d, this.e, this.f, this.g, this.m}, a.g().id, a.b(), 300, 150, 50);
        o.a(new VObject3d[]{this.i, this.j}, this.n.g().id, this.n.b(), 300, 150, 500);
    }

    class a extends VTweenParam {
        private com.tsf.shell.widget.alarm.b.e b;
        private boolean c;

        public a(VRectangle vRectangle, com.tsf.shell.widget.alarm.b.e eVar, boolean z) {
            this.b = eVar;
            this.c = z;
            setEase(101);
            setTimeout(0);
            setScaleX(1.0f);
            setScaleY(1.0f);
            setScaleZ(1.0f);
            VTween.killTween(vRectangle);
            VTween.to(vRectangle, 500, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            if (this.c && this.b != null) {
                this.b.i();
            }
        }
    }

    class b extends VTweenParam {
        private VRectangle b;
        private com.tsf.shell.widget.alarm.b.e c;
        private e.a d;
        private boolean e;

        public b(f fVar, VRectangle vRectangle, e.a aVar, int i) {
            this(vRectangle, null, aVar, i, false);
        }

        public b(VRectangle vRectangle, com.tsf.shell.widget.alarm.b.e eVar, e.a aVar, int i, boolean z) {
            setTimeout(i);
            setScaleX(0.0f);
            setScaleY(0.0f);
            setScaleZ(0.0f);
            this.b = vRectangle;
            this.c = eVar;
            this.d = aVar;
            this.e = z;
            VTween.killTween(vRectangle);
            VTween.to(vRectangle, 100, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            if (this.c != null) {
                this.b.textures().removeAll();
                this.b.textures().addElement(this.c.g());
            }
            this.d.a(this.b);
            this.b.updateUvsVBO();
            f.this.new a(this.b, this.c, this.e);
        }
    }
}
