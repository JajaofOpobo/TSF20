package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ao extends cx {
    private static final Map a;

    ao() {
        super((byte) 0);
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("b", 12);
        hashMap.put("t", 10);
        hashMap.put("m", 15);
        hashMap.put("c", 14);
        hashMap.put("l", 9);
        hashMap.put("r", 11);
        a = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.flurry.android.cx
    public final int a() {
        return -1;
    }

    @Override // com.flurry.android.cx
    public final ViewGroup.LayoutParams a(Context context, i iVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b(context, iVar), c(context, iVar));
        String[] split = iVar.f().toString().split("-");
        if (split.length == 2) {
            Integer a2 = a(split[0]);
            if (a2 != null) {
                layoutParams.addRule(a2.intValue());
            }
            Integer a3 = a(split[1]);
            if (a3 != null) {
                layoutParams.addRule(a3.intValue());
            }
        }
        return layoutParams;
    }

    private static Integer a(String str) {
        return (Integer) a.get(str);
    }
}
