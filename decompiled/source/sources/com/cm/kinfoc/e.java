package com.cm.kinfoc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* loaded from: classes.dex */
public class e {
    private Context a;

    public e(Context context) {
        this.a = null;
        this.a = context;
    }

    public boolean a(String str, String str2, byte[] bArr) {
        boolean z = false;
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str + File.separator + str2));
        FileLock tryLock = fileOutputStream.getChannel().tryLock();
        if (tryLock != null) {
            fileOutputStream.write(bArr);
            tryLock.release();
            z = true;
        }
        fileOutputStream.close();
        return z;
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        int available = fileInputStream.available();
        int i = available <= 1024 ? available : 1024;
        if (i <= 0) {
            fileInputStream.close();
            return null;
        }
        byte[] bArr = new byte[i];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (fileInputStream.read(bArr) != -1) {
            byteArrayOutputStream.write(bArr);
        }
        fileInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
