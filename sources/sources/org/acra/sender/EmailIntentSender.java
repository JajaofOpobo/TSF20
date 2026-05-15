package org.acra.sender;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.collector.CrashReportData;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EmailIntentSender implements ReportSender {
    private final Context mContext;

    public EmailIntentSender(Context context) {
        this.mContext = context;
    }

    @Override // org.acra.sender.ReportSender
    public void send(Context context, CrashReportData crashReportData) {
        String str = String.valueOf(this.mContext.getPackageName()) + " Crash Report";
        String strBuildBody = buildBody(crashReportData);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("mailto", ACRA.getConfig().mailTo(), null));
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", strBuildBody);
        this.mContext.startActivity(intent);
    }

    private String buildBody(CrashReportData crashReportData) {
        ReportField[] reportFieldArrCustomReportContent = ACRA.getConfig().customReportContent();
        ReportField[] reportFieldArr = reportFieldArrCustomReportContent.length == 0 ? ACRAConstants.DEFAULT_MAIL_REPORT_FIELDS : reportFieldArrCustomReportContent;
        StringBuilder sb = new StringBuilder();
        for (ReportField reportField : reportFieldArr) {
            sb.append(reportField.toString()).append("=");
            sb.append((String) crashReportData.get(reportField));
            sb.append('\n');
        }
        return sb.toString();
    }
}
