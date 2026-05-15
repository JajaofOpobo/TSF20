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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tsf.extend.base.b.c$b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.tsf.extend.base.b.c$b, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    @Override // com.android.volley.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.android.volley.b.a a(java.lang.String r9) {
        /*
            r8 = this;
            r1 = 0
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.tsf.extend.base.b.c$a> r0 = r8.a     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L76
            com.tsf.extend.base.b.c$a r0 = (com.tsf.extend.base.b.c.a) r0     // Catch: java.lang.Throwable -> L76
            java.io.File r3 = r8.c(r9)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L19
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L19
            r0 = r1
        L17:
            monitor-exit(r8)
            return r0
        L19:
            com.tsf.extend.base.b.c$b r2 = new com.tsf.extend.base.b.c$b     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L7e
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L7e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L7e
            r5 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L7e
            if (r0 != 0) goto L46
            com.tsf.extend.base.b.c$a r0 = com.tsf.extend.base.b.c.a.a(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
        L2a:
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            int r6 = com.tsf.extend.base.b.c.b.a(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            long r4 = r4 - r6
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            byte[] r4 = a(r2, r4)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            com.android.volley.b$a r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            if (r2 == 0) goto L17
            r2.close()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L76
            goto L17
        L43:
            r0 = move-exception
            r0 = r1
            goto L17
        L46:
            com.tsf.extend.base.b.c.a.a(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L7c
            goto L2a
        L4a:
            r0 = move-exception
        L4b:
            java.lang.String r4 = "%s: %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7c
            r6 = 0
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L7c
            r5[r6] = r3     // Catch: java.lang.Throwable -> L7c
            r3 = 1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            r5[r3] = r0     // Catch: java.lang.Throwable -> L7c
            com.android.volley.t.b(r4, r5)     // Catch: java.lang.Throwable -> L7c
            r8.b(r9)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L76
        L69:
            r0 = r1
            goto L17
        L6b:
            r0 = move-exception
            r0 = r1
            goto L17
        L6e:
            r0 = move-exception
            r2 = r1
        L70:
            if (r2 == 0) goto L75
            r2.close()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
        L75:
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L79:
            r0 = move-exception
            r0 = r1
            goto L17
        L7c:
            r0 = move-exception
            goto L70
        L7e:
            r0 = move-exception
            r2 = r1
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.b.c.a(java.lang.String):com.android.volley.b$a");
    }

    @Override // com.android.volley.b
    public synchronized void a() {
        BufferedInputStream bufferedInputStream;
        if (this.c.exists()) {
            File[] fileArrListFiles = this.c.listFiles();
            if (fileArrListFiles != null) {
                Pair[] pairArr = new Pair[fileArrListFiles.length];
                for (int i = 0; i < fileArrListFiles.length; i++) {
                    File file = fileArrListFiles[i];
                    pairArr[i] = new Pair(Long.valueOf(file.lastModified()), file);
                }
                try {
                    Arrays.sort(pairArr, new Comparator<Pair<Long, File>>() { // from class: com.tsf.extend.base.b.c.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i2 = 0;
                while (i2 < pairArr.length) {
                    File file2 = (File) pairArr[i2].second;
                    if (jCurrentTimeMillis - file2.lastModified() > this.e || j > this.d * 0.9f) {
                        file2.delete();
                    } else {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                try {
                                    a aVarA = a.a(bufferedInputStream);
                                    aVarA.a = file2.length();
                                    j += aVarA.a;
                                    a(aVarA.b, aVarA);
                                    if (bufferedInputStream != null) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (bufferedInputStream != null) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e3) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                file2.delete();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e4) {
                                    }
                                }
                            }
                        } catch (Throwable th3) {
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
        File fileC = c(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileC));
            try {
                aVar2 = new a(str, aVar);
            } catch (IOException e) {
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e2) {
                    }
                }
                if (!fileC.delete()) {
                    t.b("Could not clean up file %s", fileC.getAbsolutePath());
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
            t.b("Failed to write header for %s", fileC.getAbsolutePath());
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
        boolean zDelete = c(str).delete();
        e(str);
        if (!zDelete) {
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

    private static byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 != i) {
            throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
        }
        return bArr;
    }

    static class a {
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

        public static a a(InputStream inputStream) throws IOException {
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

    private static class b extends FilterInputStream {
        private int a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.a++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.a += i3;
            }
            return i3;
        }
    }

    private static int e(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        return i;
    }

    static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int a(InputStream inputStream) {
        return 0 | (e(inputStream) << 0) | (e(inputStream) << 8) | (e(inputStream) << 16) | (e(inputStream) << 24);
    }

    static void a(OutputStream outputStream, long j) throws IOException {
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
        return 0 | ((((long) e(inputStream)) & 255) << 0) | ((((long) e(inputStream)) & 255) << 8) | ((((long) e(inputStream)) & 255) << 16) | ((((long) e(inputStream)) & 255) << 24) | ((((long) e(inputStream)) & 255) << 32) | ((((long) e(inputStream)) & 255) << 40) | ((((long) e(inputStream)) & 255) << 48) | ((((long) e(inputStream)) & 255) << 56);
    }

    static void a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String c(InputStream inputStream) {
        return new String(a(inputStream, (int) b(inputStream)), "UTF-8");
    }

    static void a(Map<String, String> map, OutputStream outputStream) throws IOException {
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
        int iA = a(inputStream);
        Map<String, String> mapEmptyMap = iA == 0 ? Collections.emptyMap() : new HashMap<>(iA);
        for (int i = 0; i < iA; i++) {
            mapEmptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return mapEmptyMap;
    }
}
