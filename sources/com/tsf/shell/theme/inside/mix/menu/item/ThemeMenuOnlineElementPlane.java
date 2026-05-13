package com.tsf.shell.theme.inside.mix.menu.item;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.C2636k;
/* loaded from: classes.dex */
public class ThemeMenuOnlineElementPlane extends ThemeIconPlane {
    private static C2636k mNotifPoint;
    private boolean mNotifPointState = false;
    public C0962a icon = C3566b.f11841c.m2010b();

    public ThemeMenuOnlineElementPlane() {
        this.icon.calAABB();
        this.icon.position().f2527y = (-10.0f) * C0892a.f2567c;
        addChild(this.icon);
        setMouseEventListener(new C0937a(this));
        showMask();
    }

    public static void recycleTexture() {
        if (mNotifPoint != null) {
            mNotifPoint.m5101a();
        }
    }

    public void enableNotifPoint() {
        if (mNotifPoint == null) {
            mNotifPoint = new C2636k();
            mNotifPoint.position().f2526x = C0892a.m10742a(100.0f);
            mNotifPoint.position().f2527y = C0892a.m10742a(90.0f);
        }
        this.mNotifPointState = true;
    }

    public void disableNotifPoint() {
        this.mNotifPointState = false;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if (this.mNotifPointState) {
            mNotifPoint.dispatchDraw();
        }
    }
}
