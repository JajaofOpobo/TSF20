package com.tsf.extend.base.p077g;

import android.content.Context;
import android.content.Intent;
import com.tsf.extend.base.p080j.C1435n;
/* renamed from: com.tsf.extend.base.g.b */
/* loaded from: classes.dex */
public class C1408b extends C1411d {

    /* renamed from: f */
    private static String f4377f = "https://plus.google.com/share?url=";

    /* renamed from: g */
    private static String f4378g = "https://goo.gl/WuIDdR";

    public C1408b(Context context, Intent intent) {
        super(context, intent, "com.google.android.apps.plus", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: a */
    public void mo8756a() {
        super.mo8756a();
        this.f4381a.putExtra("android.intent.extra.TEXT", this.f4381a.getStringExtra("android.intent.extra.TEXT") + this.f4381a.getStringExtra("WEB_URL"));
    }

    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: b */
    public boolean mo8755b() {
        this.f4385e.startActivity(C1435n.m8632a(this.f4385e, f4377f + f4378g));
        return true;
    }
}
