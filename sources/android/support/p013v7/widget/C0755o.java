package android.support.p013v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.p003a.p004a.InterfaceC0037i;
import android.support.p013v7.p015b.p016a.C0603a;
import android.util.Log;
import java.lang.reflect.Field;
/* renamed from: android.support.v7.widget.o */
/* loaded from: classes.dex */
public class C0755o {

    /* renamed from: a */
    public static final Rect f2168a = new Rect();

    /* renamed from: b */
    private static Class<?> f2169b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2169b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public static Rect m11124a(Drawable drawable) {
        Field[] fields;
        if (f2169b != null) {
            try {
                Drawable m13849g = C0021a.m13849g(drawable);
                Object invoke = m13849g.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m13849g, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f2169b.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                rect.left = field.getInt(invoke);
                                continue;
                            case 1:
                                rect.top = field.getInt(invoke);
                                continue;
                            case 2:
                                rect.right = field.getInt(invoke);
                                continue;
                            case 3:
                                rect.bottom = field.getInt(invoke);
                                continue;
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f2168a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m11123b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m11121d(drawable);
        }
    }

    /* renamed from: c */
    public static boolean m11122c(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            return Build.VERSION.SDK_INT >= 16;
        } else if (drawable instanceof InsetDrawable) {
            return Build.VERSION.SDK_INT >= 14;
        } else if (drawable instanceof StateListDrawable) {
            return Build.VERSION.SDK_INT >= 8;
        } else if (drawable instanceof GradientDrawable) {
            return Build.VERSION.SDK_INT >= 14;
        } else if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                for (Drawable drawable2 : children) {
                    if (!m11122c(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } else if (drawable instanceof InterfaceC0037i) {
            return m11122c(((InterfaceC0037i) drawable).mo13805a());
        } else {
            if (drawable instanceof C0603a) {
                return m11122c(((C0603a) drawable).m11882a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m11122c(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: d */
    private static void m11121d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C0770v.f2229e);
        } else {
            drawable.setState(C0770v.f2232h);
        }
        drawable.setState(state);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PorterDuff.Mode m11125a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.valueOf("ADD") : mode;
        }
    }
}
