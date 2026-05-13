package org.acra;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.acra.collector.CrashReportData;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SendWorker extends Thread {
    private final boolean approvePendingReports;
    private final Context context;
    private final CrashReportFileNameParser fileNameParser = new CrashReportFileNameParser();
    private final List<ReportSender> reportSenders;
    private final boolean sendOnlySilentReports;

    public SendWorker(Context context, List<ReportSender> list, boolean z, boolean z2) {
        this.context = context;
        this.reportSenders = list;
        this.sendOnlySilentReports = z;
        this.approvePendingReports = z2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.approvePendingReports) {
            approvePendingReports();
        }
        checkAndSendReports(this.context, this.sendOnlySilentReports);
    }

    private void approvePendingReports() {
        String[] crashReportFiles;
        ACRA.log.d(ACRA.LOG_TAG, "Mark all pending reports as approved.");
        for (String str : new CrashReportFinder(this.context).getCrashReportFiles()) {
            if (!this.fileNameParser.isApproved(str)) {
                File file = new File(this.context.getFilesDir(), str);
                File file2 = new File(this.context.getFilesDir(), str.replace(ACRAConstants.REPORTFILE_EXTENSION, "-approved.stacktrace"));
                if (!file.renameTo(file2)) {
                    ACRA.log.e(ACRA.LOG_TAG, "Could not rename approved report from " + file + " to " + file2);
                }
            }
        }
    }

    private void checkAndSendReports(Context context, boolean z) {
        int i = 0;
        ACRA.log.d(ACRA.LOG_TAG, "#checkAndSendReports - start");
        String[] crashReportFiles = new CrashReportFinder(context).getCrashReportFiles();
        Arrays.sort(crashReportFiles);
        for (String str : crashReportFiles) {
            if (!z || this.fileNameParser.isSilent(str)) {
                if (i >= 5) {
                    break;
                }
                ACRA.log.i(ACRA.LOG_TAG, "Sending file " + str);
                try {
                    sendCrashReport(new CrashReportPersister(context).load(str));
                    deleteFile(context, str);
                } catch (IOException e) {
                    ACRA.log.e(ACRA.LOG_TAG, "Failed to load crash report for " + str, e);
                    deleteFile(context, str);
                } catch (RuntimeException e2) {
                    ACRA.log.e(ACRA.LOG_TAG, "Failed to send crash reports for " + str, e2);
                    deleteFile(context, str);
                } catch (ReportSenderException e3) {
                    ACRA.log.e(ACRA.LOG_TAG, "Failed to send crash report for " + str, e3);
                }
                i++;
            }
        }
        ACRA.log.d(ACRA.LOG_TAG, "#checkAndSendReports - finish");
    }

    private void sendCrashReport(CrashReportData crashReportData) {
        if (!ACRA.isDebuggable() || ACRA.getConfig().sendReportsInDevMode()) {
            boolean z = false;
            for (ReportSender reportSender : this.reportSenders) {
                try {
                    reportSender.send(this.context, crashReportData);
                    z = true;
                } catch (ReportSenderException e) {
                    if (!z) {
                        throw e;
                    }
                    ACRA.log.w(ACRA.LOG_TAG, "ReportSender of class " + reportSender.getClass().getName() + " failed but other senders completed their task. ACRA will not send this report again.");
                }
            }
        }
    }

    private void deleteFile(Context context, String str) {
        if (!context.deleteFile(str)) {
            ACRA.log.w(ACRA.LOG_TAG, "Could not delete error report : " + str);
        }
    }
}
