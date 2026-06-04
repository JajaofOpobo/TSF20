package com.tsf.shell;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.File;

/* loaded from: classes.dex */
final class ci implements View.OnClickListener {
    final /* synthetic */ VersionDetailActivity a;

    ci(VersionDetailActivity versionDetailActivity) {
        this.a = versionDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.share /* 2131624028 */:
                VersionDetailActivity versionDetailActivity = this.a;
                Intent intent = new Intent("android.intent.action.SEND");
                File file = new File(com.tsf.shell.f.a.a(versionDetailActivity, "version/version.jpg"));
                intent.putExtra("android.intent.extra.TEXT", "HIHIHIHIH");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                intent.setType("image/png");
                versionDetailActivity.startActivity(intent);
                break;
            case R.id.close /* 2131624029 */:
                try {
                    System.exit(0);
                } catch (Exception e) {
                }
                this.a.finish();
                break;
        }
    }
}
