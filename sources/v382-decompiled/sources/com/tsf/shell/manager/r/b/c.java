package com.tsf.shell.manager.r.b;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.e.g.a.d {
    private com.tsf.shell.e.e.g.a.b a;
    private com.tsf.shell.e.e.g.a.b b;
    private Runnable c;
    private com.tsf.shell.manager.r.b.c.g d;
    private l e;

    public c(final a aVar, String str) {
        super(str);
        ArrayList arrayList = new ArrayList();
        this.c = new Runnable() { // from class: com.tsf.shell.manager.r.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.a.a();
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.b.c.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(c.this.c);
            }
        };
        com.tsf.shell.e.e.g.a.c cVar = new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.c.3
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.r.c.b.c;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.i.b().a(runnable);
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.i.b().a(false);
            }
        };
        com.tsf.shell.e.e.g.a.b bVar = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_decoration_floating, x.c(R.string.text_floating), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.c.4
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.r.c.b.a;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.i.b().b(true);
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.i.b().b(false);
            }
        });
        com.tsf.shell.manager.r.c.b.e = bVar;
        this.b = bVar;
        com.tsf.shell.e.e.g.a.b bVar2 = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_setting, x.c(R.string.text_animation), cVar);
        com.tsf.shell.manager.r.c.b.f = bVar2;
        this.a = bVar2;
        arrayList.add(this.a);
        arrayList.add(this.b);
        setFunctions(arrayList);
        this.e = new l();
        this.d = new com.tsf.shell.manager.r.b.c.g(aVar, this) { // from class: com.tsf.shell.manager.r.b.c.5
            @Override // com.tsf.shell.manager.r.b.c.g
            public void a(com.tsf.shell.e.i.c.g gVar) {
                c.this.a(gVar, 0.0f, aVar.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.r.b.c.g
            public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
                return c.this.a(gVar, f, f2);
            }
        };
        this.e.addChild(this.d.f());
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.d.b(false);
        this.d.c();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        this.d.a();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.e;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onRecycle();
        this.d.e();
    }

    public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
        com.tsf.shell.manager.r.c.a.c.a((com.tsf.shell.e.i.c.i) gVar, f, f2, new com.tsf.shell.manager.r.c.a.b() { // from class: com.tsf.shell.manager.r.b.c.6
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

    public void a(com.tsf.shell.e.i.c.g gVar) {
        this.d.b(gVar);
    }

    public void b(com.tsf.shell.e.i.c.g gVar) {
        this.d.c(gVar);
    }

    public void a(ArrayList arrayList) {
        this.d.a(arrayList);
    }
}
