package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.tsf.shell.manager.action.GestureHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageItemDropHandler extends PageItemTouchHandler {
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase g;

    public d(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        super(bVar);
        this.g = bVar;
    }

    @Override // com.tsf.shell.f.i.a.PageItemTouchHandler, com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.g.aQ();
        f.a(motionEvent);
    }
}
