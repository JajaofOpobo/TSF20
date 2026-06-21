package com.tsf.shell.plugin.themepicker.utils;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public final class g implements Closeable {
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
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    private final ExecutorService m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable n = new Callable() { // from class: com.tsf.shell.plugin.themepicker.utils.g.1
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (g.this) {
                if (g.this.i != null) {
                    g.this.i();
                    if (g.this.g()) {
                        g.this.f();
                        g.this.k = 0;
                    }
                }
            }
            return null;
        }
    };

    private static Object[] a(Object[] objArr, int i, int i2) {
        int length = objArr.length;
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        System.arraycopy(objArr, i, objArr2, 0, min);
        return objArr2;
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

    private g(File file, int i, int i2, long j) {
        this.b = file;
        this.e = i;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.g = i2;
        this.f = j;
    }

    public static g a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        g gVar = new g(file, i, i2, j);
        if (gVar.c.exists()) {
            try {
                gVar.d();
                gVar.e();
                gVar.i = new BufferedWriter(new FileWriter(gVar.c, true), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                return gVar;
            } catch (IOException e) {
                gVar.c();
            }
        }
        file.mkdirs();
        g gVar2 = new g(file, i, i2, j);
        gVar2.f();
        return gVar2;
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

    /* JADX WARN: Multi-variable type inference failed */
    private void d(String str) {
        j jVar;
        j jVar2 = null;
        Object[] objArr = 0;
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals("REMOVE") && split.length == 2) {
            this.j.remove(str2);
            return;
        }
        j jVar3 = (j) this.j.get(str2);
        if (jVar3 == null) {
            j jVar4 = new j(this, str2, jVar2);
            this.j.put(str2, jVar4);
            jVar = jVar4;
        } else {
            jVar = jVar3;
        }
        if (!split[0].equals("CLEAN") || split.length != this.g + 2) {
            if (!split[0].equals("DIRTY") || split.length != 2) {
                if (!split[0].equals("READ") || split.length != 2) {
                    throw new IOException("unexpected journal line: " + str);
                }
                return;
            }
            jVar.e = new h(this, jVar, objArr == true ? 1 : 0);
            return;
        }
        jVar.d = true;
        jVar.e = null;
        jVar.a((String[]) a(split, 2, split.length));
    }

    private void e() {
        b(this.d);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.e == null) {
                for (int i = 0; i < this.g; i++) {
                    this.h += jVar.c[i];
                }
            } else {
                jVar.e = null;
                for (int i2 = 0; i2 < this.g; i2++) {
                    b(jVar.a(i2));
                    b(jVar.b(i2));
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
        for (j jVar : this.j.values()) {
            if (jVar.e != null) {
                bufferedWriter.write("DIRTY " + jVar.b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + jVar.b + jVar.a() + '\n');
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

    public synchronized k a(String str) {
        k kVar = null;
        synchronized (this) {
            h();
            e(str);
            j jVar = (j) this.j.get(str);
            if (jVar != null && jVar.d) {
                InputStream[] inputStreamArr = new InputStream[this.g];
                for (int i = 0; i < this.g; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(jVar.a(i));
                    } catch (FileNotFoundException e) {
                    }
                }
                this.k++;
                this.i.append((CharSequence) ("READ " + str + '\n'));
                if (g()) {
                    this.m.submit(this.n);
                }
                kVar = new k(this, str, jVar.f, inputStreamArr, null);
            }
        }
        return kVar;
    }

    public h b(String str) {
        return a(str, -1L);
    }

    private synchronized h a(String str, long j) {
        j jVar;
        h hVar;
        h();
        e(str);
        j jVar2 = (j) this.j.get(str);
        if (j == -1 || (jVar2 != null && jVar2.f == j)) {
            if (jVar2 == null) {
                j jVar3 = new j(this, str, null);
                this.j.put(str, jVar3);
                jVar = jVar3;
            } else if (jVar2.e != null) {
                hVar = null;
            } else {
                jVar = jVar2;
            }
            hVar = new h(this, jVar, null);
            jVar.e = hVar;
            this.i.write("DIRTY " + str + '\n');
            this.i.flush();
        } else {
            hVar = null;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(h hVar, boolean z) {
        synchronized (this) {
            j jVar = hVar.b;
            if (jVar.e != hVar) {
                throw new IllegalStateException();
            }
            if (z && !jVar.d) {
                for (int i = 0; i < this.g; i++) {
                    if (!jVar.b(i).exists()) {
                        hVar.b();
                        throw new IllegalStateException("edit didn't create file " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                File b = jVar.b(i2);
                if (z) {
                    if (b.exists()) {
                        File a2 = jVar.a(i2);
                        b.renameTo(a2);
                        long j = jVar.c[i2];
                        long length = a2.length();
                        jVar.c[i2] = length;
                        this.h = (this.h - j) + length;
                    }
                } else {
                    b(b);
                }
            }
            this.k++;
            jVar.e = null;
            if (!(jVar.d | z)) {
                this.j.remove(jVar.b);
                this.i.write("REMOVE " + jVar.b + '\n');
            } else {
                jVar.d = true;
                this.i.write("CLEAN " + jVar.b + jVar.a() + '\n');
                if (z) {
                    long j2 = this.l;
                    this.l = 1 + j2;
                    jVar.f = j2;
                }
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
            j jVar = (j) this.j.get(str);
            if (jVar == null || jVar.e != null) {
                z = false;
            } else {
                for (int i = 0; i < this.g; i++) {
                    File a2 = jVar.a(i);
                    if (!a2.delete()) {
                        throw new IOException("failed to delete " + a2);
                    }
                    this.h -= jVar.c[i];
                    jVar.c[i] = 0;
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
                j jVar = (j) it.next();
                if (jVar.e != null) {
                    jVar.e.b();
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
            c((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
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
}
