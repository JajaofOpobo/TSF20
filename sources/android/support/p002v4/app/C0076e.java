package android.support.p002v4.app;

import android.content.Context;
import android.os.Build;
/* renamed from: android.support.v4.app.e */
/* loaded from: classes.dex */
public final class C0076e {

    /* renamed from: a */
    private static final C0079b f221a;

    /* renamed from: android.support.v4.app.e$b */
    /* loaded from: classes.dex */
    private static class C0079b {
        private C0079b() {
        }

        /* renamed from: a */
        public String mo13678a(String str) {
            return null;
        }

        /* renamed from: a */
        public int mo13679a(Context context, String str, String str2) {
            return 1;
        }
    }

    /* renamed from: android.support.v4.app.e$a */
    /* loaded from: classes.dex */
    private static class C0078a extends C0079b {
        private C0078a() {
            super();
        }

        @Override // android.support.p002v4.app.C0076e.C0079b
        /* renamed from: a */
        public String mo13678a(String str) {
            return C0080f.m13676a(str);
        }

        @Override // android.support.p002v4.app.C0076e.C0079b
        /* renamed from: a */
        public int mo13679a(Context context, String str, String str2) {
            return C0080f.m13677a(context, str, str2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f221a = new C0078a();
        } else {
            f221a = new C0079b();
        }
    }

    /* renamed from: a */
    public static String m13680a(String str) {
        return f221a.mo13678a(str);
    }

    /* renamed from: a */
    public static int m13681a(Context context, String str, String str2) {
        return f221a.mo13679a(context, str, str2);
    }
}
