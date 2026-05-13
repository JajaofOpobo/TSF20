package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: com.flurry.sdk.db */
/* loaded from: classes.dex */
public final class C1178db {

    /* renamed from: a */
    private int f3747a;

    /* renamed from: b */
    private String f3748b;

    /* renamed from: c */
    private Map<String, String> f3749c;

    /* renamed from: d */
    private long f3750d;

    /* renamed from: e */
    private boolean f3751e;

    /* renamed from: f */
    private boolean f3752f;

    /* renamed from: g */
    private long f3753g;

    public C1178db(int i, String str, Map<String, String> map, long j, boolean z) {
        this.f3747a = i;
        this.f3748b = str;
        this.f3749c = map;
        this.f3750d = j;
        this.f3751e = z;
        if (this.f3751e) {
            this.f3752f = false;
        } else {
            this.f3752f = true;
        }
    }

    /* renamed from: a */
    public boolean m9561a() {
        return this.f3751e;
    }

    /* renamed from: b */
    public boolean m9557b() {
        return this.f3752f;
    }

    /* renamed from: a */
    public boolean m9559a(String str) {
        return this.f3751e && this.f3753g == 0 && this.f3748b.equals(str);
    }

    /* renamed from: a */
    public void m9560a(long j) {
        this.f3752f = true;
        this.f3753g = j - this.f3750d;
        C1258eo.m9234a(3, "FlurryAgent", "Ended event '" + this.f3748b + "' (" + this.f3750d + ") after " + this.f3753g + "ms");
    }

    /* renamed from: a */
    public void m9558a(Map<String, String> map) {
        if (this.f3749c == null || this.f3749c.size() == 0) {
            this.f3749c = map;
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (this.f3749c.containsKey(entry.getKey())) {
                this.f3749c.remove(entry.getKey());
                this.f3749c.put(entry.getKey(), entry.getValue());
            } else {
                this.f3749c.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: c */
    public Map<String, String> m9555c() {
        return this.f3749c;
    }

    /* renamed from: b */
    public void m9556b(Map<String, String> map) {
        this.f3749c = map;
    }

    /* renamed from: d */
    public int m9554d() {
        return m9553e().length;
    }

    /* renamed from: e */
    public byte[] m9553e() {
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
            dataOutputStream.writeShort(this.f3747a);
            dataOutputStream.writeUTF(this.f3748b);
            if (this.f3749c == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(this.f3749c.size());
                for (Map.Entry<String, String> entry : this.f3749c.entrySet()) {
                    dataOutputStream.writeUTF(C1277fe.m9150a(entry.getKey()));
                    dataOutputStream.writeUTF(C1277fe.m9150a(entry.getValue()));
                }
            }
            dataOutputStream.writeLong(this.f3750d);
            dataOutputStream.writeLong(this.f3753g);
            dataOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
            C1277fe.m9152a(dataOutputStream);
        } catch (IOException e2) {
            dataOutputStream2 = dataOutputStream;
            try {
                bArr = new byte[0];
                C1277fe.m9152a(dataOutputStream2);
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = dataOutputStream2;
                C1277fe.m9152a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            C1277fe.m9152a(dataOutputStream);
            throw th;
        }
        return bArr;
    }
}
