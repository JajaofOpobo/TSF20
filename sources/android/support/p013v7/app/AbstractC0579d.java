package android.support.p013v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* renamed from: android.support.v7.app.d */
/* loaded from: classes.dex */
public abstract class AbstractC0579d {

    /* renamed from: a */
    private static int f1285a = -1;

    /* renamed from: b */
    private static boolean f1286b = false;

    /* renamed from: a */
    public abstract ActionBar mo11977a();

    /* renamed from: a */
    public abstract View mo11994a(int i);

    /* renamed from: a */
    public abstract void mo11990a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo11960a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo11989a(View view);

    /* renamed from: a */
    public abstract void mo11988a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo11972a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo11971b();

    /* renamed from: b */
    public abstract void mo11987b(int i);

    /* renamed from: b */
    public abstract void mo11986b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo11985b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo11984c();

    /* renamed from: c */
    public abstract void mo11959c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo11983c(int i);

    /* renamed from: d */
    public abstract void mo11982d();

    /* renamed from: e */
    public abstract void mo11981e();

    /* renamed from: f */
    public abstract void mo11968f();

    /* renamed from: g */
    public abstract void mo11980g();

    /* renamed from: h */
    public abstract boolean mo11957h();

    /* renamed from: a */
    public static AbstractC0579d m11993a(Activity activity, InterfaceC0578c interfaceC0578c) {
        return m11991a(activity, activity.getWindow(), interfaceC0578c);
    }

    /* renamed from: a */
    public static AbstractC0579d m11992a(Dialog dialog, InterfaceC0578c interfaceC0578c) {
        return m11991a(dialog.getContext(), dialog.getWindow(), interfaceC0578c);
    }

    /* renamed from: a */
    private static AbstractC0579d m11991a(Context context, Window window, InterfaceC0578c interfaceC0578c) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return new C0585h(context, window, interfaceC0578c);
        }
        if (i >= 14) {
            return new C0583g(context, window, interfaceC0578c);
        }
        if (i >= 11) {
            return new C0582f(context, window, interfaceC0578c);
        }
        return new AppCompatDelegateImplV7(context, window, interfaceC0578c);
    }

    /* renamed from: i */
    public static int m11979i() {
        return f1285a;
    }

    /* renamed from: j */
    public static boolean m11978j() {
        return f1286b;
    }
}
