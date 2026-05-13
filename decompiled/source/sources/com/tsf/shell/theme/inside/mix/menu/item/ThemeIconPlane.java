package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.b.a;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class ThemeIconPlane extends j {
    public static k mMark;
    private boolean isShowMark = false;

    public void showMask() {
        this.isShowMark = true;
    }

    public void hideMask() {
        this.isShowMark = false;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        if (this.isShowMark) {
            if (mMark == null) {
                mMark = new k(a.a(54.0f), a.a(36.0f), false);
                Bitmap a = x.a(b.d.theme_30_mark);
                TextureElement a2 = com.censivn.C3DEngine.a.g().a(a, true);
                a.recycle();
                mMark.textures().addElement(a2);
                mMark.position().x = a.a(70.0f);
                mMark.position().y = a.a(100.0f);
            }
            mMark.dispatchDraw();
        }
    }
}
