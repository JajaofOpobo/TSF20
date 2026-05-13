package com.android.volley.toolbox;

import com.android.volley.AbstractC0795l;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
/* renamed from: com.android.volley.toolbox.g */
/* loaded from: classes.dex */
public class C0826g implements InterfaceC0825f {

    /* renamed from: a */
    private final InterfaceC0827a f2367a;

    /* renamed from: b */
    private final SSLSocketFactory f2368b;

    /* renamed from: com.android.volley.toolbox.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0827a {
        /* renamed from: a */
        String m10936a(String str);
    }

    public C0826g() {
        this(null);
    }

    public C0826g(InterfaceC0827a interfaceC0827a) {
        this(interfaceC0827a, null);
    }

    public C0826g(InterfaceC0827a interfaceC0827a, SSLSocketFactory sSLSocketFactory) {
        this.f2367a = interfaceC0827a;
        this.f2368b = sSLSocketFactory;
    }

    @Override // com.android.volley.toolbox.InterfaceC0825f
    /* renamed from: a */
    public HttpResponse mo10942a(AbstractC0795l<?> abstractC0795l, Map<String, String> map) {
        String str;
        String m11025d = abstractC0795l.m11025d();
        HashMap hashMap = new HashMap();
        hashMap.putAll(abstractC0795l.m11020i());
        hashMap.putAll(map);
        if (this.f2367a != null) {
            str = this.f2367a.m10936a(m11025d);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + m11025d);
            }
        } else {
            str = m11025d;
        }
        HttpURLConnection m10938a = m10938a(new URL(str), abstractC0795l);
        for (String str2 : hashMap.keySet()) {
            m10938a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m10940a(m10938a, abstractC0795l);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (m10938a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, m10938a.getResponseCode(), m10938a.getResponseMessage()));
        basicHttpResponse.setEntity(m10941a(m10938a));
        for (Map.Entry<String, List<String>> entry : m10938a.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return basicHttpResponse;
    }

    /* renamed from: a */
    private static HttpEntity m10941a(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            errorStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(errorStream);
        basicHttpEntity.setContentLength(httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    /* renamed from: a */
    protected HttpURLConnection m10939a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private HttpURLConnection m10938a(URL url, AbstractC0795l<?> abstractC0795l) {
        HttpURLConnection m10939a = m10939a(url);
        int m11015t = abstractC0795l.m11015t();
        m10939a.setConnectTimeout(m11015t);
        m10939a.setReadTimeout(m11015t);
        m10939a.setUseCaches(false);
        m10939a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f2368b != null) {
            ((HttpsURLConnection) m10939a).setSSLSocketFactory(this.f2368b);
        }
        return m10939a;
    }

    /* renamed from: a */
    static void m10940a(HttpURLConnection httpURLConnection, AbstractC0795l<?> abstractC0795l) {
        switch (abstractC0795l.m11039a()) {
            case ItemInfo.NO_ID /* -1 */:
                byte[] mo10904m = abstractC0795l.mo10904m();
                if (mo10904m != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", abstractC0795l.mo10905l());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(mo10904m);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m10937b(httpURLConnection, abstractC0795l);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m10937b(httpURLConnection, abstractC0795l);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m10937b(httpURLConnection, abstractC0795l);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: b */
    private static void m10937b(HttpURLConnection httpURLConnection, AbstractC0795l<?> abstractC0795l) {
        byte[] mo10902q = abstractC0795l.mo10902q();
        if (mo10902q != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", abstractC0795l.mo10903p());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(mo10902q);
            dataOutputStream.close();
        }
    }
}
