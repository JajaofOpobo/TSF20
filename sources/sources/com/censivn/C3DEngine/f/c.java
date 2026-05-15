package com.censivn.C3DEngine.f;

import com.tsf.shell.utils.x;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends a {
    private short c;
    private short d;
    private short e;
    private short f;
    private FloatBuffer g;

    public c(int i, int i2, int i3, int i4, com.censivn.C3DEngine.d.a aVar) {
        super(aVar);
        this.c = (short) i;
        this.d = (short) i2;
        this.e = (short) i3;
        this.f = (short) i4;
        this.g = f();
        a();
    }

    public short b() {
        return this.c;
    }

    public short c() {
        return this.d;
    }

    public short d() {
        return this.e;
    }

    public short e() {
        return this.f;
    }

    public FloatBuffer f() {
        return x.a(b() / 255.0f, c() / 255.0f, d() / 255.0f, e() / 255.0f);
    }

    public String toString() {
        return "r:" + ((int) this.c) + ", g:" + ((int) this.d) + ", b:" + ((int) this.e) + ", a:" + ((int) this.f);
    }
}
