package com.tsf.shell.widget.alarm.setting;

import com.tsf.shell.widget.alarm.i;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public static ArrayList<com.tsf.shell.widget.alarm.d.A> a() {
        ArrayList<com.tsf.shell.widget.alarm.d.A> arrayList = new ArrayList<>();
        try {
            return (ArrayList) com.a.a.a.a(SettingActivity.a, "CityHistory");
        } catch (Exception e) {
            i.c("GET History Search Fail");
            return arrayList;
        }
    }

    public static boolean a(com.tsf.shell.widget.alarm.d.A aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.tsf.shell.widget.alarm.d.A aVar2 : a()) {
            if (!aVar.c.equals(aVar2.c)) {
                arrayList.add(aVar2);
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
