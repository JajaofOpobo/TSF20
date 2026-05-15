package com.tsf.shell.manager.k;

import android.graphics.Typeface;
import com.tsf.shell.utils.o;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static Typeface a = null;

    public static void a() {
        File fileA = o.a(com.censivn.C3DEngine.a.d().getCacheDir(), "/fonts/select.ttf");
        if (fileA.exists()) {
            a = Typeface.createFromFile(fileA);
        }
    }

    public static Typeface b() {
        return a;
    }
}
