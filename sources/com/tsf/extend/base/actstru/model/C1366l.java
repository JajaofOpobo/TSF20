package com.tsf.extend.base.actstru.model;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
/* renamed from: com.tsf.extend.base.actstru.model.l */
/* loaded from: classes.dex */
public final class C1366l {

    /* renamed from: a */
    private static final HashMap<String, Typeface> f4292a = new HashMap<>();

    /* renamed from: a */
    public static Typeface m8880a(AssetManager assetManager, String str) {
        Typeface createFromAsset;
        synchronized (f4292a) {
            try {
                if (!f4292a.containsKey(str)) {
                    createFromAsset = Typeface.createFromAsset(assetManager, str);
                    f4292a.put(str, createFromAsset);
                } else {
                    return f4292a.get(str);
                }
            } catch (Exception e) {
                Log.w("Calligraphy", "Can't create asset from " + str + ". Make sure you have passed in the correct path and file name.", e);
                f4292a.put(str, null);
                return null;
            }
        }
        return createFromAsset;
    }
}
