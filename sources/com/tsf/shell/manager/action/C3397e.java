package com.tsf.shell.manager.action;

import android.content.Intent;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
/* renamed from: com.tsf.shell.manager.action.e */
/* loaded from: classes.dex */
public class C3397e {

    /* renamed from: a */
    public int f11229a;

    /* renamed from: b */
    public String f11230b;

    /* renamed from: c */
    public String f11231c;

    public C3397e(int i, String str, String str2) {
        this.f11229a = i;
        this.f11230b = str;
        this.f11231c = str2;
    }

    /* renamed from: a */
    public boolean m2652a() {
        try {
            if (this.f11231c == null || this.f11231c.length() == 0) {
                return false;
            }
            if (this.f11231c.contains("tsf://")) {
                C3359a.f11090d.m2666a(this.f11231c);
            } else {
                Home.m6177b().m6182a(Intent.parseUri(this.f11231c, 0), (Object) null);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
