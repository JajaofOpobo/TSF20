package com.cm.kinfoc.a;

import android.app.Application;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class b {
    private static b a = null;

    public abstract int a(int i);

    public abstract int a(int i, int i2);

    public abstract String a(File file);

    public abstract String a(InputStream inputStream);

    public abstract String a(String str);

    public abstract void a(long j);

    public abstract void a(String str, String str2);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract boolean a(String str, File file, boolean z);

    public abstract Application b();

    public abstract boolean b(boolean z);

    public abstract void c(boolean z);

    public abstract boolean c();

    public abstract long d();

    public abstract File e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();

    public abstract void j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract double n();

    public abstract String o();

    public abstract String p();

    public abstract boolean q();

    public abstract String r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();

    public static b A() {
        if (a == null) {
            throw new RuntimeException("Virtual Commmon Base is null");
        }
        return a;
    }

    public static void a(b bVar) {
        a = bVar;
    }
}
