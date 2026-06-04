package com.flurry.android;

import android.content.DialogInterface;
import java.util.HashMap;

/* loaded from: classes.dex */
final class cf implements DialogInterface.OnClickListener {
    private /* synthetic */ di a;
    private /* synthetic */ int b;
    private /* synthetic */ bz c;

    cf(bz bzVar, di diVar, int i) {
        this.c = bzVar;
        this.a = diVar;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cr crVar;
        cr crVar2;
        HashMap hashMap = new HashMap();
        hashMap.put("sourceEvent", this.a.a);
        this.c.a("userCanceled", hashMap, this.c.c, this.c.b, this.c.d, this.b + 1);
        dialogInterface.dismiss();
        crVar = this.c.g;
        if (crVar != null && this.c.a() == 3) {
            crVar2 = this.c.g;
            crVar2.start();
        }
    }
}
