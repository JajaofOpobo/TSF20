package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tsf.shell.plugin.themepicker.utils.AbstractC3952f;
/* renamed from: com.tsf.shell.plugin.themepicker.theme.a */
/* loaded from: classes.dex */
public class C3907a extends AbstractC3952f {

    /* renamed from: a */
    private PackageManager f12804a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3907a(PackageManager packageManager, Context context) {
        super(context);
        this.f12804a = packageManager;
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3952f
    /* renamed from: a */
    protected Bitmap mo998a(Object obj) {
        return m1208a((ResolveInfo) obj);
    }

    /* renamed from: a */
    private Bitmap m1208a(ResolveInfo resolveInfo) {
        Drawable loadIcon = resolveInfo.loadIcon(this.f12804a);
        if (loadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) loadIcon).getBitmap();
        }
        return null;
    }
}
