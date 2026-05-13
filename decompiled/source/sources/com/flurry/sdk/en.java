package com.flurry.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
/* loaded from: classes.dex */
public class en extends fg {
    private static final String a = en.class.getSimpleName();
    private static SSLContext b;
    private static HostnameVerifier c;
    private String d;
    private a e;
    private c l;
    private HttpURLConnection m;
    private HttpClient n;
    private boolean o;
    private boolean p;
    private Exception q;
    private int f = 10000;
    private int i = 15000;
    private boolean j = true;
    private final ds<String, String> k = new ds<>();
    private int r = -1;
    private final ds<String, String> s = new ds<>();
    private final Object t = new Object();

    /* loaded from: classes.dex */
    public interface c {
        void a(en enVar);

        void a(en enVar, InputStream inputStream);

        void a(en enVar, OutputStream outputStream);
    }

    /* loaded from: classes.dex */
    public static class b implements c {
        @Override // com.flurry.sdk.en.c
        public void a(en enVar, OutputStream outputStream) {
        }

        @Override // com.flurry.sdk.en.c
        public void a(en enVar, InputStream inputStream) {
        }

        @Override // com.flurry.sdk.en.c
        public void a(en enVar) {
        }
    }

    private static synchronized SSLContext m() {
        SSLContext sSLContext;
        synchronized (en.class) {
            if (b != null) {
                sSLContext = b;
            } else {
                try {
                    TrustManager[] trustManagerArr = {new ej(null)};
                    b = SSLContext.getInstance("TLS");
                    b.init(null, trustManagerArr, new SecureRandom());
                } catch (Exception e) {
                    eo.a(3, a, "Exception creating SSL context", e);
                }
                sSLContext = b;
            }
        }
        return sSLContext;
    }

    private static synchronized HostnameVerifier n() {
        HostnameVerifier hostnameVerifier;
        synchronized (en.class) {
            if (c != null) {
                hostnameVerifier = c;
            } else {
                c = new eh();
                hostnameVerifier = c;
            }
        }
        return hostnameVerifier;
    }

    /* loaded from: classes.dex */
    public enum a {
        kUnknown,
        kGet,
        kPost,
        kPut,
        kDelete,
        kHead;

        @Override // java.lang.Enum
        public String toString() {
            switch (this) {
                case kPost:
                    return "POST";
                case kPut:
                    return "PUT";
                case kDelete:
                    return "DELETE";
                case kHead:
                    return "HEAD";
                case kGet:
                    return "GET";
                default:
                    return null;
            }
        }

        public HttpRequestBase a(String str) {
            switch (this) {
                case kPost:
                    return new HttpPost(str);
                case kPut:
                    return new HttpPut(str);
                case kDelete:
                    return new HttpDelete(str);
                case kHead:
                    return new HttpHead(str);
                case kGet:
                    return new HttpGet(str);
                default:
                    return null;
            }
        }
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void a(String str, String str2) {
        this.k.a((ds<String, String>) str, str2);
    }

    public void a(c cVar) {
        this.l = cVar;
    }

    public boolean b() {
        boolean z;
        synchronized (this.t) {
            z = this.p;
        }
        return z;
    }

    public boolean c() {
        return !f() && d();
    }

    public boolean d() {
        return this.r >= 200 && this.r < 400;
    }

    public int e() {
        return this.r;
    }

    public boolean f() {
        return this.q != null;
    }

    public List<String> b(String str) {
        if (str == null) {
            return null;
        }
        return this.s.a((ds<String, String>) str);
    }

    public void g() {
        synchronized (this.t) {
            this.p = true;
        }
        s();
    }

    @Override // com.flurry.sdk.ff
    public void a() {
        try {
            if (this.d == null) {
                return;
            }
            if (!ev.a().c()) {
                eo.a(3, a, "Network not available, aborting http request: " + this.d);
                return;
            }
            if (this.e == null || a.kUnknown.equals(this.e)) {
                this.e = a.kGet;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                o();
            } else {
                p();
            }
            eo.a(4, a, "HTTP status: " + this.r + " for url: " + this.d);
        } catch (Exception e) {
            eo.a(4, a, "HTTP status: " + this.r + " for url: " + this.d);
            eo.a(3, a, "Exception during http request: " + this.d, e);
            this.q = e;
        } finally {
            q();
        }
    }

    @Override // com.flurry.sdk.fg
    public void h() {
        g();
    }

