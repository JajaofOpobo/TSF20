package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.theme.inside.parser.PreviewLoader;

/* loaded from: classes.dex */
class a extends m {
    final /* synthetic */ ThemeDataInfoLayout a;
    private TextureElement d;
    private int e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ThemeDataInfoLayout themeDataInfoLayout) {
        super(r0, r1, false);
        int i;
        int i2;
        this.a = themeDataInfoLayout;
        i = themeDataInfoLayout.mPreviewWidth;
        i2 = themeDataInfoLayout.mPreviewHeight;
        this.e = -1;
        calAABB(1.1f, 1.1f, 1.0f);
        this.d = new TextureElement(0, false);
        textures().addElement(this.d);
    }

    public void a(int i) {
        a();
        this.e = i;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        PreviewLoader previewLoader;
        int i;
        int i2;
        if (this.e != -1 && this.d.id == 0) {
            previewLoader = this.a.mPreviewLoader;
            int i3 = this.e;
            i = this.a.mPreviewWidth;
            i2 = this.a.mPreviewHeight;
            Bitmap themePreviewBitmap = previewLoader.getThemePreviewBitmap(i3, i, i2);
            com.censivn.C3DEngine.a.g().a(this.d, themePreviewBitmap);
            themePreviewBitmap.recycle();
        }
    }

    public void a() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }
}
