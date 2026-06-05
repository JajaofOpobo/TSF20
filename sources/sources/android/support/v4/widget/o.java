package android.support.v4.widget;

import android.os.Build;
import android.widget.ListView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class o {
    public static void a(ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            q.a(listView, i);
        } else {
            p.a(listView, i);
        }
    }
}
