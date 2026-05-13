package com.tsf.extend.base.j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class g {
    @SuppressLint({"DefaultLocale"})
    public static void a(View view) {
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

    public static String a(String str) {
        return Pattern.compile("\n").matcher(str).replaceAll("");
    }
}
