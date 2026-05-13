package com.tsf.extend.wallpaper;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    private static c a = new c();
    private int b = 3;
    private int c = 0;

    private c() {
    }

    public static c a() {
        return a;
    }

    public static List<a> b() {
        return new ArrayList();
    }

    public void a(Context context) {
        d.a().a(context);
    }

    public void a(int i) {
        this.c = i;
    }
}
