package com.tsf.extend.base.p080j;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.base.j.t */
/* loaded from: classes.dex */
public class C1448t {

    /* renamed from: a */
    private static List<String> f4457a = new ArrayList();

    /* renamed from: b */
    private static String f4458b = "";

    static {
        f4457a.add("460");
        f4457a.add("461");
        f4457a.add("441");
        f4457a.add("440");
        f4457a.add("450");
    }

    /* renamed from: a */
    public static boolean m8591a(Context context) {
        if (TextUtils.isEmpty(f4458b)) {
            f4458b = C1423d.m8685b(context);
        }
        return m8590a(f4458b);
    }

    /* renamed from: a */
    private static boolean m8590a(String str) {
        return f4457a == null || !f4457a.contains(str);
    }
}
