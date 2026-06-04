package com.flurry.android;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class au {
    Context a;
    private Map b = new HashMap();
    private ci c;

    au() {
    }

    final void a(List list) {
        synchronized (this.b) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar.g().length() > 0) {
                    w.a().a(new v(jVar.g().toString(), jVar.h().longValue(), jVar.l().longValue(), jVar.i().intValue(), jVar.j().intValue(), jVar.k().intValue()));
                }
                String obj = jVar.b().toString();
                List list2 = (List) this.b.get(obj);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(jVar);
                this.b.put(obj, list2);
            }
        }
    }

    final synchronized void a(String str, String str2) {
        List list = (List) this.b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f().toString().equals(str2)) {
                    it.remove();
                }
            }
        }
        c(str);
    }

    final synchronized void a(String str, int i) {
        List list = (List) this.b.get(str);
        if (list != null) {
            if (i < 0 || i > list.size()) {
                this.b.put(str, new ArrayList());
            } else if (i > 0) {
                list.subList(0, i).clear();
                this.b.put(str, list);
            }
        }
        c(str);
    }

    final synchronized j a(String str) {
        j jVar;
        List list = (List) this.b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar = (j) it.next();
                if (bp.a(jVar.c().longValue()) && jVar.d().size() > 0) {
                    it.remove();
                    c(str);
                    break;
                }
            }
        }
        c(str);
        jVar = null;
        return jVar;
    }

    final synchronized List b(String str, int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = (List) this.b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext() && arrayList.size() <= i) {
                j jVar = (j) it.next();
                if (bp.a(jVar.c().longValue()) && jVar.e().intValue() == 1 && jVar.d().size() > 0) {
                    arrayList.add(jVar);
                    it.remove();
                }
            }
        }
        c(str);
        return arrayList;
    }

    final synchronized boolean b(String str) {
        boolean z;
        List list = (List) this.b.get(str);
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (bp.a(((j) it.next()).c().longValue())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    private synchronized void c(String str) {
        List list = (List) this.b.get(str);
        q a = (list == null || list.size() <= 0 || ((j) list.get(0)).d().size() <= 0 || ((b) ((j) list.get(0)).d().get(0)).e() == null) ? q.BANNER_BOTTOM : q.a(((b) ((j) list.get(0)).d().get(0)).e());
        if (b(list)) {
            String str2 = "Starting AsyncAdTask from EnsureCacheNotEmpty size: " + (list != null ? Integer.toString(list.size()) : "") + " wait: " + Integer.toString(0);
            s a2 = s.a();
            a2.getClass();
            this.c = new ci(a2, this.a, str, a);
            this.c.execute(new Void[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0008, code lost:
    
        if (r3.size() < 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean b(List list) {
        boolean z;
        if (list != null) {
        }
        if (this.c == null || this.c.getStatus().equals(AsyncTask.Status.FINISHED)) {
            z = true;
        }
        if (this.c != null) {
            this.c.getStatus().equals(AsyncTask.Status.FINISHED);
        }
        z = false;
        return z;
    }
}
