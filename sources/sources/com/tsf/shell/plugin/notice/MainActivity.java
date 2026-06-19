package com.tsf.shell.plugin.notice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.tsf.shell.plugin.notice.NoticeStateProvider;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MainActivity extends Activity implements NoticeStateProvider.a {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new ImageView(this));
        NoticeStateProvider.a(this, this, true);
    }

    @Override // com.tsf.shell.plugin.notice.NoticeStateProvider.a
    public void a(int i) {
        NoticeEvent.c("onAppUpdate:" + i);
    }
}
