package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.au;
import android.support.v7.a.a;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private Context a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.a = context;
    }

    public int a() {
        return this.a.getResources().getInteger(a.g.abc_max_action_buttons);
    }

    public boolean b() {
        return Build.VERSION.SDK_INT >= 19 || !au.b(ViewConfiguration.get(this.a));
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d() {
        return this.a.getApplicationInfo().targetSdkVersion >= 16 ? this.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs) : this.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb);
    }

    public int e() {
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, a.k.ActionBar, a.C0012a.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(a.k.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g() {
        return this.a.getResources().getDimensionPixelSize(a.d.abc_action_bar_stacked_tab_max_width);
    }
}
