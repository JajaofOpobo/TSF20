package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class ThemeIconPlane extends l {
    public static m mMark;
    private boolean isShowMark = false;

    public void showMask() {
        this.isShowMark = true;
    }

    public void hideMask() {
        this.isShowMark = false;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.isShowMark) {
            if (mMark == null) {
                mMark = new m(com.censivn.C3DEngine.b.b.a.a(54.0f), com.censivn.C3DEngine.b.b.a.a(36.0f), false);
                Bitmap a = x.a(R.drawable.theme_30_mark);
                TextureElement a2 = com.censivn.C3DEngine.a.g().a(a, true);
                a.recycle();
                mMark.textures().addElement(a2);
                mMark.position().x = com.censivn.C3DEngine.b.b.a.a(70.0f);
                mMark.position().y = com.censivn.C3DEngine.b.b.a.a(100.0f);
            }
            mMark.dispatchDraw();
        }
    }
}
