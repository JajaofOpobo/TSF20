package android.support.v4.a;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c {
    int a;
    d b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;

    public void a(int i, d dVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = dVar;
        this.a = i;
    }

    public void a(d dVar) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != dVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public final void a() {
        this.c = true;
        this.e = false;
        this.d = false;
        b();
    }

    protected void b() {
    }

    public void c() {
        this.c = false;
        d();
    }

    protected void d() {
    }

    public void e() {
        f();
        this.e = true;
        this.c = false;
        this.d = false;
        this.f = false;
        this.g = false;
    }

    protected void f() {
    }

    public String a(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.f.c.a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.f.c.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.c || this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.g);
        }
        if (this.d || this.e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.d);
            printWriter.print(" mReset=");
            printWriter.println(this.e);
        }
    }
}
