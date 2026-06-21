package com.tsf.shell.theme.inside.mix.menu.item;

import com.tsf.shell.e.e.n;

/* loaded from: classes.dex */
public class ThemeMenuOnlineElementPlane extends ThemeIconPlane {
    private static n mNotifPoint;
    private boolean mNotifPointState = false;
    public com.censivn.C3DEngine.b.f.a.a icon = com.tsf.shell.manager.o.b.c.b();

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
            mNotifPoint = new n();
            mNotifPoint.position().x = com.censivn.C3DEngine.b.b.a.a(100.0f);
            mNotifPoint.position().y = com.censivn.C3DEngine.b.b.a.a(90.0f);
        }
        this.mNotifPointState = true;
    }

    public void disableNotifPoint() {
        this.mNotifPointState = false;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.mNotifPointState) {
            mNotifPoint.dispatchDraw();
        }
    }
}
