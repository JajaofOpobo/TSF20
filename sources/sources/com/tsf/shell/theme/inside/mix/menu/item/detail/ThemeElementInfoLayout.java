package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemesMixManager;
import com.tsf.shell.theme.inside.element.ThemeElementChecker;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.mix.ThemeActionManager;
import com.tsf.shell.theme.inside.mix.ThemeAppMutilChoiceManager;
import com.tsf.shell.theme.inside.mix.ThemeArrangeManager;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;
import com.tsf.shell.theme.inside.mix.ThemeContactManager;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.theme.inside.mix.ThemeIconMenuManager;
import com.tsf.shell.theme.inside.mix.ThemeLassoManager;
import com.tsf.shell.theme.inside.mix.ThemePageManager;
import com.tsf.shell.theme.inside.mix.ThemeShellOtherManager;
import com.tsf.shell.theme.inside.mix.ThemeSmartButtonManager;
import com.tsf.shell.theme.inside.mix.ThemeUnreadCountManager;
import com.tsf.shell.theme.inside.mix.ThemeWidgetResizeManager;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeElementInfoLayout extends ThemeInfoLayout {
    public int mElementSize;

    public ThemeElementInfoLayout() {
        setTitle(b.i.text_theme_element);
        this.mElementSize = (int) com.censivn.C3DEngine.b.b.a.a(180.0f);
        addChild(new a(8) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeFolderManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(16) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.6
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeContactManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(4) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.7
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeClockManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_DESKTOP) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.8
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemePageManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_SMART_BUTTON) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.9
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeSmartButtonManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_ICON_MENU) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.10
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeIconMenuManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_LASSO) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.11
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeLassoManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_ARRANGE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.12
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeArrangeManager.createPreviewBitmap(com.censivn.C3DEngine.a.d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_APP_MUTIL_CHOICE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.13
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeAppMutilChoiceManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_UNREAD_COUNT) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.2
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeUnreadCountManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(33) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.3
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeShellOtherManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_WIDGET_RESIZE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.4
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeWidgetResizeManager.createPreviewBitmap(com.censivn.C3DEngine.a.d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new a(ThemeElementType.TYPE_ACTION) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.5
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.a
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeActionManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.b.b.a.a
    public void recycle() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < numChildren()) {
                ((a) getChildAt(i2)).a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout
    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < numChildren()) {
                ((a) getChildAt(i2)).b(themeInfo);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    class a extends j {
        private int a;
        public k b;
        public m c;
        private ThemeListsManager.ThemeInfo f;
        private TextureElement e = new TextureElement(0, false);
        private boolean g = false;

        public a(int i) {
            this.a = i;
            this.b = new k(ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            this.b.calAABB();
            this.b.textures().addElement(this.e);
            this.b.position().y = com.censivn.C3DEngine.b.b.a.a(100.0f);
            this.c = new m();
            this.c.d(35);
            this.c.position().y = -com.censivn.C3DEngine.b.b.a.a(50.0f);
            this.c.a(ThemesMixManager.getTypeTitle(com.censivn.C3DEngine.a.d(), i));
            this.c.b();
            setAABBPX(((-ThemeElementInfoLayout.this.mElementSize) / 2.0f) * 1.4f, (-ThemeElementInfoLayout.this.mElementSize) / 2.0f, 0.0f, (ThemeElementInfoLayout.this.mElementSize / 2.0f) * 1.4f, ThemeElementInfoLayout.this.mElementSize / 2.0f, 0.0f);
            addChild(this.b);
            addChild(this.c);
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (this.e.id == 0 && this.f != null) {
                Bitmap bitmapA = this.g ? a(this.f) : null;
                if (bitmapA == null) {
                    bitmapA = x.a(b.d.theme_lose_icon, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize);
                }
                com.censivn.C3DEngine.a.g().a(this.e, bitmapA);
                bitmapA.recycle();
            }
        }

        public void b(ThemeListsManager.ThemeInfo themeInfo) {
            a();
            this.f = themeInfo;
            this.g = ThemeElementChecker.isElementAbailable(this.f.context, this.a);
        }

        public void a() {
            if (this.e.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.e);
            }
            this.c.a();
            this.f = null;
        }

        public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
            return null;
        }
    }
}
