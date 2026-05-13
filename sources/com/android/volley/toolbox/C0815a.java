package com.android.volley.toolbox;

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
import com.android.volley.InterfaceC0789f;
import com.android.volley.InterfaceC0806p;
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
/* renamed from: com.android.volley.toolbox.a */
/* loaded from: classes.dex */
public class C0815a implements InterfaceC0789f {

    /* renamed from: a */
    protected static final boolean f2343a = C0810t.f2327b;

    /* renamed from: d */
    private static int f2344d = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;

    /* renamed from: e */
    private static int f2345e = 4096;

    /* renamed from: b */
    protected final InterfaceC0825f f2346b;

    /* renamed from: c */
    protected final C0816b f2347c;

    public C0815a(InterfaceC0825f interfaceC0825f) {
        this(interfaceC0825f, new C0816b(f2345e));
    }

    public C0815a(InterfaceC0825f interfaceC0825f, C0816b c0816b) {
        this.f2346b = interfaceC0825f;
        this.f2347c = c0816b;
    }

    @Override // com.android.volley.InterfaceC0789f
    /* renamed from: a */
    public C0792i mo6419a(AbstractC0795l<?> abstractC0795l) {
        byte[] bArr;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    m10977a(hashMap, abstractC0795l.m11023f());
                    HttpResponse mo10942a = this.f2346b.mo10942a(abstractC0795l, hashMap);
                    try {
                        StatusLine statusLine = mo10942a.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        emptyMap = m10975a(mo10942a.getAllHeaders());
                        if (statusCode == 304) {
                            InterfaceC0781b.C0782a m11023f = abstractC0795l.m11023f();
                            if (m11023f == null) {
                                return new C0792i(304, null, emptyMap, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            m11023f.f2256g.putAll(emptyMap);
                            return new C0792i(304, m11023f.f2250a, m11023f.f2256g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                        if (mo10942a.getEntity() != null) {
                            bArr2 = m10976a(mo10942a.getEntity());
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            m10979a(SystemClock.elapsedRealtime() - elapsedRealtime, abstractC0795l, bArr2, statusLine);
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new C0792i(statusCode, bArr2, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                        } catch (IOException e) {
                            e = e;
                            bArr = bArr2;
                            httpResponse = mo10942a;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                C0810t.m10989c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), abstractC0795l.m11025d());
                                if (bArr != null) {
                                    C0792i c0792i = new C0792i(statusCode2, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                                    if (statusCode2 == 401 || statusCode2 == 403) {
                                        m10978a("auth", abstractC0795l, new C0780a(c0792i));
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
                        bArr = null;
                        httpResponse = mo10942a;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                }
            } catch (MalformedURLException e4) {
                throw new RuntimeException("Bad URL " + abstractC0795l.m11025d(), e4);
            } catch (SocketTimeoutException e5) {
                m10978a("socket", abstractC0795l, new C0808r());
            } catch (ConnectTimeoutException e6) {
                m10978a("connection", abstractC0795l, new C0808r());
            }
        }
    }

    /* renamed from: a */
    private void m10979a(long j, AbstractC0795l<?> abstractC0795l, byte[] bArr, StatusLine statusLine) {
        if (f2343a || j > f2344d) {
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
    private static void m10978a(String str, AbstractC0795l<?> abstractC0795l, C0809s c0809s) {
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

    /* renamed from: a */
    private void m10977a(Map<String, String> map, InterfaceC0781b.C0782a c0782a) {
        if (c0782a != null) {
            if (c0782a.f2251b != null) {
                map.put("If-None-Match", c0782a.f2251b);
            }
            if (c0782a.f2253d > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(c0782a.f2253d)));
            }
        }
    }

    /* renamed from: a */
    private byte[] m10976a(HttpEntity httpEntity) {
        C0840l c0840l = new C0840l(this.f2347c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new C0807q();
            }
            byte[] m10973a = this.f2347c.m10973a(1024);
            while (true) {
                int read = content.read(m10973a);
                if (read == -1) {
                    break;
                }
                c0840l.write(m10973a, 0, read);
            }
            byte[] byteArray = c0840l.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                C0810t.m10992a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2347c.m10972a(m10973a);
            c0840l.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                C0810t.m10992a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2347c.m10972a((byte[]) null);
            c0840l.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static Map<String, String> m10975a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
