package org.acra.sender;

import android.content.Context;
import org.acra.collector.CrashReportData;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface ReportSender {
    void send(Context context, CrashReportData crashReportData);
}
