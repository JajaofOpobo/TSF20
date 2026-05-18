package com.cm.kinfoc.a;

import android.util.Log;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static c b = null;
    long a;

    private c() {
        this.a = 0L;
        this.a = System.currentTimeMillis() / 1000;
    }

    public static c a() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public void a(String str) {
        Log.e("InfocLog", str);
    }
}
