package com.tsf.extend.base.p080j;

import android.annotation.SuppressLint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
/* renamed from: com.tsf.extend.base.j.k */
/* loaded from: classes.dex */
public class C1432k {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    private static SimpleDateFormat f4426a = new SimpleDateFormat("\r\n\r\nyyyy-MM-dd HH:mm:ss.Z : ");

    /* renamed from: b */
    private static final HashMap<String, String> f4427b = new HashMap<>();

    static {
        f4427b.put(".3gp", "video/3gpp");
        f4427b.put(".apk", "application/vnd.android.package-archive");
        f4427b.put(".asf", "video/x-ms-asf");
        f4427b.put(".avi", "video/x-msvideo");
        f4427b.put(".bin", "application/octet-stream");
        f4427b.put(".bmp", "image/bmp");
        f4427b.put(".c", "text/plain");
        f4427b.put(".class", "application/octet-stream");
        f4427b.put(".conf", "text/plain");
        f4427b.put(".cpp", "text/plain");
        f4427b.put(".doc", "application/msword");
        f4427b.put(".exe", "application/octet-stream");
        f4427b.put(".gif", "image/gif");
        f4427b.put(".gtar", "application/x-gtar");
        f4427b.put(".gz", "application/x-gzip");
        f4427b.put(".h", "text/plain");
        f4427b.put(".htm", "text/html");
        f4427b.put(".html", "text/html");
        f4427b.put(".jar", "application/java-archive");
        f4427b.put(".java", "text/plain");
        f4427b.put(".jpeg", "image/jpeg");
        f4427b.put(".jpg", "image/jpeg");
        f4427b.put(".js", "application/x-javascript");
        f4427b.put(".log", "text/plain");
        f4427b.put(".m3u", "audio/x-mpegurl");
        f4427b.put(".m4a", "audio/mp4a-latm");
        f4427b.put(".m4b", "audio/mp4a-latm");
        f4427b.put(".m4p", "audio/mp4a-latm");
        f4427b.put(".m4u", "video/vnd.mpegurl");
        f4427b.put(".m4v", "video/x-m4v");
        f4427b.put(".mov", "video/quicktime");
        f4427b.put(".mp2", "audio/x-mpeg");
        f4427b.put(".mp3", "audio/x-mpeg");
        f4427b.put(".mp4", "video/mp4");
        f4427b.put(".mpc", "application/vnd.mpohun.certificate");
        f4427b.put(".mpe", "video/mpeg");
        f4427b.put(".mpeg", "video/mpeg");
        f4427b.put(".mpg", "video/mpeg");
        f4427b.put(".mpg4", "video/mp4");
        f4427b.put(".mpga", "audio/mpeg");
        f4427b.put(".msg", "application/vnd.ms-outlook");
        f4427b.put(".ogg", "audio/ogg");
        f4427b.put(".pdf", "application/pdf");
        f4427b.put(".png", "image/png");
        f4427b.put(".pps", "application/vnd.ms-powerpoint");
        f4427b.put(".ppt", "application/vnd.ms-powerpoint");
        f4427b.put(".prop", "text/plain");
        f4427b.put(".rar", "application/x-rar-compressed");
        f4427b.put(".rc", "text/plain");
        f4427b.put(".rmvb", "video/x-pn-realaudio");
        f4427b.put(".rtf", "application/rtf");
        f4427b.put(".sh", "text/plain");
        f4427b.put(".tar", "application/x-tar");
        f4427b.put(".tgz", "application/x-compressed");
        f4427b.put(".txt", "text/plain");
        f4427b.put(".wav", "audio/x-wav");
        f4427b.put(".wma", "audio/x-ms-wma");
        f4427b.put(".wmv", "audio/x-ms-wmv");
        f4427b.put(".wps", "application/vnd.ms-works");
        f4427b.put(".xml", "text/plain");
        f4427b.put(".z", "application/x-compress");
        f4427b.put(".zip", "application/zip");
        f4427b.put("", "*/*");
        f4427b.put(".amr", "audio/amr");
    }

    /* renamed from: a */
    public static boolean m8647a(File file) {
        boolean z = true;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m8647a(file2);
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
