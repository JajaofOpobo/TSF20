package com.b.a;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(Object obj) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(obj);
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            objectOutputStream = null;
            throw e2;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
            if (objectOutputStream != null) {
            }
            throw th;
        }
    }

    public static Object a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object readObject = objectInputStream.readObject();
        byteArrayInputStream.close();
        objectInputStream.close();
        return readObject;
    }

    public static void a(Context context, Object obj, String str) {
        a(context, str, a(obj));
    }

    public static Object a(Context context, String str) {
        return a(b(context, str));
    }

    public static void a(Context context, String str, byte[] bArr) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(bArr);
            openFileOutput.close();
        } catch (IOException e) {
            throw e;
        }
    }

    public static byte[] b(Context context, String str) {
        byte[] bArr = new byte[1024];
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int read = openFileInput.read(bArr, 0, 1024); read != -1; read = openFileInput.read(bArr, 0, 1024)) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            openFileInput.close();
            return byteArray;
        } catch (IOException e) {
            throw e;
        }
    }
}
