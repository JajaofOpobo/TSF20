package com.tsf.shell.e.c.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.t;
import com.tsf.shell.utils.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements k {
    public static int a = 1;
    private l d;
    private com.tsf.shell.e.e.l e;
    private com.tsf.shell.e.c.b.a.a f;
    private com.censivn.C3DEngine.b.h.e.a i;
    private a j;
    private a k;
    private Runnable l;
    private boolean m;
    private float b = 25.0f;
    private float c = 55.0f;
    private boolean g = true;
    private b h = new b();
    private float n = 0.0f;
    private boolean o = true;

    public e(boolean z) {
        this.m = false;
        this.m = z;
    }

    public l a() {
        return this.d;
    }

    public void b() {
        int i;
        boolean z;
        float f = 0.0f;
        this.b = com.censivn.C3DEngine.b.b.a.a(this.b);
        this.c = com.censivn.C3DEngine.b.b.a.a(this.c);
        com.tsf.shell.manager.a.b.a(this);
        this.f = new com.tsf.shell.e.c.b.a.d(this, this.m ? com.tsf.shell.manager.o.b.c : com.tsf.shell.manager.o.b.a);
        this.d = new l();
        this.i = new com.censivn.C3DEngine.b.h.e.a(com.censivn.C3DEngine.b.b.a.D, f, com.censivn.C3DEngine.b.b.a.D, f, f) { // from class: com.tsf.shell.e.c.b.e.1
            @Override // com.censivn.C3DEngine.b.h.e.a
            public void a(int i2) {
                if (e.this.c(i2).c() == 0) {
                    e.this.i.g();
                }
            }

            @Override // com.censivn.C3DEngine.b.h.e.a
            public void b(int i2) {
                e.this.d(i2);
                e.this.c(i2).c();
            }

            @Override // com.censivn.C3DEngine.b.h.e.a
            public void a() {
                e.this.i.h();
            }
        };
        int i2 = 0;
        boolean z2 = true;
        int i3 = 1;
        while (i2 < 3) {
            if (i3 == 0) {
                a = i2;
            }
            a aVar = new a(this, this.b, this.c, i3) { // from class: com.tsf.shell.e.c.b.e.2
                @Override // com.tsf.shell.e.c.b.a
                public void e() {
                }
            };
            if (i3 == 1) {
                z = false;
                i = 0;
            } else if (z2) {
                i = i3 - 2;
                z = z2;
            } else {
                i = i3 + 2;
                z = z2;
            }
            this.i.addChild(aVar);
            i2++;
            z2 = z;
            i3 = i;
        }
        this.i.e();
        this.i.a(a, false);
        this.k = (a) this.i.getChildAt(a);
        d(a);
        this.d.addChild(this.i);
        if (!this.m) {
            this.e = com.tsf.shell.manager.a.h.h();
        } else {
            this.e = new com.tsf.shell.e.e.l(false);
            this.e.a(5);
            this.e.b(2);
        }
        this.d.addChild(this.e);
        g();
        com.tsf.shell.e.c.b.a.b b = this.f.b();
        this.e.position().x = b.g;
        this.e.position().y = b.h;
        p();
        this.i.g();
        if (com.tsf.shell.manager.a.g.c() != 0) {
            b(false);
        }
    }

    public void c() {
        this.e.b(this.m);
    }

    public void d() {
        this.e.a(this.m);
    }

    public boolean e() {
        return this.m;
    }

    public void f() {
        this.i.f();
    }

    private a b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < 3) {
                a aVar = (a) this.i.getChildAt(i3);
                if (aVar.c() == i) {
                    return aVar;
                }
                i2 = i3 + 1;
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a c(int i) {
        if (i < 3) {
            return (a) this.i.getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.j != null && !this.m) {
            com.tsf.shell.manager.a.k.c(this.j);
        }
        this.j = (a) this.i.getChildAt(i);
        if (this.g && !this.m) {
            com.tsf.shell.manager.a.k.b(this.j);
        }
    }

    private void p() {
        this.l = new Runnable() { // from class: com.tsf.shell.e.c.b.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.i.a(1, true);
            }
        };
    }

    public void a(int i) {
        float f = (i / 100.0f) * (com.censivn.C3DEngine.b.b.a.D / 2.0f);
        if (this.n != f) {
            this.n = f;
            a(false);
        }
    }

    public void g() {
        a(true);
    }

    public void a(boolean z) {
        if (!this.m && z) {
            a(com.censivn.C3DEngine.b.b.a.O ? g.t() : g.u());
        }
        float f = com.censivn.C3DEngine.b.b.a.D - this.n;
        h().a(f, this.c, this.c, this.b);
        this.i.a(f);
        this.i.a((-f) / 2.0f, (-com.censivn.C3DEngine.b.b.a.g) / 2.0f, f / 2.0f, com.censivn.C3DEngine.b.b.a.g);
        com.tsf.shell.e.c.b.a.b b = this.f.b();
        w.a(this.d);
        if (this.g) {
            this.d.position().y = b.b;
        } else {
            this.d.position().y = b.d;
        }
        if (this.o) {
            this.i.position().y = b.f;
        } else {
            this.i.position().y = b.j;
        }
        Iterator it = this.i.b().children().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((j) it.next());
            h().a(aVar);
            aVar.g();
        }
        this.f.a(this.i.c());
    }

    public com.tsf.shell.e.c.b.a.a h() {
        return this.f;
    }

    public static ArrayList i() {
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        Cursor query = contentResolver.query(t.a, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("child"));
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
            i++;
        }
        if (i < 3) {
            int i2 = 3 - i;
            for (int i3 = 0; i3 < i2; i3++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", "");
                contentResolver.insert(t.a, contentValues);
                arrayList.add("");
            }
        }
        query.close();
        return arrayList;
    }

    public void a(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            ArrayList a2 = h.a(arrayList, (String) arrayList2.get(i), ",", false);
            a b = b(i);
            Iterator it = a2.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ItemInfo itemInfo = (ItemInfo) it.next();
                if (b.a(1)) {
                    a(b, itemInfo);
                } else {
                    arrayList3.add(itemInfo);
                    z = true;
                }
            }
            if (z) {
                b.i();
            }
        }
        arrayList3.addAll(arrayList);
        a(arrayList3);
        for (int i2 = 0; i2 < 3; i2++) {
            ((a) this.i.getChildAt(i2)).f();
        }
    }

    private void a(ArrayList arrayList) {
        com.tsf.shell.e.i.c a2;
        a aVar = (a) this.i.getChildAt(this.i.numChildren() - 1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) it.next();
            if (itemInfo.itemType == 1) {
                a2 = com.tsf.shell.e.i.b.d.b.a((LauncherFolder3DInfo) itemInfo);
            } else {
                a2 = com.tsf.shell.manager.l.a.a(itemInfo, true);
            }
            aVar.a(a2, false);
            aVar.addChild(a2);
            aVar.i();
        }
    }

    public void a(int i, com.tsf.shell.e.i.c cVar) {
        a c = c(i);
        c.a(cVar, false);
        c.addChild(cVar);
    }

    private void a(a aVar, ItemInfo itemInfo) {
        com.tsf.shell.e.i.c a2;
        if (itemInfo.itemType == 1) {
            a2 = com.tsf.shell.e.i.b.d.b.a((LauncherFolder3DInfo) itemInfo);
        } else {
            a2 = com.tsf.shell.manager.l.a.a(itemInfo, true);
        }
        aVar.a(a2, false);
        aVar.addChild(a2);
    }

    public boolean j() {
        return this.o;
    }

    public void k() {
        if (this.m || com.tsf.shell.manager.a.g.c() == 0) {
            if (this.o) {
                b(true);
            } else {
                c(true);
            }
        }
    }

    public com.tsf.shell.e.c.b.a.b l() {
        return this.f.b();
    }

    public void b(boolean z) {
        if (this.o) {
            this.o = false;
            com.tsf.shell.e.c.b.a.b l = l();
            float f = this.m ? 0 : com.censivn.C3DEngine.b.b.a.K;
            if (z) {
                x xVar = new x();
                xVar.h(l.l);
                xVar.f(l.k);
                w.a(this.e);
                w.a(this.e, VEasing.Linear.easeNone, xVar);
                x xVar2 = new x() { // from class: com.tsf.shell.e.c.b.e.4
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        e.this.i.visible(false);
                    }
                };
                xVar2.h(l.j - f);
                xVar2.f(l.i);
                w.a(this.i);
                w.a(this.i, VEasing.Linear.easeNone, xVar2);
            } else {
                w.a(this.i);
                w.a(this.e);
                this.i.position().x = l.i;
                this.i.position().y = l.j - f;
                this.e.position().x = l.k;
                this.e.position().y = l.l;
                this.i.visible(false);
            }
            if (!this.m) {
                g.e(true);
                com.tsf.shell.manager.a.k.c(this.j);
                com.tsf.shell.manager.a.h.t().ar();
            }
        }
    }

    public void c(boolean z) {
        if (!this.o) {
            this.o = true;
            com.tsf.shell.e.c.b.a.b l = l();
            this.i.visible(true);
            if (z) {
                x xVar = new x();
                xVar.h(l.h);
                xVar.f(l.g);
                w.a(this.e);
                w.a(this.e, VEasing.Linear.easeNone, xVar);
                x xVar2 = new x();
                xVar2.h(l.f);
                xVar2.f(l.e);
                w.a(this.i);
                w.a(this.i, VEasing.Linear.easeNone, xVar2);
            } else {
                w.a(this.i);
                w.a(this.e);
                this.i.position().x = l.e;
                this.i.position().y = l.f;
                this.e.position().x = l.g;
                this.e.position().y = l.h;
            }
            if (!this.m) {
                com.tsf.shell.manager.a.k.b(this.j);
                g.e(false);
                com.tsf.shell.manager.a.h.t().ar();
            }
        }
    }

    public void m() {
        if (this.o && this.g) {
            if (!this.m) {
                com.tsf.shell.manager.a.k.c(this.j);
            }
            this.g = false;
            this.d.mouseEnabled(false);
            x xVar = new x() { // from class: com.tsf.shell.e.c.b.e.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.d.visible(false);
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void c() {
                    e.this.d.visible(false);
                }
            };
            com.tsf.shell.e.c.b.a.b l = l();
            xVar.f(l.c);
            xVar.h(l.d);
            xVar.a(0);
            w.a(this.d);
            w.a(this.d, VEasing.Linear.easeNone, xVar);
        }
    }

    public void n() {
        if (this.o && !this.g) {
            this.g = true;
            x xVar = new x() { // from class: com.tsf.shell.e.c.b.e.6
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    e.this.d.mouseEnabled(true);
                    if (!e.this.m) {
                        com.tsf.shell.manager.a.k.b(e.this.j);
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void c() {
                    e.this.d.mouseEnabled(true);
                    if (!e.this.m) {
                        com.tsf.shell.manager.a.k.b(e.this.j);
                    }
                }
            };
            this.d.mouseEnabled(false);
            com.tsf.shell.e.c.b.a.b b = this.f.b();
            xVar.f(b.a);
            xVar.h(b.b);
            xVar.a(com.censivn.C3DEngine.b.g.a.a);
            xVar.a(255);
            w.a(this.d);
            w.a(this.d, 500, xVar);
            this.d.visible(true);
        }
    }

    public b a(j jVar) {
        b bVar = null;
        for (int i = 0; i < 3 && (bVar = ((a) this.i.getChildAt(i)).a(jVar)) == null; i++) {
        }
        com.tsf.shell.e.c.b.a.b b = this.f.b();
        float f = bVar.a + b.a + b.e;
        float f2 = b.f + bVar.b + b.b;
        this.h.a(bVar);
        this.h.a = f;
        this.h.b = f2;
        return this.h;
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        g();
    }

    public void o() {
    }
}
