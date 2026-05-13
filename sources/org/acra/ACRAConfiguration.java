package org.acra;

import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.acra.annotation.ReportsCrashes;
import org.acra.sender.HttpSender;
import org.acra.util.DefaultHttpsSocketFactoryFactory;
import org.acra.util.HttpsSocketFactoryFactory;
import org.acra.util.ReflectionException;
import org.acra.util.ReflectionHelper;
/* loaded from: classes.dex */
public class ACRAConfiguration implements ReportsCrashes {
    private String[] mAdditionalDropboxTags;
    private String[] mAdditionalSharedPreferences;
    private String mApplicationLogFile;
    private Integer mApplicationLogFileLines;
    private Class mBuildConfigClass;
    private Integer mConnectionTimeout;
    private ReportField[] mCustomReportContent;
    private Boolean mDeleteOldUnsentReportsOnApplicationStart;
    private Boolean mDeleteUnapprovedReportsOnApplicationStart;
    private Boolean mDisableSSLCertValidation;
    private Integer mDropboxCollectionMinutes;
    private String[] mExcludeMatchingSettingsKeys;
    private String[] mExcludeMatchingSharedPreferencesKeys;
    private Boolean mForceCloseDialogAfterToast;
    private String mFormUri;
    private String mFormUriBasicAuthLogin;
    private String mFormUriBasicAuthPassword;
    private Map<String, String> mHttpHeaders;
    private HttpSender.Method mHttpMethod;
    private HttpsSocketFactoryFactory mHttpsSocketFactoryFactory;
    private String mHttpsSocketFactoryFactoryClass;
    private Boolean mIncludeDropboxSystemTags;
    private KeyStore mKeyStore;
    private String[] mLogcatArguments;
    private Boolean mLogcatFilterByPid;
    private String mMailTo;
    private Integer mMaxNumberOfRequestRetries;
    private ReportingInteractionMode mMode;
    private Class<? extends BaseCrashReportDialog> mReportDialogClass;
    private HttpSender.Type mReportType;
    private ReportsCrashes mReportsCrashes;
    private Integer mResDialogCommentPrompt;
    private Integer mResDialogEmailPrompt;
    private Integer mResDialogIcon;
    private Integer mResDialogNegativeButtonText;
    private Integer mResDialogOkToast;
    private Integer mResDialogPositiveButtonText;
    private Integer mResDialogText;
    private Integer mResDialogTitle;
    private Integer mResNotifIcon;
    private Integer mResNotifText;
    private Integer mResNotifTickerText;
    private Integer mResNotifTitle;
    private Integer mResToastText;
    private Boolean mSendReportsAtShutdown;
    private Boolean mSendReportsInDevMode;
    private Integer mSharedPreferenceMode;
    private String mSharedPreferenceName;
    private Integer mSocketTimeout;
    private final ReflectionHelper reflectionHelper;

    public ACRAConfiguration setHttpHeaders(Map<String, String> map) {
        this.mHttpHeaders = map;
        return this;
    }

    public Map<String, String> getHttpHeaders() {
        return this.mHttpHeaders;
    }

    public List<ReportField> getReportFields() {
        ReportField[] customReportContent = customReportContent();
        if (customReportContent.length != 0) {
            ACRA.log.mo11d(ACRA.LOG_TAG, "Using custom Report Fields");
        } else if (mailTo() == null || "".equals(mailTo())) {
            ACRA.log.mo11d(ACRA.LOG_TAG, "Using default Report Fields");
            customReportContent = ACRAConstants.DEFAULT_REPORT_FIELDS;
        } else {
            ACRA.log.mo11d(ACRA.LOG_TAG, "Using default Mail Report Fields");
            customReportContent = ACRAConstants.DEFAULT_MAIL_REPORT_FIELDS;
        }
        return Arrays.asList(customReportContent);
    }

    public ACRAConfiguration setAdditionalDropboxTags(String[] strArr) {
        this.mAdditionalDropboxTags = strArr;
        return this;
    }

    public ACRAConfiguration setAdditionalSharedPreferences(String[] strArr) {
        this.mAdditionalSharedPreferences = strArr;
        return this;
    }

    public ACRAConfiguration setConnectionTimeout(Integer num) {
        this.mConnectionTimeout = num;
        return this;
    }

    public ACRAConfiguration setCustomReportContent(ReportField[] reportFieldArr) {
        this.mCustomReportContent = reportFieldArr;
        return this;
    }

