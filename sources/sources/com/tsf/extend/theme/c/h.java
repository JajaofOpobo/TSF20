package com.tsf.extend.theme.c;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.base.j.p;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private String b(Context context, String str) {
        String strA = p.a(context);
        if (TextUtils.isEmpty(strA)) {
            strA = p.b(context);
        }
        if (strA == null) {
            return null;
        }
        return ((strA + File.separator) + "TsfTheme") + "/CM Wallpaper/" + (str.replace(".", "_") + "_");
    }

    public String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        String strB = b(context, str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        String str2 = strB + "wallpaper.jpg";
        if (new File(str2).exists()) {
            return str2;
        }
        return null;
    }
}
