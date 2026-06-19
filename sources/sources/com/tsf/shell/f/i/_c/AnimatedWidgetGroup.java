package com.tsf.shell.f.i._c;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AnimatedWidgetGroup extends WidgetGroupBase {
    private j k;
    private com.tsf.shell.f.i._b.a.WidgetContainer l;

    public A() {
        b(true);
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase, com.tsf.shell.f.i._c.WidgetLabelProvider
    public void b() {
        if (this.l != null) {
            this.l.g();
        }
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase
    public i a(boolean z) {
        if (this.k == null) {
            this.k = p();
        } else {
            this.l.f();
        }
        return this.k;
    }

    private j p() {
        j jVar = new j() { // from class: com.tsf.shell.f.i._c.a.1
            int a = 0;
            double b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                rotation().y = (-19.0f) + (((float) Math.sin(this.b * ((double) this.a))) * 19.0f);
                this.a += 2;
            }
        };
        this.l = new com.tsf.shell.f.i._b.a.WidgetContainer(false);
        this.l.scale().setAll(0.54f, 0.54f, 0.54f);
        this.l.setAnimationObjectState(true);
        jVar.addChild(this.l);
        return jVar;
    }
}
