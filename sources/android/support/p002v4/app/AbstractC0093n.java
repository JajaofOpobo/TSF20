package android.support.p002v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v4.p009d.C0173h;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* renamed from: android.support.v4.app.n */
/* loaded from: classes.dex */
public abstract class AbstractC0093n<E> extends AbstractC0091l {

    /* renamed from: a */
    private final Activity f283a;

    /* renamed from: b */
    final Context f284b;

    /* renamed from: c */
    final int f285c;

    /* renamed from: d */
    final C0096p f286d;

    /* renamed from: e */
    private final Handler f287e;

    /* renamed from: f */
    private C0173h<String, AbstractC0117v> f288f;

    /* renamed from: g */
    private boolean f289g;

    /* renamed from: h */
    private C0119w f290h;

    /* renamed from: i */
    private boolean f291i;

    /* renamed from: j */
    private boolean f292j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0093n(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.f171a, 0);
    }

    AbstractC0093n(Activity activity, Context context, Handler handler, int i) {
        this.f286d = new C0096p();
        this.f283a = activity;
        this.f284b = context;
        this.f287e = handler;
        this.f285c = i;
    }

    /* renamed from: a */
    public void mo13588a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo13592a(Fragment fragment) {
        return true;
    }

    /* renamed from: b */
    public LayoutInflater mo13585b() {
        return (LayoutInflater) this.f284b.getSystemService("layout_inflater");
    }

    /* renamed from: c */
    public void mo13582c() {
    }

    /* renamed from: a */
    public void mo13591a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f284b.startActivity(intent);
    }

    /* renamed from: d */
    public boolean mo13581d() {
        return true;
    }

    /* renamed from: e */
    public int mo13580e() {
        return this.f285c;
    }

    @Override // android.support.p002v4.app.AbstractC0091l
    /* renamed from: a */
    public View mo13593a(int i) {
        return null;
    }

    @Override // android.support.p002v4.app.AbstractC0091l
    /* renamed from: a */
    public boolean mo13594a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity m13579f() {
        return this.f283a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Context m13578g() {
        return this.f284b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler m13577h() {
        return this.f287e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0096p m13576i() {
        return this.f286d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13589a(String str) {
        C0119w c0119w;
        if (this.f288f != null && (c0119w = (C0119w) this.f288f.get(str)) != null && !c0119w.f383f) {
            c0119w.m13448h();
            this.f288f.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13584b(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m13575j() {
        return this.f289g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m13574k() {
        if (!this.f292j) {
            this.f292j = true;
            if (this.f290h != null) {
                this.f290h.m13454b();
            } else if (!this.f291i) {
                this.f290h = m13587a("(root)", this.f292j, false);
                if (this.f290h != null && !this.f290h.f382e) {
                    this.f290h.m13454b();
                }
            }
            this.f291i = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13586a(boolean z) {
        this.f289g = z;
        if (this.f290h != null && this.f292j) {
            this.f292j = false;
            if (z) {
                this.f290h.m13452d();
            } else {
                this.f290h.m13453c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m13573l() {
        if (this.f290h != null) {
            this.f290h.m13448h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m13572m() {
        if (this.f288f != null) {
            int size = this.f288f.size();
            C0119w[] c0119wArr = new C0119w[size];
            for (int i = size - 1; i >= 0; i--) {
                c0119wArr[i] = (C0119w) this.f288f.m13326c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0119w c0119w = c0119wArr[i2];
                c0119w.m13451e();
                c0119w.m13449g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0119w m13587a(String str, boolean z, boolean z2) {
        if (this.f288f == null) {
            this.f288f = new C0173h<>();
        }
        C0119w c0119w = (C0119w) this.f288f.get(str);
        if (c0119w == null) {
            if (z2) {
                C0119w c0119w2 = new C0119w(str, this, z);
                this.f288f.put(str, c0119w2);
                return c0119w2;
            }
            return c0119w;
        }
        c0119w.m13457a(this);
        return c0119w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C0173h<String, AbstractC0117v> m13571n() {
        boolean z;
        if (this.f288f != null) {
            int size = this.f288f.size();
            C0119w[] c0119wArr = new C0119w[size];
            for (int i = size - 1; i >= 0; i--) {
                c0119wArr[i] = (C0119w) this.f288f.m13326c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0119w c0119w = c0119wArr[i2];
                if (c0119w.f383f) {
                    z = true;
                } else {
                    c0119w.m13448h();
                    this.f288f.remove(c0119w.f381d);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return this.f288f;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13590a(C0173h<String, AbstractC0117v> c0173h) {
        this.f288f = c0173h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13583b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f292j);
        if (this.f290h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f290h)));
            printWriter.println(":");
            this.f290h.m13455a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
