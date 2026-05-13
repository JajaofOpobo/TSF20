package com.p060cm.kinfoc;

import android.util.Log;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.C1131c;
import com.p060cm.kinfoc.p062a.C1136e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.cm.kinfoc.l */
/* loaded from: classes.dex */
public class C1154l {

    /* renamed from: b */
    private C1145h f3656b = new C1145h();

    /* renamed from: c */
    private C1136e f3657c = new C1136e();

    /* renamed from: d */
    private static boolean f3655d = C1171q.f3721a;

    /* renamed from: a */
    static Pattern f3654a = Pattern.compile(".*_(\\d+).ich");

    /* renamed from: a */
    private boolean m9685a(String str, byte[] bArr, int i) {
        boolean z = false;
        if (this.f3656b == null || bArr == null) {
            C1131c.m9746a().m9745a("batchreport-reprotData-param-error");
        } else {
            C1144g c1144g = new C1144g();
            c1144g.m9726a(bArr);
            c1144g.m9729a("batchdata_table_" + String.valueOf(i));
            c1144g.m9727a(false);
            c1144g.m9731a(0L);
            m9686a(" [ BATCH REPORT ]");
            m9686a(c1144g.toString());
            if (str != null && str.contains("https")) {
                z = this.f3657c.m9741a(c1144g, str, null);
            } else {
                z = this.f3656b.m9716b(c1144g, str, null);
            }
            if (z) {
                m9686a("    * SUCCESS");
            } else {
                m9686a("    * FAILED!!");
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m9689a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public byte[] m9687a(File file, int i) {
        byte[] bArr;
        try {
            bArr = C1142e.m9739a(file);
        } catch (IOException e) {
            e.printStackTrace();
            bArr = null;
        }
        if (bArr != null && bArr.length <= Math.abs(i)) {
            return bArr;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m9682a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public int m9684a(String str, File[] fileArr, String str2, int i, String str3, int i2) {
        if (str == null || fileArr == null || fileArr.length == 0 || str2 == null || -1 == i || str3 == null || !C1155m.m9667c()) {
            return -2;
        }
        byte[] m9607a = C1171q.m9607a(AbstractC1130b.m9785A().mo9773b().getApplicationContext(), str2, i, str3);
        if (m9682a(m9607a)) {
            return -2;
        }
        m9686a(" * ENCODED HEADER : " + m9607a.length + " LIMIT=3072");
        ArrayList arrayList = new ArrayList();
        int length = 3072 - m9607a.length;
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
                m9686a(" * REACH LIMITAIONS @BREAK");
                break;
            }
            if (file.isFile()) {
                if (m9688a(m9679b(file.getName()), i2)) {
                    file.delete();
                    m9686a(" * IS EXPIRED : " + file.getName());
                } else {
                    byte[] m9687a = m9687a(file, i4);
                    if (m9682a(m9687a)) {
                        m9686a(" * EMPTY DATA : " + file.getName());
                    } else {
                        i4 -= m9687a.length;
                        i3 += m9687a.length;
                        allocate.put(m9687a);
                        arrayList.add(file);
                    }
                }
            }
            i5++;
        }
        if (arrayList.isEmpty()) {
            m9686a(" * NO ICHS NEED REPORT");
            return 0;
        }
        allocate.rewind();
        byte[] bArr = new byte[i3];
        allocate.get(bArr);
        int size = arrayList.size() + 1;
        if (m9685a(str, m9680a(m9607a, bArr, size, i), size)) {
            m9683a(arrayList);
            m9686a(" * REPORT SUCCESS : DC+H=" + size + " DC=" + arrayList.size() + " SIZE=" + (bArr.length + m9607a.length));
            m9689a(2000L);
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    public static void m9686a(String str) {
        if (f3655d) {
            Log.d("KInfoc", str);
        }
    }

    /* renamed from: a */
    public static boolean m9683a(List<File> list) {
        if (list != null) {
            int i = 0;
            for (File file : list) {
                i = file.delete() ? i + 1 : i;
            }
            return i == list.size();
        }
        return true;
    }

    /* renamed from: a */
    private byte[] m9680a(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] m9681a = m9681a(bArr, bArr2);
        return C1125a.m9797d(m9681a, m9681a.length, i, i2);
    }

    /* renamed from: a */
    public static byte[] m9681a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + bArr2.length);
        allocate.put(bArr);
        allocate.put(bArr2);
        return allocate.array();
    }

    /* renamed from: a */
    public static boolean m9688a(long j, int i) {
        return j <= 0 || C1171q.m9610a(j) >= ((long) i);
    }

    /* renamed from: b */
    public static long m9679b(String str) {
        try {
            Matcher matcher = f3654a.matcher(str);
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
