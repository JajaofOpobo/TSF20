package com.tsf.shell.manager.bind;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f implements Runnable {
    int a;
    String[] b;
    final /* synthetic */ ShellModel c;

    public f(ShellModel shellModel, int i, String[] strArr) {
        this.c = shellModel;
        this.a = i;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        b bVar;
        b bVar2;
        b bVar3;
        context = this.c.d;
        String[] strArr = this.b;
        switch (this.a) {
            case 1:
            case 5:
                for (String str : strArr) {
                    this.c.a.a(context, str);
                }
                break;
            case 2:
                for (String str2 : strArr) {
                    this.c.a.c(context, str2);
                }
                break;
            case 3:
                for (String str3 : strArr) {
                    this.c.a.b(context, str3);
                }
                break;
        }
        if (this.c.a.b.size() > 0) {
            arrayList = this.c.a.b;
            this.c.a.b = new ArrayList();
        } else {
            arrayList = null;
        }
        if (this.c.a.c.size() > 0) {
            arrayList2 = this.c.a.c;
            this.c.a.c = new ArrayList();
        } else {
            arrayList2 = null;
        }
        if (this.c.a.d.size() > 0) {
            arrayList3 = this.c.a.d;
            this.c.a.d = new ArrayList();
        } else {
            arrayList3 = null;
        }
        if (this.c.a.f.size() > 0) {
            arrayList4 = this.c.a.f;
            this.c.a.f = new ArrayList();
        } else {
            arrayList4 = null;
        }
        if (this.c.a.g.size() > 0) {
            arrayList5 = this.c.a.g;
            this.c.a.g = new ArrayList();
        } else {
            arrayList5 = null;
        }
        if (this.c.a.h.size() > 0) {
            ArrayList arrayList7 = this.c.a.h;
            this.c.a.h = new ArrayList();
            arrayList6 = arrayList7;
        } else {
            arrayList6 = null;
        }
        if (arrayList != null) {
            boolean z = this.a != 5;
            bVar3 = this.c.o;
            bVar3.a(arrayList, z);
        }
        if (arrayList3 != null) {
            bVar2 = this.c.o;
            bVar2.b(arrayList3);
        }
        if (arrayList2 != null) {
            boolean z2 = this.a != 4;
            bVar = this.c.o;
            bVar.b(arrayList2, z2);
        }
        if (arrayList4 != null) {
            com.tsf.shell.manager.a.i.b(arrayList4);
        }
        if (arrayList6 != null) {
            com.tsf.shell.manager.a.i.c(arrayList6);
        }
        if (arrayList5 != null) {
            com.tsf.shell.manager.a.i.a(arrayList5, this.a != 4);
        }
    }
}
