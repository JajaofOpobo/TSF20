package android.support.p002v4.app;

import android.os.Bundle;
import android.support.p002v4.app.AbstractC0117v;
import android.support.p002v4.content.C0156g;
import android.support.p002v4.p009d.C0163c;
import android.support.p002v4.p009d.C0174i;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.w */
/* loaded from: classes.dex */
public class C0119w extends AbstractC0117v {

    /* renamed from: a */
    static boolean f378a = false;

    /* renamed from: b */
    final C0174i<C0120a> f379b = new C0174i<>();

    /* renamed from: c */
    final C0174i<C0120a> f380c = new C0174i<>();

    /* renamed from: d */
    final String f381d;

    /* renamed from: e */
    boolean f382e;

    /* renamed from: f */
    boolean f383f;

    /* renamed from: g */
    private AbstractC0093n f384g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.w$a */
    /* loaded from: classes.dex */
    public final class C0120a implements C0156g.InterfaceC0157a<Object>, C0156g.InterfaceC0158b<Object> {

        /* renamed from: a */
        final int f385a;

        /* renamed from: b */
        final Bundle f386b;

        /* renamed from: c */
        AbstractC0117v.InterfaceC0118a<Object> f387c;

        /* renamed from: d */
        C0156g<Object> f388d;

        /* renamed from: e */
        boolean f389e;

        /* renamed from: f */
        boolean f390f;

        /* renamed from: g */
        Object f391g;

        /* renamed from: h */
        boolean f392h;

        /* renamed from: i */
        boolean f393i;

        /* renamed from: j */
        boolean f394j;

        /* renamed from: k */
        boolean f395k;

        /* renamed from: l */
        boolean f396l;

        /* renamed from: m */
        boolean f397m;

        /* renamed from: n */
        C0120a f398n;

        /* renamed from: o */
        final /* synthetic */ C0119w f399o;

        /* renamed from: a */
        void m13447a() {
            if (this.f393i && this.f394j) {
                this.f392h = true;
            } else if (!this.f392h) {
                this.f392h = true;
                if (C0119w.f378a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.f388d == null && this.f387c != null) {
                    this.f388d = this.f387c.m13461a(this.f385a, this.f386b);
                }
                if (this.f388d != null) {
                    if (this.f388d.getClass().isMemberClass() && !Modifier.isStatic(this.f388d.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f388d);
                    }
                    if (!this.f397m) {
                        this.f388d.m13392a(this.f385a, this);
                        this.f388d.m13391a((C0156g.InterfaceC0157a<Object>) this);
                        this.f397m = true;
                    }
                    this.f388d.m13393a();
                }
            }
        }

