package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.d;
import com.tsf.shell.manager.p.f;
import com.tsf.shell.manager.p.g;
import com.tsf.shell.manager.p.h;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeMixMenu extends d {
    private com.censivn.C3DEngine.b.b.a.b mContentContainer;
    private com.censivn.C3DEngine.b.b.a.a mElementContainer;
    private ThemeIconDesignerMenu mIconDesignerMenu;
    private ThemeMenuMixElementPlane mIconPlane;
    private com.censivn.C3DEngine.b.b.a.d mScrollContainer;
    private com.censivn.C3DEngine.b.b.a.a mStyleContainer;
    public ThemeSettingMenu manager;

    public ThemeMixMenu(ThemeSettingMenu themeSettingMenu) {
        super(R.string.text_customize, R.drawable.scroll_menu_title_mask);
        this.manager = themeSettingMenu;
        this.mScrollContainer = new com.censivn.C3DEngine.b.b.a.d();
        this.mContentContainer = new com.censivn.C3DEngine.b.b.a.b();
        this.mStyleContainer = new com.censivn.C3DEngine.b.b.a.a();
        this.mStyleContainer.setTitle(R.string.text_style);
        this.mStyleContainer.setTitleSize(38);
        this.mStyleContainer.setTitlePosition(com.censivn.C3DEngine.b.b.a.a(250.0f));
        initStyleContainer();
        this.mElementContainer = new com.censivn.C3DEngine.b.b.a.a();
        this.mElementContainer.setTitle(R.string.text_theme_element);
        this.mElementContainer.setTitleSize(38);
        this.mElementContainer.setTitlePosition(com.censivn.C3DEngine.b.b.a.a(250.0f));
        ArrayList themeMixElementManagerLists = ThemeManager.mix.getThemeMixElementManagerLists();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < themeMixElementManagerLists.size()) {
                this.mElementContainer.addChild(((ThemeMixElementManager) themeMixElementManagerLists.get(i2)).getPreview());
                i = i2 + 1;
            } else {
                this.mScrollContainer.c(this.mContentContainer);
                this.mContentContainer.addChild(this.mStyleContainer);
                this.mContentContainer.addChild(this.mElementContainer);
                initIconDesigner();
                com.tsf.shell.manager.a.a.a(this, f.c);
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
        final g a = com.tsf.shell.manager.a.a.a(f.d);
        ThemeMenuMixElementPlane themeMenuMixElementPlane = new ThemeMenuMixElementPlane() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public Bitmap getPreviewBitmap() {
                return x.a(R.drawable.theme_icon_design);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getTitle() {
                return x.c(R.string.text_icon_designer);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getSummary() {
                return "";
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public void onClick() {
                ThemeMixMenu.this.manager.changeMenu(ThemeMixMenu.this.mIconDesignerMenu);
                ThemeMixMenu.this.mIconDesignerMenu.setParentMenu(ThemeMixMenu.this);
                a.b();
            }
        };
        this.mIconPlane = themeMenuMixElementPlane;
        this.mStyleContainer.addChild(themeMenuMixElementPlane);
        if (a.a()) {
            this.mIconPlane.enableNotifPoint();
            a.a(new h() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.2
                @Override // com.tsf.shell.manager.p.h
                public void a() {
                    ThemeMixMenu.this.mIconPlane.disableNotifPoint();
                }
            });
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.mScrollContainer;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        resetLayout();
        if (this.mIconDesignerMenu != null) {
            this.mIconDesignerMenu.onLayout(f, f2, f3, f4);
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.mScrollContainer.j();
        resetLayout();
    }

    private void resetLayout() {
        this.mScrollContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.mScrollContainer.setAABBPX(0.0f, (-com.censivn.C3DEngine.b.b.a.a(500.0f)) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.a(500.0f) / 2.0f, 0.0f);
        this.mScrollContainer.k();
        this.mScrollContainer.a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onHide();
        Iterator it = ThemeManager.mix.getThemeMixElementManagerLists().iterator();
        while (it.hasNext()) {
            ((ThemeMixElementManager) it.next()).recyclePreview();
        }
    }
}
