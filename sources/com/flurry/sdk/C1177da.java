package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
/* renamed from: com.flurry.sdk.da */
/* loaded from: classes.dex */
public final class C1177da {

    /* renamed from: a */
    private int f3741a;

    /* renamed from: b */
    private long f3742b;

    /* renamed from: c */
    private String f3743c;

    /* renamed from: d */
    private String f3744d;

    /* renamed from: e */
    private String f3745e;

    /* renamed from: f */
    private Throwable f3746f;

    public C1177da(int i, long j, String str, String str2, String str3, Throwable th) {
        this.f3741a = i;
        this.f3742b = j;
        this.f3743c = str;
        this.f3744d = str2;
        this.f3745e = str3;
        this.f3746f = th;
    }

    /* renamed from: a */
    public int m9564a() {
        return m9563b().length;
    }

    /* renamed from: b */
    public byte[] m9563b() {
        Throwable th;
        DataOutputStream dataOutputStream;
        byte[] bArr;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(this.f3741a);
                    dataOutputStream.writeLong(this.f3742b);
                    dataOutputStream.writeUTF(this.f3743c);
                    dataOutputStream.writeUTF(this.f3744d);
                    dataOutputStream.writeUTF(this.f3745e);
                    if (this.f3746f != null) {
                        if (this.f3743c == "uncaught") {
                            dataOutputStream.writeByte(3);
                        } else {
                            dataOutputStream.writeByte(2);
                        }
                        dataOutputStream.writeByte(2);
                        StringBuilder sb = new StringBuilder("");
                        String property = System.getProperty("line.separator");
                        for (StackTraceElement stackTraceElement : this.f3746f.getStackTrace()) {
                            sb.append(stackTraceElement);
                            sb.append(property);
                        }
                        if (this.f3746f.getCause() != null) {
                            sb.append(property);
                            sb.append("Caused by: ");
                            for (StackTraceElement stackTraceElement2 : this.f3746f.getCause().getStackTrace()) {
                                sb.append(stackTraceElement2);
                                sb.append(property);
                            }
                        }
                        byte[] bytes = sb.toString().getBytes();
                        dataOutputStream.writeInt(bytes.length);
                        dataOutputStream.write(bytes);
                    } else {
                        dataOutputStream.writeByte(1);
                        dataOutputStream.writeByte(0);
                    }
                    dataOutputStream.flush();
                    bArr = byteArrayOutputStream.toByteArray();
                    C1277fe.m9152a(dataOutputStream);
                } catch (IOException e) {
                    bArr = new byte[0];
                    C1277fe.m9152a(dataOutputStream);
                    return bArr;
                }
            } catch (Throwable th2) {
                th = th2;
                C1277fe.m9152a((Closeable) null);
                throw th;
            }
        } catch (IOException e2) {
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C1277fe.m9152a((Closeable) null);
            throw th;
        }
        return bArr;
    }

    /* renamed from: c */
    public String m9562c() {
        return this.f3743c;
    }
}
