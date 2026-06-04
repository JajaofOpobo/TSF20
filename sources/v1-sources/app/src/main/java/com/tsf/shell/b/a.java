package com.tsf.shell.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class a {
    public static String a(Context context, String str) {
        try {
            return String.valueOf(str) + "AppKey:" + a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()) + "\n";
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
            if (Integer.toHexString(digest[i] & 255).length() == 1) {
                stringBuffer.append("0").append(Integer.toHexString(digest[i] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(digest[i] & 255));
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
            str = String.valueOf(String.valueOf(str) + "PackageName:" + context.getPackageName() + "\n") + "AppVer:" + packageInfo.versionName + "\n";
            return String.valueOf(str) + "AppVerCode:" + packageInfo.versionCode + "\n";
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = str;
            e.printStackTrace();
            return str2;
        }
    }

    public static String a(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            int i = 0;
            String str2 = str;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str2 = String.valueOf(str2) + readLine + "\n";
                        if (i <= 0) {
                            i++;
                        } else {
                            return str2;
                        }
                    } else {
                        return str2;
                    }
                } catch (IOException e) {
                    return str2;
                }
            }
        } catch (IOException e2) {
            return str;
        }
    }

    public static String b(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 8192);
            String str2 = String.valueOf(str) + "KernelVersion:" + bufferedReader.readLine().split("\\s+")[2] + "\n";
            try {
                bufferedReader.close();
                return str2;
            } catch (IOException e) {
                return str2;
            }
        } catch (IOException e2) {
            return str;
        }
    }
}
