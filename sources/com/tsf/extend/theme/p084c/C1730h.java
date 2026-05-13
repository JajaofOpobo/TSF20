package com.tsf.extend.theme.p084c;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.base.p080j.C1437p;
import java.io.File;
/* renamed from: com.tsf.extend.theme.c.h */
/* loaded from: classes.dex */
public class C1730h {
    /* renamed from: b */
    private String m7647b(Context context, String str) {
        String m8621a = C1437p.m8621a(context);
        if (TextUtils.isEmpty(m8621a)) {
            m8621a = C1437p.m8617b(context);
        }
        if (m8621a == null) {
            return null;
        }
        return ((m8621a + File.separator) + "TsfTheme") + "/CM Wallpaper/" + (str.replace(".", "_") + "_");
    }

    /* renamed from: a */
    public String m7648a(Context context, String str) {
        if (context == null) {
            return null;
        }
        String m7647b = m7647b(context, str);
        if (TextUtils.isEmpty(m7647b)) {
            return null;
        }
        String str2 = m7647b + "wallpaper.jpg";
        if (new File(str2).exists()) {
            return str2;
        }
        return null;
    }
}
