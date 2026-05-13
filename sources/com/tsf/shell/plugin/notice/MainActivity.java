package com.tsf.shell.plugin.notice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.tsf.shell.plugin.notice.C3821g;
/* loaded from: classes.dex */
public class MainActivity extends Activity implements C3821g.InterfaceC3823a {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new ImageView(this));
        C3821g.m1366a(this, this, true);
    }

    @Override // com.tsf.shell.plugin.notice.C3821g.InterfaceC3823a
    /* renamed from: a */
    public void mo1360a(int i) {
        C3817e.m1369c("onAppUpdate:" + i);
    }
}
