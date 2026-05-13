package android.support.p002v4.widget;

import android.os.Build;
import android.widget.ListView;
/* renamed from: android.support.v4.widget.o */
/* loaded from: classes.dex */
public final class C0509o {
    /* renamed from: a */
    public static void m12230a(ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0511q.m12228a(listView, i);
        } else {
            C0510p.m12229a(listView, i);
        }
    }
}
