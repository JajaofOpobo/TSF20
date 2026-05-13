package com.p060cm.kinfoc;

import android.content.Context;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import java.io.File;
import java.io.IOException;
/* renamed from: com.cm.kinfoc.j */
/* loaded from: classes.dex */
public class C1149j {

    /* renamed from: a */
    boolean f3626a;

    /* renamed from: g */
    private C1172r f3632g;

    /* renamed from: c */
    private final String f3628c = "https://helptsflauncher1.ksmobile.com/c/";

    /* renamed from: d */
    private final String f3629d = "https://helptsflauncher1.ksmobile.com/c/";

    /* renamed from: e */
    private final String f3630e = "http://119.147.146.243/c/";

    /* renamed from: f */
    private final String f3631f = "kctrl.dat";

    /* renamed from: b */
    boolean f3627b = false;

    public C1149j(Context context) {
        this.f3626a = false;
        try {
            this.f3632g = new C1172r(AbstractC1130b.m9785A().mo9768e().getAbsolutePath() + File.separatorChar + "kctrl.dat");
            this.f3626a = true;
        } catch (IOException e) {
            this.f3626a = false;
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int m9714a() {
        if (this.f3626a) {
            return this.f3632g.m9590a("common", "product", 0);
        }
        return 0;
    }

    /* renamed from: b */
    public int m9710b() {
        if (this.f3626a) {
            return this.f3632g.m9590a("common", "validity", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public int m9712a(String str) {
        if (this.f3626a) {
            return this.f3632g.m9590a(str, "probability", 10000);
        }
        return 10000;
    }

    /* renamed from: b */
    public int m9709b(String str) {
        if (this.f3626a) {
            return this.f3632g.m9590a(str, "userprobability", 10000);
        }
        return 10000;
    }

    /* renamed from: a */
    public String m9713a(int i) {
        if (this.f3626a) {
            if (this.f3627b) {
                return "http://119.147.146.243/c/";
            }
            return this.f3632g.m9589a("common", "server" + i, "https://helptsflauncher1.ksmobile.com/c/");
        }
        return "https://helptsflauncher1.ksmobile.com/c/";
    }

    /* renamed from: c */
    public String m9708c() {
        return "https://helptsflauncher1.ksmobile.com/c/";
    }

    /* renamed from: a */
    public void m9711a(boolean z) {
        this.f3627b = z;
    }
}
