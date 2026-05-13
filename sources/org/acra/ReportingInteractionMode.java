package org.acra;
/* loaded from: classes.dex */
public enum ReportingInteractionMode {
    SILENT,
    NOTIFICATION,
    TOAST,
    DIALOG;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ReportingInteractionMode[] valuesCustom() {
        ReportingInteractionMode[] valuesCustom = values();
        int length = valuesCustom.length;
        ReportingInteractionMode[] reportingInteractionModeArr = new ReportingInteractionMode[length];
        System.arraycopy(valuesCustom, 0, reportingInteractionModeArr, 0, length);
        return reportingInteractionModeArr;
    }
}
