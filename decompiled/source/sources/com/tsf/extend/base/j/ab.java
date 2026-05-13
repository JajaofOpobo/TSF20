package com.tsf.extend.base.j;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class ab {
    private static final HashMap<String, Typeface> a = new HashMap<>();

    public static Typeface a(AssetManager assetManager, String str) {
        Typeface createFromAsset;
        synchronized (a) {
            try {
                if (!a.containsKey(str)) {
                    createFromAsset = Typeface.createFromAsset(assetManager, str);
                    a.put(str, createFromAsset);
                } else {
                    return a.get(str);
                }
            } catch (Exception e) {
                Log.w("Calligraphy", "Can't create asset from " + str + ". Make sure you have passed in the correct path and file name.", e);
                a.put(str, null);
                return null;
            }
        }
        return createFromAsset;
    }
}
