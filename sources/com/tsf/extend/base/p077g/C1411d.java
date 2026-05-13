package com.tsf.extend.base.p077g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* renamed from: com.tsf.extend.base.g.d */
/* loaded from: classes.dex */
public class C1411d {

    /* renamed from: a */
    public Intent f4381a;

    /* renamed from: b */
    public Integer f4382b = null;

    /* renamed from: c */
    public String f4383c;

    /* renamed from: d */
    public String f4384d;

    /* renamed from: e */
    public Context f4385e;

    public C1411d(Context context, Intent intent, String str, String str2) {
        this.f4381a = null;
        this.f4383c = null;
        this.f4384d = null;
        this.f4385e = context;
        this.f4381a = intent != null ? (Intent) intent.clone() : null;
        this.f4383c = str;
        this.f4384d = str2;
        mo8756a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8756a() {
        if (this.f4381a != null) {
            if (this.f4383c != null && this.f4384d != null) {
                this.f4381a.setComponent(new ComponentName(this.f4383c, this.f4384d));
            } else if (this.f4383c != null) {
                this.f4381a.setPackage(this.f4383c);
            }
        }
    }

    /* renamed from: c */
    public boolean m8757c() {
        return (this.f4381a == null || this.f4385e.getPackageManager().resolveActivity(this.f4381a, 0) == null) ? false : true;
    }

    /* renamed from: a */
    public boolean mo8761a(Context context) {
        boolean mo8755b;
        try {
            if (m8757c()) {
                context.startActivity(this.f4381a);
                mo8755b = true;
            } else {
                mo8755b = mo8755b();
            }
            return mo8755b;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo8755b() {
        return false;
    }

    /* renamed from: a */
    public static Intent m8758a(String str, String str2, String str3, String str4, String str5, String str6) {
        Intent m8760a = m8760a(str, str2, str3, str4, str5, 1);
        m8760a.putExtra("THEME_ID", str6);
        return m8760a;
    }

    /* renamed from: a */
    public static Intent m8760a(String str, String str2, String str3, String str4, String str5, int i) {
        return m8759a(str, str2, str3, str4, str5, i, null);
    }

    /* renamed from: a */
    public static Intent m8759a(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (TextUtils.isEmpty(intent.getType())) {
            intent.setType("text/plain");
        }
        intent.putExtra("SHARE_TYPE", i);
        if (str5 != null || i != 0) {
            if (str5 == null) {
                str5 = "https://goo.gl/XGthJ0";
            }
            intent.putExtra("WEB_URL", str5);
        }
        intent.putExtra("IMG_URL", str);
        intent.putExtra("android.intent.extra.SUBJECT", str3);
        intent.putExtra("android.intent.extra.TEXT", str4 + "\r\n");
        intent.addFlags(268435456);
        intent.addFlags(536870912);
        intent.addFlags(1);
        if (!TextUtils.isEmpty(str6)) {
            intent.putExtra("SHARE_URL", str6);
        }
        return intent;
    }
}
