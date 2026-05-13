package com.tsf.extend.base.p080j;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
/* renamed from: com.tsf.extend.base.j.ab */
/* loaded from: classes.dex */
public final class C1420ab {

    /* renamed from: a */
    private static final HashMap<String, Typeface> f4405a = new HashMap<>();

    /* renamed from: a */
    public static Typeface m8700a(AssetManager assetManager, String str) {
        Typeface createFromAsset;
        synchronized (f4405a) {
            try {
                if (!f4405a.containsKey(str)) {
                    createFromAsset = Typeface.createFromAsset(assetManager, str);
                    f4405a.put(str, createFromAsset);
                } else {
                    return f4405a.get(str);
                }
            } catch (Exception e) {
                Log.w("Calligraphy", "Can't create asset from " + str + ". Make sure you have passed in the correct path and file name.", e);
                f4405a.put(str, null);
                return null;
            }
        }
        return createFromAsset;
    }
}
