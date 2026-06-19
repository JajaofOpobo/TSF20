package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tsf.shell.plugin.themepicker.utils.SelectionDotRenderer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperData extends e {
    private Context e;
    private Context f;
    private Resources g;

    public WallpaperData(ResolveInfo resolveInfo, Context context, int i, int i2) {
        super(context, i, i2);
        a(resolveInfo, context);
    }

    private void a(ResolveInfo resolveInfo, Context context) {
        this.e = context;
        if (resolveInfo == null) {
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("resolveInfo is null Error");
        }
        a(resolveInfo.activityInfo.packageName);
    }

    private void a(String str) {
        try {
            this.f = this.e.createPackageContext(str, 2);
            this.g = this.f.getResources();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected Bitmap a(Integer num) {
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("Start processBitmap:" + num);
        try {
            Thread.sleep(16L);
            return a(this.g, num.intValue(), this.a * 2, this.b * 2, null);
        } catch (InterruptedException e) {
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("InterruptedException Error:" + num);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.SelectionDotRenderer, com.tsf.shell.plugin.themepicker.utils.PercentToAlphaConverter
    protected Bitmap a(Object obj) {
        return a((Integer) obj);
    }
}
