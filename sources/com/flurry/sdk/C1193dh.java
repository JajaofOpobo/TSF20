package com.flurry.sdk;

import com.flurry.sdk.C1173cx;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: com.flurry.sdk.dh */
/* loaded from: classes.dex */
public class C1193dh {

    /* renamed from: b */
    private static final String f3794b = C1193dh.class.getSimpleName();

    /* renamed from: a */
    byte[] f3795a;

    public C1193dh(byte[] bArr) {
        this.f3795a = bArr;
    }

    public C1193dh(C1194di c1194di) {
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
            dataOutputStream.writeUTF(c1194di.m9511a());
            dataOutputStream.writeLong(c1194di.m9501b());
            dataOutputStream.writeLong(c1194di.m9496c());
            dataOutputStream.writeLong(c1194di.m9492d());
            Map<String, String> m9490e = c1194di.m9490e();
            if (m9490e == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(m9490e.size());
                for (Map.Entry<String, String> entry : m9490e.entrySet()) {
                    dataOutputStream.writeUTF(entry.getKey());
                    dataOutputStream.writeUTF(entry.getValue());
                    dataOutputStream.writeByte(0);
                }
            }
            dataOutputStream.writeUTF(c1194di.m9489f());
            dataOutputStream.writeUTF(c1194di.m9488g());
            dataOutputStream.writeByte(c1194di.m9487h());
            dataOutputStream.writeUTF(c1194di.m9486i());
            if (c1194di.m9485j() == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeDouble(m9512a(c1194di.m9485j().getLatitude()));
                dataOutputStream.writeDouble(m9512a(c1194di.m9485j().getLongitude()));
                dataOutputStream.writeFloat(c1194di.m9485j().getAccuracy());
            }
            dataOutputStream.writeInt(c1194di.m9484k());
            dataOutputStream.writeByte(-1);
            dataOutputStream.writeByte(-1);
            dataOutputStream.writeByte(c1194di.m9483l());
            if (c1194di.m9482m() == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeLong(c1194di.m9482m().longValue());
            }
            Map<String, C1173cx.C1174a> m9481n = c1194di.m9481n();
            if (m9481n == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(m9481n.size());
                for (Map.Entry<String, C1173cx.C1174a> entry2 : m9481n.entrySet()) {
                    dataOutputStream.writeUTF(entry2.getKey());
                    dataOutputStream.writeInt(entry2.getValue().f3734a);
                }
            }
            List<C1178db> m9480o = c1194di.m9480o();
            if (m9480o == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(m9480o.size());
                for (C1178db c1178db : m9480o) {
                    dataOutputStream.write(c1178db.m9553e());
                }
            }
            dataOutputStream.writeBoolean(c1194di.m9479p());
            List<C1177da> m9477r = c1194di.m9477r();
            if (m9477r != null) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 >= m9477r.size()) {
                        i = i4;
                        break;
                    }
                    i3 += m9477r.get(i2).m9564a();
                    if (i3 > 160000) {
                        C1258eo.m9234a(5, f3794b, "Error Log size exceeded. No more event details logged.");
                        i = i4;
                        break;
                    }
                    i4++;
                    i2++;
                }
            } else {
                i = 0;
            }
            dataOutputStream.writeInt(c1194di.m9478q());
            dataOutputStream.writeShort(i);
            for (int i5 = 0; i5 < i; i5++) {
                dataOutputStream.write(m9477r.get(i5).m9563b());
            }
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            this.f3795a = byteArrayOutputStream.toByteArray();
            C1277fe.m9152a(dataOutputStream);
        } catch (IOException e2) {
            e = e2;
            dataOutputStream2 = dataOutputStream;
            try {
                C1258eo.m9233a(6, f3794b, "", e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                C1277fe.m9152a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C1277fe.m9152a(dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public byte[] m9513a() {
        return this.f3795a;
    }

    /* renamed from: a */
    double m9512a(double d) {
        return Math.round(d * 1000.0d) / 1000.0d;
    }
}
