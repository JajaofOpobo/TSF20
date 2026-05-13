package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.p009d.C0166f;
import com.flurry.android.Constants;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.utils.C3940b;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* renamed from: com.tsf.shell.plugin.themepicker.utils.c */
/* loaded from: classes.dex */
public class C3946c {

    /* renamed from: a */
    private static final Bitmap.CompressFormat f12928a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    private C3940b f12929b;

    /* renamed from: c */
    private C0166f<String, BitmapDrawable> f12930c;

    /* renamed from: d */
    private C3948a f12931d;

    /* renamed from: e */
    private final Object f12932e = new Object();

    /* renamed from: f */
    private boolean f12933f = true;

    /* renamed from: g */
    private Set<SoftReference<Bitmap>> f12934g;

    private C3946c(C3948a c3948a) {
        m1077a(c3948a);
    }

    /* renamed from: a */
    public static C3946c m1078a(AbstractC0094o abstractC0094o, C3948a c3948a) {
        C3949b m1079a = m1079a(abstractC0094o);
        C3946c c3946c = (C3946c) m1079a.m1058a();
        if (c3946c == null) {
            C3946c c3946c2 = new C3946c(c3948a);
            m1079a.m1057a(c3946c2);
            return c3946c2;
        }
        return c3946c;
    }

