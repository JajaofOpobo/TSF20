package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.C1306b;
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
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeElementInfoLayout extends ThemeInfoLayout {
    public int mElementSize;

    public ThemeElementInfoLayout() {
        setTitle(C1306b.C1315i.text_theme_element);
        this.mElementSize = (int) C0892a.m10742a(180.0f);
        addChild(new C4156a(8) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeFolderManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(16) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.6
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeContactManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(4) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.7
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeClockManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_DESKTOP) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.8
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemePageManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_SMART_BUTTON) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.9
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeSmartButtonManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_ICON_MENU) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.10
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeIconMenuManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_LASSO) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.11
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeLassoManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_ARRANGE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.12
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeArrangeManager.createPreviewBitmap(C0853a.m10856d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_APP_MUTIL_CHOICE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.13
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeAppMutilChoiceManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_UNREAD_COUNT) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.2
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeUnreadCountManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(33) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.3
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeShellOtherManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_WIDGET_RESIZE) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.4
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeWidgetResizeManager.createPreviewBitmap(C0853a.m10856d(), themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
        addChild(new C4156a(ThemeElementType.TYPE_ACTION) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.5
            @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout.C4156a
            /* renamed from: a */
            public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
                return ThemeActionManager.createPreviewBitmap(null, themeInfo.context, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            }
        });
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeInfoLayout, com.censivn.C3DEngine.p031b.p033b.p034a.C0894a
    public void recycle() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < numChildren()) {
                ((C4156a) getChildAt(i2)).m715a();
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
                ((C4156a) getChildAt(i2)).m713b(themeInfo);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeElementInfoLayout$a */
    /* loaded from: classes.dex */
    public class C4156a extends C0980j {

        /* renamed from: a */
        private int f13447a;

        /* renamed from: b */
        public C0981k f13448b;

        /* renamed from: c */
        public C0984m f13449c;

        /* renamed from: f */
        private ThemeListsManager.ThemeInfo f13452f;

        /* renamed from: e */
        private TextureElement f13451e = new TextureElement(0, false);

        /* renamed from: g */
        private boolean f13453g = false;

        public C4156a(int i) {
            this.f13447a = i;
            this.f13448b = new C0981k(ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize, false);
            this.f13448b.calAABB();
            this.f13448b.textures().addElement(this.f13451e);
            this.f13448b.position().f2527y = C0892a.m10742a(100.0f);
            this.f13449c = new C0984m();
            this.f13449c.m10347d(35);
            this.f13449c.position().f2527y = -C0892a.m10742a(50.0f);
            this.f13449c.m10355a(ThemesMixManager.getTypeTitle(C0853a.m10856d(), i));
            this.f13449c.m10353b();
            setAABBPX(((-ThemeElementInfoLayout.this.mElementSize) / 2.0f) * 1.4f, (-ThemeElementInfoLayout.this.mElementSize) / 2.0f, 0.0f, (ThemeElementInfoLayout.this.mElementSize / 2.0f) * 1.4f, ThemeElementInfoLayout.this.mElementSize / 2.0f, 0.0f);
            addChild(this.f13448b);
            addChild(this.f13449c);
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f13451e.f2529id == 0 && this.f13452f != null) {
                Bitmap mo714a = this.f13453g ? mo714a(this.f13452f) : null;
                if (mo714a == null) {
                    mo714a = C4189x.m607a(C1306b.C1310d.theme_lose_icon, ThemeElementInfoLayout.this.mElementSize, ThemeElementInfoLayout.this.mElementSize);
                }
                C0853a.m10853g().m10540a(this.f13451e, mo714a);
                mo714a.recycle();
            }
        }

        /* renamed from: b */
        public void m713b(ThemeListsManager.ThemeInfo themeInfo) {
            m715a();
            this.f13452f = themeInfo;
            this.f13453g = ThemeElementChecker.isElementAbailable(this.f13452f.context, this.f13447a);
        }

        /* renamed from: a */
        public void m715a() {
            if (this.f13451e.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f13451e);
            }
            this.f13449c.m10358a();
            this.f13452f = null;
        }

        /* renamed from: a */
        public Bitmap mo714a(ThemeListsManager.ThemeInfo themeInfo) {
            return null;
        }
    }
}
