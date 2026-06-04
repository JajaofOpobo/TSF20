package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;
import java.util.HashMap;

/* loaded from: classes.dex */
final class as extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ao aoVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = aoVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (c.c == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("close button singleTapUp error", this.a.K.P().toString());
            com.flurry.android.t.a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", hashMap);
            return;
        }
        c.c.a(true);
    }
}
