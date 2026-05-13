package com.tsf.extend.theme.p082a;

import android.text.TextUtils;
import com.tsf.extend.base.p080j.C1423d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.tsf.extend.theme.a.a */
/* loaded from: classes.dex */
public class C1646a implements InterfaceC1649d {

    /* renamed from: a */
    private static List<String> f5293a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static List<String> f5294b;

    static {
        f5293a.add("0");
        f5293a.add("1");
        f5293a.add("2");
        f5293a.add("3");
        f5293a.add("4");
        f5293a.add("5");
        f5293a.add("6");
        f5293a.add("7");
        f5293a.add("8");
        f5293a.add("9");
        f5293a.add("a");
        f5293a.add("b");
        f5294b = Collections.synchronizedList(new ArrayList());
        f5294b.add("c");
        f5294b.add("d");
        f5294b.add("e");
        f5294b.add("f");
    }

    @Override // com.tsf.extend.theme.p082a.InterfaceC1649d
    /* renamed from: a */
    public InterfaceC1650e mo7937a() {
        String str = "";
        String m8688b = C1423d.m8688b();
        if (TextUtils.isEmpty(m8688b)) {
            return null;
        }
        if (m8688b.length() >= 3) {
            str = m8688b.substring(2, 3);
        }
        return m7938a(str);
    }

    /* renamed from: a */
    private InterfaceC1650e m7938a(String str) {
        if (str != null) {
            if (f5293a.contains(str.toLowerCase())) {
                return new C1647b();
            }
            if (f5294b.contains(str.toLowerCase())) {
                return new C1648c();
            }
        }
        return null;
    }
}
