package com.censivn.C3DEngine.api.shell;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
/* loaded from: classes.dex */
public class VConsole {
    public static void pauseScreenOrientation() {
        C3359a.f11088b.m10559b(Home.m6177b());
    }

    public static void resumeScreenOrientation() {
        C3359a.f11088b.m10552c(Home.m6177b());
    }

    public static void isTransparentNavigationBar() {
        C3359a.f11088b.m10560b();
    }

    public static void isFullScreen() {
        C3359a.f11088b.m10553c();
    }

    public static Context context() {
        return C0853a.m10856d();
    }

    public static Activity activity() {
        return Home.m6177b();
    }

    public static void startActivityWithoutAnimation(Intent intent) {
        Home.m6177b().m6185a(intent);
    }
}
