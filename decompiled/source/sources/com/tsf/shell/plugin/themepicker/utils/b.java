package com.tsf.shell.plugin.themepicker.utils;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public final class b implements Closeable {
    private static final Charset a = Charset.forName("UTF-8");
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private final long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, C0159b> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    private final ExecutorService m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> n = new Callable<Void>() { // from class: com.tsf.shell.plugin.themepicker.utils.b.1
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (b.this) {
                if (b.this.i != null) {
                    b.this.i();
                    if (b.this.g()) {
                        b.this.f();
                        b.this.k = 0;
                    }
                }
            }
            return null;
        }
    };

    private static <T> T[] a(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
        System.arraycopy(tArr, i, tArr2, 0, min);
        return tArr2;
    }

    public static String a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0 && sb.charAt(length - 1) == '\r') {
                    sb.setLength(length - 1);
                }
                return sb.toString();
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    private b(File file, int i, int i2, long j) {
        this.b = file;
        this.e = i;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.g = i2;
        this.f = j;
    }

    public static b a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        b bVar = new b(file, i, i2, j);
        if (bVar.c.exists()) {
            try {
                bVar.d();
                bVar.e();
                bVar.i = new BufferedWriter(new FileWriter(bVar.c, true), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                return bVar;
            } catch (IOException e) {
                bVar.c();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i, i2, j);
        bVar2.f();
        return bVar2;
    }

    private void d() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.c), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        try {
            String a2 = a((InputStream) bufferedInputStream);
            String a3 = a((InputStream) bufferedInputStream);
            String a4 = a((InputStream) bufferedInputStream);
            String a5 = a((InputStream) bufferedInputStream);
            String a6 = a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.e).equals(a4) || !Integer.toString(this.g).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
            }
            while (true) {
                try {
                    d(a((InputStream) bufferedInputStream));
                } catch (EOFException e) {
                    return;
                }
            }
        } finally {
            a((Closeable) bufferedInputStream);
        }
    }

    private void d(String str) {
        C0159b c0159b;
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals("REMOVE") && split.length == 2) {
            this.j.remove(str2);
            return;
        }
        C0159b c0159b2 = this.j.get(str2);
        if (c0159b2 == null) {
            C0159b c0159b3 = new C0159b(str2);
            this.j.put(str2, c0159b3);
            c0159b = c0159b3;
        } else {
            c0159b = c0159b2;
        }
        if (!split[0].equals("CLEAN") || split.length != this.g + 2) {
            if (!split[0].equals("DIRTY") || split.length != 2) {
                if (!split[0].equals("READ") || split.length != 2) {
                    throw new IOException("unexpected journal line: " + str);
                }
                return;
            }
            c0159b.e = new a(c0159b);
            return;
        }
        c0159b.d = true;
        c0159b.e = null;
        c0159b.a((String[]) a(split, 2, split.length));
    }

    private void e() {
        b(this.d);
        Iterator<C0159b> it = this.j.values().iterator();
        while (it.hasNext()) {
            C0159b next = it.next();
            if (next.e == null) {
                for (int i = 0; i < this.g; i++) {
                    this.h += next.c[i];
                }
            } else {
                next.e = null;
                for (int i2 = 0; i2 < this.g; i2++) {
                    b(next.a(i2));
                    b(next.b(i2));
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (this.i != null) {
            this.i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.d), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C0159b c0159b : this.j.values()) {
            if (c0159b.e != null) {
                bufferedWriter.write("DIRTY " + c0159b.b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c0159b.b + c0159b.a() + '\n');
            }
        }
        bufferedWriter.close();
        this.d.renameTo(this.c);
        this.i = new BufferedWriter(new FileWriter(this.c, true), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized c a(String str) {
        c cVar = null;
        synchronized (this) {
            h();
            e(str);
            C0159b c0159b = this.j.get(str);
            if (c0159b != null && c0159b.d) {
                InputStream[] inputStreamArr = new InputStream[this.g];
                for (int i = 0; i < this.g; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(c0159b.a(i));
                    } catch (FileNotFoundException e) {
                    }
                }
                this.k++;
                this.i.append((CharSequence) ("READ " + str + '\n'));
                if (g()) {
                    this.m.submit(this.n);
                }
                cVar = new c(str, c0159b.f, inputStreamArr);
            }
        }
        return cVar;
    }

    public a b(String str) {
        return a(str, -1L);
    }

    private synchronized a a(String str, long j) {
        C0159b c0159b;
        a aVar;
        h();
        e(str);
        C0159b c0159b2 = this.j.get(str);
        if (j == -1 || (c0159b2 != null && c0159b2.f == j)) {
            if (c0159b2 == null) {
                C0159b c0159b3 = new C0159b(str);
                this.j.put(str, c0159b3);
                c0159b = c0159b3;
            } else if (c0159b2.e != null) {
                aVar = null;
            } else {
                c0159b = c0159b2;
            }
            aVar = new a(c0159b);
            c0159b.e = aVar;
            this.i.write("DIRTY " + str + '\n');
            this.i.flush();
        } else {
            aVar = null;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar, boolean z) {
        synchronized (this) {
            C0159b c0159b = aVar.b;
            if (c0159b.e != aVar) {
                throw new IllegalStateException();
            }
            if (z && !c0159b.d) {
                for (int i = 0; i < this.g; i++) {
                    if (!c0159b.b(i).exists()) {
                        aVar.b();
                        throw new IllegalStateException("edit didn't create file " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                File b = c0159b.b(i2);
                if (z) {
                    if (b.exists()) {
                        File a2 = c0159b.a(i2);
                        b.renameTo(a2);
                        long j = c0159b.c[i2];
                        long length = a2.length();
                        c0159b.c[i2] = length;
                        this.h = (this.h - j) + length;
                    }
                } else {
                    b(b);
                }
            }
            this.k++;
            c0159b.e = null;
            if (c0159b.d | z) {
                c0159b.d = true;
                this.i.write("CLEAN " + c0159b.b + c0159b.a() + '\n');
                if (z) {
                    long j2 = this.l;
                    this.l = 1 + j2;
                    c0159b.f = j2;
                }
            } else {
                this.j.remove(c0159b.b);
                this.i.write("REMOVE " + c0159b.b + '\n');
            }
            if (this.h > this.f || g()) {
                this.m.submit(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.k >= 2000 && this.k >= this.j.size();
    }

    public synchronized boolean c(String str) {
        boolean z;
        synchronized (this) {
            h();
            e(str);
            C0159b c0159b = this.j.get(str);
            if (c0159b == null || c0159b.e != null) {
                z = false;
            } else {
                for (int i = 0; i < this.g; i++) {
                    File a2 = c0159b.a(i);
                    if (!a2.delete()) {
                        throw new IOException("failed to delete " + a2);
                    }
                    this.h -= c0159b.c[i];
                    c0159b.c[i] = 0;
                }
                this.k++;
                this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.j.remove(str);
                if (g()) {
                    this.m.submit(this.n);
                }
                z = true;
            }
        }
        return z;
    }

    public boolean a() {
        return this.i == null;
    }

    private void h() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void b() {
        h();
        i();
        this.i.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.i != null) {
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                C0159b c0159b = (C0159b) it.next();
                if (c0159b.e != null) {
                    c0159b.e.b();
                }
            }
            i();
            this.i.close();
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        while (this.h > this.f) {
            c(this.j.entrySet().iterator().next().getKey());
        }
    }

    public void c() {
        close();
        a(this.b);
    }

    private void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Closeable {
        private final String b;
        private final long c;
        private final InputStream[] d;

        private c(String str, long j, InputStream[] inputStreamArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
        }

        public InputStream a(int i) {
            return this.d[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.d) {
                b.a((Closeable) inputStream);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class a {
        private final C0159b b;
        private boolean c;

        private a(C0159b c0159b) {
            this.b = c0159b;
        }

        public OutputStream a(int i) {
            C0158a c0158a;
            synchronized (b.this) {
                if (this.b.e != this) {
                    throw new IllegalStateException();
                }
                c0158a = new C0158a(new FileOutputStream(this.b.b(i)));
            }
            return c0158a;
        }

        public void a() {
            if (this.c) {
                b.this.a(this, false);
                b.this.c(this.b.b);
                return;
            }
            b.this.a(this, true);
        }

        public void b() {
            b.this.a(this, false);
        }

        /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0158a extends FilterOutputStream {
            private C0158a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    a.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    a.this.c = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0159b {
        private final String b;
        private final long[] c;
        private boolean d;
        private a e;
        private long f;

        private C0159b(String str) {
            this.b = str;
            this.c = new long[b.this.g];
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String[] strArr) {
            if (strArr.length != b.this.g) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException e) {
                    throw b(strArr);
                }
            }
        }

        private IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File a(int i) {
            return new File(b.this.b, this.b + "." + i);
        }

        public File b(int i) {
            return new File(b.this.b, this.b + "." + i + ".tmp");
        }
    }
}
