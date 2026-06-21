package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.utils.p;

/* loaded from: classes.dex */
public class a extends p {
    private Context e;
    private Context f;
    private Resources g;

    public a(ResolveInfo resolveInfo, Context context, int i, int i2) {
        super(context, i, i2);
        a(resolveInfo, context);
    }

    private void a(ResolveInfo resolveInfo, Context context) {
        this.e = context;
        if (resolveInfo == null) {
            g.b("resolveInfo is null Error");
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
        g.b("Start processBitmap:" + num);
        try {
            Thread.sleep(16L);
            return a(this.g, num.intValue(), this.a * 2, this.b * 2, null);
        } catch (InterruptedException e) {
            g.b("InterruptedException Error:" + num);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.p, com.tsf.shell.plugin.themepicker.utils.q
    protected Bitmap a(Object obj) {
        return a((Integer) obj);
    }
}
