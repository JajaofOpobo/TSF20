package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.f.e.ObjectPool;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.parser.PreviewLoader;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeDataInfoLayout extends ThemeInfoLayout {
    private PreviewLoader mPreviewLoader = new PreviewLoader() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.1
        @Override // com.tsf.shell.theme.inside.parser.PreviewLoader
        public ArrayList<Integer> getData(Context context) {
            return ThemeDataInfoLayout.this.getData(context);
        }
    };
    private int mPreviewWidth = (int) com.censivn.C3DEngine.b.b.A.a(280.0f);
    private int mPreviewHeight = (int) com.censivn.C3DEngine.b.b.A.a(500.0f);
    private ObjectPool<a> mElementPool = new ObjectPool<a>() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.2
        @Override // com.tsf.shell.f.e.ObjectPool
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return ThemeDataInfoLayout.this.new a();
        }
    };

    public ThemeDataInfoLayout() {
        setTitle(b.i.text_preview);
    }

    public ArrayList<Integer> getData(Context context) {
        return null;
    }

    public int getMaxItemCount() {
        return 3;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout
    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mPreviewLoader.parser(com.censivn.C3DEngine.C3DEngine.d(), themeInfo.packagename);
        recycle();
        int themePreviewCount = this.mPreviewLoader.getThemePreviewCount();
        int maxItemCount = themePreviewCount > getMaxItemCount() ? getMaxItemCount() : themePreviewCount;
        for (int i = 0; i < maxItemCount; i++) {
            a aVarC = this.mElementPool.c();
            addChild(aVarC);
            aVarC.a(i);
        }
        resetPosition();
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.b.b.A.a
    public void recycle() {
        while (!children().isEmpty()) {
            a aVar = (a) removeChildAt(0);
            aVar.a();
            this.mElementPool.a(aVar);
        }
    }

    class a extends GridRenderable {
        private TextureElement d;
        private int e;

        public a() {
            super(ThemeDataInfoLayout.this.mPreviewWidth, ThemeDataInfoLayout.this.mPreviewHeight, false);
            this.e = -1;
            calAABB(1.1f, 1.1f, 1.0f);
            this.d = new TextureElement(0, false);
            textures().addElement(this.d);
        }

        public void a(int i) {
            a();
            this.e = i;
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.e != -1 && this.d.id == 0) {
                Bitmap themePreviewBitmap = ThemeDataInfoLayout.this.mPreviewLoader.getThemePreviewBitmap(this.e, ThemeDataInfoLayout.this.mPreviewWidth, ThemeDataInfoLayout.this.mPreviewHeight);
                com.censivn.C3DEngine.C3DEngine.g().a(this.d, themePreviewBitmap);
                themePreviewBitmap.recycle();
            }
        }

        public void a() {
            if (this.d.id != 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.d);
            }
        }
    }
}
