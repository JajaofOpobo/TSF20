package com.tsf.shell.manager.k;

import android.graphics.Typeface;
import com.tsf.shell.utils.o;
import java.io.File;
/* loaded from: classes.dex */
public class a {
    private static Typeface a = null;

    public static void a() {
        File a2 = o.a(com.censivn.C3DEngine.a.d().getCacheDir(), "/fonts/select.ttf");
        if (a2.exists()) {
            a = Typeface.createFromFile(a2);
        }
    }

    public static Typeface b() {
        return a;
    }
}