    private void o() {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream;
        InputStream inputStream2;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (this.p) {
            return;
        }
        try {
            this.m = (HttpURLConnection) new URL(this.d).openConnection();
            this.m.setConnectTimeout(this.f);
            this.m.setReadTimeout(this.i);
            this.m.setRequestMethod(this.e.toString());
            this.m.setInstanceFollowRedirects(this.j);
            this.m.setDoOutput(a.kPost.equals(this.e));
            this.m.setDoInput(true);
            if (eo.d() && (this.m instanceof HttpsURLConnection)) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.m;
                httpsURLConnection.setHostnameVerifier(n());
                httpsURLConnection.setSSLSocketFactory(m().getSocketFactory());
            }
            for (Map.Entry<String, String> entry : this.k.b()) {
                this.m.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (!a.kGet.equals(this.e) && !a.kPost.equals(this.e)) {
                this.m.setRequestProperty("Accept-Encoding", "");
            }
            if (this.p) {
                return;
            }
            if (a.kPost.equals(this.e)) {
                try {
                    OutputStream outputStream = this.m.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = null;
                        bufferedInputStream2 = outputStream;
                    }
                    try {
                        a(bufferedOutputStream);
                        fe.a(bufferedOutputStream);
                        fe.a(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = outputStream;
                        fe.a(bufferedOutputStream);
                        fe.a(bufferedInputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            }
            this.r = this.m.getResponseCode();
            for (Map.Entry<String, List<String>> entry2 : this.m.getHeaderFields().entrySet()) {
                for (String str : entry2.getValue()) {
                    this.s.a((ds<String, String>) entry2.getKey(), str);
                }
            }
            if (a.kGet.equals(this.e) || a.kPost.equals(this.e)) {
                if (this.p) {
                    return;
                }
                try {
                    inputStream2 = this.m.getInputStream();
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStream2);
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
                try {
                    a(bufferedInputStream);
                    fe.a(bufferedInputStream);
                    fe.a(inputStream2);
                } catch (Throwable th6) {
                    th = th6;
                    bufferedInputStream2 = bufferedInputStream;
                    inputStream = inputStream2;
                    fe.a(bufferedInputStream2);
                    fe.a(inputStream);
                    throw th;
                }
            }
        } finally {
            r();
        }
    }

    private void p() {
        BufferedInputStream bufferedInputStream;
        InputStream content;
        InputStream inputStream = null;
        if (!this.p) {
            HttpPost a2 = this.e.a(this.d);
            for (Map.Entry<String, String> entry : this.k.b()) {
                a2.setHeader(entry.getKey(), entry.getValue());
            }
            if (!a.kGet.equals(this.e) && !a.kPost.equals(this.e)) {
                a2.removeHeaders("Accept-Encoding");
            }
            if (a.kPost.equals(this.e)) {
                a2.setEntity(new AbstractHttpEntity() { // from class: com.flurry.sdk.en.1
                    public boolean isRepeatable() {
                        return false;
                    }

                    public long getContentLength() {
                        return -1L;
                    }

                    public boolean isStreaming() {
                        return false;
                    }

                    public InputStream getContent() {
                        throw new UnsupportedOperationException();
                    }

                    @TargetApi(9)
                    public void writeTo(OutputStream outputStream) {
                        try {
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                try {
                                    en.this.a(bufferedOutputStream);
                                    fe.a(bufferedOutputStream);
                                } catch (IOException e) {
                                } catch (Exception e2) {
                                    e = e2;
                                    if (Build.VERSION.SDK_INT >= 9) {
                                        throw new IOException(e);
                                    }
                                    throw new IOException(e.toString());
                                }
                            } catch (Throwable th) {
                                th = th;
                                fe.a((Closeable) null);
                                throw th;
                            }
                        } catch (IOException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            e = e4;
                        } catch (Throwable th2) {
                            th = th2;
                            fe.a((Closeable) null);
                            throw th;
                        }
                    }
                });
            }
            try {
                BasicHttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(basicHttpParams, this.f);
                HttpConnectionParams.setSoTimeout(basicHttpParams, this.i);
                basicHttpParams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(this.j));
                this.n = ek.a(basicHttpParams);
                HttpResponse execute = this.n.execute(a2);
                if (this.p) {
                    throw new Exception("Request cancelled");
                }
                if (execute != null) {
                    this.r = execute.getStatusLine().getStatusCode();
                    Header[] allHeaders = execute.getAllHeaders();
                    if (allHeaders != null) {
                        for (Header header : allHeaders) {
                            HeaderElement[] elements = header.getElements();
                            for (HeaderElement headerElement : elements) {
                                this.s.a((ds<String, String>) headerElement.getName(), headerElement.getValue());
                            }
                        }
                    }
                    if (a.kGet.equals(this.e) || a.kPost.equals(this.e)) {
                        if (this.p) {
                            throw new Exception("Request cancelled");
                        }
                        HttpEntity entity = execute.getEntity();
                        if (entity != null) {
                            try {
                                content = entity.getContent();
                                try {
                                    bufferedInputStream = new BufferedInputStream(content);
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedInputStream = null;
                                    inputStream = content;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedInputStream = null;
                            }
                            try {
                                a(bufferedInputStream);
                                fe.a(bufferedInputStream);
                                fe.a(content);
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = content;
                                fe.a(bufferedInputStream);
                                fe.a(inputStream);
                                throw th;
                            }
                        }
                    }
                }
            } finally {
                r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(OutputStream outputStream) {
        if (this.l != null && !b() && outputStream != null) {
            this.l.a(this, outputStream);
        }
    }

    private void a(InputStream inputStream) {
        if (this.l != null && !b() && inputStream != null) {
            this.l.a(this, inputStream);
        }
    }

    private void q() {
        if (this.l != null && !b()) {
            this.l.a(this);
        }
    }

    private void r() {
        if (!this.o) {
            this.o = true;
            if (this.m != null) {
                this.m.disconnect();
            }
            if (this.n != null) {
                this.n.getConnectionManager().shutdown();
            }
        }
    }

    private void s() {
        if (!this.o) {
            this.o = true;
            if (this.m != null || this.n != null) {
                new Thread() { // from class: com.flurry.sdk.en.2
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        if (en.this.m != null) {
                            en.this.m.disconnect();
                        }
                        if (en.this.n != null) {
                            en.this.n.getConnectionManager().shutdown();
                        }
                    }
                }.start();
            }
        }
    }
}
