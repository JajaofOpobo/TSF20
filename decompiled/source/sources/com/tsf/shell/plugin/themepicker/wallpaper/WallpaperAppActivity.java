package com.tsf.shell.plugin.themepicker.wallpaper;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class WallpaperAppActivity extends FragmentActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(10101010);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        if (bundle == null) {
            f().a().a(10101010, new b()).a();
        }
    }
}
