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
/* loaded from: classes.dex */
public class dg {
    String b;
    LinkedHashMap<String, List<String>> c;
    private static final String d = dg.class.getSimpleName();
    static final Integer a = 50;

    public dg(String str) {
        a(str);
    }

    void a(String str) {
        this.c = new LinkedHashMap<>();
        this.b = str + "Main";
        List<String> e = e(this.b);
        if (e != null) {
            for (String str2 : e) {
                List<String> e2 = e(str2);
                if (e2 != null) {
                    this.c.put(str2, e2);
                }
            }
        }
    }

    private synchronized void c() {
        LinkedList linkedList = new LinkedList(this.c.keySet());
        b();
        if (!linkedList.isEmpty()) {
            a(this.b, linkedList);
        }
    }

    public synchronized void a(df dfVar, String str) {
        LinkedList linkedList;
        boolean z = false;
        synchronized (this) {
            eo.a(4, d, "addBlockInfo");
            String a2 = dfVar.a();
            List<String> list = this.c.get(str);
            if (list == null) {
                eo.a(4, d, "New Data Key");
                linkedList = new LinkedList();
                z = true;
            } else {
                linkedList = list;
            }
            linkedList.add(a2);
            if (linkedList.size() > a.intValue()) {
                b(linkedList.get(0));
                linkedList.remove(0);
            }
            this.c.put(str, linkedList);
            a(str, linkedList);
            if (z) {
                c();
            }
        }
    }

    boolean b(String str) {
        return new df(str).c();
    }

    public boolean a(String str, String str2) {
        List<String> list = this.c.get(str2);
        boolean z = false;
        if (list != null) {
            b(str);
            z = list.remove(str);
        }
        if (list != null && !list.isEmpty()) {
            this.c.put(str2, list);
            a(str2, list);
        } else {
            d(str2);
        }
        return z;
    }

    public List<String> a() {
        return new ArrayList(this.c.keySet());
    }

    public List<String> c(String str) {
        return this.c.get(str);
    }

    public synchronized boolean d(String str) {
        boolean a2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eo.a(6, d, "discardOutdatedBlocksForDataKey(ID) running on the MAIN thread!");
        }
        File fileStreamPath = Cdo.a().b().getFileStreamPath(".FlurrySenderIndex.info." + str);
        List<String> c = c(str);
        if (c != null) {
            eo.a(4, d, "discardOutdatedBlocksForDataKey: notSentBlocks = " + c.size());
            for (int i = 0; i < c.size(); i++) {
                String str2 = c.get(i);
                b(str2);
                eo.a(4, d, "discardOutdatedBlocksForDataKey: removed block = " + str2);
            }
        }
        this.c.remove(str);
        a2 = a(fileStreamPath);
        c();
        return a2;
    }

    private synchronized boolean a(File file) {
        boolean z;
        z = false;
        if (file != null) {
            if (file.exists()) {
                eo.a(4, d, "Trying to delete persistence file : " + file.getAbsolutePath());
                z = file.delete();
                if (z) {
                    eo.a(4, d, "Deleted persistence file");
                } else {
                    eo.a(6, d, "Cannot delete persistence file");
                }
            }
        }
        return z;
    }

    void b() {
        a(Cdo.a().b().getFileStreamPath(".FlurrySenderIndex.info." + this.b));
    }

    private synchronized List<String> e(String str) {
        DataInputStream dataInputStream;
        ArrayList arrayList;
        Throwable th;
        int readUnsignedShort;
        ArrayList arrayList2 = null;
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                eo.a(6, d, "readFromFile(byte[], ID) running on the MAIN thread!");
            }
            File fileStreamPath = Cdo.a().b().getFileStreamPath(".FlurrySenderIndex.info." + str);
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
                    fe.a(dataInputStream);
                } else {
                    arrayList = new ArrayList(readUnsignedShort);
                    for (int i = 0; i < readUnsignedShort; i++) {
                        try {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                            eo.a(4, d, "read iter " + i + " dataLength = " + readUnsignedShort2);
                            byte[] bArr = new byte[readUnsignedShort2];
                            dataInputStream.readFully(bArr);
                            arrayList.add(new String(bArr));
                        } catch (Throwable th4) {
                            th = th4;
                            eo.a(6, d, "Error when loading persistent file", th);
                            fe.a(dataInputStream);
                            arrayList2 = arrayList;
                            return arrayList2;
                        }
                    }
                    if (dataInputStream.readUnsignedShort() == 0) {
                    }
                    fe.a(dataInputStream);
                }
            } else {
                eo.a(5, d, "Agent cache file doesn't exist.");
                arrayList = null;
            }
            arrayList2 = arrayList;
        }
        return arrayList2;
    }

    private synchronized boolean a(String str, List<String> list) {
        DataOutputStream dataOutputStream;
        boolean z;
        boolean z2 = false;
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                eo.a(6, d, "saveToFile(byte[], ID) running on the MAIN thread!");
            }
            File fileStreamPath = Cdo.a().b().getFileStreamPath(".FlurrySenderIndex.info." + str);
            try {
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
            if (fd.a(fileStreamPath)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(fileStreamPath));
                try {
                    dataOutputStream.writeShort(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        byte[] bytes = list.get(i).getBytes();
                        int length = bytes.length;
                        eo.a(4, d, "write iter " + i + " dataLength = " + length);
                        dataOutputStream.writeShort(length);
                        dataOutputStream.write(bytes);
                    }
                    dataOutputStream.writeShort(0);
                    z = true;
                    fe.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    eo.a(6, d, "", th);
                    fe.a(dataOutputStream);
                    z = false;
                    z2 = z;
                    return z2;
                }
                z2 = z;
            } else {
                fe.a((Closeable) null);
            }
        }
        return z2;
    }
}
