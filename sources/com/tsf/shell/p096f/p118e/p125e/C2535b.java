package com.tsf.shell.p096f.p118e.p125e;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.e.e.b */
/* loaded from: classes.dex */
public class C2535b extends C0980j {

    /* renamed from: a */
    public float f8408a;

    /* renamed from: b */
    public float f8409b;

    /* renamed from: c */
    public float f8410c;

    /* renamed from: d */
    public float f8411d;

    /* renamed from: e */
    public float f8412e;

    /* renamed from: f */
    public float f8413f;

    /* renamed from: g */
    public float f8414g;

    /* renamed from: h */
    public C2555e f8415h;

    /* renamed from: i */
    private boolean f8416i = false;

    /* renamed from: j */
    private boolean f8417j = false;

    /* renamed from: k */
    private float f8418k;

    /* renamed from: l */
    private float f8419l;

    /* renamed from: m */
    private C0981k f8420m;

    public C2535b() {
        C3567c.m1967a(this, C3567c.f11843b);
        this.f8418k = C0892a.m10742a(170.0f);
        this.f8419l = C0892a.m10742a(280.0f);
        this.f8420m = C0892a.m10741a(100.0f, 100.0f);
        this.f8420m.alpha(0.0f);
        this.f8420m.scale().setAll(0.0f, 0.0f, 1.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        position().f2526x += (this.f8413f - position().f2526x) * 0.15f;
        position().f2527y += (this.f8414g - position().f2527y) * 0.15f;
    }

    /* renamed from: a */
    public void m5323a(float f, float f2) {
        if (!this.f8417j) {
            this.f8413f = f;
            this.f8410c = f;
            this.f8414g = f2;
            this.f8411d = f2;
            this.f8417j = true;
            this.f8420m.alpha(0.0f);
            C1017d c1017d = new C1017d();
            c1017d.m10314a(38);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f8420m);
            C1014c.m10325a(this.f8420m, VEasing.Linear.easeNone, c1017d);
            this.f8420m.textures().clear();
            this.f8420m.textures().addElement(C3359a.f11102p.m5313b());
            this.f8420m.removeFromParent();
            addChildAt(this.f8420m, 0);
        }
    }

    /* renamed from: a */
    public void m5324a() {
        if (this.f8417j) {
            this.f8417j = false;
            float f = this.f8408a;
            this.f8413f = f;
            this.f8410c = f;
            float f2 = this.f8409b;
            this.f8414g = f2;
            this.f8411d = f2;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.e.b.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2535b.this.f8420m.textures().clear();
                    C2535b.this.f8420m.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f8420m);
            C1014c.m10325a(this.f8420m, VEasing.Linear.easeNone, c1017d);
        }
    }

    /* renamed from: a */
    public void m5322a(float f, float f2, float f3) {
        float f4 = 0.0f;
        if (f > this.f8419l) {
            m5324a();
        } else if (f <= this.f8418k) {
            f4 = this.f8418k - f;
        }
        if (f4 > this.f8412e) {
            f4 = this.f8412e;
        }
        float m594b = C4189x.m594b(f2, f3, this.f8410c, this.f8411d);
        float abs = (Math.abs(f2 - this.f8410c) * f4) / m594b;
        this.f8413f = f2 > this.f8410c ? abs + this.f8410c : this.f8410c - abs;
        float abs2 = (f4 * Math.abs(f3 - this.f8411d)) / m594b;
        this.f8414g = f3 > this.f8411d ? abs2 + this.f8411d : this.f8411d - abs2;
    }

    /* renamed from: a */
    public void m5321a(float f, float f2, boolean z) {
        this.f8413f = f;
        this.f8410c = f;
        this.f8408a = f;
        this.f8414g = f2;
        this.f8411d = f2;
        this.f8409b = f2;
        if (!this.f8416i && z) {
            position().f2526x = this.f8410c;
            position().f2527y = this.f8411d;
        }
    }

    /* renamed from: b */
    public void m5319b() {
        if (!this.f8416i) {
            this.f8416i = true;
            this.f8412e = 80.0f * C0892a.f2567c;
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10314a(255);
            c1017d.m10313a(C0986a.f2950e);
            c1017d.m10309b(150);
            C1014c.m10326a(this.f8415h);
            C1014c.m10325a(this.f8415h, 300, c1017d);
            C3359a.f11097k.m2296a(this.f8415h);
        }
    }

    /* renamed from: c */
    public void m5318c() {
        if (this.f8416i) {
            this.f8416i = false;
            m5324a();
            final Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.e.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C2535b.this.removeFromParent();
                }
            };
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.e.b.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    runnable.run();
                }
            };
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            c1017d.m10314a(0);
            C1014c.m10326a(this.f8415h);
            C1014c.m10325a(this.f8415h, 300, c1017d);
            C3359a.f11097k.m2294c(this.f8415h);
        }
    }
}
