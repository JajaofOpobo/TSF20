package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.manager.r.b.c.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends com.tsf.shell.manager.r.b.b.a {
    private d a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private PackageManager e;
    private AppWidgetManager f;
    private ArrayList<com.tsf.shell.f.i.c.e> g;
    private a h;
    private float i;
    private ArrayList<com.tsf.shell.f.i.c.f> j;

    public c(com.tsf.shell.f.e.g.d dVar, d dVar2) {
        super(dVar);
        this.j = new ArrayList<>();
        this.a = dVar2;
        g();
    }

    private void g() {
        this.h = new a() { // from class: com.tsf.shell.manager.r.b.c.c.1
            @Override // com.tsf.shell.manager.r.b.c.a
            public void a() {
                c.this.a.c(true);
            }
        };
        this.e = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        this.g = new ArrayList<>();
        this.i = com.censivn.C3DEngine.b.b.a.a(900.0f);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, this.d.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.b.a.c * 20.0f, 0.0f, 0.0f);
        this.c.addChild(this.b);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.c.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return c.this.j.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i hVar = iVar == null ? new h(c.this.i, c.this.d.getHeight() - com.censivn.C3DEngine.b.b.a.a(100.0f), com.censivn.C3DEngine.b.b.a.a(30.0f), false) : iVar;
                ((h) hVar).a((com.tsf.shell.f.i.c.e) c.this.j.get(i), false);
                return hVar;
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public void a(i iVar) {
                ((h) iVar).d();
            }
        });
        this.b.a(new f(this.d) { // from class: com.tsf.shell.manager.r.b.c.c.3
            @Override // com.tsf.shell.manager.r.b.c.f, com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                c.this.a((com.tsf.shell.f.i.c.e) c.this.j.get(i), 0.0f, c.this.d.getScreenFreeSpaceCenter());
                c.this.d.templeteHide();
            }

            @Override // com.tsf.shell.manager.r.b.c.f
            public com.tsf.shell.f.i.c.e a(int i) {
                return (com.tsf.shell.f.i.c.e) c.this.j.get(i);
            }

            @Override // com.tsf.shell.manager.r.b.c.f
            public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
                return c.this.a(eVar, f, f2);
            }
        });
        this.b.b(0.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f);
    }

    protected boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
        float[] a = x.a(f, f2);
        com.tsf.shell.manager.a.l.a.a(this.f, (com.tsf.shell.f.i.c.f) eVar, (int) a[0], (int) a[1]);
        return false;
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        this.d.showOption(this.h);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a() {
        this.h.c();
        this.d.resuemCurrentOption();
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
        Iterator<com.tsf.shell.f.i.c.f> it = this.j.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.c.f next = it.next();
            next.a();
            this.g.add(next);
        }
        this.j.clear();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.b.a(this.i, this.d.getHeight());
        this.b.a(f, f2, f3, f4);
        this.h.a(f, f2, f3, f4);
    }

    public void a(b.a aVar) {
        this.b.e();
        h();
        Iterator<b.C0145b> it = aVar.c.iterator();
        while (it.hasNext()) {
            b.C0145b next = it.next();
            com.tsf.shell.f.i.c.f a = a(next.a.label, next.b, next.a);
            a.a(next.a.provider);
            a.d(next.a.minHeight);
            a.e(next.a.minWidth);
            this.j.add(a);
        }
        this.h.a(aVar);
        this.b.d();
    }

    private com.tsf.shell.f.i.c.f a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        com.tsf.shell.f.i.c.f fVar;
        if (this.g.isEmpty()) {
            fVar = new com.tsf.shell.f.i.c.f();
        } else {
            fVar = (com.tsf.shell.f.i.c.f) this.g.remove(0);
        }
        fVar.a(str, applicationInfo, appWidgetProviderInfo);
        return fVar;
    }
}
