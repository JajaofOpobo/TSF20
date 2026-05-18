package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.p;
import com.android.volley.q;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.acra.ACRAConstants;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements com.android.volley.f {
    protected static final boolean a = t.b;
    private static int d = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
    private static int e = 4096;
    protected final f b;
    protected final b c;

    public a(f fVar) {
        this(fVar, new b(e));
    }

    public a(f fVar, b bVar) {
        this.b = fVar;
        this.c = bVar;
    }

    @Override // com.android.volley.f
    public com.android.volley.i a(com.android.volley.l<?> lVar) throws s {
        byte[] bArr;
        byte[] bArrA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap map = new HashMap();
                    a(map, lVar.f());
                    HttpResponse httpResponseA = this.b.a(lVar, map);
                    try {
                        StatusLine statusLine = httpResponseA.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        mapEmptyMap = a(httpResponseA.getAllHeaders());
                        if (statusCode == 304) {
                            b.a aVarF = lVar.f();
                            if (aVarF == null) {
                                return new com.android.volley.i(304, null, mapEmptyMap, true, SystemClock.elapsedRealtime() - jElapsedRealtime);
                            }
                            aVarF.g.putAll(mapEmptyMap);
                            return new com.android.volley.i(304, aVarF.a, aVarF.g, true, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        }
                        if (httpResponseA.getEntity() != null) {
                            bArrA = a(httpResponseA.getEntity());
                        } else {
                            bArrA = new byte[0];
                        }
                        try {
                            a(SystemClock.elapsedRealtime() - jElapsedRealtime, lVar, bArrA, statusLine);
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new com.android.volley.i(statusCode, bArrA, mapEmptyMap, false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        } catch (IOException e2) {
                            e = e2;
                            bArr = bArrA;
                            httpResponse = httpResponseA;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                t.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), lVar.d());
                                if (bArr != null) {
                                    com.android.volley.i iVar = new com.android.volley.i(statusCode2, bArr, mapEmptyMap, false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (statusCode2 == 401 || statusCode2 == 403) {
                                        a("auth", lVar, new com.android.volley.a(iVar));
                                    } else {
                                        throw new q(iVar);
                                    }
                                } else {
                                    throw new com.android.volley.h((com.android.volley.i) null);
                                }
                            } else {
                                throw new com.android.volley.j(e);
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bArr = null;
                        httpResponse = httpResponseA;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bArr = null;
                }
            } catch (MalformedURLException e5) {
                throw new RuntimeException("Bad URL " + lVar.d(), e5);
            } catch (SocketTimeoutException e6) {
                a("socket", lVar, new r());
            } catch (ConnectTimeoutException e7) {
                a("connection", lVar, new r());
            }
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
            t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    private static void a(String str, com.android.volley.l<?> lVar, s sVar) throws s {
        p pVarU = lVar.u();
        int iT = lVar.t();
        try {
            pVarU.a(sVar);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iT)));
        } catch (s e2) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iT)));
            throw e2;
        }
    }

    private void a(Map<String, String> map, b.a aVar) {
        if (aVar != null) {
            if (aVar.b != null) {
                map.put("If-None-Match", aVar.b);
            }
            if (aVar.d > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(aVar.d)));
            }
        }
    }

    private byte[] a(HttpEntity httpEntity) throws IOException {
        l lVar = new l(this.c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new q();
            }
            byte[] bArrA = this.c.a(1024);
            while (true) {
                int i = content.read(bArrA);
                if (i == -1) {
                    break;
                }
                lVar.write(bArrA, 0, i);
            }
            byte[] byteArray = lVar.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                t.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(bArrA);
            lVar.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e3) {
                t.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a((byte[]) null);
            lVar.close();
            throw th;
        }
    }

    protected static Map<String, String> a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
