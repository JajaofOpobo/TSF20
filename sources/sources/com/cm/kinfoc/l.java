package com.cm.kinfoc;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l {
    private h b = new h();
    private com.cm.kinfoc.a.e c = new com.cm.kinfoc.a.e();
    private static boolean d = q.a;
    static Pattern a = Pattern.compile(".*_(\\d+).ich");

    private boolean a(String str, byte[] bArr, int i) throws Throwable {
        boolean zB = false;
        if (this.b == null || bArr == null) {
            com.cm.kinfoc.a.c.a().a("batchreport-reprotData-param-error");
        } else {
            g gVar = new g();
            gVar.a(bArr);
            gVar.a("batchdata_table_" + String.valueOf(i));
            gVar.a(false);
            gVar.a(0L);
            a(" [ BATCH REPORT ]");
            a(gVar.toString());
            if (str != null && str.contains("https")) {
                zB = this.c.a(gVar, str, null);
            } else {
                zB = this.b.b(gVar, str, null);
            }
            if (zB) {
                a("    * SUCCESS");
            } else {
                a("    * FAILED!!");
            }
        }
        return zB;
    }

    public static void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public byte[] a(File file, int i) {
        byte[] bArrA;
        try {
            bArrA = e.a(file);
        } catch (IOException e) {
            e.printStackTrace();
            bArrA = null;
        }
        if (bArrA != null && bArrA.length <= Math.abs(i)) {
            return bArrA;
        }
        return null;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public int a(String str, File[] fileArr, String str2, int i, String str3, int i2) {
        if (str == null || fileArr == null || fileArr.length == 0 || str2 == null || -1 == i || str3 == null || !m.c()) {
            return -2;
        }
        byte[] bArrA = q.a(com.cm.kinfoc.a.b.A().b().getApplicationContext(), str2, i, str3);
        if (a(bArrA)) {
            return -2;
        }
        a(" * ENCODED HEADER : " + bArrA.length + " LIMIT=3072");
        ArrayList arrayList = new ArrayList();
        int length = 3072 - bArrA.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        int length2 = fileArr.length;
        int length3 = 0;
        int length4 = length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            File file = fileArr[i3];
            if (length4 <= 0) {
                a(" * REACH LIMITAIONS @BREAK");
                break;
            }
            if (file.isFile()) {
                if (a(b(file.getName()), i2)) {
                    file.delete();
                    a(" * IS EXPIRED : " + file.getName());
                } else {
                    byte[] bArrA2 = a(file, length4);
                    if (a(bArrA2)) {
                        a(" * EMPTY DATA : " + file.getName());
                    } else {
                        length4 -= bArrA2.length;
                        length3 += bArrA2.length;
                        byteBufferAllocate.put(bArrA2);
                        arrayList.add(file);
                    }
                }
            }
            i3++;
        }
        if (arrayList.isEmpty()) {
            a(" * NO ICHS NEED REPORT");
            return 0;
        }
        byteBufferAllocate.rewind();
        byte[] bArr = new byte[length3];
        byteBufferAllocate.get(bArr);
        int size = arrayList.size() + 1;
        if (a(str, a(bArrA, bArr, size, i), size)) {
            a(arrayList);
            a(" * REPORT SUCCESS : DC+H=" + size + " DC=" + arrayList.size() + " SIZE=" + (bArr.length + bArrA.length));
            a(2000L);
            return 0;
        }
        return -1;
    }

    public static void a(String str) {
        if (d) {
            Log.d("KInfoc", str);
        }
    }

    public static boolean a(List<File> list) {
        if (list == null) {
            return true;
        }
        Iterator<File> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = it.next().delete() ? i + 1 : i;
        }
        return i == list.size();
    }

    private byte[] a(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] bArrA = a(bArr, bArr2);
        return a.d(bArrA, bArrA.length, i, i2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + bArr2.length);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(bArr2);
        return byteBufferAllocate.array();
    }

    public static boolean a(long j, int i) {
        return j <= 0 || q.a(j) >= ((long) i);
    }

    public static long b(String str) {
        try {
            Matcher matcher = a.matcher(str);
            if (matcher.matches()) {
                return Long.parseLong(matcher.group(1));
            }
            return 0L;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
