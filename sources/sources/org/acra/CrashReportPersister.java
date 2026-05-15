package org.acra;

import android.content.Context;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import org.acra.collector.CrashReportData;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
final class CrashReportPersister {
    private static final int CONTINUE = 3;
    private static final int IGNORE = 5;
    private static final int KEY_DONE = 4;
    private static final String LINE_SEPARATOR = "\n";
    private static final int NONE = 0;
    private static final int SLASH = 1;
    private static final int UNICODE = 2;
    private final Context context;

    CrashReportPersister(Context context) {
        this.context = context;
    }

    public CrashReportData load(String str) throws IOException {
        FileInputStream fileInputStreamOpenFileInput = this.context.openFileInput(str);
        if (fileInputStreamOpenFileInput == null) {
            throw new IllegalArgumentException("Invalid crash report fileName : " + str);
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamOpenFileInput, ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            bufferedInputStream.mark(Integer.MAX_VALUE);
            boolean zIsEbcdic = isEbcdic(bufferedInputStream);
            bufferedInputStream.reset();
            return !zIsEbcdic ? load(new InputStreamReader(bufferedInputStream, "ISO8859-1")) : load(new InputStreamReader(bufferedInputStream));
        } finally {
            fileInputStreamOpenFileInput.close();
        }
    }

    public void store(CrashReportData crashReportData, String str) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.context.openFileOutput(str, 0);
        try {
            StringBuilder sb = new StringBuilder(VEasing.Back.easeIn);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenFileOutput, "ISO8859_1");
            for (Map.Entry<ReportField, String> entry : crashReportData.entrySet()) {
                dumpString(sb, entry.getKey().toString(), true);
                sb.append('=');
                dumpString(sb, entry.getValue(), false);
                sb.append(LINE_SEPARATOR);
                outputStreamWriter.write(sb.toString());
                sb.setLength(0);
            }
            outputStreamWriter.flush();
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
    }

    private boolean isEbcdic(BufferedInputStream bufferedInputStream) {
        byte b;
        do {
            b = (byte) bufferedInputStream.read();
            if (b == -1 || b == 35 || b == 10 || b == 61) {
                return false;
            }
        } while (b != 21);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized org.acra.collector.CrashReportData load(java.io.Reader r15) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.CrashReportPersister.load(java.io.Reader):org.acra.collector.CrashReportData");
    }

    private void dumpString(StringBuilder sb, String str, boolean z) {
        int i;
        if (z || 0 >= str.length() || str.charAt(0) != ' ') {
            i = 0;
        } else {
            sb.append("\\ ");
            i = 1;
        }
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case 11:
                default:
                    if ("\\#!=:".indexOf(cCharAt) >= 0 || (z && cCharAt == ' ')) {
                        sb.append('\\');
                    }
                    if (cCharAt >= ' ' && cCharAt <= '~') {
                        sb.append(cCharAt);
                    } else {
                        String hexString = Integer.toHexString(cCharAt);
                        sb.append("\\u");
                        for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
            }
            i++;
        }
    }
}
