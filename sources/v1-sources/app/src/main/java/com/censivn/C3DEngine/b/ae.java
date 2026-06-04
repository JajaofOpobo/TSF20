package com.censivn.C3DEngine.b;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.HashMap;

/* loaded from: classes.dex */
final class ae implements Runnable {
    final /* synthetic */ ad a;
    private final /* synthetic */ TextureElement b;

    ae(ad adVar, TextureElement textureElement) {
        this.a = adVar;
        this.b = textureElement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (this.b == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("glThread thread", com.tsf.shell.g.e.a());
            com.flurry.android.t.a("EVENT_ISSUSE_TEXTURE_MANAGER", hashMap);
        } else if (this.b.id != 0) {
            ad adVar = this.a;
            i = adVar.b;
            adVar.b = i - 1;
            com.censivn.C3DEngine.a.d();
            z.a(this.b.id);
        }
    }
}
