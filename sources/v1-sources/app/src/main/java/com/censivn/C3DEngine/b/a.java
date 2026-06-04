package com.censivn.C3DEngine.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class a {
    private ShortBuffer a;
    private int b;
    private int c = 0;
    private int d = 1;
    private boolean e = false;

    private a(ShortBuffer shortBuffer, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(shortBuffer.limit() * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.a = allocateDirect.asShortBuffer();
        this.a.put(shortBuffer);
        this.b = i;
    }

    public a(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 3 * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.a = allocateDirect.asShortBuffer();
    }

    public final int a() {
        return this.b;
    }

    public final short a(int i) {
        this.a.position(i * 3);
        return this.a.get();
    }

    public final short b(int i) {
        this.a.position((i * 3) + 1);
        return this.a.get();
    }

    public final float c(int i) {
        this.a.position((i * 3) + 2);
        return this.a.get();
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final void a(com.censivn.C3DEngine.i.d dVar) {
        this.a.position(this.b * 3);
        this.a.put(dVar.a);
        this.a.put(dVar.b);
        this.a.put(dVar.c);
        this.b++;
    }

    public final void a(short s, short s2, short s3) {
        this.a.position(this.b * 3);
        this.a.put(s);
        this.a.put(s2);
        this.a.put(s3);
        this.b++;
    }

    public final ShortBuffer e() {
        return this.a;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        this.a.position(0);
        return new a(this.a, this.b);
    }
}
