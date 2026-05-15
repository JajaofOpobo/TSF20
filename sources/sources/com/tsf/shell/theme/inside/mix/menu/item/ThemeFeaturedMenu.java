package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.b.a;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.g.a.b;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.k;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeFeaturedMenu extends b {
    public static final int NOTIF_POINT_VERSION_CODE_130 = 130;
    private h mGridView;
    private e.a mNotifItem;
    private ArrayList<ThemeOnlineItems> mThemes;
    public ThemeSettingMenu manager;

    public ThemeFeaturedMenu(ThemeSettingMenu themeSettingMenu) {
        super(b.i.text_featured);
        this.manager = themeSettingMenu;
        this.mThemes = getOnlineLists();
        this.mGridView = new h(a.D, themeSettingMenu.getHeight(), a.c * 20.0f, a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 1.1f, com.tsf.shell.manager.o.b.c.U * 1.2f);
        this.mGridView.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return ThemeFeaturedMenu.this.mThemes.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i themeMenuOnlineElementPlane;
                if (iVar == null) {
                    themeMenuOnlineElementPlane = new ThemeMenuOnlineElementPlane();
                    themeMenuOnlineElementPlane.calAABB();
                } else {
                    themeMenuOnlineElementPlane = iVar;
                }
                ThemeOnlineItems themeOnlineItems = (ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i);
                ThemeMenuOnlineElementPlane themeMenuOnlineElementPlane2 = (ThemeMenuOnlineElementPlane) themeMenuOnlineElementPlane;
                themeMenuOnlineElementPlane2.icon.textures().clear();
                themeMenuOnlineElementPlane2.icon.textures().addElement(themeOnlineItems.getTexture());
                if (themeOnlineItems.getNotifPointState()) {
                    themeMenuOnlineElementPlane2.enableNotifPoint();
                } else {
                    themeMenuOnlineElementPlane2.disableNotifPoint();
                }
                return themeMenuOnlineElementPlane;
            }
        });
        this.mGridView.a(new f() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                k.a(Home.b(), ((ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i)).packageName);
            }
        });
        this.mNotifItem = com.tsf.shell.manager.a.a.a(this, e.b);
        if (this.mNotifItem.a()) {
            for (ThemeOnlineItems themeOnlineItems : this.mThemes) {
                if (this.mNotifItem.c == themeOnlineItems.versionCode) {
                    themeOnlineItems.enableNotifPoint();
                }
            }
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        super.onShow();
        this.mGridView.d();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHide() {
        super.onHide();
        this.mNotifItem.b();
        Iterator<ThemeOnlineItems> it = this.mThemes.iterator();
        while (it.hasNext()) {
            it.next().disableNotifPoint();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onHide();
        Iterator<ThemeOnlineItems> it = this.mThemes.iterator();
        while (it.hasNext()) {
            it.next().recycleTexture();
        }
        ThemeMenuOnlineElementPlane.recycleTexture();
    }

    public static ArrayList<ThemeOnlineItems> getOnlineLists() {
        ArrayList<ThemeOnlineItems> arrayList = new ArrayList<>();
        arrayList.add(new ThemeOnlineItems("Sweetie", "com.comos.themes.tsf.sweetie", b.d.theme_icon_sweetie, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Pinko", "com.comos.themes.tsf.pinko", b.d.theme_icon_pinko, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Blue", "com.comos.themes.tsf.blue", b.d.theme_icon_blue, true, 0));
        arrayList.add(new ThemeOnlineItems("Cartoon", "com.comos.themes.tsf.cartoonstyle", b.d.theme_icon_cartoon, true, 0));
        arrayList.add(new ThemeOnlineItems("Carton", "com.comos.themes.tsf.carton", b.d.theme_icon_carton, true, 0));
        arrayList.add(new ThemeOnlineItems("Noteboard", "com.comos.themes.tsf.noteboard", b.d.theme_icon_noteboard, true, 0));
        arrayList.add(new ThemeOnlineItems("Wood", "com.comos.themes.tsf.wood", b.d.theme_icon_wood, true, 0));
        arrayList.add(new ThemeOnlineItems("Leather", "com.comos.themes.tsf.leather.prime", b.d.theme_icon_leather, true, 0));
        arrayList.add(new ThemeOnlineItems("Cube", "com.comos.themes.cube", b.d.theme_icon_cube, true, 0));
        arrayList.add(new ThemeOnlineItems("Deep Blue", "com.comos.themes.deepblue", b.d.theme_icon_deepblue, true, 0));
        arrayList.add(new ThemeOnlineItems("Colorful", "com.comos.themes.tsf.colorful", b.d.theme_icon_colorful, true, 0));
        arrayList.add(new ThemeOnlineItems("Orange", "com.comos.themes.orange", b.d.theme_icon_orange, true, 0));
        arrayList.add(new ThemeOnlineItems("Flat UI Theme", "com.comos.themes.flat", b.d.theme_icon_flat, true, 0));
        arrayList.add(new ThemeOnlineItems("Gradient Theme", "com.comos.themes.gradient", b.d.theme_icon_gradient, true, 0));
        arrayList.add(new ThemeOnlineItems("Green Theme", "com.comos.themes.tsf.green.prime", b.d.theme_icon_green, true, 0));
        arrayList.add(new ThemeOnlineItems("Yosemite", "com.comos.themes.yosemite", b.d.theme_icon_yosemite, true, 0));
        arrayList.add(new ThemeOnlineItems("Merry Christmas", "com.comos.themes.merrychristmas", b.d.theme_icon_christmas, true, 0));
        return arrayList;
    }

    public static class ThemeOnlineItems {
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
