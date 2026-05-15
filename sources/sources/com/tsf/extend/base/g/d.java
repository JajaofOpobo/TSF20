package com.tsf.extend.base.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public Intent a;
    public Integer b = null;
    public String c;
    public String d;
    public Context e;

    public d(Context context, Intent intent, String str, String str2) {
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = context;
        this.a = intent != null ? (Intent) intent.clone() : null;
        this.c = str;
        this.d = str2;
        a();
    }

    protected void a() {
        if (this.a != null) {
            if (this.c != null && this.d != null) {
                this.a.setComponent(new ComponentName(this.c, this.d));
            } else if (this.c != null) {
                this.a.setPackage(this.c);
            }
        }
    }

    public boolean c() {
        return (this.a == null || this.e.getPackageManager().resolveActivity(this.a, 0) == null) ? false : true;
    }

    public boolean a(Context context) {
        boolean zB;
        try {
            if (c()) {
                context.startActivity(this.a);
                zB = true;
            } else {
                zB = b();
            }
            return zB;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean b() {
        return false;
    }

    public static Intent a(String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intentA = a(str, str2, str3, str4, str5, 1);
        intentA.putExtra("THEME_ID", str6);
        return intentA;
    }

    public static Intent a(String str, String str2, String str3, String str4, String str5, int i) {
        return a(str, str2, str3, str4, str5, i, null);
    }

    public static Intent a(String str, String str2, String str3, String str4, String str5, int i, String str6) {
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
