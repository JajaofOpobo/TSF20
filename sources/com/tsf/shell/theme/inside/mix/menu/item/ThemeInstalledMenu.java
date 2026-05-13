package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.C4168e;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeInstalledMenu extends C2578b {
    private ThemePriorityComparator mComparator;
    private ThemeInstalledDetailMenu mDetailMenu;
    private C1040h mGridView;
    private boolean mNeedRefresh;
    private C0981k mSelectPlane;
    private TextureElement mSelectTE;
    private ArrayList<ThemeListsManager.ThemeInfo> mThemeList;
    private ThemeManager.ThemeListener mThemeListener;
    public ThemeSettingMenu manager;

    private void initTexture() {
        if (this.mSelectTE.f2529id == 0) {
            Bitmap m692a = C4168e.m692a(true);
            C0853a.m10853g().m10540a(this.mSelectTE, m692a);
            m692a.recycle();
        }
    }

    public void resetTheme() {
        Bitmap m692a = C4168e.m692a(true);
        C0853a.m10853g().m10540a(this.mSelectTE, m692a);
        m692a.recycle();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onThemeChanged() {
        super.onThemeChanged();
        resetTheme();
    }

    public ThemeInstalledMenu(ThemeSettingMenu themeSettingMenu) {
        super(C1306b.C1315i.text_installed);
        this.mSelectTE = new TextureElement(0, false);
        this.mNeedRefresh = true;
        this.manager = themeSettingMenu;
        this.mComparator = new ThemePriorityComparator();
        this.mSelectPlane = new C0981k(C3489a.f11516c, C3489a.f11516c, false);
        this.mSelectPlane.position().f2527y = (-122.0f) * C0892a.f2567c;
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
        this.mGridView = new C1040h(C0892a.f2553D, themeSettingMenu.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 1.1f, C3566b.f11841c.f11763U * 1.2f);
        this.mGridView.m10160a(new C1024b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                if (ThemeInstalledMenu.this.mThemeList == null) {
                    return 0;
                }
                return ThemeInstalledMenu.this.mThemeList.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C0975i c0975i2;
                if (c0975i == null) {
                    c0975i2 = new C4135a();
                    c0975i2.calAABB();
                } else {
                    c0975i2 = c0975i;
                }
                ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) ThemeInstalledMenu.this.mThemeList.get(i);
                C4135a c4135a = (C4135a) c0975i2;
                if (themeInfo.isSupport30) {
                    c4135a.showMask();
                } else {
                    c4135a.hideMask();
                }
                if (ThemeManager.getInstance().isCurrentTheme(themeInfo.packagename)) {
                    c4135a.m722a();
                } else {
                    c4135a.m721b();
                }
                c4135a.f13421a.textures().clear();
                c4135a.f13421a.textures().addElement(themeInfo.getIconTexture());
                return c0975i2;
            }
        });
        this.mGridView.m10159a(new C1036f() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                ThemeInstalledMenu.this.mDetailMenu.setTheme((ThemeListsManager.ThemeInfo) ThemeInstalledMenu.this.mThemeList.get(i));
                ThemeInstalledMenu.this.mDetailMenu.setParentMenu(ThemeInstalledMenu.this);
                ThemeInstalledMenu.this.manager.changeMenu(ThemeInstalledMenu.this.mDetailMenu);
            }
        });
    }

    public void notifyDataSetChanged() {
        this.mGridView.m10143d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refresh() {
        refreshThemeLists();
        if (this.mGridView != null) {
            this.mGridView.m10143d();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.m10166a(f, f2, f3, f4);
        this.mDetailMenu.onLayout(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShowComplete() {
        super.onShowComplete();
        if (this.mNeedRefresh) {
            refresh();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        super.onShow();
        if (this.mNeedRefresh) {
            initTexture();
            refresh();
        }
    }

    /* loaded from: classes.dex */
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
        Iterator<ThemeListsManager.ThemeInfo> it = this.mThemeList.iterator();
        while (it.hasNext()) {
            ThemeListsManager.ThemeInfo next = it.next();
            try {
                z = next.context.getResources().getIdentifier(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_ELEMENT, "raw", next.packagename) != 0;
            } catch (Exception e) {
                z = false;
            }
            if (z) {
                next.isSupport30 = true;
            } else {
                next.isSupport30 = false;
            }
        }
        Collections.sort(this.mThemeList, this.mComparator);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onHide();
        Iterator<ThemeListsManager.ThemeInfo> it = this.mThemeList.iterator();
        while (it.hasNext()) {
            it.next().relecyIconTexture();
        }
        this.mDetailMenu.onMainThemeMenuRecycle();
        this.mNeedRefresh = true;
    }

    /* renamed from: com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu$a */
    /* loaded from: classes.dex */
    class C4135a extends ThemeIconPlane {

        /* renamed from: c */
        private boolean f13423c = false;

        /* renamed from: a */
        public C0962a f13421a = C3566b.f11841c.m2010b();

        public C4135a() {
            this.f13421a.calAABB();
            this.f13421a.position().f2527y = 10.0f * C0892a.f2567c;
            addChild(this.f13421a);
            setMouseEventListener(new C0937a(this));
        }

        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildEnd() {
            super.onDrawChildEnd();
            if (this.f13423c) {
                ThemeInstalledMenu.this.mSelectPlane.dispatchDraw();
            }
        }

        /* renamed from: a */
        public void m722a() {
            this.f13423c = true;
        }

        /* renamed from: b */
        public void m721b() {
            this.f13423c = false;
        }
    }
}
