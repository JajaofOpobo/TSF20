package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.b.a;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.parser.IconPreviewLoader;
import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class ThemeIconInfoLayout extends ThemeInfoLayout {
    private SoftReference<Bitmap> bitmapReference;
    private ThemeListsManager.ThemeInfo mInfo;
    private IconPreviewLoader mLoader;
    private k mPreviewPlane;
    private TextureElement mTexture;
    private Runnable mUpdateBitmapRunnable;
    private Runnable mUpdateTextureRunnable;
    private boolean mUpdateRunnablePosted = false;
    private int mGetBitmapFailTimes = 0;

    static /* synthetic */ int access$508(ThemeIconInfoLayout themeIconInfoLayout) {
        int i = themeIconInfoLayout.mGetBitmapFailTimes;
        themeIconInfoLayout.mGetBitmapFailTimes = i + 1;
        return i;
    }

    public ThemeIconInfoLayout() {
        setTitle(b.i.text_icon);
        this.mPreviewPlane = new k(a.a(500.0f), a.a(500.0f), false);
        this.mPreviewPlane.calAABB(1.1f, 1.2f, 1.2f);
        this.mTexture = new TextureElement(0, false);
        this.mPreviewPlane.textures().addElement(this.mTexture);
        addChild(this.mPreviewPlane);
        this.mLoader = new IconPreviewLoader();
        this.mUpdateBitmapRunnable = new Runnable() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeIconInfoLayout.1
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeIconInfoLayout.this.mInfo != null) {
                    Bitmap iconPreviewBitmap = ThemeIconInfoLayout.this.mLoader.getIconPreviewBitmap(com.censivn.C3DEngine.a.d(), ThemeIconInfoLayout.this.mInfo.packagename, (int) a.a(500.0f));
                    Bitmap iconPreviewBitmap2 = iconPreviewBitmap == null ? IconPreviewLoader.getIconPreviewBitmap(com.tsf.shell.manager.a.w.a().d(), (int) a.a(500.0f)) : iconPreviewBitmap;
                    if (ThemeIconInfoLayout.this.bitmapReference != null && ThemeIconInfoLayout.this.bitmapReference.get() != null) {
                        ((Bitmap) ThemeIconInfoLayout.this.bitmapReference.get()).recycle();
                    }
                    ThemeIconInfoLayout.this.bitmapReference = new SoftReference(iconPreviewBitmap2);
                    com.censivn.C3DEngine.a.a().c(ThemeIconInfoLayout.this.mUpdateTextureRunnable);
                }
            }
        };
        this.mUpdateTextureRunnable = new Runnable() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeIconInfoLayout.2
            @Override // java.lang.Runnable
            public void run() {
                if (ThemeIconInfoLayout.this.mInfo != null) {
                    if (ThemeIconInfoLayout.this.bitmapReference == null || ThemeIconInfoLayout.this.bitmapReference.get() == null || ((Bitmap) ThemeIconInfoLayout.this.bitmapReference.get()).isRecycled()) {
                        if (ThemeIconInfoLayout.this.mGetBitmapFailTimes < 2) {
                            ThemeIconInfoLayout.this.mUpdateRunnablePosted = false;
                        }
                        ThemeIconInfoLayout.access$508(ThemeIconInfoLayout.this);
                        return;
                    }
                    Bitmap bitmap = (Bitmap) ThemeIconInfoLayout.this.bitmapReference.get();
                    com.censivn.C3DEngine.a.g().a(ThemeIconInfoLayout.this.mTexture, bitmap);
                    bitmap.recycle();
                } else if (ThemeIconInfoLayout.this.bitmapReference != null && ThemeIconInfoLayout.this.bitmapReference.get() != null) {
                    ((Bitmap) ThemeIconInfoLayout.this.bitmapReference.get()).recycle();
                }
            }
        };
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout
    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mInfo = themeInfo;
        this.mUpdateRunnablePosted = false;
        this.mGetBitmapFailTimes = 0;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.mTexture.id == 0 && !this.mUpdateRunnablePosted) {
            this.mUpdateRunnablePosted = true;
            com.censivn.C3DEngine.a.a().d(this.mUpdateBitmapRunnable);
        }
    }

    public IconPreviewLoader getLoader() {
        return this.mLoader;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.b.b.a.a
    public void recycle() {
        this.mInfo = null;
        if (this.mTexture.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.mTexture);
        }
    }
}
