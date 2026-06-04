package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ThemeDescription {
    public ThemeDockDescription dock;
    public ThemeIconDescription icon;
    private Context mContext;
    public CharSequence name;
    public ThemeOptionMenuDescription optionMenu;
    public String packagename;
    public ThemeShellDescription shell;
    public String themeName;
    public int versionCode;
    public String versionName;
    public ThemeWallpaperDescription wallpaper;
    public ThemeWidgetDescription widget;
    public boolean supportHD = false;
    public boolean isSecondParserMode = false;

    public ThemeDescription(Context context) {
        this.mContext = context;
        this.icon = new ThemeIconDescription(this.mContext);
    }

    public Context getContext() {
        return this.mContext;
    }

    public void destroy() {
        if (this.icon != null) {
            this.icon.destroy();
        }
        if (this.widget != null) {
            this.widget.destroy();
        }
        if (this.shell != null) {
            this.shell.destroy();
        }
        if (this.wallpaper != null) {
            this.wallpaper.destroy();
        }
        if (this.dock != null) {
            this.dock.destroy();
        }
        if (this.optionMenu != null) {
            this.optionMenu.destroy();
        }
        this.mContext = null;
        this.icon = null;
        this.widget = null;
        this.shell = null;
        this.dock = null;
        this.wallpaper = null;
        this.optionMenu = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(1:5)(2:32|(4:34|35|36|12)(1:39))|6|7|8|9|10|11|12|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:5)(2:32|(4:34|35|36|12)(1:39))|6|7|8|9|10|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getBitmp(Context context, String str, String str2, String str3, boolean z) {
        InputStream inputStream;
        Throwable th;
        Context createPackageContext;
        Bitmap bitmap = null;
        try {
            createPackageContext = context.createPackageContext(str, 3);
        } catch (Exception e) {
            InputStream inputStream2 = null;
        } catch (Throwable th2) {
            inputStream = null;
            th = th2;
        }
        try {
            if (z) {
                int identifier = createPackageContext.getResources().getIdentifier(str2, "drawable", createPackageContext.getPackageName());
                if (identifier == 0) {
                    InputStream inputStream3 = null;
                    try {
                        inputStream3.close();
                    } catch (Exception e2) {
                    }
                    return bitmap;
                }
                inputStream = createPackageContext.getResources().openRawResource(identifier);
            } else {
                inputStream = createPackageContext.getAssets().open(String.valueOf(str3) + "/" + str2 + ".png");
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            bitmap = decodeStream.copy(Bitmap.Config.ARGB_8888, false);
            decodeStream.recycle();
            inputStream.close();
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            try {
                inputStream.close();
            } catch (Exception e3) {
            }
            throw th;
        }
    }
}
