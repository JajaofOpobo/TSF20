package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* renamed from: com.android.volley.t */
/* loaded from: classes.dex */
public class C0810t {

    /* renamed from: a */
    public static String f2326a = "Volley";

    /* renamed from: b */
    public static boolean f2327b = Log.isLoggable(f2326a, 2);

    /* renamed from: a */
    public static void m10992a(String str, Object... objArr) {
        if (f2327b) {
            Log.v(f2326a, m10987e(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m10990b(String str, Object... objArr) {
        Log.d(f2326a, m10987e(str, objArr));
    }

    /* renamed from: c */
    public static void m10989c(String str, Object... objArr) {
        Log.e(f2326a, m10987e(str, objArr));
    }

    /* renamed from: a */
    public static void m10991a(Throwable th, String str, Object... objArr) {
        Log.e(f2326a, m10987e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m10988d(String str, Object... objArr) {
        Log.wtf(f2326a, m10987e(str, objArr));
    }

    /* renamed from: e */
    private static String m10987e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (stackTrace[i].getClass().equals(C0810t.class)) {
                i++;
            } else {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.t$a */
    /* loaded from: classes.dex */
    public static class C0811a {

        /* renamed from: a */
        public static final boolean f2328a = C0810t.f2327b;

        /* renamed from: b */
        private final List<C0812a> f2329b = new ArrayList();

        /* renamed from: c */
        private boolean f2330c = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.android.volley.t$a$a */
        /* loaded from: classes.dex */
        public static class C0812a {

            /* renamed from: a */
            public final String f2331a;

            /* renamed from: b */
            public final long f2332b;

            /* renamed from: c */
            public final long f2333c;

            public C0812a(String str, long j, long j2) {
                this.f2331a = str;
                this.f2332b = j;
                this.f2333c = j2;
            }
        }

        /* renamed from: a */
        public synchronized void m10984a(String str, long j) {
            if (this.f2330c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f2329b.add(new C0812a(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: a */
        public synchronized void m10985a(String str) {
            this.f2330c = true;
            long m10986a = m10986a();
            if (m10986a > 0) {
                long j = this.f2329b.get(0).f2333c;
                C0810t.m10990b("(%-4d ms) %s", Long.valueOf(m10986a), str);
                long j2 = j;
                for (C0812a c0812a : this.f2329b) {
                    long j3 = c0812a.f2333c;
                    C0810t.m10990b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c0812a.f2332b), c0812a.f2331a);
                    j2 = j3;
                }
            }
        }

        protected void finalize() {
            if (!this.f2330c) {
                m10985a("Request on the loose");
                C0810t.m10989c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        private long m10986a() {
            if (this.f2329b.size() == 0) {
                return 0L;
            }
            return this.f2329b.get(this.f2329b.size() - 1).f2333c - this.f2329b.get(0).f2333c;
        }
    }
}
