package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
class e {
    private static Field a;
    private static boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof ab) {
            ((ab) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (compoundButton instanceof ab) {
            ((ab) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable a(CompoundButton compoundButton) {
        if (!b) {
            try {
                a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                return (Drawable) a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", e2);
                a = null;
            }
        }
        return null;
    }
}
