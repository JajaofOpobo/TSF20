package com.p060cm.kinfoc;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.AbstractC1132d;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import org.acra.ACRAConstants;
/* renamed from: com.cm.kinfoc.k */
/* loaded from: classes.dex */
public class C1150k {

    /* renamed from: f */
    private C1154l f3638f = new C1154l();

    /* renamed from: g */
    private int f3639g = -1;

    /* renamed from: h */
    private int f3640h = 0;

    /* renamed from: i */
    private String f3641i = null;

    /* renamed from: j */
    private String f3642j = null;

    /* renamed from: k */
    private C1149j f3643k = null;

    /* renamed from: l */
    private volatile boolean f3644l = false;

    /* renamed from: m */
    private final Object f3645m = new Object();

    /* renamed from: n */
    private Timer f3646n = null;

    /* renamed from: o */
    private TimerTask f3647o = null;

    /* renamed from: p */
    private final Object f3648p = new Object();

    /* renamed from: q */
    private int f3649q;

    /* renamed from: e */
    private static C1150k f3637e = null;

    /* renamed from: a */
    public static int f3633a = 3600000;

    /* renamed from: b */
    public static int f3634b = 180000;

    /* renamed from: c */
    public static int f3635c = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;

    /* renamed from: d */
    public static int f3636d = 30;

    /* renamed from: a */
    public static C1150k m9707a() {
        if (f3637e == null) {
            f3637e = new C1150k();
        }
        return f3637e;
    }

    private C1150k() {
        this.f3649q = f3633a;
        int mo9747z = AbstractC1130b.m9785A().mo9747z();
        if (mo9747z != 0) {
            this.f3649q = mo9747z;
        }
    }

    /* renamed from: a */
    public void m9704a(C1149j c1149j, String str, int i, int i2, String str2) {
        this.f3643k = c1149j;
        this.f3639g = i;
        this.f3640h = i2;
        this.f3641i = str2;
        this.f3642j = str;
        if (this.f3643k != null) {
            this.f3643k.m9711a(m9697c());
        }
    }

    /* renamed from: b */
    public void m9700b() {
        if (C1155m.m9667c()) {
            synchronized (this.f3645m) {
                if (!this.f3644l) {
                    final Context applicationContext = AbstractC1130b.m9785A().mo9773b().getApplicationContext();
                    if (C1163o.m9645d(applicationContext)) {
                        AbstractC1132d.m9744a().mo9743a(new AbstractC1132d.InterfaceC1135c() { // from class: com.cm.kinfoc.k.1
                            @Override // com.p060cm.kinfoc.p062a.AbstractC1132d.InterfaceC1135c
                            /* renamed from: a */
                            public void mo9612a(AbstractC1132d.EnumC1133a enumC1133a, boolean z, String str) {
                                if (z) {
                                    C1150k.this.m9705a(applicationContext);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected void m9705a(Context context) {
        if (m9699b(context)) {
            synchronized (this.f3645m) {
                if (!this.f3644l) {
                    AbstractC1130b.m9785A().mo9781a(System.currentTimeMillis());
                    m9691f();
                }
            }
            m9693e();
        }
        m9695d();
    }

    /* renamed from: b */
    private boolean m9699b(Context context) {
        if (System.currentTimeMillis() - AbstractC1130b.m9785A().mo9769d() >= this.f3649q) {
            return true;
        }
        for (int i = 0; i < 1; i++) {
            if (C1171q.m9597e(context, i) >= f3636d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m9695d() {
        if (this.f3646n == null) {
            if (C1171q.f3721a) {
                Log.d("KInfoc", "set batch timer");
            }
            synchronized (this.f3648p) {
                this.f3646n = new Timer();
                this.f3647o = new TimerTask() { // from class: com.cm.kinfoc.k.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        C1150k.this.m9700b();
                    }
                };
                long currentTimeMillis = (this.f3649q - (System.currentTimeMillis() - AbstractC1130b.m9785A().mo9769d())) + f3635c;
                if (currentTimeMillis <= 0) {
                    currentTimeMillis = this.f3649q;
                }
                this.f3646n.schedule(this.f3647o, currentTimeMillis);
            }
        }
    }

    /* renamed from: e */
    private void m9693e() {
        if (C1171q.f3721a) {
            Log.d("KInfoc", "clear batch timer");
        }
        synchronized (this.f3648p) {
            if (this.f3647o != null) {
                this.f3647o.cancel();
                this.f3647o = null;
            }
            if (this.f3646n != null) {
                this.f3646n.purge();
                this.f3646n.cancel();
                this.f3646n = null;
            }
        }
    }

    /* renamed from: c */
    public boolean m9697c() {
        return this.f3649q == f3634b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m9706a(int i) {
        if (this.f3643k == null) {
            return null;
        }
        return this.f3643k.m9713a(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.cm.kinfoc.k$3] */
    /* renamed from: f */
    private void m9691f() {
        synchronized (this.f3645m) {
            this.f3644l = true;
        }
        new Thread() { // from class: com.cm.kinfoc.k.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    Process.setThreadPriority(10);
                    C1154l.m9686a(" BATCH REPORTER STARTED ........");
                    Context applicationContext = AbstractC1130b.m9785A().mo9773b().getApplicationContext();
                    for (int i = 0; i < 1; i++) {
                        File m9608a = C1171q.m9608a(applicationContext, i);
                        if (m9608a != null && (listFiles = m9608a.listFiles()) != null && listFiles.length != 0) {
                            C1154l.m9686a(" -> ICH DIR : " + m9608a.getAbsolutePath());
                            if (C1150k.this.f3638f.m9684a(C1150k.this.m9706a(i), listFiles, C1150k.this.f3642j, C1150k.this.f3639g, C1150k.this.f3641i, C1150k.this.f3640h) == -1) {
                                break;
                            }
                        }
                    }
                    synchronized (C1150k.this.f3645m) {
                        C1150k.this.f3644l = false;
                    }
                } catch (Throwable th) {
                    synchronized (C1150k.this.f3645m) {
                        C1150k.this.f3644l = false;
                        throw th;
                    }
                }
            }
        }.start();
    }
}
