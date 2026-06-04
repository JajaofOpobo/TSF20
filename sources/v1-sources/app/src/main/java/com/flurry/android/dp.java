package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class dp {
    private Map a = new HashMap();
    private Map b = new HashMap();

    dp() {
    }

    final synchronized an a(String str) {
        return this.b.containsKey(str) ? (an) ((WeakReference) this.b.get(str)).get() : null;
    }

    final synchronized an a(s sVar, Context context, ViewGroup viewGroup, String str) {
        an anVar;
        WeakReference weakReference = (WeakReference) this.b.get(str);
        if (weakReference == null) {
            anVar = new an(sVar, context, str, viewGroup);
            this.b.put(str, new WeakReference(anVar));
        } else {
            anVar = (an) weakReference.get();
            if (anVar == null || context != anVar.getContext()) {
                anVar = new an(sVar, context, str, viewGroup);
                weakReference.clear();
                this.b.put(str, new WeakReference(anVar));
            }
        }
        return anVar;
    }

    final synchronized void b(String str) {
        this.b.remove(str);
    }

    final synchronized void a(String str, br brVar) {
        this.a.put(str, brVar);
    }

    final synchronized br c(String str) {
        return (br) this.a.get(str);
    }

    final synchronized void d(String str) {
        this.a.remove(str);
    }
}
