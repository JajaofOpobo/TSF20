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
import com.tsf.shell.widget.alarm.a;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.service.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends VObject3dContainer implements AlarmWidget.b, a.c, c.InterfaceC0180c {
    public h a;
    private VWidgetContainer b = AlarmWidget.b;
    private VTextureManager c = AlarmWidget.c;
    private VObjectManager d = AlarmWidget.d;
    private VMessageQueueManager e = AlarmWidget.e;
    private Context f = AlarmWidget.h;
    private com.tsf.shell.widget.alarm.service.c g = AlarmWidget.k;
    private f h;
    private com.tsf.shell.widget.alarm.b.f i;
    private VRectangle j;
    private VRectangle k;
    private VRectangle l;
    private VRectangle m;
    private q n;
    private l o;
    private com.tsf.shell.widget.alarm.c.b p;

    public g() {
        h();
    }

    private void h() {
        this.a = new h();
        addChild(this.a);
        this.o = new l();
        addChild(this.o);
        this.h = new f(this, this.f);
        this.i = new com.tsf.shell.widget.alarm.b.f(this.f, this.c);
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
        this.n = new q();
        addChild(this.n);
        this.p = new com.tsf.shell.widget.alarm.c.b();
        this.p.position().spX(-180.0f);
        this.p.position().spY(-150.0f);
        this.p.position().spZ(0.0f);
        this.p.a(com.tsf.shell.widget.alarm.c.b.a.h, com.tsf.shell.widget.alarm.c.b.a.g);
        this.p.a(new Runnable() { // from class: com.tsf.shell.widget.alarm.g.1
            @Override // java.lang.Runnable
            public void run() {
                AlarmWidget.a();
            }
        });
        addChild(this.p);
        this.g.a(this);
        AlarmWidget.l.i.a(this);
        c();
        AlarmWidget.a((AlarmWidget.b) this);
    }

    public void c() {
        AlarmWidget.k.a(new c.a() { // from class: com.tsf.shell.widget.alarm.g.2
            @Override // com.tsf.shell.widget.alarm.service.c.a
            public void a(com.tsf.shell.widget.alarm.service.b bVar) {
                i.c("RequestUpdate RequestUpdate RequestUpdate");
                bVar.a(false);
            }
        });
    }

    @Override // com.tsf.shell.widget.alarm.service.c.InterfaceC0180c
    public void a(int i, byte[] bArr) {
        AlarmWidget.l.m.b();
        com.tsf.shell.widget.alarm.d.c cVar = (com.tsf.shell.widget.alarm.d.c) com.tsf.shell.widget.alarm.d.c.a(bArr);
        cVar.b();
        a(cVar);
    }

    public void a(final com.tsf.shell.widget.alarm.d.c cVar) {
        this.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.g.3
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmapDecodeByteArray;
                if (cVar.j != null) {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(cVar.j, 0, cVar.j.length);
                    cVar.j = null;
                } else {
                    bitmapDecodeByteArray = null;
                }
                if (bitmapDecodeByteArray != null) {
                    g.this.n.a(bitmapDecodeByteArray);
                }
                if (com.tsf.shell.widget.alarm.setting.e.b) {
                    g.this.i.a(cVar.d, cVar.e, cVar.f, cVar.b);
                } else {
                    g.this.i.a(cVar.g, cVar.h, cVar.i, cVar.b);
                }
                g.this.new b(g.this.k, g.this.i, g.this.i.b, 100, false);
                g.this.new b(g.this.l, g.this.i, g.this.i.c, VEasing.Back.easeIn, false);
                g.this.new b(g.this.j, g.this.i, g.this.i.a, 300, false);
                g.this.new b(g.this.m, g.this.i, g.this.i.d, VEasing.Linear.easeNone, true);
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
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
            if (this.c) {
                this.b.i();
            }
        }
    }

    class b extends VTweenParam {
        private VRectangle b;
        private com.tsf.shell.widget.alarm.b.e c;
        private e.a d;
        private boolean e;

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
            this.b.textures().removeAll();
            this.b.textures().addElement(this.c.g());
            this.d.a(this.b);
            this.b.updateUvsVBO();
            g.this.new a(this.b, this.c, this.e);
        }
    }

    @Override // com.tsf.shell.widget.alarm.a.c
    public void a(boolean z) {
        this.h.b(z);
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.b
    public void a() {
    }

    @Override // com.tsf.shell.widget.alarm.AlarmWidget.b
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
        o.a(new VObject3d[]{this.k, this.j, this.l, this.m}, this.i.g().id, this.i.e(), 300, 150, 500);
        this.h.e();
        this.a.a();
        this.o.a();
    }
}
