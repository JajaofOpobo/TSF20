package com.tsf.shell.f.i.c.a.b;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
/* loaded from: classes.dex */
public class d extends VObject3dContainer {
    private b g;
    public a a = new a();
    private float c = 0.0f;
    private float d = 0.8f;
    private int e = 0;
    private int f = 0;
    int b = 0;

    public d() {
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        int b;
        int a = a(this.a.rotation().x);
        if (a != this.b) {
            a(this.b, a);
        }
        this.b = a;
        float f = (this.c - this.a.position().z) * this.d;
        this.a.position().z += f;
        if (Math.abs(f) < 0.02f) {
            this.a.position().z = this.c;
            if (this.g != null && this.f != (b = b(this.e))) {
                this.f = b;
                this.g.c(b);
            }
        }
    }

    public int a(float f) {
        return Math.round(f / 90.0f);
    }

    public void a(b bVar) {
        if (this.g != null) {
            this.g.b();
        }
        this.g = bVar;
        this.g.a(this);
        b();
    }

    public void a(e eVar) {
        this.a.g = eVar.a.id;
    }

    public void a(int i, int i2) {
        if (this.g != null) {
            if (Math.abs(i2 - i) < 2) {
                int i3 = (i2 <= i ? -2 : 2) + i;
                this.a.a(a(i3), this.g.a(b(i3)));
                return;
            }
            b();
        }
    }

    private void b() {
        if (this.g != null) {
            int a = a(this.a.rotation().x);
            this.a.a(a(a), this.g.a(b(a)));
            int a2 = a(this.a.rotation().x + 90.0f);
            this.a.a(a(a2), this.g.a(b(a2)));
            int a3 = a(this.a.rotation().x - 90.0f);
            this.a.a(a(a3), this.g.a(b(a3)));
        }
    }

    public int a(int i) {
        int i2 = i % 4;
        return i2 < 0 ? i2 + 4 : i2;
    }

    public int b(int i) {
        int a = this.g.a();
        int i2 = i % a;
        return i2 < 0 ? i2 + a : i2;
    }

    public void b(int i, int i2) {
        if (this.g != null) {
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setRotationX(i * 90);
            VTween.killTween(this.a);
            VTween.to(this.a, i2, vTweenParam);
            if (this.e != i) {
                this.g.b(b(this.e));
            }
            this.e = i;
        }
    }

    public int a() {
        return a(this.a.rotation().x);
    }
}
