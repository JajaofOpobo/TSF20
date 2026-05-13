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
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
import com.tsf.shell.widget.alarm.p203b.C4260b;
import com.tsf.shell.widget.alarm.p203b.C4261c;
import java.util.Calendar;
/* renamed from: com.tsf.shell.widget.alarm.f */
/* loaded from: classes.dex */
public class C4295f implements AlarmWidget.InterfaceC4246b {

    /* renamed from: a */
    public static C4261c f13916a;

    /* renamed from: b */
    private VObject3dContainer f13917b;

    /* renamed from: c */
    private VRectangle f13918c;

    /* renamed from: d */
    private VRectangle f13919d;

    /* renamed from: e */
    private VRectangle f13920e;

    /* renamed from: f */
    private VRectangle f13921f;

    /* renamed from: g */
    private VRectangle f13922g;

    /* renamed from: h */
    private Context f13923h;

    /* renamed from: i */
    private VRectangle f13924i;

    /* renamed from: j */
    private VRectangle f13925j;

    /* renamed from: k */
    private String f13926k;

    /* renamed from: l */
    private VRectangle f13927l;

    /* renamed from: m */
    private VRectangle f13928m;

    /* renamed from: n */
    private C4260b f13929n;

    /* renamed from: o */
    private boolean f13930o;

    public C4295f(VObject3dContainer vObject3dContainer, Context context) {
        this.f13917b = vObject3dContainer;
        this.f13923h = context;
        m282f();
        m285c();
        m284d();
        AlarmWidget.m417a(this);
    }

    /* renamed from: f */
    private void m282f() {
        if (f13916a == null) {
            f13916a = new C4261c(AlarmWidget.f13714h, AlarmWidget.f13709c);
        }
    }

    /* renamed from: c */
    public void m285c() {
        this.f13929n = new C4260b(this.f13923h, AlarmWidget.f13709c);
        this.f13924i = new VRectangle(256.0f, 64.0f);
        this.f13924i.position().spX(0.0f);
        this.f13924i.position().spY(0.0f);
        this.f13924i.position().spZ(40.0f);
        this.f13924i.textures().addElement(this.f13929n.m365g());
        this.f13929n.f13814a.m361a(this.f13924i);
        this.f13917b.addChild(this.f13924i);
        this.f13925j = new VRectangle(256.0f, 64.0f);
        this.f13925j.position().spX(0.0f);
        this.f13925j.position().spY(-100.0f);
        this.f13925j.position().spZ(60.0f);
        this.f13925j.textures().addElement(this.f13929n.m365g());
        this.f13929n.f13815b.m361a(this.f13925j);
        this.f13917b.addChild(this.f13925j);
        this.f13918c = new VRectangle(41.0f, 86.0f);
        this.f13918c.position().spX((-74.5f) - 12.5f);
        this.f13918c.position().spY(-45.0f);
        this.f13918c.position().spZ(80.0f);
        this.f13918c.textures().addElement(f13916a.m365g());
        f13916a.m369a(this.f13918c, 1);
        this.f13917b.addChild(this.f13918c);
        this.f13919d = new VRectangle(41.0f, 86.0f);
        this.f13919d.position().spX((-33.5f) - 12.5f);
        this.f13919d.position().spY(-45.0f);
        this.f13919d.position().spZ(80.0f);
        this.f13919d.textures().addElement(f13916a.m365g());
        f13916a.m369a(this.f13919d, 2);
        this.f13917b.addChild(this.f13919d);
        this.f13920e = new VRectangle(26.0f, 86.0f);
        this.f13920e.position().spX(0.0f - 12.5f);
        this.f13920e.position().spY(-45.0f);
        this.f13920e.position().spZ(80.0f);
        this.f13920e.textures().addElement(f13916a.m365g());
        f13916a.f13818c.m361a(this.f13920e);
        this.f13917b.addChild(this.f13920e);
        this.f13921f = new VRectangle(41.0f, 86.0f);
        this.f13921f.position().spX(33.5f - 12.5f);
        this.f13921f.position().spY(-45.0f);
        this.f13921f.position().spZ(80.0f);
        this.f13921f.textures().addElement(f13916a.m365g());
        f13916a.m369a(this.f13921f, 3);
        this.f13917b.addChild(this.f13921f);
        this.f13922g = new VRectangle(41.0f, 86.0f);
        this.f13922g.position().spX((-12.5f) + 74.5f);
        this.f13922g.position().spY(-45.0f);
        this.f13922g.position().spZ(80.0f);
        this.f13922g.textures().addElement(f13916a.m365g());
        f13916a.m369a(this.f13922g, 4);
        this.f13917b.addChild(this.f13922g);
        this.f13928m = new VRectangle(31.0f, 43.0f);
        this.f13928m.position().spX(101.5f);
        this.f13928m.position().spY((-45.0f) + 10.0f);
        this.f13928m.position().spZ(80.0f);
        this.f13928m.textures().addElement(f13916a.m365g());
        f13916a.f13817b.m361a(this.f13928m);
        this.f13917b.addChild(this.f13928m);
        this.f13927l = new VRectangle(50.0f, 22.0f);
        this.f13927l.position().spX(99.5f);
        this.f13927l.position().spY((-45.0f) - 10.0f);
        this.f13927l.position().spZ(80.0f);
        this.f13927l.textures().addElement(AlarmWidget.f13707a.m365g());
        this.f13917b.addChild(this.f13927l);
    }