        /* renamed from: b */
        void m13444b() {
            if (C0119w.f378a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f393i = true;
            this.f394j = this.f392h;
            this.f392h = false;
            this.f387c = null;
        }

        /* renamed from: c */
        void m13443c() {
            if (this.f393i) {
                if (C0119w.f378a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f393i = false;
                if (this.f392h != this.f394j && !this.f392h) {
                    m13441e();
                }
            }
            if (this.f392h && this.f389e && !this.f395k) {
                m13446a(this.f388d, this.f391g);
            }
        }

        /* renamed from: d */
        void m13442d() {
            if (this.f392h && this.f395k) {
                this.f395k = false;
                if (this.f389e) {
                    m13446a(this.f388d, this.f391g);
                }
            }
        }

        /* renamed from: e */
        void m13441e() {
            if (C0119w.f378a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f392h = false;
            if (!this.f393i && this.f388d != null && this.f397m) {
                this.f397m = false;
                this.f388d.m13390a((C0156g.InterfaceC0158b<Object>) this);
                this.f388d.m13386b(this);
                this.f388d.m13385c();
            }
        }

        /* renamed from: f */
        void m13440f() {
            String str;
            if (C0119w.f378a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f396l = true;
            boolean z = this.f390f;
            this.f390f = false;
            if (this.f387c != null && this.f388d != null && this.f389e && z) {
                if (C0119w.f378a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                if (this.f399o.f384g != null) {
                    String str2 = this.f399o.f384g.f286d.f318v;
                    this.f399o.f384g.f286d.f318v = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f387c.m13460a(this.f388d);
                } finally {
                    if (this.f399o.f384g != null) {
                        this.f399o.f384g.f286d.f318v = str;
                    }
                }
            }
            this.f387c = null;
            this.f391g = null;
            this.f389e = false;
            if (this.f388d != null) {
                if (this.f397m) {
                    this.f397m = false;
                    this.f388d.m13390a((C0156g.InterfaceC0158b<Object>) this);
                    this.f388d.m13386b(this);
                }
                this.f388d.m13383e();
            }
            if (this.f398n != null) {
                this.f398n.m13440f();
            }
        }

        /* renamed from: a */
        void m13446a(C0156g<Object> c0156g, Object obj) {
            String str;
            if (this.f387c != null) {
                if (this.f399o.f384g != null) {
                    String str2 = this.f399o.f384g.f286d.f318v;
                    this.f399o.f384g.f286d.f318v = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0119w.f378a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + c0156g + ": " + c0156g.m13389a((C0156g<Object>) obj));
                    }
                    this.f387c.m13459a((C0156g<C0156g<Object>>) c0156g, (C0156g<Object>) obj);
                    this.f390f = true;
                } finally {
                    if (this.f399o.f384g != null) {
                        this.f399o.f384g.f286d.f318v = str;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f385a);
            sb.append(" : ");
            C0163c.m13371a(this.f388d, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void m13445a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f385a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f386b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f387c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f388d);
            if (this.f388d != null) {
                this.f388d.m13388a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f389e || this.f390f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f389e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f390f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f391g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f392h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f395k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f396l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f393i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f394j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f397m);
            if (this.f398n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f398n);
                printWriter.println(":");
                this.f398n.m13445a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0119w(String str, AbstractC0093n abstractC0093n, boolean z) {
        this.f381d = str;
        this.f384g = abstractC0093n;
        this.f382e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13457a(AbstractC0093n abstractC0093n) {
        this.f384g = abstractC0093n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13454b() {
        if (f378a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f382e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f382e = true;
        for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
            this.f379b.m13313e(m13320b).m13447a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13453c() {
        if (f378a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f382e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
            this.f379b.m13313e(m13320b).m13441e();
        }
        this.f382e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13452d() {
        if (f378a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f382e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f383f = true;
        this.f382e = false;
        for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
            this.f379b.m13313e(m13320b).m13444b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m13451e() {
        if (this.f383f) {
            if (f378a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f383f = false;
            for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
                this.f379b.m13313e(m13320b).m13443c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m13450f() {
        for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
            this.f379b.m13313e(m13320b).f395k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m13449g() {
        for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
            this.f379b.m13313e(m13320b).m13442d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m13448h() {
        if (!this.f383f) {
            if (f378a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int m13320b = this.f379b.m13320b() - 1; m13320b >= 0; m13320b--) {
                this.f379b.m13313e(m13320b).m13440f();
            }
            this.f379b.m13317c();
        }
        if (f378a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int m13320b2 = this.f380c.m13320b() - 1; m13320b2 >= 0; m13320b2--) {
            this.f380c.m13313e(m13320b2).m13440f();
        }
        this.f380c.m13317c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0163c.m13371a(this.f384g, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void m13455a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f379b.m13320b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f379b.m13320b(); i++) {
                C0120a m13313e = this.f379b.m13313e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f379b.m13314d(i));
                printWriter.print(": ");
                printWriter.println(m13313e.toString());
                m13313e.m13445a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f380c.m13320b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f380c.m13320b(); i2++) {
                C0120a m13313e2 = this.f380c.m13313e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f380c.m13314d(i2));
                printWriter.print(": ");
                printWriter.println(m13313e2.toString());
                m13313e2.m13445a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.p002v4.app.AbstractC0117v
    /* renamed from: a */
    public boolean mo13458a() {
        int m13320b = this.f379b.m13320b();
        boolean z = false;
        for (int i = 0; i < m13320b; i++) {
            C0120a m13313e = this.f379b.m13313e(i);
            z |= m13313e.f392h && !m13313e.f390f;
        }
        return z;
    }
}
