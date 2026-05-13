package com.tsf.shell.p096f.p148h.p149a.p150a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p169c.p170a.p171a.C3459a;
import com.tsf.shell.utils.C4166c;
/* renamed from: com.tsf.shell.f.h.a.a.b */
/* loaded from: classes.dex */
public class C3058b extends C0980j {

    /* renamed from: b */
    private C0984m f9925b;

    /* renamed from: c */
    private C3459a f9926c;

    /* renamed from: e */
    private C4166c f9928e = new C4166c();

    /* renamed from: d */
    private TextureElement f9927d = new TextureElement(0, false);

    /* renamed from: a */
    private C0981k f9924a = new C0981k(C3063d.f9935a, C3063d.f9935a, false);

    public C3058b() {
        this.f9924a.textures().addElement(this.f9927d);
        this.f9924a.calAABB();
        this.f9925b = new C0984m();
        this.f9925b.m10347d(32);
        this.f9925b.position().f2527y = C0892a.m10742a(-120.0f);
        this.f9925b.m10343g(170);
        addChild(this.f9924a);
        addChild(this.f9925b);
        m3700d();
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.h.a.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C3058b.this.f9926c != null) {
                    C3359a.f11101o.m3633a().m3648v().m3690a(C3058b.this);
                }
            }
        });
    }

    /* renamed from: a */
    public C3459a m3705a() {
        return this.f9926c;
    }

    /* renamed from: b */
    public C0981k m3703b() {
        return this.f9924a;
    }

    /* renamed from: c */
    public TextureElement m3701c() {
        return this.f9927d;
    }

    /* renamed from: d */
    public void m3700d() {
        setAABBPX(C0892a.m10742a(200.0f), C0892a.m10742a(250.0f));
        if (parent() != null) {
            ((C0980j) parent()).onChildMeasure(this);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f9927d.f2529id == 0) {
            this.f9927d.f2529id = C3359a.f11101o.m3633a().m3648v().m3687c(false).f2529id;
            if (this.f9926c != null) {
                C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.f.h.a.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C3058b.this.m3699e();
                    }
                });
            }
        }
    }

    /* renamed from: e */
    public void m3699e() {
        if (this.f9926c != null) {
            Bitmap m2327a = this.f9926c.m2327a(C3063d.f9935a, C3063d.f9935a, false);
            if (m2327a != null) {
                this.f9928e.m696a(m2327a);
                Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.h.a.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C3058b.this.m3695i();
                    }
                };
                if (C0869e.m10758l()) {
                    runnable.run();
                    return;
                } else {
                    C0853a.m10865a().m10583c(runnable);
                    return;
                }
            }
            this.f9927d.f2529id = C3359a.f11101o.m3633a().m3648v().m3687c(false).f2529id;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m3695i() {
        Bitmap m697a = this.f9928e.m697a();
        m3696h();
        if (m697a != null) {
            C0853a.m10853g().m10540a(this.f9927d, m697a);
            m697a.recycle();
        }
    }

    /* renamed from: f */
    public void m3698f() {
        this.f9925b.m10355a(this.f9926c.f11434c);
        this.f9925b.m10353b();
    }

    /* renamed from: g */
    public void m3697g() {
        m3696h();
        this.f9925b.m10358a();
    }

    /* renamed from: h */
    public void m3696h() {
        if (this.f9927d.f2529id == C3359a.f11101o.m3633a().m3648v().m3687c(false).f2529id) {
            this.f9927d.f2529id = 0;
        } else {
            C0853a.m10853g().m10543a(this.f9927d);
        }
    }
}
