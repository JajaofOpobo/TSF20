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
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import com.flurry.android.Constants;
import com.tsf.shell.plugin.themepicker.utils.b;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    private com.tsf.shell.plugin.themepicker.utils.b b;
    private android.support.v4.d.f<String, BitmapDrawable> c;
    private a d;
    private final Object e = new Object();
    private boolean f = true;
    private Set<SoftReference<Bitmap>> g;

    private c(a aVar) {
        a(aVar);
    }

    public static c a(o oVar, a aVar) {
        b bVarA = a(oVar);
        c cVar = (c) bVarA.a();
        if (cVar == null) {
            c cVar2 = new c(aVar);
            bVarA.a(cVar2);
            return cVar2;
        }
        return cVar;
    }

    private void a(a aVar) {
        this.d = aVar;
        if (this.d.f) {
            com.tsf.shell.plugin.themepicker.e.a("ImageCache", "Memory cache created (size = " + this.d.a + ")");
            if (h.c()) {
                this.g = Collections.synchronizedSet(new HashSet());
            }
            this.c = new android.support.v4.d.f<String, BitmapDrawable>(this.d.a) { // from class: com.tsf.shell.plugin.themepicker.utils.c.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.d.f
                public void a(boolean z, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                    if (g.class.isInstance(bitmapDrawable)) {
                        ((g) bitmapDrawable).b(false);
                    } else if (h.c()) {
                        c.this.g.add(new SoftReference(bitmapDrawable.getBitmap()));
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v4.d.f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int b(String str, BitmapDrawable bitmapDrawable) {
                    int iA = c.a(bitmapDrawable) / 1024;
                    if (iA == 0) {
                        return 1;
                    }
                    return iA;
                }
            };
        }
        if (aVar.h) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            java.lang.Object r1 = r6.e
            monitor-enter(r1)
            com.tsf.shell.plugin.themepicker.utils.b r0 = r6.b     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto Lf
            com.tsf.shell.plugin.themepicker.utils.b r0 = r6.b     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L45
        Lf:
            com.tsf.shell.plugin.themepicker.utils.c$a r0 = r6.d     // Catch: java.lang.Throwable -> L6e
            java.io.File r0 = r0.c     // Catch: java.lang.Throwable -> L6e
            com.tsf.shell.plugin.themepicker.utils.c$a r2 = r6.d     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r2.g     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L45
            if (r0 == 0) goto L45
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L24
            r0.mkdirs()     // Catch: java.lang.Throwable -> L6e
        L24:
            long r2 = a(r0)     // Catch: java.lang.Throwable -> L6e
            com.tsf.shell.plugin.themepicker.utils.c$a r4 = r6.d     // Catch: java.lang.Throwable -> L6e
            int r4 = r4.b     // Catch: java.lang.Throwable -> L6e
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L45
            r2 = 1
            r3 = 1
            com.tsf.shell.plugin.themepicker.utils.c$a r4 = r6.d     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
            int r4 = r4.b     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
            long r4 = (long) r4     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
            com.tsf.shell.plugin.themepicker.utils.b r0 = com.tsf.shell.plugin.themepicker.utils.b.a(r0, r2, r3, r4)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
            r6.b = r0     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
            java.lang.String r0 = "ImageCache"
            java.lang.String r2 = "Disk cache initialized"
            com.tsf.shell.plugin.themepicker.e.a(r0, r2)     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L6e
        L45:
            r0 = 0
            r6.f = r0     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r6.e     // Catch: java.lang.Throwable -> L6e
            r0.notifyAll()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            return
        L4f:
            r0 = move-exception
            com.tsf.shell.plugin.themepicker.utils.c$a r2 = r6.d     // Catch: java.lang.Throwable -> L6e
            r3 = 0
            r2.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "ImageCache"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "initDiskCache - "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6e
            com.tsf.shell.plugin.themepicker.e.c(r2, r0)     // Catch: java.lang.Throwable -> L6e
            goto L45
        L6e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.c.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tsf.shell.plugin.themepicker.utils.b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.tsf.shell.plugin.themepicker.utils.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, BitmapDrawable bitmapDrawable) {
        Throwable th;
        Exception exc;
        IOException iOException;
        if (str == null || bitmapDrawable == null) {
            return;
        }
        if (this.c != null) {
            if (g.class.isInstance(bitmapDrawable)) {
                ((g) bitmapDrawable).b(true);
            }
            this.c.a(str, bitmapDrawable);
        }
        synchronized (this.e) {
            if (this.b != null) {
                ?? C = c(str);
                OutputStream outputStreamA = null;
                try {
                    try {
                        b.c cVarA = this.b.a(C);
                        if (cVarA == null) {
                            b.a aVarB = this.b.b(C);
                            if (aVarB != null) {
                                outputStreamA = aVarB.a(0);
                                try {
                                    bitmapDrawable.getBitmap().compress(this.d.d, this.d.e, outputStreamA);
                                    aVarB.a();
                                    outputStreamA.close();
                                } catch (IOException e) {
                                    C = outputStreamA;
                                    iOException = e;
                                    com.tsf.shell.plugin.themepicker.e.c("ImageCache", "addBitmapToCache - " + iOException);
                                    if (C != 0) {
                                        try {
                                            C.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                } catch (Exception e3) {
                                    C = outputStreamA;
                                    exc = e3;
                                    com.tsf.shell.plugin.themepicker.e.c("ImageCache", "addBitmapToCache - " + exc);
                                    if (C != 0) {
                                        try {
                                            C.close();
                                        } catch (IOException e4) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    C = outputStreamA;
                                    th = th2;
                                    if (C != 0) {
                                        try {
                                            C.close();
                                        } catch (IOException e5) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            cVarA.a(0).close();
                        }
                        if (outputStreamA != null) {
                            try {
                                outputStreamA.close();
                            } catch (IOException e6) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e7) {
                    C = 0;
                    iOException = e7;
                } catch (Exception e8) {
                    C = 0;
                    exc = e8;
                } catch (Throwable th4) {
                    C = 0;
                    th = th4;
                }
            }
        }
    }

    public BitmapDrawable a(String str) {
        BitmapDrawable bitmapDrawableA = null;
        if (this.c != null) {
            bitmapDrawableA = this.c.a(str);
        }
        if (bitmapDrawableA != null) {
            com.tsf.shell.plugin.themepicker.e.a("ImageCache", "Memory cache hit");
        }
        return bitmapDrawableA;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap b(java.lang.String r9) {
        /*
            r8 = this;
            r3 = 0
            java.lang.String r1 = c(r9)
            java.lang.Object r4 = r8.e
            monitor-enter(r4)
        L8:
            boolean r2 = r8.f     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L14
            java.lang.Object r2 = r8.e     // Catch: java.lang.InterruptedException -> L12 java.lang.Throwable -> L71
            r2.wait()     // Catch: java.lang.InterruptedException -> L12 java.lang.Throwable -> L71
            goto L8
        L12:
            r2 = move-exception
            goto L8
        L14:
            com.tsf.shell.plugin.themepicker.utils.b r2 = r8.b     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L45
            com.tsf.shell.plugin.themepicker.utils.b r2 = r8.b     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            com.tsf.shell.plugin.themepicker.utils.b$c r1 = r2.a(r1)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            if (r1 == 0) goto L7c
            java.lang.String r2 = "ImageCache"
            java.lang.String r5 = "Disk cache hit"
            com.tsf.shell.plugin.themepicker.e.a(r2, r5)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            r2 = 0
            java.io.InputStream r2 = r1.a(r2)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L69
            if (r2 == 0) goto L40
            r0 = r2
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r1 = r0
            java.io.FileDescriptor r1 = r1.getFD()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Bitmap r3 = com.tsf.shell.plugin.themepicker.utils.e.a(r1, r5, r6, r8)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
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
            com.tsf.shell.plugin.themepicker.e.c(r5, r1)     // Catch: java.lang.Throwable -> L78
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.c.b(java.lang.String):android.graphics.Bitmap");
    }

    protected Bitmap a(BitmapFactory.Options options) {
        Bitmap bitmap;
        if (this.g == null || this.g.isEmpty()) {
            return null;
        }
        synchronized (this.g) {
            Iterator<SoftReference<Bitmap>> it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bitmap = null;
                    break;
                }
                bitmap = it.next().get();
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
            com.tsf.shell.plugin.themepicker.e.a("ImageCache", "Memory cache cleared");
        }
        synchronized (this.e) {
            this.f = true;
            if (this.b != null && !this.b.a()) {
                try {
                    this.b.c();
                    com.tsf.shell.plugin.themepicker.e.a("ImageCache", "Disk cache cleared");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.e.c("ImageCache", "clearCache - " + e);
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
                    com.tsf.shell.plugin.themepicker.e.a("ImageCache", "Disk cache flushed");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.e.c("ImageCache", "flush - " + e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[Catch: all -> 0x003a, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:9:0x001e, B:12:0x0021), top: B:16:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.lang.Object r1 = r5.e
            monitor-enter(r1)
            com.tsf.shell.plugin.themepicker.utils.b r0 = r5.b     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L1e
            com.tsf.shell.plugin.themepicker.utils.b r0 = r5.b     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
            boolean r0 = r0.a()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
            if (r0 != 0) goto L1e
            com.tsf.shell.plugin.themepicker.utils.b r0 = r5.b     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
            r0.close()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
            r0 = 0
            r5.b = r0     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
            java.lang.String r0 = "ImageCache"
            java.lang.String r2 = "Disk cache closed"
            com.tsf.shell.plugin.themepicker.e.a(r0, r2)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L3a
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            return
        L20:
            r0 = move-exception
            java.lang.String r2 = "ImageCache"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "close - "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            com.tsf.shell.plugin.themepicker.e.c(r2, r0)     // Catch: java.lang.Throwable -> L3a
            goto L1e
        L3a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.c.d():void");
    }

    public static class a {
        public File c;
        public int a = 5120;
        public int b = 10485760;
        public Bitmap.CompressFormat d = c.a;
        public int e = 70;
        public boolean f = true;
        public boolean g = true;
        public boolean h = false;

        public a(Context context, String str) {
            this.c = c.a(context, str);
        }

        public void a(float f) {
            if (f < 0.01f || f > 0.8f) {
                throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
            }
            this.a = Math.round((Runtime.getRuntime().maxMemory() * f) / 1024.0f);
        }
    }

    @TargetApi(19)
    private static boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        return !h.f() ? bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight && options.inSampleSize == 1 : ((options.outWidth / options.inSampleSize) * (options.outHeight / options.inSampleSize)) * a(bitmap.getConfig()) <= bitmap.getAllocationByteCount();
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
        return new File((("mounted".equals(Environment.getExternalStorageState()) || !e()) ? a(context).getPath() : context.getCacheDir().getPath()) + File.separator + str);
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
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & Constants.UNKNOWN);
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
        if (h.f()) {
            return bitmap.getAllocationByteCount();
        }
        if (h.d()) {
            return bitmap.getByteCount();
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    @TargetApi(9)
    public static boolean e() {
        if (h.b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    @TargetApi(8)
    public static File a(Context context) {
        if (h.a()) {
            return context.getExternalCacheDir();
        }
        return new File(b(context).getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    public static File b(Context context) {
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
    public static long a(File file) {
        if (h.b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    private static b a(o oVar) {
        b bVar = (b) oVar.a("ImageCache");
        if (bVar == null) {
            b bVar2 = new b();
            oVar.a().a(bVar2, "ImageCache").b();
            return bVar2;
        }
        return bVar;
    }

    public static class b extends Fragment {
        private Object a;

        @Override // android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
            c(true);
        }

        public void a(Object obj) {
            this.a = obj;
        }

        public Object a() {
            return this.a;
        }
    }
}
