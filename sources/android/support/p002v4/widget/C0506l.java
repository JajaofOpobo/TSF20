package android.support.p002v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
/* renamed from: android.support.v4.widget.l */
/* loaded from: classes.dex */
class C0506l {
    /* renamed from: a */
    public static Object m12242a(Context context) {
        return new EdgeEffect(context);
    }

    /* renamed from: a */
    public static void m12238a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    /* renamed from: a */
    public static boolean m12241a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    /* renamed from: b */
    public static void m12236b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    /* renamed from: a */
    public static boolean m12240a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    /* renamed from: c */
    public static boolean m12235c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    /* renamed from: a */
    public static boolean m12239a(Object obj, int i) {
        ((EdgeEffect) obj).onAbsorb(i);
        return true;
    }

    /* renamed from: a */
    public static boolean m12237a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }
}
