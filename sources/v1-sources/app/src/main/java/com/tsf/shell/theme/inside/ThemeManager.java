package com.tsf.shell.theme.inside;

import android.content.Context;
import android.content.IntentFilter;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
import com.tsf.shell.ShellModel;
import com.tsf.shell.a.y;
import com.tsf.shell.a.z;
import com.tsf.shell.theme.inside.element.ThemeIconManager;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeManager {
    public static final String ACTION_APPLY_THEME = "com.tsf.shell.APPLY_THEME";
    public static int VERSION_CODE = 2;
    private static ThemeManager mInstance;
    public static ThemesMixManager mix;
    private z config;
    boolean isInitSurplus = false;
    private Context mContext;
    private ShellModel mModel;
    private ThemeDescription mSystemThemeDescription;
    private ArrayList mThemeAppInfoLists;
    private ThemeDescription mThemeDescription;
    private ArrayList mThemeDescriptionList;

    public ThemeManager(Context context, ShellModel shellModel) {
        mInstance = this;
        this.mModel = shellModel;
        this.mContext = context;
        init();
        initBrocastReceiver();
    }

    public static void initThemeManager() {
        Home d = Home.d();
        Home.d().getApplication();
        mInstance = new ThemeManager(d, ShellApplication.a());
    }

    public static ThemeManager getInstance() {
        return mInstance;
    }

    public void initBrocastReceiver() {
        a aVar = new a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_APPLY_THEME);
        this.mContext.registerReceiver(aVar, intentFilter);
    }

    public ArrayList getThemeDescriptionList() {
        return this.mThemeDescriptionList;
    }

    public ThemeDescription getCurrentThemeDescription() {
        return this.mThemeDescription;
    }

    public ThemeDescription getSystemThemeDescription() {
        return this.mSystemThemeDescription;
    }

    public boolean isThemeExist(String str) {
        Iterator it = this.mThemeDescriptionList.iterator();
        while (it.hasNext()) {
            if (((ThemeDescription) it.next()).packagename.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ThemeDescription getThemeByPackagename(String str) {
        Iterator it = this.mThemeDescriptionList.iterator();
        while (it.hasNext()) {
            ThemeDescription themeDescription = (ThemeDescription) it.next();
            if (themeDescription.packagename.equals(str)) {
                return themeDescription;
            }
        }
        return null;
    }

    public z getConfig() {
        return this.config;
    }

    private void init() {
        mix = new ThemesMixManager(this);
        this.config = y.a();
        this.mThemeDescriptionList = new ArrayList();
        System.currentTimeMillis();
        this.mThemeAppInfoLists = this.mModel.a(this.mContext);
        Iterator it = this.mThemeAppInfoLists.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            if (bVar.c.getPackageName().equals(this.mContext.getPackageName())) {
                this.mSystemThemeDescription = parseThemeDescription(bVar, ThemeParser.PARSER_CONFIG_ALL);
                this.mSystemThemeDescription.icon.isSystem = true;
                this.mSystemThemeDescription.dock.isSystem = true;
                this.mSystemThemeDescription.optionMenu.isSystem = true;
                this.mSystemThemeDescription.widget.folder.isSystem = true;
                this.mSystemThemeDescription.widget.contact.isSystem = true;
                this.mSystemThemeDescription.wallpaper.isSystem = true;
                this.mSystemThemeDescription.shell.isSystem = true;
                this.mThemeDescriptionList.add(this.mSystemThemeDescription);
                this.mThemeAppInfoLists.remove(bVar);
                break;
            }
        }
        Iterator it2 = this.mThemeAppInfoLists.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.h.b bVar2 = (com.tsf.shell.h.b) it2.next();
            if (bVar2.c.getPackageName().equals(this.config.a)) {
                this.mThemeDescription = parseThemeDescription(bVar2, ThemeParser.PARSER_CONFIG_ALL);
                if (this.mThemeDescription != null) {
                    this.mThemeDescriptionList.add(this.mThemeDescription);
                }
            }
        }
        if (this.mThemeDescription == null) {
            this.mThemeDescription = this.mSystemThemeDescription;
        }
        ap.a = this.mThemeDescription.icon.globalScale;
        if (this.config.b) {
            this.config.b = false;
            saveConfigurationToDatabase();
            if (this.mThemeDescription.wallpaper != null) {
                this.mThemeDescription.wallpaper.setDefaultWallpaper();
            }
        }
        mix.iniConfiguration();
    }

    public void onReady() {
    }

    public void initSurplus() {
        ThemeDescription parseThemeDescription;
        if (!this.isInitSurplus) {
            this.isInitSurplus = true;
            b bVar = new b(this);
            com.censivn.C3DEngine.a.a();
            w.a(bVar);
            Iterator it = this.mThemeAppInfoLists.iterator();
            while (it.hasNext()) {
                com.tsf.shell.h.b bVar2 = (com.tsf.shell.h.b) it.next();
                if (!isThemeExist(bVar2.c.getPackageName()) && (parseThemeDescription = parseThemeDescription(bVar2, ThemeParser.PARSER_CONFIG_SURPLUS)) != null) {
                    this.mThemeDescriptionList.add(parseThemeDescription);
                }
            }
            c cVar = new c(this);
            com.censivn.C3DEngine.a.a();
            w.a(cVar);
        }
    }

    private ThemeDescription parseThemeDescription(com.tsf.shell.h.b bVar, int i) {
        ThemeParser themeParser;
        try {
            themeParser = new ThemeParser(this.mContext.createPackageContext(bVar.c.getPackageName(), 3));
        } catch (Exception e) {
            e = e;
            themeParser = null;
        }
        try {
            themeParser.parser(i);
            ThemeDescription themeDescription = themeParser.getThemeDescription();
            themeDescription.name = bVar.a;
            themeDescription.packagename = bVar.c.getPackageName();
            return themeDescription;
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            if (themeParser != null) {
                themeParser.exceptionClose();
            }
            return null;
        }
    }

    public void addTheme(ArrayList arrayList, boolean z) {
        ThemeDescription parseThemeDescription;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            if (!isThemeExist(bVar.c.getPackageName()) && (parseThemeDescription = parseThemeDescription(bVar, ThemeParser.PARSER_CONFIG_SURPLUS)) != null) {
                this.mThemeDescriptionList.add(parseThemeDescription);
            }
        }
    }

    public void removeTheme(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String packageName = ((com.tsf.shell.h.b) it.next()).c.getPackageName();
            if (packageName.equals(this.mThemeDescription.packagename)) {
                Home.d().a();
            } else {
                Iterator it2 = this.mThemeDescriptionList.iterator();
                while (it2.hasNext()) {
                    ThemeDescription themeDescription = (ThemeDescription) it2.next();
                    if (themeDescription.packagename.equals(packageName)) {
                        arrayList2.add(themeDescription);
                    }
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ThemeDescription themeDescription2 = (ThemeDescription) it3.next();
            themeDescription2.destroy();
            this.mThemeDescriptionList.remove(themeDescription2);
        }
    }

    public void updateTheme(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.h.b bVar = (com.tsf.shell.h.b) it.next();
            String packageName = bVar.c.getPackageName();
            if (packageName.equals(this.mThemeDescription.packagename)) {
                Home.d().a();
            } else {
                Iterator it2 = this.mThemeDescriptionList.iterator();
                while (it2.hasNext()) {
                    ThemeDescription themeDescription = (ThemeDescription) it2.next();
                    if (themeDescription.packagename.equals(packageName)) {
                        ThemeDescription parseThemeDescription = parseThemeDescription(bVar, ThemeParser.PARSER_CONFIG_SURPLUS);
                        if (parseThemeDescription != null) {
                            int indexOf = this.mThemeDescriptionList.indexOf(themeDescription);
                            themeDescription.destroy();
                            this.mThemeDescriptionList.set(indexOf, parseThemeDescription);
                        } else {
                            arrayList2.add(themeDescription);
                        }
                    }
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ThemeDescription themeDescription2 = (ThemeDescription) it3.next();
            themeDescription2.destroy();
            this.mThemeDescriptionList.remove(themeDescription2);
        }
    }

    public void saveConfigurationToDatabase() {
        y.a(this.config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheme(String str) {
        if (str != null) {
            ThemeDescription themeByPackagename = getThemeByPackagename("!23123");
            if (themeByPackagename != null || (themeByPackagename = getThemeByThemePackagename(str, 2)) != null) {
                this.config.a = str;
                this.config.b = true;
                ThemeIconManager.setConfiguration(this.config, themeByPackagename.icon);
                this.config.c = "";
                this.config.g = "";
                this.config.f = "";
                this.config.d = "";
                this.config.e = "";
                this.config.h = "";
                saveConfigurationToDatabase();
                Home.d().c();
            }
        }
    }

    private static ThemeDescription getThemeByThemePackagename(String str, int i) {
        if (str != null) {
            try {
                Context c = com.censivn.C3DEngine.a.c();
                com.censivn.C3DEngine.a.c();
                com.censivn.C3DEngine.a.c();
                ThemeParser themeParser = new ThemeParser(c.createPackageContext(str, 3));
                themeParser.parser(i);
                ThemeDescription themeDescription = themeParser.getThemeDescription();
                if (themeDescription != null) {
                    return themeDescription;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
}
