package com.tsf.shell.p096f.p107d.p114d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
/* renamed from: com.tsf.shell.f.d.d.b */
/* loaded from: classes.dex */
public class C2434b {

    /* renamed from: a */
    public static float f8024a = 30.0f;

    /* renamed from: d */
    private boolean f8027d = false;

    /* renamed from: c */
    private Vector2 f8026c = new Vector2(0.0f, 0.0f);

    /* renamed from: b */
    public World f8025b = new World(this.f8026c, true);

    /* renamed from: a */
    public boolean m5561a() {
        return this.f8027d;
    }

    /* renamed from: a */
    public void m5558a(boolean z) {
        this.f8027d = z;
    }

    /* renamed from: a */
    public void m5560a(C2932g c2932g) {
        C3359a.f11108v.f7770c.m5573e().mo5568a(c2932g);
        boolean m5557b = m5557b();
        if (m5557b) {
            this.f8025b.setGravity(new Vector2(0.0f, -100.0f));
            this.f8025b.step(0.025f, 3, 3);
            C0853a.m10855e().m10760j();
        }
        C3359a.f11108v.f7770c.m5573e().mo5566a(m5557b);
    }

    /* renamed from: b */
    public boolean m5557b() {
        return C3359a.f11108v.f7770c.m5573e().mo5569a();
    }

    /* renamed from: a */
    public void m5559a(C3112b c3112b) {
        C3359a.f11108v.f7770c.m5573e().mo5567a(c3112b);
    }
}
