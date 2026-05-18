package com.cm.kinfoc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    private Context a;

    public e(Context context) {
        this.a = null;
        this.a = context;
    }

    public boolean a(String str, String str2, byte[] bArr) throws IOException {
        boolean z = false;
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str + File.separator + str2));
        FileLock fileLockTryLock = fileOutputStream.getChannel().tryLock();
        if (fileLockTryLock != null) {
            fileOutputStream.write(bArr);
            fileLockTryLock.release();
            z = true;
        }
        fileOutputStream.close();
        return z;
    }

    public static byte[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        int iAvailable = fileInputStream.available();
        int i = iAvailable <= 1024 ? iAvailable : 1024;
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
