package com.tsf.extend.base.j;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CarrierUtils {
    private static List<String> a = new ArrayList();
    private static String b = "";

    static {
        __a__.add("460");
        __a__.add("461");
        __a__.add("441");
        __a__.add("440");
        __a__.add("450");
    }

    public static boolean a(Context context) {
        if (TextUtils.isEmpty(b)) {
            b = __d__.b(context);
        }
        return a(b);
    }

    private static boolean a(String str) {
        return a == null || !__a__.contains(str);
    }
}
