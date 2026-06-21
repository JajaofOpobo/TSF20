package android.support.v4.app;

import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class x extends v {
    static boolean a = false;
    final android.support.v4.f.m b = new android.support.v4.f.m();
    final android.support.v4.f.m c = new android.support.v4.f.m();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    x(String str, FragmentActivity fragmentActivity, boolean z) {
        this.d = str;
        this.e = fragmentActivity;
        this.f = z;
    }

    void a(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
    }

    void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.f = true;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((y) this.b.b(b)).a();
            }
        }
    }

    void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((y) this.b.b(b)).e();
            }
            this.f = false;
        }
    }

    void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
        } else {
            this.g = true;
            this.f = false;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((y) this.b.b(b)).b();
            }
        }
    }

    void e() {
        if (this.g) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.g = false;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((y) this.b.b(b)).c();
            }
        }
    }

    void f() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((y) this.b.b(b)).k = true;
        }
    }

    void g() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((y) this.b.b(b)).d();
        }
    }

    void h() {
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((y) this.b.b(b)).f();
            }
            this.b.c();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int b2 = this.c.b() - 1; b2 >= 0; b2--) {
            ((y) this.c.b(b2)).f();
        }
        this.c.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.f.c.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = String.valueOf(str) + "    ";
            for (int i = 0; i < this.b.b(); i++) {
                y yVar = (y) this.b.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(yVar.toString());
                yVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = String.valueOf(str) + "    ";
            for (int i2 = 0; i2 < this.c.b(); i2++) {
                y yVar2 = (y) this.c.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i2));
                printWriter.print(": ");
                printWriter.println(yVar2.toString());
                yVar2.a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.v
    public boolean a() {
        int b = this.b.b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            y yVar = (y) this.b.b(i);
            z |= yVar.h && !yVar.f;
        }
        return z;
    }
}
