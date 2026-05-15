package com.tsf.shell.utils;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j {
    public static final Map<String, Integer> a = a();
    private static final Pattern b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    private static Map<String, Integer> a() {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        map.put("dp", 1);
        map.put("sp", 2);
        map.put("pt", 3);
        map.put("in", 4);
        map.put("mm", 5);
        return Collections.unmodifiableMap(map);
    }

    public static int a(String str, DisplayMetrics displayMetrics) {
        int i;
        if (str.subSequence(0, 1).equals("-")) {
            str = str.substring(1, str.length());
            i = -1;
        } else {
            i = 1;
        }
        a aVarB = b(str);
        float f = aVarB.a;
        int iApplyDimension = (int) (TypedValue.applyDimension(aVarB.b, f, displayMetrics) + 0.5f);
        if (iApplyDimension != 0) {
            return iApplyDimension * i;
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
            float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = a.get(matcher.group(3).toLowerCase());
            if (num == null) {
                throw new NumberFormatException();
            }
            return new a(fFloatValue, num.intValue());
        }
        throw new NumberFormatException();
    }

    private static class a {
        float a;
        int b;

        public a(float f, int i) {
            this.a = f;
            this.b = i;
        }
    }
}
