package com.tsf.extend.base.b;

import android.util.Pair;
import com.android.volley.b;
import com.android.volley.t;
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
/* loaded from: classes.dex */
public class c implements com.android.volley.b {
    private final Map<String, a> a;
    private long b;
    private final File c;
    private final int d;
    private final int e;

    public c(File file, int i, int i2) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = file;
        this.d = i;
        this.e = i2;
    }

    public c(File file) {
        this(file, 20971520, 864000000);
    }

    @Override // com.android.volley.b
    public synchronized b.a a(String str) {
        b bVar;
        b.a aVar;
        a aVar2 = this.a.get(str);
        File c = c(str);
        if (aVar2 != null || c.exists()) {
            try {
                bVar = new b(new FileInputStream(c));
                try {
                    if (aVar2 == null) {
                        aVar2 = a.a(bVar);
                    } else {
                        a.a(bVar);
                    }
                    aVar = aVar2.a(a(bVar, (int) (c.length() - bVar.a)));
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e) {
                            aVar = null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    t.b("%s: %s", c.getAbsolutePath(), th.toString());
                    b(str);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e2) {
                            aVar = null;
                        }
                    }
                    aVar = null;
                    return aVar;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = null;
            }
        } else {
            aVar = null;
        }
        return aVar;
    }

    @Override // com.android.volley.b
    public synchronized void a() {
        BufferedInputStream bufferedInputStream;
        if (this.c.exists()) {
            File[] listFiles = this.c.listFiles();
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
                    if (currentTimeMillis - file2.lastModified() > this.e || ((float) j) > this.d * 0.9f) {
                        file2.delete();
                    } else {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                a a2 = a.a(bufferedInputStream);
                                a2.a = file2.length();
                                j += a2.a;
                                a(a2.b, a2);
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
        } else if (!this.c.mkdirs()) {
            t.c("Unable to create cache dir %s", this.c.getAbsolutePath());
        }
    }

    @Override // com.android.volley.b
    public synchronized void a(String str, b.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        a aVar2;
        File c = c(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c));
            try {
                aVar2 = new a(str, aVar);
            } catch (IOException e) {
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e2) {
                    }
                }
                if (!c.delete()) {
                    t.b("Could not clean up file %s", c.getAbsolutePath());
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
        if (!aVar2.a(bufferedOutputStream)) {
            t.b("Failed to write header for %s", c.getAbsolutePath());
            throw new IOException();
        }
        bufferedOutputStream.write(aVar.a);
        a(str, aVar2);
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException e5) {
            }
        }
    }

    public synchronized void b(String str) {
        boolean delete = c(str).delete();
        e(str);
        if (!delete) {
            t.b("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    private String d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    public File c(String str) {
        return new File(this.c, d(str));
    }

    private void a(String str, a aVar) {
        if (!this.a.containsKey(str)) {
            this.b += aVar.a;
        } else {
            this.b = (aVar.a - this.a.get(str).a) + this.b;
        }
        this.a.put(str, aVar);
    }

    private void e(String str) {
        a aVar = this.a.get(str);
        if (aVar != null) {
            this.b -= aVar.a;
            this.a.remove(str);
        }
    }

    private static byte[] a(InputStream inputStream, int i) {
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
    /* loaded from: classes.dex */
    public static class a {
        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g;

        private a() {
        }

        public a(String str, b.a aVar) {
            this.b = str;
            this.a = aVar.a.length;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        public static a a(InputStream inputStream) {
            a aVar = new a();
            if (c.a(inputStream) != 538183203) {
                throw new IOException();
            }
            aVar.b = c.c(inputStream);
            aVar.c = c.c(inputStream);
            if (aVar.c.equals("")) {
                aVar.c = null;
            }
            aVar.d = c.b(inputStream);
            aVar.e = c.b(inputStream);
            aVar.f = c.b(inputStream);
            aVar.g = c.d(inputStream);
            return aVar;
        }

        public b.a a(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.a = bArr;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            return aVar;
        }

        public boolean a(OutputStream outputStream) {
            try {
                c.a(outputStream, 538183203);
                c.a(outputStream, this.b);
                c.a(outputStream, this.c == null ? "" : this.c);
                c.a(outputStream, this.d);
                c.a(outputStream, this.e);
                c.a(outputStream, this.f);
                c.a(this.g, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                t.b("%s", e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b extends FilterInputStream {
        private int a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.a += read;
            }
            return read;
        }
    }

    private static int e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int a(InputStream inputStream) {
        return 0 | (e(inputStream) << 0) | (e(inputStream) << 8) | (e(inputStream) << 16) | (e(inputStream) << 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long b(InputStream inputStream) {
        return 0 | ((e(inputStream) & 255) << 0) | ((e(inputStream) & 255) << 8) | ((e(inputStream) & 255) << 16) | ((e(inputStream) & 255) << 24) | ((e(inputStream) & 255) << 32) | ((e(inputStream) & 255) << 40) | ((e(inputStream) & 255) << 48) | ((e(inputStream) & 255) << 56);
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String c(InputStream inputStream) {
        return new String(a(inputStream, (int) b(inputStream)), "UTF-8");
    }

    static void a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            a(outputStream, map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(outputStream, entry.getKey());
                a(outputStream, entry.getValue());
            }
            return;
        }
        a(outputStream, 0);
    }

    static Map<String, String> d(InputStream inputStream) {
        int a2 = a(inputStream);
        Map<String, String> emptyMap = a2 == 0 ? Collections.emptyMap() : new HashMap<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return emptyMap;
    }
}
