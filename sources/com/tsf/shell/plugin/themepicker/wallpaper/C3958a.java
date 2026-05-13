package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.utils.C3951e;
/* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.a */
/* loaded from: classes.dex */
public class C3958a extends C3951e {

    /* renamed from: e */
    private Context f12972e;

    /* renamed from: f */
    private Context f12973f;

    /* renamed from: g */
    private Resources f12974g;

    public C3958a(ResolveInfo resolveInfo, Context context, int i, int i2) {
        super(context, i, i2);
        m1000a(resolveInfo, context);
    }

    /* renamed from: a */
    private void m1000a(ResolveInfo resolveInfo, Context context) {
        this.f12972e = context;
        if (resolveInfo == null) {
            C3851e.m1317b("resolveInfo is null Error");
        }
        m997a(resolveInfo.activityInfo.packageName);
    }

    /* renamed from: a */
    private void m997a(String str) {
        try {
            this.f12973f = this.f12972e.createPackageContext(str, 2);
            this.f12974g = this.f12973f.getResources();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    protected Bitmap m999a(Integer num) {
        C3851e.m1317b("Start processBitmap:" + num);
        try {
            Thread.sleep(16L);
            return m1049a(this.f12974g, num.intValue(), this.f12949a * 2, this.f12950b * 2, null);
        } catch (InterruptedException e) {
            C3851e.m1317b("InterruptedException Error:" + num);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.C3951e, com.tsf.shell.plugin.themepicker.utils.AbstractC3952f
    /* renamed from: a */
    protected Bitmap mo998a(Object obj) {
        return m999a((Integer) obj);
    }
}
