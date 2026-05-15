package com.tsf.extend.theme.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements d {
    private static List<String> a = Collections.synchronizedList(new ArrayList());
    private static List<String> b;

    static {
        a.add("0");
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.add("a");
        a.add("b");
        b = Collections.synchronizedList(new ArrayList());
        b.add("c");
        b.add("d");
        b.add("e");
        b.add("f");
    }

    @Override // com.tsf.extend.theme.a.d
    public e a() {
        String strSubstring = "";
        String strB = com.tsf.extend.base.j.d.b();
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        if (strB.length() >= 3) {
            strSubstring = strB.substring(2, 3);
        }
        return a(strSubstring);
    }

    private e a(String str) {
        if (str != null) {
            if (a.contains(str.toLowerCase())) {
                return new b();
            }
            if (b.contains(str.toLowerCase())) {
                return new c();
            }
        }
        return null;
    }
}
