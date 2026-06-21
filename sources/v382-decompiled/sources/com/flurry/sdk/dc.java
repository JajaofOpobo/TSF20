package com.flurry.sdk;

import android.os.Build;
import com.flurry.android.FlurryAgent;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class dc {
    private static final String a = dc.class.getSimpleName();
    private byte[] b;

    public dc(String str, String str2, boolean z, boolean z2, long j, long j2, List list, Map map, Map map2, Map map3, Map map4, long j3) {
        DataOutputStream dataOutputStream;
        byte[] bArr;
        this.b = null;
        DataOutputStream dataOutputStream2 = null;
        try {
            ed edVar = new ed();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, edVar);
            dataOutputStream = new DataOutputStream(digestOutputStream);
            try {
                dataOutputStream.writeShort(29);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeLong(0L);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(3);
                dataOutputStream.writeShort(FlurryAgent.getAgentVersion());
                dataOutputStream.writeLong(j3);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(str2);
                dataOutputStream.writeShort(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    dataOutputStream.writeShort(((dr) entry.getKey()).d);
                    byte[] array = ((ByteBuffer) entry.getValue()).array();
                    dataOutputStream.writeShort(array.length);
                    dataOutputStream.write(array);
                }
                dataOutputStream.writeByte(0);
                dataOutputStream.writeBoolean(z);
                dataOutputStream.writeBoolean(z2);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeLong(j2);
                dataOutputStream.writeShort(6);
                dataOutputStream.writeUTF("device.model");
                dataOutputStream.writeUTF(Build.MODEL);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.brand");
                dataOutputStream.writeUTF(Build.BRAND);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.id");
                dataOutputStream.writeUTF(Build.ID);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("version.release");
                dataOutputStream.writeUTF(Build.VERSION.RELEASE);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.device");
                dataOutputStream.writeUTF(Build.DEVICE);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.product");
                dataOutputStream.writeUTF(Build.PRODUCT);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeShort(map2 != null ? map2.keySet().size() : 0);
                if (map2 != null) {
                    eo.a(3, a, "sending referrer values because it exists");
                    for (Map.Entry entry2 : map2.entrySet()) {
                        eo.a(3, a, "Referrer Entry:  " + ((String) entry2.getKey()) + "=" + entry2.getValue());
                        dataOutputStream.writeUTF((String) entry2.getKey());
                        eo.a(3, a, "referrer key is :" + ((String) entry2.getKey()));
                        dataOutputStream.writeShort(((List) entry2.getValue()).size());
                        for (String str3 : (List) entry2.getValue()) {
                            dataOutputStream.writeUTF(str3);
                            eo.a(3, a, "referrer value is :" + str3);
                        }
                    }
                }
                dataOutputStream.writeBoolean(false);
                int size = map3 != null ? map3.keySet().size() : 0;
                eo.a(3, a, "optionsMapSize is:  " + size);
                dataOutputStream.writeShort(size);
                if (map3 != null) {
                    eo.a(3, a, "sending launch options");
                    for (Map.Entry entry3 : map3.entrySet()) {
                        eo.a(3, a, "Launch Options Key:  " + ((String) entry3.getKey()));
                        dataOutputStream.writeUTF((String) entry3.getKey());
                        dataOutputStream.writeShort(((List) entry3.getValue()).size());
                        for (String str4 : (List) entry3.getValue()) {
                            dataOutputStream.writeUTF(str4);
                            eo.a(3, a, "Launch Options value is :" + str4);
                        }
                    }
                }
                int size2 = map4 != null ? map4.keySet().size() : 0;
                eo.a(3, a, "numOriginAttributions is:  " + size);
                dataOutputStream.writeShort(size2);
                if (map4 != null) {
                    for (Map.Entry entry4 : map4.entrySet()) {
                        eo.a(3, a, "Origin Atttribute Key:  " + ((String) entry4.getKey()));
                        dataOutputStream.writeUTF((String) entry4.getKey());
                        dataOutputStream.writeShort(((Map) entry4.getValue()).size());
                        eo.a(3, a, "Origin Attribute Map Size for " + ((String) entry4.getKey()) + ":  " + ((Map) entry4.getValue()).size());
                        for (Map.Entry entry5 : ((Map) entry4.getValue()).entrySet()) {
                            eo.a(3, a, "Origin Atttribute for " + ((String) entry4.getKey()) + ":  " + ((String) entry5.getKey()) + ":" + ((String) entry5.getValue()));
                            dataOutputStream.writeUTF(entry5.getKey() != null ? (String) entry5.getKey() : "");
                            dataOutputStream.writeUTF(entry5.getValue() != null ? (String) entry5.getValue() : "");
                        }
                    }
                }
                int size3 = list.size();
                dataOutputStream.writeShort(size3);
                for (int i = 0; i < size3; i++) {
                    dataOutputStream.write(((dh) list.get(i)).a());
                }
                dataOutputStream.writeShort(0);
                digestOutputStream.on(false);
                dataOutputStream.write(edVar.a());
                dataOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                fe.a(dataOutputStream);
            } catch (Throwable th) {
                th = th;
                dataOutputStream2 = dataOutputStream;
                try {
                    eo.a(6, a, "Error when generating report", th);
                    fe.a(dataOutputStream2);
                    bArr = null;
                    this.b = bArr;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    fe.a(dataOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }
}
