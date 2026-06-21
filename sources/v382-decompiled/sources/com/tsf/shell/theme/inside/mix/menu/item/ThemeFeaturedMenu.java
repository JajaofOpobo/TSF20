package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.i;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.e.e.g.a.d;
import com.tsf.shell.manager.p.f;
import com.tsf.shell.manager.p.g;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.l;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeFeaturedMenu extends d {
    public static final int NOTIF_POINT_VERSION_CODE_130 = 130;
    private i mGridView;
    private g mNotifItem;
    private ArrayList mThemes;
    public ThemeSettingMenu manager;

    public ThemeFeaturedMenu(ThemeSettingMenu themeSettingMenu) {
        super(R.string.text_featured);
        this.manager = themeSettingMenu;
        this.mThemes = getOnlineLists();
        this.mGridView = new i(com.censivn.C3DEngine.b.b.a.D, themeSettingMenu.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 1.1f, com.tsf.shell.manager.o.b.c.U * 1.2f);
        this.mGridView.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return ThemeFeaturedMenu.this.mThemes.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                j jVar2;
                if (jVar == null) {
                    jVar2 = new ThemeMenuOnlineElementPlane();
                    jVar2.calAABB();
                } else {
                    jVar2 = jVar;
                }
                ThemeOnlineItems themeOnlineItems = (ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i);
                ThemeMenuOnlineElementPlane themeMenuOnlineElementPlane = (ThemeMenuOnlineElementPlane) jVar2;
                themeMenuOnlineElementPlane.icon.textures().clear();
                themeMenuOnlineElementPlane.icon.textures().addElement(themeOnlineItems.getTexture());
                if (themeOnlineItems.getNotifPointState()) {
                    themeMenuOnlineElementPlane.enableNotifPoint();
                } else {
                    themeMenuOnlineElementPlane.disableNotifPoint();
                }
                return jVar2;
            }
        });
        this.mGridView.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.2
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                w.b();
                l.a(Home.b(), ((ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i)).packageName);
            }
        });
        this.mNotifItem = com.tsf.shell.manager.a.a.a(this, f.b);
        if (this.mNotifItem.a()) {
            Iterator it = this.mThemes.iterator();
            while (it.hasNext()) {
                ThemeOnlineItems themeOnlineItems = (ThemeOnlineItems) it.next();
                if (this.mNotifItem.c == themeOnlineItems.versionCode) {
                    themeOnlineItems.enableNotifPoint();
                }
            }
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public com.censivn.C3DEngine.b.f.l getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        super.onShow();
        this.mGridView.d();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        super.onHide();
        this.mNotifItem.b();
        Iterator it = this.mThemes.iterator();
        while (it.hasNext()) {
            ((ThemeOnlineItems) it.next()).disableNotifPoint();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onHide();
        Iterator it = this.mThemes.iterator();
        while (it.hasNext()) {
            ((ThemeOnlineItems) it.next()).recycleTexture();
        }
        ThemeMenuOnlineElementPlane.recycleTexture();
    }

    public static ArrayList getOnlineLists() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeOnlineItems("Sweetie", "com.comos.themes.tsf.sweetie", R.drawable.theme_icon_sweetie, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Pinko", "com.comos.themes.tsf.pinko", R.drawable.theme_icon_pinko, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Blue", "com.comos.themes.tsf.blue", R.drawable.theme_icon_blue, true, 0));
        arrayList.add(new ThemeOnlineItems("Cartoon", "com.comos.themes.tsf.cartoonstyle", R.drawable.theme_icon_cartoon, true, 0));
        arrayList.add(new ThemeOnlineItems("Carton", "com.comos.themes.tsf.carton", R.drawable.theme_icon_carton, true, 0));
        arrayList.add(new ThemeOnlineItems("Noteboard", "com.comos.themes.tsf.noteboard", R.drawable.theme_icon_noteboard, true, 0));
        arrayList.add(new ThemeOnlineItems("Wood", "com.comos.themes.tsf.wood", R.drawable.theme_icon_wood, true, 0));
        arrayList.add(new ThemeOnlineItems("Leather", "com.comos.themes.tsf.leather.prime", R.drawable.theme_icon_leather, true, 0));
        arrayList.add(new ThemeOnlineItems("Cube", "com.comos.themes.cube", R.drawable.theme_icon_cube, true, 0));
        arrayList.add(new ThemeOnlineItems("Deep Blue", "com.comos.themes.deepblue", R.drawable.theme_icon_deepblue, true, 0));
        arrayList.add(new ThemeOnlineItems("Colorful", "com.comos.themes.tsf.colorful", R.drawable.theme_icon_colorful, true, 0));
        arrayList.add(new ThemeOnlineItems("Orange", "com.comos.themes.orange", R.drawable.theme_icon_orange, true, 0));
        arrayList.add(new ThemeOnlineItems("Flat UI Theme", "com.comos.themes.flat", R.drawable.theme_icon_flat, true, 0));
        arrayList.add(new ThemeOnlineItems("Gradient Theme", "com.comos.themes.gradient", R.drawable.theme_icon_gradient, true, 0));
        arrayList.add(new ThemeOnlineItems("Green Theme", "com.comos.themes.tsf.green.prime", R.drawable.theme_icon_green, true, 0));
        arrayList.add(new ThemeOnlineItems("Yosemite", "com.comos.themes.yosemite", R.drawable.theme_icon_yosemite, true, 0));
        arrayList.add(new ThemeOnlineItems("Merry Christmas", "com.comos.themes.merrychristmas", R.drawable.theme_icon_christmas, true, 0));
        return arrayList;
    }

    public class ThemeOnlineItems {
        public int icon;
        public TextureElement iconTexture;
        public boolean installed;
        private boolean mNotifPointState;
        public String packageName;
        public boolean supportHD;
        public String title;
        public int versionCode;

        public ThemeOnlineItems(String str, String str2, int i, boolean z, int i2) {
            this.title = str;
            this.packageName = str2;
            this.icon = i;
            this.supportHD = z;
            this.versionCode = i2;
        }

        public void disableNotifPoint() {
            this.mNotifPointState = false;
        }

        public void enableNotifPoint() {
            this.mNotifPointState = true;
        }

        public boolean getNotifPointState() {
            return this.mNotifPointState;
        }

        public TextureElement getTexture() {
            if (this.iconTexture == null) {
                this.iconTexture = ThemeMixerUtils.createIconTexture(com.tsf.shell.manager.o.b.c, this.title, this.icon);
            }
            return this.iconTexture;
        }

        public void recycleTexture() {
            if (this.iconTexture != null) {
                com.censivn.C3DEngine.a.g().a(this.iconTexture);
                this.iconTexture = null;
            }
        }
    }
}
