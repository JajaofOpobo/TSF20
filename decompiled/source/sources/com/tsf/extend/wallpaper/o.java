package com.tsf.extend.wallpaper;

import android.os.SystemClock;
import com.android.volley.b;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.acra.ACRAConstants;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;
/* loaded from: classes.dex */
public class o extends com.android.volley.toolbox.a {
    private static int d = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
    private a e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ac acVar, long j);
    }

    public o(com.android.volley.toolbox.f fVar) {
        super(fVar);
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    @Override // com.android.volley.toolbox.a, com.android.volley.f
    public com.android.volley.i a(com.android.volley.l<?> lVar) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    if (this.e != null && (lVar instanceof ac)) {
                        this.e.a((ac) lVar, 0L);
                    }
                    HashMap hashMap = new HashMap();
                    a(hashMap, lVar.f());
                    HttpResponse a2 = this.b.a(lVar, hashMap);
                    try {
                        long contentLength = a2.getEntity().getContentLength();
                        if (lVar instanceof ac) {
                            ((ac) lVar).a(contentLength);
                        }
                        StatusLine statusLine = a2.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        Map<String, String> a3 = a(a2.getAllHeaders());
                        try {
                            if (statusCode == 304) {
                                b.a f = lVar.f();
                                if (f == null) {
                                    return new com.android.volley.i(304, null, a3, true);
                                }
                                f.g.putAll(a3);
                                return new com.android.volley.i(304, f.a, f.g, true);
                            }
                            if (a2.getEntity() != null) {
                                bArr = a(a2.getEntity(), lVar);
                            } else {
                                bArr = new byte[0];
                            }
                            a(SystemClock.elapsedRealtime() - elapsedRealtime, lVar, bArr, statusLine);
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new com.android.volley.i(statusCode, bArr, a3, false);
                        } catch (IOException e) {
                            e = e;
                            emptyMap = a3;
                            httpResponse = a2;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                com.android.volley.t.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), lVar.d());
                                if (0 != 0) {
                                    com.android.volley.i iVar = new com.android.volley.i(statusCode2, null, emptyMap, false);
                                    if (statusCode2 == 401 || statusCode2 == 403) {
                                        a("auth", lVar, new com.android.volley.a(iVar));
                                    } else {
                                        throw new com.android.volley.q(iVar);
                                    }
                                } else {
                                    throw new com.android.volley.h((com.android.volley.i) null);
                                }
                            } else {
                                throw new com.android.volley.j(e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        httpResponse = a2;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (MalformedURLException e4) {
                throw new RuntimeException("Bad URL " + lVar.d(), e4);
            } catch (SocketTimeoutException e5) {
                a("socket", lVar, new com.android.volley.r());
            } catch (ConnectTimeoutException e6) {
                a("connection", lVar, new com.android.volley.r());
            }
        }
    }

    private void a(Map<String, String> map, b.a aVar) {
        if (aVar != null) {
            if (aVar.b != null) {
                map.put("If-None-Match", aVar.b);
            }
            if (aVar.c > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(aVar.c)));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private byte[] a(org.apache.http.HttpEntity r14, com.android.volley.l<?> r15) {
        /*
            r13 = this;
            r3 = 0
            r12 = 0
            com.android.volley.toolbox.l r5 = new com.android.volley.toolbox.l     // Catch: java.lang.OutOfMemoryError -> L29
            com.android.volley.toolbox.b r2 = r13.c     // Catch: java.lang.OutOfMemoryError -> L29
            long r6 = r14.getContentLength()     // Catch: java.lang.OutOfMemoryError -> L29
            int r4 = (int) r6     // Catch: java.lang.OutOfMemoryError -> L29
            r5.<init>(r2, r4)     // Catch: java.lang.OutOfMemoryError -> L29
            java.io.InputStream r8 = r14.getContent()     // Catch: java.lang.Throwable -> L1a
            if (r8 != 0) goto L2c
            com.android.volley.q r2 = new com.android.volley.q     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            r2 = r3
        L1c:
            r14.consumeContent()     // Catch: java.io.IOException -> L71
        L1f:
            com.android.volley.toolbox.b r4 = r13.c
            r4.a(r2)
            r5.close()
            r2 = r3
        L28:
            return r2
        L29:
            r2 = move-exception
            r2 = r3
            goto L28
        L2c:
            com.android.volley.toolbox.b r2 = r13.c     // Catch: java.lang.Throwable -> L1a
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = r2.a(r4)     // Catch: java.lang.Throwable -> L1a
            r6 = 0
        L36:
            int r2 = r8.read(r4)     // Catch: java.lang.Throwable -> L55
            r9 = -1
            if (r2 == r9) goto L58
            r9 = 0
            r5.write(r4, r9, r2)     // Catch: java.lang.Throwable -> L55
            long r10 = (long) r2     // Catch: java.lang.Throwable -> L55
            long r6 = r6 + r10
            com.tsf.extend.wallpaper.o$a r2 = r13.e     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L36
            boolean r2 = r15 instanceof com.tsf.extend.wallpaper.ac     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L36
            com.tsf.extend.wallpaper.o$a r9 = r13.e     // Catch: java.lang.Throwable -> L55
            r0 = r15
            com.tsf.extend.wallpaper.ac r0 = (com.tsf.extend.wallpaper.ac) r0     // Catch: java.lang.Throwable -> L55
            r2 = r0
            r9.a(r2, r6)     // Catch: java.lang.Throwable -> L55
            goto L36
        L55:
            r2 = move-exception
            r2 = r4
            goto L1c
        L58:
            byte[] r2 = r5.toByteArray()     // Catch: java.lang.Throwable -> L55
            r14.consumeContent()     // Catch: java.io.IOException -> L68
        L5f:
            com.android.volley.toolbox.b r3 = r13.c
            r3.a(r4)
            r5.close()
            goto L28
        L68:
            r3 = move-exception
            java.lang.String r3 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.t.a(r3, r6)
            goto L5f
        L71:
            r4 = move-exception
            java.lang.String r4 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.t.a(r4, r6)
            goto L1f
        L7a:
            r2 = move-exception
            r4 = r3
        L7c:
            r14.consumeContent()     // Catch: java.io.IOException -> L88
        L7f:
            com.android.volley.toolbox.b r3 = r13.c
            r3.a(r4)
            r5.close()
            throw r2
        L88:
            r3 = move-exception
            java.lang.String r3 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.t.a(r3, r6)
            goto L7f
        L91:
            r2 = move-exception
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.o.a(org.apache.http.HttpEntity, com.android.volley.l):byte[]");
    }

    private void a(long j, com.android.volley.l<?> lVar, byte[] bArr, StatusLine statusLine) {
        if (a || j > d) {
            Object[] objArr = new Object[5];
            objArr[0] = lVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(lVar.u().b());
            com.android.volley.t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    private static void a(String str, com.android.volley.l<?> lVar, com.android.volley.s sVar) {
        com.android.volley.p u = lVar.u();
        int t = lVar.t();
        try {
            u.a(sVar);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(t)));
        } catch (com.android.volley.s e) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(t)));
            throw e;
        }
    }
}
