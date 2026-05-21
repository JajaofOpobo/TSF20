package com.tsf.shell.theme.inside.mix.menu.item;

import com.censivn.C3DEngine.b.f.a.a;
import com.tsf.shell.f.e.k;
import com.tsf.shell.manager.o.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMenuOnlineElementPlane extends ThemeIconPlane {
    private static k mNotifPoint;
    private boolean mNotifPointState = false;
    public a icon = b.c.b();

    public ThemeMenuOnlineElementPlane() {
        this.icon.calAABB();
        this.icon.position().y = (-10.0f) * com.censivn.C3DEngine.b.b.a.c;
        addChild(this.icon);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
        showMask();
    }

    public static void recycleTexture() {
        if (mNotifPoint != null) {
            mNotifPoint.a();
        }
    }

    public void enableNotifPoint() {
        if (mNotifPoint == null) {
            mNotifPoint = new k();
            mNotifPoint.position().x = com.censivn.C3DEngine.b.b.a.a(100.0f);
            mNotifPoint.position().y = com.censivn.C3DEngine.b.b.a.a(90.0f);
        }
        this.mNotifPointState = true;
    }

    public void disableNotifPoint() {
        this.mNotifPointState = false;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        if (this.mNotifPointState) {
            mNotifPoint.dispatchDraw();
        }
    }
}
