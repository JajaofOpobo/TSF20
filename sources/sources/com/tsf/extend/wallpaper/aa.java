package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.volley.n;
import com.google.android.collect.Lists;
import com.tsf.extend.wallpaper.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class aa {
    private static aa f;
    private y a;
    private Context b;
    private List<m> c;
    private boolean e;
    private a h;
    private com.android.volley.m i;
    private Handler j;
    private List<WeakReference<i.a>> d = new ArrayList();
    private List<i.a> g = new ArrayList();

    public interface a {
        void h();
    }

    private aa() {
    }

    public static synchronized aa a() {
        if (f == null) {
            f = new aa();
        }
        return f;
    }

    public void a(Context context) {
        this.b = context;
        this.a = new y(context);
        this.i = com.tsf.extend.base.f.c.a(context);
        HandlerThread handlerThread = new HandlerThread("Favorite_Wallpaper");
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
        b();
    }

    public void b() {
        this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.1
            @Override // java.lang.Runnable
            public void run() {
                aa.this.c = aa.this.e();
                synchronized (aa.this.d) {
                    aa.this.e = true;
                    ArrayList arrayListNewArrayList = Lists.newArrayList();
                    synchronized (aa.this.c) {
                        arrayListNewArrayList.addAll(aa.this.c);
                    }
                    Iterator it = aa.this.d.iterator();
                    while (it.hasNext()) {
                        i.a aVar = (i.a) ((WeakReference) it.next()).get();
                        if (aVar != null) {
                            aVar.a(i.a.EnumC0069a.getList, arrayListNewArrayList, i.a.b.suc);
                        }
                    }
                    aa.this.d.clear();
                    if (aa.this.h != null) {
                        aa.this.h.h();
                    }
                }
            }
        });
    }

    public boolean c() {
        return this.e;
    }

    public boolean a(m mVar) {
        if (this.e) {
            synchronized (this.c) {
                Iterator<m> it = this.c.iterator();
                while (it.hasNext()) {
                    if (it.next().h() == mVar.h()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(final m mVar, final i.a aVar) {
        this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                long jH = mVar.h();
                if (aa.this.a.a("wallpaper", "souce_id = ? and fav_time > ?", new String[]{jH + "", "-1"}) > 0) {
                    synchronized (aa.this.c) {
                        Iterator it = aa.this.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            m mVar2 = (m) it.next();
                            if (mVar2.h() == jH) {
                                aa.this.c.remove(mVar2);
                                break;
                            }
                        }
                    }
                    aa.this.a(false, mVar);
                    z = true;
                } else {
                    z = false;
                }
                if (aVar != null) {
                    aVar.a(i.a.EnumC0069a.delete, mVar, z ? i.a.b.suc : i.a.b.fail);
                }
            }
        });
    }

    public void a(i.a aVar) {
        if (aVar != null) {
            synchronized (this.d) {
                if (this.e) {
                    ArrayList arrayListNewArrayList = Lists.newArrayList();
                    synchronized (this.c) {
                        arrayListNewArrayList.addAll(this.c);
                    }
                    aVar.a(i.a.EnumC0069a.getList, arrayListNewArrayList, i.a.b.suc);
                } else {
                    this.d.add(new WeakReference<>(aVar));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<m> e() {
        Cursor cursorA = this.a.a("select * from wallpaper where fav_time <> ?", new String[]{"-1"});
        List<m> listB = m.b(cursorA);
        if (cursorA != null) {
            cursorA.close();
        }
        return listB;
    }

    public void b(final m mVar, final i.a aVar) {
        this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z = true;
                ContentValues contentValues = new ContentValues();
                contentValues.put("souce_id", Long.valueOf(mVar.h()));
                contentValues.put("thumbUrl", mVar.i());
                contentValues.put("url", mVar.j());
                contentValues.put("categoryId", Integer.valueOf(mVar.k()));
                contentValues.put("fav_time", System.currentTimeMillis() + "");
                contentValues.put("user_upload", Integer.valueOf(mVar.l() ? 1 : 0));
                contentValues.put("author", mVar.o());
                contentValues.put("live_wp_down_url", mVar.m());
                if (aa.this.a.a("wallpaper", (String) null, contentValues) > 0) {
                    synchronized (aa.this.c) {
                        aa.this.c.add(mVar);
                    }
                    aa.this.a(true, mVar);
                } else {
                    z = false;
                }
                aVar.a(i.a.EnumC0069a.save, mVar, z ? i.a.b.suc : i.a.b.fail);
            }
        });
    }

    public void a(final g gVar, final i.a aVar) {
        this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.4
            @Override // java.lang.Runnable
            public void run() {
                int iA = aa.this.a.a("wallpaper", "souce_id = ? and local_time > ?", new String[]{gVar.h() + "", "-1"});
                if (aVar != null) {
                    aVar.a(i.a.EnumC0069a.delete, gVar, iA > 0 ? i.a.b.suc : i.a.b.fail);
                }
            }
        });
    }

    public void b(i.a aVar) {
        final WeakReference weakReference = new WeakReference(aVar);
        this.j.post(new Runnable() { // from class: com.tsf.extend.wallpaper.aa.5
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursorA = aa.this.a.a("select * from wallpaper where local_time <> ?", new String[]{"-1"});
                List<g> listA = g.a(cursorA);
                if (cursorA != null) {
                    cursorA.close();
                }
                List<g> listNewArrayList = listA == null ? Lists.newArrayList() : listA;
                Collections.sort(listNewArrayList);
                i.a aVar2 = (i.a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.a(i.a.EnumC0069a.getList, listNewArrayList, i.a.b.suc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, m mVar) {
        b(z, mVar);
        Iterator<i.a> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a(i.a.EnumC0069a.notify, null, i.a.b.suc);
        }
    }

    private void b(final boolean z, final m mVar) {
        int i = 1;
        if (mVar != null) {
            com.android.volley.toolbox.m mVar2 = new com.android.volley.toolbox.m(i, String.format("https://cml.ksmobile.com/WallPaper/changeWallPaperAssist?source=launch_wp_client&mcc=%s", com.tsf.extend.base.j.d.b(com.tsf.extend.h.b())), new n.b<String>() { // from class: com.tsf.extend.wallpaper.aa.6
                @Override // com.android.volley.n.b
                public void a(String str) {
                }
            }, null) { // from class: com.tsf.extend.wallpaper.aa.7
                @Override // com.android.volley.l
                protected Map<String, String> n() {
                    HashMap map = new HashMap();
                    map.put("sid", mVar.h() + "");
                    map.put("op", z ? "1" : "2");
                    return map;
                }
            };
            mVar2.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
            this.i.a((com.android.volley.l) mVar2);
        }
    }

    public void c(i.a aVar) {
        if (aVar != null) {
            this.g.add(aVar);
        }
    }

    public void d(i.a aVar) {
        if (aVar != null) {
            this.g.remove(aVar);
        }
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void d() {
        this.h = null;
    }
}
