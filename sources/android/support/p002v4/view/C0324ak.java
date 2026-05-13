package android.support.p002v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: android.support.v4.view.ak */
/* loaded from: classes.dex */
class C0324ak {

    /* renamed from: a */
    private static Method f756a;

    /* renamed from: a */
    public static boolean m12816a(View view) {
        return view.isOpaque();
    }

    /* renamed from: a */
    public static void m12815a(ViewGroup viewGroup, boolean z) {
        if (f756a == null) {
            try {
                f756a = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            f756a.setAccessible(true);
        }
        try {
            f756a.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }
}
