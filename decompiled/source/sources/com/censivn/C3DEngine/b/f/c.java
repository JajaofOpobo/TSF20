package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.Color4;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class c extends j {
    private Color4[] a;
    private float b;
    private float c;
    private float d;

    public c(float f, float f2, float f3, Color4[] color4Arr, Boolean bool, Boolean bool2, Boolean bool3) {
        super(24, 12, bool, bool2, bool3);
        this.b = f;
        this.c = f2;
        this.d = f3;
        if (color4Arr != null) {
            this.a = color4Arr;
        } else {
            this.a = new Color4[6];
            this.a[0] = new Color4(255, 0, 0, 255);
            this.a[1] = new Color4(0, 255, 0, 255);
            this.a[2] = new Color4(0, 0, 255, 255);
            this.a[3] = new Color4(255, 255, 0, 255);
            this.a[4] = new Color4(0, 255, 255, 255);
            this.a[5] = new Color4(255, 0, 255, 255);
        }
        a();
    }

    public c(float f, float f2, float f3) {
        this(f, f2, f3, null, true, true, true);
    }

    private void a() {
        float f = this.b / 2.0f;
        float f2 = this.c / 2.0f;
        float f3 = this.d / 2.0f;
        x.a(this, vertices().addVertex(-f, f2, f3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.a[0].r, this.a[0].g, this.a[0].b, this.a[0].a), vertices().addVertex(f, f2, f3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.a[0].r, this.a[0].g, this.a[0].b, this.a[0].a), vertices().addVertex(f, -f2, f3, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, this.a[0].r, this.a[0].g, this.a[0].b, this.a[0].a), vertices().addVertex(-f, -f2, f3, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, this.a[0].r, this.a[0].g, this.a[0].b, this.a[0].a));
        x.a(this, vertices().addVertex(f, f2, f3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.a[1].r, this.a[1].g, this.a[1].b, this.a[1].a), vertices().addVertex(f, f2, -f3, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, this.a[1].r, this.a[1].g, this.a[1].b, this.a[1].a), vertices().addVertex(f, -f2, -f3, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, this.a[1].r, this.a[1].g, this.a[1].b, this.a[1].a), vertices().addVertex(f, -f2, f3, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, this.a[1].r, this.a[1].g, this.a[1].b, this.a[1].a));
        x.a(this, vertices().addVertex(f, f2, -f3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.a[2].r, this.a[2].g, this.a[2].b, this.a[2].a), vertices().addVertex(-f, f2, -f3, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.a[2].r, this.a[2].g, this.a[2].b, this.a[2].a), vertices().addVertex(-f, -f2, -f3, 1.0f, 1.0f, 0.0f, 0.0f, -1.0f, this.a[2].r, this.a[2].g, this.a[2].b, this.a[2].a), vertices().addVertex(f, -f2, -f3, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, this.a[2].r, this.a[2].g, this.a[2].b, this.a[2].a));
        x.a(this, vertices().addVertex(-f, f2, -f3, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, this.a[3].r, this.a[3].g, this.a[3].b, this.a[3].a), vertices().addVertex(-f, f2, f3, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, this.a[3].r, this.a[3].g, this.a[3].b, this.a[3].a), vertices().addVertex(-f, -f2, f3, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, this.a[3].r, this.a[3].g, this.a[3].b, this.a[3].a), vertices().addVertex(-f, -f2, -f3, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, this.a[3].r, this.a[3].g, this.a[3].b, this.a[3].a));
        x.a(this, vertices().addVertex(-f, f2, -f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, this.a[4].r, this.a[4].g, this.a[4].b, this.a[4].a), vertices().addVertex(f, f2, -f3, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, this.a[4].r, this.a[4].g, this.a[4].b, this.a[4].a), vertices().addVertex(f, f2, f3, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, this.a[4].r, this.a[4].g, this.a[4].b, this.a[4].a), vertices().addVertex(-f, f2, f3, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, this.a[4].r, this.a[4].g, this.a[4].b, this.a[4].a));
        x.a(this, vertices().addVertex(-f, -f2, f3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.a[5].r, this.a[5].g, this.a[5].b, this.a[5].a), vertices().addVertex(f, -f2, f3, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.a[5].r, this.a[5].g, this.a[5].b, this.a[5].a), vertices().addVertex(f, -f2, -f3, 1.0f, 1.0f, 0.0f, -1.0f, 0.0f, this.a[5].r, this.a[5].g, this.a[5].b, this.a[5].a), vertices().addVertex(-f, -f2, -f3, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, this.a[5].r, this.a[5].g, this.a[5].b, this.a[5].a));
    }
}
