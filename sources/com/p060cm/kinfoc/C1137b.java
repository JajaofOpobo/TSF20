package com.p060cm.kinfoc;

import android.text.TextUtils;
/* renamed from: com.cm.kinfoc.b */
/* loaded from: classes.dex */
public class C1137b {

    /* renamed from: a */
    public long f3608a = 0;

    /* renamed from: b */
    public int f3609b = 0;

    /* renamed from: a */
    public static C1137b m9740a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\r\n");
        C1137b c1137b = new C1137b();
        if (split != null && split.length >= 3) {
            if (!split[0].equals("[common]") || !split[1].startsWith("result=")) {
                return null;
            }
            try {
                c1137b.f3609b = Integer.parseInt(split[1].substring("result=".length()).trim());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (!split[2].startsWith("time=")) {
                return null;
            }
            try {
                c1137b.f3608a = Long.parseLong(split[2].substring("time=".length()).trim());
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return c1137b;
    }
}
