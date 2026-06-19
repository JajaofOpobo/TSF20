package com.tsf.shell.f.f.a._a.a;

import com.tsf.shell.f.f.a._a.DrawerSectionManager;
import com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerWidgetLayoutStrategy extends DrawerItemLayoutData {
    private com.tsf.shell.f.f.a._a.DrawerSectionManager.c a;

    public b(com.tsf.shell.f.f.a._a.DrawerItemContainer cVar) {
        super(cVar);
        this.a = new com.tsf.shell.f.f.a._a.DrawerSectionManager.c(this);
        a((com.tsf.shell.f.f.a._a.b.DrawerBaseElement) this.a);
    }

    public void a(com.tsf.shell.f.f.a._a.DrawerSectionManager.c cVar) {
        this.a.a(cVar.a());
        ArrayList<b.a> arrayListB = cVar.b();
        ArrayList<g> arrayList = new ArrayList<>();
        for (b.a aVar : arrayListB) {
            if (aVar instanceof g) {
                g gVar = (g) aVar;
                gVar.g(1.0f);
                gVar.visible(true);
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                gVar.rotation().setAll(0.0f, 0.0f, 0.0f);
                gVar.position().z = 0.0f;
                gVar.alpha(255.0f);
                arrayList.add(gVar);
            }
        }
        j();
        a(arrayList);
    }

    public class String 
        return this.a.e();
    }

    @Override // com.tsf.shell.f.f.a._a.a.DrawerItemLayoutData
    public void f() {
        this.a.a();
        super.f();
    }
}
