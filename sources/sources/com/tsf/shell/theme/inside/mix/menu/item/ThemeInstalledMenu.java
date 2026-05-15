package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.b;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeInstalledMenu extends b {
    private ThemePriorityComparator mComparator;
    private ThemeInstalledDetailMenu mDetailMenu;
    private h mGridView;
    private boolean mNeedRefresh;
    private k mSelectPlane;
    private TextureElement mSelectTE;
    private ArrayList<ThemeListsManager.ThemeInfo> mThemeList;
    private ThemeManager.ThemeListener mThemeListener;
    public ThemeSettingMenu manager;

    private void initTexture() {
        if (this.mSelectTE.id == 0) {
            Bitmap bitmapA = e.a(true);
            com.censivn.C3DEngine.a.g().a(this.mSelectTE, bitmapA);
            bitmapA.recycle();
        }
    }

    public void resetTheme() {
        Bitmap bitmapA = e.a(true);
        com.censivn.C3DEngine.a.g().a(this.mSelectTE, bitmapA);
        bitmapA.recycle();
    }

    @Override // com.tsf.shell.f.e.g.a.a, com.tsf.shell.f.e.g.a.c
    public void onThemeChanged() {
        super.onThemeChanged();
        resetTheme();
    }

    public ThemeInstalledMenu(ThemeSettingMenu themeSettingMenu) {
        super(b.i.text_installed);
        this.mSelectTE = new TextureElement(0, false);
        this.mNeedRefresh = true;
        this.manager = themeSettingMenu;
        this.mComparator = new ThemePriorityComparator();
        this.mSelectPlane = new k(com.tsf.shell.manager.g.a.c, com.tsf.shell.manager.g.a.c, false);
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
        this.mGridView = new h(com.censivn.C3DEngine.b.b.a.D, themeSettingMenu.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 1.1f, com.tsf.shell.manager.o.b.c.U * 1.2f);
        this.mGridView.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                if (ThemeInstalledMenu.this.mThemeList == null) {
                    return 0;
                }
                return ThemeInstalledMenu.this.mThemeList.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i aVar;
                if (iVar == null) {
                    aVar = ThemeInstalledMenu.this.new a();
                    aVar.calAABB();
                } else {
                    aVar = iVar;
                }
                ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) ThemeInstalledMenu.this.mThemeList.get(i);
                a aVar2 = (a) aVar;
                if (themeInfo.isSupport30) {
                    aVar2.showMask();
                } else {
                    aVar2.hideMask();
                }
                if (ThemeManager.getInstance().isCurrentTheme(themeInfo.packagename)) {
                    aVar2.a();
                } else {
                    aVar2.b();
                }
                aVar2.a.textures().clear();
                aVar2.a.textures().addElement(themeInfo.getIconTexture());
                return aVar;
            }
        });
        this.mGridView.a(new f() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
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

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.a(f, f2, f3, f4);
        this.mDetailMenu.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShowComplete() {
        super.onShowComplete();
        if (this.mNeedRefresh) {
            refresh();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        super.onShow();
        if (this.mNeedRefresh) {
            initTexture();
            refresh();
        }
    }

    public class ThemePriorityComparator implements Comparator<ThemeListsManager.ThemeInfo> {
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
        for (ThemeListsManager.ThemeInfo themeInfo : this.mThemeList) {
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

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onHide();
        Iterator<ThemeListsManager.ThemeInfo> it = this.mThemeList.iterator();
        while (it.hasNext()) {
            it.next().relecyIconTexture();
        }
        this.mDetailMenu.onMainThemeMenuRecycle();
        this.mNeedRefresh = true;
    }

    class a extends ThemeIconPlane {
        private boolean c = false;
        public com.censivn.C3DEngine.b.f.a.a a = com.tsf.shell.manager.o.b.c.b();

        public a() {
            this.a.calAABB();
            this.a.position().y = 10.0f * com.censivn.C3DEngine.b.b.a.c;
            addChild(this.a);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
        }

        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.b.f.j
        public void onDrawChildEnd() {
            super.onDrawChildEnd();
            if (this.c) {
                ThemeInstalledMenu.this.mSelectPlane.dispatchDraw();
            }
        }

        public void a() {
            this.c = true;
        }

        public void b() {
            this.c = false;
        }
    }
}
