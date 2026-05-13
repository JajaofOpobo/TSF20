package android.support.p002v4.content;

import android.support.p002v4.p009d.C0163c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* renamed from: android.support.v4.content.g */
/* loaded from: classes.dex */
public class C0156g<D> {

    /* renamed from: a */
    int f418a;

    /* renamed from: b */
    InterfaceC0158b<D> f419b;

    /* renamed from: c */
    InterfaceC0157a<D> f420c;

    /* renamed from: d */
    boolean f421d;

    /* renamed from: e */
    boolean f422e;

    /* renamed from: f */
    boolean f423f;

    /* renamed from: g */
    boolean f424g;

    /* renamed from: h */
    boolean f425h;

    /* renamed from: android.support.v4.content.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0157a<D> {
    }

    /* renamed from: android.support.v4.content.g$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0158b<D> {
    }

    /* renamed from: a */
    public void m13392a(int i, InterfaceC0158b<D> interfaceC0158b) {
        if (this.f419b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f419b = interfaceC0158b;
        this.f418a = i;
    }

    /* renamed from: a */
    public void m13390a(InterfaceC0158b<D> interfaceC0158b) {
        if (this.f419b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f419b != interfaceC0158b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f419b = null;
    }

    /* renamed from: a */
    public void m13391a(InterfaceC0157a<D> interfaceC0157a) {
        if (this.f420c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f420c = interfaceC0157a;
    }

    /* renamed from: b */
    public void m13386b(InterfaceC0157a<D> interfaceC0157a) {
        if (this.f420c == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f420c != interfaceC0157a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f420c = null;
    }

    /* renamed from: a */
    public final void m13393a() {
        this.f421d = true;
        this.f423f = false;
        this.f422e = false;
        m13387b();
    }

    /* renamed from: b */
    protected void m13387b() {
    }

    /* renamed from: c */
    public void m13385c() {
        this.f421d = false;
        m13384d();
    }

    /* renamed from: d */
    protected void m13384d() {
    }

    /* renamed from: e */
    public void m13383e() {
        m13382f();
        this.f423f = true;
        this.f421d = false;
        this.f422e = false;
        this.f424g = false;
        this.f425h = false;
    }

    /* renamed from: f */
    protected void m13382f() {
    }

    /* renamed from: a */
    public String m13389a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0163c.m13371a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0163c.m13371a(this, sb);
        sb.append(" id=");
        sb.append(this.f418a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void m13388a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f418a);
        printWriter.print(" mListener=");
        printWriter.println(this.f419b);
        if (this.f421d || this.f424g || this.f425h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f421d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f424g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f425h);
        }
        if (this.f422e || this.f423f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f422e);
            printWriter.print(" mReset=");
            printWriter.println(this.f423f);
        }
    }
}
