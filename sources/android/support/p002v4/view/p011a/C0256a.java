package android.support.p002v4.view.p011a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: android.support.v4.view.a.a */
/* loaded from: classes.dex */
public final class C0256a {

    /* renamed from: a */
    private static final InterfaceC0260d f709a;

    /* renamed from: android.support.v4.view.a.a$d */
    /* loaded from: classes.dex */
    interface InterfaceC0260d {
    }

    /* renamed from: android.support.v4.view.a.a$c */
    /* loaded from: classes.dex */
    static class C0259c implements InterfaceC0260d {
        C0259c() {
        }
    }

    /* renamed from: android.support.v4.view.a.a$a */
    /* loaded from: classes.dex */
    static class C0257a extends C0259c {
        C0257a() {
        }
    }

    /* renamed from: android.support.v4.view.a.a$b */
    /* loaded from: classes.dex */
    static class C0258b extends C0257a {
        C0258b() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f709a = new C0258b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f709a = new C0257a();
        } else {
            f709a = new C0259c();
        }
    }

    /* renamed from: a */
    public static C0289j m13143a(AccessibilityEvent accessibilityEvent) {
        return new C0289j(accessibilityEvent);
    }
}
