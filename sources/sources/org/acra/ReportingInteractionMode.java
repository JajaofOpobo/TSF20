package org.acra;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public enum ReportingInteractionMode {
    SILENT,
    NOTIFICATION,
    TOAST,
    DIALOG;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ReportingInteractionMode[] valuesCustom() {
        ReportingInteractionMode[] reportingInteractionModeArrValuesCustom = values();
        int length = reportingInteractionModeArrValuesCustom.length;
        ReportingInteractionMode[] reportingInteractionModeArr = new ReportingInteractionMode[length];
        System.arraycopy(reportingInteractionModeArrValuesCustom, 0, reportingInteractionModeArr, 0, length);
        return reportingInteractionModeArr;
    }
}
