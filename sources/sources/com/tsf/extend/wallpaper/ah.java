package com.tsf.extend.wallpaper;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tsf.extend.ResourceIds;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ah extends com.tsf.extend.BaseDialog implements View.OnClickListener {
    private Context c;
    private static String b = "https://play.google.com/store/apps/details?id={pkg}&referrer=utm_source%3Dcml_themelist_wpapkkp";
    public static boolean a = false;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == ResourceIds.e.cancel) {
            dismiss();
        } else if (id == ResourceIds.e.cover || id == ResourceIds.e.content_layout || id == ResourceIds.e.wallpaper_store_root) {
            dismiss();
            com.tsf.extend.base.b.PagedListModel(this.c, b);
        }
    }

    @Override // com.tsf.extend.BaseDialog
    public void a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.8f;
    }

    @Override // com.tsf.extend.BaseDialog
    public FrameLayout.LayoutParams a() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    private void b() {
        View viewD = d();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewD.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.width = displayMetrics.widthPixels;
        layoutParams.height = displayMetrics.heightPixels;
        viewD.setLayoutParams(layoutParams);
    }

    @Override // com.tsf.extend.BaseDialog, android.app.Dialog
    public void show() {
        super.show();
        b();
    }
}
