package com.tsf.shell.widget.alarm.setting;

import com.tsf.shell.widget.alarm.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        try {
            return (ArrayList) com.b.a.a.a(SettingActivity.a, "CityHistory");
        } catch (Exception e) {
            u.c("GET History Search Fail");
            return arrayList;
        }
    }

    public static boolean a(com.tsf.shell.widget.alarm.d.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = a().iterator();
        while (it.hasNext()) {
            com.tsf.shell.widget.alarm.d.a aVar2 = (com.tsf.shell.widget.alarm.d.a) it.next();
            if (!aVar.c.equals(aVar2.c)) {
                arrayList.add(aVar2);
            }
        }
        arrayList.add(0, aVar);
        if (arrayList.size() > 10) {
            arrayList.remove(arrayList.size() - 1);
        }
        try {
            com.b.a.a.a(SettingActivity.a, arrayList, "CityHistory");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
