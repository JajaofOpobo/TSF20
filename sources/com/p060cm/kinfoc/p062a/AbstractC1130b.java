package com.p060cm.kinfoc.p062a;

import android.app.Application;
import java.io.File;
import java.io.InputStream;
/* renamed from: com.cm.kinfoc.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC1130b {

    /* renamed from: a */
    private static AbstractC1130b f3594a = null;

    /* renamed from: a */
    public abstract int mo9783a(int i);

    /* renamed from: a */
    public abstract int mo9782a(int i, int i2);

    /* renamed from: a */
    public abstract String mo9779a(File file);

    /* renamed from: a */
    public abstract String mo9778a(InputStream inputStream);

    /* renamed from: a */
    public abstract String mo9777a(String str);

    /* renamed from: a */
    public abstract void mo9781a(long j);

    /* renamed from: a */
    public abstract void mo9775a(String str, String str2);

    /* renamed from: a */
    public abstract void mo9774a(boolean z);

    /* renamed from: a */
    public abstract boolean mo9784a();

    /* renamed from: a */
    public abstract boolean mo9776a(String str, File file, boolean z);

    /* renamed from: b */
    public abstract Application mo9773b();

    /* renamed from: b */
    public abstract boolean mo9772b(boolean z);

    /* renamed from: c */
    public abstract void mo9770c(boolean z);

    /* renamed from: c */
    public abstract boolean mo9771c();

    /* renamed from: d */
    public abstract long mo9769d();

    /* renamed from: e */
    public abstract File mo9768e();

    /* renamed from: f */
    public abstract String mo9767f();

    /* renamed from: g */
    public abstract String mo9766g();

    /* renamed from: h */
    public abstract String mo9765h();

    /* renamed from: i */
    public abstract boolean mo9764i();

    /* renamed from: j */
    public abstract void mo9763j();

    /* renamed from: k */
    public abstract boolean mo9762k();

    /* renamed from: l */
    public abstract boolean mo9761l();

    /* renamed from: m */
    public abstract boolean mo9760m();

    /* renamed from: n */
    public abstract double mo9759n();

    /* renamed from: o */
    public abstract String mo9758o();

    /* renamed from: p */
    public abstract String mo9757p();

    /* renamed from: q */
    public abstract boolean mo9756q();

    /* renamed from: r */
    public abstract String mo9755r();

    /* renamed from: s */
    public abstract int mo9754s();

    /* renamed from: t */
    public abstract int mo9753t();

    /* renamed from: u */
    public abstract int mo9752u();

    /* renamed from: v */
    public abstract boolean mo9751v();

    /* renamed from: w */
    public abstract String mo9750w();

    /* renamed from: x */
    public abstract String mo9749x();

    /* renamed from: y */
    public abstract int mo9748y();

    /* renamed from: z */
    public abstract int mo9747z();

    /* renamed from: A */
    public static AbstractC1130b m9785A() {
        if (f3594a == null) {
            throw new RuntimeException("Virtual Commmon Base is null");
        }
        return f3594a;
    }

    /* renamed from: a */
    public static void m9780a(AbstractC1130b abstractC1130b) {
        f3594a = abstractC1130b;
    }
}
