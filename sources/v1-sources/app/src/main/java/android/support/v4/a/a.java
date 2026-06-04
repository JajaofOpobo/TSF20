package android.support.v4.a;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class a {
    int a;
    b b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;

    public final void a(int i, b bVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = bVar;
        this.a = i;
    }

    public final void a(b bVar) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public final void a() {
        this.c = true;
        this.e = false;
        this.d = false;
    }

    public final void b() {
        this.c = false;
    }

    public final void c() {
        this.e = true;
        this.c = false;
        this.d = false;
        this.f = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.c.a.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.c);
        printWriter.print(" mContentChanged=");
        printWriter.print(this.f);
        printWriter.print(" mAbandoned=");
        printWriter.print(this.d);
        printWriter.print(" mReset=");
        printWriter.println(this.e);
    }
}
