package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0798m;
import com.android.volley.C0802n;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0841m;
import com.google.android.collect.Lists;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.wallpaper.C2077i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.tsf.extend.wallpaper.aa */
/* loaded from: classes.dex */
public class C2026aa {

    /* renamed from: f */
    private static C2026aa f6584f;

    /* renamed from: a */
    private C2147y f6585a;

    /* renamed from: b */
    private Context f6586b;

    /* renamed from: c */
    private List<C2094m> f6587c;

    /* renamed from: e */
    private boolean f6589e;

    /* renamed from: h */
    private InterfaceC2034a f6591h;

    /* renamed from: i */
    private C0798m f6592i;

    /* renamed from: j */
    private Handler f6593j;

    /* renamed from: d */
    private List<WeakReference<C2077i.InterfaceC2081a>> f6588d = new ArrayList();

    /* renamed from: g */
    private List<C2077i.InterfaceC2081a> f6590g = new ArrayList();

    /* renamed from: com.tsf.extend.wallpaper.aa$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2034a {
        /* renamed from: h */
        void mo6669h();
    }

    private C2026aa() {
    }

    /* renamed from: a */
    public static synchronized C2026aa m6695a() {
        C2026aa c2026aa;
        synchronized (C2026aa.class) {
            if (f6584f == null) {
                f6584f = new C2026aa();
            }
            c2026aa = f6584f;
        }
        return c2026aa;
    }

    /* renamed from: a */
    public void m6694a(Context context) {
        this.f6586b = context;
        this.f6585a = new C2147y(context);
        this.f6592i = C1406c.m8766a(context);
        HandlerThread handlerThread = new HandlerThread("Favorite_Wallpaper");
        handlerThread.start();
        this.f6593j = new Handler(handlerThread.getLooper());
        m6683b();
    }

    /* renamed from: b */
    public void m6683b() {
        this.f6593j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.1
            @Override // java.lang.Runnable
            public void run() {
                C2026aa.this.f6587c = C2026aa.this.m6672e();
                synchronized (C2026aa.this.f6588d) {
                    C2026aa.this.f6589e = true;
                    ArrayList newArrayList = Lists.newArrayList();
                    synchronized (C2026aa.this.f6587c) {
                        newArrayList.addAll(C2026aa.this.f6587c);
                    }
                    for (WeakReference weakReference : C2026aa.this.f6588d) {
                        C2077i.InterfaceC2081a interfaceC2081a = (C2077i.InterfaceC2081a) weakReference.get();
                        if (interfaceC2081a != null) {
                            interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.getList, newArrayList, C2077i.InterfaceC2081a.EnumC2083b.suc);
                        }
                    }
                    C2026aa.this.f6588d.clear();
                    if (C2026aa.this.f6591h != null) {
                        C2026aa.this.f6591h.mo6669h();
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public boolean m6678c() {
        return this.f6589e;
    }

    /* renamed from: a */
    public boolean m6686a(C2094m c2094m) {
        if (this.f6589e) {
            synchronized (this.f6587c) {
                Iterator<C2094m> it = this.f6587c.iterator();
                while (it.hasNext()) {
                    if (it.next().m6431h() == c2094m.m6431h()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m6685a(final C2094m c2094m, final C2077i.InterfaceC2081a interfaceC2081a) {
        this.f6593j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                long m6431h = c2094m.m6431h();
                if (C2026aa.this.f6585a.m6224a("wallpaper", "souce_id = ? and fav_time > ?", new String[]{m6431h + "", "-1"}) > 0) {
                    synchronized (C2026aa.this.f6587c) {
                        Iterator it = C2026aa.this.f6587c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C2094m c2094m2 = (C2094m) it.next();
                            if (c2094m2.m6431h() == m6431h) {
                                C2026aa.this.f6587c.remove(c2094m2);
                                break;
                            }
                        }
                    }
                    C2026aa.this.m6684a(false, c2094m);
                    z = true;
                } else {
                    z = false;
                }
                if (interfaceC2081a != null) {
                    interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.delete, c2094m, z ? C2077i.InterfaceC2081a.EnumC2083b.suc : C2077i.InterfaceC2081a.EnumC2083b.fail);
                }
            }
        });
    }

    /* renamed from: a */
    public void m6687a(C2077i.InterfaceC2081a interfaceC2081a) {
        if (interfaceC2081a != null) {
            synchronized (this.f6588d) {
                if (this.f6589e) {
                    ArrayList newArrayList = Lists.newArrayList();
                    synchronized (this.f6587c) {
                        newArrayList.addAll(this.f6587c);
                    }
                    interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.getList, newArrayList, C2077i.InterfaceC2081a.EnumC2083b.suc);
                } else {
                    this.f6588d.add(new WeakReference<>(interfaceC2081a));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public List<C2094m> m6672e() {
        Cursor m6223a = this.f6585a.m6223a("select * from wallpaper where fav_time <> ?", new String[]{"-1"});
        List<C2094m> m6443b = C2094m.m6443b(m6223a);
        if (m6223a != null) {
            m6223a.close();
        }
        return m6443b;
    }

    /* renamed from: b */
    public void m6680b(final C2094m c2094m, final C2077i.InterfaceC2081a interfaceC2081a) {
        this.f6593j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z = true;
                ContentValues contentValues = new ContentValues();
                contentValues.put("souce_id", Long.valueOf(c2094m.m6431h()));
                contentValues.put("thumbUrl", c2094m.m6430i());
                contentValues.put("url", c2094m.m6429j());
                contentValues.put("categoryId", Integer.valueOf(c2094m.m6428k()));
                contentValues.put("fav_time", System.currentTimeMillis() + "");
                contentValues.put("user_upload", Integer.valueOf(c2094m.m6427l() ? 1 : 0));
                contentValues.put("author", c2094m.m6424o());
                contentValues.put("live_wp_down_url", c2094m.m6426m());
                if (C2026aa.this.f6585a.m6225a("wallpaper", (String) null, contentValues) > 0) {
                    synchronized (C2026aa.this.f6587c) {
                        C2026aa.this.f6587c.add(c2094m);
                    }
                    C2026aa.this.m6684a(true, c2094m);
                } else {
                    z = false;
                }
                interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.save, c2094m, z ? C2077i.InterfaceC2081a.EnumC2083b.suc : C2077i.InterfaceC2081a.EnumC2083b.fail);
            }
        });
    }

    /* renamed from: a */
    public void m6688a(final C2070g c2070g, final C2077i.InterfaceC2081a interfaceC2081a) {
        this.f6593j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.4
            @Override // java.lang.Runnable
            public void run() {
                int m6224a = C2026aa.this.f6585a.m6224a("wallpaper", "souce_id = ? and local_time > ?", new String[]{c2070g.m6431h() + "", "-1"});
                if (interfaceC2081a != null) {
                    interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.delete, c2070g, m6224a > 0 ? C2077i.InterfaceC2081a.EnumC2083b.suc : C2077i.InterfaceC2081a.EnumC2083b.fail);
                }
            }
        });
    }

    /* renamed from: b */
    public void m6681b(C2077i.InterfaceC2081a interfaceC2081a) {
        final WeakReference weakReference = new WeakReference(interfaceC2081a);
        this.f6593j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.5
            @Override // java.lang.Runnable
            public void run() {
                Cursor m6223a = C2026aa.this.f6585a.m6223a("select * from wallpaper where local_time <> ?", new String[]{"-1"});
                List<C2070g> m6526a = C2070g.m6526a(m6223a);
                if (m6223a != null) {
                    m6223a.close();
                }
                ArrayList newArrayList = m6526a == null ? Lists.newArrayList() : m6526a;
                Collections.sort(newArrayList);
                C2077i.InterfaceC2081a interfaceC2081a2 = (C2077i.InterfaceC2081a) weakReference.get();
                if (interfaceC2081a2 != null) {
                    interfaceC2081a2.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.getList, newArrayList, C2077i.InterfaceC2081a.EnumC2083b.suc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6684a(boolean z, C2094m c2094m) {
        m6679b(z, c2094m);
        for (C2077i.InterfaceC2081a interfaceC2081a : this.f6590g) {
            interfaceC2081a.mo6477a(C2077i.InterfaceC2081a.EnumC2082a.notify, null, C2077i.InterfaceC2081a.EnumC2083b.suc);
        }
    }

    /* renamed from: b */
    private void m6679b(final boolean z, final C2094m c2094m) {
        if (c2094m != null) {
            C0841m c0841m = new C0841m(1, String.format("https://cml.ksmobile.com/WallPaper/changeWallPaperAssist?source=launch_wp_client&mcc=%s", C1423d.m8685b(C1547h.m8290b())), new C0802n.InterfaceC0804b<String>() { // from class: com.tsf.extend.wallpaper.aa.6
                @Override // com.android.volley.C0802n.InterfaceC0804b
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6192a(String str) {
                }
            }, null) { // from class: com.tsf.extend.wallpaper.aa.7
                @Override // com.android.volley.AbstractC0795l
                /* renamed from: n */
                protected Map<String, String> mo6190n() {
                    HashMap hashMap = new HashMap();
                    hashMap.put("sid", c2094m.m6431h() + "");
                    hashMap.put("op", z ? "1" : "2");
                    return hashMap;
                }
            };
            c0841m.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
            this.f6592i.m11010a((AbstractC0795l) c0841m);
        }
    }

    /* renamed from: c */
    public void m6676c(C2077i.InterfaceC2081a interfaceC2081a) {
        if (interfaceC2081a != null) {
            this.f6590g.add(interfaceC2081a);
        }
    }

    /* renamed from: d */
    public void m6673d(C2077i.InterfaceC2081a interfaceC2081a) {
        if (interfaceC2081a != null) {
            this.f6590g.remove(interfaceC2081a);
        }
    }

    /* renamed from: a */
    public void m6693a(InterfaceC2034a interfaceC2034a) {
        this.f6591h = interfaceC2034a;
    }

    /* renamed from: d */
    public void m6675d() {
        this.f6591h = null;
    }
}
