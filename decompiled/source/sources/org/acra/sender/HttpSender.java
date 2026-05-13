package org.acra.sender;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.acra.ACRA;
import org.acra.ACRAConfiguration;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.collector.CrashReportData;
import org.acra.util.HttpRequest;
import org.acra.util.JSONReportBuilder;
/* loaded from: classes.dex */
public class HttpSender implements ReportSender {
    private static /* synthetic */ int[] $SWITCH_TABLE$org$acra$sender$HttpSender$Method;
    private static /* synthetic */ int[] $SWITCH_TABLE$org$acra$sender$HttpSender$Type;
    private final Uri mFormUri;
    private final Map<ReportField, String> mMapping;
    private final Method mMethod;
    private String mPassword;
    private final Type mType;
    private String mUsername;

    /* loaded from: classes.dex */
    public enum Method {
        POST,
        PUT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Method[] valuesCustom() {
            Method[] valuesCustom = values();
            int length = valuesCustom.length;
            Method[] methodArr = new Method[length];
            System.arraycopy(valuesCustom, 0, methodArr, 0, length);
            return methodArr;
        }
    }

    static /* synthetic */ int[] $SWITCH_TABLE$org$acra$sender$HttpSender$Method() {
        int[] iArr = $SWITCH_TABLE$org$acra$sender$HttpSender$Method;
        if (iArr == null) {
            iArr = new int[Method.valuesCustom().length];
            try {
                iArr[Method.POST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Method.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $SWITCH_TABLE$org$acra$sender$HttpSender$Method = iArr;
        }
        return iArr;
    }

    static /* synthetic */ int[] $SWITCH_TABLE$org$acra$sender$HttpSender$Type() {
        int[] iArr = $SWITCH_TABLE$org$acra$sender$HttpSender$Type;
        if (iArr == null) {
            iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.FORM.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Type.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $SWITCH_TABLE$org$acra$sender$HttpSender$Type = iArr;
        }
        return iArr;
    }

    /* loaded from: classes.dex */
    public enum Type {
        FORM { // from class: org.acra.sender.HttpSender.Type.1
            @Override // org.acra.sender.HttpSender.Type
            public String getContentType() {
                return "application/x-www-form-urlencoded";
            }
        },
        JSON { // from class: org.acra.sender.HttpSender.Type.2
            @Override // org.acra.sender.HttpSender.Type
            public String getContentType() {
                return "application/json";
            }
        };

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            int length = valuesCustom.length;
            Type[] typeArr = new Type[length];
            System.arraycopy(valuesCustom, 0, typeArr, 0, length);
            return typeArr;
        }

        public abstract String getContentType();

        /* synthetic */ Type(Type type) {
            this();
        }
    }

    public HttpSender(Method method, Type type, Map<ReportField, String> map) {
        this.mMethod = method;
        this.mFormUri = null;
        this.mMapping = map;
        this.mType = type;
        this.mUsername = null;
        this.mPassword = null;
    }

    public HttpSender(Method method, Type type, String str, Map<ReportField, String> map) {
        this.mMethod = method;
        this.mFormUri = Uri.parse(str);
        this.mMapping = map;
        this.mType = type;
        this.mUsername = null;
        this.mPassword = null;
    }

    public void setBasicAuth(String str, String str2) {
        this.mUsername = str;
        this.mPassword = str2;
    }

    @Override // org.acra.sender.ReportSender
    public void send(Context context, CrashReportData crashReportData) {
        String formUriBasicAuthLogin;
        String formUriBasicAuthPassword;
        String jSONObject;
        try {
            URL url = this.mFormUri == null ? new URL(ACRA.getConfig().formUri()) : new URL(this.mFormUri.toString());
            ACRA.log.d(ACRA.LOG_TAG, "Connect to " + url.toString());
            if (this.mUsername != null) {
                formUriBasicAuthLogin = this.mUsername;
            } else {
                formUriBasicAuthLogin = ACRAConfiguration.isNull(ACRA.getConfig().formUriBasicAuthLogin()) ? null : ACRA.getConfig().formUriBasicAuthLogin();
            }
            if (this.mPassword != null) {
                formUriBasicAuthPassword = this.mPassword;
            } else {
                formUriBasicAuthPassword = ACRAConfiguration.isNull(ACRA.getConfig().formUriBasicAuthPassword()) ? null : ACRA.getConfig().formUriBasicAuthPassword();
            }
            HttpRequest httpRequest = new HttpRequest();
            httpRequest.setConnectionTimeOut(ACRA.getConfig().connectionTimeout());
            httpRequest.setSocketTimeOut(ACRA.getConfig().socketTimeout());
            httpRequest.setMaxNrRetries(ACRA.getConfig().maxNumberOfRequestRetries());
            httpRequest.setLogin(formUriBasicAuthLogin);
            httpRequest.setPassword(formUriBasicAuthPassword);
            httpRequest.setHeaders(ACRA.getConfig().getHttpHeaders());
            switch ($SWITCH_TABLE$org$acra$sender$HttpSender$Type()[this.mType.ordinal()]) {
                case 2:
                    jSONObject = crashReportData.toJSON().toString();
                    break;
                default:
                    jSONObject = HttpRequest.getParamsAsFormString(remap(crashReportData));
                    break;
            }
            switch ($SWITCH_TABLE$org$acra$sender$HttpSender$Method()[this.mMethod.ordinal()]) {
                case 1:
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown method: " + this.mMethod.name());
                case 2:
                    url = new URL(String.valueOf(url.toString()) + '/' + crashReportData.getProperty(ReportField.REPORT_ID));
                    break;
            }
            httpRequest.send(context, url, this.mMethod, jSONObject, this.mType);
        } catch (IOException e) {
            throw new ReportSenderException("Error while sending " + ACRA.getConfig().reportType() + " report via Http " + this.mMethod.name(), e);
        } catch (JSONReportBuilder.JSONReportException e2) {
            throw new ReportSenderException("Error while sending " + ACRA.getConfig().reportType() + " report via Http " + this.mMethod.name(), e2);
        }
    }

    private Map<String, String> remap(Map<ReportField, String> map) {
        ReportField[] customReportContent = ACRA.getConfig().customReportContent();
        ReportField[] reportFieldArr = customReportContent.length == 0 ? ACRAConstants.DEFAULT_REPORT_FIELDS : customReportContent;
        HashMap hashMap = new HashMap(map.size());
        for (ReportField reportField : reportFieldArr) {
            if (this.mMapping == null || this.mMapping.get(reportField) == null) {
                hashMap.put(reportField.toString(), map.get(reportField));
            } else {
                hashMap.put(this.mMapping.get(reportField), map.get(reportField));
            }
        }
        return hashMap;
    }
}
