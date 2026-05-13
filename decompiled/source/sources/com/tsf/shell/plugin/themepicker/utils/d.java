package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class d extends e {
    private b e;
    private File f;
    private boolean g;
    private final Object h;

    public d(Context context, int i, int i2) {
        super(context, i, i2);
        this.g = true;
        this.h = new Object();
        a(context);
    }

    private void a(Context context) {
        b(context);
        this.f = c.a(context, "http");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.f
    public void a() {
        super.a();
        j();
    }

    private void j() {
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
        synchronized (this.h) {
            if (c.a(this.f) > 10485760) {
                try {
                    this.e = b.a(this.f, 1, 1, 10485760L);
                    com.tsf.shell.plugin.themepicker.e.a("ImageFetcher", "HTTP cache initialized");
                } catch (IOException e) {
                    this.e = null;
                }
            }
            this.g = false;
            this.h.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.f
    public void b() {
        super.b();
        synchronized (this.h) {
            if (this.e != null && !this.e.a()) {
                try {
                    this.e.c();
                    com.tsf.shell.plugin.themepicker.e.a("ImageFetcher", "HTTP cache cleared");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.e.c("ImageFetcher", "clearCacheInternal - " + e);
                }
                this.e = null;
                this.g = true;
                j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.f
    public void c() {
        super.c();
        synchronized (this.h) {
            if (this.e != null) {
                try {
                    this.e.b();
                    com.tsf.shell.plugin.themepicker.e.a("ImageFetcher", "HTTP cache flushed");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.e.c("ImageFetcher", "flush - " + e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.f
    public void d() {
        super.d();
        synchronized (this.h) {
            if (this.e != null) {
                try {
                    if (!this.e.a()) {
                        this.e.close();
                        this.e = null;
                        com.tsf.shell.plugin.themepicker.e.a("ImageFetcher", "HTTP cache closed");
                    }
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.e.c("ImageFetcher", "closeCacheInternal - " + e);
                }
            }
        }
    }

    private void b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            com.tsf.shell.plugin.themepicker.e.c("ImageFetcher", "checkConnection - no connection found");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.tsf.shell.plugin.themepicker.utils.b] */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.tsf.shell.plugin.themepicker.utils.b] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.tsf.shell.plugin.themepicker.utils.b] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.d.a(java.lang.String):android.graphics.Bitmap");
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.e, com.tsf.shell.plugin.themepicker.utils.f
    protected Bitmap a(Object obj) {
        return a(String.valueOf(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: IOException -> 0x0080, TRY_LEAVE, TryCatch #7 {IOException -> 0x0080, blocks: (B:34:0x0077, B:36:0x007c), top: B:64:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            r3 = 0
            e()
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L98
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L98
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L98
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L98
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L9c
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L9c
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L9c
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L87 java.io.IOException -> La1
            r1 = 8192(0x2000, float:1.148E-41)
            r4.<init>(r10, r1)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> La1
        L21:
            int r1 = r2.read()     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L8d
            r3 = -1
            if (r1 == r3) goto L5b
            r4.write(r1)     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L8d
            goto L21
        L2c:
            r1 = move-exception
            r3 = r4
            r7 = r2
            r2 = r0
            r0 = r1
            r1 = r7
        L32:
            java.lang.String r4 = "ImageFetcher"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r5.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "Error in downloadBitmap - "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r0 = r5.append(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L94
            com.tsf.shell.plugin.themepicker.e.c(r4, r0)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L4f
            r2.disconnect()
        L4f:
            if (r3 == 0) goto L54
            r3.close()     // Catch: java.io.IOException -> L96
        L54:
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.io.IOException -> L96
        L59:
            r0 = 0
        L5a:
            return r0
        L5b:
            r1 = 1
            if (r0 == 0) goto L61
            r0.disconnect()
        L61:
            if (r4 == 0) goto L66
            r4.close()     // Catch: java.io.IOException -> La7
        L66:
            if (r2 == 0) goto L6b
            r2.close()     // Catch: java.io.IOException -> La7
        L6b:
            r0 = r1
            goto L5a
        L6d:
            r0 = move-exception
            r1 = r3
            r2 = r3
        L70:
            if (r2 == 0) goto L75
            r2.disconnect()
        L75:
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.io.IOException -> L80
        L7a:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.io.IOException -> L80
        L7f:
            throw r0
        L80:
            r1 = move-exception
            goto L7f
        L82:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r3
            goto L70
        L87:
            r1 = move-exception
            r7 = r1
            r1 = r2
            r2 = r0
            r0 = r7
            goto L70
        L8d:
            r1 = move-exception
            r3 = r4
            r7 = r2
            r2 = r0
            r0 = r1
            r1 = r7
            goto L70
        L94:
            r0 = move-exception
            goto L70
        L96:
            r0 = move-exception
            goto L59
        L98:
            r0 = move-exception
            r1 = r3
            r2 = r3
            goto L32
        L9c:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r3
            goto L32
        La1:
            r1 = move-exception
            r7 = r1
            r1 = r2
            r2 = r0
            r0 = r7
            goto L32
        La7:
            r0 = move-exception
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.utils.d.a(java.lang.String, java.io.OutputStream):boolean");
    }

    public static void e() {
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }
}
