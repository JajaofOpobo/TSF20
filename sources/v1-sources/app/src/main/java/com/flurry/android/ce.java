package com.flurry.android;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class ce {
    private int a;
    private String b;
    private Map c;
    private long d;
    private boolean e = false;
    private long f;

    public ce(int i, String str, Map map, long j) {
        this.a = i;
        this.b = str;
        this.c = map;
        this.d = j;
    }

    public final byte[] a() {
        DataOutputStream dataOutputStream;
        Throwable th;
        DataOutputStream dataOutputStream2;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (IOException e) {
            dataOutputStream2 = null;
        } catch (Throwable th2) {
            dataOutputStream = null;
            th = th2;
        }
        try {
            dataOutputStream.writeShort(this.a);
            dataOutputStream.writeUTF(this.b);
            if (this.c == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(this.c.size());
                for (Map.Entry entry : this.c.entrySet()) {
                    dataOutputStream.writeUTF(bp.a((String) entry.getKey()));
                    dataOutputStream.writeUTF(bp.a((String) entry.getValue()));
                }
            }
            dataOutputStream.writeLong(this.d);
            dataOutputStream.writeLong(this.f);
            dataOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
            bp.a(dataOutputStream);
        } catch (IOException e2) {
            dataOutputStream2 = dataOutputStream;
            try {
                bArr = new byte[0];
                bp.a(dataOutputStream2);
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = dataOutputStream2;
                bp.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bp.a(dataOutputStream);
            throw th;
        }
        return bArr;
    }
}
