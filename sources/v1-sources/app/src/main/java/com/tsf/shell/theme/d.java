package com.tsf.shell.theme;

import android.app.Activity;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ String[] b;

    d(c cVar, String[] strArr) {
        this.a = cVar;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        String str;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        g gVar;
        ArrayList arrayList3;
        n nVar;
        ThemeDetailedActivity themeDetailedActivity;
        ArrayList arrayList4;
        for (String str2 : this.b) {
            if (!str2.equals("com.tsf.shell.themes.box")) {
                activity = this.a.c;
                n a = c.a(activity, str2);
                if (a != null) {
                    String str3 = a.g;
                    str = this.a.f;
                    if (str3.equals(str)) {
                        a.h = true;
                    }
                    arrayList = this.a.d;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i = 1;
                            break;
                        }
                        arrayList3 = this.a.d;
                        n nVar2 = (n) arrayList3.get(i2);
                        if (nVar2.g.toString().equals(str2)) {
                            nVar = this.a.g;
                            if (nVar2 == nVar) {
                                try {
                                    themeDetailedActivity = this.a.h;
                                    themeDetailedActivity.finish();
                                } catch (Exception e) {
                                }
                            }
                            arrayList4 = this.a.d;
                            arrayList4.remove(i2);
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                    arrayList2 = this.a.d;
                    arrayList2.add(i, a);
                    gVar = this.a.e;
                    gVar.notifyDataSetChanged();
                }
            }
        }
    }
}
