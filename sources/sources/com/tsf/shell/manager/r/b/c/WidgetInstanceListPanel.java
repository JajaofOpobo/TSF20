package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.manager.r.b.c.SystemWidgetProviderBrowser;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetInstanceListPanel extends com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase {
    private d a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private PackageManager e;
    private AppWidgetManager f;
    private ArrayList<com.tsf.shell.f.i.c.e> g;
    private a h;
    private float i;
    private ArrayList<com.tsf.shell.f.i.c.f> j;

    public WidgetInstanceListPanel(com.tsf.shell.f.e._g.d dVar, d dVar2) {
        super(dVar);
        this.j = new ArrayList<>();
        this.a = dVar2;
        g();
    }

    private void g() {
        this.h = new a() { // from class: com.tsf.shell.manager.r.b.c.WidgetInstanceListPanel.1
            @Override // com.tsf.shell.manager.r.b.c.WidgetProviderInfoBar
            public void a() {
                WidgetInstanceListPanel.this.a.c(true);
            }
        };
        this.e = com.censivn.C3DEngine.A.d().getPackageManager();
        this.f = AppWidgetManager.getInstance(com.censivn.C3DEngine.A.d());
        this.g = new ArrayList<>();
        this.i = com.censivn.C3DEngine.b.b.A.a(900.0f);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.A.D, this.d.getHeight(), 50.0f * com.censivn.C3DEngine.b.b.A.c, com.censivn.C3DEngine.b.b.A.c * 20.0f, 0.0f, 0.0f);
        this.c.addChild(this.b);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.WidgetInstanceListPanel.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return WidgetInstanceListPanel.this.j.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i hVar = iVar == null ? new h(WidgetInstanceListPanel.this.i, WidgetInstanceListPanel.this.d.getHeight() - com.censivn.C3DEngine.b.b.A.a(100.0f), com.censivn.C3DEngine.b.b.A.a(30.0f), false) : iVar;
                ((h) hVar).a((com.tsf.shell.f.i.c.e) WidgetInstanceListPanel.this.j.get(i), false);
                return hVar;
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public void a(i iVar) {
                ((h) iVar).d();
            }
        });
        this.b.a(new WidgetDragHandler(this.d) { // from class: com.tsf.shell.manager.r.b.c.WidgetInstanceListPanel.3
            @Override // com.tsf.shell.manager.r.b.c.WidgetDragHandler, com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                WidgetInstanceListPanel.this.a((com.tsf.shell.f.i.c.e) WidgetInstanceListPanel.this.j.get(i), 0.0f, WidgetInstanceListPanel.this.d.getScreenFreeSpaceCenter());
                WidgetInstanceListPanel.this.d.templeteHide();
            }

            @Override // com.tsf.shell.manager.r.b.c.WidgetDragHandler
            public com.tsf.shell.f.i.c.e a(int i) {
                return (com.tsf.shell.f.i.c.e) WidgetInstanceListPanel.this.j.get(i);
            }

            @Override // com.tsf.shell.manager.r.b.c.WidgetDragHandler
            public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
                return WidgetInstanceListPanel.this.a(eVar, f, f2);
            }
        });
        this.b.b(0.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f);
    }

    protected boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
        float[] fArrA = x.a(f, f2);
        com.tsf.shell.manager.app.WidgetLayoutManager.a.a(this.f, (com.tsf.shell.f.i.c.f) eVar, (int) fArrA[0], (int) fArrA[1]);
        return false;
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void c() {
        this.d.showOption(this.h);
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void a() {
        this.h.c();
        this.d.resuemCurrentOption();
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void e() {
        h();
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void b() {
        h();
    }

    private void h() {
        for (com.tsf.shell.f.i.c.f fVar : this.j) {
            fVar.a();
            this.g.add(fVar);
        }
        this.j.clear();
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void a(float f, float f2, float f3, float f4) {
        this.b.a(this.i, this.d.getHeight());
        this.b.a(f, f2, f3, f4);
        this.h.a(f, f2, f3, f4);
    }

    public void a(b.a aVar) {
        this.b.e();
        h();
        for (b.C0145b c0145b : aVar.c) {
            com.tsf.shell.f.i.c.f fVarA = a(c0145b.a.label, c0145b.b, c0145b.a);
            fVarA.a(c0145b.a.provider);
            fVarA.d(c0145b.a.minHeight);
            fVarA.e(c0145b.a.minWidth);
            this.j.add(fVarA);
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
