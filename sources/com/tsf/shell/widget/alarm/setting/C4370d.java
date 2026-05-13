package com.tsf.shell.widget.alarm.setting;

import com.p019a.p020a.C0775a;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.widget.alarm.setting.d */
/* loaded from: classes.dex */
public class C4370d {
    /* renamed from: a */
    public static ArrayList<C4284a> m121a() {
        ArrayList<C4284a> arrayList = new ArrayList<>();
        try {
            return (ArrayList) C0775a.m11059a(SettingActivity.f14091a, "CityHistory");
        } catch (Exception e) {
            C4305i.m259c("GET History Search Fail");
            return arrayList;
        }
    }

    /* renamed from: a */
    public static boolean m120a(C4284a c4284a) {
        ArrayList arrayList = new ArrayList();
        Iterator<C4284a> it = m121a().iterator();
        while (it.hasNext()) {
            C4284a next = it.next();
            if (!c4284a.f13883c.equals(next.f13883c)) {
                arrayList.add(next);
            }
        }
        arrayList.add(0, c4284a);
        if (arrayList.size() > 10) {
            arrayList.remove(arrayList.size() - 1);
        }
        try {
            C0775a.m11060a(SettingActivity.f14091a, arrayList, "CityHistory");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