    public ACRAConfiguration setDeleteUnapprovedReportsOnApplicationStart(Boolean bool) {
        this.mDeleteUnapprovedReportsOnApplicationStart = bool;
        return this;
    }

    public ACRAConfiguration setDeleteOldUnsentReportsOnApplicationStart(Boolean bool) {
        this.mDeleteOldUnsentReportsOnApplicationStart = bool;
        return this;
    }

    public ACRAConfiguration setDropboxCollectionMinutes(Integer num) {
        this.mDropboxCollectionMinutes = num;
        return this;
    }

    public ACRAConfiguration setForceCloseDialogAfterToast(Boolean bool) {
        this.mForceCloseDialogAfterToast = bool;
        return this;
    }

    public ACRAConfiguration setFormUri(String str) {
        this.mFormUri = str;
        return this;
    }

    public ACRAConfiguration setFormUriBasicAuthLogin(String str) {
        this.mFormUriBasicAuthLogin = str;
        return this;
    }

    public ACRAConfiguration setFormUriBasicAuthPassword(String str) {
        this.mFormUriBasicAuthPassword = str;
        return this;
    }

    public ACRAConfiguration setIncludeDropboxSystemTags(Boolean bool) {
        this.mIncludeDropboxSystemTags = bool;
        return this;
    }

    public ACRAConfiguration setLogcatArguments(String[] strArr) {
        this.mLogcatArguments = strArr;
        return this;
    }

    public ACRAConfiguration setMailTo(String str) {
        this.mMailTo = str;
        return this;
    }

    public ACRAConfiguration setMaxNumberOfRequestRetries(Integer num) {
        this.mMaxNumberOfRequestRetries = num;
        return this;
    }

    public ACRAConfiguration setMode(ReportingInteractionMode reportingInteractionMode) {
        this.mMode = reportingInteractionMode;
        ACRA.checkCrashResources(this);
        return this;
    }

