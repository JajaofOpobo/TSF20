package com.tsf.extend.theme.pull;

import android.text.TextUtils;
import com.tsf.extend.theme.ai;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.tsf.extend.base.a.b {
    public a(String str, long j, boolean z, boolean z2) {
        e();
        b("5.0");
        a("1");
        f();
        a(str, j, z, z2);
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return "https://push.cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return "push?";
    }

    protected void e() {
        a("vga", b.a());
    }

    protected void b(String str) {
        a("themev", str);
    }

    protected void f() {
        a("time", b.b());
    }

    protected void a(String str, long j, boolean z, boolean z2) {
        if (System.currentTimeMillis() - j < 86400000 && !z) {
            a("scene", "1");
            if (!TextUtils.isEmpty(str)) {
                a("cn", str);
                return;
            }
            String strB = ai.a().b();
            if (!TextUtils.isEmpty(strB)) {
                a("cn", strB);
                return;
            }
            return;
        }
        if (z2) {
            a("scene", "0");
        } else {
            a("scene", "2");
        }
    }
}
