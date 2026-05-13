package com.tsf.extend.base.p080j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import java.util.regex.Pattern;
/* renamed from: com.tsf.extend.base.j.g */
/* loaded from: classes.dex */
public class C1428g {
    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public static void m8663a(View view) {
        if (view != null) {
            String str = Build.MANUFACTURER + "";
            String lowerCase = (Build.HARDWARE + "").toLowerCase();
            if (str.equalsIgnoreCase("meizu")) {
                if ((lowerCase.contains("mx2") || lowerCase.contains("mx3")) && Build.VERSION.SDK_INT >= 11) {
                    view.setSystemUiVisibility(2);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m8662a(String str) {
        return Pattern.compile("\n").matcher(str).replaceAll("");
    }
}
