package com.tsf.shell.utils;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.censivn.C3DEngine.C0853a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.tsf.shell.utils.j */
/* loaded from: classes.dex */
public class C4173j {

    /* renamed from: a */
    public static final Map<String, Integer> f13490a = m676a();

    /* renamed from: b */
    private static final Pattern f13491b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    /* renamed from: a */
    private static Map<String, Integer> m676a() {
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

    /* renamed from: a */
    public static int m674a(String str, DisplayMetrics displayMetrics) {
        int i;
        if (str.subSequence(0, 1).equals("-")) {
            str = str.substring(1, str.length());
            i = -1;
        } else {
            i = 1;
        }
        C4174a m673b = m673b(str);
        float f = m673b.f13492a;
        int applyDimension = (int) (TypedValue.applyDimension(m673b.f13493b, f, displayMetrics) + 0.5f);
        if (applyDimension != 0) {
            return applyDimension * i;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f <= 0.0f ? -1 : 1;
    }

    /* renamed from: a */
    public static int m675a(String str) {
        return m674a(str, C0853a.m10856d().getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private static C4174a m673b(String str) {
        Matcher matcher = f13491b.matcher(str);
        if (matcher.matches()) {
            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = f13490a.get(matcher.group(3).toLowerCase());
            if (num == null) {
                throw new NumberFormatException();
            }
            return new C4174a(floatValue, num.intValue());
        }
        throw new NumberFormatException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.utils.j$a */
    /* loaded from: classes.dex */
    public static class C4174a {

        /* renamed from: a */
        float f13492a;

        /* renamed from: b */
        int f13493b;

        public C4174a(float f, int i) {
            this.f13492a = f;
            this.f13493b = i;
        }
    }
}
