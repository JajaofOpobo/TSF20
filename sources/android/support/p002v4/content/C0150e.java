package android.support.p002v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
/* renamed from: android.support.v4.content.e */
/* loaded from: classes.dex */
public final class C0150e {

    /* renamed from: a */
    private static final InterfaceC0151a f417a;

    /* renamed from: android.support.v4.content.e$a */
    /* loaded from: classes.dex */
    interface InterfaceC0151a {
        /* renamed from: a */
        Intent mo13395a(ComponentName componentName);
    }

    /* renamed from: android.support.v4.content.e$b */
    /* loaded from: classes.dex */
    static class C0152b implements InterfaceC0151a {
        C0152b() {
        }

        @Override // android.support.p002v4.content.C0150e.InterfaceC0151a
        /* renamed from: a */
        public Intent mo13395a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }
    }

    /* renamed from: android.support.v4.content.e$c */
    /* loaded from: classes.dex */
    static class C0153c extends C0152b {
        C0153c() {
        }

        @Override // android.support.p002v4.content.C0150e.C0152b, android.support.p002v4.content.C0150e.InterfaceC0151a
        /* renamed from: a */
        public Intent mo13395a(ComponentName componentName) {
            return C0155f.m13394a(componentName);
        }
    }

    /* renamed from: android.support.v4.content.e$d */
    /* loaded from: classes.dex */
    static class C0154d extends C0153c {
        C0154d() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15) {
            f417a = new C0154d();
        } else if (i >= 11) {
            f417a = new C0153c();
        } else {
            f417a = new C0152b();
        }
    }

    /* renamed from: a */
    public static Intent m13396a(ComponentName componentName) {
        return f417a.mo13395a(componentName);
    }
}
