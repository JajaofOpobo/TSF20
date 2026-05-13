package com.tsf.extend.base.p071b;

import android.util.Pair;
import com.android.volley.C0810t;
import com.android.volley.InterfaceC0781b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.tsf.extend.base.b.c */
/* loaded from: classes.dex */
public class C1374c implements InterfaceC0781b {

    /* renamed from: a */
    private final Map<String, C1376a> f4315a;

    /* renamed from: b */
    private long f4316b;

    /* renamed from: c */
    private final File f4317c;

    /* renamed from: d */
    private final int f4318d;

    /* renamed from: e */
    private final int f4319e;

    public C1374c(File file, int i, int i2) {
        this.f4315a = new LinkedHashMap(16, 0.75f, true);
        this.f4316b = 0L;
        this.f4317c = file;
        this.f4318d = i;
        this.f4319e = i2;
    }

    public C1374c(File file) {
        this(file, 20971520, 864000000);
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized InterfaceC0781b.C0782a mo8836a(String str) {
        C1377b c1377b;
        InterfaceC0781b.C0782a c0782a;
        C1376a c1376a = this.f4315a.get(str);
        File m8829c = m8829c(str);
        if (c1376a != null || m8829c.exists()) {
            try {
                c1377b = new C1377b(new FileInputStream(m8829c));
                try {
                    if (c1376a == null) {
                        c1376a = C1376a.m8823a(c1377b);
                    } else {
                        C1376a.m8823a(c1377b);
                    }
                    c0782a = c1376a.m8821a(m8840a(c1377b, (int) (m8829c.length() - c1377b.f4328a)));
                    if (c1377b != null) {
                        try {
                            c1377b.close();
                        } catch (IOException e) {
                            c0782a = null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    C0810t.m10990b("%s: %s", m8829c.getAbsolutePath(), th.toString());
                    m8831b(str);
                    if (c1377b != null) {
                        try {
                            c1377b.close();
                        } catch (IOException e2) {
                            c0782a = null;
                        }
                    }
                    c0782a = null;
                    return c0782a;
                }
            } catch (Throwable th2) {
                th = th2;
                c1377b = null;
            }
        } else {
            c0782a = null;
        }
        return c0782a;
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized void mo8842a() {
        BufferedInputStream bufferedInputStream;
        if (this.f4317c.exists()) {
            File[] listFiles = this.f4317c.listFiles();
            if (listFiles != null) {
                Pair[] pairArr = new Pair[listFiles.length];
                for (int i = 0; i < listFiles.length; i++) {
                    File file = listFiles[i];
                    pairArr[i] = new Pair(Long.valueOf(file.lastModified()), file);
                }
                try {
                    Arrays.sort(pairArr, new Comparator<Pair<Long, File>>() { // from class: com.tsf.extend.base.b.c.1
                        @Override // java.util.Comparator
                        /* renamed from: a */
                        public int compare(Pair<Long, File> pair, Pair<Long, File> pair2) {
                            if (((Long) pair.first).longValue() > ((Long) pair2.first).longValue()) {
                                return -1;
                            }
                            return pair.first == pair2.first ? 0 : 1;
                        }
                    });
                } catch (Exception e) {
                }
                long j = 0;
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = 0;
                while (i2 < pairArr.length) {
                    File file2 = (File) pairArr[i2].second;
                    if (currentTimeMillis - file2.lastModified() > this.f4319e || ((float) j) > this.f4318d * 0.9f) {
                        file2.delete();
                    } else {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                C1376a m8823a = C1376a.m8823a(bufferedInputStream);
                                m8823a.f4321a = file2.length();
                                j += m8823a.f4321a;
                                m8834a(m8823a.f4322b, m8823a);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e2) {
                                    }
                                }
                            } catch (Throwable th) {
                                file2.delete();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e3) {
                                    }
                                }
                                i2++;
                                j = j;
                            }
                        } catch (Throwable th2) {
                            bufferedInputStream = null;
                        }
                    }
                    i2++;
                    j = j;
                }
            }
        } else if (!this.f4317c.mkdirs()) {
            C0810t.m10989c("Unable to create cache dir %s", this.f4317c.getAbsolutePath());
        }
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized void mo8835a(String str, InterfaceC0781b.C0782a c0782a) {
        BufferedOutputStream bufferedOutputStream;
        C1376a c1376a;
        File m8829c = m8829c(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m8829c));
            try {
                c1376a = new C1376a(str, c0782a);
            } catch (IOException e) {
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e2) {
                    }
                }
                if (!m8829c.delete()) {
                    C0810t.m10990b("Could not clean up file %s", m8829c.getAbsolutePath());
                }
            } catch (Throwable th) {
                bufferedOutputStream2 = bufferedOutputStream;
                th = th;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (!c1376a.m8822a(bufferedOutputStream)) {
            C0810t.m10990b("Failed to write header for %s", m8829c.getAbsolutePath());
            throw new IOException();
        }
        bufferedOutputStream.write(c0782a.f2250a);
        m8834a(str, c1376a);
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException e5) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void m8831b(String str) {
        boolean delete = m8829c(str).delete();
        m8825e(str);
        if (!delete) {
            C0810t.m10990b("Could not delete cache entry for key=%s, filename=%s", str, m8827d(str));
        }
    }

    /* renamed from: d */
    private String m8827d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: c */
    public File m8829c(String str) {
        return new File(this.f4317c, m8827d(str));
    }

    /* renamed from: a */
    private void m8834a(String str, C1376a c1376a) {
        if (!this.f4315a.containsKey(str)) {
            this.f4316b += c1376a.f4321a;
        } else {
            this.f4316b = (c1376a.f4321a - this.f4315a.get(str).f4321a) + this.f4316b;
        }
        this.f4315a.put(str, c1376a);
    }

    /* renamed from: e */
    private void m8825e(String str) {
        C1376a c1376a = this.f4315a.get(str);
        if (c1376a != null) {
            this.f4316b -= c1376a.f4321a;
            this.f4315a.remove(str);
        }
    }

    /* renamed from: a */
    private static byte[] m8840a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 != i) {
            throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.b.c$a */
    /* loaded from: classes.dex */
    public static class C1376a {

        /* renamed from: a */
        public long f4321a;

        /* renamed from: b */
        public String f4322b;

        /* renamed from: c */
        public String f4323c;

        /* renamed from: d */
        public long f4324d;

        /* renamed from: e */
        public long f4325e;

        /* renamed from: f */
        public long f4326f;

        /* renamed from: g */
        public Map<String, String> f4327g;

        private C1376a() {
        }

        public C1376a(String str, InterfaceC0781b.C0782a c0782a) {
            this.f4322b = str;
            this.f4321a = c0782a.f2250a.length;
            this.f4323c = c0782a.f2251b;
            this.f4324d = c0782a.f2252c;
            this.f4325e = c0782a.f2254e;
            this.f4326f = c0782a.f2255f;
            this.f4327g = c0782a.f2256g;
        }

        /* renamed from: a */
        public static C1376a m8823a(InputStream inputStream) {
            C1376a c1376a = new C1376a();
            if (C1374c.m8841a(inputStream) != 538183203) {
                throw new IOException();
            }
            c1376a.f4322b = C1374c.m8830c(inputStream);
            c1376a.f4323c = C1374c.m8830c(inputStream);
            if (c1376a.f4323c.equals("")) {
                c1376a.f4323c = null;
            }
            c1376a.f4324d = C1374c.m8832b(inputStream);
            c1376a.f4325e = C1374c.m8832b(inputStream);
            c1376a.f4326f = C1374c.m8832b(inputStream);
            c1376a.f4327g = C1374c.m8828d(inputStream);
            return c1376a;
        }

        /* renamed from: a */
        public InterfaceC0781b.C0782a m8821a(byte[] bArr) {
            InterfaceC0781b.C0782a c0782a = new InterfaceC0781b.C0782a();
            c0782a.f2250a = bArr;
            c0782a.f2251b = this.f4323c;
            c0782a.f2252c = this.f4324d;
            c0782a.f2254e = this.f4325e;
            c0782a.f2255f = this.f4326f;
            c0782a.f2256g = this.f4327g;
            return c0782a;
        }

        /* renamed from: a */
        public boolean m8822a(OutputStream outputStream) {
            try {
                C1374c.m8839a(outputStream, 538183203);
                C1374c.m8837a(outputStream, this.f4322b);
                C1374c.m8837a(outputStream, this.f4323c == null ? "" : this.f4323c);
                C1374c.m8838a(outputStream, this.f4324d);
                C1374c.m8838a(outputStream, this.f4325e);
                C1374c.m8838a(outputStream, this.f4326f);
                C1374c.m8833a(this.f4327g, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0810t.m10990b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.tsf.extend.base.b.c$b */
    /* loaded from: classes.dex */
    private static class C1377b extends FilterInputStream {

        /* renamed from: a */
        private int f4328a;

        private C1377b(InputStream inputStream) {
            super(inputStream);
            this.f4328a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f4328a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f4328a += read;
            }
            return read;
        }
    }

    /* renamed from: e */
    private static int m8826e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    /* renamed from: a */
    static void m8839a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static int m8841a(InputStream inputStream) {
        return 0 | (m8826e(inputStream) << 0) | (m8826e(inputStream) << 8) | (m8826e(inputStream) << 16) | (m8826e(inputStream) << 24);
    }

    /* renamed from: a */
    static void m8838a(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: b */
    static long m8832b(InputStream inputStream) {
        return 0 | ((m8826e(inputStream) & 255) << 0) | ((m8826e(inputStream) & 255) << 8) | ((m8826e(inputStream) & 255) << 16) | ((m8826e(inputStream) & 255) << 24) | ((m8826e(inputStream) & 255) << 32) | ((m8826e(inputStream) & 255) << 40) | ((m8826e(inputStream) & 255) << 48) | ((m8826e(inputStream) & 255) << 56);
    }

    /* renamed from: a */
    static void m8837a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m8838a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: c */
    static String m8830c(InputStream inputStream) {
        return new String(m8840a(inputStream, (int) m8832b(inputStream)), "UTF-8");
    }

    /* renamed from: a */
    static void m8833a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            m8839a(outputStream, map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m8837a(outputStream, entry.getKey());
                m8837a(outputStream, entry.getValue());
            }
            return;
        }
        m8839a(outputStream, 0);
    }

    /* renamed from: d */
    static Map<String, String> m8828d(InputStream inputStream) {
        int m8841a = m8841a(inputStream);
        Map<String, String> emptyMap = m8841a == 0 ? Collections.emptyMap() : new HashMap<>(m8841a);
        for (int i = 0; i < m8841a; i++) {
            emptyMap.put(m8830c(inputStream).intern(), m8830c(inputStream).intern());
        }
        return emptyMap;
    }
}
