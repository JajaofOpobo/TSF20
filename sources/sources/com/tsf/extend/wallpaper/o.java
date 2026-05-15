package com.tsf.extend.wallpaper;

import android.os.SystemClock;
import com.android.volley.b;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.acra.ACRAConstants;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class o extends com.android.volley.toolbox.a {
    private static int d = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
    private a e;

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
    public com.android.volley.i a(com.android.volley.l<?> lVar) throws Throwable {
        byte[] bArrA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            try {
                try {
                    if (this.e != null && (lVar instanceof ac)) {
                        this.e.a((ac) lVar, 0L);
                    }
                    HashMap map = new HashMap();
                    a(map, lVar.f());
                    HttpResponse httpResponseA = this.b.a(lVar, map);
                    try {
                        long contentLength = httpResponseA.getEntity().getContentLength();
                        if (lVar instanceof ac) {
                            ((ac) lVar).a(contentLength);
                        }
                        StatusLine statusLine = httpResponseA.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        Map<String, String> mapA = a(httpResponseA.getAllHeaders());
                        try {
                            if (statusCode == 304) {
                                b.a aVarF = lVar.f();
                                if (aVarF == null) {
                                    return new com.android.volley.i(304, null, mapA, true);
                                }
                                aVarF.g.putAll(mapA);
                                return new com.android.volley.i(304, aVarF.a, aVarF.g, true);
                            }
                            if (httpResponseA.getEntity() != null) {
                                bArrA = a(httpResponseA.getEntity(), lVar);
                            } else {
                                bArrA = new byte[0];
                            }
                            a(SystemClock.elapsedRealtime() - jElapsedRealtime, lVar, bArrA, statusLine);
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new com.android.volley.i(statusCode, bArrA, mapA, false);
                        } catch (IOException e) {
                            e = e;
                            mapEmptyMap = mapA;
                            httpResponse = httpResponseA;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                com.android.volley.t.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), lVar.d());
                                if (0 != 0) {
                                    com.android.volley.i iVar = new com.android.volley.i(statusCode2, null, mapEmptyMap, false);
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
                        httpResponse = httpResponseA;
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

    private byte[] a(HttpEntity httpEntity, com.android.volley.l<?> lVar) throws Throwable {
        byte[] bArrA;
        byte[] bArr;
        try {
            com.android.volley.toolbox.l lVar2 = new com.android.volley.toolbox.l(this.c, (int) httpEntity.getContentLength());
            try {
                InputStream content = httpEntity.getContent();
                if (content == null) {
                    throw new com.android.volley.q();
                }
                bArrA = this.c.a(1024);
                long j = 0;
                while (true) {
                    try {
                        int i = content.read(bArrA);
                        if (i == -1) {
                            break;
                        }
                        lVar2.write(bArrA, 0, i);
                        j += (long) i;
                        if (this.e != null && (lVar instanceof ac)) {
                            this.e.a((ac) lVar, j);
                        }
                    } catch (Throwable th) {
                        bArr = bArrA;
                        try {
                            httpEntity.consumeContent();
                        } catch (IOException e) {
                            com.android.volley.t.a("Error occured when calling consumingContent", new Object[0]);
                        }
                        this.c.a(bArr);
                        lVar2.close();
                        return null;
                    }
                }
                byte[] byteArray = lVar2.toByteArray();
                try {
                    httpEntity.consumeContent();
                } catch (IOException e2) {
                    com.android.volley.t.a("Error occured when calling consumingContent", new Object[0]);
                }
                this.c.a(bArrA);
                lVar2.close();
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                bArrA = null;
            }
        } catch (OutOfMemoryError e3) {
            return null;
        }
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

    private static void a(String str, com.android.volley.l<?> lVar, com.android.volley.s sVar) throws com.android.volley.s {
        com.android.volley.p pVarU = lVar.u();
        int iT = lVar.t();
        try {
            pVarU.a(sVar);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iT)));
        } catch (com.android.volley.s e) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iT)));
            throw e;
        }
    }
}
