package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.StatFs;
import com.flurry.android.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class l {
    private static final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    private g b;
    private android.support.v4.f.e c;
    private m d;
    private final Object e = new Object();
    private boolean f = true;
    private Set g;

    private l(m mVar) {
        a(mVar);
    }

    public static l a(android.support.v4.app.k kVar, m mVar) {
        n a2 = a(kVar);
        l lVar = (l) a2.a();
        if (lVar == null) {
            l lVar2 = new l(mVar);
            a2.a(lVar2);
            return lVar2;
        }
        return lVar;
    }

    private void a(m mVar) {
        this.d = mVar;
        if (this.d.f) {
            com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Memory cache created (size = " + this.d.a + ")");
            if (v.c()) {
                this.g = Collections.synchronizedSet(new HashSet());
            }
            this.c = new android.support.v4.f.e(this.d.a) { // from class: com.tsf.shell.plugin.themepicker.utils.l.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.f.e
                public void a(boolean z, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                    if (u.class.isInstance(bitmapDrawable)) {
                        ((u) bitmapDrawable).b(false);
                    } else if (v.c()) {
                        l.this.g.add(new SoftReference(bitmapDrawable.getBitmap()));
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.f.e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int b(String str, BitmapDrawable bitmapDrawable) {
                    int a2 = l.a(bitmapDrawable) / 1024;
                    if (a2 == 0) {
                        return 1;
                    }
                    return a2;
                }
            };
        }
        if (mVar.h) {
            a();
        }
    }

    public void a() {
        synchronized (this.e) {
            if (this.b == null || this.b.a()) {
                File file = this.d.c;
                if (this.d.g && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (a(file) > this.d.b) {
                        try {
                            this.b = g.a(file, 1, 1, this.d.b);
                            com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Disk cache initialized");
                        } catch (IOException e) {
                            this.d.c = null;
                            com.tsf.shell.plugin.themepicker.g.c("ImageCache", "initDiskCache - " + e);
                        }
                    }
                }
            }
            this.f = false;
            this.e.notifyAll();
        }
    }

    public void a(String str, BitmapDrawable bitmapDrawable) {
        if (str == null || bitmapDrawable == null) {
            return;
        }
        if (this.c != null) {
            if (u.class.isInstance(bitmapDrawable)) {
                ((u) bitmapDrawable).b(true);
            }
            this.c.a(str, bitmapDrawable);
        }
        synchronized (this.e) {
            if (this.b != null) {
                String c = c(str);
                OutputStream outputStream = null;
                try {
                    try {
                        try {
                            k a2 = this.b.a(c);
                            if (a2 == null) {
                                h b = this.b.b(c);
                                if (b != null) {
                                    outputStream = b.a(0);
                                    bitmapDrawable.getBitmap().compress(this.d.d, this.d.e, outputStream);
                                    b.a();
                                    outputStream.close();
                                }
                            } else {
                                a2.a(0).close();
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e) {
                                }
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                try {
                                    outputStream.close();
                                } catch (IOException e2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        com.tsf.shell.plugin.themepicker.g.c("ImageCache", "addBitmapToCache - " + e3);
                        if (0 != 0) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                    }
                } catch (Exception e5) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageCache", "addBitmapToCache - " + e5);
                    if (0 != 0) {
                        try {
                            outputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            }
        }
    }

    public BitmapDrawable a(String str) {
        BitmapDrawable bitmapDrawable = null;
        if (this.c != null) {
            bitmapDrawable = (BitmapDrawable) this.c.a(str);
        }
        if (bitmapDrawable != null) {
            com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Memory cache hit");
        }
        return bitmapDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tsf.shell.plugin.themepicker.utils.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public Bitmap b(String str) {
        InputStream inputStream;
        Bitmap bitmap = null;
        String c = c(str);
        synchronized (this.e) {
            while (this.f) {
                try {
                    this.e.wait();
                } catch (InterruptedException e) {
                }
            }
            ?? r2 = this.b;
            try {
                if (r2 != 0) {
                    try {
                        k a2 = this.b.a(c);
                        if (a2 != null) {
                            com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Disk cache hit");
                            inputStream = a2.a(0);
                            if (inputStream != null) {
                                try {
                                    bitmap = p.a(((FileInputStream) inputStream).getFD(), Integer.MAX_VALUE, Integer.MAX_VALUE, this);
                                } catch (IOException e2) {
                                    e = e2;
                                    com.tsf.shell.plugin.themepicker.g.c("ImageCache", "getBitmapFromDiskCache - " + e);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e3) {
                                        }
                                    }
                                    return bitmap;
                                }
                            }
                        } else {
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        inputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        r2 = 0;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException e6) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return bitmap;
    }

    protected Bitmap a(BitmapFactory.Options options) {
        Bitmap bitmap;
        if (this.g == null || this.g.isEmpty()) {
            return null;
        }
        synchronized (this.g) {
            Iterator it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bitmap = null;
                    break;
                }
                bitmap = (Bitmap) ((SoftReference) it.next()).get();
                if (bitmap != null && bitmap.isMutable()) {
                    if (a(bitmap, options)) {
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

    public void b() {
        if (this.c != null) {
            this.c.a();
            com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Memory cache cleared");
        }
        synchronized (this.e) {
            this.f = true;
            if (this.b != null && !this.b.a()) {
                try {
                    this.b.c();
                    com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Disk cache cleared");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageCache", "clearCache - " + e);
                }
                this.b = null;
                a();
            }
        }
    }

    public void c() {
        synchronized (this.e) {
            if (this.b != null) {
                try {
                    this.b.b();
                    com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Disk cache flushed");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageCache", "flush - " + e);
                }
            }
        }
    }

    public void d() {
        synchronized (this.e) {
            if (this.b != null) {
                try {
                    if (!this.b.a()) {
                        this.b.close();
                        this.b = null;
                        com.tsf.shell.plugin.themepicker.g.a("ImageCache", "Disk cache closed");
                    }
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageCache", "close - " + e);
                }
            }
        }
    }

    @TargetApi(19)
    private static boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        return !v.f() ? bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight && options.inSampleSize == 1 : ((options.outWidth / options.inSampleSize) * (options.outHeight / options.inSampleSize)) * a(bitmap.getConfig()) <= bitmap.getAllocationByteCount();
    }

    private static int a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            return 4;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.ALPHA_8 ? 1 : 1;
    }

    public static File a(Context context, String str) {
        return new File(String.valueOf(("mounted".equals(Environment.getExternalStorageState()) || !e()) ? a(context).getPath() : context.getCacheDir().getPath()) + File.separator + str);
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            return String.valueOf(str.hashCode());
        }
    }

    private static String a(byte[] bArr) {
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
    public static int a(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (v.f()) {
            return bitmap.getAllocationByteCount();
        }
        if (v.d()) {
            return bitmap.getByteCount();
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @TargetApi(9)
    public static boolean e() {
        if (v.b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    @TargetApi(8)
    public static File a(Context context) {
        if (v.a()) {
            return context.getExternalCacheDir();
        }
        return new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    @TargetApi(9)
    public static long a(File file) {
        if (v.b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static n a(android.support.v4.app.k kVar) {
        n nVar = (n) kVar.a("ImageCache");
        if (nVar == null) {
            n nVar2 = new n();
            kVar.a().a(nVar2, "ImageCache").b();
            return nVar2;
        }
        return nVar;
    }
}
