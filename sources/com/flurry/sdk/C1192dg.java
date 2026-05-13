package com.flurry.sdk;

import android.os.Looper;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.flurry.sdk.dg */
/* loaded from: classes.dex */
public class C1192dg {

    /* renamed from: b */
    String f3792b;

    /* renamed from: c */
    LinkedHashMap<String, List<String>> f3793c;

    /* renamed from: d */
    private static final String f3791d = C1192dg.class.getSimpleName();

    /* renamed from: a */
    static final Integer f3790a = 50;

    public C1192dg(String str) {
        m9522a(str);
    }

    /* renamed from: a */
    void m9522a(String str) {
        this.f3793c = new LinkedHashMap<>();
        this.f3792b = str + "Main";
        List<String> m9514e = m9514e(this.f3792b);
        if (m9514e != null) {
            for (String str2 : m9514e) {
                List<String> m9514e2 = m9514e(str2);
                if (m9514e2 != null) {
                    this.f3793c.put(str2, m9514e2);
                }
            }
        }
    }

    /* renamed from: c */
    private synchronized void m9517c() {
        LinkedList linkedList = new LinkedList(this.f3793c.keySet());
        m9519b();
        if (!linkedList.isEmpty()) {
            m9520a(this.f3792b, linkedList);
        }
    }

    /* renamed from: a */
    public synchronized void m9524a(C1191df c1191df, String str) {
        LinkedList linkedList;
        boolean z = false;
        synchronized (this) {
            C1258eo.m9234a(4, f3791d, "addBlockInfo");
            String m9529a = c1191df.m9529a();
            List<String> list = this.f3793c.get(str);
            if (list == null) {
                C1258eo.m9234a(4, f3791d, "New Data Key");
                linkedList = new LinkedList();
                z = true;
            } else {
                linkedList = list;
            }
            linkedList.add(m9529a);
            if (linkedList.size() > f3790a.intValue()) {
                m9518b(linkedList.get(0));
                linkedList.remove(0);
            }
            this.f3793c.put(str, linkedList);
            m9520a(str, linkedList);
            if (z) {
                m9517c();
            }
        }
    }

    /* renamed from: b */
    boolean m9518b(String str) {
        return new C1191df(str).m9526c();
    }

    /* renamed from: a */
    public boolean m9521a(String str, String str2) {
        List<String> list = this.f3793c.get(str2);
        boolean z = false;
        if (list != null) {
            m9518b(str);
            z = list.remove(str);
        }
        if (list != null && !list.isEmpty()) {
            this.f3793c.put(str2, list);
            m9520a(str2, list);
        } else {
            m9515d(str2);
        }
        return z;
    }

    /* renamed from: a */
    public List<String> m9525a() {
        return new ArrayList(this.f3793c.keySet());
    }

    /* renamed from: c */
    public List<String> m9516c(String str) {
        return this.f3793c.get(str);
    }

    /* renamed from: d */
    public synchronized boolean m9515d(String str) {
        boolean m9523a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C1258eo.m9234a(6, f3791d, "discardOutdatedBlocksForDataKey(ID) running on the MAIN thread!");
        }
        File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(".FlurrySenderIndex.info." + str);
        List<String> m9516c = m9516c(str);
        if (m9516c != null) {
            C1258eo.m9234a(4, f3791d, "discardOutdatedBlocksForDataKey: notSentBlocks = " + m9516c.size());
            for (int i = 0; i < m9516c.size(); i++) {
                String str2 = m9516c.get(i);
                m9518b(str2);
                C1258eo.m9234a(4, f3791d, "discardOutdatedBlocksForDataKey: removed block = " + str2);
            }
        }
        this.f3793c.remove(str);
        m9523a = m9523a(fileStreamPath);
        m9517c();
        return m9523a;
    }

    /* renamed from: a */
    private synchronized boolean m9523a(File file) {
        boolean z;
        z = false;
        if (file != null) {
            if (file.exists()) {
                C1258eo.m9234a(4, f3791d, "Trying to delete persistence file : " + file.getAbsolutePath());
                z = file.delete();
                if (z) {
                    C1258eo.m9234a(4, f3791d, "Deleted persistence file");
                } else {
                    C1258eo.m9234a(6, f3791d, "Cannot delete persistence file");
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    void m9519b() {
        m9523a(C1211do.m9390a().m9386b().getFileStreamPath(".FlurrySenderIndex.info." + this.f3792b));
    }

    /* renamed from: e */
    private synchronized List<String> m9514e(String str) {
        DataInputStream dataInputStream;
        ArrayList arrayList;
        Throwable th;
        int readUnsignedShort;
        ArrayList arrayList2 = null;
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C1258eo.m9234a(6, f3791d, "readFromFile(byte[], ID) running on the MAIN thread!");
            }
            File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(".FlurrySenderIndex.info." + str);
            if (fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        readUnsignedShort = dataInputStream.readUnsignedShort();
                    } catch (Throwable th2) {
                        arrayList = null;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    dataInputStream = null;
                    arrayList = null;
                    th = th3;
                }
                if (readUnsignedShort == 0) {
                    C1277fe.m9152a(dataInputStream);
                } else {
                    arrayList = new ArrayList(readUnsignedShort);
                    for (int i = 0; i < readUnsignedShort; i++) {
                        try {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                            C1258eo.m9234a(4, f3791d, "read iter " + i + " dataLength = " + readUnsignedShort2);
                            byte[] bArr = new byte[readUnsignedShort2];
                            dataInputStream.readFully(bArr);
                            arrayList.add(new String(bArr));
                        } catch (Throwable th4) {
                            th = th4;
                            C1258eo.m9233a(6, f3791d, "Error when loading persistent file", th);
                            C1277fe.m9152a(dataInputStream);
                            arrayList2 = arrayList;
                            return arrayList2;
                        }
                    }
                    if (dataInputStream.readUnsignedShort() == 0) {
                    }
                    C1277fe.m9152a(dataInputStream);
                }
            } else {
                C1258eo.m9234a(5, f3791d, "Agent cache file doesn't exist.");
                arrayList = null;
            }
            arrayList2 = arrayList;
        }
        return arrayList2;
    }

    /* renamed from: a */
    private synchronized boolean m9520a(String str, List<String> list) {
        DataOutputStream dataOutputStream;
        boolean z;
        boolean z2 = false;
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C1258eo.m9234a(6, f3791d, "saveToFile(byte[], ID) running on the MAIN thread!");
            }
            File fileStreamPath = C1211do.m9390a().m9386b().getFileStreamPath(".FlurrySenderIndex.info." + str);
            try {
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
            if (C1276fd.m9160a(fileStreamPath)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(fileStreamPath));
                try {
                    dataOutputStream.writeShort(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        byte[] bytes = list.get(i).getBytes();
                        int length = bytes.length;
                        C1258eo.m9234a(4, f3791d, "write iter " + i + " dataLength = " + length);
                        dataOutputStream.writeShort(length);
                        dataOutputStream.write(bytes);
                    }
                    dataOutputStream.writeShort(0);
                    z = true;
                    C1277fe.m9152a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    C1258eo.m9233a(6, f3791d, "", th);
                    C1277fe.m9152a(dataOutputStream);
                    z = false;
                    z2 = z;
                    return z2;
                }
                z2 = z;
            } else {
                C1277fe.m9152a((Closeable) null);
            }
        }
        return z2;
    }
}
