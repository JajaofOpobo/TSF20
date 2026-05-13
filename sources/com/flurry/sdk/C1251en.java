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
/* renamed from: com.flurry.sdk.en */
/* loaded from: classes.dex */
public class C1251en extends AbstractC1279fg {

    /* renamed from: a */
    private static final String f3989a = C1251en.class.getSimpleName();

    /* renamed from: b */
    private static SSLContext f3990b;

    /* renamed from: c */
    private static HostnameVerifier f3991c;

    /* renamed from: d */
    private String f3992d;

    /* renamed from: e */
    private EnumC1255a f3993e;

    /* renamed from: l */
    private InterfaceC1257c f3998l;

    /* renamed from: m */
    private HttpURLConnection f3999m;

    /* renamed from: n */
    private HttpClient f4000n;

    /* renamed from: o */
    private boolean f4001o;

    /* renamed from: p */
    private boolean f4002p;

    /* renamed from: q */
    private Exception f4003q;

    /* renamed from: f */
    private int f3994f = 10000;

    /* renamed from: i */
    private int f3995i = 15000;

    /* renamed from: j */
    private boolean f3996j = true;

    /* renamed from: k */
    private final C1216ds<String, String> f3997k = new C1216ds<>();

    /* renamed from: r */
    private int f4004r = -1;

    /* renamed from: s */
    private final C1216ds<String, String> f4005s = new C1216ds<>();

    /* renamed from: t */
    private final Object f4006t = new Object();

    /* renamed from: com.flurry.sdk.en$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1257c {
        /* renamed from: a */
        void mo9239a(C1251en c1251en);

        /* renamed from: a */
        void mo9238a(C1251en c1251en, InputStream inputStream);

