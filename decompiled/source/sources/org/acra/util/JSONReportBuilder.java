package org.acra.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.collector.CollectorUtil;
import org.acra.collector.CrashReportData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class JSONReportBuilder {
    public static JSONObject buildJSONReport(CrashReportData crashReportData) {
        BufferedReader bufferedReader;
        JSONObject jSONObject = new JSONObject();
        BufferedReader bufferedReader2 = null;
        for (ReportField reportField : crashReportData.keySet()) {
            try {
                try {
                    if (reportField.containsKeyValuePairs()) {
                        JSONObject jSONObject2 = new JSONObject();
                        BufferedReader bufferedReader3 = new BufferedReader(new StringReader(crashReportData.getProperty(reportField)), 1024);
                        while (true) {
                            try {
                                try {
                                    String readLine = bufferedReader3.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    addJSONFromProperty(jSONObject2, readLine);
                                } catch (IOException e) {
                                    ACRA.log.e(ACRA.LOG_TAG, "Error while converting " + reportField.name() + " to JSON.", e);
                                }
                            } catch (JSONException e2) {
                                bufferedReader2 = bufferedReader3;
                                e = e2;
                                throw new JSONReportException("Could not create JSON object for key " + reportField, e);
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                CollectorUtil.safeClose(bufferedReader2);
                                throw th;
                            }
                        }
                        jSONObject.accumulate(reportField.name(), jSONObject2);
                        bufferedReader = bufferedReader3;
                    } else {
                        jSONObject.accumulate(reportField.name(), guessType(crashReportData.getProperty(reportField)));
                        bufferedReader = bufferedReader2;
                    }
                    CollectorUtil.safeClose(bufferedReader);
                    bufferedReader2 = bufferedReader;
                } catch (JSONException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }

    private static void addJSONFromProperty(JSONObject jSONObject, String str) {
        int indexOf = str.indexOf(61);
        if (indexOf > 0) {
            String trim = str.substring(0, indexOf).trim();
            Object guessType = guessType(str.substring(indexOf + 1).trim());
            if (guessType instanceof String) {
                guessType = ((String) guessType).replaceAll("\\\\n", "\n");
            }
            String[] split = trim.split("\\.");
            if (split.length > 1) {
                addJSONSubTree(jSONObject, split, guessType);
                return;
            } else {
                jSONObject.accumulate(trim, guessType);
                return;
            }
        }
        jSONObject.put(str.trim(), true);
    }

    private static Object guessType(String str) {
        if (str.equalsIgnoreCase("true")) {
            return true;
        }
        if (str.equalsIgnoreCase("false")) {
            return false;
        }
        if (str.matches("(?:^|\\s)([1-9](?:\\d*|(?:\\d{0,2})(?:,\\d{3})*)(?:\\.\\d*[1-9])?|0?\\.\\d*[1-9]|0)(?:\\s|$)")) {
            try {
                return NumberFormat.getInstance(Locale.US).parse(str);
            } catch (ParseException e) {
                return str;
            }
        }
        return str;
    }

    private static void addJSONSubTree(JSONObject jSONObject, String[] strArr, Object obj) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (i < strArr.length - 1) {
                JSONObject jSONObject2 = null;
                if (jSONObject.isNull(str)) {
                    jSONObject2 = new JSONObject();
                    jSONObject.accumulate(str, jSONObject2);
                } else {
                    Object obj2 = jSONObject.get(str);
                    if (obj2 instanceof JSONObject) {
                        jSONObject2 = jSONObject.getJSONObject(str);
                    } else if (obj2 instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        JSONObject jSONObject3 = null;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= jSONArray.length()) {
                                jSONObject2 = jSONObject3;
                                break;
                            }
                            jSONObject3 = jSONArray.optJSONObject(i2);
                            if (jSONObject3 != null) {
                                jSONObject2 = jSONObject3;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (jSONObject2 == null) {
                        ACRA.log.e(ACRA.LOG_TAG, "Unknown json subtree type, see issue #186");
                        return;
                    }
                }
                jSONObject = jSONObject2;
            } else {
                jSONObject.accumulate(str, obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class JSONReportException extends Exception {
        private static final long serialVersionUID = -694684023635442219L;

        public JSONReportException(String str, Throwable th) {
            super(str, th);
        }
    }
}
