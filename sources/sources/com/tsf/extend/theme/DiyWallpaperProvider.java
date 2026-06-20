package com.tsf.extend.theme;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DiyWallpaperProvider extends AbstractThemeProvider {
    private String a;
    private boolean b;

    @Override // com.tsf.extend.theme.ThemeModel
    public int a() {
        return 3;
    }

    @Override // com.tsf.extend.theme.AbstractThemeProvider
    protected String b() {
        return "theme/preview";
    }

    @Override // com.tsf.extend.theme.AbstractThemeProvider
    protected String c_() {
        return "theme/hd_preview";
    }

    @Override // com.tsf.extend.theme.AbstractThemeProvider
    public String d() {
        return "CMT_";
    }

    @Override // com.tsf.extend.theme.AbstractThemeProvider
    public File a(Context context) {
        File fileG = g(context);
        if (fileG == null) {
            return null;
        }
        File file = new File(fileG, "theme/wallpaper");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "wallpaper_background.jpg");
    }

    @Override // com.tsf.extend.theme.AbstractThemeProvider
    public String a(String str) {
        return I() + "/theme/icons/" + str;
    }

    public boolean e() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public String f() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }
}
