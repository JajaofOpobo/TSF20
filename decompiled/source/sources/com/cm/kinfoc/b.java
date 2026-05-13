package com.cm.kinfoc;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class b {
    public long a = 0;
    public int b = 0;

    public static b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\r\n");
        b bVar = new b();
        if (split != null && split.length >= 3) {
            if (!split[0].equals("[common]") || !split[1].startsWith("result=")) {
                return null;
            }
            try {
                bVar.b = Integer.parseInt(split[1].substring("result=".length()).trim());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (!split[2].startsWith("time=")) {
                return null;
            }
            try {
                bVar.a = Long.parseLong(split[2].substring("time=".length()).trim());
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return bVar;
    }
}
