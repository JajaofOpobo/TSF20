package org.acra;

import android.content.Context;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeIconDesignerMenu;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Map;
import org.acra.collector.CollectorUtil;
import org.acra.collector.CrashReportData;

/* loaded from: classes.dex */
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

    public CrashReportData load(String str) {
        FileInputStream openFileInput = this.context.openFileInput(str);
        if (openFileInput == null) {
            throw new IllegalArgumentException("Invalid crash report fileName : " + str);
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(openFileInput, ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            bufferedInputStream.mark(Integer.MAX_VALUE);
            boolean isEbcdic = isEbcdic(bufferedInputStream);
            bufferedInputStream.reset();
            return !isEbcdic ? load(new InputStreamReader(bufferedInputStream, "ISO8859-1")) : load(new InputStreamReader(bufferedInputStream));
        } finally {
            openFileInput.close();
        }
    }

    public void store(CrashReportData crashReportData, String str) {
        FileOutputStream openFileOutput = this.context.openFileOutput(str, 0);
        try {
            StringBuilder sb = new StringBuilder(VEasing.Back.easeIn);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput, "ISO8859_1");
            for (Map.Entry entry : crashReportData.entrySet()) {
                dumpString(sb, ((ReportField) entry.getKey()).toString(), true);
                sb.append('=');
                dumpString(sb, (String) entry.getValue(), false);
                sb.append(LINE_SEPARATOR);
                outputStreamWriter.write(sb.toString());
                sb.setLength(0);
            }
            outputStreamWriter.flush();
        } finally {
            openFileOutput.close();
        }
    }

    private boolean isEbcdic(BufferedInputStream bufferedInputStream) {
        byte read;
        do {
            read = (byte) bufferedInputStream.read();
            if (read == -1 || read == 35 || read == 10 || read == 61) {
                return false;
            }
        } while (read != 21);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized CrashReportData load(Reader reader) {
        CrashReportData crashReportData;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        char[] cArr = new char[40];
        int i6 = 0;
        crashReportData = new CrashReportData();
        BufferedReader bufferedReader = new BufferedReader(reader, ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        boolean z = true;
        int i7 = 0;
        int i8 = -1;
        int i9 = 0;
        char c2 = 0;
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                char c3 = (char) read;
                if (i6 == cArr.length) {
                    char[] cArr2 = new char[cArr.length * 2];
                    System.arraycopy(cArr, 0, cArr2, 0, i6);
                    cArr = cArr2;
                }
                if (c2 == 2) {
                    int digit = Character.digit(c3, 16);
                    if (digit >= 0) {
                        int i10 = digit + (i7 << 4);
                        i5 = i9 + 1;
                        if (i5 < 4) {
                            i9 = i5;
                            i7 = i10;
                        } else {
                            i4 = i10;
                        }
                    } else {
                        if (i9 <= 4) {
                            throw new IllegalArgumentException("luni.09");
                        }
                        i4 = i7;
                        i5 = i9;
                    }
                    i2 = i6 + 1;
                    cArr[i6] = (char) i4;
                    if (c3 == '\n' || c3 == 133) {
                        c = 0;
                        i = i4;
                        i3 = i5;
                    } else {
                        i6 = i2;
                        i9 = i5;
                        i7 = i4;
                        c2 = 0;
                    }
                } else {
                    i = i7;
                    int i11 = i9;
                    i2 = i6;
                    c = c2;
                    i3 = i11;
                }
                if (c == 1) {
                    switch (c3) {
                        case '\n':
                        case 133:
                            i7 = i;
                            int i12 = i3;
                            c2 = 5;
                            i6 = i2;
                            i9 = i12;
                            continue;
                        case '\r':
                            i7 = i;
                            int i13 = i3;
                            c2 = 3;
                            i6 = i2;
                            i9 = i13;
                            continue;
                        case 'b':
                            c3 = '\b';
                            c = 0;
                            break;
                        case VEasing.Circ.easeInOut /* 102 */:
                            c3 = '\f';
                            c = 0;
                            break;
                        case ThemeIconDesignerMenu.NOTIF_POINT_VERSION_CODE_110 /* 110 */:
                            c3 = '\n';
                            c = 0;
                            break;
                        case 'r':
                            c3 = '\r';
                            c = 0;
                            break;
                        case 't':
                            c3 = '\t';
                            c = 0;
                            break;
                        case 'u':
                            i7 = 0;
                            c2 = 2;
                            i6 = i2;
                            i9 = 0;
                            continue;
                        default:
                            c = 0;
                            break;
                    }
                    if (c == 4) {
                        c = 0;
                        i8 = i2;
                    }
                    int i14 = i2 + 1;
                    cArr[i2] = c3;
                    i9 = i3;
                    c2 = c;
                    i6 = i14;
                    z = false;
                    i7 = i;
                } else {
                    switch (c3) {
                        case '\n':
                            if (c == 3) {
                                i7 = i;
                                int i15 = i3;
                                c2 = 5;
                                i6 = i2;
                                i9 = i15;
                                break;
                            } else {
                                if (i2 <= 0 || (i2 == 0 && i8 == 0)) {
                                    int i16 = i8 != -1 ? i2 : i8;
                                    String str = new String(cArr, 0, i2);
                                    crashReportData.put((CrashReportData) Enum.valueOf(ReportField.class, str.substring(0, i16)), (ReportField) str.substring(i16));
                                }
                                i8 = -1;
                                z = true;
                                i6 = 0;
                                i9 = i3;
                                c2 = 0;
                                i7 = i;
                                break;
                            }
                        case '\r':
                        case 133:
                            if (i2 <= 0) {
                            }
                            if (i8 != -1) {
                            }
                            String str2 = new String(cArr, 0, i2);
                            crashReportData.put((CrashReportData) Enum.valueOf(ReportField.class, str2.substring(0, i16)), (ReportField) str2.substring(i16));
                            i8 = -1;
                            z = true;
                            i6 = 0;
                            i9 = i3;
                            c2 = 0;
                            i7 = i;
                            break;
                        case '!':
                        case '#':
                            if (!z) {
                                if (Character.isWhitespace(c3)) {
                                    if (c == 3) {
                                        c = 5;
                                    }
                                    if (i2 != 0 && i2 != i8) {
                                        if (c == 5) {
                                            i7 = i;
                                            int i17 = i3;
                                            c2 = c;
                                            i6 = i2;
                                            i9 = i17;
                                            break;
                                        } else if (i8 == -1) {
                                            i7 = i;
                                            int i18 = i3;
                                            c2 = 4;
                                            i6 = i2;
                                            i9 = i18;
                                            break;
                                        }
                                    }
                                    i7 = i;
                                    int i19 = i3;
                                    c2 = c;
                                    i6 = i2;
                                    i9 = i19;
                                    break;
                                }
                                if (c != 5 || c == 3) {
                                    c = 0;
                                }
                                if (c == 4) {
                                }
                                int i142 = i2 + 1;
                                cArr[i2] = c3;
                                i9 = i3;
                                c2 = c;
                                i6 = i142;
                                z = false;
                                i7 = i;
                                break;
                            } else {
                                while (true) {
                                    int read2 = bufferedReader.read();
                                    if (read2 == -1) {
                                        i7 = i;
                                        int i20 = i3;
                                        c2 = c;
                                        i6 = i2;
                                        i9 = i20;
                                        break;
                                    } else {
                                        char c4 = (char) read2;
                                        if (c4 != '\r' && c4 != '\n') {
                                            if (c4 == 133) {
                                                i7 = i;
                                                int i21 = i3;
                                                c2 = c;
                                                i6 = i2;
                                                i9 = i21;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ':':
                        case '=':
                            if (i8 == -1) {
                                i8 = i2;
                                i7 = i;
                                int i22 = i3;
                                c2 = 0;
                                i6 = i2;
                                i9 = i22;
                                break;
                            } else {
                                if (Character.isWhitespace(c3)) {
                                }
                                if (c != 5) {
                                    break;
                                }
                                c = 0;
                                if (c == 4) {
                                }
                                int i1422 = i2 + 1;
                                cArr[i2] = c3;
                                i9 = i3;
                                c2 = c;
                                i6 = i1422;
                                z = false;
                                i7 = i;
                                break;
                            }
                            break;
                        case '\\':
                            if (c == 4) {
                                i8 = i2;
                            }
                            i7 = i;
                            int i23 = i3;
                            c2 = 1;
                            i6 = i2;
                            i9 = i23;
                            break;
                        default:
                            if (Character.isWhitespace(c3)) {
                            }
                            if (c != 5) {
                            }
                            c = 0;
                            if (c == 4) {
                            }
                            int i14222 = i2 + 1;
                            cArr[i2] = c3;
                            i9 = i3;
                            c2 = c;
                            i6 = i14222;
                            z = false;
                            i7 = i;
                            break;
                    }
                }
            } else {
                if (c2 == 2 && i9 <= 4) {
                    throw new IllegalArgumentException("luni.08");
                }
                int i24 = (i8 != -1 || i6 <= 0) ? i8 : i6;
                if (i24 >= 0) {
                    String str3 = new String(cArr, 0, i6);
                    ReportField reportField = (ReportField) Enum.valueOf(ReportField.class, str3.substring(0, i24));
                    String substring = str3.substring(i24);
                    if (c2 == 1) {
                        substring = String.valueOf(substring) + "\u0000";
                    }
                    crashReportData.put((CrashReportData) reportField, (ReportField) substring);
                }
                CollectorUtil.safeClose(reader);
            }
        }
        return crashReportData;
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
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case 11:
                default:
                    if ("\\#!=:".indexOf(charAt) >= 0 || (z && charAt == ' ')) {
                        sb.append('\\');
                    }
                    if (charAt >= ' ' && charAt <= '~') {
                        sb.append(charAt);
                        break;
                    } else {
                        String hexString = Integer.toHexString(charAt);
                        sb.append("\\u");
                        for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                        break;
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
