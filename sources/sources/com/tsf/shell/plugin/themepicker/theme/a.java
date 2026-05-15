package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tsf.shell.plugin.themepicker.utils.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends f {
    private PackageManager a;

    protected a(PackageManager packageManager, Context context) {
        super(context);
        this.a = packageManager;
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.f
    protected Bitmap a(Object obj) {
        return a((ResolveInfo) obj);
    }

    private Bitmap a(ResolveInfo resolveInfo) {
        Drawable drawableLoadIcon = resolveInfo.loadIcon(this.a);
        if (drawableLoadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableLoadIcon).getBitmap();
        }
        return null;
    }
}
