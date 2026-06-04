package com.flurry.android;

import android.content.Context;
import android.widget.RelativeLayout;
import java.util.Map;

/* loaded from: classes.dex */
abstract class eb extends RelativeLayout {
    s a;
    dl b;
    j c;
    int d;
    private Context e;

    public abstract void a(Context context);

    eb(Context context, s sVar, dl dlVar) {
        super(context);
        this.e = context;
        this.a = sVar;
        this.b = dlVar;
    }

    final void a(String str, Map map) {
        String str2 = "AppSpotBannerView.onEvent " + str;
        this.a.a(this.b, str, true, map);
        if (this.c != null) {
            this.a.a(new di(str, map, this.e, this.c, this.b, this.d), this.a, 0);
        }
    }

    boolean d() {
        return !((b) this.c.d().get(this.d)).e().e().toString().equals("takeover");
    }

    public void b() {
    }
}
