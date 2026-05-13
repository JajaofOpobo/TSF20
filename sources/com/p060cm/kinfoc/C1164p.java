package com.p060cm.kinfoc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.p060cm.kinfoc.InterfaceC1138c;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.AbstractC1132d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.cm.kinfoc.p */
/* loaded from: classes.dex */
public class C1164p {

    /* renamed from: c */
    private static boolean f3693c = false;

    /* renamed from: a */
    public C1149j f3694a;

    /* renamed from: d */
    private Context f3696d;

    /* renamed from: j */
    private C1145h f3702j;

    /* renamed from: q */
    private Handler f3709q;

    /* renamed from: e */
    private boolean f3697e = true;

    /* renamed from: f */
    private long f3698f = 0;

    /* renamed from: g */
    private boolean f3699g = true;

    /* renamed from: h */
    private volatile boolean f3700h = false;

    /* renamed from: i */
    private Object f3701i = new Object();

    /* renamed from: b */
    InterfaceC1138c.InterfaceC1139a f3695b = new InterfaceC1138c.InterfaceC1139a() { // from class: com.cm.kinfoc.p.1
        @Override // com.p060cm.kinfoc.InterfaceC1138c.InterfaceC1139a
        /* renamed from: a */
        public void mo9615a(long j, C1144g c1144g) {
            if (C1171q.f3721a) {
                Log.i("KInfoc", "Post successed, server Priority: " + c1144g.m9721f() + ", table: " + c1144g.m9725b() + ", last time: " + j);
            }
            if (c1144g != null) {
                if (!c1144g.m9724c() && c1144g.m9719h() != null) {
                    Iterator<String> it = c1144g.m9719h().iterator();
                    while (it.hasNext()) {
                        File file = new File(it.next());
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                }
                long m9723d = c1144g.m9723d();
                if (m9723d > 0 && C1164p.this.f3697e && c1144g.m9733a() != null && c1144g.m9721f() != -1) {
                    C1164p.this.m9636a(c1144g.m9725b(), c1144g.m9724c(), m9723d, false, c1144g.m9721f());
                }
                if (m9723d > 0 && C1164p.this.f3697e && !TextUtils.isEmpty(c1144g.m9722e())) {
                    C1164p.this.m9636a(c1144g.m9725b(), c1144g.m9724c(), m9723d, true, -1);
                }
            }
        }

        @Override // com.p060cm.kinfoc.InterfaceC1138c.InterfaceC1139a
        /* renamed from: a */
        public void mo9614a(C1144g c1144g) {
            if (C1171q.f3721a) {
                Log.i("KInfoc", "Post failed, server Priority: " + c1144g.m9721f() + ", table: " + c1144g.m9725b());
            }
            if (c1144g != null && c1144g.m9723d() == 0 && C1164p.this.f3697e && c1144g.m9724c()) {
                if (c1144g.m9733a() != null && c1144g.m9721f() != -1) {
                    C1164p.this.m9629a(c1144g.m9733a(), c1144g.m9725b(), c1144g.m9724c(), false, c1144g.m9721f());
                }
                if (!TextUtils.isEmpty(c1144g.m9722e())) {
                    C1164p.this.m9629a(c1144g.m9722e().getBytes(), c1144g.m9725b(), c1144g.m9724c(), true, -1);
                }
            }
        }
    };

    /* renamed from: k */
    private int f3703k = 20000;

    /* renamed from: l */
    private IntentFilter f3704l = null;

    /* renamed from: m */
    private IntentFilter f3705m = null;

    /* renamed from: n */
    private Intent f3706n = null;

    /* renamed from: o */
    private PendingIntent f3707o = null;

    /* renamed from: p */
    private AlarmManager f3708p = null;

    /* renamed from: r */
    private BroadcastReceiver f3710r = new BroadcastReceiver() { // from class: com.cm.kinfoc.p.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && C1164p.this.f3709q != null) {
                C1164p.this.f3709q.postDelayed(C1164p.this.f3712t, C1164p.this.m9618f());
            }
        }
    };

    /* renamed from: s */
    private BroadcastReceiver f3711s = new BroadcastReceiver() { // from class: com.cm.kinfoc.p.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.ijinshan.common.kinfoc.ActivityTimer") && C1164p.this.f3709q != null) {
                if (C1164p.f3693c) {
                    C1164p.this.m9638a("REPORT=" + System.currentTimeMillis());
                }
                C1164p.this.f3709q.post(C1164p.this.f3712t);
            }
        }
    };

    /* renamed from: t */
    private Runnable f3712t = new Runnable() { // from class: com.cm.kinfoc.p.4

        /* renamed from: b */
        private Boolean f3717b = false;

        /* renamed from: c */
        private final Object f3718c = new Object();

        /* JADX WARN: Type inference failed for: r0v6, types: [com.cm.kinfoc.p$4$1] */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3718c) {
                if (!this.f3717b.booleanValue()) {
                    if (C1171q.f3721a) {
                        Log.i("KInfoc", "Auto Post");
                    }
                    this.f3717b = true;
                    new Thread() { // from class: com.cm.kinfoc.p.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            C1164p.this.m9643a();
                            C1155m.m9678a().m9662e();
                            RunnableC11684.this.f3717b = false;
                        }
                    }.start();
                }
            }
        }
    };

    /* renamed from: a */
    public void m9643a() {
        if (!this.f3700h && m9628b() && C1163o.m9644e(this.f3696d)) {
            AbstractC1132d.m9744a().mo9743a(new AbstractC1132d.InterfaceC1135c() { // from class: com.cm.kinfoc.p.5
                @Override // com.p060cm.kinfoc.p062a.AbstractC1132d.InterfaceC1135c
                /* renamed from: a */
                public void mo9612a(AbstractC1132d.EnumC1133a enumC1133a, boolean z, String str) {
                    if (z) {
                        try {
                            synchronized (C1164p.this.f3701i) {
                                if (C1164p.this.f3700h) {
                                    return;
                                }
                                C1164p.this.f3700h = true;
                                if (C1171q.m9602b(C1164p.this.f3696d) == null) {
                                    return;
                                }
                                for (int i = 0; i < 1; i++) {
                                    C1164p.this.m9634a(true, false, i);
                                    C1164p.this.m9625b(true, false, i);
                                    C1164p.this.m9625b(false, false, i);
                                }
                            }
                        } finally {
                            C1164p.this.f3700h = false;
                        }
                    }
                }
            });
        }
    }

    public C1164p(Context context, C1149j c1149j) {
        this.f3696d = null;
        this.f3694a = null;
        this.f3702j = null;
        this.f3709q = null;
        if (c1149j != null) {
            this.f3694a = c1149j;
        }
        if (context != null) {
            this.f3696d = context;
            this.f3709q = new Handler(context.getMainLooper());
        }
        this.f3702j = new C1145h();
    }

    /* renamed from: a */
    public void m9635a(boolean z) {
        this.f3699g = z;
    }

    /* renamed from: a */
    public void m9630a(byte[] bArr, String str, boolean z, C1148i c1148i) {
        m9631a(bArr, str, z, 0L, c1148i, (ArrayList<String>) null);
    }

    /* renamed from: a */
    public void m9631a(byte[] bArr, String str, boolean z, long j, C1148i c1148i, ArrayList<String> arrayList) {
        if (this.f3696d != null && str != null && bArr != null) {
            if (C1163o.m9644e(this.f3696d)) {
                C1144g c1144g = new C1144g();
                c1144g.m9726a(bArr);
                c1144g.m9729a(str);
                c1144g.m9727a(z);
                c1144g.m9731a(j);
                c1144g.m9730a(c1148i);
                c1144g.m9728a(arrayList);
                if (z) {
                    if (C1171q.f3721a) {
                        Log.d("KInfoc", "Post data via network.");
                    }
                    c1144g.m9732a(0);
                    this.f3702j.m9717a(c1144g, this.f3694a.m9708c(), this.f3695b);
                } else if (C1163o.m9645d(this.f3696d)) {
                    if (C1171q.f3721a) {
                        Log.d("KInfoc", "Post data via Wifi.");
                    }
                    c1144g.m9732a(0);
                    this.f3702j.m9717a(c1144g, this.f3694a.m9713a(0), this.f3695b);
                }
            } else if (j == 0 && this.f3697e && z) {
                m9629a(bArr, str, z, false, 0);
            }
        }
    }

    /* renamed from: a */
    private void m9632a(byte[] bArr, String str, boolean z, long j, C1148i c1148i, int i) {
        if (this.f3696d != null && str != null && bArr != null && C1163o.m9644e(this.f3696d)) {
            C1144g c1144g = new C1144g();
            c1144g.m9726a(bArr);
            c1144g.m9729a(str);
            c1144g.m9727a(z);
            c1144g.m9731a(j);
            c1144g.m9730a(c1148i);
            if (z) {
                if (C1171q.f3721a) {
                    Log.d("KInfoc", "Post data via network.");
                }
                C1171q.m9604a("post cache on " + this.f3694a.m9708c() + " table name: " + c1144g.m9725b() + " cache time: " + Long.toString(c1144g.m9723d()));
                c1144g.m9732a(i);
                this.f3702j.m9716b(c1144g, this.f3694a.m9708c(), this.f3695b);
            } else if (C1163o.m9645d(this.f3696d)) {
                if (C1171q.f3721a) {
                    Log.d("KInfoc", "Post data via Wifi.");
                }
                C1171q.m9604a("post cache on " + this.f3694a.m9713a(i) + " table name: " + c1144g.m9725b() + " cache time: " + Long.toString(c1144g.m9723d()));
                c1144g.m9732a(i);
                this.f3702j.m9716b(c1144g, this.f3694a.m9713a(i), this.f3695b);
            }
        }
    }

    /* renamed from: a */
    public boolean m9637a(String str, int i, String str2, byte[] bArr, String str3, boolean z, int i2) {
        return m9633a(bArr, C1171q.m9600b(this.f3696d, str, i, str2), str3, z, i2);
    }

    /* renamed from: a */
    public boolean m9633a(byte[] bArr, int i, String str, boolean z, int i2) {
        File m9595g;
        int length;
        boolean z2;
        if (z) {
            m9595g = C1171q.m9596f(this.f3696d, i2);
        } else {
            m9595g = C1171q.m9595g(this.f3696d, i2);
        }
        if (m9595g != null && i >= 0 && i <= bArr.length && (length = bArr.length - i) > 0) {
            ByteBuffer allocate = ByteBuffer.allocate(length);
            for (int i3 = i; i3 < bArr.length; i3++) {
                allocate.put(bArr[i3]);
            }
            if (C1171q.f3721a) {
                Log.d("KInfoc", "SAVE ICH : ALL=" + bArr.length + " startOffset=" + i + " HL=" + i + " DL=" + allocate.array().length);
            }
            try {
                z2 = new C1142e(this.f3696d).m9738a(m9595g.getAbsolutePath(), str + '_' + System.currentTimeMillis() + ".ich", allocate.array());
            } catch (IOException e) {
                e.printStackTrace();
                z2 = false;
            }
            return z2;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m9629a(byte[] bArr, String str, boolean z, boolean z2, int i) {
        File m9595g;
        if (z) {
            m9595g = C1171q.m9596f(this.f3696d, i);
        } else {
            m9595g = C1171q.m9595g(this.f3696d, i);
        }
        if (m9595g == null) {
            return false;
        }
        try {
            return new C1142e(this.f3696d).m9738a(m9595g.getAbsolutePath(), str + '_' + System.currentTimeMillis() + ".ich", bArr);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9634a(boolean z, boolean z2, int i) {
        File m9608a;
        File[] listFiles;
        int lastIndexOf;
        long j;
        if (this.f3696d != null) {
            try {
                if (z) {
                    m9608a = C1171q.m9601b(this.f3696d, i);
                } else {
                    m9608a = C1171q.m9608a(this.f3696d, i);
                }
                if (m9608a != null && (listFiles = m9608a.listFiles()) != null) {
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (C1171q.f3721a) {
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
                            if (!this.f3699g) {
                                listFiles[i2].delete();
                            } else if (this.f3698f > 0 && C1171q.m9610a(j) >= this.f3698f) {
                                listFiles[i2].delete();
                            } else {
                                byte[] m9739a = C1142e.m9739a(listFiles[i2]);
                                if (m9739a != null && !z2) {
                                    m9632a(m9739a, substring, z, j, (C1148i) null, i);
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
    /* renamed from: b */
    public void m9625b(boolean z, boolean z2, int i) {
        File m9594h;
        File[] listFiles;
        int lastIndexOf;
        long j;
        if (this.f3696d != null) {
            try {
                if (z) {
                    m9594h = C1171q.m9593i(this.f3696d, i);
                } else {
                    m9594h = C1171q.m9594h(this.f3696d, i);
                }
                if (m9594h != null && (listFiles = m9594h.listFiles()) != null) {
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (C1171q.f3721a) {
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
                            if (!this.f3699g) {
                                listFiles[i2].delete();
                            } else if (this.f3698f > 0 && C1171q.m9610a(j) >= this.f3698f) {
                                listFiles[i2].delete();
                            } else {
                                byte[] m9739a = C1142e.m9739a(listFiles[i2]);
                                if (m9739a != null && !z2) {
                                    m9632a(m9739a, substring, z, j, (C1148i) null, i);
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

    /* renamed from: a */
    public void m9636a(String str, boolean z, long j, boolean z2, int i) {
        File m9608a;
        if (this.f3696d != null) {
            if (z) {
                m9608a = C1171q.m9601b(this.f3696d, i);
            } else {
                m9608a = C1171q.m9608a(this.f3696d, i);
            }
            if (m9608a != null) {
                C1143f.m9737a(m9608a.getAbsolutePath() + File.separatorChar + str + '_' + j + ".ich");
            }
        }
    }

    /* renamed from: b */
    public boolean m9628b() {
        return this.f3697e;
    }

    /* renamed from: a */
    public void m9642a(long j) {
        this.f3698f = j;
    }

    /* renamed from: c */
    public void m9624c() {
        if (this.f3696d != null) {
            try {
                this.f3704l = new IntentFilter();
                this.f3704l.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f3696d.registerReceiver(this.f3710r, this.f3704l);
                this.f3705m = new IntentFilter();
                this.f3705m.addAction("com.ijinshan.common.kinfoc.ActivityTimer");
                this.f3696d.registerReceiver(this.f3711s, this.f3705m);
                this.f3706n = new Intent();
                this.f3706n.setAction("com.ijinshan.common.kinfoc.ActivityTimer");
                this.f3707o = PendingIntent.getBroadcast(this.f3696d, 0, this.f3706n, 0);
                this.f3708p = (AlarmManager) this.f3696d.getSystemService("alarm");
                long m9622d = m9622d();
                long m9620e = m9620e();
                if (f3693c) {
                    m9638a("INIT  =" + System.currentTimeMillis() + " DELAY =" + m9622d + " REPEAT : " + m9620e);
                }
                this.f3708p.setRepeating(1, m9622d + System.currentTimeMillis(), m9620e, this.f3707o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m9638a(String str) {
        AbstractC1130b.m9785A().mo9776a(str + "\n", new File("/sdcard/act.log"), true);
    }

    /* renamed from: d */
    public long m9622d() {
        return 20000L;
    }

    /* renamed from: e */
    public long m9620e() {
        return AbstractC1130b.m9785A().mo9782a(10800, 18000) * 1000;
    }

    /* renamed from: f */
    public int m9618f() {
        return this.f3703k + (AbstractC1130b.m9785A().mo9783a(100) * 100);
    }
}
