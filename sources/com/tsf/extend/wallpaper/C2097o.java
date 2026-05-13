package com.tsf.extend.wallpaper;

import android.os.SystemClock;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0780a;
import com.android.volley.C0791h;
import com.android.volley.C0792i;
import com.android.volley.C0793j;
import com.android.volley.C0807q;
import com.android.volley.C0808r;
import com.android.volley.C0809s;
import com.android.volley.C0810t;
import com.android.volley.InterfaceC0781b;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0815a;
import com.android.volley.toolbox.InterfaceC0825f;
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
/* renamed from: com.tsf.extend.wallpaper.o */
/* loaded from: classes.dex */
public class C2097o extends C0815a {

    /* renamed from: d */
    private static int f6869d = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;

    /* renamed from: e */
    private InterfaceC2098a f6870e;

    /* renamed from: com.tsf.extend.wallpaper.o$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2098a {
        /* renamed from: a */
        void mo6213a(C2039ac c2039ac, long j);
    }

    public C2097o(InterfaceC0825f interfaceC0825f) {
        super(interfaceC0825f);
    }

    /* renamed from: a */
    public void m6418a(InterfaceC2098a interfaceC2098a) {
        this.f6870e = interfaceC2098a;
    }

    @Override // com.android.volley.toolbox.C0815a, com.android.volley.InterfaceC0789f
    /* renamed from: a */
    public C0792i mo6419a(AbstractC0795l<?> abstractC0795l) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    if (this.f6870e != null && (abstractC0795l instanceof C2039ac)) {
                        this.f6870e.mo6213a((C2039ac) abstractC0795l, 0L);
                    }
                    HashMap hashMap = new HashMap();
                    m6416a(hashMap, abstractC0795l.m11023f());
                    HttpResponse mo10942a = this.f2346b.mo10942a(abstractC0795l, hashMap);
                    try {
                        long contentLength = mo10942a.getEntity().getContentLength();
                        if (abstractC0795l instanceof C2039ac) {
                            ((C2039ac) abstractC0795l).m6647a(contentLength);
                        }
                        StatusLine statusLine = mo10942a.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        Map<String, String> a = m10975a(mo10942a.getAllHeaders());
                        try {
                            if (statusCode == 304) {
                                InterfaceC0781b.C0782a m11023f = abstractC0795l.m11023f();
                                if (m11023f == null) {
                                    return new C0792i(304, null, a, true);
                                }
                                m11023f.f2256g.putAll(a);
                                return new C0792i(304, m11023f.f2250a, m11023f.f2256g, true);
                            }
                            if (mo10942a.getEntity() != null) {
                                bArr = m6415a(mo10942a.getEntity(), abstractC0795l);
                            } else {
                                bArr = new byte[0];
                            }
                            m6420a(SystemClock.elapsedRealtime() - elapsedRealtime, abstractC0795l, bArr, statusLine);
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new C0792i(statusCode, bArr, a, false);
                        } catch (IOException e) {
                            e = e;
                            emptyMap = a;
                            httpResponse = mo10942a;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                C0810t.m10989c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), abstractC0795l.m11025d());
                                if (0 != 0) {
                                    C0792i c0792i = new C0792i(statusCode2, null, emptyMap, false);
                                    if (statusCode2 == 401 || statusCode2 == 403) {
                                        m6417a("auth", abstractC0795l, new C0780a(c0792i));
                                    } else {
                                        throw new C0807q(c0792i);
                                    }
                                } else {
                                    throw new C0791h((C0792i) null);
                                }
                            } else {
                                throw new C0793j(e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        httpResponse = mo10942a;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (MalformedURLException e4) {
                throw new RuntimeException("Bad URL " + abstractC0795l.m11025d(), e4);
            } catch (SocketTimeoutException e5) {
                m6417a("socket", abstractC0795l, new C0808r());
            } catch (ConnectTimeoutException e6) {
                m6417a("connection", abstractC0795l, new C0808r());
            }
        }
    }

    /* renamed from: a */
    private void m6416a(Map<String, String> map, InterfaceC0781b.C0782a c0782a) {
        if (c0782a != null) {
            if (c0782a.f2251b != null) {
                map.put("If-None-Match", c0782a.f2251b);
            }
            if (c0782a.f2252c > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(c0782a.f2252c)));
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
    /* renamed from: a */
    private byte[] m6415a(org.apache.http.HttpEntity r14, com.android.volley.AbstractC0795l<?> r15) {
        /*
            r13 = this;
            r3 = 0
            r12 = 0
            com.android.volley.toolbox.l r5 = new com.android.volley.toolbox.l     // Catch: java.lang.OutOfMemoryError -> L29
            com.android.volley.toolbox.b r2 = r13.f2347c     // Catch: java.lang.OutOfMemoryError -> L29
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
            com.android.volley.toolbox.b r4 = r13.f2347c
            r4.m10972a(r2)
            r5.close()
            r2 = r3
        L28:
            return r2
        L29:
            r2 = move-exception
            r2 = r3
            goto L28
        L2c:
            com.android.volley.toolbox.b r2 = r13.f2347c     // Catch: java.lang.Throwable -> L1a
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = r2.m10973a(r4)     // Catch: java.lang.Throwable -> L1a
            r6 = 0
        L36:
            int r2 = r8.read(r4)     // Catch: java.lang.Throwable -> L55
            r9 = -1
            if (r2 == r9) goto L58
            r9 = 0
            r5.write(r4, r9, r2)     // Catch: java.lang.Throwable -> L55
            long r10 = (long) r2     // Catch: java.lang.Throwable -> L55
            long r6 = r6 + r10
            com.tsf.extend.wallpaper.o$a r2 = r13.f6870e     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L36
            boolean r2 = r15 instanceof com.tsf.extend.wallpaper.C2039ac     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L36
            com.tsf.extend.wallpaper.o$a r9 = r13.f6870e     // Catch: java.lang.Throwable -> L55
            r0 = r15
            com.tsf.extend.wallpaper.ac r0 = (com.tsf.extend.wallpaper.C2039ac) r0     // Catch: java.lang.Throwable -> L55
            r2 = r0
            r9.mo6213a(r2, r6)     // Catch: java.lang.Throwable -> L55
            goto L36
        L55:
            r2 = move-exception
            r2 = r4
            goto L1c
        L58:
            byte[] r2 = r5.toByteArray()     // Catch: java.lang.Throwable -> L55
            r14.consumeContent()     // Catch: java.io.IOException -> L68
        L5f:
            com.android.volley.toolbox.b r3 = r13.f2347c
            r3.m10972a(r4)
            r5.close()
            goto L28
        L68:
            r3 = move-exception
            java.lang.String r3 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.C0810t.m10992a(r3, r6)
            goto L5f
        L71:
            r4 = move-exception
            java.lang.String r4 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.C0810t.m10992a(r4, r6)
            goto L1f
        L7a:
            r2 = move-exception
            r4 = r3
        L7c:
            r14.consumeContent()     // Catch: java.io.IOException -> L88
        L7f:
            com.android.volley.toolbox.b r3 = r13.f2347c
            r3.m10972a(r4)
            r5.close()
            throw r2
        L88:
            r3 = move-exception
            java.lang.String r3 = "Error occured when calling consumingContent"
            java.lang.Object[] r6 = new java.lang.Object[r12]
            com.android.volley.C0810t.m10992a(r3, r6)
            goto L7f
        L91:
            r2 = move-exception
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.C2097o.m6415a(org.apache.http.HttpEntity, com.android.volley.l):byte[]");
    }

    /* renamed from: a */
    private void m6420a(long j, AbstractC0795l<?> abstractC0795l, byte[] bArr, StatusLine statusLine) {
        if (f2343a || j > f6869d) {
            Object[] objArr = new Object[5];
            objArr[0] = abstractC0795l;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(abstractC0795l.m11014u().mo10994b());
            C0810t.m10990b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m6417a(String str, AbstractC0795l<?> abstractC0795l, C0809s c0809s) {
        InterfaceC0806p m11014u = abstractC0795l.m11014u();
        int m11015t = abstractC0795l.m11015t();
        try {
            m11014u.mo10995a(c0809s);
            abstractC0795l.mo6644a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m11015t)));
        } catch (C0809s e) {
            abstractC0795l.mo6644a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m11015t)));
            throw e;
        }
    }
}
