package com.tsf.shell.theme.inside;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.manager.p179k.C3518a;
import com.tsf.shell.theme.inside.ThemeConfigManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemeElementChecker;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeManager {
    public static final String ACTION_APPLY_THEME = "com.tsf.shell.APPLY_THEME";
    public static final String CACHE_FOLDER3 = "theme_cache/";
    private static ThemeManager mInstance;
    public static ThemesMixManager mix;
    private ThemeConfigManager.ElementConfig mBaseThemeConfig;
    private BroadcastReceiver mBroadcastReceiver;
    private ThemeDescription mCacheThemeDescription;
    private Context mContext;
    private ThemeCacheFileManager mFileManager;
    private ArrayList<ThemeListener> mListeners;
    private ThemeListsManager mListsManager;

    /* loaded from: classes.dex */
    public static class ThemeListener {
        public void onThemeAdd(String str) {
        }

        public void onThemeRemove(String str) {
        }

        public void onThemeUpdate(String str) {
        }
    }

    public ThemeManager(Context context, ShellModel shellModel) {
        mInstance = this;
        C3518a.m2156a();
        this.mFileManager = new ThemeCacheFileManager(context);
        this.mFileManager.init();
        this.mListeners = new ArrayList<>();
        this.mListsManager = new ThemeListsManager(context);
        this.mContext = context;
        init();
        initBrocastReceiver();
    }

    public ThemeListsManager getListManager() {
        return this.mListsManager;
    }

    public ThemeCacheFileManager getFileManager() {
        return this.mFileManager;
    }

    public void addListener(ThemeListener themeListener) {
        this.mListeners.add(themeListener);
    }

    public void removeListener(ThemeListener themeListener) {
        this.mListeners.remove(themeListener);
    }

    public static void initThemeManager() {
        mInstance = new ThemeManager(Home.m6177b(), C3444a.m2357b());
    }

    public static ThemeManager getInstance() {
        return mInstance;
    }

    public void initBrocastReceiver() {
        this.mBroadcastReceiver = new BroadcastReceiver() { // from class: com.tsf.shell.theme.inside.ThemeManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, final Intent intent) {
                if (ThemeManager.ACTION_APPLY_THEME.equals(intent.getAction())) {
                    C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeManager.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ThemeManager.this.setTheme(intent.getStringExtra("applyTheme"));
                        }
                    }, 500L);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_APPLY_THEME);
        this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter);
    }

    public void destory(Context context) {
        if (this.mBroadcastReceiver != null) {
            try {
                context.unregisterReceiver(this.mBroadcastReceiver);
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptionList() {
        return null;
    }

    public ThemeDescription getCacheThemeDescription() {
        return this.mCacheThemeDescription;
    }

    private void init() {
        this.mBaseThemeConfig = new ThemeConfigManager.ElementConfig();
        ThemeConfigManager.ElementConfig baseTheme = ThemeConfigManager.getBaseTheme();
        this.mBaseThemeConfig.packagename = baseTheme.packagename;
        this.mBaseThemeConfig.version = baseTheme.version;
        refreshCacheThemeDescription();
        mix = new ThemesMixManager(this);
    }

    public void refreshCacheThemeDescription() {
        if (this.mCacheThemeDescription != null) {
            this.mCacheThemeDescription.destroy();
        }
        this.mCacheThemeDescription = ThemeUtils.parseCacheDescription(ThemeElementType.PARSER_CONFIG_ALL);
    }

    public void addTheme(String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeManager.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ThemeManager.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((ThemeListener) it.next()).onThemeAdd(null);
                }
            }
        });
    }

    public void removeTheme(final String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeManager.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ThemeManager.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((ThemeListener) it.next()).onThemeRemove(str);
                }
            }
        });
    }

    public void updateTheme(final String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeManager.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ThemeManager.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((ThemeListener) it.next()).onThemeUpdate(str);
                }
            }
        });
    }

    public boolean isCurrentTheme(String str) {
        return str.equals(this.mBaseThemeConfig.packagename);
    }

    public void setThemeFromAction(String str) {
    }

    public void setTheme(final String str) {
        if (C0869e.m10758l()) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.theme.inside.ThemeManager.5
                @Override // java.lang.Runnable
                public void run() {
                    ThemeManager.this.setTheme(str);
                }
            });
        } else if (str != null) {
            this.mFileManager.reset();
            Context context = null;
            try {
                context = C0853a.m10856d().createPackageContext(str, 3);
            } catch (PackageManager.NameNotFoundException e) {
            }
            ThemeElementChecker.paintThemeElement(context);
            try {
                ThemeParser.ThemeInfo themeInfo = ThemeParser.getThemeInfo(context);
                this.mBaseThemeConfig.packagename = themeInfo.packagename;
                this.mBaseThemeConfig.version = themeInfo.versionCode;
                mix.setTheme(ThemeElementType.PARSER_CONFIG_ALL, context, true);
                ThemeConfigManager.setBaseTheme(str, themeInfo.versionCode);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
