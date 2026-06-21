package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.h.b.g;
import com.censivn.C3DEngine.b.h.b.i;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.d;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.e;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeInstalledMenu extends d {
    private ThemePriorityComparator mComparator;
    private ThemeInstalledDetailMenu mDetailMenu;
    private i mGridView;
    private boolean mNeedRefresh;
    private m mSelectPlane;
    private TextureElement mSelectTE;
    private ArrayList mThemeList;
    private ThemeManager.ThemeListener mThemeListener;
    public ThemeSettingMenu manager;

    private void initTexture() {
        if (this.mSelectTE.id == 0) {
            Bitmap a = e.a(true);
            com.censivn.C3DEngine.a.g().a(this.mSelectTE, a);
            a.recycle();
        }
    }

    public void resetTheme() {
        Bitmap a = e.a(true);
        com.censivn.C3DEngine.a.g().a(this.mSelectTE, a);
        a.recycle();
    }

    @Override // com.tsf.shell.e.e.g.a.a, com.tsf.shell.e.e.g.a.e
    public void onThemeChanged() {
        super.onThemeChanged();
        resetTheme();
    }

    public ThemeInstalledMenu(ThemeSettingMenu themeSettingMenu) {
        super(R.string.text_installed);
        this.mSelectTE = new TextureElement(0, false);
        this.mNeedRefresh = true;
        this.manager = themeSettingMenu;
        this.mComparator = new ThemePriorityComparator();
        this.mSelectPlane = new m(com.tsf.shell.manager.g.a.c, com.tsf.shell.manager.g.a.c, false);
        this.mSelectPlane.position().y = (-122.0f) * com.censivn.C3DEngine.b.b.a.c;
        this.mSelectPlane.useVBO(false);
        this.mSelectPlane.textures().addElement(this.mSelectTE);
        this.mDetailMenu = new ThemeInstalledDetailMenu();
        this.mThemeListener = new ThemeManager.ThemeListener() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.1
            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeAdd(String str) {
                ThemeInstalledMenu.this.refresh();
            }

            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeRemove(String str) {
                ThemeListsManager.ThemeInfo themeInfo = ThemeInstalledMenu.this.mDetailMenu.getThemeInfo();
                if (themeInfo != null && str.equals(themeInfo.packagename)) {
                    ThemeInstalledMenu.this.mDetailMenu.exit();
                }
                ThemeInstalledMenu.this.refresh();
            }

            @Override // com.tsf.shell.theme.inside.ThemeManager.ThemeListener
            public void onThemeUpdate(String str) {
                ThemeInstalledMenu.this.refresh();
            }
        };
        ThemeManager.getInstance().addListener(this.mThemeListener);
        this.mGridView = new i(com.censivn.C3DEngine.b.b.a.D, themeSettingMenu.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 1.1f, com.tsf.shell.manager.o.b.c.U * 1.2f);
        this.mGridView.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                if (ThemeInstalledMenu.this.mThemeList == null) {
                    return 0;
                }
                return ThemeInstalledMenu.this.mThemeList.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                j jVar2;
                if (jVar == null) {
                    jVar2 = new b(ThemeInstalledMenu.this);
                    jVar2.calAABB();
                } else {
                    jVar2 = jVar;
                }
                ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) ThemeInstalledMenu.this.mThemeList.get(i);
                b bVar = (b) jVar2;
                if (themeInfo.isSupport30) {
                    bVar.showMask();
                } else {
                    bVar.hideMask();
                }
                if (ThemeManager.getInstance().isCurrentTheme(themeInfo.packagename)) {
                    bVar.a();
                } else {
                    bVar.b();
                }
                bVar.a.textures().clear();
                bVar.a.textures().addElement(themeInfo.getIconTexture());
                return jVar2;
            }
        });
        this.mGridView.a(new g() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.3
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) ThemeInstalledMenu.this.mThemeList.get(i);
                w.b();
                ThemeInstalledMenu.this.mDetailMenu.setTheme(themeInfo);
                ThemeInstalledMenu.this.mDetailMenu.setParentMenu(ThemeInstalledMenu.this);
                ThemeInstalledMenu.this.manager.changeMenu(ThemeInstalledMenu.this.mDetailMenu);
            }
        });
    }

    public void notifyDataSetChanged() {
        this.mGridView.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refresh() {
        refreshThemeLists();
        if (this.mGridView != null) {
            this.mGridView.d();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.a(f, f2, f3, f4);
        this.mDetailMenu.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShowComplete() {
        super.onShowComplete();
        if (this.mNeedRefresh) {
            refresh();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        super.onShow();
        if (this.mNeedRefresh) {
            initTexture();
            refresh();
        }
    }

    public class ThemePriorityComparator implements Comparator {
        public ThemePriorityComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ThemeListsManager.ThemeInfo themeInfo, ThemeListsManager.ThemeInfo themeInfo2) {
            boolean z = themeInfo.isSupport30;
            if (z == themeInfo2.isSupport30) {
                return 0;
            }
            if (z) {
                return -1;
            }
            return 1;
        }
    }

    private void refreshThemeLists() {
        boolean z;
        this.mNeedRefresh = false;
        this.mThemeList = ThemeManager.getInstance().getListManager().refreshThemeList();
        Iterator it = this.mThemeList.iterator();
        while (it.hasNext()) {
            ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) it.next();
            try {
                z = themeInfo.context.getResources().getIdentifier(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_ELEMENT, "raw", themeInfo.packagename) != 0;
            } catch (Exception e) {
                z = false;
            }
            if (z) {
                themeInfo.isSupport30 = true;
            } else {
                themeInfo.isSupport30 = false;
            }
        }
        Collections.sort(this.mThemeList, this.mComparator);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onHide();
        Iterator it = this.mThemeList.iterator();
        while (it.hasNext()) {
            ((ThemeListsManager.ThemeInfo) it.next()).relecyIconTexture();
        }
        this.mDetailMenu.onMainThemeMenuRecycle();
        this.mNeedRefresh = true;
    }
}
