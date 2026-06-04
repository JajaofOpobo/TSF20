package com.flurry.android;

import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes.dex */
public final class v {
    private String a;
    private long b;
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;

    v() {
    }

    v(String str, long j, long j2, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.d = 0;
    }

    v(DataInput dataInput) {
        this.a = dataInput.readUTF();
        this.b = dataInput.readLong();
        this.c = dataInput.readLong();
        this.d = dataInput.readInt();
        this.e = dataInput.readInt();
        this.f = dataInput.readInt();
        this.g = dataInput.readInt();
    }

    final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.a);
        dataOutput.writeLong(this.b);
        dataOutput.writeLong(this.c);
        dataOutput.writeInt(this.d);
        dataOutput.writeInt(this.e);
        dataOutput.writeInt(this.f);
        dataOutput.writeInt(this.g);
    }

    public final v a() {
        v vVar = new v(this.a, this.b, this.c, this.e, this.f, this.g);
        vVar.d = this.d;
        return vVar;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final void d() {
        this.d++;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final long h() {
        return this.c;
    }

    public final long i() {
        return this.b;
    }
}
