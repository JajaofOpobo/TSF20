package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class n<E> extends l {
    private final Activity a;
    final Context b;
    final int c;
    final p d;
    private final Handler e;
    private android.support.v4.d.h<String, v> f;
    private boolean g;
    private w h;
    private boolean i;
    private boolean j;

    n(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.a, 0);
    }

    n(Activity activity, Context context, Handler handler, int i) {
        this.d = new p();
        this.a = activity;
        this.b = context;
        this.e = handler;
        this.c = i;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean a(Fragment fragment) {
        return true;
    }

    public LayoutInflater b() {
        return (LayoutInflater) this.b.getSystemService("layout_inflater");
    }

    public void c() {
    }

    public void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return this.c;
    }

    @Override // android.support.v4.app.l
    public View a(int i) {
        return null;
    }

    @Override // android.support.v4.app.l
    public boolean a() {
        return true;
    }

    Activity f() {
        return this.a;
    }

    Context g() {
        return this.b;
    }

    Handler h() {
        return this.e;
    }

    p i() {
        return this.d;
    }

    void a(String str) {
        w wVar;
        if (this.f != null && (wVar = (w) this.f.get(str)) != null && !wVar.f) {
            wVar.h();
            this.f.remove(str);
        }
    }

    void b(Fragment fragment) {
    }

    boolean j() {
        return this.g;
    }

    void k() {
        if (!this.j) {
            this.j = true;
            if (this.h != null) {
                this.h.b();
            } else if (!this.i) {
                this.h = a("(root)", this.j, false);
                if (this.h != null && !this.h.e) {
                    this.h.b();
                }
            }
            this.i = true;
        }
    }

    void a(boolean z) {
        this.g = z;
        if (this.h != null && this.j) {
            this.j = false;
            if (z) {
                this.h.d();
            } else {
                this.h.c();
            }
        }
    }

    void l() {
        if (this.h != null) {
            this.h.h();
        }
    }

    void m() {
        if (this.f != null) {
            int size = this.f.size();
            w[] wVarArr = new w[size];
            for (int i = size - 1; i >= 0; i--) {
                wVarArr[i] = (w) this.f.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                w wVar = wVarArr[i2];
                wVar.e();
                wVar.g();
            }
        }
    }

    w a(String str, boolean z, boolean z2) {
        if (this.f == null) {
            this.f = new android.support.v4.d.h<>();
        }
        w wVar = (w) this.f.get(str);
        if (wVar == null) {
            if (z2) {
                w wVar2 = new w(str, this, z);
                this.f.put(str, wVar2);
                return wVar2;
            }
            return wVar;
        }
        wVar.a(this);
        return wVar;
    }

    android.support.v4.d.h<String, v> n() {
        boolean z;
        if (this.f != null) {
            int size = this.f.size();
            w[] wVarArr = new w[size];
            for (int i = size - 1; i >= 0; i--) {
                wVarArr[i] = (w) this.f.c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                w wVar = wVarArr[i2];
                if (wVar.f) {
                    z = true;
                } else {
                    wVar.h();
                    this.f.remove(wVar.d);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return this.f;
        }
        return null;
    }

    void a(android.support.v4.d.h<String, v> hVar) {
        this.f = hVar;
    }

    void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
            printWriter.println(":");
            this.h.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
