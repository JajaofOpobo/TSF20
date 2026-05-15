package com.android.volley.toolbox;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g implements f {
    private final a a;
    private final SSLSocketFactory b;

    public interface a {
        String a(String str);
    }

    public g() {
        this(null);
    }

    public g(a aVar) {
        this(aVar, null);
    }

    public g(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.a = aVar;
        this.b = sSLSocketFactory;
    }

    @Override // com.android.volley.toolbox.f
    public HttpResponse a(com.android.volley.l<?> lVar, Map<String, String> map) throws IOException {
        String strA;
        String strD = lVar.d();
        HashMap map2 = new HashMap();
        map2.putAll(lVar.i());
        map2.putAll(map);
        if (this.a != null) {
            strA = this.a.a(strD);
            if (strA == null) {
                throw new IOException("URL blocked by rewriter: " + strD);
            }
        } else {
            strA = strD;
        }
        HttpURLConnection httpURLConnectionA = a(new URL(strA), lVar);
        for (String str : map2.keySet()) {
            httpURLConnectionA.addRequestProperty(str, (String) map2.get(str));
        }
        a(httpURLConnectionA, lVar);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnectionA.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, httpURLConnectionA.getResponseCode(), httpURLConnectionA.getResponseMessage()));
        basicHttpResponse.setEntity(a(httpURLConnectionA));
        for (Map.Entry<String, List<String>> entry : httpURLConnectionA.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return basicHttpResponse;
    }

    private static HttpEntity a(HttpURLConnection httpURLConnection) {
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

    protected HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private HttpURLConnection a(URL url, com.android.volley.l<?> lVar) {
        HttpURLConnection httpURLConnectionA = a(url);
        int iT = lVar.t();
        httpURLConnectionA.setConnectTimeout(iT);
        httpURLConnectionA.setReadTimeout(iT);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.b != null) {
            ((HttpsURLConnection) httpURLConnectionA).setSSLSocketFactory(this.b);
        }
        return httpURLConnectionA;
    }

    static void a(HttpURLConnection httpURLConnection, com.android.volley.l<?> lVar) throws ProtocolException {
        switch (lVar.a()) {
            case ItemInfo.NO_ID /* -1 */:
                byte[] bArrM = lVar.m();
                if (bArrM != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", lVar.l());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrM);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, lVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                b(httpURLConnection, lVar);
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
                b(httpURLConnection, lVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void b(HttpURLConnection httpURLConnection, com.android.volley.l<?> lVar) {
        byte[] bArrQ = lVar.q();
        if (bArrQ != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", lVar.p());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrQ);
            dataOutputStream.close();
        }
    }
}
