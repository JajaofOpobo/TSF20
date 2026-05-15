package com.tsf.extend.base.actstru.model;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class l {
    private static final HashMap<String, Typeface> a = new HashMap<>();

    public static Typeface a(AssetManager assetManager, String str) {
        Typeface typefaceCreateFromAsset;
        synchronized (a) {
            try {
                if (!a.containsKey(str)) {
                    typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, str);
                    a.put(str, typefaceCreateFromAsset);
                } else {
                    typefaceCreateFromAsset = a.get(str);
                }
            } catch (Exception e) {
                Log.w("Calligraphy", "Can't create asset from " + str + ". Make sure you have passed in the correct path and file name.", e);
                a.put(str, null);
                typefaceCreateFromAsset = null;
            }
        }
        return typefaceCreateFromAsset;
    }
}
