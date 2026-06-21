package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class a {
    public static final Rect a = new Rect();
    private static Class b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static Rect a(Drawable drawable) {
        if (b != null) {
            try {
                Drawable d = android.support.v4.b.a.a.d(drawable);
                Object invoke = d.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(d, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : b.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    rect.bottom = field.getInt(invoke);
                                    break;
                                } else {
                                    break;
                                }
                            case 115029:
                                if (name.equals("top")) {
                                    rect.top = field.getInt(invoke);
                                    break;
                                } else {
                                    break;
                                }
                            case 3317767:
                                if (name.equals("left")) {
                                    rect.left = field.getInt(invoke);
                                    break;
                                } else {
                                    break;
                                }
                            case 108511772:
                                if (name.equals("right")) {
                                    rect.right = field.getInt(invoke);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return a;
    }
}
