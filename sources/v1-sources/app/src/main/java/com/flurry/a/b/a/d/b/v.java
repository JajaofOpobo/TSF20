package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.y;

/* loaded from: classes.dex */
public abstract class v {
    public abstract String a();

    public final boolean b() {
        return h() || i() || j() || c() || d() || e() || f() || g();
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return n() != null;
    }

    public final boolean i() {
        return l() != null;
    }

    public boolean j() {
        return false;
    }

    public k[] k() {
        return null;
    }

    public com.flurry.a.b.a.g.a l() {
        return null;
    }

    public Object m() {
        throw new y("Can not instantiate value of type " + a() + "; no default creator found");
    }

    public Object a(Object[] objArr) {
        throw new y("Can not instantiate value of type " + a() + " with arguments");
    }

    public Object a(Object obj) {
        throw new y("Can not instantiate value of type " + a() + " using delegate");
    }

    public Object a(String str) {
        throw new y("Can not instantiate value of type " + a() + " from JSON String");
    }

    public Object a(int i) {
        throw new y("Can not instantiate value of type " + a() + " from JSON int number");
    }

    public Object a(long j) {
        throw new y("Can not instantiate value of type " + a() + " from JSON long number");
    }

    public Object a(double d) {
        throw new y("Can not instantiate value of type " + a() + " from JSON floating-point number");
    }

    public Object a(boolean z) {
        throw new y("Can not instantiate value of type " + a() + " from JSON boolean value");
    }

    public com.flurry.a.b.a.d.e.i n() {
        return null;
    }

    public com.flurry.a.b.a.d.e.i o() {
        return null;
    }
}
