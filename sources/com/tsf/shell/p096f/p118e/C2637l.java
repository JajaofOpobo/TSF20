package com.tsf.shell.p096f.p118e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0973g;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
/* renamed from: com.tsf.shell.f.e.l */
/* loaded from: classes.dex */
public class C2637l extends C0980j {

    /* renamed from: a */
    private int f8682a = 0;

    /* renamed from: b */
    private C0973g f8683b = new C0973g();

    /* renamed from: c */
    private C0984m f8684c;

    /* renamed from: d */
    private float f8685d;

    public C2637l(int i, int i2) {
        this.f8683b.mo5013a(C0892a.f2567c * 70.0f, C0892a.f2567c * 70.0f);
        this.f8683b.m10375a(i);
        this.f8683b.calAABB();
        this.f8684c = new C0984m();
        this.f8684c.m10347d(50);
        this.f8684c.m10349c(i2);
        this.f8684c.m10352b(1);
        this.f8684c.m10353b();
        m5097c();
        addChild(this.f8683b);
        addChild(this.f8684c);
        this.f8685d = this.f8684c.position().f2526x + this.f8684c.maxX();
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.e.l.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2637l.this.mo731a();
            }
        });
    }

    /* renamed from: a */
    public void mo731a() {
    }

    /* renamed from: b */
    public void m5098b() {
        this.f8683b.m10376a();
        this.f8684c.m10358a();
    }

    /* renamed from: a */
    public void m5099a(int i) {
        this.f8682a = i;
        m5096d();
    }

    /* renamed from: c */
    private void m5097c() {
        this.f8683b.position().f2526x = this.f8683b.mo10366b() / 2.0f;
        this.f8684c.position().f2526x = this.f8683b.position().f2526x + (this.f8683b.mo10366b() / 2.0f) + C0892a.m10742a(20.0f);
    }

    /* renamed from: d */
    private void m5096d() {
        m5097c();
        float m10742a = C0892a.m10742a(100.0f);
        switch (this.f8682a) {
            case 0:
                this.f8683b.position().f2526x -= this.f8685d / 2.0f;
                this.f8684c.position().f2526x -= this.f8685d / 2.0f;
                setAABBPX((-this.f8685d) / 2.0f, (-m10742a) / 2.0f, 0.0f, this.f8685d / 2.0f, m10742a / 2.0f, 0.0f);
                return;
            case 1:
                setAABBPX(0.0f, (-m10742a) / 2.0f, 0.0f, this.f8685d, m10742a / 2.0f, 0.0f);
                return;
            case 2:
                this.f8683b.position().f2526x -= this.f8685d;
                this.f8684c.position().f2526x -= this.f8685d;
                setAABBPX((-this.f8685d) / 2.0f, (-m10742a) / 2.0f, 0.0f, 0.0f, m10742a / 2.0f, 0.0f);
                return;
            default:
                return;
        }
    }
}
