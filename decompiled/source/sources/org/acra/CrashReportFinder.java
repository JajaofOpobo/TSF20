package org.acra;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CrashReportFinder {
    private final Context context;

    public CrashReportFinder(Context context) {
        this.context = context;
    }

    public String[] getCrashReportFiles() {
        if (this.context == null) {
            ACRA.log.e(ACRA.LOG_TAG, "Trying to get ACRA reports but ACRA is not initialized.");
            return new String[0];
        }
        File filesDir = this.context.getFilesDir();
        if (filesDir == null) {
            ACRA.log.w(ACRA.LOG_TAG, "Application files directory does not exist! The application may not be installed correctly. Please try reinstalling.");
            return new String[0];
        }
        ACRA.log.d(ACRA.LOG_TAG, "Looking for error files in " + filesDir.getAbsolutePath());
        String[] list = filesDir.list(new FilenameFilter() { // from class: org.acra.CrashReportFinder.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(ACRAConstants.REPORTFILE_EXTENSION);
            }
        });
        return list == null ? new String[0] : list;
    }
}
