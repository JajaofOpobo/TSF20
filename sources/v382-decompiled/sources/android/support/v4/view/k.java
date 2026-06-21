package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public class k {
    static final o a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new n();
        } else {
            a = new l();
        }
    }

    public static boolean a(KeyEvent keyEvent, int i) {
        return a.a(keyEvent.getMetaState(), i);
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }
}
