package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ak;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!a.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static boolean a(View view) {
        return ak.d(view) == 1;
    }
}