        /* renamed from: a */
        void mo9237a(C1251en c1251en, OutputStream outputStream);
    }

    /* renamed from: com.flurry.sdk.en$b */
    /* loaded from: classes.dex */
    public static class C1256b implements InterfaceC1257c {
        @Override // com.flurry.sdk.C1251en.InterfaceC1257c
        /* renamed from: a */
        public void mo9237a(C1251en c1251en, OutputStream outputStream) {
        }

        @Override // com.flurry.sdk.C1251en.InterfaceC1257c
        /* renamed from: a */
        public void mo9238a(C1251en c1251en, InputStream inputStream) {
        }

        @Override // com.flurry.sdk.C1251en.InterfaceC1257c
        /* renamed from: a */
        public void mo9239a(C1251en c1251en) {
        }
    }

    /* renamed from: m */
    private static synchronized SSLContext m9247m() {
        SSLContext sSLContext;
        synchronized (C1251en.class) {
            if (f3990b != null) {
                sSLContext = f3990b;
            } else {
                try {
                    TrustManager[] trustManagerArr = {new C1245ej(null)};
                    f3990b = SSLContext.getInstance("TLS");
                    f3990b.init(null, trustManagerArr, new SecureRandom());
                } catch (Exception e) {
                    C1258eo.m9233a(3, f3989a, "Exception creating SSL context", e);
                }
                sSLContext = f3990b;
            }
        }
        return sSLContext;
    }

    /* renamed from: n */
    private static synchronized HostnameVerifier m9246n() {
        HostnameVerifier hostnameVerifier;
        synchronized (C1251en.class) {
            if (f3991c != null) {
                hostnameVerifier = f3991c;
            } else {
                f3991c = new C1243eh();
                hostnameVerifier = f3991c;
            }
        }
        return hostnameVerifier;
    }

    /* renamed from: com.flurry.sdk.en$a */
    /* loaded from: classes.dex */
    public enum EnumC1255a {
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

        /* renamed from: a */
        public HttpRequestBase m9240a(String str) {
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

    /* renamed from: a */
    public void m9258a(String str) {
        this.f3992d = str;
    }

    /* renamed from: a */
    public void m9264a(EnumC1255a enumC1255a) {
        this.f3993e = enumC1255a;
    }

    /* renamed from: a */
    public void m9256a(boolean z) {
        this.f3996j = z;
    }

    /* renamed from: a */
    public void m9257a(String str, String str2) {
        this.f3997k.m9369a((C1216ds<String, String>) str, str2);
    }

    /* renamed from: a */
    public void m9263a(InterfaceC1257c interfaceC1257c) {
        this.f3998l = interfaceC1257c;
    }

    /* renamed from: b */
    public boolean m9255b() {
        boolean z;
        synchronized (this.f4006t) {
            z = this.f4002p;
        }
        return z;
    }

    /* renamed from: c */
    public boolean m9252c() {
        return !m9249f() && m9251d();
    }

    /* renamed from: d */
    public boolean m9251d() {
        return this.f4004r >= 200 && this.f4004r < 400;
    }

    /* renamed from: e */
    public int m9250e() {
        return this.f4004r;
    }

    /* renamed from: f */
    public boolean m9249f() {
        return this.f4003q != null;
    }

    /* renamed from: b */
    public List<String> m9253b(String str) {
        if (str == null) {
            return null;
        }
        return this.f4005s.m9370a((C1216ds<String, String>) str);
    }

    /* renamed from: g */
    public void m9248g() {
        synchronized (this.f4006t) {
            this.f4002p = true;
        }
        m9241s();
    }

    @Override // com.flurry.sdk.AbstractRunnableC1278ff
    /* renamed from: a */
    public void mo9140a() {
        try {
            if (this.f3992d == null) {
                return;
            }
            if (!C1265ev.m9207a().m9203c()) {
                C1258eo.m9234a(3, f3989a, "Network not available, aborting http request: " + this.f3992d);
                return;
            }
            if (this.f3993e == null || EnumC1255a.kUnknown.equals(this.f3993e)) {
                this.f3993e = EnumC1255a.kGet;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                m9245o();
            } else {
                m9244p();
            }
            C1258eo.m9234a(4, f3989a, "HTTP status: " + this.f4004r + " for url: " + this.f3992d);
        } catch (Exception e) {
            C1258eo.m9234a(4, f3989a, "HTTP status: " + this.f4004r + " for url: " + this.f3992d);
            C1258eo.m9233a(3, f3989a, "Exception during http request: " + this.f3992d, e);
            this.f4003q = e;
        } finally {
            m9243q();
        }
    }

    @Override // com.flurry.sdk.AbstractC1279fg
    /* renamed from: h */
    public void mo9138h() {
        m9248g();
    }

    /* renamed from: o */
    private void m9245o() {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream;
        InputStream inputStream2;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (this.f4002p) {
            return;
        }
        try {
            this.f3999m = (HttpURLConnection) new URL(this.f3992d).openConnection();
            this.f3999m.setConnectTimeout(this.f3994f);
            this.f3999m.setReadTimeout(this.f3995i);
            this.f3999m.setRequestMethod(this.f3993e.toString());
            this.f3999m.setInstanceFollowRedirects(this.f3996j);
            this.f3999m.setDoOutput(EnumC1255a.kPost.equals(this.f3993e));
            this.f3999m.setDoInput(true);
            if (C1258eo.m9220d() && (this.f3999m instanceof HttpsURLConnection)) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f3999m;
                httpsURLConnection.setHostnameVerifier(m9246n());
                httpsURLConnection.setSSLSocketFactory(m9247m().getSocketFactory());
            }
            for (Map.Entry<String, String> entry : this.f3997k.m9367b()) {
                this.f3999m.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (!EnumC1255a.kGet.equals(this.f3993e) && !EnumC1255a.kPost.equals(this.f3993e)) {
                this.f3999m.setRequestProperty("Accept-Encoding", "");
            }
            if (this.f4002p) {
                return;
            }
            if (EnumC1255a.kPost.equals(this.f3993e)) {
                try {
                    OutputStream outputStream = this.f3999m.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = null;
                        bufferedInputStream2 = outputStream;
                    }
                    try {
                        m9259a(bufferedOutputStream);
                        C1277fe.m9152a(bufferedOutputStream);
                        C1277fe.m9152a(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = outputStream;
                        C1277fe.m9152a(bufferedOutputStream);
                        C1277fe.m9152a(bufferedInputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            }
            this.f4004r = this.f3999m.getResponseCode();
            for (Map.Entry<String, List<String>> entry2 : this.f3999m.getHeaderFields().entrySet()) {
                for (String str : entry2.getValue()) {
                    this.f4005s.m9369a((C1216ds<String, String>) entry2.getKey(), str);
                }
            }
            if (EnumC1255a.kGet.equals(this.f3993e) || EnumC1255a.kPost.equals(this.f3993e)) {
                if (this.f4002p) {
                    return;
                }
                try {
                    inputStream2 = this.f3999m.getInputStream();
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
                    m9260a(bufferedInputStream);
                    C1277fe.m9152a(bufferedInputStream);
                    C1277fe.m9152a(inputStream2);
                } catch (Throwable th6) {
                    th = th6;
                    bufferedInputStream2 = bufferedInputStream;
                    inputStream = inputStream2;
                    C1277fe.m9152a(bufferedInputStream2);
                    C1277fe.m9152a(inputStream);
                    throw th;
                }
            }
        } finally {
            m9242r();
        }
    }

    /* renamed from: p */
    private void m9244p() {
        BufferedInputStream bufferedInputStream;
        InputStream content;
        InputStream inputStream = null;
        if (!this.f4002p) {
            HttpPost m9240a = this.f3993e.m9240a(this.f3992d);
            for (Map.Entry<String, String> entry : this.f3997k.m9367b()) {
                m9240a.setHeader(entry.getKey(), entry.getValue());
            }
            if (!EnumC1255a.kGet.equals(this.f3993e) && !EnumC1255a.kPost.equals(this.f3993e)) {
                m9240a.removeHeaders("Accept-Encoding");
            }
            if (EnumC1255a.kPost.equals(this.f3993e)) {
                m9240a.setEntity(new AbstractHttpEntity() { // from class: com.flurry.sdk.en.1
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
                                    C1251en.this.m9259a(bufferedOutputStream);
                                    C1277fe.m9152a(bufferedOutputStream);
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
                                C1277fe.m9152a((Closeable) null);
                                throw th;
                            }
                        } catch (IOException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            e = e4;
                        } catch (Throwable th2) {
                            th = th2;
                            C1277fe.m9152a((Closeable) null);
                            throw th;
                        }
                    }
                });
            }
            try {
                BasicHttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(basicHttpParams, this.f3994f);
                HttpConnectionParams.setSoTimeout(basicHttpParams, this.f3995i);
                basicHttpParams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(this.f3996j));
                this.f4000n = C1246ek.m9278a(basicHttpParams);
                HttpResponse execute = this.f4000n.execute(m9240a);
                if (this.f4002p) {
                    throw new Exception("Request cancelled");
                }
                if (execute != null) {
                    this.f4004r = execute.getStatusLine().getStatusCode();
                    Header[] allHeaders = execute.getAllHeaders();
                    if (allHeaders != null) {
                        for (Header header : allHeaders) {
                            HeaderElement[] elements = header.getElements();
                            for (HeaderElement headerElement : elements) {
                                this.f4005s.m9369a((C1216ds<String, String>) headerElement.getName(), headerElement.getValue());
                            }
                        }
                    }
                    if (EnumC1255a.kGet.equals(this.f3993e) || EnumC1255a.kPost.equals(this.f3993e)) {
                        if (this.f4002p) {
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
                                m9260a(bufferedInputStream);
                                C1277fe.m9152a(bufferedInputStream);
                                C1277fe.m9152a(content);
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = content;
                                C1277fe.m9152a(bufferedInputStream);
                                C1277fe.m9152a(inputStream);
                                throw th;
                            }
                        }
                    }
                }
            } finally {
                m9242r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9259a(OutputStream outputStream) {
        if (this.f3998l != null && !m9255b() && outputStream != null) {
            this.f3998l.mo9237a(this, outputStream);
        }
    }

    /* renamed from: a */
    private void m9260a(InputStream inputStream) {
        if (this.f3998l != null && !m9255b() && inputStream != null) {
            this.f3998l.mo9238a(this, inputStream);
        }
    }

    /* renamed from: q */
    private void m9243q() {
        if (this.f3998l != null && !m9255b()) {
            this.f3998l.mo9239a(this);
        }
    }

    /* renamed from: r */
    private void m9242r() {
        if (!this.f4001o) {
            this.f4001o = true;
            if (this.f3999m != null) {
                this.f3999m.disconnect();
            }
            if (this.f4000n != null) {
                this.f4000n.getConnectionManager().shutdown();
            }
        }
    }

    /* renamed from: s */
    private void m9241s() {
        if (!this.f4001o) {
            this.f4001o = true;
            if (this.f3999m != null || this.f4000n != null) {
                new Thread() { // from class: com.flurry.sdk.en.2
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        if (C1251en.this.f3999m != null) {
                            C1251en.this.f3999m.disconnect();
                        }
                        if (C1251en.this.f4000n != null) {
                            C1251en.this.f4000n.getConnectionManager().shutdown();
                        }
                    }
                }.start();
            }
        }
    }
}
