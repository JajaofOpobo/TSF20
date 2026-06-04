package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
final class ab extends z {
    static boolean a = false;
    final android.support.v4.c.c b;
    final android.support.v4.c.c c;
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    final void a(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
    }

    final void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f = true;
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            ac acVar = (ac) this.b.b(a2);
            if (acVar.i && acVar.j) {
                acVar.h = true;
            } else if (acVar.h) {
                continue;
            } else {
                acVar.h = true;
                if (a) {
                    Log.v("LoaderManager", "  Starting: " + acVar);
                }
                if (acVar.d == null && acVar.c != null) {
                    aa aaVar = acVar.c;
                    int i = acVar.a;
                    Bundle bundle = acVar.b;
                    acVar.d = aaVar.a();
                }
                if (acVar.d == null) {
                    continue;
                } else {
                    if (acVar.d.getClass().isMemberClass() && !Modifier.isStatic(acVar.d.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + acVar.d);
                    }
                    if (!acVar.m) {
                        acVar.d.a(acVar.a, acVar);
                        acVar.m = true;
                    }
                    acVar.d.a();
                }
            }
        }
    }

    final void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
                ((ac) this.b.b(a2)).a();
            }
            this.f = false;
        }
    }

    final void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.g = true;
        this.f = false;
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            ac acVar = (ac) this.b.b(a2);
            if (a) {
                Log.v("LoaderManager", "  Retaining: " + acVar);
            }
            acVar.i = true;
            acVar.j = acVar.h;
            acVar.h = false;
            acVar.c = null;
        }
    }

    final void e() {
        if (this.g) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.g = false;
            for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
                ac acVar = (ac) this.b.b(a2);
                if (acVar.i) {
                    if (a) {
                        Log.v("LoaderManager", "  Finished Retaining: " + acVar);
                    }
                    acVar.i = false;
                    if (acVar.h != acVar.j && !acVar.h) {
                        acVar.a();
                    }
                }
                if (acVar.h && acVar.e && !acVar.k) {
                    acVar.a(acVar.d, acVar.g);
                }
            }
        }
    }

    final void f() {
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            ((ac) this.b.b(a2)).k = true;
        }
    }

    final void g() {
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            ac acVar = (ac) this.b.b(a2);
            if (acVar.h && acVar.k) {
                acVar.k = false;
                if (acVar.e) {
                    acVar.a(acVar.d, acVar.g);
                }
            }
        }
    }

    final void h() {
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
                ((ac) this.b.b(a2)).b();
            }
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int a3 = this.c.a() - 1; a3 >= 0; a3--) {
            ((ac) this.c.b(a3)).b();
        }
        this.c.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.c.a.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        if (this.b.a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.b.a(); i++) {
                ac acVar = (ac) this.b.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(acVar.toString());
                acVar.a(str2, printWriter);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.a(); i2++) {
                ac acVar2 = (ac) this.c.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i2));
                printWriter.print(": ");
                printWriter.println(acVar2.toString());
                acVar2.a(str3, printWriter);
            }
        }
    }

    @Override // android.support.v4.app.z
    public final boolean a() {
        int a2 = this.b.a();
        boolean z = false;
        for (int i = 0; i < a2; i++) {
            ac acVar = (ac) this.b.b(i);
            z |= acVar.h && !acVar.f;
        }
        return z;
    }
}
