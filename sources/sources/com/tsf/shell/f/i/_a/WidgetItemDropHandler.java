package com.tsf.shell.f.i._a;

import android.view.MotionEvent;
import com.tsf.shell.manager.action.GestureHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetItemDropHandler extends WidgetItemTouchHandler {
    private com.tsf.shell.f.i._b.e.b g;

    public d(com.tsf.shell.f.i._b.e.b bVar) {
        super(bVar);
        this.g = bVar;
    }

    @Override // com.tsf.shell.f.i._a.WidgetItemTouchHandler, com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.g.aQ();
        f.a(motionEvent);
    }
}
