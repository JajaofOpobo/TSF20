package com.tsf.extend.base.j;

import android.annotation.SuppressLint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MimeTypeUtils {

    @SuppressLint({"SimpleDateFormat"})
    private static SimpleDateFormat a = new SimpleDateFormat("\r\n\r\nyyyy-MM-dd HH:mm:ss.Z : ");
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        __b__.put(".3gp", "video/3gpp");
        __b__.put(".apk", "application/vnd.android.package-archive");
        __b__.put(".asf", "video/x-ms-asf");
        __b__.put(".avi", "video/x-msvideo");
        __b__.put(".bin", "application/octet-stream");
        __b__.put(".bmp", "image/bmp");
        __b__.put(".c", "text/plain");
        __b__.put(".class", "application/octet-stream");
        __b__.put(".conf", "text/plain");
        __b__.put(".cpp", "text/plain");
        __b__.put(".doc", "application/msword");
        __b__.put(".exe", "application/octet-stream");
        __b__.put(".gif", "image/gif");
        __b__.put(".gtar", "application/x-gtar");
        __b__.put(".gz", "application/x-gzip");
        __b__.put(".h", "text/plain");
        __b__.put(".htm", "text/html");
        __b__.put(".html", "text/html");
        __b__.put(".jar", "application/java-archive");
        __b__.put(".java", "text/plain");
        __b__.put(".jpeg", "image/jpeg");
        __b__.put(".jpg", "image/jpeg");
        __b__.put(".js", "application/x-javascript");
        __b__.put(".log", "text/plain");
        __b__.put(".m3u", "audio/x-mpegurl");
        __b__.put(".m4a", "audio/mp4a-latm");
        __b__.put(".m4b", "audio/mp4a-latm");
        __b__.put(".m4p", "audio/mp4a-latm");
        __b__.put(".m4u", "video/vnd.mpegurl");
        __b__.put(".m4v", "video/x-m4v");
        __b__.put(".mov", "video/quicktime");
        __b__.put(".mp2", "audio/x-mpeg");
        __b__.put(".mp3", "audio/x-mpeg");
        __b__.put(".mp4", "video/mp4");
        __b__.put(".mpc", "application/vnd.mpohun.certificate");
        __b__.put(".mpe", "video/mpeg");
        __b__.put(".mpeg", "video/mpeg");
        __b__.put(".mpg", "video/mpeg");
        __b__.put(".mpg4", "video/mp4");
        __b__.put(".mpga", "audio/mpeg");
        __b__.put(".msg", "application/vnd.ms-outlook");
        __b__.put(".ogg", "audio/ogg");
        __b__.put(".pdf", "application/pdf");
        __b__.put(".png", "image/png");
        __b__.put(".pps", "application/vnd.ms-powerpoint");
        __b__.put(".ppt", "application/vnd.ms-powerpoint");
        __b__.put(".prop", "text/plain");
        __b__.put(".rar", "application/x-rar-compressed");
        __b__.put(".rc", "text/plain");
        __b__.put(".rmvb", "video/x-pn-realaudio");
        __b__.put(".rtf", "application/rtf");
        __b__.put(".sh", "text/plain");
        __b__.put(".tar", "application/x-tar");
        __b__.put(".tgz", "application/x-compressed");
        __b__.put(".txt", "text/plain");
        __b__.put(".wav", "audio/x-wav");
        __b__.put(".wma", "audio/x-ms-wma");
        __b__.put(".wmv", "audio/x-ms-wmv");
        __b__.put(".wps", "application/vnd.ms-works");
        __b__.put(".xml", "text/plain");
        __b__.put(".z", "application/x-compress");
        __b__.put(".zip", "application/zip");
        __b__.put("", "*/*");
        __b__.put(".amr", "audio/amr");
    }

    public static boolean a(File file) {
        boolean zDelete = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            zDelete = file2.delete();
        }
        return zDelete;
    }
}
