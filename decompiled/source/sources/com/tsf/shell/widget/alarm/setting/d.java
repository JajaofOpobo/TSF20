package com.tsf.shell.widget.alarm.setting;

import com.tsf.shell.widget.alarm.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {
    public static ArrayList<com.tsf.shell.widget.alarm.d.a> a() {
        ArrayList<com.tsf.shell.widget.alarm.d.a> arrayList = new ArrayList<>();
        try {
            return (ArrayList) com.a.a.a.a(SettingActivity.a, "CityHistory");
        } catch (Exception e) {
            i.c("GET History Search Fail");
            return arrayList;
        }
    }

    public static boolean a(com.tsf.shell.widget.alarm.d.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.tsf.shell.widget.alarm.d.a> it = a().iterator();
        while (it.hasNext()) {
            com.tsf.shell.widget.alarm.d.a next = it.next();
            if (!aVar.c.equals(next.c)) {
                arrayList.add(next);
            }
        }
        arrayList.add(0, aVar);
        if (arrayList.size() > 10) {
            arrayList.remove(arrayList.size() - 1);
        }
        try {
            com.a.a.a.a(SettingActivity.a, arrayList, "CityHistory");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
