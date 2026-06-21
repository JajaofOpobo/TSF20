package com.tsf.shell.e.e;

import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
class w extends com.censivn.C3DEngine.b.f.a.a {
    final /* synthetic */ v a;
    private com.censivn.C3DEngine.b.f.a.b c;
    private com.censivn.C3DEngine.b.f.a.b d;
    private float e;
    private float f;
    private int g;
    private int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar) {
        super(2, 80, VEasing.Linear.easeNone, 160);
        this.a = vVar;
        this.g = 0;
        this.c = a(0);
        this.c.a(0, 0, 1, 1, 80.0f * com.censivn.C3DEngine.b.b.a.c, 80.0f * com.censivn.C3DEngine.b.b.a.c);
        this.c.h();
        this.d = a(1);
        this.d.a(0, 0, 1, 1, 80.0f * com.censivn.C3DEngine.b.b.a.c, 80.0f * com.censivn.C3DEngine.b.b.a.c);
        this.d.h();
        this.e = (-200.0f) * com.censivn.C3DEngine.b.b.a.c;
        this.f = 200.0f * com.censivn.C3DEngine.b.b.a.c;
    }

    private void c(int i) {
        if (i < 10) {
            this.d.a((Boolean) false);
            this.c.i().x = 0.0f;
            this.c.a(i % 5, i / 5);
        } else {
            int i2 = i / 10;
            int i3 = i - (i2 * 10);
            this.d.a((Boolean) true);
            this.c.i().x = (-40.0f) * com.censivn.C3DEngine.b.b.a.c;
            this.c.a(i2 % 5, i2 / 5);
            this.d.i().x = 40.0f * com.censivn.C3DEngine.b.b.a.c;
            this.d.a(i3 % 5, i3 / 5);
        }
        this.c.h();
        this.d.h();
    }

    public void a(int i, int i2) {
        this.h = i2;
        this.g = i;
        alpha(0.0f);
        c(i2);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        switch (i) {
            case 0:
                position().x = 0.0f;
                break;
            case 1:
                position().x = this.e;
                break;
            case 2:
                position().x = this.f;
                break;
        }
        xVar.f(0.0f);
        xVar.a(255);
        com.censivn.C3DEngine.b.g.w.a(this);
        com.censivn.C3DEngine.b.g.w.a(this, VEasing.Back.easeIn, xVar);
        this.a.addChild(this);
    }

    public void c() {
        b(this.g);
    }

    public void b(int i) {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.w.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                w.this.a.a(w.this);
            }
        };
        switch (i) {
            case 0:
                xVar.f(0.0f);
                break;
            case 1:
                xVar.f(this.f);
                break;
            case 2:
                xVar.f(this.e);
                break;
        }
        xVar.a(0);
        com.censivn.C3DEngine.b.g.w.a(this);
        com.censivn.C3DEngine.b.g.w.a(this, VEasing.Back.easeIn, xVar);
    }
}
