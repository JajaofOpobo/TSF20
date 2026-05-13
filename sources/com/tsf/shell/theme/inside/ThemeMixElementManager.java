package com.tsf.shell.theme.inside;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.Home;
import com.tsf.shell.activity.p089a.C2214a;
import com.tsf.shell.plugin.theme.ThemeElementPicker;
import com.tsf.shell.theme.inside.ThemeConfigManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class ThemeMixElementManager {
    private ThemeManager mManager;
    private int mParserType;
    private String mThemeName;
    private String mThemePackagename;
    private int mThemeVersionCode;
    private String mask;
    private String name;
    private boolean isEnable = false;
    ArrayList<DynamicThemeElement> mListeners = new ArrayList<>();
    protected ThemeMenuMixElementPlane mPreview = new ThemeMenuMixElementPlane() { // from class: com.tsf.shell.theme.inside.ThemeMixElementManager.1
        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
        public Bitmap getPreviewBitmap() {
            return ThemeMixElementManager.this.getPreviewBitmap((int) C0892a.m10742a(180.0f), (int) C0892a.m10742a(180.0f));
        }

        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
        public String getTitle() {
            return ThemeMixElementManager.this.getTitle();
        }

        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
        public String getSummary() {
            return ThemeMixElementManager.this.getSummary();
        }

        @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
        public void onClick() {
            C4187w.m614b();
            ThemeMixElementManager.this.openThemeElementSelecter();
        }
    };

    /* loaded from: classes.dex */
    public interface DynamicThemeElement {
        ThemeMixElementManager getListenerTarget();

        void onReloadTheme(ThemeDescription themeDescription);

        void setListenerTarget(ThemeMixElementManager themeMixElementManager);
    }

    public abstract Bitmap getPreviewBitmap(int i, int i2);

    public abstract void onReloadTheme();

    public ThemeMixElementManager(ThemeManager themeManager, int i, String str) {
        this.mParserType = i;
        this.mManager = themeManager;
        this.mask = str;
        this.name = ThemesMixManager.getTypeTitle(C0853a.m10856d(), i);
        ThemeConfigManager.ElementConfig themeMixConfig = ThemeConfigManager.getThemeMixConfig(str);
        setThemeInformation(themeMixConfig.name, themeMixConfig.packagename, themeMixConfig.version, false);
    }

    public String getTitle() {
        return this.name;
    }

    public String getSummary() {
        return this.mThemeName;
    }

    public ThemeManager getManager() {
        return this.mManager;
    }

    public void setTheme(ThemeParser.ThemeInfo themeInfo) {
        setThemeInformation(themeInfo.name, themeInfo.packagename, themeInfo.versionCode, true);
        refresh();
    }

    public void setThemeInformation(String str, String str2, int i, boolean z) {
        this.mThemeName = str;
        this.mThemePackagename = str2;
        this.mThemeVersionCode = i;
        if (z) {
            ThemeConfigManager.saveThemeMixConfig(this.mask, this.mThemeName, this.mThemePackagename, this.mThemeVersionCode);
        }
    }

    public DynamicTextureElement getTextureElement(String str, int i, int i2, boolean z) {
        DynamicTextureElement dynamicTextureElement = new DynamicTextureElement(getTheme(), this.mParserType, str, i, i2);
        addElementListener(dynamicTextureElement);
        return dynamicTextureElement;
    }

    public DynamicTextureElement getTextureElement(String str, int i, int i2) {
        DynamicTextureElement dynamicTextureElement = new DynamicTextureElement(getTheme(), this.mParserType, str, i, i2);
        addElementListener(dynamicTextureElement);
        return dynamicTextureElement;
    }

    public ThemeDescription getTheme() {
        return this.mManager.getCacheThemeDescription();
    }

    public String getThemeName() {
        return this.mThemeName;
    }

    public String getThemePackageName() {
        return this.mThemePackagename;
    }

    public String getThemeMarkName(String str) {
        return str + "_" + this.mThemePackagename + "_" + this.mThemeVersionCode;
    }

    public int getThemeVersionCode() {
        return this.mThemeVersionCode;
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public void enable() {
        this.isEnable = true;
    }

    public void disable() {
        this.isEnable = false;
    }

    public C0980j getPreview() {
        return this.mPreview;
    }

    public int getType() {
        return this.mParserType;
    }

    public DynamicTextureElement getDynamicTextureElement(ThemeDescription themeDescription, int i, String str, int i2, int i3) {
        Iterator<DynamicThemeElement> it = this.mListeners.iterator();
        while (it.hasNext()) {
            DynamicThemeElement next = it.next();
            if (next instanceof DynamicTextureElement) {
                DynamicTextureElement dynamicTextureElement = (DynamicTextureElement) next;
                if (dynamicTextureElement.resourceName.equals(str)) {
                    return dynamicTextureElement;
                }
            }
        }
        DynamicTextureElement dynamicTextureElement2 = new DynamicTextureElement(themeDescription, i, str, i2, i3);
        addElementListener(dynamicTextureElement2);
        return dynamicTextureElement2;
    }

    public void addElementListener(DynamicThemeElement dynamicThemeElement) {
        dynamicThemeElement.setListenerTarget(this);
        this.mListeners.add(dynamicThemeElement);
    }

    public void removeElementListener(DynamicThemeElement dynamicThemeElement) {
        if (dynamicThemeElement.getListenerTarget() == this) {
            dynamicThemeElement.setListenerTarget(null);
            this.mListeners.remove(dynamicThemeElement);
        }
    }

    private void reloadTheme(ThemeDescription themeDescription) {
        Iterator<DynamicThemeElement> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onReloadTheme(themeDescription);
        }
    }

    public void openThemeElementSelecter() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeMixElementManager.2
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.putExtra("type", ThemeMixElementManager.this.getType());
                intent.setClass(Home.m6177b(), ThemeElementPicker.class);
                new C2214a() { // from class: com.tsf.shell.theme.inside.ThemeMixElementManager.2.1
                    @Override // com.tsf.shell.activity.p089a.C2214a
                    /* renamed from: a */
                    public void mo738a(int i, Intent intent2) {
                        if (i == -1) {
                            ThemeManager.mix.setTheme(ThemeMixElementManager.this.getType(), intent2.getStringExtra("packagename"), true);
                        }
                    }
                }.m6078a(intent);
            }
        });
    }

    public void refresh() {
        reloadTheme(this.mManager.getCacheThemeDescription());
        onReloadTheme();
        updatePreview();
    }

    public boolean themeUpdate(String str) {
        return str.equals(getThemePackageName());
    }

    public boolean themeRemove(String str) {
        return str.equals(getThemePackageName());
    }

    public void updatePreview() {
        this.mPreview.update();
    }

    public void recyclePreview() {
        this.mPreview.recycle();
    }
}
