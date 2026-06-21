package com.tsf.extend.base.g;

import android.content.Context;
import android.content.Intent;
import com.tsf.extend.base.j.BrowserUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GooglePlusShare extends BaseShareHandler {
    private static String f = "https://plus.google.com/share?url=";
    private static String g = "https://goo.gl/WuIDdR";

    public GooglePlusShare(Context context, Intent intent) {
        super(context, intent, "com.google.android.apps.plus", null);
    }

    @Override // com.tsf.extend.base.g.BaseShareHandler
    protected void a() {
        super.a();
        this.a.putExtra("android.intent.extra.TEXT", this.a.getStringExtra("android.intent.extra.TEXT") + this.a.getStringExtra("WEB_URL"));
    }

    @Override // com.tsf.extend.base.g.BaseShareHandler
    public boolean b() {
        this.e.startActivity(n.a(this.e, f + g));
        return true;
    }
}
