package com.flurry.android;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class dg extends bw {
    private /* synthetic */ String a;
    private /* synthetic */ j b;
    private /* synthetic */ Context c;
    private /* synthetic */ boolean d;
    private /* synthetic */ s e;

    dg(s sVar, String str, j jVar, Context context, boolean z) {
        this.e = sVar;
        this.a = str;
        this.b = jVar;
        this.c = context;
        this.d = z;
    }

    @Override // com.flurry.android.bw
    public final void a() {
        if (this.a != null) {
            String obj = this.b.b().toString();
            if (this.a.startsWith("market://")) {
                this.e.a(this.c, this.a, this.b);
                return;
            }
            if (this.a.startsWith("http")) {
                Intent intent = new Intent(this.c, (Class<?>) FlurryFullscreenTakeoverActivity.class);
                intent.putExtra("url", this.a);
                if (this.d && bp.a(this.c, intent)) {
                    s sVar = this.e;
                    s.a(this.c, intent, obj);
                    return;
                } else {
                    Cdo.b(s.a, "Unable to launch FlurryFullscreenTakeoverActivity, falling back to browser. Fix by declaring this Activity in your AndroidManifest.xml");
                    s sVar2 = this.e;
                    s.b(this.c, this.a, obj);
                    return;
                }
            }
            s sVar3 = this.e;
            if (!s.b(this.c, this.a, obj)) {
                Cdo.e(s.a, "Failed to launch intent for:" + this.a);
                return;
            }
            return;
        }
        Cdo.e(s.a, "Unable to launch intent for: " + this.a);
    }
}