    /* renamed from: a */
    public void m287a(boolean z) {
        this.f13924i.visible(Boolean.valueOf(z));
        this.f13925j.visible(Boolean.valueOf(z));
        this.f13927l.visible(Boolean.valueOf(z));
        this.f13928m.visible(Boolean.valueOf(z && this.f13930o));
        this.f13918c.visible(Boolean.valueOf(z));
        this.f13919d.visible(Boolean.valueOf(z));
        this.f13920e.visible(Boolean.valueOf(z));
        this.f13921f.visible(Boolean.valueOf(z));
        this.f13922g.visible(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void m284d() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (DateFormat.is24HourFormat(this.f13923h)) {
            this.f13926k = "kk";
            this.f13927l.visible(false);
        } else {
            this.f13926k = "h";
            this.f13927l.visible(true);
        }
        int parseInt = Integer.parseInt(DateFormat.format(this.f13926k, calendar).toString());
        int parseInt2 = Integer.parseInt(DateFormat.format("mm", calendar).toString());
        new C4297b(this, this.f13918c, f13916a.f13816a[parseInt / 10], 0);
        new C4297b(this, this.f13919d, f13916a.f13816a[parseInt % 10], VEasing.Back.easeIn);
        new C4297b(this, this.f13921f, f13916a.f13816a[parseInt2 / 10], VEasing.Linear.easeNone);
        new C4297b(this, this.f13922g, f13916a.f13816a[parseInt2 % 10], 600);
    }

    /* renamed from: g */
    private void m281g() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(9) == 0) {
            new C4297b(this, this.f13927l, AlarmWidget.f13707a.f13820b[0], 0);
        } else {
            new C4297b(this, this.f13927l, AlarmWidget.f13707a.f13820b[1], 0);
        }
        this.f13927l.updateUvsVBO();
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.InterfaceC4246b
    /* renamed from: a */
    public void mo279a() {
        m284d();
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.InterfaceC4246b
    /* renamed from: b */
    public void mo275b() {
        m281g();
        m280h();
    }

    /* renamed from: h */
    private void m280h() {
        this.f13929n.m370f();
        new C4297b(this.f13924i, this.f13929n, this.f13929n.f13814a, 0, false);
        new C4297b(this.f13925j, this.f13929n, this.f13929n.f13815b, 100, true);
    }

    /* renamed from: b */
    public void m286b(boolean z) {
        C4305i.m259c("refreshAlarmStat :" + z);
        this.f13930o = z;
        if (z) {
            this.f13928m.visible(true);
        } else {
            this.f13928m.visible(false);
        }
    }

    /* renamed from: e */
    public void m283e() {
        C4322o.m233a(new VObject3d[]{this.f13927l}, AlarmWidget.f13707a.m365g().f2529id, AlarmWidget.f13707a.m367e(), 300, 150, 500);
        C4322o.m233a(new VObject3d[]{this.f13918c, this.f13919d, this.f13920e, this.f13921f, this.f13922g, this.f13928m}, f13916a.m365g().f2529id, f13916a.m368b(), 300, 150, 50);
        C4322o.m233a(new VObject3d[]{this.f13924i, this.f13925j}, this.f13929n.m365g().f2529id, this.f13929n.m372b(), 300, 150, 500);
    }

    /* renamed from: com.tsf.shell.widget.alarm.f$a */
    /* loaded from: classes.dex */
    class C4296a extends VTweenParam {

        /* renamed from: b */
        private AbstractC4263e f13932b;

        /* renamed from: c */
        private boolean f13933c;

        public C4296a(VRectangle vRectangle, AbstractC4263e abstractC4263e, boolean z) {
            this.f13932b = abstractC4263e;
            this.f13933c = z;
            setEase(101);
            setTimeout(0);
            setScaleX(1.0f);
            setScaleY(1.0f);
            setScaleZ(1.0f);
            VTween.killTween(vRectangle);
            VTween.m10747to(vRectangle, 500, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            if (this.f13933c && this.f13932b != null) {
                this.f13932b.m362i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.f$b */
    /* loaded from: classes.dex */
    public class C4297b extends VTweenParam {

        /* renamed from: b */
        private VRectangle f13935b;

        /* renamed from: c */
        private AbstractC4263e f13936c;

        /* renamed from: d */
        private AbstractC4263e.C4264a f13937d;

        /* renamed from: e */
        private boolean f13938e;

        public C4297b(C4295f c4295f, VRectangle vRectangle, AbstractC4263e.C4264a c4264a, int i) {
            this(vRectangle, null, c4264a, i, false);
        }

        public C4297b(VRectangle vRectangle, AbstractC4263e abstractC4263e, AbstractC4263e.C4264a c4264a, int i, boolean z) {
            setTimeout(i);
            setScaleX(0.0f);
            setScaleY(0.0f);
            setScaleZ(0.0f);
            this.f13935b = vRectangle;
            this.f13936c = abstractC4263e;
            this.f13937d = c4264a;
            this.f13938e = z;
            VTween.killTween(vRectangle);
            VTween.m10747to(vRectangle, 100, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            if (this.f13936c != null) {
                this.f13935b.textures().removeAll();
                this.f13935b.textures().addElement(this.f13936c.m365g());
            }
            this.f13937d.m361a(this.f13935b);
            this.f13935b.updateUvsVBO();
            new C4296a(this.f13935b, this.f13936c, this.f13938e);
        }
    }
}
