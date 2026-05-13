package com.cm.kinfoc;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class l {
    private h b = new h();
    private com.cm.kinfoc.a.e c = new com.cm.kinfoc.a.e();
    private static boolean d = q.a;
    static Pattern a = Pattern.compile(".*_(\\d+).ich");

    private boolean a(String str, byte[] bArr, int i) {
        boolean z = false;
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
                z = this.c.a(gVar, str, null);
            } else {
                z = this.b.b(gVar, str, null);
            }
            if (z) {
                a("    * SUCCESS");
            } else {
                a("    * FAILED!!");
            }
        }
        return z;
    }

    public static void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public byte[] a(File file, int i) {
        byte[] bArr;
        try {
            bArr = e.a(file);
        } catch (IOException e) {
            e.printStackTrace();
            bArr = null;
        }
        if (bArr != null && bArr.length <= Math.abs(i)) {
            return bArr;
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
        byte[] a2 = q.a(com.cm.kinfoc.a.b.A().b().getApplicationContext(), str2, i, str3);
        if (a(a2)) {
            return -2;
        }
        a(" * ENCODED HEADER : " + a2.length + " LIMIT=3072");
        ArrayList arrayList = new ArrayList();
        int length = 3072 - a2.length;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int length2 = fileArr.length;
        int i3 = 0;
        int i4 = length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            File file = fileArr[i5];
            if (i4 <= 0) {
                a(" * REACH LIMITAIONS @BREAK");
                break;
            }
            if (file.isFile()) {
                if (a(b(file.getName()), i2)) {
                    file.delete();
                    a(" * IS EXPIRED : " + file.getName());
                } else {
                    byte[] a3 = a(file, i4);
                    if (a(a3)) {
                        a(" * EMPTY DATA : " + file.getName());
                    } else {
                        i4 -= a3.length;
                        i3 += a3.length;
                        allocate.put(a3);
                        arrayList.add(file);
                    }
                }
            }
            i5++;
        }
        if (arrayList.isEmpty()) {
            a(" * NO ICHS NEED REPORT");
            return 0;
        }
        allocate.rewind();
        byte[] bArr = new byte[i3];
        allocate.get(bArr);
        int size = arrayList.size() + 1;
        if (a(str, a(a2, bArr, size, i), size)) {
            a(arrayList);
            a(" * REPORT SUCCESS : DC+H=" + size + " DC=" + arrayList.size() + " SIZE=" + (bArr.length + a2.length));
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
        if (list != null) {
            int i = 0;
            for (File file : list) {
                i = file.delete() ? i + 1 : i;
            }
            return i == list.size();
        }
        return true;
    }

    private byte[] a(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] a2 = a(bArr, bArr2);
        return a.d(a2, a2.length, i, i2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + bArr2.length);
        allocate.put(bArr);
        allocate.put(bArr2);
        return allocate.array();
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
