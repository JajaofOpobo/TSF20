package com.tsf.shell.widget.a.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.b.g.w;

/* loaded from: classes.dex */
class e extends com.censivn.C3DEngine.b.f.a.a {
    final /* synthetic */ d a;
    private int[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(35, 1, 1, 1, null, true);
        TextureElement textureElement;
        this.a = dVar;
        this.d = 0;
        this.e = (int) com.censivn.C3DEngine.b.b.a.a(150.0f);
        this.f = (int) com.censivn.C3DEngine.b.b.a.a(60.0f);
        this.g = 0;
        this.h = 0;
        TextureList textures = textures();
        textureElement = dVar.e;
        textures.addElement(textureElement);
        for (int i = 0; i < 19; i++) {
            com.censivn.C3DEngine.b.f.a.b a = a(i);
            a.a(0, 0, 100, 100);
            a.b(40, this.e);
            a.h();
        }
        for (int i2 = 0; i2 < 14; i2++) {
            com.censivn.C3DEngine.b.f.a.b a2 = a(i2 + 20);
            a2.a(0, 0, 100, 100);
            a2.b(40, this.e);
            a2.i().y = -150.0f;
            a2.h();
        }
    }

    public void a(int[] iArr) {
        this.c = iArr;
        for (int i = 0; i < this.c.length; i++) {
            a(i).H.set(this.c[i]);
        }
    }

    public void b(int[] iArr) {
        for (int i = 0; i < 14; i++) {
            com.censivn.C3DEngine.b.f.a.b a = a(i + 20);
            f fVar = new f(this);
            fVar.b(i * 40);
            fVar.c(iArr[i]);
            w.a(a, 90, fVar);
        }
    }

    public void b(int i) {
        i iVar;
        i iVar2;
        this.d = i;
        float length = i / this.c.length;
        int ceil = (int) Math.ceil(length);
        for (int i2 = 0; i2 < this.c.length; i2++) {
            com.censivn.C3DEngine.b.f.a.b a = a(i2);
            a.b(ceil, this.e);
            a.i().x = (((-i) / 2.0f) + ((i2 + 1) * length)) - (length * 0.5f);
            a.h();
        }
        float f = i / 14.0f;
        int ceil2 = (int) Math.ceil(f);
        for (int i3 = 0; i3 < 14; i3++) {
            com.censivn.C3DEngine.b.f.a.b a2 = a(i3 + 20);
            a2.b(ceil2, this.e);
            a2.i().x = (((-i) / 2.0f) + ((i3 + 1) * f)) - (f * 0.5f);
            a2.i().y = (-this.e) - this.f;
            a2.h();
        }
        iVar = this.a.h;
        iVar.c(c(this.g));
        iVar2 = this.a.i;
        iVar2.c(d(this.h));
        calAABB();
    }

    private float c(int i) {
        float length = this.d / this.c.length;
        return (((-this.d) / 2.0f) + ((i + 1) * length)) - (length * 0.5f);
    }

    private float d(int i) {
        float f = this.d / 14.0f;
        return (((-this.d) / 2.0f) + ((i + 1) * f)) - (f * 0.5f);
    }

    public void a(float f, float f2) {
        h hVar;
        i iVar;
        h hVar2;
        int[][] iArr;
        int[][] iArr2;
        h hVar3;
        i iVar2;
        h hVar4;
        int[] iArr3;
        int i = 0;
        if (f2 > (-this.e) / 2.0f) {
            float length = this.d / this.c.length;
            int round = Math.round(((((length / 2.0f) + f) + (this.d / 2.0f)) / length) - 1.0f);
            if (round >= 0) {
                i = round > this.c.length + (-1) ? this.c.length - 1 : round;
            }
            if (this.g != i) {
                iArr2 = d.E;
                b(iArr2[i]);
                this.g = i;
                hVar3 = this.a.g;
                if (hVar3 != null) {
                    hVar4 = this.a.g;
                    iArr3 = d.D;
                    hVar4.a(iArr3[i]);
                }
                iVar2 = this.a.h;
                iVar2.c(c(this.g));
                return;
            }
            return;
        }
        float f3 = this.d / 14.0f;
        int round2 = Math.round(((((f3 / 2.0f) + f) + (this.d / 2.0f)) / f3) - 1.0f);
        if (round2 >= 0) {
            i = round2 > 13 ? 13 : round2;
        }
        if (this.h != i) {
            this.h = i;
            hVar = this.a.g;
            if (hVar != null) {
                hVar2 = this.a.g;
                iArr = d.E;
                hVar2.a(iArr[this.g][i]);
            }
            iVar = this.a.i;
            iVar.c(d(this.h));
        }
    }
}
