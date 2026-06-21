package com.tsf.shell.e.i.c.a.b;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import java.util.Date;

/* loaded from: classes.dex */
public class i extends VObject3dContainer {
    public int a;
    private e b;
    private e c;
    private e d;
    private e e;
    private j f;
    private j g;
    private h h;
    private g i;
    private q j;
    private k k;
    private boolean l;
    private o m;
    private VRectangle n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private Date v = new Date();

    public i(float f) {
        this.l = false;
        this.l = e();
        this.n = new VRectangle(600.0f / f, 256.0f / f);
        this.n.position().x = 16.0f;
        this.n.position().y = -16.0f;
        this.n.alpha(100);
        addChild(this.n);
        this.b = new e();
        this.b.position().x = -204.0f;
        this.c = new e();
        this.c.position().x = -68.0f;
        this.d = new e();
        this.d.position().x = 68.0f;
        this.e = new e();
        this.e.position().x = 204.0f;
        addChild(this.b);
        addChild(this.e);
        addChild(this.c);
        addChild(this.d);
        this.h = new h();
        this.f = new j();
        this.g = new j();
        this.i = new g();
        this.j = new q();
        this.k = new k();
        this.m = new o();
        this.e.a(this.m);
        b(b());
    }

    public void a(int i) {
        this.b.a.a(i);
        this.c.a.a(i);
        this.d.a.a(i);
        this.e.a.a(i);
    }

    public void a(TextureElement textureElement, f fVar, f fVar2, f fVar3) {
        this.n.textures().addElement(textureElement);
        this.h.a(fVar);
        this.f.a(fVar);
        this.g.a(fVar);
        this.i.a(fVar);
        this.j.a(fVar3);
        this.k.a(fVar);
        this.m.a(fVar2);
    }

    public void a() {
        this.n.textures().removeAll();
    }

    private int b() {
        return 1;
    }

    public void b(int i) {
        this.a = i;
        switch (this.a) {
            case 0:
                c();
                break;
            case 1:
                d();
                break;
        }
        a(System.currentTimeMillis(), true);
    }

    private void c() {
        this.b.a(this.h);
        this.c.a(this.f);
        this.d.a(this.g);
    }

    private void d() {
        this.l = e();
        if (this.l) {
            this.b.a(this.k);
            this.c.a(this.i);
        } else {
            this.c.a(this.k);
            this.b.a(this.i);
        }
        this.d.a(this.j);
    }

    private boolean e() {
        return true;
    }

    public void a(long j, boolean z) {
        this.v.setTime(j);
        switch (this.a) {
            case 0:
                int minutes = this.v.getMinutes();
                int hours = this.v.getHours();
                int seconds = this.v.getSeconds();
                if (this.p != minutes || z) {
                    this.p = minutes;
                    this.f.a(this.p, 800);
                }
                if (this.r != seconds || z) {
                    this.r = seconds;
                    this.g.a(this.r, 500);
                }
                if (this.q != hours || z) {
                    this.q = hours;
                    this.h.a(this.q, 1000);
                }
                int i = this.q >= 12 ? 0 : 1;
                if (this.o != i || z) {
                    this.o = i;
                    this.m.a(i, 900);
                    break;
                }
            case 1:
                int month = this.v.getMonth();
                int date = this.v.getDate();
                int day = this.v.getDay();
                if (this.s != month || z) {
                    this.s = month;
                    this.k.a(this.s, 1000);
                }
                if (this.t != date || z) {
                    this.t = date;
                    this.i.a(this.t - 1, 800);
                }
                if (this.u != day || z) {
                    this.u = day;
                    this.j.a(this.u - 1, 500);
                }
                if (this.e.a() != 3 || z) {
                    this.m.a(3, 500);
                    break;
                }
        }
    }
}
