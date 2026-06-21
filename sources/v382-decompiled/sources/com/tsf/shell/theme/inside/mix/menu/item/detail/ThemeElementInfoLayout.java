package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeListsManager;
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

/* loaded from: classes.dex */
public class ThemeElementInfoLayout extends ThemeInfoLayout {
    public int mElementSize;

    public ThemeElementInfoLayout() {
        setTitle(R.string.text_theme_element);
        this.mElementSize = (int) com.censivn.C3DEngine.b.b.a.a(180.0f);
        addChild(new b(8) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeFolderManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(16) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.6
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeContactManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(4) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.7
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeClockManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_DESKTOP) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.8
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemePageManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_SMART_BUTTON) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.9
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeSmartButtonManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_ICON_MENU) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.10
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeIconMenuManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_LASSO) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.11
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeLassoManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_ARRANGE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.12
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeArrangeManager.createPreviewBitmap(com.censivn.C3DEngine.a.d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_APP_MUTIL_CHOICE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.13
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeAppMutilChoiceManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_UNREAD_COUNT) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.2
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeUnreadCountManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(33) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.3
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeShellOtherManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_WIDGET_RESIZE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.4
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
            public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeWidgetResizeManager.createPreviewBitmap(com.censivn.C3DEngine.a.d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new b(ThemeElementType.TYPE_ACTION) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.5
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.b
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
                ((b) getChildAt(i2)).a();
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
                ((b) getChildAt(i2)).b(themeInfo);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
