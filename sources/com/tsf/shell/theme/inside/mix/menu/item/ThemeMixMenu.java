package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0894a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeMixMenu extends C2578b {
    private C0895b mContentContainer;
    private C0894a mElementContainer;
    private ThemeIconDesignerMenu mIconDesignerMenu;
    private ThemeMenuMixElementPlane mIconPlane;
    private C0897d mScrollContainer;
    private C0894a mStyleContainer;
    public ThemeSettingMenu manager;

    public ThemeMixMenu(ThemeSettingMenu themeSettingMenu) {
        super(C1306b.C1315i.text_customize, C1306b.C1310d.scroll_menu_title_mask);
        this.manager = themeSettingMenu;
        this.mScrollContainer = new C0897d();
        this.mContentContainer = new C0895b();
        this.mStyleContainer = new C0894a();
        this.mStyleContainer.setTitle(C1306b.C1315i.text_style);
        this.mStyleContainer.setTitleSize(38);
        this.mStyleContainer.setTitlePosition(C0892a.m10742a(250.0f));
        initStyleContainer();
        this.mElementContainer = new C0894a();
        this.mElementContainer.setTitle(C1306b.C1315i.text_theme_element);
        this.mElementContainer.setTitleSize(38);
        this.mElementContainer.setTitlePosition(C0892a.m10742a(250.0f));
        ArrayList<ThemeMixElementManager> themeMixElementManagerLists = ThemeManager.mix.getThemeMixElementManagerLists();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < themeMixElementManagerLists.size()) {
                this.mElementContainer.addChild(themeMixElementManagerLists.get(i2).getPreview());
                i = i2 + 1;
            } else {
                this.mScrollContainer.m10704c(this.mContentContainer);
                this.mContentContainer.addChild(this.mStyleContainer);
                this.mContentContainer.addChild(this.mElementContainer);
                initIconDesigner();
                C3359a.f11087a.m1927a(this, C3595e.f11918c);
                return;
            }
        }
    }

    private void initIconDesigner() {
        this.mIconDesignerMenu = new ThemeIconDesignerMenu();
        this.mIconDesignerMenu.setIcon(this.mIconPlane);
    }

    private void initStyleContainer() {
        this.mStyleContainer.addChild(new ThemeMixFontPlane());
        final C3595e.C3597a m1929a = C3359a.f11087a.m1929a(C3595e.f11919d);
        ThemeMenuMixElementPlane themeMenuMixElementPlane = new ThemeMenuMixElementPlane() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public Bitmap getPreviewBitmap() {
                return C4189x.m609a(C1306b.C1310d.theme_icon_design);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getTitle() {
                return C4189x.m588c(C1306b.C1315i.text_icon_designer);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getSummary() {
                return "";
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public void onClick() {
                ThemeMixMenu.this.manager.changeMenu(ThemeMixMenu.this.mIconDesignerMenu);
                ThemeMixMenu.this.mIconDesignerMenu.setParentMenu(ThemeMixMenu.this);
                m1929a.m1916b();
            }
        };
        this.mIconPlane = themeMenuMixElementPlane;
        this.mStyleContainer.addChild(themeMenuMixElementPlane);
        if (m1929a.m1919a()) {
            this.mIconPlane.enableNotifPoint();
            m1929a.m1918a(new C3595e.C3597a.C3598a() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.2
                @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                /* renamed from: a */
                public void mo720a() {
                    ThemeMixMenu.this.mIconPlane.disableNotifPoint();
                }
            });
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.mScrollContainer;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        resetLayout();
        if (this.mIconDesignerMenu != null) {
            this.mIconDesignerMenu.onLayout(f, f2, f3, f4);
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.mScrollContainer.m10689j();
        resetLayout();
    }

    private void resetLayout() {
        this.mScrollContainer.position().f2526x = C0892a.f2590z;
        this.mScrollContainer.setAABBPX(0.0f, (-C0892a.m10742a(500.0f)) / 2.0f, 0.0f, C0892a.f2553D, C0892a.m10742a(500.0f) / 2.0f, 0.0f);
        this.mScrollContainer.m10687k();
        this.mScrollContainer.m10720a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onHide();
        Iterator<ThemeMixElementManager> it = ThemeManager.mix.getThemeMixElementManagerLists().iterator();
        while (it.hasNext()) {
            it.next().recyclePreview();
        }
    }
}
