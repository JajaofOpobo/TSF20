package com.tsf.extend.wallpaper;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogC1546g;
import com.tsf.extend.base.C1367b;
/* renamed from: com.tsf.extend.wallpaper.ah */
/* loaded from: classes.dex */
public class View$OnClickListenerC2056ah extends DialogC1546g implements View.OnClickListener {

    /* renamed from: c */
    private Context f6712c;

    /* renamed from: b */
    private static String f6711b = "https://play.google.com/store/apps/details?id={pkg}&referrer=utm_source%3Dcml_themelist_wpapkkp";

    /* renamed from: a */
    public static boolean f6710a = false;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.cancel) {
            dismiss();
        } else if (id == C1536f.C1541e.cover || id == C1536f.C1541e.content_layout || id == C1536f.C1541e.wallpaper_store_root) {
            dismiss();
            C1367b.m8878a(this.f6712c, f6711b);
        }
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public void mo6561a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.8f;
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public FrameLayout.LayoutParams mo6413a() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    /* renamed from: b */
    private void m6560b() {
        View d = m8295d();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f6712c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.width = displayMetrics.widthPixels;
        layoutParams.height = displayMetrics.heightPixels;
        d.setLayoutParams(layoutParams);
    }

    @Override // com.tsf.extend.DialogC1546g, android.app.Dialog
    public void show() {
        super.show();
        m6560b();
    }
}
