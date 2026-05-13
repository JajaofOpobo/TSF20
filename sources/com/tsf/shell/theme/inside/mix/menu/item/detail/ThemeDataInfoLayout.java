package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.parser.PreviewLoader;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemeDataInfoLayout extends ThemeInfoLayout {
    private PreviewLoader mPreviewLoader = new PreviewLoader() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.1
        @Override // com.tsf.shell.theme.inside.parser.PreviewLoader
        public ArrayList<Integer> getData(Context context) {
            return ThemeDataInfoLayout.this.getData(context);
        }
    };
    private int mPreviewWidth = (int) C0892a.m10742a(280.0f);
    private int mPreviewHeight = (int) C0892a.m10742a(500.0f);
    private C2502d<C4142a> mElementPool = new C2502d<C4142a>() { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout.2
        @Override // com.tsf.shell.p096f.p118e.C2502d
        /* renamed from: a */
        public C4142a mo718b() {
            return new C4142a();
        }
    };

    public ThemeDataInfoLayout() {
        setTitle(C1306b.C1315i.text_preview);
    }

    public ArrayList<Integer> getData(Context context) {
        return null;
    }

    public int getMaxItemCount() {
        return 3;
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout
    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mPreviewLoader.parser(C0853a.m10856d(), themeInfo.packagename);
        recycle();
        int themePreviewCount = this.mPreviewLoader.getThemePreviewCount();
        int maxItemCount = themePreviewCount > getMaxItemCount() ? getMaxItemCount() : themePreviewCount;
        for (int i = 0; i < maxItemCount; i++) {
            C4142a m5383c = this.mElementPool.m5383c();
            addChild(m5383c);
            m5383c.m716a(i);
        }
        resetPosition();
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.p031b.p033b.p034a.C0894a
    public void recycle() {
        while (!children().isEmpty()) {
            C4142a c4142a = (C4142a) removeChildAt(0);
            c4142a.m717a();
            this.mElementPool.m5384a(c4142a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout$a */
    /* loaded from: classes.dex */
    public class C4142a extends C0981k {

        /* renamed from: d */
        private TextureElement f13432d;

        /* renamed from: e */
        private int f13433e;

        public C4142a() {
            super(ThemeDataInfoLayout.this.mPreviewWidth, ThemeDataInfoLayout.this.mPreviewHeight, false);
            this.f13433e = -1;
            calAABB(1.1f, 1.1f, 1.0f);
            this.f13432d = new TextureElement(0, false);
            textures().addElement(this.f13432d);
        }

        /* renamed from: a */
        public void m716a(int i) {
            m717a();
            this.f13433e = i;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f13433e != -1 && this.f13432d.f2529id == 0) {
                Bitmap themePreviewBitmap = ThemeDataInfoLayout.this.mPreviewLoader.getThemePreviewBitmap(this.f13433e, ThemeDataInfoLayout.this.mPreviewWidth, ThemeDataInfoLayout.this.mPreviewHeight);
                C0853a.m10853g().m10540a(this.f13432d, themePreviewBitmap);
                themePreviewBitmap.recycle();
            }
        }

        /* renamed from: a */
        public void m717a() {
            if (this.f13432d.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f13432d);
            }
        }
    }
}
