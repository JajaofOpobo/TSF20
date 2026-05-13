package org.acra;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import org.acra.collector.CrashReportData;
import org.acra.util.ToastSender;
/* loaded from: classes.dex */
public abstract class BaseCrashReportDialog extends Activity {
    private String mReportFileName;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ACRA.log.mo11d(ACRA.LOG_TAG, "CrashReportDialog extras=" + getIntent().getExtras());
        if (getIntent().getBooleanExtra("FORCE_CANCEL", false)) {
            ACRA.log.mo11d(ACRA.LOG_TAG, "Forced reports deletion.");
            cancelReports();
            finish();
            return;
        }
        this.mReportFileName = getIntent().getStringExtra(ACRAConstants.EXTRA_REPORT_FILE_NAME);
        ACRA.log.mo11d(ACRA.LOG_TAG, "Opening CrashReportDialog for " + this.mReportFileName);
        if (this.mReportFileName == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancelReports() {
        ACRA.getErrorReporter().deletePendingNonApprovedReports(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendCrash(String str, String str2) {
        CrashReportPersister crashReportPersister = new CrashReportPersister(getApplicationContext());
        try {
            ACRA.log.mo11d(ACRA.LOG_TAG, "Add user comment to " + this.mReportFileName);
            CrashReportData load = crashReportPersister.load(this.mReportFileName);
            ReportField reportField = ReportField.USER_COMMENT;
            if (str == null) {
                str = "";
            }
            load.put((CrashReportData) reportField, (ReportField) str);
            ReportField reportField2 = ReportField.USER_EMAIL;
            if (str2 == null) {
                str2 = "";
            }
            load.put((CrashReportData) reportField2, (ReportField) str2);
            crashReportPersister.store(load, this.mReportFileName);
        } catch (IOException e) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "User comment not added: ", e);
        }
        ACRA.log.mo5v(ACRA.LOG_TAG, "About to start SenderWorker from CrashReportDialog");
        ACRA.getErrorReporter().startSendingReports(false, true);
        int resDialogOkToast = ACRA.getConfig().resDialogOkToast();
        if (resDialogOkToast != 0) {
            ToastSender.sendToast(getApplicationContext(), resDialogOkToast, 1);
        }
    }
}
