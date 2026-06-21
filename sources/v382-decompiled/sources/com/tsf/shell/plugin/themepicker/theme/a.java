package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tsf.shell.plugin.themepicker.utils.q;

/* loaded from: classes.dex */
public class a extends q {
    private PackageManager a;

    protected a(PackageManager packageManager, Context context) {
        super(context);
        this.a = packageManager;
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
    protected Bitmap a(Object obj) {
        return a((ResolveInfo) obj);
    }

    private Bitmap a(ResolveInfo resolveInfo) {
        Drawable loadIcon = resolveInfo.loadIcon(this.a);
        if (loadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) loadIcon).getBitmap();
        }
        return null;
    }
}
