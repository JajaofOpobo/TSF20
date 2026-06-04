package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ VTextureManager a;

    d(VTextureManager vTextureManager) {
        this.a = vTextureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.a.mTextureList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.a.f().a((TextureElement) it.next());
        }
        arrayList2 = this.a.mTextureList;
        arrayList2.clear();
    }
}
