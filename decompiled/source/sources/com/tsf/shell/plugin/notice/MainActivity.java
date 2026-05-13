package com.tsf.shell.plugin.notice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.tsf.shell.plugin.notice.g;
/* loaded from: classes.dex */
public class MainActivity extends Activity implements g.a {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new ImageView(this));
        g.a(this, this, true);
    }

    @Override // com.tsf.shell.plugin.notice.g.a
    public void a(int i) {
        e.c("onAppUpdate:" + i);
    }
}
