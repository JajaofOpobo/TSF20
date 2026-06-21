package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends com.tsf.shell.e.e.g.a.d {
    private com.tsf.shell.e.e.g.a.b a;
    private com.tsf.shell.e.e.g.a.b b;
    private g c;
    private com.tsf.shell.manager.r.b.b.a d;
    private com.tsf.shell.manager.r.b.b.a e;
    private l f;
    private AppWidgetManager g;
    private com.tsf.shell.manager.p.g h;

    public i(final com.tsf.shell.manager.r.b.a aVar, String str) {
        super(str);
        this.g = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        ArrayList arrayList = new ArrayList();
        com.tsf.shell.e.e.g.a.b bVar = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_widget_tsf, x.c(R.string.group_tsf_widget), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.c.i.1
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return i.this.e == i.this.c;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                i.this.a(i.this.c, true);
                i.this.b.a();
            }
        });
        com.tsf.shell.manager.r.c.b.e = bVar;
        this.a = bVar;
        com.tsf.shell.e.e.g.a.b bVar2 = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_widget_system, x.c(R.string.group_system_widgets), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.c.i.2
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return i.this.e == i.this.d;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                if (!com.tsf.shell.utils.g.b) {
                    com.tsf.shell.manager.a.l.a.b();
                } else {
                    i.this.a(i.this.d, true);
                    i.this.a.a();
                }
            }
        });
        com.tsf.shell.manager.r.c.b.f = bVar2;
        this.b = bVar2;
        arrayList.add(this.a);
        arrayList.add(this.b);
        setFunctions(arrayList);
        this.f = new l();
        this.c = new g(aVar, this) { // from class: com.tsf.shell.manager.r.b.c.i.3
            @Override // com.tsf.shell.manager.r.b.c.g
            public void a(com.tsf.shell.e.i.c.g gVar) {
                i.this.a(gVar, 0.0f, aVar.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.r.b.c.g
            public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
                return i.this.a(gVar, f, f2);
            }
        };
        this.d = new f(aVar);
        this.f.addChild(this.c.f());
        this.f.addChild(this.d.f());
        this.e = this.c;
        this.h = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.f.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.manager.r.b.b.a aVar, boolean z) {
        if (aVar != this.e) {
            this.e.a(z);
            this.e = aVar;
            this.e.b(z);
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.c.a(f, f2, f3, f4);
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.e.b(false);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShowComplete() {
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        this.h.b();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.f;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onRecycle();
        a(this.c, false);
        this.b.a();
        this.c.e();
        this.d.e();
    }

    public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
        if (gVar instanceof com.tsf.shell.e.i.c.i) {
            com.tsf.shell.manager.r.c.a.c.a((com.tsf.shell.e.i.c.i) gVar, f, f2, new com.tsf.shell.manager.r.c.a.b() { // from class: com.tsf.shell.manager.r.b.c.i.4
                @Override // com.tsf.shell.manager.r.c.a.b
                public void a(ItemInfo itemInfo) {
                }

                @Override // com.tsf.shell.manager.r.c.a.b
                public void a(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c.i iVar) {
                    cVar.scale().setAll(0.0f, 0.0f, 1.0f);
                    com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                    xVar.l(1.0f);
                    xVar.m(1.0f);
                    xVar.a(com.censivn.C3DEngine.b.g.a.e);
                    w.a(cVar);
                    w.a(cVar, 500, xVar);
                }
            });
            return true;
        }
        if (!(gVar instanceof com.tsf.shell.e.i.c.h)) {
            return true;
        }
        float[] a = x.a(f, f2);
        com.tsf.shell.manager.a.l.a.a(this.g, (com.tsf.shell.e.i.c.h) gVar, (int) a[0], (int) a[1]);
        return false;
    }

    public void a(com.tsf.shell.e.i.c.g gVar) {
        this.c.b(gVar);
    }

    public void b(com.tsf.shell.e.i.c.g gVar) {
        this.c.c(gVar);
    }

    public void a(ArrayList arrayList) {
        this.c.a(arrayList);
    }
}
