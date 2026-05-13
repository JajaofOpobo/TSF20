package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.flurry.sdk.dk */
/* loaded from: classes.dex */
public class C1205dk {

    /* renamed from: a */
    private static final String f3870a = C1205dk.class.getSimpleName();

    /* renamed from: b */
    private boolean f3871b;

    /* renamed from: c */
    private List<C1193dh> f3872c;

    /* renamed from: d */
    private long f3873d = -1;

    /* renamed from: a */
    public void m9417a(boolean z) {
        this.f3871b = z;
    }

    /* renamed from: a */
    public boolean m9424a() {
        return this.f3871b;
    }

    /* renamed from: a */
    public void m9418a(List<C1193dh> list) {
        this.f3872c = list;
    }

    /* renamed from: b */
    public List<C1193dh> m9416b() {
        return this.f3872c;
    }

    /* renamed from: a */
    public void m9423a(long j) {
        this.f3873d = j;
    }

    /* renamed from: c */
    public long m9415c() {
        return this.f3873d;
    }

    /* renamed from: a */
    public void m9421a(DataOutputStream dataOutputStream, String str, String str2) {
        try {
            dataOutputStream.writeShort(46586);
            dataOutputStream.writeShort(2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeBoolean(this.f3871b);
            dataOutputStream.writeLong(this.f3873d);
            int size = this.f3872c.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                byte[] m9513a = this.f3872c.get(size).m9513a();
                int length = m9513a.length;
                if (length + 2 + dataOutputStream.size() > 50000) {
                    C1258eo.m9234a(6, f3870a, "discarded sessions: " + size);
                    break;
                }
                dataOutputStream.writeShort(length);
                dataOutputStream.write(m9513a);
                size--;
            }
            dataOutputStream.writeShort(0);
        } finally {
        }
    }

    /* renamed from: a */
    public boolean m9422a(DataInputStream dataInputStream, String str) {
        boolean z = false;
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            C1258eo.m9234a(4, f3870a, "Magic: " + readUnsignedShort);
            if (readUnsignedShort == 46586) {
                z = m9419a(str, dataInputStream);
            } else {
                C1258eo.m9234a(3, f3870a, "Unexpected file type");
            }
            return z;
        } catch (Throwable th) {
            try {
                C1258eo.m9233a(6, f3870a, "Error when loading persistent file", th);
                throw new IOException(th.getMessage());
            } finally {
                C1277fe.m9152a(dataInputStream);
            }
        }
    }

    /* renamed from: a */
    private boolean m9419a(String str, DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        C1258eo.m9234a(3, f3870a, "File version: " + readUnsignedShort);
        if (readUnsignedShort > 2) {
            C1258eo.m9234a(6, f3870a, "Unknown agent file version: " + readUnsignedShort);
            throw new IOException("Unknown agent file version: " + readUnsignedShort);
        } else if (readUnsignedShort >= 2) {
            String readUTF = dataInputStream.readUTF();
            C1258eo.m9234a(3, f3870a, "Loading API key: " + m9420a(str));
            if (readUTF.equals(str)) {
                ArrayList arrayList = new ArrayList();
                dataInputStream.readUTF();
                boolean readBoolean = dataInputStream.readBoolean();
                long readLong = dataInputStream.readLong();
                C1258eo.m9234a(3, f3870a, "Loading session reports");
                int i = 0;
                while (true) {
                    int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                    if (readUnsignedShort2 != 0) {
                        byte[] bArr = new byte[readUnsignedShort2];
                        dataInputStream.readFully(bArr);
                        arrayList.add(0, new C1193dh(bArr));
                        i++;
                        C1258eo.m9234a(3, f3870a, "Session report added: " + i);
                    } else {
                        C1258eo.m9234a(3, f3870a, "Persistent file loaded");
                        m9417a(readBoolean);
                        m9423a(readLong);
                        m9418a(arrayList);
                        return true;
                    }
                }
            } else {
                C1258eo.m9234a(3, f3870a, "Api keys do not match, old: " + m9420a(str) + ", new: " + m9420a(readUTF));
                return false;
            }
        } else {
            C1258eo.m9234a(5, f3870a, "Deleting old file version: " + readUnsignedShort);
            return false;
        }
    }

    /* renamed from: a */
    private static String m9420a(String str) {
        if (str != null && str.length() > 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 4; i++) {
                sb.append('*');
            }
            sb.append(str.substring(str.length() - 4));
            return sb.toString();
        }
        return str;
    }
}