    public ACRAConfiguration setResDialogPositiveButtonText(int i) {
        this.mResDialogPositiveButtonText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogNegativeButtonText(int i) {
        this.mResDialogNegativeButtonText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setReportDialogClass(Class<? extends BaseCrashReportDialog> cls) {
        this.mReportDialogClass = cls;
        return this;
    }

    public ACRAConfiguration setResDialogCommentPrompt(int i) {
        this.mResDialogCommentPrompt = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogEmailPrompt(int i) {
        this.mResDialogEmailPrompt = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogIcon(int i) {
        this.mResDialogIcon = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogOkToast(int i) {
        this.mResDialogOkToast = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogText(int i) {
        this.mResDialogText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResDialogTitle(int i) {
        this.mResDialogTitle = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResNotifIcon(int i) {
        this.mResNotifIcon = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResNotifText(int i) {
        this.mResNotifText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResNotifTickerText(int i) {
        this.mResNotifTickerText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResNotifTitle(int i) {
        this.mResNotifTitle = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setResToastText(int i) {
        this.mResToastText = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setSharedPreferenceMode(Integer num) {
        this.mSharedPreferenceMode = num;
        return this;
    }

    public ACRAConfiguration setSharedPreferenceName(String str) {
        this.mSharedPreferenceName = str;
        return this;
    }

    public ACRAConfiguration setSocketTimeout(Integer num) {
        this.mSocketTimeout = num;
        return this;
    }

    public ACRAConfiguration setLogcatFilterByPid(Boolean bool) {
        this.mLogcatFilterByPid = bool;
        return this;
    }

    public ACRAConfiguration setSendReportsInDevMode(Boolean bool) {
        this.mSendReportsInDevMode = bool;
        return this;
    }

    public ACRAConfiguration setSendReportsAtShutdown(Boolean bool) {
        this.mSendReportsAtShutdown = bool;
        return this;
    }

    public ACRAConfiguration setExcludeMatchingSharedPreferencesKeys(String[] strArr) {
        this.mExcludeMatchingSharedPreferencesKeys = strArr;
        return this;
    }

    public ACRAConfiguration setExcludeMatchingSettingsKeys(String[] strArr) {
        this.mExcludeMatchingSettingsKeys = strArr;
        return this;
    }

    public ACRAConfiguration setBuildConfigClass(Class cls) {
        this.mBuildConfigClass = cls;
        return this;
    }

    public ACRAConfiguration setApplicationLogFile(String str) {
        this.mApplicationLogFile = str;
        return this;
    }

    public ACRAConfiguration setApplicationLogFileLines(int i) {
        this.mApplicationLogFileLines = Integer.valueOf(i);
        return this;
    }

    public ACRAConfiguration setDisableSSLCertValidation(boolean z) {
        this.mDisableSSLCertValidation = Boolean.valueOf(z);
        return this;
    }

    public ACRAConfiguration setHttpMethod(HttpSender.Method method) {
        this.mHttpMethod = method;
        return this;
    }

    public ACRAConfiguration setReportType(HttpSender.Type type) {
        this.mReportType = type;
        return this;
    }

    public void setKeyStore(KeyStore keyStore) {
        this.mKeyStore = keyStore;
    }

    public ACRAConfiguration(ReportsCrashes reportsCrashes) {
        this.reflectionHelper = new ReflectionHelper();
        this.mAdditionalDropboxTags = null;
        this.mAdditionalSharedPreferences = null;
        this.mConnectionTimeout = null;
        this.mCustomReportContent = null;
        this.mDeleteUnapprovedReportsOnApplicationStart = null;
        this.mDeleteOldUnsentReportsOnApplicationStart = null;
        this.mDropboxCollectionMinutes = null;
        this.mForceCloseDialogAfterToast = null;
        this.mFormUri = null;
        this.mFormUriBasicAuthLogin = null;
        this.mFormUriBasicAuthPassword = null;
        this.mIncludeDropboxSystemTags = null;
        this.mLogcatArguments = null;
        this.mMailTo = null;
        this.mMaxNumberOfRequestRetries = null;
        this.mMode = null;
        this.mReportsCrashes = null;
        this.mReportDialogClass = null;
        this.mResDialogPositiveButtonText = null;
        this.mResDialogNegativeButtonText = null;
        this.mResDialogCommentPrompt = null;
        this.mResDialogEmailPrompt = null;
        this.mResDialogIcon = null;
        this.mResDialogOkToast = null;
        this.mResDialogText = null;
        this.mResDialogTitle = null;
        this.mResNotifIcon = null;
        this.mResNotifText = null;
        this.mResNotifTickerText = null;
        this.mResNotifTitle = null;
        this.mResToastText = null;
        this.mSharedPreferenceMode = null;
        this.mSharedPreferenceName = null;
        this.mSocketTimeout = null;
        this.mLogcatFilterByPid = null;
        this.mSendReportsInDevMode = null;
        this.mSendReportsAtShutdown = null;
        this.mExcludeMatchingSharedPreferencesKeys = null;
        this.mExcludeMatchingSettingsKeys = null;
        this.mApplicationLogFile = null;
        this.mApplicationLogFileLines = null;
        this.mDisableSSLCertValidation = null;
        this.mHttpsSocketFactoryFactoryClass = null;
        this.mHttpMethod = null;
        this.mReportType = null;
        this.mReportsCrashes = reportsCrashes;
    }

    public ACRAConfiguration() {
        this(null);
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String[] additionalDropBoxTags() {
        if (this.mAdditionalDropboxTags != null) {
            return this.mAdditionalDropboxTags;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.additionalDropBoxTags();
        }
        return new String[0];
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String[] additionalSharedPreferences() {
        if (this.mAdditionalSharedPreferences != null) {
            return this.mAdditionalSharedPreferences;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.additionalSharedPreferences();
        }
        return new String[0];
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return this.mReportsCrashes.annotationType();
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int connectionTimeout() {
        if (this.mConnectionTimeout != null) {
            return this.mConnectionTimeout.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.connectionTimeout();
        }
        return ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public ReportField[] customReportContent() {
        if (this.mCustomReportContent != null) {
            return this.mCustomReportContent;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.customReportContent();
        }
        return new ReportField[0];
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean deleteUnapprovedReportsOnApplicationStart() {
        if (this.mDeleteUnapprovedReportsOnApplicationStart != null) {
            return this.mDeleteUnapprovedReportsOnApplicationStart.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.deleteUnapprovedReportsOnApplicationStart();
        }
        return true;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean deleteOldUnsentReportsOnApplicationStart() {
        if (this.mDeleteOldUnsentReportsOnApplicationStart != null) {
            return this.mDeleteOldUnsentReportsOnApplicationStart.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.deleteOldUnsentReportsOnApplicationStart();
        }
        return true;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int dropboxCollectionMinutes() {
        if (this.mDropboxCollectionMinutes != null) {
            return this.mDropboxCollectionMinutes.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.dropboxCollectionMinutes();
        }
        return 5;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean forceCloseDialogAfterToast() {
        if (this.mForceCloseDialogAfterToast != null) {
            return this.mForceCloseDialogAfterToast.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.forceCloseDialogAfterToast();
        }
        return false;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String formUri() {
        if (this.mFormUri != null) {
            return this.mFormUri;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.formUri();
        }
        return "";
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String formUriBasicAuthLogin() {
        if (this.mFormUriBasicAuthLogin != null) {
            return this.mFormUriBasicAuthLogin;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.formUriBasicAuthLogin();
        }
        return ACRAConstants.NULL_VALUE;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String formUriBasicAuthPassword() {
        if (this.mFormUriBasicAuthPassword != null) {
            return this.mFormUriBasicAuthPassword;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.formUriBasicAuthPassword();
        }
        return ACRAConstants.NULL_VALUE;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean includeDropBoxSystemTags() {
        if (this.mIncludeDropboxSystemTags != null) {
            return this.mIncludeDropboxSystemTags.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.includeDropBoxSystemTags();
        }
        return false;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String[] logcatArguments() {
        if (this.mLogcatArguments != null) {
            return this.mLogcatArguments;
        }
        return this.mReportsCrashes != null ? this.mReportsCrashes.logcatArguments() : new String[]{"-t", Integer.toString(100), "-v", "time"};
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String mailTo() {
        if (this.mMailTo != null) {
            return this.mMailTo;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.mailTo();
        }
        return "";
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int maxNumberOfRequestRetries() {
        if (this.mMaxNumberOfRequestRetries != null) {
            return this.mMaxNumberOfRequestRetries.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.maxNumberOfRequestRetries();
        }
        return 3;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public ReportingInteractionMode mode() {
        if (this.mMode != null) {
            return this.mMode;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.mode();
        }
        return ReportingInteractionMode.SILENT;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogPositiveButtonText() {
        if (this.mResDialogPositiveButtonText != null) {
            return this.mResDialogPositiveButtonText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogPositiveButtonText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogNegativeButtonText() {
        if (this.mResDialogNegativeButtonText != null) {
            return this.mResDialogNegativeButtonText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogNegativeButtonText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogCommentPrompt() {
        if (this.mResDialogCommentPrompt != null) {
            return this.mResDialogCommentPrompt.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogCommentPrompt();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogEmailPrompt() {
        if (this.mResDialogEmailPrompt != null) {
            return this.mResDialogEmailPrompt.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogEmailPrompt();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogIcon() {
        if (this.mResDialogIcon != null) {
            return this.mResDialogIcon.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogIcon();
        }
        return ACRAConstants.DEFAULT_DIALOG_ICON;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogOkToast() {
        if (this.mResDialogOkToast != null) {
            return this.mResDialogOkToast.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogOkToast();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogText() {
        if (this.mResDialogText != null) {
            return this.mResDialogText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resDialogTitle() {
        if (this.mResDialogTitle != null) {
            return this.mResDialogTitle.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resDialogTitle();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resNotifIcon() {
        if (this.mResNotifIcon != null) {
            return this.mResNotifIcon.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resNotifIcon();
        }
        return ACRAConstants.DEFAULT_NOTIFICATION_ICON;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resNotifText() {
        if (this.mResNotifText != null) {
            return this.mResNotifText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resNotifText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resNotifTickerText() {
        if (this.mResNotifTickerText != null) {
            return this.mResNotifTickerText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resNotifTickerText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resNotifTitle() {
        if (this.mResNotifTitle != null) {
            return this.mResNotifTitle.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resNotifTitle();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int resToastText() {
        if (this.mResToastText != null) {
            return this.mResToastText.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.resToastText();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int sharedPreferencesMode() {
        if (this.mSharedPreferenceMode != null) {
            return this.mSharedPreferenceMode.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.sharedPreferencesMode();
        }
        return 0;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String sharedPreferencesName() {
        if (this.mSharedPreferenceName != null) {
            return this.mSharedPreferenceName;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.sharedPreferencesName();
        }
        return "";
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int socketTimeout() {
        if (this.mSocketTimeout != null) {
            return this.mSocketTimeout.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.socketTimeout();
        }
        return ACRAConstants.DEFAULT_SOCKET_TIMEOUT;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean logcatFilterByPid() {
        if (this.mLogcatFilterByPid != null) {
            return this.mLogcatFilterByPid.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.logcatFilterByPid();
        }
        return false;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean sendReportsInDevMode() {
        if (this.mSendReportsInDevMode != null) {
            return this.mSendReportsInDevMode.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.sendReportsInDevMode();
        }
        return true;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean sendReportsAtShutdown() {
        if (this.mSendReportsAtShutdown != null) {
            return this.mSendReportsAtShutdown.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.sendReportsAtShutdown();
        }
        return true;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String[] excludeMatchingSharedPreferencesKeys() {
        if (this.mExcludeMatchingSharedPreferencesKeys != null) {
            return this.mExcludeMatchingSharedPreferencesKeys;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.excludeMatchingSharedPreferencesKeys();
        }
        return new String[0];
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String[] excludeMatchingSettingsKeys() {
        if (this.mExcludeMatchingSettingsKeys != null) {
            return this.mExcludeMatchingSettingsKeys;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.excludeMatchingSettingsKeys();
        }
        return new String[0];
    }

    @Override // org.acra.annotation.ReportsCrashes
    public Class buildConfigClass() {
        if (this.mBuildConfigClass != null) {
            return this.mBuildConfigClass;
        }
        if (this.mReportsCrashes != null && this.mReportsCrashes.buildConfigClass() != null) {
            return this.mReportsCrashes.buildConfigClass();
        }
        return null;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String applicationLogFile() {
        if (this.mApplicationLogFile != null) {
            return this.mApplicationLogFile;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.applicationLogFile();
        }
        return "";
    }

    @Override // org.acra.annotation.ReportsCrashes
    public int applicationLogFileLines() {
        if (this.mApplicationLogFileLines != null) {
            return this.mApplicationLogFileLines.intValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.applicationLogFileLines();
        }
        return 100;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public boolean disableSSLCertValidation() {
        if (this.mDisableSSLCertValidation != null) {
            return this.mDisableSSLCertValidation.booleanValue();
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.disableSSLCertValidation();
        }
        return false;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public String httpsSocketFactoryFactoryClass() {
        if (this.mHttpsSocketFactoryFactoryClass != null) {
            return this.mHttpsSocketFactoryFactoryClass;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.httpsSocketFactoryFactoryClass();
        }
        return null;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public Class<? extends BaseCrashReportDialog> reportDialogClass() {
        if (this.mReportDialogClass != null) {
            return this.mReportDialogClass;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.reportDialogClass();
        }
        return CrashReportDialog.class;
    }

    public void setHttpsSocketFactoryFactory(HttpsSocketFactoryFactory httpsSocketFactoryFactory) {
        this.mHttpsSocketFactoryFactory = httpsSocketFactoryFactory;
    }

    public HttpsSocketFactoryFactory getHttpSocketFactoryFactory() {
        if (this.mHttpsSocketFactoryFactory != null) {
            return this.mHttpsSocketFactoryFactory;
        }
        String httpsSocketFactoryFactoryClass = httpsSocketFactoryFactoryClass();
        if (httpsSocketFactoryFactoryClass != null) {
            try {
                Object create = this.reflectionHelper.create(this.mReportsCrashes.httpsSocketFactoryFactoryClass());
                if (create instanceof HttpsSocketFactoryFactory) {
                    this.mHttpsSocketFactoryFactory = (HttpsSocketFactoryFactory) create;
                } else {
                    ACRA.log.mo3w(ACRA.LOG_TAG, "Using default httpsSocketFactoryFactory - not a HttpSocketFactoryFactory : " + httpsSocketFactoryFactoryClass);
                }
            } catch (ReflectionException e) {
                ACRA.log.mo3w(ACRA.LOG_TAG, "Using default httpsSocketFactoryFactory - Could not construct : " + httpsSocketFactoryFactoryClass);
            }
        }
        if (this.mHttpsSocketFactoryFactoryClass == null) {
            this.mHttpsSocketFactoryFactory = DefaultHttpsSocketFactoryFactory.INSTANCE;
        }
        return this.mHttpsSocketFactoryFactory;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public HttpSender.Method httpMethod() {
        if (this.mHttpMethod != null) {
            return this.mHttpMethod;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.httpMethod();
        }
        return HttpSender.Method.POST;
    }

    @Override // org.acra.annotation.ReportsCrashes
    public HttpSender.Type reportType() {
        if (this.mReportType != null) {
            return this.mReportType;
        }
        if (this.mReportsCrashes != null) {
            return this.mReportsCrashes.reportType();
        }
        return HttpSender.Type.FORM;
    }

    public KeyStore keyStore() {
        if (this.mKeyStore != null) {
            return this.mKeyStore;
        }
        return null;
    }

    public static boolean isNull(String str) {
        return str == null || ACRAConstants.NULL_VALUE.equals(str);
    }
}
