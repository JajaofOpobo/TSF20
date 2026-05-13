package com.flurry.sdk;

import android.os.Looper;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
/* loaded from: classes.dex */
public class df {
    private static final String d = df.class.getSimpleName();
    String a;
    long b = -1;
    int c = -1;
    private File e;

    public df() {
        this.a = null;
        this.e = null;
        this.a = UUID.randomUUID().toString();
        this.e = Cdo.a().b().getFileStreamPath(".flurrydatasenderblock." + this.a);
    }

    public df(String str) {
        this.a = null;
        this.e = null;
        this.a = str;
        this.e = Cdo.a().b().getFileStreamPath(".flurrydatasenderblock." + this.a);
    }

    public String a() {
        return this.a;
    }

    public boolean a(byte[] bArr) {
        DataOutputStream dataOutputStream;
        boolean z = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eo.a(6, d, "setData(byte[]) running on the MAIN thread!");
        }
        eo.a(4, d, "Writing FlurryDataSenderBlockInfo: " + this.e.getAbsolutePath());
        try {
            if (fd.a(this.e)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.e));
                try {
                    int length = bArr.length;
                    dataOutputStream.writeShort(length);
                    dataOutputStream.write(bArr);
                    dataOutputStream.writeShort(0);
                    z = true;
                    this.c = length;
                    this.b = System.currentTimeMillis();
                } catch (Throwable th) {
                    th = th;
                    try {
                        eo.a(6, d, "", th);
                        return z;
                    } finally {
                        fe.a(dataOutputStream);
                    }
                }
            } else {
                fe.a((Closeable) null);
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
        return z;
    }

    public byte[] b() {
        DataInputStream dataInputStream;
        byte[] bArr = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eo.a(6, d, "getData() running on the MAIN thread!");
        }
        if (this.e.exists()) {
            eo.a(4, d, "Reading FlurryDataSenderBlockInfo: " + this.e.getAbsolutePath());
            try {
                dataInputStream = new DataInputStream(new FileInputStream(this.e));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                if (readUnsignedShort != 0) {
                    bArr = new byte[readUnsignedShort];
                    dataInputStream.readFully(bArr);
                    if (dataInputStream.readUnsignedShort() == 0) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    eo.a(6, d, "Error when loading persistent file", th);
                    return bArr;
                } finally {
                    fe.a(dataInputStream);
                }
            }
        } else {
            eo.a(4, d, "Agent cache file doesn't exist.");
        }
        return bArr;
    }

    public boolean c() {
        if (this.e.exists()) {
            if (this.e.delete()) {
                eo.a(4, d, "Deleted persistence file");
                this.b = -1L;
                this.c = -1;
                return true;
            }
            eo.a(6, d, "Cannot delete persistence file");
        }
        return false;
    }
}
