package com.tsf.shell.e.i.c.a.a;

import com.censivn.C3DEngine.api.core.VObject3dContainer;

/* loaded from: classes.dex */
public class m extends VObject3dContainer {
    public static boolean e = false;
    public k a;
    public k b;
    public k c;
    public k d;
    private float f;
    private float g;
    private n h;

    public m(float f, float f2) {
        this.f = f;
        this.g = f2;
        setAnimationObjectState(false);
        c();
        calAABB();
    }

    public void a() {
        this.a.textures().removeAll();
        this.b.textures().removeAll();
        this.c.textures().removeAll();
        this.d.textures().removeAll();
    }

    private void c() {
        this.a = new k(this.g * 64.0f, this.g * 64.0f, 0.0f);
        this.b = new k(this.g * 256.0f, this.g * 192.0f, 10.0f);
        this.b.moveAllPointsPX(this.f * 0.0f, this.f * (-40.0f), 0.0f);
        this.c = new k(this.g * 256.0f, this.g * 192.0f, 25.0f);
        this.c.moveAllPointsPX((-10.0f) * this.f, this.f * (-40.0f), 0.0f);
        this.d = new k(this.g * 256.0f, this.g * 192.0f, -5.0f);
        this.d.moveAllPointsPX(0.0f, this.f * (-40.0f), 0.0f);
        addChild(this.b);
        addChild(this.c);
        addChild(this.d);
        addChild(this.a);
        this.h = new n(this, this);
        setMouseEventListener(this.h);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    public void b() {
        k kVar = this.b;
        kVar.a = ((float) ((Math.random() * 20.0d) - 10.0d)) + kVar.a;
        k kVar2 = this.c;
        kVar2.a = (((float) ((Math.random() * 20.0d) - 10.0d)) * 0.9f) + kVar2.a;
        k kVar3 = this.d;
        kVar3.a += ((float) ((Math.random() * 20.0d) - 10.0d)) * 0.8f;
        invalidate();
    }
}
