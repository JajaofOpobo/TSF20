package com.tsf.shell.utils;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class j {
    public static final Map<String, Integer> a = a();
    private static final Pattern b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    private static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("px", 0);
        hashMap.put("dip", 1);
        hashMap.put("dp", 1);
        hashMap.put("sp", 2);
        hashMap.put("pt", 3);
        hashMap.put("in", 4);
        hashMap.put("mm", 5);
        return Collections.unmodifiableMap(hashMap);
    }

    public static int a(String str, DisplayMetrics displayMetrics) {
        int i;
        if (str.subSequence(0, 1).equals("-")) {
            str = str.substring(1, str.length());
            i = -1;
        } else {
            i = 1;
        }
        a b2 = b(str);
        float f = b2.a;
        int applyDimension = (int) (TypedValue.applyDimension(b2.b, f, displayMetrics) + 0.5f);
        if (applyDimension != 0) {
            return applyDimension * i;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f <= 0.0f ? -1 : 1;
    }

    public static int a(String str) {
        return a(str, com.censivn.C3DEngine.a.d().getResources().getDisplayMetrics());
    }

    private static a b(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = a.get(matcher.group(3).toLowerCase());
            if (num == null) {
                throw new NumberFormatException();
            }
            return new a(floatValue, num.intValue());
        }
        throw new NumberFormatException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        float a;
        int b;

        public a(float f, int i) {
            this.a = f;
            this.b = i;
        }
    }
}
