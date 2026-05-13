package com.tsf.shell.p096f.p101c.p102a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.c.a.g */
/* loaded from: classes.dex */
public class C2344g extends C0981k {

    /* renamed from: a */
    private float f7663a;

    /* renamed from: d */
    private float f7664d;

    /* renamed from: e */
    private float f7665e;

    /* renamed from: f */
    private float f7666f;

    /* renamed from: g */
    private float f7667g;

    public C2344g(int i, int i2, C2345h c2345h) {
        super(0.0f, 0.0f, 3, 1, false);
        m5785a(i, i2, c2345h);
    }

    /* renamed from: a */
    public void m5785a(int i, int i2, C2345h c2345h) {
        this.f7664d = i * C0892a.f2566b;
        this.f7665e = i2 * C0892a.f2566b;
        m5784a(c2345h, false);
        m5782d();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
    }

    /* renamed from: a */
    private void m5784a(C2345h c2345h, boolean z) {
        float f = c2345h.f7668a;
        float f2 = c2345h.f7669b;
        float f3 = c2345h.f7670c;
        float f4 = this.f7664d / 2.0f;
        this.f7666f = C0892a.f2566b * f;
        this.f7667g = (c2345h.f7670c - f2) * C0892a.f2566b;
        uvs().set(0, 1.0f, 1.0f);
        uvs().set(3, 0.0f, 1.0f);
        uvs().set(4, 1.0f, 0.0f);
        uvs().set(7, 0.0f, 0.0f);
        uvs().set(1, f2 / f3, 1.0f);
        uvs().set(2, f / f3, 1.0f);
        uvs().set(6, f2 / f3, 0.0f);
        uvs().set(5, f / f3, 0.0f);
        points().setPX(2, (-f4) + this.f7666f, (-this.f7665e) / 2.0f, 0.0f);
        points().setPX(3, -f4, (-this.f7665e) / 2.0f, 0.0f);
        points().setPX(6, (-f4) + this.f7666f, this.f7665e / 2.0f, 0.0f);
        points().setPX(7, -f4, this.f7665e / 2.0f, 0.0f);
        points().setPX(1, 0.0f, (-this.f7665e) / 2.0f, 0.0f);
        points().setPX(0, this.f7667g, (-this.f7665e) / 2.0f, 0.0f);
        points().setPX(5, 0.0f, this.f7665e / 2.0f, 0.0f);
        points().setPX(4, this.f7667g, this.f7665e / 2.0f, 0.0f);
        if (z) {
            syncUpdateUvsVBO();
        }
    }

    /* renamed from: a */
    public float m5786a() {
        return this.f7663a;
    }

    /* renamed from: c */
    public void m5783c(float f) {
        this.f7663a = f;
        m5782d();
    }

    /* renamed from: d */
    private void m5782d() {
        float f = this.f7663a;
        float f2 = this.f7665e / 2.0f;
        points().setPX(1, f, -f2, 0.0f);
        points().setPX(0, this.f7667g + f, -f2, 0.0f);
        points().setPX(5, f, f2, 0.0f);
        points().setPX(4, f + this.f7667g, f2, 0.0f);
        syncUpdatePointVBO();
    }
}
