package com.tsf.shell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public class VersionDetailActivity extends Activity {
    boolean a = false;

    public static void a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, VersionDetailActivity.class);
        activity.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                try {
                    System.exit(0);
                } catch (Exception e) {
                }
                return true;
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.version_activity_main);
        new Handler();
        findViewById(R.id.scrollView1);
        findViewById(R.id.scrollListView1);
        getWindowManager().getDefaultDisplay().getHeight();
        ci ciVar = new ci(this);
        findViewById(R.id.close).setOnClickListener(ciVar);
        findViewById(R.id.share).setOnClickListener(ciVar);
    }
}
