package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.theme.inside.mix.menu.ThemeSettingMenu;
import com.tsf.shell.utils.C4175k;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeFeaturedMenu extends C2578b {
    public static final int NOTIF_POINT_VERSION_CODE_130 = 130;
    private C1040h mGridView;
    private C3595e.C3597a mNotifItem;
    private ArrayList<ThemeOnlineItems> mThemes;
    public ThemeSettingMenu manager;

    public ThemeFeaturedMenu(ThemeSettingMenu themeSettingMenu) {
        super(C1306b.C1315i.text_featured);
        this.manager = themeSettingMenu;
        this.mThemes = getOnlineLists();
        this.mGridView = new C1040h(C0892a.f2553D, themeSettingMenu.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 1.1f, C3566b.f11841c.f11763U * 1.2f);
        this.mGridView.m10160a(new C1024b() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return ThemeFeaturedMenu.this.mThemes.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C0975i c0975i2;
                if (c0975i == null) {
                    c0975i2 = new ThemeMenuOnlineElementPlane();
                    c0975i2.calAABB();
                } else {
                    c0975i2 = c0975i;
                }
                ThemeOnlineItems themeOnlineItems = (ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i);
                ThemeMenuOnlineElementPlane themeMenuOnlineElementPlane = (ThemeMenuOnlineElementPlane) c0975i2;
                themeMenuOnlineElementPlane.icon.textures().clear();
                themeMenuOnlineElementPlane.icon.textures().addElement(themeOnlineItems.getTexture());
                if (themeOnlineItems.getNotifPointState()) {
                    themeMenuOnlineElementPlane.enableNotifPoint();
                } else {
                    themeMenuOnlineElementPlane.disableNotifPoint();
                }
                return c0975i2;
            }
        });
        this.mGridView.m10159a(new C1036f() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C4175k.m671a(Home.m6177b(), ((ThemeOnlineItems) ThemeFeaturedMenu.this.mThemes.get(i)).packageName);
            }
        });
        this.mNotifItem = C3359a.f11087a.m1927a(this, C3595e.f11917b);
        if (this.mNotifItem.m1919a()) {
            Iterator<ThemeOnlineItems> it = this.mThemes.iterator();
            while (it.hasNext()) {
                ThemeOnlineItems next = it.next();
                if (this.mNotifItem.f11938c == next.versionCode) {
                    next.enableNotifPoint();
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.mGridView;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        super.onShow();
        this.mGridView.m10143d();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        super.onHide();
        this.mNotifItem.m1916b();
        Iterator<ThemeOnlineItems> it = this.mThemes.iterator();
        while (it.hasNext()) {
            it.next().disableNotifPoint();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mGridView.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
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
        arrayList.add(new ThemeOnlineItems("Sweetie", "com.comos.themes.tsf.sweetie", C1306b.C1310d.theme_icon_sweetie, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Pinko", "com.comos.themes.tsf.pinko", C1306b.C1310d.theme_icon_pinko, true, NOTIF_POINT_VERSION_CODE_130));
        arrayList.add(new ThemeOnlineItems("Blue", "com.comos.themes.tsf.blue", C1306b.C1310d.theme_icon_blue, true, 0));
        arrayList.add(new ThemeOnlineItems("Cartoon", "com.comos.themes.tsf.cartoonstyle", C1306b.C1310d.theme_icon_cartoon, true, 0));
        arrayList.add(new ThemeOnlineItems("Carton", "com.comos.themes.tsf.carton", C1306b.C1310d.theme_icon_carton, true, 0));
        arrayList.add(new ThemeOnlineItems("Noteboard", "com.comos.themes.tsf.noteboard", C1306b.C1310d.theme_icon_noteboard, true, 0));
        arrayList.add(new ThemeOnlineItems("Wood", "com.comos.themes.tsf.wood", C1306b.C1310d.theme_icon_wood, true, 0));
        arrayList.add(new ThemeOnlineItems("Leather", "com.comos.themes.tsf.leather.prime", C1306b.C1310d.theme_icon_leather, true, 0));
        arrayList.add(new ThemeOnlineItems("Cube", "com.comos.themes.cube", C1306b.C1310d.theme_icon_cube, true, 0));
        arrayList.add(new ThemeOnlineItems("Deep Blue", "com.comos.themes.deepblue", C1306b.C1310d.theme_icon_deepblue, true, 0));
        arrayList.add(new ThemeOnlineItems("Colorful", "com.comos.themes.tsf.colorful", C1306b.C1310d.theme_icon_colorful, true, 0));
        arrayList.add(new ThemeOnlineItems("Orange", "com.comos.themes.orange", C1306b.C1310d.theme_icon_orange, true, 0));
        arrayList.add(new ThemeOnlineItems("Flat UI Theme", "com.comos.themes.flat", C1306b.C1310d.theme_icon_flat, true, 0));
        arrayList.add(new ThemeOnlineItems("Gradient Theme", "com.comos.themes.gradient", C1306b.C1310d.theme_icon_gradient, true, 0));
        arrayList.add(new ThemeOnlineItems("Green Theme", "com.comos.themes.tsf.green.prime", C1306b.C1310d.theme_icon_green, true, 0));
        arrayList.add(new ThemeOnlineItems("Yosemite", "com.comos.themes.yosemite", C1306b.C1310d.theme_icon_yosemite, true, 0));
        arrayList.add(new ThemeOnlineItems("Merry Christmas", "com.comos.themes.merrychristmas", C1306b.C1310d.theme_icon_christmas, true, 0));
        return arrayList;
    }

    /* loaded from: classes.dex */
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
                this.iconTexture = ThemeMixerUtils.createIconTexture(C3566b.f11841c, this.title, this.icon);
            }
            return this.iconTexture;
        }

        public void recycleTexture() {
            if (this.iconTexture != null) {
                C0853a.m10853g().m10543a(this.iconTexture);
                this.iconTexture = null;
            }
        }
    }
}
