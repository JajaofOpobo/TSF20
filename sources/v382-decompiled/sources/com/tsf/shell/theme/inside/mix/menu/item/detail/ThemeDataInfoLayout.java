package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.shell.R;
import com.tsf.shell.e.e.e;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.parser.PreviewLoader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeDataInfoLayout extends ThemeInfoLayout {
    private PreviewLoader mPreviewLoader = new PreviewLoader() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.1
        @Override // com.tsf.shell.theme.inside.parser.PreviewLoader
        public ArrayList getData(Context context) {
            return ThemeDataInfoLayout.this.getData(context);
        }
    };
    private int mPreviewWidth = (int) com.censivn.C3DEngine.b.b.a.a(280.0f);
    private int mPreviewHeight = (int) com.censivn.C3DEngine.b.b.a.a(500.0f);
    private e mElementPool = new e() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.2
        @Override // com.tsf.shell.e.e.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(ThemeDataInfoLayout.this);
        }
    };

    public ThemeDataInfoLayout() {
        setTitle(R.string.text_preview);
    }

    public ArrayList getData(Context context) {
        return null;
    }

    public int getMaxItemCount() {
        return 3;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout
    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mPreviewLoader.parser(com.censivn.C3DEngine.a.d(), themeInfo.packagename);
        recycle();
        int themePreviewCount = this.mPreviewLoader.getThemePreviewCount();
        int maxItemCount = themePreviewCount > getMaxItemCount() ? getMaxItemCount() : themePreviewCount;
        for (int i = 0; i < maxItemCount; i++) {
            a aVar = (a) this.mElementPool.c();
            addChild(aVar);
            aVar.a(i);
        }
        resetPosition();
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.b.b.a.a
    public void recycle() {
        while (!children().isEmpty()) {
            a aVar = (a) removeChildAt(0);
            aVar.a();
            this.mElementPool.a(aVar);
        }
    }
}
