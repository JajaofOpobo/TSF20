package com.tsf.shell.workspace3D;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class ba implements Runnable {
    final /* synthetic */ av a;
    private final /* synthetic */ String b;

    ba(av avVar, String str) {
        this.a = avVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (this.b != null) {
            strArr = this.b.split(",");
        } else {
            strArr = new String[0];
        }
        for (String str : strArr) {
            com.tsf.shell.workspace3D.k.j a = av.a(this.a, str);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        this.a.a(arrayList2);
        arrayList = this.a.o;
        arrayList.clear();
    }
}
