package com.p060cm.kinfoc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* renamed from: com.cm.kinfoc.e */
/* loaded from: classes.dex */
public class C1142e {

    /* renamed from: a */
    private Context f3612a;

    public C1142e(Context context) {
        this.f3612a = null;
        this.f3612a = context;
    }

    /* renamed from: a */
    public boolean m9738a(String str, String str2, byte[] bArr) {
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

    /* renamed from: a */
    public static byte[] m9739a(File file) {
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
