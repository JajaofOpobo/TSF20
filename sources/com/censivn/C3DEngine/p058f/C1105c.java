package com.censivn.C3DEngine.p058f;

import com.censivn.C3DEngine.p056d.InterfaceC1082a;
import com.tsf.shell.utils.C4189x;
import java.nio.FloatBuffer;
/* renamed from: com.censivn.C3DEngine.f.c */
/* loaded from: classes.dex */
public class C1105c extends AbstractC1103a {

    /* renamed from: c */
    private short f3536c;

    /* renamed from: d */
    private short f3537d;

    /* renamed from: e */
    private short f3538e;

    /* renamed from: f */
    private short f3539f;

    /* renamed from: g */
    private FloatBuffer f3540g;

    public C1105c(int i, int i2, int i3, int i4, InterfaceC1082a interfaceC1082a) {
        super(interfaceC1082a);
        this.f3536c = (short) i;
        this.f3537d = (short) i2;
        this.f3538e = (short) i3;
        this.f3539f = (short) i4;
        this.f3540g = m9858f();
        m9863a();
    }

    /* renamed from: b */
    public short m9862b() {
        return this.f3536c;
    }

    /* renamed from: c */
    public short m9861c() {
        return this.f3537d;
    }

    /* renamed from: d */
    public short m9860d() {
        return this.f3538e;
    }

    /* renamed from: e */
    public short m9859e() {
        return this.f3539f;
    }

    /* renamed from: f */
    public FloatBuffer m9858f() {
        return C4189x.m611a(m9862b() / 255.0f, m9861c() / 255.0f, m9860d() / 255.0f, m9859e() / 255.0f);
    }

    public String toString() {
        return "r:" + ((int) this.f3536c) + ", g:" + ((int) this.f3537d) + ", b:" + ((int) this.f3538e) + ", a:" + ((int) this.f3539f);
    }
}
