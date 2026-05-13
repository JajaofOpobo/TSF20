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
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.C4249a;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
import com.tsf.shell.widget.alarm.p203b.C4265f;
import com.tsf.shell.widget.alarm.p204c.C4269b;
import com.tsf.shell.widget.alarm.p205d.C4292c;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c;
import com.tsf.shell.widget.alarm.setting.C4371e;
/* renamed from: com.tsf.shell.widget.alarm.g */
/* loaded from: classes.dex */
public class C4298g extends VObject3dContainer implements AlarmWidget.InterfaceC4246b, C4249a.InterfaceC4256c, ServiceConnectionC4343c.InterfaceC4346c {

    /* renamed from: a */
    public C4304h f13939a;

    /* renamed from: b */
    private VWidgetContainer f13940b = AlarmWidget.f13708b;

    /* renamed from: c */
    private VTextureManager f13941c = AlarmWidget.f13709c;

    /* renamed from: d */
    private VObjectManager f13942d = AlarmWidget.f13710d;

    /* renamed from: e */
    private VMessageQueueManager f13943e = AlarmWidget.f13711e;

    /* renamed from: f */
    private Context f13944f = AlarmWidget.f13714h;

    /* renamed from: g */
    private ServiceConnectionC4343c f13945g = AlarmWidget.f13715k;

    /* renamed from: h */
    private C4295f f13946h;

    /* renamed from: i */
    private C4265f f13947i;

    /* renamed from: j */
    private VRectangle f13948j;

    /* renamed from: k */
    private VRectangle f13949k;

    /* renamed from: l */
    private VRectangle f13950l;

    /* renamed from: m */
    private VRectangle f13951m;

    /* renamed from: n */
    private C4329q f13952n;

    /* renamed from: o */
    private C4311l f13953o;

    /* renamed from: p */
    private C4269b f13954p;

    public C4298g() {
        m264h();
    }

    /* renamed from: h */
    private void m264h() {
        this.f13939a = new C4304h();
        addChild(this.f13939a);
        this.f13953o = new C4311l();
        addChild(this.f13953o);
        this.f13946h = new C4295f(this, this.f13944f);
        this.f13947i = new C4265f(this.f13944f, this.f13941c);
        this.f13947i.m359a("--", "--", "--", "--");
        this.f13948j = new VRectangle(100.0f, 64.0f, 1, 1);
        this.f13948j.position().spY(66.0f);
        this.f13948j.position().spZ(60.0f);
        this.f13942d.addObject(this.f13948j);
        this.f13948j.textures().addElement(this.f13947i.m365g());
        this.f13947i.f13837a.m361a(this.f13948j);
        addChild(this.f13948j);
        this.f13949k = new VRectangle(75.0f, 64.0f, 1, 1);
        this.f13949k.position().spX(-70.0f);
        this.f13949k.position().spY(66.0f);
        this.f13949k.position().spZ(40.0f);
        this.f13942d.addObject(this.f13949k);
        this.f13949k.textures().addElement(this.f13947i.m365g());
        this.f13947i.f13838b.m361a(this.f13949k);
        addChild(this.f13949k);
        this.f13950l = new VRectangle(75.0f, 64.0f, 1, 1);
        this.f13950l.position().spX(70.0f);
        this.f13950l.position().spY(66.0f);
        this.f13950l.position().spZ(40.0f);
        this.f13942d.addObject(this.f13950l);
        this.f13950l.textures().addElement(this.f13947i.m365g());
        this.f13947i.f13839c.m361a(this.f13950l);
        addChild(this.f13950l);
        this.f13951m = new VRectangle(256.0f, 64.0f, 1, 1);
        this.f13951m.position().spX(0.0f);
        this.f13951m.position().spY(36.0f);
        this.f13951m.position().spZ(50.0f);
        this.f13942d.addObject(this.f13951m);
        this.f13951m.textures().addElement(this.f13947i.m365g());
        this.f13947i.f13840d.m361a(this.f13951m);
        addChild(this.f13951m);
        this.f13952n = new C4329q();
        addChild(this.f13952n);
        this.f13954p = new C4269b();
        this.f13954p.position().spX(-180.0f);
        this.f13954p.position().spY(-150.0f);
        this.f13954p.position().spZ(0.0f);
        this.f13954p.m350a(C4269b.f13848a.f13811h, C4269b.f13848a.f13810g);
        this.f13954p.m348a(new Runnable() { // from class: com.tsf.shell.widget.alarm.g.1
            @Override // java.lang.Runnable
            public void run() {
                AlarmWidget.m419a();
            }
        });
        addChild(this.f13954p);
        this.f13945g.m190a(this);
        AlarmWidget.f13716l.f13723i.m395a(this);
        m273c();
        AlarmWidget.m417a((AlarmWidget.InterfaceC4246b) this);
    }

    /* renamed from: c */
    public void m273c() {
        AlarmWidget.f13715k.m191a(new ServiceConnectionC4343c.InterfaceC4344a() { // from class: com.tsf.shell.widget.alarm.g.2
            @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4344a
            /* renamed from: a */
            public void mo153a(InterfaceC4340b interfaceC4340b) {
                C4305i.m259c("RequestUpdate RequestUpdate RequestUpdate");
                interfaceC4340b.mo195a(false);
            }
        });
    }

