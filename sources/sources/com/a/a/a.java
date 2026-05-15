package com.a.a;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.Object r3) throws java.lang.Throwable {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L22
            r1.writeObject(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L25
            if (r1 == 0) goto L13
            r1.close()
        L13:
            byte[] r0 = r0.toByteArray()
            return r0
        L18:
            r0 = move-exception
            r1 = r2
        L1a:
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r0 = move-exception
        L1c:
            if (r1 == 0) goto L21
            r1.close()
        L21:
            throw r0
        L22:
            r0 = move-exception
            r1 = r2
            goto L1c
        L25:
            r0 = move-exception
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.a(java.lang.Object):byte[]");
    }

    public static Object a(byte[] bArr) throws ClassNotFoundException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();
        byteArrayInputStream.close();
        objectInputStream.close();
        return object;
    }

    public static void a(Context context, Object obj, String str) throws IOException {
        a(context, str, a(obj));
    }

    public static Object a(Context context, String str) {
        return a(b(context, str));
    }

    public static void a(Context context, String str, byte[] bArr) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException e) {
            throw e;
        }
    }

    public static byte[] b(Context context, String str) throws IOException {
        byte[] bArr = new byte[1024];
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = fileInputStreamOpenFileInput.read(bArr, 0, 1024); i != -1; i = fileInputStreamOpenFileInput.read(bArr, 0, 1024)) {
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            fileInputStreamOpenFileInput.close();
            return byteArray;
        } catch (IOException e) {
            throw e;
        }
    }
}
