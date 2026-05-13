package com.flurry.sdk;

import android.os.Looper;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
/* renamed from: com.flurry.sdk.df */
/* loaded from: classes.dex */
public class C1191df {

    /* renamed from: d */
    private static final String f3785d = C1191df.class.getSimpleName();

    /* renamed from: a */
    String f3786a;

    /* renamed from: b */
    long f3787b = -1;

    /* renamed from: c */
    int f3788c = -1;

    /* renamed from: e */
    private File f3789e;

    public C1191df() {
        this.f3786a = null;
        this.f3789e = null;
        this.f3786a = UUID.randomUUID().toString();
        this.f3789e = C1211do.m9390a().m9386b().getFileStreamPath(".flurrydatasenderblock." + this.f3786a);
    }

    public C1191df(String str) {
        this.f3786a = null;
        this.f3789e = null;
        this.f3786a = str;
        this.f3789e = C1211do.m9390a().m9386b().getFileStreamPath(".flurrydatasenderblock." + this.f3786a);
    }

    /* renamed from: a */
    public String m9529a() {
        return this.f3786a;
    }

    /* renamed from: a */
    public boolean m9528a(byte[] bArr) {
        DataOutputStream dataOutputStream;
        boolean z = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C1258eo.m9234a(6, f3785d, "setData(byte[]) running on the MAIN thread!");
        }
        C1258eo.m9234a(4, f3785d, "Writing FlurryDataSenderBlockInfo: " + this.f3789e.getAbsolutePath());
        try {
            if (C1276fd.m9160a(this.f3789e)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.f3789e));
                try {
                    int length = bArr.length;
                    dataOutputStream.writeShort(length);
                    dataOutputStream.write(bArr);
                    dataOutputStream.writeShort(0);
                    z = true;
                    this.f3788c = length;
                    this.f3787b = System.currentTimeMillis();
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1258eo.m9233a(6, f3785d, "", th);
                        return z;
                    } finally {
                        C1277fe.m9152a(dataOutputStream);
                    }
                }
            } else {
                C1277fe.m9152a((Closeable) null);
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
        return z;
    }

    /* renamed from: b */
    public byte[] m9527b() {
        DataInputStream dataInputStream;
        byte[] bArr = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C1258eo.m9234a(6, f3785d, "getData() running on the MAIN thread!");
        }
        if (this.f3789e.exists()) {
            C1258eo.m9234a(4, f3785d, "Reading FlurryDataSenderBlockInfo: " + this.f3789e.getAbsolutePath());
            try {
                dataInputStream = new DataInputStream(new FileInputStream(this.f3789e));
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
                    C1258eo.m9233a(6, f3785d, "Error when loading persistent file", th);
                    return bArr;
                } finally {
                    C1277fe.m9152a(dataInputStream);
                }
            }
        } else {
            C1258eo.m9234a(4, f3785d, "Agent cache file doesn't exist.");
        }
        return bArr;
    }

    /* renamed from: c */
    public boolean m9526c() {
        if (this.f3789e.exists()) {
            if (this.f3789e.delete()) {
                C1258eo.m9234a(4, f3785d, "Deleted persistence file");
                this.f3787b = -1L;
                this.f3788c = -1;
                return true;
            }
            C1258eo.m9234a(6, f3785d, "Cannot delete persistence file");
        }
        return false;
    }
}
