package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class fd {
    private static String a = fd.class.getSimpleName();

    public static File a(boolean z) {
        File file = null;
        Context b = Cdo.a().b();
        if (z && "mounted".equals(Environment.getExternalStorageState()) && (Build.VERSION.SDK_INT >= 19 || b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            file = b.getExternalFilesDir(null);
        }
        if (file == null) {
            return b.getFilesDir();
        }
        return file;
    }

    public static File b(boolean z) {
        Context b = Cdo.a().b();
        File file = null;
        if (z && "mounted".equals(Environment.getExternalStorageState()) && (Build.VERSION.SDK_INT >= 19 || b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            file = b.getExternalCacheDir();
        }
        if (file == null) {
            return b.getCacheDir();
        }
        return file;
    }

    public static boolean a(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        eo.a(6, a, "Unable to create persistent dir: " + parentFile);
        return false;
    }

    public static boolean b(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!b(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        StringBuilder sb;
        if (file == null || !file.exists()) {
            eo.a(4, a, "Persistent file doesn't exist.");
            return null;
        }
        eo.a(4, a, "Loading persistent data: " + file.getAbsolutePath());
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                    }
                    fe.a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    eo.a(6, a, "Error when loading persistent file", th);
                    fe.a(fileInputStream);
                    sb = null;
                    if (sb == null) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fe.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            fe.a(fileInputStream);
            throw th;
        }
        if (sb == null) {
            return sb.toString();
        }
        return null;
    }

    @Deprecated
    public static void a(File file, String str) {
        FileOutputStream fileOutputStream;
        if (file == null) {
            eo.a(4, a, "No persistent file specified.");
            return;
        }
        if (str == null) {
            eo.a(4, a, "No data specified; deleting persistent file: " + file.getAbsolutePath());
            file.delete();
            return;
        }
        eo.a(4, a, "Writing persistent data: " + file.getAbsolutePath());
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    fileOutputStream.write(str.getBytes());
                    fe.a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    eo.a(6, a, "Error writing persistent file", th);
                    fe.a(fileOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                fe.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            fe.a(fileOutputStream);
            throw th;
        }
    }
}
