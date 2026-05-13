package org.acra;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.format.Time;
import java.io.File;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.acra.collector.Compatibility;
import org.acra.collector.ConfigurationCollector;
import org.acra.collector.CrashReportData;
import org.acra.collector.CrashReportDataFactory;
import org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat;
import org.acra.jraf.android.util.activitylifecyclecallbackscompat.ApplicationHelper;
import org.acra.sender.EmailIntentSender;
import org.acra.sender.HttpSender;
import org.acra.sender.ReportSender;
import org.acra.util.PackageManagerWrapper;
import org.acra.util.ToastSender;
/* loaded from: classes.dex */
public class ErrorReporter implements Thread.UncaughtExceptionHandler {
    private static final ExceptionHandlerInitializer NULL_EXCEPTION_HANDLER_INITIALIZER = new ExceptionHandlerInitializer() { // from class: org.acra.ErrorReporter.1
        @Override // org.acra.ExceptionHandlerInitializer
        public void initializeExceptionHandler(ErrorReporter errorReporter) {
        }
    };
    private static int mNotificationCounter = 0;
    private final CrashReportDataFactory crashReportDataFactory;
    private boolean enabled;
    private final Application mContext;
    private final Thread.UncaughtExceptionHandler mDfltExceptionHandler;
    private final SharedPreferences prefs;
    private final List<ReportSender> mReportSenders = new ArrayList();
    private final CrashReportFileNameParser fileNameParser = new CrashReportFileNameParser();
    private WeakReference<Activity> lastActivityCreated = new WeakReference<>(null);
    private boolean toastWaitEnded = true;
    private volatile ExceptionHandlerInitializer exceptionHandlerInitializer = NULL_EXCEPTION_HANDLER_INITIALIZER;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ErrorReporter(Application application, SharedPreferences sharedPreferences, boolean z) {
        this.enabled = false;
        this.mContext = application;
        this.prefs = sharedPreferences;
        this.enabled = z;
        String collectConfiguration = ACRA.getConfig().getReportFields().contains(ReportField.INITIAL_CONFIGURATION) ? ConfigurationCollector.collectConfiguration(this.mContext) : null;
        Time time = new Time();
        time.setToNow();
        if (Compatibility.getAPILevel() >= 14) {
            ApplicationHelper.registerActivityLifecycleCallbacks(application, new ActivityLifecycleCallbacksCompat() { // from class: org.acra.ErrorReporter.2
                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!(activity instanceof BaseCrashReportDialog)) {
                        ErrorReporter.this.lastActivityCreated = new WeakReference(activity);
                    }
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityStarted(Activity activity) {
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityResumed(Activity activity) {
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityPaused(Activity activity) {
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityStopped(Activity activity) {
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // org.acra.jraf.android.util.activitylifecyclecallbackscompat.ActivityLifecycleCallbacksCompat
                public void onActivityDestroyed(Activity activity) {
                }
            });
        }
        this.crashReportDataFactory = new CrashReportDataFactory(this.mContext, sharedPreferences, time, collectConfiguration);
        this.mDfltExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Deprecated
    public static ErrorReporter getInstance() {
        return ACRA.getErrorReporter();
    }

    @Deprecated
    public void addCustomData(String str, String str2) {
        this.crashReportDataFactory.putCustomData(str, str2);
    }

    public String putCustomData(String str, String str2) {
        return this.crashReportDataFactory.putCustomData(str, str2);
    }

    public void setExceptionHandlerInitializer(ExceptionHandlerInitializer exceptionHandlerInitializer) {
        if (exceptionHandlerInitializer == null) {
            exceptionHandlerInitializer = NULL_EXCEPTION_HANDLER_INITIALIZER;
        }
        this.exceptionHandlerInitializer = exceptionHandlerInitializer;
    }

    public String removeCustomData(String str) {
        return this.crashReportDataFactory.removeCustomData(str);
    }

    public void clearCustomData() {
        this.crashReportDataFactory.clearCustomData();
    }

    public String getCustomData(String str) {
        return this.crashReportDataFactory.getCustomData(str);
    }

    public void addReportSender(ReportSender reportSender) {
        this.mReportSenders.add(reportSender);
    }

    public void removeReportSender(ReportSender reportSender) {
        this.mReportSenders.remove(reportSender);
    }

    public void removeReportSenders(Class<?> cls) {
        if (ReportSender.class.isAssignableFrom(cls)) {
            for (ReportSender reportSender : this.mReportSenders) {
                if (cls.isInstance(reportSender)) {
                    this.mReportSenders.remove(reportSender);
                }
            }
        }
    }

    public void removeAllReportSenders() {
        this.mReportSenders.clear();
    }

    public void setReportSender(ReportSender reportSender) {
        removeAllReportSenders();
        addReportSender(reportSender);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (!this.enabled) {
                if (this.mDfltExceptionHandler != null) {
                    ACRA.log.e(ACRA.LOG_TAG, "ACRA is disabled for " + this.mContext.getPackageName() + " - forwarding uncaught Exception on to default ExceptionHandler");
                    this.mDfltExceptionHandler.uncaughtException(thread, th);
                } else {
                    ACRA.log.e(ACRA.LOG_TAG, "ACRA is disabled for " + this.mContext.getPackageName() + " - no default ExceptionHandler");
                    ACRA.log.e(ACRA.LOG_TAG, "ACRA caught a " + th.getClass().getSimpleName() + " for " + this.mContext.getPackageName(), th);
                }
            } else {
                ACRA.log.e(ACRA.LOG_TAG, "ACRA caught a " + th.getClass().getSimpleName() + " for " + this.mContext.getPackageName(), th);
                ACRA.log.d(ACRA.LOG_TAG, "Building report");
                reportBuilder().uncaughtExceptionThread(thread).exception(th).endsApplication().send();
            }
        } catch (Throwable th2) {
            if (this.mDfltExceptionHandler != null) {
                this.mDfltExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endApplication(Thread thread, Throwable th) {
        boolean z = ACRA.getConfig().mode() == ReportingInteractionMode.SILENT || (ACRA.getConfig().mode() == ReportingInteractionMode.TOAST && ACRA.getConfig().forceCloseDialogAfterToast());
        if ((thread != null) && z && this.mDfltExceptionHandler != null) {
            ACRA.log.d(ACRA.LOG_TAG, "Handing Exception on to default ExceptionHandler");
            this.mDfltExceptionHandler.uncaughtException(thread, th);
            return;
        }
        ACRA.log.e(ACRA.LOG_TAG, String.valueOf(this.mContext.getPackageName()) + " fatal error : " + th.getMessage(), th);
        Activity activity = this.lastActivityCreated.get();
        if (activity != null) {
            ACRA.log.i(ACRA.LOG_TAG, "Finishing the last Activity prior to killing the Process");
            activity.finish();
            ACRA.log.i(ACRA.LOG_TAG, "Finished " + activity.getClass());
            this.lastActivityCreated.clear();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public void handleSilentException(Throwable th) {
        if (this.enabled) {
            reportBuilder().exception(th).forceSilent().send();
            ACRA.log.d(ACRA.LOG_TAG, "ACRA sent Silent report.");
            return;
        }
        ACRA.log.d(ACRA.LOG_TAG, "ACRA is disabled. Silent report not sent.");
    }

    public void setEnabled(boolean z) {
        ACRA.log.i(ACRA.LOG_TAG, "ACRA is " + (z ? "enabled" : "disabled") + " for " + this.mContext.getPackageName());
        this.enabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendWorker startSendingReports(boolean z, boolean z2) {
        SendWorker sendWorker = new SendWorker(this.mContext, this.mReportSenders, z, z2);
        sendWorker.start();
        return sendWorker;
    }

    void deletePendingReports() {
        deletePendingReports(true, true, 0);
    }

    public void checkReportsOnApplicationStart() {
        if (ACRA.getConfig().deleteOldUnsentReportsOnApplicationStart()) {
            long j = this.prefs.getInt(ACRA.PREF_LAST_VERSION_NR, 0);
            PackageInfo packageInfo = new PackageManagerWrapper(this.mContext).getPackageInfo();
            if (packageInfo != null) {
                if (((long) packageInfo.versionCode) > j) {
                    deletePendingReports();
                }
                SharedPreferences.Editor edit = this.prefs.edit();
                edit.putInt(ACRA.PREF_LAST_VERSION_NR, packageInfo.versionCode);
                edit.commit();
            }
        }
        ReportingInteractionMode mode = ACRA.getConfig().mode();
        if ((mode == ReportingInteractionMode.NOTIFICATION || mode == ReportingInteractionMode.DIALOG) && ACRA.getConfig().deleteUnapprovedReportsOnApplicationStart()) {
            deletePendingNonApprovedReports(true);
        }
        String[] crashReportFiles = new CrashReportFinder(this.mContext).getCrashReportFiles();
        if (crashReportFiles != null && crashReportFiles.length > 0) {
            boolean containsOnlySilentOrApprovedReports = containsOnlySilentOrApprovedReports(crashReportFiles);
            if (mode != ReportingInteractionMode.SILENT && mode != ReportingInteractionMode.TOAST) {
                if (!containsOnlySilentOrApprovedReports) {
                    return;
                }
                if (mode != ReportingInteractionMode.NOTIFICATION && mode != ReportingInteractionMode.DIALOG) {
                    return;
                }
            }
            if (mode == ReportingInteractionMode.TOAST && !containsOnlySilentOrApprovedReports) {
                ToastSender.sendToast(this.mContext, ACRA.getConfig().resToastText(), 1);
            }
            ACRA.log.v(ACRA.LOG_TAG, "About to start ReportSenderWorker from #checkReportOnApplicationStart");
            startSendingReports(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void deletePendingNonApprovedReports(boolean z) {
        deletePendingReports(false, true, z ? 1 : 0);
    }

    public void handleException(Throwable th, boolean z) {
        ReportBuilder exception = reportBuilder().exception(th);
        if (z) {
            exception.endsApplication();
        }
        exception.send();
    }

    public void handleException(Throwable th) {
        reportBuilder().exception(th).send();
    }

    public ReportBuilder reportBuilder() {
        return new ReportBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class TimeHelper {
        private Long initialTimeMillis;

        private TimeHelper() {
        }

        /* synthetic */ TimeHelper(TimeHelper timeHelper) {
            this();
        }

        public void setInitialTimeMillis(long j) {
            this.initialTimeMillis = Long.valueOf(j);
        }

        public long getElapsedTime() {
            if (this.initialTimeMillis == null) {
                return 0L;
            }
            return System.currentTimeMillis() - this.initialTimeMillis.longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.acra.ErrorReporter$5] */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.acra.ErrorReporter$4] */
    /* JADX WARN: Type inference failed for: r0v26, types: [org.acra.ErrorReporter$3] */
    public void report(final ReportBuilder reportBuilder) {
        ReportingInteractionMode reportingInteractionMode;
        boolean z;
        final SendWorker startSendingReports;
        if (this.enabled) {
            try {
                this.exceptionHandlerInitializer.initializeExceptionHandler(this);
            } catch (Exception e) {
                ACRA.log.d(ACRA.LOG_TAG, "Failed to initlize " + this.exceptionHandlerInitializer + " from #handleException");
            }
            if (!reportBuilder.mForceSilent) {
                reportingInteractionMode = ACRA.getConfig().mode();
                z = false;
            } else {
                ReportingInteractionMode reportingInteractionMode2 = ReportingInteractionMode.SILENT;
                if (ACRA.getConfig().mode() != ReportingInteractionMode.SILENT) {
                    reportingInteractionMode = reportingInteractionMode2;
                    z = true;
                } else {
                    reportingInteractionMode = reportingInteractionMode2;
                    z = false;
                }
            }
            boolean z2 = reportingInteractionMode == ReportingInteractionMode.TOAST || (ACRA.getConfig().resToastText() != 0 && (reportingInteractionMode == ReportingInteractionMode.NOTIFICATION || reportingInteractionMode == ReportingInteractionMode.DIALOG));
            final TimeHelper timeHelper = new TimeHelper(null);
            if (z2) {
                new Thread() { // from class: org.acra.ErrorReporter.3
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        Looper.prepare();
                        ToastSender.sendToast(ErrorReporter.this.mContext, ACRA.getConfig().resToastText(), 1);
                        timeHelper.setInitialTimeMillis(System.currentTimeMillis());
                        Looper.loop();
                    }
                }.start();
            }
            CrashReportData createCrashData = this.crashReportDataFactory.createCrashData(reportBuilder.mMessage, reportBuilder.mException, reportBuilder.mCustomData, reportBuilder.mForceSilent, reportBuilder.mUncaughtExceptionThread);
            final String reportFileName = getReportFileName(createCrashData);
            saveCrashReportFile(reportFileName, createCrashData);
            if (reportBuilder.mEndsApplication && !ACRA.getConfig().sendReportsAtShutdown()) {
                endApplication(reportBuilder.mUncaughtExceptionThread, reportBuilder.mException);
            }
            if (reportingInteractionMode == ReportingInteractionMode.SILENT || reportingInteractionMode == ReportingInteractionMode.TOAST || this.prefs.getBoolean(ACRA.PREF_ALWAYS_ACCEPT, false)) {
                ACRA.log.d(ACRA.LOG_TAG, "About to start ReportSenderWorker from #handleException");
                startSendingReports = startSendingReports(z, true);
                if (reportingInteractionMode == ReportingInteractionMode.SILENT && !reportBuilder.mEndsApplication) {
                    return;
                }
            } else {
                if (reportingInteractionMode == ReportingInteractionMode.NOTIFICATION) {
                    ACRA.log.d(ACRA.LOG_TAG, "Creating Notification.");
                    createNotification(reportFileName, reportBuilder);
                }
                startSendingReports = null;
            }
            this.toastWaitEnded = true;
            if (z2) {
                this.toastWaitEnded = false;
                new Thread() { // from class: org.acra.ErrorReporter.4
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        ACRA.log.d(ACRA.LOG_TAG, "Waiting for 2000 millis from " + timeHelper.initialTimeMillis + " currentMillis=" + System.currentTimeMillis());
                        while (timeHelper.getElapsedTime() < 2000) {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException e2) {
                                ACRA.log.d(ACRA.LOG_TAG, "Interrupted while waiting for Toast to end.", e2);
                            }
                        }
                        ErrorReporter.this.toastWaitEnded = true;
                    }
                }.start();
            }
            final boolean z3 = reportingInteractionMode == ReportingInteractionMode.DIALOG && !this.prefs.getBoolean(ACRA.PREF_ALWAYS_ACCEPT, false);
            new Thread() { // from class: org.acra.ErrorReporter.5
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    ACRA.log.d(ACRA.LOG_TAG, "Waiting for Toast");
                    while (!ErrorReporter.this.toastWaitEnded) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e2) {
                            ACRA.log.d(ACRA.LOG_TAG, "Error : ", e2);
                        }
                    }
                    ACRA.log.d(ACRA.LOG_TAG, "Finished waiting for Toast");
                    if (startSendingReports != null) {
                        ACRA.log.d(ACRA.LOG_TAG, "Waiting for Worker");
                        while (startSendingReports.isAlive()) {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException e3) {
                                ACRA.log.d(ACRA.LOG_TAG, "Error : ", e3);
                            }
                        }
                        ACRA.log.d(ACRA.LOG_TAG, "Finished waiting for Worker");
                    }
                    if (z3) {
                        ACRA.log.d(ACRA.LOG_TAG, "Creating CrashReportDialog for " + reportFileName);
                        Intent createCrashReportDialogIntent = ErrorReporter.this.createCrashReportDialogIntent(reportFileName, reportBuilder);
                        createCrashReportDialogIntent.setFlags(268435456);
                        ErrorReporter.this.mContext.startActivity(createCrashReportDialogIntent);
                    }
                    ACRA.log.d(ACRA.LOG_TAG, "Wait for Toast + worker ended. Kill Application ? " + reportBuilder.mEndsApplication);
                    if (reportBuilder.mEndsApplication) {
                        ErrorReporter.this.endApplication(reportBuilder.mUncaughtExceptionThread, reportBuilder.mException);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent createCrashReportDialogIntent(String str, ReportBuilder reportBuilder) {
        ACRA.log.d(ACRA.LOG_TAG, "Creating DialogIntent for " + str + " exception=" + reportBuilder.mException);
        Intent intent = new Intent(this.mContext, ACRA.getConfig().reportDialogClass());
        intent.putExtra(ACRAConstants.EXTRA_REPORT_FILE_NAME, str);
        intent.putExtra(ACRAConstants.EXTRA_REPORT_EXCEPTION, reportBuilder.mException);
        return intent;
    }

    private void createNotification(String str, ReportBuilder reportBuilder) {
        ACRAConfiguration config = ACRA.getConfig();
        Notification notification = new Notification(config.resNotifIcon(), this.mContext.getText(config.resNotifTickerText()), System.currentTimeMillis());
        CharSequence text = this.mContext.getText(config.resNotifTitle());
        CharSequence text2 = this.mContext.getText(config.resNotifText());
        ACRA.log.d(ACRA.LOG_TAG, "Creating Notification for " + str);
        Intent createCrashReportDialogIntent = createCrashReportDialogIntent(str, reportBuilder);
        Application application = this.mContext;
        int i = mNotificationCounter;
        mNotificationCounter = i + 1;
        notification.setLatestEventInfo(this.mContext, text, text2, PendingIntent.getActivity(application, i, createCrashReportDialogIntent, 134217728));
        notification.flags |= 16;
        Intent createCrashReportDialogIntent2 = createCrashReportDialogIntent(str, reportBuilder);
        createCrashReportDialogIntent2.putExtra("FORCE_CANCEL", true);
        notification.deleteIntent = PendingIntent.getActivity(this.mContext, -1, createCrashReportDialogIntent2, 0);
        ((NotificationManager) this.mContext.getSystemService("notification")).notify(666, notification);
    }

    private String getReportFileName(CrashReportData crashReportData) {
        Time time = new Time();
        time.setToNow();
        return time.toMillis(false) + (crashReportData.getProperty(ReportField.IS_SILENT) != null ? ACRAConstants.SILENT_SUFFIX : "") + ACRAConstants.REPORTFILE_EXTENSION;
    }

    private void saveCrashReportFile(String str, CrashReportData crashReportData) {
        try {
            ACRA.log.d(ACRA.LOG_TAG, "Writing crash report file " + str + ".");
            new CrashReportPersister(this.mContext).store(crashReportData, str);
        } catch (Exception e) {
            ACRA.log.e(ACRA.LOG_TAG, "An error occurred while writing the report file...", e);
        }
    }

    private void deletePendingReports(boolean z, boolean z2, int i) {
        String[] crashReportFiles = new CrashReportFinder(this.mContext).getCrashReportFiles();
        Arrays.sort(crashReportFiles);
        for (int i2 = 0; i2 < crashReportFiles.length - i; i2++) {
            String str = crashReportFiles[i2];
            boolean isApproved = this.fileNameParser.isApproved(str);
            if ((isApproved && z) || (!isApproved && z2)) {
                File file = new File(this.mContext.getFilesDir(), str);
                ACRA.log.d(ACRA.LOG_TAG, "Deleting file " + str);
                if (!file.delete()) {
                    ACRA.log.e(ACRA.LOG_TAG, "Could not delete report : " + file);
                }
            }
        }
    }

    private boolean containsOnlySilentOrApprovedReports(String[] strArr) {
        for (String str : strArr) {
            if (!this.fileNameParser.isApproved(str)) {
                return false;
            }
        }
        return true;
    }

    public void setDefaultReportSenders() {
        ACRAConfiguration config = ACRA.getConfig();
        Application application = ACRA.getApplication();
        removeAllReportSenders();
        if (!"".equals(config.mailTo())) {
            ACRA.log.w(ACRA.LOG_TAG, String.valueOf(application.getPackageName()) + " reports will be sent by email (if accepted by user).");
            setReportSender(new EmailIntentSender(application));
        } else if (!new PackageManagerWrapper(application).hasPermission("android.permission.INTERNET")) {
            ACRA.log.e(ACRA.LOG_TAG, String.valueOf(application.getPackageName()) + " should be granted permission android.permission.INTERNET if you want your crash reports to be sent. If you don't want to add this permission to your application you can also enable sending reports by email. If this is your will then provide your email address in @ReportsCrashes(mailTo=\"your.account@domain.com\"");
        } else if (config.formUri() != null && !"".equals(config.formUri())) {
            setReportSender(new HttpSender(ACRA.getConfig().httpMethod(), ACRA.getConfig().reportType(), null));
        }
    }

    /* loaded from: classes.dex */
    public final class ReportBuilder {
        private Map<String, String> mCustomData;
        private Throwable mException;
        private String mMessage;
        private Thread mUncaughtExceptionThread;
        private boolean mForceSilent = false;
        private boolean mEndsApplication = false;

        public ReportBuilder() {
        }

        public ReportBuilder message(String str) {
            this.mMessage = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReportBuilder uncaughtExceptionThread(Thread thread) {
            this.mUncaughtExceptionThread = thread;
            return this;
        }

        public ReportBuilder exception(Throwable th) {
            this.mException = th;
            return this;
        }

        private void initCustomData() {
            if (this.mCustomData == null) {
                this.mCustomData = new HashMap();
            }
        }

        public ReportBuilder customData(Map<String, String> map) {
            initCustomData();
            this.mCustomData.putAll(map);
            return this;
        }

        public ReportBuilder customData(String str, String str2) {
            initCustomData();
            this.mCustomData.put(str, str2);
            return this;
        }

        public ReportBuilder forceSilent() {
            this.mForceSilent = true;
            return this;
        }

        public ReportBuilder endsApplication() {
            this.mEndsApplication = true;
            return this;
        }

        public void send() {
            if (this.mMessage == null && this.mException == null) {
                this.mMessage = "Report requested by developer";
            }
            ErrorReporter.this.report(this);
        }
    }
}
