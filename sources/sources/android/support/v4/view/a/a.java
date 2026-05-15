package android.support.v4.view.a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class a {
    private static final d a;

    interface d {
    }

    static class c implements d {
        c() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.view.a.a$a, reason: collision with other inner class name */
    static class C0007a extends c {
        C0007a() {
        }
    }

    static class b extends C0007a {
        b() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new C0007a();
        } else {
            a = new c();
        }
    }

    public static j a(AccessibilityEvent accessibilityEvent) {
        return new j(accessibilityEvent);
    }
}
