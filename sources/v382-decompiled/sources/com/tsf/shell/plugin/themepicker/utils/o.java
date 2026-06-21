package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class o extends p {
    private g e;
    private File f;
    private boolean g;
    private final Object h;

    public o(Context context, int i, int i2) {
        super(context, i, i2);
        this.g = true;
        this.h = new Object();
        a(context);
    }

    private void a(Context context) {
        b(context);
        this.f = l.a(context, "http");
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
    protected void a() {
        super.a();
        j();
    }

    private void j() {
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
        synchronized (this.h) {
            if (l.a(this.f) > 10485760) {
                try {
                    this.e = g.a(this.f, 1, 1, 10485760L);
                    com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "HTTP cache initialized");
                } catch (IOException e) {
                    this.e = null;
                }
            }
            this.g = false;
            this.h.notifyAll();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
    protected void b() {
        super.b();
        synchronized (this.h) {
            if (this.e != null && !this.e.a()) {
                try {
                    this.e.c();
                    com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "HTTP cache cleared");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "clearCacheInternal - " + e);
                }
                this.e = null;
                this.g = true;
                j();
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
    protected void c() {
        super.c();
        synchronized (this.h) {
            if (this.e != null) {
                try {
                    this.e.b();
                    com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "HTTP cache flushed");
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "flush - " + e);
                }
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
    protected void d() {
        super.d();
        synchronized (this.h) {
            if (this.e != null) {
                try {
                    if (!this.e.a()) {
                        this.e.close();
                        this.e = null;
                        com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "HTTP cache closed");
                    }
                } catch (IOException e) {
                    com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "closeCacheInternal - " + e);
                }
            }
        }
    }

    private void b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "checkConnection - no connection found");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.tsf.shell.plugin.themepicker.utils.g] */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.tsf.shell.plugin.themepicker.utils.g] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.tsf.shell.plugin.themepicker.utils.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap a(String str) {
        FileDescriptor fileDescriptor;
        com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "processBitmap - " + str);
        ?? c = l.c(str);
        synchronized (this.h) {
            while (this.g) {
                try {
                    this.h.wait();
                } catch (InterruptedException e) {
                }
            }
            try {
                if (this.e != null) {
                    try {
                        k a = this.e.a(c);
                        if (a == null) {
                            com.tsf.shell.plugin.themepicker.g.a("ImageFetcher", "processBitmap, not found in http cache, downloading...");
                            h b = this.e.b(c);
                            if (b != null) {
                                if (a(str, b.a(0))) {
                                    b.a();
                                } else {
                                    b.b();
                                }
                            }
                            a = this.e.a(c);
                        }
                        if (a != null) {
                            FileInputStream fileInputStream = (FileInputStream) a.a(0);
                            try {
                                fileDescriptor = fileInputStream.getFD();
                                c = fileInputStream;
                            } catch (IOException e2) {
                                c = fileInputStream;
                                e = e2;
                                com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "processBitmap - " + e);
                                c = c;
                                c = c;
                                if (0 == 0 && c != 0) {
                                    try {
                                        c.close();
                                        fileDescriptor = null;
                                    } catch (IOException e3) {
                                        fileDescriptor = null;
                                    }
                                    if (fileDescriptor != null) {
                                    }
                                    if (c != 0) {
                                    }
                                    return r2;
                                }
                                fileDescriptor = null;
                                if (fileDescriptor != null) {
                                }
                                if (c != 0) {
                                }
                                return r2;
                            } catch (IllegalStateException e4) {
                                c = fileInputStream;
                                e = e4;
                                com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "processBitmap - " + e);
                                c = c;
                                c = c;
                                if (0 == 0 && c != 0) {
                                    try {
                                        c.close();
                                        fileDescriptor = null;
                                    } catch (IOException e5) {
                                        fileDescriptor = null;
                                    }
                                    if (fileDescriptor != null) {
                                    }
                                    if (c != 0) {
                                    }
                                    return r2;
                                }
                                fileDescriptor = null;
                                if (fileDescriptor != null) {
                                }
                                if (c != 0) {
                                }
                                return r2;
                            } catch (Throwable th) {
                                c = fileInputStream;
                                th = th;
                                if (0 == 0 && c != 0) {
                                    try {
                                        c.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            c = 0;
                            fileDescriptor = null;
                        }
                        if (fileDescriptor == null && c != 0) {
                            try {
                                c.close();
                            } catch (IOException e7) {
                            }
                        }
                    } catch (IOException e8) {
                        e = e8;
                        c = 0;
                    } catch (IllegalStateException e9) {
                        e = e9;
                        c = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        c = 0;
                    }
                } else {
                    c = 0;
                    fileDescriptor = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Bitmap a2 = fileDescriptor != null ? a(fileDescriptor, this.a, this.b, f()) : null;
        if (c != 0) {
            try {
                c.close();
            } catch (IOException e10) {
            }
        }
        return a2;
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.p, com.tsf.shell.plugin.themepicker.utils.q
    protected Bitmap a(Object obj) {
        return a(String.valueOf(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[Catch: IOException -> 0x007b, TRY_LEAVE, TryCatch #10 {IOException -> 0x007b, blocks: (B:53:0x0072, B:48:0x0077), top: B:52:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        r3 = null;
        r3 = null;
        bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        e();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                BufferedInputStream bufferedInputStream3 = new BufferedInputStream(httpURLConnection2.getInputStream(), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream, ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
                    while (true) {
                        try {
                            int read = bufferedInputStream3.read();
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(read);
                        } catch (IOException e) {
                            bufferedOutputStream2 = bufferedOutputStream;
                            httpURLConnection = httpURLConnection2;
                            e = e;
                            bufferedInputStream = bufferedInputStream3;
                            try {
                                com.tsf.shell.plugin.themepicker.g.c("ImageFetcher", "Error in downloadBitmap - " + e);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.close();
                                    } catch (IOException e2) {
                                        return false;
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                bufferedInputStream2 = bufferedInputStream;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e3) {
                                        throw th;
                                    }
                                }
                                if (bufferedInputStream2 != null) {
                                    bufferedInputStream2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            bufferedInputStream2 = bufferedInputStream3;
                            httpURLConnection = httpURLConnection2;
                            th = th2;
                            if (httpURLConnection != null) {
                            }
                            if (bufferedOutputStream != null) {
                            }
                            if (bufferedInputStream2 != null) {
                            }
                            throw th;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    if (bufferedInputStream3 != null) {
                        bufferedInputStream3.close();
                    }
                    return true;
                } catch (IOException e5) {
                    bufferedInputStream = bufferedInputStream3;
                    httpURLConnection = httpURLConnection2;
                    e = e5;
                } catch (Throwable th3) {
                    bufferedOutputStream = null;
                    bufferedInputStream2 = bufferedInputStream3;
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                }
            } catch (IOException e6) {
                httpURLConnection = httpURLConnection2;
                e = e6;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                bufferedOutputStream = null;
                httpURLConnection = httpURLConnection2;
                th = th4;
            }
        } catch (IOException e7) {
            e = e7;
            bufferedInputStream = null;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            httpURLConnection = null;
        }
    }

    public static void e() {
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }
}
