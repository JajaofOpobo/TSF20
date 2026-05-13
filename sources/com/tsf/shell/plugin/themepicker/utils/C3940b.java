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
/* renamed from: com.tsf.shell.plugin.themepicker.utils.b */
/* loaded from: classes.dex */
public final class C3940b implements Closeable {

    /* renamed from: a */
    private static final Charset f12899a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final File f12900b;

    /* renamed from: c */
    private final File f12901c;

    /* renamed from: d */
    private final File f12902d;

    /* renamed from: e */
    private final int f12903e;

    /* renamed from: f */
    private final long f12904f;

    /* renamed from: g */
    private final int f12905g;

    /* renamed from: i */
    private Writer f12907i;

    /* renamed from: k */
    private int f12909k;

    /* renamed from: h */
    private long f12906h = 0;

    /* renamed from: j */
    private final LinkedHashMap<String, C3944b> f12908j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    private long f12910l = 0;

    /* renamed from: m */
    private final ExecutorService f12911m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    private final Callable<Void> f12912n = new Callable<Void>() { // from class: com.tsf.shell.plugin.themepicker.utils.b.1
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C3940b.this) {
                if (C3940b.this.f12907i != null) {
                    C3940b.this.m1108i();
                    if (C3940b.this.m1110g()) {
                        C3940b.this.m1112f();
                        C3940b.this.f12909k = 0;
                    }
                }
            }
            return null;
        }
    };

    /* renamed from: a */
    private static <T> T[] m1126a(T[] tArr, int i, int i2) {
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

    /* renamed from: a */
    public static String m1129a(InputStream inputStream) {
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

    /* renamed from: a */
    public static void m1132a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    public static void m1131a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m1131a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    private C3940b(File file, int i, int i2, long j) {
        this.f12900b = file;
        this.f12903e = i;
        this.f12901c = new File(file, "journal");
        this.f12902d = new File(file, "journal.tmp");
        this.f12905g = i2;
        this.f12904f = j;
    }

    /* renamed from: a */
    public static C3940b m1130a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        C3940b c3940b = new C3940b(file, i, i2, j);
        if (c3940b.f12901c.exists()) {
            try {
                c3940b.m1118d();
                c3940b.m1115e();
                c3940b.f12907i = new BufferedWriter(new FileWriter(c3940b.f12901c, true), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                return c3940b;
            } catch (IOException e) {
                c3940b.m1121c();
            }
        }
        file.mkdirs();
        C3940b c3940b2 = new C3940b(file, i, i2, j);
        c3940b2.m1112f();
        return c3940b2;
    }

    /* renamed from: d */
    private void m1118d() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f12901c), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        try {
            String m1129a = m1129a((InputStream) bufferedInputStream);
            String m1129a2 = m1129a((InputStream) bufferedInputStream);
            String m1129a3 = m1129a((InputStream) bufferedInputStream);
            String m1129a4 = m1129a((InputStream) bufferedInputStream);
            String m1129a5 = m1129a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(m1129a) || !"1".equals(m1129a2) || !Integer.toString(this.f12903e).equals(m1129a3) || !Integer.toString(this.f12905g).equals(m1129a4) || !"".equals(m1129a5)) {
                throw new IOException("unexpected journal header: [" + m1129a + ", " + m1129a2 + ", " + m1129a4 + ", " + m1129a5 + "]");
            }
            while (true) {
                try {
                    m1116d(m1129a((InputStream) bufferedInputStream));
                } catch (EOFException e) {
                    return;
                }
            }
        } finally {
            m1132a((Closeable) bufferedInputStream);
        }
    }

    /* renamed from: d */
    private void m1116d(String str) {
        C3944b c3944b;
        String[] split = str.split(" ");
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals("REMOVE") && split.length == 2) {
            this.f12908j.remove(str2);
            return;
        }
        C3944b c3944b2 = this.f12908j.get(str2);
        if (c3944b2 == null) {
            C3944b c3944b3 = new C3944b(str2);
            this.f12908j.put(str2, c3944b3);
            c3944b = c3944b3;
        } else {
            c3944b = c3944b2;
        }
        if (!split[0].equals("CLEAN") || split.length != this.f12905g + 2) {
            if (!split[0].equals("DIRTY") || split.length != 2) {
                if (!split[0].equals("READ") || split.length != 2) {
                    throw new IOException("unexpected journal line: " + str);
                }
                return;
            }
            c3944b.f12922e = new C3942a(c3944b);
            return;
        }
        c3944b.f12921d = true;
        c3944b.f12922e = null;
        c3944b.m1094a((String[]) m1126a(split, 2, split.length));
    }

    /* renamed from: e */
    private void m1115e() {
        m1123b(this.f12902d);
        Iterator<C3944b> it = this.f12908j.values().iterator();
        while (it.hasNext()) {
            C3944b next = it.next();
            if (next.f12922e == null) {
                for (int i = 0; i < this.f12905g; i++) {
                    this.f12906h += next.f12920c[i];
                }
            } else {
                next.f12922e = null;
                for (int i2 = 0; i2 < this.f12905g; i2++) {
                    m1123b(next.m1100a(i2));
                    m1123b(next.m1093b(i2));
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m1112f() {
        if (this.f12907i != null) {
            this.f12907i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f12902d), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f12903e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f12905g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C3944b c3944b : this.f12908j.values()) {
            if (c3944b.f12922e != null) {
                bufferedWriter.write("DIRTY " + c3944b.f12919b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c3944b.f12919b + c3944b.m1101a() + '\n');
            }
        }
        bufferedWriter.close();
        this.f12902d.renameTo(this.f12901c);
        this.f12907i = new BufferedWriter(new FileWriter(this.f12901c, true), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
    }

    /* renamed from: b */
    private static void m1123b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public synchronized C3945c m1128a(String str) {
        C3945c c3945c = null;
        synchronized (this) {
            m1109h();
            m1113e(str);
            C3944b c3944b = this.f12908j.get(str);
            if (c3944b != null && c3944b.f12921d) {
                InputStream[] inputStreamArr = new InputStream[this.f12905g];
                for (int i = 0; i < this.f12905g; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(c3944b.m1100a(i));
                    } catch (FileNotFoundException e) {
                    }
                }
                this.f12909k++;
                this.f12907i.append((CharSequence) ("READ " + str + '\n'));
                if (m1110g()) {
                    this.f12911m.submit(this.f12912n);
                }
                c3945c = new C3945c(str, c3944b.f12923f, inputStreamArr);
            }
        }
        return c3945c;
    }

    /* renamed from: b */
    public C3942a m1122b(String str) {
        return m1127a(str, -1L);
    }

    /* renamed from: a */
    private synchronized C3942a m1127a(String str, long j) {
        C3944b c3944b;
        C3942a c3942a;
        m1109h();
        m1113e(str);
        C3944b c3944b2 = this.f12908j.get(str);
        if (j == -1 || (c3944b2 != null && c3944b2.f12923f == j)) {
            if (c3944b2 == null) {
                C3944b c3944b3 = new C3944b(str);
                this.f12908j.put(str, c3944b3);
                c3944b = c3944b3;
            } else if (c3944b2.f12922e != null) {
                c3942a = null;
            } else {
                c3944b = c3944b2;
            }
            c3942a = new C3942a(c3944b);
            c3944b.f12922e = c3942a;
            this.f12907i.write("DIRTY " + str + '\n');
            this.f12907i.flush();
        } else {
            c3942a = null;
        }
        return c3942a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1136a(C3942a c3942a, boolean z) {
        synchronized (this) {
            C3944b c3944b = c3942a.f12915b;
            if (c3944b.f12922e != c3942a) {
                throw new IllegalStateException();
            }
            if (z && !c3944b.f12921d) {
                for (int i = 0; i < this.f12905g; i++) {
                    if (!c3944b.m1093b(i).exists()) {
                        c3942a.m1102b();
                        throw new IllegalStateException("edit didn't create file " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f12905g; i2++) {
                File m1093b = c3944b.m1093b(i2);
                if (z) {
                    if (m1093b.exists()) {
                        File m1100a = c3944b.m1100a(i2);
                        m1093b.renameTo(m1100a);
                        long j = c3944b.f12920c[i2];
                        long length = m1100a.length();
                        c3944b.f12920c[i2] = length;
                        this.f12906h = (this.f12906h - j) + length;
                    }
                } else {
                    m1123b(m1093b);
                }
            }
            this.f12909k++;
            c3944b.f12922e = null;
            if (c3944b.f12921d | z) {
                c3944b.f12921d = true;
                this.f12907i.write("CLEAN " + c3944b.f12919b + c3944b.m1101a() + '\n');
                if (z) {
                    long j2 = this.f12910l;
                    this.f12910l = 1 + j2;
                    c3944b.f12923f = j2;
                }
            } else {
                this.f12908j.remove(c3944b.f12919b);
                this.f12907i.write("REMOVE " + c3944b.f12919b + '\n');
            }
            if (this.f12906h > this.f12904f || m1110g()) {
                this.f12911m.submit(this.f12912n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m1110g() {
        return this.f12909k >= 2000 && this.f12909k >= this.f12908j.size();
    }

    /* renamed from: c */
    public synchronized boolean m1119c(String str) {
        boolean z;
        synchronized (this) {
            m1109h();
            m1113e(str);
            C3944b c3944b = this.f12908j.get(str);
            if (c3944b == null || c3944b.f12922e != null) {
                z = false;
            } else {
                for (int i = 0; i < this.f12905g; i++) {
                    File m1100a = c3944b.m1100a(i);
                    if (!m1100a.delete()) {
                        throw new IOException("failed to delete " + m1100a);
                    }
                    this.f12906h -= c3944b.f12920c[i];
                    c3944b.f12920c[i] = 0;
                }
                this.f12909k++;
                this.f12907i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f12908j.remove(str);
                if (m1110g()) {
                    this.f12911m.submit(this.f12912n);
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m1137a() {
        return this.f12907i == null;
    }

    /* renamed from: h */
    private void m1109h() {
        if (this.f12907i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public synchronized void m1125b() {
        m1109h();
        m1108i();
        this.f12907i.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f12907i != null) {
            Iterator it = new ArrayList(this.f12908j.values()).iterator();
            while (it.hasNext()) {
                C3944b c3944b = (C3944b) it.next();
                if (c3944b.f12922e != null) {
                    c3944b.f12922e.m1102b();
                }
            }
            m1108i();
            this.f12907i.close();
            this.f12907i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m1108i() {
        while (this.f12906h > this.f12904f) {
            m1119c(this.f12908j.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: c */
    public void m1121c() {
        close();
        m1131a(this.f12900b);
    }

    /* renamed from: e */
    private void m1113e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$c */
    /* loaded from: classes.dex */
    public final class C3945c implements Closeable {

        /* renamed from: b */
        private final String f12925b;

        /* renamed from: c */
        private final long f12926c;

        /* renamed from: d */
        private final InputStream[] f12927d;

        private C3945c(String str, long j, InputStream[] inputStreamArr) {
            this.f12925b = str;
            this.f12926c = j;
            this.f12927d = inputStreamArr;
        }

        /* renamed from: a */
        public InputStream m1087a(int i) {
            return this.f12927d[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f12927d) {
                C3940b.m1132a((Closeable) inputStream);
            }
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$a */
    /* loaded from: classes.dex */
    public final class C3942a {

        /* renamed from: b */
        private final C3944b f12915b;

        /* renamed from: c */
        private boolean f12916c;

        private C3942a(C3944b c3944b) {
            this.f12915b = c3944b;
        }

        /* renamed from: a */
        public OutputStream m1105a(int i) {
            C3943a c3943a;
            synchronized (C3940b.this) {
                if (this.f12915b.f12922e != this) {
                    throw new IllegalStateException();
                }
                c3943a = new C3943a(new FileOutputStream(this.f12915b.m1093b(i)));
            }
            return c3943a;
        }

        /* renamed from: a */
        public void m1106a() {
            if (this.f12916c) {
                C3940b.this.m1136a(this, false);
                C3940b.this.m1119c(this.f12915b.f12919b);
                return;
            }
            C3940b.this.m1136a(this, true);
        }

        /* renamed from: b */
        public void m1102b() {
            C3940b.this.m1136a(this, false);
        }

        /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$a$a */
        /* loaded from: classes.dex */
        private class C3943a extends FilterOutputStream {
            private C3943a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    C3942a.this.f12916c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    C3942a.this.f12916c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    C3942a.this.f12916c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    C3942a.this.f12916c = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.b$b */
    /* loaded from: classes.dex */
    public final class C3944b {

        /* renamed from: b */
        private final String f12919b;

        /* renamed from: c */
        private final long[] f12920c;

        /* renamed from: d */
        private boolean f12921d;

        /* renamed from: e */
        private C3942a f12922e;

        /* renamed from: f */
        private long f12923f;

        private C3944b(String str) {
            this.f12919b = str;
            this.f12920c = new long[C3940b.this.f12905g];
        }

        /* renamed from: a */
        public String m1101a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f12920c) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m1094a(String[] strArr) {
            if (strArr.length != C3940b.this.f12905g) {
                throw m1091b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f12920c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException e) {
                    throw m1091b(strArr);
                }
            }
        }

        /* renamed from: b */
        private IOException m1091b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File m1100a(int i) {
            return new File(C3940b.this.f12900b, this.f12919b + "." + i);
        }

        /* renamed from: b */
        public File m1093b(int i) {
            return new File(C3940b.this.f12900b, this.f12919b + "." + i + ".tmp");
        }
    }
}
