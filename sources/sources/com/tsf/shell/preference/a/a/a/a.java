package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends h {
    private TextureElement a;
    private com.censivn.C3DEngine.b.f.a.a b;
    private com.censivn.C3DEngine.b.f.j d;
    private com.censivn.C3DEngine.b.f.j e;
    private TextureElement f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private Runnable k;
    private Runnable l;

    /* JADX INFO: renamed from: com.tsf.shell.preference.a.a.a.a$a, reason: collision with other inner class name */
    private class C0162a extends com.censivn.C3DEngine.b.f.k {
        private m d;
        private float e;

        public C0162a(String str) {
            super(com.censivn.C3DEngine.b.b.a.a(167.0f), com.censivn.C3DEngine.b.b.a.a(164.0f), false);
            this.e = ((-com.censivn.C3DEngine.b.b.a.a(164.0f)) / 2.0f) - com.censivn.C3DEngine.b.b.a.a(20.0f);
            textures().addElement(a.this.f);
            this.d = new m();
            this.d.d(30);
            this.d.a(str);
            addChild(this.d);
            this.d.alpha(0.0f);
        }

        public void a(int i) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            dVar.b(i);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.a(255);
            dVar2.h(this.e);
            dVar2.b(i + VEasing.Linear.easeNone);
            dVar2.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar2);
        }

        public void b(int i) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(0);
            dVar.b(i + VEasing.Linear.easeNone);
            com.censivn.C3DEngine.b.g.c.a(this);
            com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.a(0);
            dVar2.h(0.0f);
            dVar2.b(i);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar2);
        }

        public void a() {
            this.d.a();
        }
    }

    public a(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(175.0f));
        this.a = new TextureElement(0, false);
        this.f = new TextureElement(0, false);
        this.j = false;
        this.d = new com.censivn.C3DEngine.b.f.j();
        this.e = new com.censivn.C3DEngine.b.f.j();
        this.b = new com.censivn.C3DEngine.b.f.a.a(12, 100, 300, VEasing.Linear.easeNone);
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(100.0f);
        int iA2 = (int) com.censivn.C3DEngine.b.b.a.a(10.0f);
        float f = (-((iA * 6) + (iA2 * 5))) / 2.0f;
        float f2 = ((iA * 2) + iA2) / 2.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 12) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b bVarA = this.b.a(11 - i2);
            bVarA.a(i2 % 3, i2 / 3, 1, 1, iA, iA);
            int i3 = i2 / 6;
            if ((i2 % 6) % 2 == 0) {
                i3 = 1 - i3;
            }
            bVarA.i().x = (r2 * (iA + iA2)) + f + (iA / 2.0f);
            bVarA.i().y = (f2 - (i3 * (iA + iA2))) - (iA / 2.0f);
            Number3d number3d = new Number3d();
            number3d.setAllFrom(bVarA.m);
            bVarA.h();
            bVarA.a(number3d);
            i = i2 + 1;
        }
        this.d.addChild(this.b);
        e().addChild(this.e);
        e().addChild(this.d);
        this.b.textures().addElement(this.a);
        this.g = com.censivn.C3DEngine.b.b.a.a(120.0f);
        this.h = com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.i = ((-((this.g * 4.0f) + (this.h * 3.0f))) / 2.0f) + (this.g / 2.0f);
        String[] strArr = {"Social", "Games", "Lifestyle", "Tools"};
        for (int i4 = 0; i4 < 4; i4++) {
            C0162a c0162a = new C0162a(strArr[i4]);
            c0162a.alpha(0.0f);
            c0162a.position().x = this.i + (i4 * (this.g + this.h));
            this.e.addChild(c0162a);
        }
        this.k = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.j) {
                    a.this.h();
                    com.censivn.C3DEngine.a.a().b(a.this.l, 4000L);
                }
            }
        };
        this.l = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.this.m();
                com.censivn.C3DEngine.a.a().b(a.this.k, 4000L);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        float fA = com.censivn.C3DEngine.b.b.a.a(-20.0f);
        float fA2 = com.censivn.C3DEngine.b.b.a.a(-20.0f);
        float fA3 = com.censivn.C3DEngine.b.b.a.a(0.0f);
        float fA4 = com.censivn.C3DEngine.b.b.a.a(0.0f);
        float fA5 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        float fA6 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        for (int i = 0; i < 12; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = this.b.a(i);
            int i2 = i % 3;
            float f = ((i / 3) * (this.h + this.g)) + this.i;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            switch (i2) {
                case 0:
                    dVar.f(f + fA5);
                    dVar.h(fA6 + 0.0f);
                    dVar.l(0.8f);
                    dVar.m(0.8f);
                    break;
                case 1:
                    dVar.f(f + fA3);
                    dVar.h(fA4 + 0.0f);
                    dVar.l(0.9f);
                    dVar.m(0.9f);
                    break;
                case 2:
                    dVar.f(f + fA);
                    dVar.h(fA2 + 0.0f);
                    break;
            }
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 1000, dVar);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < 4) {
                ((C0162a) this.e.getChildAt(i4)).a(800);
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        for (int i = 0; i < 12; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = this.b.a(i);
            Number3d number3d = (Number3d) bVarA.a();
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.f(number3d.x);
            dVar.h(number3d.y);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 1000, dVar);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ((C0162a) this.e.getChildAt(i2)).b(0);
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        int i = 0;
        super.g();
        this.j = false;
        com.censivn.C3DEngine.a.g().a(this.a);
        com.censivn.C3DEngine.a.g().a(this.f);
        while (true) {
            int i2 = i;
            if (i2 < 4) {
                ((C0162a) this.e.getChildAt(i2)).a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        this.j = true;
        if (this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, b.d.feature_auto_classify_icon);
        }
        if (this.f.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.f, b.d.feature_auto_classify_folder);
        }
        com.censivn.C3DEngine.a.a().b(this.k, 1000L);
    }
}
