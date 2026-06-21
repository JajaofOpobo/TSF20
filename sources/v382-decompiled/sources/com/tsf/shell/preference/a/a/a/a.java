package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends j {
    private TextureElement a;
    private com.censivn.C3DEngine.b.f.a.a b;
    private com.censivn.C3DEngine.b.f.l d;
    private com.censivn.C3DEngine.b.f.l e;
    private TextureElement f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private Runnable k;
    private Runnable l;

    public a(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(175.0f));
        this.a = new TextureElement(0, false);
        this.f = new TextureElement(0, false);
        this.j = false;
        this.d = new com.censivn.C3DEngine.b.f.l();
        this.e = new com.censivn.C3DEngine.b.f.l();
        this.b = new com.censivn.C3DEngine.b.f.a.a(12, 100, 300, VEasing.Linear.easeNone);
        int a = (int) com.censivn.C3DEngine.b.b.a.a(100.0f);
        int a2 = (int) com.censivn.C3DEngine.b.b.a.a(10.0f);
        float f = (-((a * 6) + (a2 * 5))) / 2.0f;
        float f2 = ((a * 2) + a2) / 2.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 12) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b a3 = this.b.a(11 - i2);
            a3.a(i2 % 3, i2 / 3, 1, 1, a, a);
            int i3 = i2 / 6;
            if ((i2 % 6) % 2 == 0) {
                i3 = 1 - i3;
            }
            a3.i().x = (r2 * (a + a2)) + f + (a / 2.0f);
            a3.i().y = (f2 - (i3 * (a + a2))) - (a / 2.0f);
            Number3d number3d = new Number3d();
            number3d.setAllFrom(a3.m);
            a3.h();
            a3.a(number3d);
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
            b bVar = new b(this, strArr[i4]);
            bVar.alpha(0.0f);
            bVar.position().x = this.i + (i4 * (this.g + this.h));
            this.e.addChild(bVar);
        }
        this.k = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (!a.this.j) {
                    return;
                }
                a.this.h();
                com.censivn.C3DEngine.a.a().b(a.this.l, 4000L);
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
        float a = com.censivn.C3DEngine.b.b.a.a(-20.0f);
        float a2 = com.censivn.C3DEngine.b.b.a.a(-20.0f);
        float a3 = com.censivn.C3DEngine.b.b.a.a(0.0f);
        float a4 = com.censivn.C3DEngine.b.b.a.a(0.0f);
        float a5 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        float a6 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        for (int i = 0; i < 12; i++) {
            com.censivn.C3DEngine.b.f.a.b a7 = this.b.a(i);
            int i2 = i % 3;
            float f = ((i / 3) * (this.h + this.g)) + this.i;
            x xVar = new x();
            switch (i2) {
                case 0:
                    xVar.f(f + a5);
                    xVar.h(a6 + 0.0f);
                    xVar.l(0.8f);
                    xVar.m(0.8f);
                    break;
                case 1:
                    xVar.f(f + a3);
                    xVar.h(a4 + 0.0f);
                    xVar.l(0.9f);
                    xVar.m(0.9f);
                    break;
                case 2:
                    xVar.f(f + a);
                    xVar.h(a2 + 0.0f);
                    break;
            }
            w.a(a7);
            w.a(a7, 1000, xVar);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < 4) {
                ((b) this.e.getChildAt(i4)).a(800);
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        for (int i = 0; i < 12; i++) {
            com.censivn.C3DEngine.b.f.a.b a = this.b.a(i);
            Number3d number3d = (Number3d) a.a();
            x xVar = new x();
            xVar.f(number3d.x);
            xVar.h(number3d.y);
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(a);
            w.a(a, 1000, xVar);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ((b) this.e.getChildAt(i2)).b(0);
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        int i = 0;
        super.g();
        this.j = false;
        com.censivn.C3DEngine.a.g().a(this.a);
        com.censivn.C3DEngine.a.g().a(this.f);
        while (true) {
            int i2 = i;
            if (i2 < 4) {
                ((b) this.e.getChildAt(i2)).a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
        this.j = true;
        if (this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, R.drawable.feature_auto_classify_icon);
        }
        if (this.f.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.f, R.drawable.feature_auto_classify_folder);
        }
        com.censivn.C3DEngine.a.a().b(this.k, 1000L);
    }
}
