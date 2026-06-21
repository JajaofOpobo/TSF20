package com.tsf.shell.plugin.notice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class MainActivity extends Activity implements j {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new ImageView(this));
        i.a(this, this, true);
    }

    @Override // com.tsf.shell.plugin.notice.j
    public void a(int i) {
        e.c("onAppUpdate:" + i);
    }
}