    /* renamed from: a */
    private void m1077a(C3948a c3948a) {
        this.f12931d = c3948a;
        if (this.f12931d.f12941f) {
            C3851e.m1318a("ImageCache", "Memory cache created (size = " + this.f12931d.f12936a + ")");
            if (C3957h.m1007c()) {
                this.f12934g = Collections.synchronizedSet(new HashSet());
            }
            this.f12930c = new C0166f<String, BitmapDrawable>(this.f12931d.f12936a) { // from class: com.tsf.shell.plugin.themepicker.utils.c.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.p002v4.p009d.C0166f
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo1062a(boolean z, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                    if (C3956g.class.isInstance(bitmapDrawable)) {
                        ((C3956g) bitmapDrawable).m1010b(false);
                    } else if (C3957h.m1007c()) {
                        C3946c.this.f12934g.add(new SoftReference(bitmapDrawable.getBitmap()));
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.p002v4.p009d.C0166f
                /* renamed from: a */
                public int mo1060b(String str, BitmapDrawable bitmapDrawable) {
                    int m1080a = C3946c.m1080a(bitmapDrawable) / 1024;
                    if (m1080a == 0) {
                        return 1;
                    }
                    return m1080a;
                }
            };
        }
        if (c3948a.f12943h) {
            m1086a();
        }
    }

    /* renamed from: a */
    public void m1086a() {
        synchronized (this.f12932e) {
            if (this.f12929b == null || this.f12929b.m1137a()) {
                File file = this.f12931d.f12938c;
                if (this.f12931d.f12942g && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (m1075a(file) > this.f12931d.f12937b) {
                        try {
                            this.f12929b = C3940b.m1130a(file, 1, 1, this.f12931d.f12937b);
                            C3851e.m1318a("ImageCache", "Disk cache initialized");
                        } catch (IOException e) {
                            this.f12931d.f12938c = null;
                            C3851e.m1315c("ImageCache", "initDiskCache - " + e);
                        }
                    }
                }
            }
            this.f12933f = false;
            this.f12932e.notifyAll();
        }
    }

    /* renamed from: a */
    public void m1073a(String str, BitmapDrawable bitmapDrawable) {
        OutputStream outputStream;
        Throwable th;
        Exception exc;
        IOException iOException;
        if (str == null || bitmapDrawable == null) {
            return;
        }
        if (this.f12930c != null) {
            if (C3956g.class.isInstance(bitmapDrawable)) {
                ((C3956g) bitmapDrawable).m1010b(true);
            }
            this.f12930c.m13357a(str, bitmapDrawable);
        }
        synchronized (this.f12932e) {
            if (this.f12929b != null) {
                String m1067c = m1067c(str);
                OutputStream outputStream2 = null;
                try {
                    try {
                        C3940b.C3945c m1128a = this.f12929b.m1128a(m1067c);
                        if (m1128a == null) {
                            C3940b.C3942a m1122b = this.f12929b.m1122b(m1067c);
                            if (m1122b != null) {
                                outputStream2 = m1122b.m1105a(0);
                                try {
                                    bitmapDrawable.getBitmap().compress(this.f12931d.f12939d, this.f12931d.f12940e, outputStream2);
                                    m1122b.m1106a();
                                    outputStream2.close();
                                } catch (IOException e) {
                                    outputStream = outputStream2;
                                    iOException = e;
                                    C3851e.m1315c("ImageCache", "addBitmapToCache - " + iOException);
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                } catch (Exception e3) {
                                    outputStream = outputStream2;
                                    exc = e3;
                                    C3851e.m1315c("ImageCache", "addBitmapToCache - " + exc);
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e4) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    outputStream = outputStream2;
                                    th = th2;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e5) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            m1128a.m1087a(0).close();
                        }
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e6) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e7) {
                    outputStream = null;
                    iOException = e7;
                } catch (Exception e8) {
                    outputStream = null;
                    exc = e8;
                } catch (Throwable th4) {
                    outputStream = null;
                    th = th4;
                }
            }
        }
    }

    /* renamed from: a */
    public BitmapDrawable m1074a(String str) {
        BitmapDrawable bitmapDrawable = null;
        if (this.f12930c != null) {
            bitmapDrawable = this.f12930c.m13358a((C0166f<String, BitmapDrawable>) str);
        }
        if (bitmapDrawable != null) {
            C3851e.m1318a("ImageCache", "Memory cache hit");
        }
        return bitmapDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap m1069b(java.lang.String r9) {
        /*
            r8 = this;
            r3 = 0
            java.lang.String r1 = m1067c(r9)
            java.lang.Object r4 = r8.f12932e
            monitor-enter(r4)
        L8:
            boolean r2 = r8.f12933f     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L14
            java.lang.Object r2 = r8.f12932e     // Catch: java.lang.InterruptedException -> L12 java.lang.Throwable -> L71
            r2.wait()     // Catch: java.lang.InterruptedException -> L12 java.lang.Throwable -> L71
            goto L8
        L12:
            r2 = move-exception
            goto L8
        L14:
            com.tsf.shell.plugin.themepicker.utils.b r2 = r8.f12929b     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L45
            com.tsf.shell.plugin.themepicker.utils.b r2 = r8.f12929b     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            com.tsf.shell.plugin.themepicker.utils.b$c r1 = r2.m1128a(r1)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            if (r1 == 0) goto L7c
            java.lang.String r2 = "ImageCache"
            java.lang.String r5 = "Disk cache hit"
            com.tsf.shell.plugin.themepicker.C3851e.m1318a(r2, r5)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            r2 = 0
            java.io.InputStream r2 = r1.m1087a(r2)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            if (r2 == 0) goto L40
            r0 = r2
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r1 = r0
            java.io.FileDescriptor r1 = r1.getFD()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Bitmap r3 = com.tsf.shell.plugin.themepicker.utils.C3951e.m1046a(r1, r5, r6, r8)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
        L40:
            if (r2 == 0) goto L45
            r2.close()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74
        L45:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return r3
        L47:
            r1 = move-exception
            r2 = r3
        L49:
            java.lang.String r5 = "ImageCache"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = "getBitmapFromDiskCache - "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = r6.append(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            com.tsf.shell.plugin.themepicker.C3851e.m1315c(r5, r1)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L45
            r2.close()     // Catch: java.io.IOException -> L67 java.lang.Throwable -> L71
            goto L45
        L67:
            r1 = move-exception
            goto L45
        L69:
            r1 = move-exception
            r2 = r3
        L6b:
            if (r2 == 0) goto L70
            r2.close()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L76
        L70:
            throw r1     // Catch: java.lang.Throwable -> L71
        L71:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r1
        L74:
            r1 = move-exception
            goto L45
        L76:
            r2 = move-exception
            goto L70
        L78:
            r1 = move-exception
            goto L6b
        L7a:
            r1 = move-exception
            goto L49
        L7c:
            r2 = r3
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.C3946c.m1069b(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap m1081a(BitmapFactory.Options options) {
        Bitmap bitmap;
        if (this.f12934g == null || this.f12934g.isEmpty()) {
            return null;
        }
        synchronized (this.f12934g) {
            Iterator<SoftReference<Bitmap>> it = this.f12934g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bitmap = null;
                    break;
                }
                bitmap = it.next().get();
                if (bitmap != null && bitmap.isMutable()) {
                    if (m1082a(bitmap, options)) {
                        it.remove();
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public void m1071b() {
        if (this.f12930c != null) {
            this.f12930c.m13360a();
            C3851e.m1318a("ImageCache", "Memory cache cleared");
        }
        synchronized (this.f12932e) {
            this.f12933f = true;
            if (this.f12929b != null && !this.f12929b.m1137a()) {
                try {
                    this.f12929b.m1121c();
                    C3851e.m1318a("ImageCache", "Disk cache cleared");
                } catch (IOException e) {
                    C3851e.m1315c("ImageCache", "clearCache - " + e);
                }
                this.f12929b = null;
                m1086a();
            }
        }
    }

    /* renamed from: c */
    public void m1068c() {
        synchronized (this.f12932e) {
            if (this.f12929b != null) {
                try {
                    this.f12929b.m1125b();
                    C3851e.m1318a("ImageCache", "Disk cache flushed");
                } catch (IOException e) {
                    C3851e.m1315c("ImageCache", "flush - " + e);
                }
            }
        }
    }

    /* renamed from: d */
    public void m1066d() {
        synchronized (this.f12932e) {
            if (this.f12929b != null) {
                try {
                    if (!this.f12929b.m1137a()) {
                        this.f12929b.close();
                        this.f12929b = null;
                        C3851e.m1318a("ImageCache", "Disk cache closed");
                    }
                } catch (IOException e) {
                    C3851e.m1315c("ImageCache", "close - " + e);
                }
            }
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.c$a */
    /* loaded from: classes.dex */
    public static class C3948a {

        /* renamed from: c */
        public File f12938c;

        /* renamed from: a */
        public int f12936a = 5120;

        /* renamed from: b */
        public int f12937b = 10485760;

        /* renamed from: d */
        public Bitmap.CompressFormat f12939d = C3946c.f12928a;

        /* renamed from: e */
        public int f12940e = 70;

        /* renamed from: f */
        public boolean f12941f = true;

        /* renamed from: g */
        public boolean f12942g = true;

        /* renamed from: h */
        public boolean f12943h = false;

        public C3948a(Context context, String str) {
            this.f12938c = C3946c.m1084a(context, str);
        }

        /* renamed from: a */
        public void m1059a(float f) {
            if (f < 0.01f || f > 0.8f) {
                throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
            }
            this.f12936a = Math.round((((float) Runtime.getRuntime().maxMemory()) * f) / 1024.0f);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m1082a(Bitmap bitmap, BitmapFactory.Options options) {
        return !C3957h.m1004f() ? bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight && options.inSampleSize == 1 : ((options.outWidth / options.inSampleSize) * (options.outHeight / options.inSampleSize)) * m1083a(bitmap.getConfig()) <= bitmap.getAllocationByteCount();
    }

    /* renamed from: a */
    private static int m1083a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            return 4;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.ALPHA_8 ? 1 : 1;
    }

    /* renamed from: a */
    public static File m1084a(Context context, String str) {
        return new File((("mounted".equals(Environment.getExternalStorageState()) || !m1065e()) ? m1085a(context).getPath() : context.getCacheDir().getPath()) + File.separator + str);
    }

    /* renamed from: c */
    public static String m1067c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m1072a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            return String.valueOf(str.hashCode());
        }
    }

    /* renamed from: a */
    private static String m1072a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & Constants.UNKNOWN);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m1080a(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (C3957h.m1004f()) {
            return bitmap.getAllocationByteCount();
        }
        if (C3957h.m1006d()) {
            return bitmap.getByteCount();
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @TargetApi(9)
    /* renamed from: e */
    public static boolean m1065e() {
        if (C3957h.m1008b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    @TargetApi(8)
    /* renamed from: a */
    public static File m1085a(Context context) {
        if (C3957h.m1009a()) {
            return context.getExternalCacheDir();
        }
        return new File(m1070b(context).getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    /* renamed from: b */
    public static File m1070b(Context context) {
        File file;
        try {
            if (Build.VERSION.SDK_INT > 7) {
                file = context.getExternalFilesDir(null);
            } else {
                file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/files");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            return file;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @TargetApi(9)
    /* renamed from: a */
    public static long m1075a(File file) {
        if (C3957h.m1008b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    /* renamed from: a */
    private static C3949b m1079a(AbstractC0094o abstractC0094o) {
        C3949b c3949b = (C3949b) abstractC0094o.mo13542a("ImageCache");
        if (c3949b == null) {
            C3949b c3949b2 = new C3949b();
            abstractC0094o.mo13569a().mo13494a(c3949b2, "ImageCache").mo13493b();
            return c3949b2;
        }
        return c3949b;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.c$b */
    /* loaded from: classes.dex */
    public static class C3949b extends Fragment {

        /* renamed from: a */
        private Object f12944a;

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
            m13755c(true);
        }

        /* renamed from: a */
        public void m1057a(Object obj) {
            this.f12944a = obj;
        }

        /* renamed from: a */
        public Object m1058a() {
            return this.f12944a;
        }
    }
}
