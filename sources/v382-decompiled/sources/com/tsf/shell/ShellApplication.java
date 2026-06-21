package com.tsf.shell;

import android.app.Application;
import org.acra.ACRA;
import org.acra.ACRAConfiguration;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

@ReportsCrashes(formUri = "http://collector.tracepot.com/69fa0440", mode = ReportingInteractionMode.DIALOG, resDialogCommentPrompt = 1, resDialogIcon = 0, resDialogNegativeButtonText = 1, resDialogOkToast = 1, resDialogPositiveButtonText = 1, resDialogText = 1, resDialogTitle = 1)
/* loaded from: classes.dex */
public class ShellApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ACRA.init(this);
        ACRAConfiguration config = ACRA.getConfig();
        config.setResDialogText(R.string.crash_dialog_text);
        config.setResDialogTitle(R.string.crash_dialog_title);
        config.setResDialogCommentPrompt(R.string.crash_dialog_comment_prompt);
        config.setResDialogOkToast(R.string.crash_dialog_ok_toast);
        config.setResDialogPositiveButtonText(R.string.crash_yes);
        config.setResDialogNegativeButtonText(R.string.crash_no);
        com.tsf.shell.manager.bind.a.a(this);
        com.tsf.shell.manager.bind.a.a();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        com.tsf.shell.manager.bind.a.a().d();
    }
}
