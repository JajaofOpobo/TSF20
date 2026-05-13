package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.manager.r.c.a.a;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g extends com.tsf.shell.f.e.g.a.b {
    private a.C0095a a;
    private a.C0095a b;
    private e c;
    private com.tsf.shell.manager.r.b.b.a d;
    private com.tsf.shell.manager.r.b.b.a e;
    private j f;
    private AppWidgetManager g;
    private e.a h;

    public g(final com.tsf.shell.manager.r.b.a aVar, String str) {
        super(str);
        this.g = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        a.C0095a c0095a = new a.C0095a(b.d.widget_menu_widget_tsf, x.c(b.i.group_tsf_widget), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.c.g.1
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return g.this.e == g.this.c;
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                g.this.a(g.this.c, true);
                g.this.b.a();
            }
        });
        com.tsf.shell.manager.r.c.b.e = c0095a;
        this.a = c0095a;
        a.C0095a c0095a2 = new a.C0095a(b.d.widget_menu_widget_system, x.c(b.i.group_system_widgets), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.c.g.2
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return g.this.e == g.this.d;
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                if (com.tsf.shell.utils.g.b) {
                    g.this.a(g.this.d, true);
                    g.this.a.a();
                    return;
                }
                com.tsf.shell.manager.a.l.a.b();
            }
        });
        com.tsf.shell.manager.r.c.b.f = c0095a2;
        this.b = c0095a2;
        arrayList.add(this.a);
        arrayList.add(this.b);
        setFunctions(arrayList);
        this.f = new j();
        this.c = new e(aVar, this) { // from class: com.tsf.shell.manager.r.b.c.g.3
            @Override // com.tsf.shell.manager.r.b.c.e
            public void a(com.tsf.shell.f.i.c.e eVar) {
                g.this.a(eVar, 0.0f, aVar.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.r.b.c.e
            public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
                return g.this.a(eVar, f, f2);
            }
        };
        this.d = new d(aVar);
        this.f.addChild(this.c.f());
        this.f.addChild(this.d.f());
        this.e = this.c;
        this.h = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.e.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.manager.r.b.b.a aVar, boolean z) {
        if (aVar != this.e) {
            this.e.a(z);
            this.e = aVar;
            this.e.b(z);
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.c.a(f, f2, f3, f4);
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        this.e.b(false);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShowComplete() {
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHide() {
        this.h.b();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.f;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onRecycle();
        a(this.c, false);
        this.b.a();
        this.c.e();
        this.d.e();
    }

    public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
        if (eVar instanceof com.tsf.shell.f.i.c.g) {
            com.tsf.shell.manager.r.c.a.b.a((com.tsf.shell.f.i.c.g) eVar, f, f2, new a.AbstractC0146a() { // from class: com.tsf.shell.manager.r.b.c.g.4
                @Override // com.tsf.shell.manager.r.c.a.a.AbstractC0146a
                public void a(ItemInfo itemInfo) {
                }

                @Override // com.tsf.shell.manager.r.c.a.a.AbstractC0146a
                public void a(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.c.g gVar) {
                    bVar.scale().setAll(0.0f, 0.0f, 1.0f);
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.l(1.0f);
                    dVar.m(1.0f);
                    dVar.a(com.censivn.C3DEngine.b.g.a.e);
                    com.censivn.C3DEngine.b.g.c.a(bVar);
                    com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
                }
            });
            return true;
        } else if (eVar instanceof com.tsf.shell.f.i.c.f) {
            float[] a = x.a(f, f2);
            com.tsf.shell.manager.a.l.a.a(this.g, (com.tsf.shell.f.i.c.f) eVar, (int) a[0], (int) a[1]);
            return false;
        } else {
            return true;
        }
    }

    public void a(com.tsf.shell.f.i.c.e eVar) {
        this.c.b(eVar);
    }

    public void b(com.tsf.shell.f.i.c.e eVar) {
        this.c.c(eVar);
    }

    public void a(ArrayList<com.tsf.shell.f.i.c.e> arrayList) {
        this.c.a(arrayList);
    }
}
