package android.support.v7.app;

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
/* loaded from: classes.dex */
public abstract class d {
    private static int a = -1;
    private static boolean b = false;

    public abstract ActionBar a();

    public abstract View a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract boolean h();

    public static d a(Activity activity, c cVar) {
        return a(activity, activity.getWindow(), cVar);
    }

    public static d a(Dialog dialog, c cVar) {
        return a(dialog.getContext(), dialog.getWindow(), cVar);
    }

    private static d a(Context context, Window window, c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return new h(context, window, cVar);
        }
        if (i >= 14) {
            return new g(context, window, cVar);
        }
        if (i >= 11) {
            return new f(context, window, cVar);
        }
        return new AppCompatDelegateImplV7(context, window, cVar);
    }

    public static int i() {
        return a;
    }

    public static boolean j() {
        return b;
    }
}
