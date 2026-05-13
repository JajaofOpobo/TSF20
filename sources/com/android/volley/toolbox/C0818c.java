package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.C0810t;
import com.android.volley.InterfaceC0781b;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.android.volley.toolbox.c */
/* loaded from: classes.dex */
public class C0818c implements InterfaceC0781b {

    /* renamed from: a */
    private final Map<String, C0820a> f2353a;

    /* renamed from: b */
    private long f2354b;

    /* renamed from: c */
    private final File f2355c;

    /* renamed from: d */
    private final int f2356d;

    public C0818c(File file, int i) {
        this.f2353a = new LinkedHashMap(16, 0.75f, true);
        this.f2354b = 0L;
        this.f2355c = file;
        this.f2356d = i;
    }

    public C0818c(File file) {
        this(file, 5242880);
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized InterfaceC0781b.C0782a mo8836a(String str) {
        C0821b c0821b;
        InterfaceC0781b.C0782a c0782a;
        File m10959c;
        C0820a c0820a = this.f2353a.get(str);
        if (c0820a == null) {
            c0782a = null;
        } else {
            try {
                m10959c = m10959c(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                c0821b = new C0821b(new FileInputStream(m10959c));
                try {
                    C0820a.m10954a(c0821b);
                    c0782a = c0820a.m10952a(m10968a(c0821b, (int) (m10959c.length() - c0821b.f2365a)));
                    if (c0821b != null) {
                        try {
                            c0821b.close();
                        } catch (IOException e) {
                            c0782a = null;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    C0810t.m10990b("%s: %s", m10959c.getAbsolutePath(), e.toString());
                    m10961b(str);
                    if (c0821b != null) {
                        try {
                            c0821b.close();
                        } catch (IOException e3) {
                            c0782a = null;
                        }
                    }
                    c0782a = null;
                    return c0782a;
                } catch (NegativeArraySizeException e4) {
                    m10961b(str);
                    if (c0821b != null) {
                        try {
                            c0821b.close();
                        } catch (IOException e5) {
                            c0782a = null;
                        }
                    }
                    c0782a = null;
                    return c0782a;
                }
            } catch (IOException e6) {
                e = e6;
                c0821b = null;
            } catch (NegativeArraySizeException e7) {
                c0821b = null;
            } catch (Throwable th2) {
                th = th2;
                c0821b = null;
                if (c0821b != null) {
                    try {
                        c0821b.close();
                    } catch (IOException e8) {
                        c0782a = null;
                    }
                }
                throw th;
            }
        }
        return c0782a;
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized void mo8842a() {
        BufferedInputStream bufferedInputStream;
        if (this.f2355c.exists()) {
            File[] listFiles = this.f2355c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
                                try {
                                    C0820a m10954a = C0820a.m10954a(bufferedInputStream);
                                    m10954a.f2357a = file.length();
                                    m10964a(m10954a.f2358b, m10954a);
                                    if (bufferedInputStream != null) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th;
                                    if (bufferedInputStream2 != null) {
                                        try {
                                            bufferedInputStream2.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                if (file != null) {
                                    file.delete();
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e4) {
                                    }
                                }
                            } catch (NegativeArraySizeException e5) {
                                bufferedInputStream2 = bufferedInputStream;
                                e = e5;
                                if (file != null) {
                                    try {
                                        file.delete();
                                    } catch (Exception e6) {
                                        e.printStackTrace();
                                    }
                                }
                                if (bufferedInputStream2 != null) {
                                    try {
                                        bufferedInputStream2.close();
                                    } catch (IOException e7) {
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e8) {
                        bufferedInputStream = null;
                    } catch (NegativeArraySizeException e9) {
                        e = e9;
                    }
                }
            }
        } else if (!this.f2355c.mkdirs()) {
            C0810t.m10989c("Unable to create cache dir %s", this.f2355c.getAbsolutePath());
        }
    }

    @Override // com.android.volley.InterfaceC0781b
    /* renamed from: a */
    public synchronized void mo8835a(String str, InterfaceC0781b.C0782a c0782a) {
        FileOutputStream fileOutputStream;
        C0820a c0820a;
        m10970a(c0782a.f2250a.length);
        File m10959c = m10959c(str);
        if (!this.f2355c.exists()) {
            this.f2355c.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(m10959c);
            c0820a = new C0820a(str, c0782a);
        } catch (IOException e) {
            if (!m10959c.delete()) {
                C0810t.m10990b("Could not clean up file %s", m10959c.getAbsolutePath());
            }
        }
        if (!c0820a.m10953a(fileOutputStream)) {
            fileOutputStream.close();
            C0810t.m10990b("Failed to write header for %s", m10959c.getAbsolutePath());
            throw new IOException();
        }
        fileOutputStream.write(c0782a.f2250a);
        fileOutputStream.close();
        m10964a(str, c0820a);
    }

    /* renamed from: b */
    public synchronized void m10961b(String str) {
        boolean delete = m10959c(str).delete();
        m10955e(str);
        if (!delete) {
            C0810t.m10990b("Could not delete cache entry for key=%s, filename=%s", str, m10957d(str));
        }
    }

    /* renamed from: d */
    private String m10957d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: c */
    public File m10959c(String str) {
        return new File(this.f2355c, m10957d(str));
    }

    /* renamed from: a */
    private void m10970a(int i) {
        int i2;
        if (this.f2354b + i >= this.f2356d) {
            if (C0810t.f2327b) {
                C0810t.m10992a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f2354b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C0820a>> it = this.f2353a.entrySet().iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i3;
                    break;
                }
                C0820a value = it.next().getValue();
                if (m10959c(value.f2358b).delete()) {
                    this.f2354b -= value.f2357a;
                } else {
                    C0810t.m10990b("Could not delete cache entry for key=%s, filename=%s", value.f2358b, m10957d(value.f2358b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.f2354b + i)) < this.f2356d * 0.9f) {
                    break;
                }
                i3 = i2;
            }
            if (C0810t.f2327b) {
                C0810t.m10992a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f2354b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    private void m10964a(String str, C0820a c0820a) {
        if (!this.f2353a.containsKey(str)) {
            this.f2354b += c0820a.f2357a;
        } else {
            this.f2354b = (c0820a.f2357a - this.f2353a.get(str).f2357a) + this.f2354b;
        }
        this.f2353a.put(str, c0820a);
    }

    /* renamed from: e */
    private void m10955e(String str) {
        C0820a c0820a = this.f2353a.get(str);
        if (c0820a != null) {
            this.f2354b -= c0820a.f2357a;
            this.f2353a.remove(str);
        }
    }

    /* renamed from: a */
    private static byte[] m10968a(InputStream inputStream, int i) {
        if (i >= 104857600) {
            throw new IOException("Cache File Length is too large");
        }
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
    /* renamed from: com.android.volley.toolbox.c$a */
    /* loaded from: classes.dex */
    public static class C0820a {

        /* renamed from: a */
        public long f2357a;

        /* renamed from: b */
        public String f2358b;

        /* renamed from: c */
        public String f2359c;

        /* renamed from: d */
        public long f2360d;

        /* renamed from: e */
        public long f2361e;

        /* renamed from: f */
        public long f2362f;

        /* renamed from: g */
        public long f2363g;

        /* renamed from: h */
        public Map<String, String> f2364h;

        private C0820a() {
        }

        public C0820a(String str, InterfaceC0781b.C0782a c0782a) {
            this.f2358b = str;
            this.f2357a = c0782a.f2250a.length;
            this.f2359c = c0782a.f2251b;
            this.f2360d = c0782a.f2252c;
            this.f2361e = c0782a.f2253d;
            this.f2362f = c0782a.f2254e;
            this.f2363g = c0782a.f2255f;
            this.f2364h = c0782a.f2256g;
        }

        /* renamed from: a */
        public static C0820a m10954a(InputStream inputStream) {
            C0820a c0820a = new C0820a();
            if (C0818c.m10969a(inputStream) != 538247942) {
                throw new IOException();
            }
            c0820a.f2358b = C0818c.m10960c(inputStream);
            c0820a.f2359c = C0818c.m10960c(inputStream);
            if (c0820a.f2359c.equals("")) {
                c0820a.f2359c = null;
            }
            c0820a.f2360d = C0818c.m10962b(inputStream);
            c0820a.f2361e = C0818c.m10962b(inputStream);
            c0820a.f2362f = C0818c.m10962b(inputStream);
            c0820a.f2363g = C0818c.m10962b(inputStream);
            c0820a.f2364h = C0818c.m10958d(inputStream);
            return c0820a;
        }

        /* renamed from: a */
        public InterfaceC0781b.C0782a m10952a(byte[] bArr) {
            InterfaceC0781b.C0782a c0782a = new InterfaceC0781b.C0782a();
            c0782a.f2250a = bArr;
            c0782a.f2251b = this.f2359c;
            c0782a.f2252c = this.f2360d;
            c0782a.f2253d = this.f2361e;
            c0782a.f2254e = this.f2362f;
            c0782a.f2255f = this.f2363g;
            c0782a.f2256g = this.f2364h;
            return c0782a;
        }

        /* renamed from: a */
        public boolean m10953a(OutputStream outputStream) {
            try {
                C0818c.m10967a(outputStream, 538247942);
                C0818c.m10965a(outputStream, this.f2358b);
                C0818c.m10965a(outputStream, this.f2359c == null ? "" : this.f2359c);
                C0818c.m10966a(outputStream, this.f2360d);
                C0818c.m10966a(outputStream, this.f2361e);
                C0818c.m10966a(outputStream, this.f2362f);
                C0818c.m10966a(outputStream, this.f2363g);
                C0818c.m10963a(this.f2364h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0810t.m10990b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.android.volley.toolbox.c$b */
    /* loaded from: classes.dex */
    private static class C0821b extends FilterInputStream {

        /* renamed from: a */
        private int f2365a;

        private C0821b(InputStream inputStream) {
            super(inputStream);
            this.f2365a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f2365a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f2365a += read;
            }
            return read;
        }
    }

    /* renamed from: e */
    private static int m10956e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    /* renamed from: a */
    static void m10967a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static int m10969a(InputStream inputStream) {
        return 0 | (m10956e(inputStream) << 0) | (m10956e(inputStream) << 8) | (m10956e(inputStream) << 16) | (m10956e(inputStream) << 24);
    }

    /* renamed from: a */
    static void m10966a(OutputStream outputStream, long j) {
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
    static long m10962b(InputStream inputStream) {
        return 0 | ((m10956e(inputStream) & 255) << 0) | ((m10956e(inputStream) & 255) << 8) | ((m10956e(inputStream) & 255) << 16) | ((m10956e(inputStream) & 255) << 24) | ((m10956e(inputStream) & 255) << 32) | ((m10956e(inputStream) & 255) << 40) | ((m10956e(inputStream) & 255) << 48) | ((m10956e(inputStream) & 255) << 56);
    }

    /* renamed from: a */
    static void m10965a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m10966a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: c */
    static String m10960c(InputStream inputStream) {
        return new String(m10968a(inputStream, (int) m10962b(inputStream)), "UTF-8");
    }

    /* renamed from: a */
    static void m10963a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            m10967a(outputStream, map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m10965a(outputStream, entry.getKey());
                m10965a(outputStream, entry.getValue());
            }
            return;
        }
        m10967a(outputStream, 0);
    }

    /* renamed from: d */
    static Map<String, String> m10958d(InputStream inputStream) {
        int m10969a = m10969a(inputStream);
        if (m10969a >= 10485760) {
            throw new IOException("Cache File Length is too large");
        }
        Map<String, String> emptyMap = m10969a == 0 ? Collections.emptyMap() : new HashMap<>(m10969a);
        for (int i = 0; i < m10969a; i++) {
            emptyMap.put(m10960c(inputStream).intern(), m10960c(inputStream).intern());
        }
        return emptyMap;
    }
}
