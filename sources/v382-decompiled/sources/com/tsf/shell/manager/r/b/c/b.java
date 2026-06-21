package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.MotionEvent;
import com.tsf.shell.utils.w;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class b extends com.tsf.shell.manager.r.b.b.a {
    private f a;
    private com.censivn.C3DEngine.b.h.b.i d;
    private PackageManager e;
    private AppWidgetManager f;
    private boolean g;
    private ArrayList h;
    private com.censivn.C3DEngine.b.h.c.a i;

    public b(com.tsf.shell.e.e.g.e eVar, f fVar) {
        super(eVar);
        this.g = false;
        this.h = new ArrayList();
        this.a = fVar;
        i();
    }

    private void i() {
        this.e = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        this.i = new com.censivn.C3DEngine.b.h.c.a();
        this.d = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, this.c.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T + (com.censivn.C3DEngine.b.b.a.c * 20.0f), com.tsf.shell.manager.o.b.c.U + (com.censivn.C3DEngine.b.b.a.c * 20.0f));
        this.d.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.b.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return b.this.h.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                com.censivn.C3DEngine.b.f.j jVar2;
                if (jVar == null) {
                    com.tsf.shell.manager.r.b.a.c cVar = new com.tsf.shell.manager.r.b.a.c();
                    cVar.k.visible(true);
                    cVar.aO();
                    cVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(cVar));
                    jVar2 = cVar;
                } else {
                    jVar2 = jVar;
                }
                c cVar2 = (c) b.this.h.get(i);
                com.tsf.shell.manager.r.b.a.c cVar3 = (com.tsf.shell.manager.r.b.a.c) jVar2;
                cVar3.k.textures().clear();
                cVar3.k.textures().addElement(cVar2.a());
                return jVar2;
            }
        });
        this.d.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.manager.r.b.c.b.2
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                w.b();
                b.this.a.a((c) b.this.h.get(i));
            }
        });
        this.b.addChild(this.d);
    }

    public void g() {
        this.d.d();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void e() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
        this.h.clear();
        this.g = false;
        this.d.b();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        if (!this.g) {
            this.i.removeFromParent();
            this.i.a(false);
            this.b.addChild(this.i);
        }
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void d() {
    }

    public void h() {
        if (!this.g) {
            this.g = true;
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3
                @Override // java.lang.Runnable
                public void run() {
                    for (AppWidgetProviderInfo appWidgetProviderInfo : b.this.f.getInstalledProviders()) {
                        try {
                            b.this.a(b.this.e.getApplicationInfo(appWidgetProviderInfo.provider.getPackageName(), 0), appWidgetProviderInfo);
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                    final Collator collator = Collator.getInstance(Locale.getDefault());
                    Collections.sort(b.this.h, new Comparator() { // from class: com.tsf.shell.manager.r.b.c.b.3.1
                        @Override // java.util.Comparator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final int compare(c cVar, c cVar2) {
                            return collator.compare(cVar.a, cVar2.a);
                        }
                    });
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.g();
                            b.this.i.b(true);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        c a = a(applicationInfo.packageName, applicationInfo);
        d dVar = new d(this);
        dVar.b = applicationInfo;
        dVar.a = appWidgetProviderInfo;
        a.a(dVar);
    }

    private c a(String str, ApplicationInfo applicationInfo) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.b.equals(str)) {
                return cVar;
            }
        }
        c cVar2 = new c(this, str);
        cVar2.a = (String) this.e.getApplicationLabel(applicationInfo);
        cVar2.e = applicationInfo;
        this.h.add(cVar2);
        return cVar2;
    }
}
