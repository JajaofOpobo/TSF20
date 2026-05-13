package com.tsf.shell.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import com.flurry.android.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class u {
    public static String a(String str) {
        return ((((((str + "AndroidVersion:" + Build.VERSION.RELEASE + "\n") + "SDKVersion:" + Build.VERSION.SDK + "\n") + "DeviceModel:" + Build.MODEL + "\n") + "Product:" + Build.PRODUCT + "\n") + "Device:" + Build.DEVICE + "\n") + "Board:" + Build.BOARD + "\n") + "Rom:" + Build.DISPLAY + "\n";
    }

    public static String a(Context context, String str) {
        try {
            return str + "AppKey:" + a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()) + "\n";
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String a(byte[] bArr) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
        }
        byte[] digest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            if (Integer.toHexString(digest[i] & Constants.UNKNOWN).length() == 1) {
                stringBuffer.append("0").append(Integer.toHexString(digest[i] & Constants.UNKNOWN));
            } else {
                stringBuffer.append(Integer.toHexString(digest[i] & Constants.UNKNOWN));
            }
        }
        return stringBuffer.toString();
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = (str + "PackageName:" + context.getPackageName() + "\n") + "AppVer:" + packageInfo.versionName + "\n";
            return str + "AppVerCode:" + packageInfo.versionCode + "\n";
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = str;
            e.printStackTrace();
            return str2;
        }
    }

    public static String c(Context context, String str) {
        new DisplayMetrics();
        return str + "Density:" + context.getResources().getDisplayMetrics().density + "\n";
    }

    public static String b(String str) {
        BufferedReader bufferedReader;
        try {
            String str2 = str + "KernelVersion:" + bufferedReader.readLine().split("\\s+")[2] + "\n";
            try {
                new BufferedReader(new FileReader("/proc/version"), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES).close();
                return str2;
            } catch (IOException e) {
                return str2;
            }
        } catch (IOException e2) {
            return str;
        }
    }

    public static String d(Context context, String str) {
        String str2;
        try {
            str2 = str + "AvailMemory:" + b(context) + "\n";
        } catch (Exception e) {
            str2 = str;
        }
        try {
            return str2 + "TotalMemory:" + c(context) + "\n";
        } catch (Exception e2) {
            return str2;
        }
    }

    private static String b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return Formatter.formatFileSize(context, memoryInfo.availMem);
    }

    private static String c(Context context) {
        long j = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            j = Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * 1024;
            bufferedReader.close();
        } catch (IOException e) {
        }
        return Formatter.formatFileSize(context, j);
    }
}
