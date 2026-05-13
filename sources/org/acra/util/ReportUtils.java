package org.acra.util;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.format.Time;
import android.util.SparseArray;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Locale;
import org.acra.ACRA;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public final class ReportUtils {
    public static long getAvailableInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static long getTotalInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    public static String getDeviceId(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (RuntimeException e) {
            ACRA.log.mo2w(ACRA.LOG_TAG, "Couldn't retrieve DeviceId for : " + context.getPackageName(), e);
            return null;
        }
    }

    public static String getApplicationFilePath(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getAbsolutePath();
        }
        ACRA.log.mo3w(ACRA.LOG_TAG, "Couldn't retrieve ApplicationFilePath for : " + context.getPackageName());
        return "Couldn't retrieve ApplicationFilePath";
    }

    public static String sparseArrayToString(SparseArray<?> sparseArray) {
        StringBuilder sb = new StringBuilder();
        if (sparseArray == null) {
            return "null";
        }
        sb.append('{');
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(sparseArray.keyAt(i));
            sb.append(" => ");
            if (sparseArray.valueAt(i) == null) {
                sb.append("null");
            } else {
                sb.append(sparseArray.valueAt(i).toString());
            }
            if (i < sparseArray.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static String getLocalIpAddress() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        if (!z) {
                            sb.append('\n');
                        }
                        sb.append(nextElement.getHostAddress().toString());
                        z = false;
                    }
                }
            }
        } catch (SocketException e) {
            ACRA.log.mo3w(ACRA.LOG_TAG, e.toString());
        }
        return sb.toString();
    }

    public static String getTimeString(Time time) {
        return new SimpleDateFormat(ACRAConstants.DATE_TIME_FORMAT_STRING, Locale.ENGLISH).format(Long.valueOf(time.toMillis(true)));
    }
}
