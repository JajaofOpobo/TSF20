package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.v;
import android.support.v4.content.g;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class w extends v {
    static boolean a = false;
    final android.support.v4.d.i<a> b = new android.support.v4.d.i<>();
    final android.support.v4.d.i<a> c = new android.support.v4.d.i<>();
    final String d;
    boolean e;
    boolean f;
    private n g;

    final class a implements g.a<Object>, g.b<Object> {
        final int a;
        final Bundle b;
        v.a<Object> c;
        android.support.v4.content.g<Object> d;
        boolean e;
        boolean f;
        Object g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        a n;
        final /* synthetic */ w o;

        void a() {
            if (this.i && this.j) {
                this.h = true;
                return;
            }
            if (!this.h) {
                this.h = true;
                if (w.a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.d == null && this.c != null) {
                    this.d = this.c.a(this.a, this.b);
                }
                if (this.d != null) {
                    if (this.d.getClass().isMemberClass() && !Modifier.isStatic(this.d.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
                    }
                    if (!this.m) {
                        this.d.a(this.a, this);
                        this.d.a((g.a<Object>) this);
                        this.m = true;
                    }
                    this.d.a();
                }
            }
        }

        void b() {
            if (w.a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.i = true;
            this.j = this.h;
            this.h = false;
            this.c = null;
        }

        void c() {
            if (this.i) {
                if (w.a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.i = false;
                if (this.h != this.j && !this.h) {
                    e();
                }
            }
            if (this.h && this.e && !this.k) {
                a(this.d, this.g);
            }
        }

        void d() {
            if (this.h && this.k) {
                this.k = false;
                if (this.e) {
                    a(this.d, this.g);
                }
            }
        }

        void e() {
            if (w.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.h = false;
            if (!this.i && this.d != null && this.m) {
                this.m = false;
                this.d.a((g.b<Object>) this);
                this.d.b(this);
                this.d.c();
            }
        }

        void f() {
            String str;
            if (w.a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l = true;
            boolean z = this.f;
            this.f = false;
            if (this.c != null && this.d != null && this.e && z) {
                if (w.a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                if (this.o.g != null) {
                    String str2 = this.o.g.d.v;
                    this.o.g.d.v = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.c.a(this.d);
                } finally {
                    if (this.o.g != null) {
                        this.o.g.d.v = str;
                    }
                }
            }
            this.c = null;
            this.g = null;
            this.e = false;
            if (this.d != null) {
                if (this.m) {
                    this.m = false;
                    this.d.a((g.b<Object>) this);
                    this.d.b(this);
                }
                this.d.e();
            }
            if (this.n != null) {
                this.n.f();
            }
        }

        void a(android.support.v4.content.g<Object> gVar, Object obj) {
            String str;
            if (this.c != null) {
                if (this.o.g != null) {
                    String str2 = this.o.g.d.v;
                    this.o.g.d.v = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (w.a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + gVar + ": " + gVar.a(obj));
                    }
                    this.c.a(gVar, obj);
                    this.f = true;
                } finally {
                    if (this.o.g != null) {
                        this.o.g.d.v = str;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.a);
            sb.append(" : ");
            android.support.v4.d.c.a(this.d, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.a);
            printWriter.print(" mArgs=");
            printWriter.println(this.b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.d);
            if (this.d != null) {
                this.d.a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.e || this.f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.m);
            if (this.n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.n);
                printWriter.println(":");
                this.n.a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }
    }

    w(String str, n nVar, boolean z) {
        this.d = str;
        this.g = nVar;
        this.e = z;
    }

    void a(n nVar) {
        this.g = nVar;
    }

    void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.e = true;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                this.b.e(iB).a();
            }
        }
    }

    void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                this.b.e(iB).e();
            }
            this.e = false;
        }
    }

    void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
        } else {
            this.f = true;
            this.e = false;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                this.b.e(iB).b();
            }
        }
    }

    void e() {
        if (this.f) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f = false;
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                this.b.e(iB).c();
            }
        }
    }

    void f() {
        for (int iB = this.b.b() - 1; iB >= 0; iB--) {
            this.b.e(iB).k = true;
        }
    }

    void g() {
        for (int iB = this.b.b() - 1; iB >= 0; iB--) {
            this.b.e(iB).d();
        }
    }

    void h() {
        if (!this.f) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iB = this.b.b() - 1; iB >= 0; iB--) {
                this.b.e(iB).f();
            }
            this.b.c();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iB2 = this.c.b() - 1; iB2 >= 0; iB2--) {
            this.c.e(iB2).f();
        }
        this.c.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.d.c.a(this.g, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.b.b(); i++) {
                a aVarE = this.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.d(i));
                printWriter.print(": ");
                printWriter.println(aVarE.toString());
                aVarE.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.b(); i2++) {
                a aVarE2 = this.c.e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.d(i2));
                printWriter.print(": ");
                printWriter.println(aVarE2.toString());
                aVarE2.a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.v
    public boolean a() {
        int iB = this.b.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            a aVarE = this.b.e(i);
            z |= aVarE.h && !aVarE.f;
        }
        return z;
    }
}
