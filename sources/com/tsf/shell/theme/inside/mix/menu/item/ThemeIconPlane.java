package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeIconPlane extends C0980j {
    public static C0981k mMark;
    private boolean isShowMark = false;

    public void showMask() {
        this.isShowMark = true;
    }

    public void hideMask() {
        this.isShowMark = false;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if (this.isShowMark) {
            if (mMark == null) {
                mMark = new C0981k(C0892a.m10742a(54.0f), C0892a.m10742a(36.0f), false);
                Bitmap m609a = C4189x.m609a(C1306b.C1310d.theme_30_mark);
                TextureElement m10544a = C0853a.m10853g().m10544a(m609a, true);
                m609a.recycle();
                mMark.textures().addElement(m10544a);
                mMark.position().f2526x = C0892a.m10742a(70.0f);
                mMark.position().f2527y = C0892a.m10742a(100.0f);
            }
            mMark.dispatchDraw();
        }
    }
}
