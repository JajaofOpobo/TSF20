package com.tsf.shell.theme;

import android.app.Activity;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ String[] b;

    e(c cVar, String[] strArr) {
        this.a = cVar;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        String str;
        ArrayList arrayList;
        g gVar;
        for (String str2 : this.b) {
            if (!str2.equals("com.tsf.shell.themes.box")) {
                if (j.a() != null) {
                    j.a().b(str2);
                }
                activity = this.a.c;
                n a = c.a(activity, str2);
                if (a != null) {
                    String str3 = a.g;
                    str = this.a.f;
                    if (str3.equals(str)) {
                        a.h = true;
                    }
                    arrayList = this.a.d;
                    arrayList.add(a);
                    gVar = this.a.e;
                    gVar.notifyDataSetChanged();
                }
            }
        }
    }
}
