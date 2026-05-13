package com.tsf.extend.theme.c;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.base.j.p;
import java.io.File;
/* loaded from: classes.dex */
public class h {
    private String b(Context context, String str) {
        String a = p.a(context);
        if (TextUtils.isEmpty(a)) {
            a = p.b(context);
        }
        if (a == null) {
            return null;
        }
        return ((a + File.separator) + "TsfTheme") + "/CM Wallpaper/" + (str.replace(".", "_") + "_");
    }

    public String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        String b = b(context, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String str2 = b + "wallpaper.jpg";
        if (new File(str2).exists()) {
            return str2;
        }
        return null;
    }
}
