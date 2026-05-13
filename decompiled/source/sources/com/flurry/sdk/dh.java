package com.flurry.sdk;

import com.flurry.sdk.cx;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class dh {
    private static final String b = dh.class.getSimpleName();
    byte[] a;

    public dh(byte[] bArr) {
        this.a = bArr;
    }

    public dh(di diVar) {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        DataOutputStream dataOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (IOException e) {
            e = e;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.writeShort(3);
            dataOutputStream.writeUTF(diVar.a());
            dataOutputStream.writeLong(diVar.b());
            dataOutputStream.writeLong(diVar.c());
            dataOutputStream.writeLong(diVar.d());
            Map<String, String> e2 = diVar.e();
            if (e2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(e2.size());
                for (Map.Entry<String, String> entry : e2.entrySet()) {
                    dataOutputStream.writeUTF(entry.getKey());
                    dataOutputStream.writeUTF(entry.getValue());
                    dataOutputStream.writeByte(0);
                }
            }
            dataOutputStream.writeUTF(diVar.f());
            dataOutputStream.writeUTF(diVar.g());
            dataOutputStream.writeByte(diVar.h());
            dataOutputStream.writeUTF(diVar.i());
            if (diVar.j() == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeDouble(a(diVar.j().getLatitude()));
                dataOutputStream.writeDouble(a(diVar.j().getLongitude()));
                dataOutputStream.writeFloat(diVar.j().getAccuracy());
            }
            dataOutputStream.writeInt(diVar.k());
            dataOutputStream.writeByte(-1);
            dataOutputStream.writeByte(-1);
            dataOutputStream.writeByte(diVar.l());
            if (diVar.m() == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeLong(diVar.m().longValue());
            }
            Map<String, cx.a> n = diVar.n();
            if (n == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(n.size());
                for (Map.Entry<String, cx.a> entry2 : n.entrySet()) {
                    dataOutputStream.writeUTF(entry2.getKey());
                    dataOutputStream.writeInt(entry2.getValue().a);
                }
            }
            List<db> o = diVar.o();
            if (o == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(o.size());
                for (db dbVar : o) {
                    dataOutputStream.write(dbVar.e());
                }
            }
            dataOutputStream.writeBoolean(diVar.p());
            List<da> r = diVar.r();
            if (r != null) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 >= r.size()) {
                        i = i4;
                        break;
                    }
                    i3 += r.get(i2).a();
                    if (i3 > 160000) {
                        eo.a(5, b, "Error Log size exceeded. No more event details logged.");
                        i = i4;
                        break;
                    }
                    i4++;
                    i2++;
                }
            } else {
                i = 0;
            }
            dataOutputStream.writeInt(diVar.q());
            dataOutputStream.writeShort(i);
            for (int i5 = 0; i5 < i; i5++) {
                dataOutputStream.write(r.get(i5).b());
            }
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            this.a = byteArrayOutputStream.toByteArray();
            fe.a(dataOutputStream);
        } catch (IOException e3) {
            e = e3;
            dataOutputStream2 = dataOutputStream;
            try {
                eo.a(6, b, "", e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                fe.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fe.a(dataOutputStream);
            throw th;
        }
    }

    public byte[] a() {
        return this.a;
    }

    double a(double d) {
        return Math.round(d * 1000.0d) / 1000.0d;
    }
}
