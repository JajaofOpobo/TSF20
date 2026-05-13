package com.tsf.extend.base.p077g;

import android.content.Context;
import android.content.Intent;
import com.tsf.extend.base.p080j.C1435n;
/* renamed from: com.tsf.extend.base.g.e */
/* loaded from: classes.dex */
public class C1412e extends C1411d {

    /* renamed from: f */
    private static String f4386f = "https://twitter.com/intent/tweet?text=Share%20a%20link&via=cmlauncher&url=";

    /* renamed from: g */
    private static String f4387g = "https://goo.gl/yqERdL";

    public C1412e(Context context, Intent intent) {
        super(context, intent, "com.twitter.android", "com.twitter.android.composer.ComposerActivity");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: a */
    public void mo8756a() {
        super.mo8756a();
        this.f4381a.putExtra("android.intent.extra.TEXT", this.f4381a.getStringExtra("android.intent.extra.TEXT") + f4387g);
    }

    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: b */
    public boolean mo8755b() {
        this.f4385e.startActivity(C1435n.m8632a(this.f4385e, f4386f + f4387g));
        return true;
    }
}
