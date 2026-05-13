package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public final class e {
    private static final a a;

    /* loaded from: classes.dex */
    interface a {
        Intent a(ComponentName componentName);
    }

    /* loaded from: classes.dex */
    static class b implements a {
        b() {
        }

        @Override // android.support.v4.content.e.a
        public Intent a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.content.e.b, android.support.v4.content.e.a
        public Intent a(ComponentName componentName) {
            return f.a(componentName);
        }
    }

    /* loaded from: classes.dex */
    static class d extends c {
        d() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15) {
            a = new d();
        } else if (i >= 11) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static Intent a(ComponentName componentName) {
        return a.a(componentName);
    }
}
