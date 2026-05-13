package com.tsf.extend.base.g;

import android.content.Context;
import android.content.Intent;
import com.tsf.extend.base.j.n;
/* loaded from: classes.dex */
public class e extends d {
    private static String f = "https://twitter.com/intent/tweet?text=Share%20a%20link&via=cmlauncher&url=";
    private static String g = "https://goo.gl/yqERdL";

    public e(Context context, Intent intent) {
        super(context, intent, "com.twitter.android", "com.twitter.android.composer.ComposerActivity");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.g.d
    public void a() {
        super.a();
        this.a.putExtra("android.intent.extra.TEXT", this.a.getStringExtra("android.intent.extra.TEXT") + g);
    }

    @Override // com.tsf.extend.base.g.d
    public boolean b() {
        this.e.startActivity(n.a(this.e, f + g));
        return true;
    }
}
