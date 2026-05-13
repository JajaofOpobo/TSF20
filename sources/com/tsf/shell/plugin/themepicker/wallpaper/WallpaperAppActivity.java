package com.tsf.shell.plugin.themepicker.wallpaper;

import android.os.Bundle;
import android.support.p002v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class WallpaperAppActivity extends FragmentActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(10101010);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        if (bundle == null) {
            m13715f().mo13569a().mo13497a(10101010, new View$OnClickListenerC3959b()).mo13498a();
        }
    }
}
