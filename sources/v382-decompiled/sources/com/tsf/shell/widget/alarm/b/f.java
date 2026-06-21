package com.tsf.shell.widget.alarm.b;

import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.api.primitives.VRectangle;

/* loaded from: classes.dex */
public class f {
    public int a;
    public int b;
    public int c;
    public int d;
    public Uv[] e = new Uv[4];
    final /* synthetic */ e f;

    public f(e eVar, int i, int i2, int i3, int i4) {
        this.f = eVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Uv[] uvArr = this.e;
        Uv uv = new Uv();
        uvArr[0] = uv;
        uv.u = (this.a + this.c) / eVar.l;
        uv.v = (this.b + this.d) / eVar.m;
        Uv[] uvArr2 = this.e;
        Uv uv2 = new Uv();
        uvArr2[1] = uv2;
        uv2.u = this.a / eVar.l;
        uv2.v = (this.b + this.d) / eVar.m;
        Uv[] uvArr3 = this.e;
        Uv uv3 = new Uv();
        uvArr3[2] = uv3;
        uv3.u = (this.a + this.c) / eVar.l;
        uv3.v = this.b / eVar.m;
        Uv[] uvArr4 = this.e;
        Uv uv4 = new Uv();
        uvArr4[3] = uv4;
        uv4.u = this.a / eVar.l;
        uv4.v = this.b / eVar.m;
    }

    public void a(VRectangle vRectangle) {
        for (int i = 0; i < 4; i++) {
            vRectangle.uv().set(i, this.e[i]);
        }
    }
}
