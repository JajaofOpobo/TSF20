package com.censivn.C3DEngine.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.api.element.UvBufferManager;

/* loaded from: classes.dex */
public final class af {
    private PointBufferManager a;
    private UvBufferManager b;
    private PointBufferManager c;
    private boolean d;
    private boolean e;
    private boolean f;

    public af(int i, Boolean bool, Boolean bool2) {
        this.a = new PointBufferManager(i);
        this.d = bool.booleanValue();
        this.e = bool2.booleanValue();
        if (this.d) {
            this.b = new UvBufferManager(i);
        }
        if (this.e) {
            this.c = new PointBufferManager(i);
        }
    }

    private af(PointBufferManager pointBufferManager, UvBufferManager uvBufferManager, PointBufferManager pointBufferManager2) {
        this.a = pointBufferManager;
        this.b = uvBufferManager;
        this.c = pointBufferManager2;
        this.d = this.b != null && this.b.size() > 0;
        this.e = this.c != null && this.c.size() > 0;
        this.f = false;
    }

    public final int a() {
        return this.a.size();
    }

    public final boolean b() {
        return this.d;
    }

    public final short a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a.addPX(f, f2, f3);
        if (this.d) {
            this.b.add(f4, f5);
        }
        if (this.e) {
            this.c.addPX(f6, f7, f8);
        }
        return (short) (this.a.size() - 1);
    }

    public final short a(Number3d number3d, Uv uv, Number3d number3d2) {
        this.a.addPX(number3d);
        if (this.d) {
            this.b.add(uv);
        }
        if (this.e) {
            this.c.addPX(number3d2);
        }
        return (short) (this.a.size() - 1);
    }

    public final PointBufferManager c() {
        return this.a;
    }

    public final UvBufferManager d() {
        return this.b;
    }

    public final PointBufferManager e() {
        return this.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final af clone() {
        return new af(this.a.m3clone(), this.b.m5clone(), this.c.m3clone());
    }
}
