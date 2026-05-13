package com.tsf.extend.base.g;

import android.content.Context;
import android.content.Intent;
import com.tsf.extend.base.j.n;
/* loaded from: classes.dex */
public class b extends d {
    private static String f = "https://plus.google.com/share?url=";
    private static String g = "https://goo.gl/WuIDdR";

    public b(Context context, Intent intent) {
        super(context, intent, "com.google.android.apps.plus", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.g.d
    public void a() {
        super.a();
        this.a.putExtra("android.intent.extra.TEXT", this.a.getStringExtra("android.intent.extra.TEXT") + this.a.getStringExtra("WEB_URL"));
    }

    @Override // com.tsf.extend.base.g.d
    public boolean b() {
        this.e.startActivity(n.a(this.e, f + g));
        return true;
    }
}
