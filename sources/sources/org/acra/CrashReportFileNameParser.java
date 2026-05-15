package org.acra;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
final class CrashReportFileNameParser {
    CrashReportFileNameParser() {
    }

    public boolean isSilent(String str) {
        return str.contains(ACRAConstants.SILENT_SUFFIX);
    }

    public boolean isApproved(String str) {
        return isSilent(str) || str.contains("-approved");
    }
}
