package android.support.v4.view.a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class a {
    private static final d a;

    /* loaded from: classes.dex */
    interface d {
    }

    /* loaded from: classes.dex */
    static class c implements d {
        c() {
        }
    }

    /* renamed from: android.support.v4.view.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0007a extends c {
        C0007a() {
        }
    }

    /* loaded from: classes.dex */
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
