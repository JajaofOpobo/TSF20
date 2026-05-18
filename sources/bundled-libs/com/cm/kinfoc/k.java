package com.cm.kinfoc;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.cm.kinfoc.a.d;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k {
    private l f = new l();
    private int g = -1;
    private int h = 0;
    private String i = null;
    private String j = null;
    private j k = null;
    private volatile boolean l = false;
    private final Object m = new Object();
    private Timer n = null;
    private TimerTask o = null;
    private final Object p = new Object();
    private int q;
    private static k e = null;
    public static int a = 3600000;
    public static int b = 180000;
    public static int c = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;
    public static int d = 30;

    public static k a() {
        if (e == null) {
            e = new k();
        }
        return e;
    }

    private k() {
        this.q = a;
        int iZ = com.cm.kinfoc.a.b.A().z();
        if (iZ != 0) {
            this.q = iZ;
        }
    }

    public void a(j jVar, String str, int i, int i2, String str2) {
        this.k = jVar;
        this.g = i;
        this.h = i2;
        this.i = str2;
        this.j = str;
        if (this.k != null) {
            this.k.a(c());
        }
    }

    public void b() {
        if (m.c()) {
            synchronized (this.m) {
                if (!this.l) {
                    final Context applicationContext = com.cm.kinfoc.a.b.A().b().getApplicationContext();
                    if (o.d(applicationContext)) {
                        com.cm.kinfoc.a.d.a().a(new d.c() { // from class: com.cm.kinfoc.k.1
                            @Override // com.cm.kinfoc.a.d.c
                            public void a(d.a aVar, boolean z, String str) {
                                if (z) {
                                    k.this.a(applicationContext);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    protected void a(Context context) {
        if (b(context)) {
            synchronized (this.m) {
                if (!this.l) {
                    com.cm.kinfoc.a.b.A().a(System.currentTimeMillis());
                    f();
                }
            }
            e();
        }
        d();
    }

    private boolean b(Context context) {
        if (System.currentTimeMillis() - com.cm.kinfoc.a.b.A().d() >= this.q) {
            return true;
        }
        for (int i = 0; i < 1; i++) {
            if (q.e(context, i) >= d) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        if (this.n == null) {
            if (q.a) {
                Log.d("KInfoc", "set batch timer");
            }
            synchronized (this.p) {
                this.n = new Timer();
                this.o = new TimerTask() { // from class: com.cm.kinfoc.k.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        k.this.b();
                    }
                };
                long jCurrentTimeMillis = (((long) this.q) - (System.currentTimeMillis() - com.cm.kinfoc.a.b.A().d())) + ((long) c);
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = this.q;
                }
                this.n.schedule(this.o, jCurrentTimeMillis);
            }
        }
    }

    private void e() {
        if (q.a) {
            Log.d("KInfoc", "clear batch timer");
        }
        synchronized (this.p) {
            if (this.o != null) {
                this.o.cancel();
                this.o = null;
            }
            if (this.n != null) {
                this.n.purge();
                this.n.cancel();
                this.n = null;
            }
        }
    }

    public boolean c() {
        return this.q == b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i) {
        if (this.k == null) {
            return null;
        }
        return this.k.a(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.cm.kinfoc.k$3] */
    private void f() {
        synchronized (this.m) {
            this.l = true;
        }
        new Thread() { // from class: com.cm.kinfoc.k.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    Process.setThreadPriority(10);
                    l.a(" BATCH REPORTER STARTED ........");
                    Context applicationContext = com.cm.kinfoc.a.b.A().b().getApplicationContext();
                    for (int i = 0; i < 1; i++) {
                        File fileA = q.a(applicationContext, i);
                        if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null && fileArrListFiles.length != 0) {
                            l.a(" -> ICH DIR : " + fileA.getAbsolutePath());
                            if (k.this.f.a(k.this.a(i), fileArrListFiles, k.this.j, k.this.g, k.this.i, k.this.h) == -1) {
                                break;
                            }
                        }
                    }
                    synchronized (k.this.m) {
                        k.this.l = false;
                    }
                } catch (Throwable th) {
                    synchronized (k.this.m) {
                        k.this.l = false;
                        throw th;
                    }
                }
            }
        }.start();
    }
}
