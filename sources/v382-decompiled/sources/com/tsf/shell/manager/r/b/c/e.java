package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.MotionEvent;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.manager.r.b.b.a {
    private f a;
    private com.censivn.C3DEngine.b.h.b.i d;
    private PackageManager e;
    private AppWidgetManager f;
    private ArrayList g;
    private a h;
    private float i;
    private ArrayList j;

    public e(com.tsf.shell.e.e.g.e eVar, f fVar) {
        super(eVar);
        this.j = new ArrayList();
        this.a = fVar;
        g();
    }

    private void g() {
        this.h = new a() { // from class: com.tsf.shell.manager.r.b.c.e.1
            @Override // com.tsf.shell.manager.r.b.c.a
            public void a() {
                e.this.a.c(true);
            }
        };
        this.e = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        this.g = new ArrayList();
        this.i = com.censivn.C3DEngine.b.b.a.a(900.0f);
        this.d = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, this.c.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, 0.0f, 0.0f);
        this.b.addChild(this.d);
        this.d.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.e.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return e.this.j.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                com.censivn.C3DEngine.b.f.j jVar2 = jVar == null ? new j(e.this.i, e.this.c.getHeight() - com.censivn.C3DEngine.b.b.a.a(100.0f), com.censivn.C3DEngine.b.b.a.a(30.0f), false) : jVar;
                ((j) jVar2).a((com.tsf.shell.e.i.c.g) e.this.j.get(i), false);
                return jVar2;
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public void a(com.censivn.C3DEngine.b.f.j jVar) {
                ((j) jVar).d();
            }
        });
        this.d.a(new h(this.c) { // from class: com.tsf.shell.manager.r.b.c.e.3
            @Override // com.tsf.shell.manager.r.b.c.h, com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                e.this.a((com.tsf.shell.e.i.c.g) e.this.j.get(i), 0.0f, e.this.c.getScreenFreeSpaceCenter());
                e.this.c.templeteHide();
            }

            @Override // com.tsf.shell.manager.r.b.c.h
            public com.tsf.shell.e.i.c.g a(int i) {
                return (com.tsf.shell.e.i.c.g) e.this.j.get(i);
            }

            @Override // com.tsf.shell.manager.r.b.c.h
            public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
                return e.this.a(gVar, f, f2);
            }
        });
        this.d.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
    }

    protected boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
        float[] a = x.a(f, f2);
        com.tsf.shell.manager.a.l.a.a(this.f, (com.tsf.shell.e.i.c.h) gVar, (int) a[0], (int) a[1]);
        return false;
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        this.c.showOption(this.h);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a() {
        this.h.c();
        this.c.resuemCurrentOption();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void e() {
        h();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void b() {
        h();
    }

    private void h() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c.g gVar = (com.tsf.shell.e.i.c.g) it.next();
            gVar.a();
            this.g.add(gVar);
        }
        this.j.clear();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.d.a(this.i, this.c.getHeight());
        this.d.a(f, f2, f3, f4);
        this.h.a(f, f2, f3, f4);
    }

    public void a(c cVar) {
        this.d.e();
        h();
        Iterator it = cVar.c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            com.tsf.shell.e.i.c.h a = a(dVar.a.label, dVar.b, dVar.a);
            a.a(dVar.a.provider);
            a.d(dVar.a.minHeight);
            a.e(dVar.a.minWidth);
            this.j.add(a);
        }
        this.h.a(cVar);
        this.d.d();
    }

    private com.tsf.shell.e.i.c.h a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        com.tsf.shell.e.i.c.h hVar;
        if (this.g.isEmpty()) {
            hVar = new com.tsf.shell.e.i.c.h();
        } else {
            hVar = (com.tsf.shell.e.i.c.h) this.g.remove(0);
        }
        hVar.a(str, applicationInfo, appWidgetProviderInfo);
        return hVar;
    }
}
