package com.censivn.C3DEngine.p031b.p038f;

import com.censivn.C3DEngine.api.element.Color4;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.f.c */
/* loaded from: classes.dex */
public class C0969c extends C0980j {

    /* renamed from: a */
    private Color4[] f2888a;

    /* renamed from: b */
    private float f2889b;

    /* renamed from: c */
    private float f2890c;

    /* renamed from: d */
    private float f2891d;

    public C0969c(float f, float f2, float f3, Color4[] color4Arr, Boolean bool, Boolean bool2, Boolean bool3) {
        super(24, 12, bool, bool2, bool3);
        this.f2889b = f;
        this.f2890c = f2;
        this.f2891d = f3;
        if (color4Arr != null) {
            this.f2888a = color4Arr;
        } else {
            this.f2888a = new Color4[6];
            this.f2888a[0] = new Color4(255, 0, 0, 255);
            this.f2888a[1] = new Color4(0, 255, 0, 255);
            this.f2888a[2] = new Color4(0, 0, 255, 255);
            this.f2888a[3] = new Color4(255, 255, 0, 255);
            this.f2888a[4] = new Color4(0, 255, 255, 255);
            this.f2888a[5] = new Color4(255, 0, 255, 255);
        }
        m10379a();
    }

    public C0969c(float f, float f2, float f3) {
        this(f, f2, f3, null, true, true, true);
    }

    /* renamed from: a */
    private void m10379a() {
        float f = this.f2889b / 2.0f;
        float f2 = this.f2890c / 2.0f;
        float f3 = this.f2891d / 2.0f;
        C4189x.m598a(this, vertices().addVertex(-f, f2, f3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.f2888a[0].f2525r, this.f2888a[0].f2524g, this.f2888a[0].f2523b, this.f2888a[0].f2522a), vertices().addVertex(f, f2, f3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.f2888a[0].f2525r, this.f2888a[0].f2524g, this.f2888a[0].f2523b, this.f2888a[0].f2522a), vertices().addVertex(f, -f2, f3, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, this.f2888a[0].f2525r, this.f2888a[0].f2524g, this.f2888a[0].f2523b, this.f2888a[0].f2522a), vertices().addVertex(-f, -f2, f3, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, this.f2888a[0].f2525r, this.f2888a[0].f2524g, this.f2888a[0].f2523b, this.f2888a[0].f2522a));
        C4189x.m598a(this, vertices().addVertex(f, f2, f3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.f2888a[1].f2525r, this.f2888a[1].f2524g, this.f2888a[1].f2523b, this.f2888a[1].f2522a), vertices().addVertex(f, f2, -f3, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.f2888a[1].f2525r, this.f2888a[1].f2524g, this.f2888a[1].f2523b, this.f2888a[1].f2522a), vertices().addVertex(f, -f2, -f3, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, this.f2888a[1].f2525r, this.f2888a[1].f2524g, this.f2888a[1].f2523b, this.f2888a[1].f2522a), vertices().addVertex(f, -f2, f3, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, this.f2888a[1].f2525r, this.f2888a[1].f2524g, this.f2888a[1].f2523b, this.f2888a[1].f2522a));
        C4189x.m598a(this, vertices().addVertex(f, f2, -f3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.f2888a[2].f2525r, this.f2888a[2].f2524g, this.f2888a[2].f2523b, this.f2888a[2].f2522a), vertices().addVertex(-f, f2, -f3, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.f2888a[2].f2525r, this.f2888a[2].f2524g, this.f2888a[2].f2523b, this.f2888a[2].f2522a), vertices().addVertex(-f, -f2, -f3, 1.0f, 1.0f, 0.0f, 0.0f, -1.0f, this.f2888a[2].f2525r, this.f2888a[2].f2524g, this.f2888a[2].f2523b, this.f2888a[2].f2522a), vertices().addVertex(f, -f2, -f3, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, this.f2888a[2].f2525r, this.f2888a[2].f2524g, this.f2888a[2].f2523b, this.f2888a[2].f2522a));
        C4189x.m598a(this, vertices().addVertex(-f, f2, -f3, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, this.f2888a[3].f2525r, this.f2888a[3].f2524g, this.f2888a[3].f2523b, this.f2888a[3].f2522a), vertices().addVertex(-f, f2, f3, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, this.f2888a[3].f2525r, this.f2888a[3].f2524g, this.f2888a[3].f2523b, this.f2888a[3].f2522a), vertices().addVertex(-f, -f2, f3, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, this.f2888a[3].f2525r, this.f2888a[3].f2524g, this.f2888a[3].f2523b, this.f2888a[3].f2522a), vertices().addVertex(-f, -f2, -f3, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, this.f2888a[3].f2525r, this.f2888a[3].f2524g, this.f2888a[3].f2523b, this.f2888a[3].f2522a));
        C4189x.m598a(this, vertices().addVertex(-f, f2, -f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, this.f2888a[4].f2525r, this.f2888a[4].f2524g, this.f2888a[4].f2523b, this.f2888a[4].f2522a), vertices().addVertex(f, f2, -f3, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, this.f2888a[4].f2525r, this.f2888a[4].f2524g, this.f2888a[4].f2523b, this.f2888a[4].f2522a), vertices().addVertex(f, f2, f3, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, this.f2888a[4].f2525r, this.f2888a[4].f2524g, this.f2888a[4].f2523b, this.f2888a[4].f2522a), vertices().addVertex(-f, f2, f3, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, this.f2888a[4].f2525r, this.f2888a[4].f2524g, this.f2888a[4].f2523b, this.f2888a[4].f2522a));
        C4189x.m598a(this, vertices().addVertex(-f, -f2, f3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.f2888a[5].f2525r, this.f2888a[5].f2524g, this.f2888a[5].f2523b, this.f2888a[5].f2522a), vertices().addVertex(f, -f2, f3, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.f2888a[5].f2525r, this.f2888a[5].f2524g, this.f2888a[5].f2523b, this.f2888a[5].f2522a), vertices().addVertex(f, -f2, -f3, 1.0f, 1.0f, 0.0f, -1.0f, 0.0f, this.f2888a[5].f2525r, this.f2888a[5].f2524g, this.f2888a[5].f2523b, this.f2888a[5].f2522a), vertices().addVertex(-f, -f2, -f3, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, this.f2888a[5].f2525r, this.f2888a[5].f2524g, this.f2888a[5].f2523b, this.f2888a[5].f2522a));
    }
}
