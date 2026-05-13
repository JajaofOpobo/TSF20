package com.tsf.extend.base.j;

import android.annotation.SuppressLint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
/* loaded from: classes.dex */
public class k {
    @SuppressLint({"SimpleDateFormat"})
    private static SimpleDateFormat a = new SimpleDateFormat("\r\n\r\nyyyy-MM-dd HH:mm:ss.Z : ");
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        b.put(".3gp", "video/3gpp");
        b.put(".apk", "application/vnd.android.package-archive");
        b.put(".asf", "video/x-ms-asf");
        b.put(".avi", "video/x-msvideo");
        b.put(".bin", "application/octet-stream");
        b.put(".bmp", "image/bmp");
        b.put(".c", "text/plain");
        b.put(".class", "application/octet-stream");
        b.put(".conf", "text/plain");
        b.put(".cpp", "text/plain");
        b.put(".doc", "application/msword");
        b.put(".exe", "application/octet-stream");
        b.put(".gif", "image/gif");
        b.put(".gtar", "application/x-gtar");
        b.put(".gz", "application/x-gzip");
        b.put(".h", "text/plain");
        b.put(".htm", "text/html");
        b.put(".html", "text/html");
        b.put(".jar", "application/java-archive");
        b.put(".java", "text/plain");
        b.put(".jpeg", "image/jpeg");
        b.put(".jpg", "image/jpeg");
        b.put(".js", "application/x-javascript");
        b.put(".log", "text/plain");
        b.put(".m3u", "audio/x-mpegurl");
        b.put(".m4a", "audio/mp4a-latm");
        b.put(".m4b", "audio/mp4a-latm");
        b.put(".m4p", "audio/mp4a-latm");
        b.put(".m4u", "video/vnd.mpegurl");
        b.put(".m4v", "video/x-m4v");
        b.put(".mov", "video/quicktime");
        b.put(".mp2", "audio/x-mpeg");
        b.put(".mp3", "audio/x-mpeg");
        b.put(".mp4", "video/mp4");
        b.put(".mpc", "application/vnd.mpohun.certificate");
        b.put(".mpe", "video/mpeg");
        b.put(".mpeg", "video/mpeg");
        b.put(".mpg", "video/mpeg");
        b.put(".mpg4", "video/mp4");
        b.put(".mpga", "audio/mpeg");
        b.put(".msg", "application/vnd.ms-outlook");
        b.put(".ogg", "audio/ogg");
        b.put(".pdf", "application/pdf");
        b.put(".png", "image/png");
        b.put(".pps", "application/vnd.ms-powerpoint");
        b.put(".ppt", "application/vnd.ms-powerpoint");
        b.put(".prop", "text/plain");
        b.put(".rar", "application/x-rar-compressed");
        b.put(".rc", "text/plain");
        b.put(".rmvb", "video/x-pn-realaudio");
        b.put(".rtf", "application/rtf");
        b.put(".sh", "text/plain");
        b.put(".tar", "application/x-tar");
        b.put(".tgz", "application/x-compressed");
        b.put(".txt", "text/plain");
        b.put(".wav", "audio/x-wav");
        b.put(".wma", "audio/x-ms-wma");
        b.put(".wmv", "audio/x-ms-wmv");
        b.put(".wps", "application/vnd.ms-works");
        b.put(".xml", "text/plain");
        b.put(".z", "application/x-compress");
        b.put(".zip", "application/zip");
        b.put("", "*/*");
        b.put(".amr", "audio/amr");
    }

    public static boolean a(File file) {
        boolean z = true;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2);
                        }
                        z = file2.delete();
                    }
                    return z;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
