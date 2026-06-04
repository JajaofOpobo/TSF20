package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;

/* loaded from: classes.dex */
final class ac implements android.support.v4.a.b {
    final int a;
    final Bundle b;
    aa c;
    android.support.v4.a.a d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    ac n;
    final /* synthetic */ ab o;

    final void a() {
        if (ab.a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.h = false;
        if (!this.i && this.d != null && this.m) {
            this.m = false;
            this.d.a(this);
            this.d.b();
        }
    }

    final void b() {
        String str;
        while (true) {
            if (ab.a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l = true;
            boolean z = this.f;
            this.f = false;
            if (this.c != null && this.d != null && this.e && z) {
                if (ab.a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                if (this.o.e != null) {
                    String str2 = this.o.e.b.u;
                    this.o.e.b.u = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    aa aaVar = this.c;
                    android.support.v4.a.a aVar = this.d;
                } finally {
                    if (this.o.e != null) {
                        this.o.e.b.u = str;
                    }
                }
            }
            this.c = null;
            this.g = null;
            this.e = false;
            if (this.d != null) {
                if (this.m) {
                    this.m = false;
                    this.d.a(this);
                }
                this.d.c();
            }
            if (this.n != null) {
                this = this.n;
            } else {
                return;
            }
        }
    }

    final void a(android.support.v4.a.a aVar, Object obj) {
        String str;
        if (this.c != null) {
            if (this.o.e == null) {
                str = null;
            } else {
                String str2 = this.o.e.b.u;
                this.o.e.b.u = "onLoadFinished";
                str = str2;
            }
            try {
                if (ab.a) {
                    StringBuilder append = new StringBuilder("  onLoadFinished in ").append(aVar).append(": ");
                    StringBuilder sb = new StringBuilder(64);
                    android.support.v4.c.a.a(obj, sb);
                    sb.append("}");
                    Log.v("LoaderManager", append.append(sb.toString()).toString());
                }
                aa aaVar = this.c;
                this.f = true;
            } finally {
                if (this.o.e != null) {
                    this.o.e.b.u = str;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        android.support.v4.c.a.a(this.d, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        while (true) {
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
                this.d.a(str + "  ", printWriter);
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
                this = this.n;
                str = str + "  ";
            } else {
                return;
            }
        }
    }
}
