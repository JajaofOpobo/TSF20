package com.censivn.C3DEngine.api.shell;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tsf.shell.Home;
import com.tsf.shell.manager.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VConsole {
    public static void pauseScreenOrientation() {
        a.b.b(Home.b());
    }

    public static void resumeScreenOrientation() {
        a.b.c(Home.b());
    }

    public static void isTransparentNavigationBar() {
        a.b.b();
    }

    public static void isFullScreen() {
        a.b.c();
    }

    public static Context context() {
        return com.censivn.C3DEngine.a.d();
    }

    public static Activity activity() {
        return Home.b();
    }

    public static void startActivityWithoutAnimation(Intent intent) {
        Home.b().a(intent);
    }
}
