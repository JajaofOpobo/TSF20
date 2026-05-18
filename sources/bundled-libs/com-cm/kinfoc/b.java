package com.cm.kinfoc;

import android.text.TextUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public long a = 0;
    public int b = 0;

    public static b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\r\n");
        b bVar = new b();
        if (strArrSplit != null && strArrSplit.length >= 3) {
            if (!strArrSplit[0].equals("[common]") || !strArrSplit[1].startsWith("result=")) {
                return null;
            }
            try {
                bVar.b = Integer.parseInt(strArrSplit[1].substring("result=".length()).trim());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (!strArrSplit[2].startsWith("time=")) {
                return null;
            }
            try {
                bVar.a = Long.parseLong(strArrSplit[2].substring("time=".length()).trim());
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return bVar;
    }
}
