package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.b.a.a;
import com.censivn.C3DEngine.b.b.a.d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.b;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMixMenu extends b {
    private com.censivn.C3DEngine.b.b.a.b mContentContainer;
    private a mElementContainer;
    private ThemeIconDesignerMenu mIconDesignerMenu;
    private ThemeMenuMixElementPlane mIconPlane;
    private d mScrollContainer;
    private a mStyleContainer;
    public ThemeSettingMenu manager;

    public ThemeMixMenu(ThemeSettingMenu themeSettingMenu) {
        super(b.i.text_customize, b.d.scroll_menu_title_mask);
        this.manager = themeSettingMenu;
        this.mScrollContainer = new d();
        this.mContentContainer = new com.censivn.C3DEngine.b.b.a.b();
        this.mStyleContainer = new a();
        this.mStyleContainer.setTitle(b.i.text_style);
        this.mStyleContainer.setTitleSize(38);
        this.mStyleContainer.setTitlePosition(com.censivn.C3DEngine.b.b.a.a(250.0f));
        initStyleContainer();
        this.mElementContainer = new a();
        this.mElementContainer.setTitle(b.i.text_theme_element);
        this.mElementContainer.setTitleSize(38);
        this.mElementContainer.setTitlePosition(com.censivn.C3DEngine.b.b.a.a(250.0f));
        ArrayList<ThemeMixElementManager> themeMixElementManagerLists = ThemeManager.mix.getThemeMixElementManagerLists();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < themeMixElementManagerLists.size()) {
                this.mElementContainer.addChild(themeMixElementManagerLists.get(i2).getPreview());
                i = i2 + 1;
            } else {
                this.mScrollContainer.c(this.mContentContainer);
                this.mContentContainer.addChild(this.mStyleContainer);
                this.mContentContainer.addChild(this.mElementContainer);
                initIconDesigner();
                com.tsf.shell.manager.a.a.a(this, e.c);
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
        final e.a aVarA = com.tsf.shell.manager.a.a.a(e.d);
        ThemeMenuMixElementPlane themeMenuMixElementPlane = new ThemeMenuMixElementPlane() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.1
            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public Bitmap getPreviewBitmap() {
                return x.a(b.d.theme_icon_design);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getTitle() {
                return x.c(b.i.text_icon_designer);
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public String getSummary() {
                return "";
            }

            @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
            public void onClick() {
                ThemeMixMenu.this.manager.changeMenu(ThemeMixMenu.this.mIconDesignerMenu);
                ThemeMixMenu.this.mIconDesignerMenu.setParentMenu(ThemeMixMenu.this);
                aVarA.b();
            }
        };
        this.mIconPlane = themeMenuMixElementPlane;
        this.mStyleContainer.addChild(themeMenuMixElementPlane);
        if (aVarA.a()) {
            this.mIconPlane.enableNotifPoint();
            aVarA.a(new e.a.C0142a() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu.2
                @Override // com.tsf.shell.manager.p.e.a.C0142a
                public void a() {
                    ThemeMixMenu.this.mIconPlane.disableNotifPoint();
                }
            });
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.mScrollContainer;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        resetLayout();
        if (this.mIconDesignerMenu != null) {
            this.mIconDesignerMenu.onLayout(f, f2, f3, f4);
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
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

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onHide();
        Iterator<ThemeMixElementManager> it = ThemeManager.mix.getThemeMixElementManagerLists().iterator();
        while (it.hasNext()) {
            it.next().recyclePreview();
        }
    }
}