    @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4346c
    /* renamed from: a */
    public void mo171a(int i, byte[] bArr) {
        AlarmWidget.f13716l.f13725m.m249b();
        C4292c c4292c = (C4292c) C4292c.m306a(bArr);
        c4292c.m298b();
        m278a(c4292c);
    }

    /* renamed from: a */
    public void m278a(final C4292c c4292c) {
        this.f13943e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.g.3
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap;
                if (c4292c.f13903j != null) {
                    bitmap = BitmapFactory.decodeByteArray(c4292c.f13903j, 0, c4292c.f13903j.length);
                    c4292c.f13903j = null;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    C4298g.this.f13952n.m215a(bitmap);
                }
                if (C4371e.f14138b) {
                    C4298g.this.f13947i.m359a(c4292c.f13897d, c4292c.f13898e, c4292c.f13899f, c4292c.f13895b);
                } else {
                    C4298g.this.f13947i.m359a(c4292c.f13900g, c4292c.f13901h, c4292c.f13902i, c4292c.f13895b);
                }
                new C4303b(C4298g.this.f13949k, C4298g.this.f13947i, C4298g.this.f13947i.f13838b, 100, false);
                new C4303b(C4298g.this.f13950l, C4298g.this.f13947i, C4298g.this.f13947i.f13839c, VEasing.Back.easeIn, false);
                new C4303b(C4298g.this.f13948j, C4298g.this.f13947i, C4298g.this.f13947i.f13837a, 300, false);
                new C4303b(C4298g.this.f13951m, C4298g.this.f13947i, C4298g.this.f13947i.f13840d, VEasing.Linear.easeNone, true);
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    /* renamed from: com.tsf.shell.widget.alarm.g$a */
    /* loaded from: classes.dex */
    class C4302a extends VTweenParam {

        /* renamed from: b */
        private AbstractC4263e f13960b;

        /* renamed from: c */
        private boolean f13961c;

        public C4302a(VRectangle vRectangle, AbstractC4263e abstractC4263e, boolean z) {
            this.f13960b = abstractC4263e;
            this.f13961c = z;
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
            if (this.f13961c) {
                this.f13960b.m362i();
            }
        }
    }

    /* renamed from: com.tsf.shell.widget.alarm.g$b */
    /* loaded from: classes.dex */
    class C4303b extends VTweenParam {

        /* renamed from: b */
        private VRectangle f13963b;

        /* renamed from: c */
        private AbstractC4263e f13964c;

        /* renamed from: d */
        private AbstractC4263e.C4264a f13965d;

        /* renamed from: e */
        private boolean f13966e;

        public C4303b(VRectangle vRectangle, AbstractC4263e abstractC4263e, AbstractC4263e.C4264a c4264a, int i, boolean z) {
            setTimeout(i);
            setScaleX(0.0f);
            setScaleY(0.0f);
            setScaleZ(0.0f);
            this.f13963b = vRectangle;
            this.f13964c = abstractC4263e;
            this.f13965d = c4264a;
            this.f13966e = z;
            VTween.killTween(vRectangle);
            VTween.m10747to(vRectangle, 100, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            this.f13963b.textures().removeAll();
            this.f13963b.textures().addElement(this.f13964c.m365g());
            this.f13965d.m361a(this.f13963b);
            this.f13963b.updateUvsVBO();
            new C4302a(this.f13963b, this.f13964c, this.f13966e);
        }
    }

    @Override // com.tsf.shell.widget.alarm.C4249a.InterfaceC4256c
    /* renamed from: a */
    public void mo276a(boolean z) {
        this.f13946h.m286b(z);
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.InterfaceC4246b
    /* renamed from: a */
    public void mo279a() {
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.InterfaceC4246b
    /* renamed from: b */
    public void mo275b() {
        m273c();
    }

    /* renamed from: d */
    public void m271d() {
    }

    /* renamed from: e */
    public void m269e() {
        this.f13948j.visible(true);
        this.f13949k.visible(true);
        this.f13950l.visible(true);
        this.f13951m.visible(true);
        this.f13952n.visible(true);
        this.f13953o.visible(true);
        this.f13946h.m287a(true);
        this.f13954p.visible(true);
    }

    /* renamed from: f */
    public void m267f() {
        this.f13948j.visible(false);
        this.f13949k.visible(false);
        this.f13950l.visible(false);
        this.f13951m.visible(false);
        this.f13952n.visible(false);
        this.f13953o.visible(false);
        this.f13946h.m287a(false);
        this.f13954p.visible(false);
    }

    /* renamed from: g */
    public void m265g() {
        C4322o.m233a(new VObject3d[]{this.f13949k, this.f13948j, this.f13950l, this.f13951m}, this.f13947i.m365g().f2529id, this.f13947i.m356e(), 300, 150, 500);
        this.f13946h.m283e();
        this.f13939a.m263a();
        this.f13953o.m248a();
    }
}
