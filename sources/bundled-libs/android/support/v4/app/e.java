package android.support.v4.app;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class e {
    private static final b a;

    private static class b {
        private b() {
        }

        public String a(String str) {
            return null;
        }

        public int a(Context context, String str, String str2) {
            return 1;
        }
    }

    private static class a extends b {
        private a() {
            super();
        }

        @Override // android.support.v4.app.e.b
        public String a(String str) {
            return f.a(str);
        }

        @Override // android.support.v4.app.e.b
        public int a(Context context, String str, String str2) {
            return f.a(context, str, str2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new a();
        } else {
            a = new b();
        }
    }

    public static String a(String str) {
        return a.a(str);
    }

    public static int a(Context context, String str, String str2) {
        return a.a(context, str, str2);
    }
}
