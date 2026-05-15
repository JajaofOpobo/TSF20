package com.tsf.extend.base.j;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class t {
    private static List<String> a = new ArrayList();
    private static String b = "";

    static {
        a.add("460");
        a.add("461");
        a.add("441");
        a.add("440");
        a.add("450");
    }

    public static boolean a(Context context) {
        if (TextUtils.isEmpty(b)) {
            b = d.b(context);
        }
        return a(b);
    }

    private static boolean a(String str) {
        return a == null || !a.contains(str);
    }
}
