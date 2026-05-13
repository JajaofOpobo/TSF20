package com.tsf.extend.base.actstru.model.p070a;

import android.text.TextUtils;
/* renamed from: com.tsf.extend.base.actstru.model.a.a */
/* loaded from: classes.dex */
public class C1346a {

    /* renamed from: a */
    private static C1346a f4246a;

    /* renamed from: b */
    private final String f4247b;

    /* renamed from: c */
    private final boolean f4248c;

    /* renamed from: a */
    public static void m8937a(String str) {
        f4246a = new C1346a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1346a m8938a() {
        if (f4246a == null) {
            throw new IllegalStateException("You must initDefault for CalligraphyConfig, if you are going to use the CalligraphyContextWrapper");
        }
        return f4246a;
    }

    private C1346a(String str) {
        this.f4247b = str;
        this.f4248c = !TextUtils.isEmpty(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m8936b() {
        return this.f4247b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m8935c() {
        return this.f4248c;
    }
}
