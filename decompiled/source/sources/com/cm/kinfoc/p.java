package com.cm.kinfoc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.cm.kinfoc.a.d;
import com.cm.kinfoc.c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class p {
    private static boolean c = false;
    public j a;
    private Context d;
    private h j;
    private Handler q;
    private boolean e = true;
    private long f = 0;
    private boolean g = true;
    private volatile boolean h = false;
    private Object i = new Object();
    c.a b = new c.a() { // from class: com.cm.kinfoc.p.1
        @Override // com.cm.kinfoc.c.a
        public void a(long j, g gVar) {
            if (q.a) {
                Log.i("KInfoc", "Post successed, server Priority: " + gVar.f() + ", table: " + gVar.b() + ", last time: " + j);
            }
            if (gVar != null) {
                if (!gVar.c() && gVar.h() != null) {
                    Iterator<String> it = gVar.h().iterator();
                    while (it.hasNext()) {
                        File file = new File(it.next());
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                }
                long d = gVar.d();
                if (d > 0 && p.this.e && gVar.a() != null && gVar.f() != -1) {
                    p.this.a(gVar.b(), gVar.c(), d, false, gVar.f());
                }
                if (d > 0 && p.this.e && !TextUtils.isEmpty(gVar.e())) {
                    p.this.a(gVar.b(), gVar.c(), d, true, -1);
                }
            }
        }

        @Override // com.cm.kinfoc.c.a
        public void a(g gVar) {
            if (q.a) {
                Log.i("KInfoc", "Post failed, server Priority: " + gVar.f() + ", table: " + gVar.b());
            }
            if (gVar != null && gVar.d() == 0 && p.this.e && gVar.c()) {
                if (gVar.a() != null && gVar.f() != -1) {
                    p.this.a(gVar.a(), gVar.b(), gVar.c(), false, gVar.f());
                }
                if (!TextUtils.isEmpty(gVar.e())) {
                    p.this.a(gVar.e().getBytes(), gVar.b(), gVar.c(), true, -1);
                }
            }
        }
    };
    private int k = 20000;
    private IntentFilter l = null;
    private IntentFilter m = null;
    private Intent n = null;
    private PendingIntent o = null;
    private AlarmManager p = null;
    private BroadcastReceiver r = new BroadcastReceiver() { // from class: com.cm.kinfoc.p.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && p.this.q != null) {
                p.this.q.postDelayed(p.this.t, p.this.f());
            }
        }
    };
    private BroadcastReceiver s = new BroadcastReceiver() { // from class: com.cm.kinfoc.p.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.ijinshan.common.kinfoc.ActivityTimer") && p.this.q != null) {
                if (p.c) {
                    p.this.a("REPORT=" + System.currentTimeMillis());
                }
                p.this.q.post(p.this.t);
            }
        }
    };
    private Runnable t = new Runnable() { // from class: com.cm.kinfoc.p.4
        private Boolean b = false;
        private final Object c = new Object();

        /* JADX WARN: Type inference failed for: r0v6, types: [com.cm.kinfoc.p$4$1] */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.c) {
                if (!this.b.booleanValue()) {
                    if (q.a) {
                        Log.i("KInfoc", "Auto Post");
                    }
                    this.b = true;
                    new Thread() { // from class: com.cm.kinfoc.p.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            p.this.a();
                            m.a().e();
                            AnonymousClass4.this.b = false;
                        }
                    }.start();
                }
            }
        }
    };

    public void a() {
        if (!this.h && b() && o.e(this.d)) {
            com.cm.kinfoc.a.d.a().a(new d.c() { // from class: com.cm.kinfoc.p.5
                @Override // com.cm.kinfoc.a.d.c
                public void a(d.a aVar, boolean z, String str) {
                    if (z) {
                        try {
                            synchronized (p.this.i) {
                                if (p.this.h) {
                                    return;
                                }
                                p.this.h = true;
                                if (q.b(p.this.d) == null) {
                                    return;
                                }
                                for (int i = 0; i < 1; i++) {
                                    p.this.a(true, false, i);
                                    p.this.b(true, false, i);
                                    p.this.b(false, false, i);
                                }
                            }
                        } finally {
                            p.this.h = false;
                        }
                    }
                }
            });
        }
    }

    public p(Context context, j jVar) {
        this.d = null;
        this.a = null;
        this.j = null;
        this.q = null;
        if (jVar != null) {
            this.a = jVar;
        }
        if (context != null) {
            this.d = context;
            this.q = new Handler(context.getMainLooper());
        }
        this.j = new h();
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(byte[] bArr, String str, boolean z, i iVar) {
        a(bArr, str, z, 0L, iVar, (ArrayList<String>) null);
    }

    public void a(byte[] bArr, String str, boolean z, long j, i iVar, ArrayList<String> arrayList) {
        if (this.d != null && str != null && bArr != null) {
            if (o.e(this.d)) {
                g gVar = new g();
                gVar.a(bArr);
                gVar.a(str);
                gVar.a(z);
                gVar.a(j);
                gVar.a(iVar);
                gVar.a(arrayList);
                if (z) {
                    if (q.a) {
                        Log.d("KInfoc", "Post data via network.");
                    }
                    gVar.a(0);
                    this.j.a(gVar, this.a.c(), this.b);
                } else if (o.d(this.d)) {
                    if (q.a) {
                        Log.d("KInfoc", "Post data via Wifi.");
                    }
                    gVar.a(0);
                    this.j.a(gVar, this.a.a(0), this.b);
                }
            } else if (j == 0 && this.e && z) {
                a(bArr, str, z, false, 0);
            }
        }
    }

    private void a(byte[] bArr, String str, boolean z, long j, i iVar, int i) {
        if (this.d != null && str != null && bArr != null && o.e(this.d)) {
            g gVar = new g();
            gVar.a(bArr);
            gVar.a(str);
            gVar.a(z);
            gVar.a(j);
            gVar.a(iVar);
            if (z) {
                if (q.a) {
                    Log.d("KInfoc", "Post data via network.");
                }
                q.a("post cache on " + this.a.c() + " table name: " + gVar.b() + " cache time: " + Long.toString(gVar.d()));
                gVar.a(i);
                this.j.b(gVar, this.a.c(), this.b);
            } else if (o.d(this.d)) {
                if (q.a) {
                    Log.d("KInfoc", "Post data via Wifi.");
                }
                q.a("post cache on " + this.a.a(i) + " table name: " + gVar.b() + " cache time: " + Long.toString(gVar.d()));
                gVar.a(i);
                this.j.b(gVar, this.a.a(i), this.b);
            }
        }
    }

    public boolean a(String str, int i, String str2, byte[] bArr, String str3, boolean z, int i2) {
        return a(bArr, q.b(this.d, str, i, str2), str3, z, i2);
    }

    public boolean a(byte[] bArr, int i, String str, boolean z, int i2) {
        File g;
        int length;
        boolean z2;
        if (z) {
            g = q.f(this.d, i2);
        } else {
            g = q.g(this.d, i2);
        }
        if (g != null && i >= 0 && i <= bArr.length && (length = bArr.length - i) > 0) {
            ByteBuffer allocate = ByteBuffer.allocate(length);
            for (int i3 = i; i3 < bArr.length; i3++) {
                allocate.put(bArr[i3]);
            }
            if (q.a) {
                Log.d("KInfoc", "SAVE ICH : ALL=" + bArr.length + " startOffset=" + i + " HL=" + i + " DL=" + allocate.array().length);
            }
            try {
                z2 = new e(this.d).a(g.getAbsolutePath(), str + '_' + System.currentTimeMillis() + ".ich", allocate.array());
            } catch (IOException e) {
                e.printStackTrace();
                z2 = false;
            }
            return z2;
        }
        return false;
    }

    public boolean a(byte[] bArr, String str, boolean z, boolean z2, int i) {
        File g;
        if (z) {
            g = q.f(this.d, i);
        } else {
            g = q.g(this.d, i);
        }
        if (g == null) {
            return false;
        }
        try {
            return new e(this.d).a(g.getAbsolutePath(), str + '_' + System.currentTimeMillis() + ".ich", bArr);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2, int i) {
        File a;
        File[] listFiles;
        int lastIndexOf;
        long j;
        if (this.d != null) {
            try {
                if (z) {
                    a = q.b(this.d, i);
                } else {
                    a = q.a(this.d, i);
                }
                if (a != null && (listFiles = a.listFiles()) != null) {
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (q.a) {
                            Log.d("KInfoc", "Post cache " + (i2 + 1));
                        }
                        String name = listFiles[i2].getName();
                        if (listFiles[i2].isFile() && name.endsWith(".ich") && (lastIndexOf = name.lastIndexOf(95)) != -1) {
                            String substring = name.substring(0, lastIndexOf);
                            try {
                                j = Long.parseLong(name.substring(lastIndexOf + 1, name.length() - 4));
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                j = 0;
                            }
                            if (!this.g) {
                                listFiles[i2].delete();
                            } else if (this.f > 0 && q.a(j) >= this.f) {
                                listFiles[i2].delete();
                            } else {
                                byte[] a2 = e.a(listFiles[i2]);
                                if (a2 != null && !z2) {
                                    a(a2, substring, z, j, (i) null, i);
                                }
                                Thread.sleep(1000L);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2, int i) {
        File h;
        File[] listFiles;
        int lastIndexOf;
        long j;
        if (this.d != null) {
            try {
                if (z) {
                    h = q.i(this.d, i);
                } else {
                    h = q.h(this.d, i);
                }
                if (h != null && (listFiles = h.listFiles()) != null) {
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (q.a) {
                            Log.d("KInfoc", "Post cache " + (i2 + 1));
                        }
                        String name = listFiles[i2].getName();
                        if (listFiles[i2].isFile() && name.endsWith(".ich") && (lastIndexOf = name.lastIndexOf(95)) != -1) {
                            String substring = name.substring(0, lastIndexOf);
                            try {
                                j = Long.parseLong(name.substring(lastIndexOf + 1, name.length() - 4));
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                j = 0;
                            }
                            if (!this.g) {
                                listFiles[i2].delete();
                            } else if (this.f > 0 && q.a(j) >= this.f) {
                                listFiles[i2].delete();
                            } else {
                                byte[] a = e.a(listFiles[i2]);
                                if (a != null && !z2) {
                                    a(a, substring, z, j, (i) null, i);
                                }
                                Thread.sleep(1000L);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(String str, boolean z, long j, boolean z2, int i) {
        File a;
        if (this.d != null) {
            if (z) {
                a = q.b(this.d, i);
            } else {
                a = q.a(this.d, i);
            }
            if (a != null) {
                f.a(a.getAbsolutePath() + File.separatorChar + str + '_' + j + ".ich");
            }
        }
    }

    public boolean b() {
        return this.e;
    }

    public void a(long j) {
        this.f = j;
    }

    public void c() {
        if (this.d != null) {
            try {
                this.l = new IntentFilter();
                this.l.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.d.registerReceiver(this.r, this.l);
                this.m = new IntentFilter();
                this.m.addAction("com.ijinshan.common.kinfoc.ActivityTimer");
                this.d.registerReceiver(this.s, this.m);
                this.n = new Intent();
                this.n.setAction("com.ijinshan.common.kinfoc.ActivityTimer");
                this.o = PendingIntent.getBroadcast(this.d, 0, this.n, 0);
                this.p = (AlarmManager) this.d.getSystemService("alarm");
                long d = d();
                long e = e();
                if (c) {
                    a("INIT  =" + System.currentTimeMillis() + " DELAY =" + d + " REPEAT : " + e);
                }
                this.p.setRepeating(1, d + System.currentTimeMillis(), e, this.o);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(String str) {
        com.cm.kinfoc.a.b.A().a(str + "\n", new File("/sdcard/act.log"), true);
    }

    public long d() {
        return 20000L;
    }

    public long e() {
        return com.cm.kinfoc.a.b.A().a(10800, 18000) * 1000;
    }

    public int f() {
        return this.k + (com.cm.kinfoc.a.b.A().a(100) * 100);
    }
}
