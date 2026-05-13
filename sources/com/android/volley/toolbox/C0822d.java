package com.android.volley.toolbox;

import com.android.volley.AbstractC0795l;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.net.URI;
import java.util.Map;
import org.acra.ACRAConstants;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
/* renamed from: com.android.volley.toolbox.d */
/* loaded from: classes.dex */
public class C0822d implements InterfaceC0825f {

    /* renamed from: a */
    protected final HttpClient f2366a;

    public C0822d(HttpClient httpClient) {
        this.f2366a = httpClient;
    }

    /* renamed from: a */
    private static void m10948a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.InterfaceC0825f
    /* renamed from: a */
    public HttpResponse mo10942a(AbstractC0795l<?> abstractC0795l, Map<String, String> map) {
        HttpUriRequest m10947b = m10947b(abstractC0795l, map);
        m10948a(m10947b, map);
        m10948a(m10947b, abstractC0795l.m11020i());
        m10949a(m10947b);
        HttpParams params = m10947b.getParams();
        int m11015t = abstractC0795l.m11015t();
        HttpConnectionParams.setConnectionTimeout(params, ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
        HttpConnectionParams.setSoTimeout(params, m11015t);
        return this.f2366a.execute(m10947b);
    }

    /* renamed from: b */
    static HttpUriRequest m10947b(AbstractC0795l<?> abstractC0795l, Map<String, String> map) {
        switch (abstractC0795l.m11039a()) {
            case ItemInfo.NO_ID /* -1 */:
                byte[] mo10904m = abstractC0795l.mo10904m();
                if (mo10904m != null) {
                    HttpPost httpPost = new HttpPost(abstractC0795l.m11025d());
                    httpPost.addHeader("Content-Type", abstractC0795l.mo10905l());
                    httpPost.setEntity(new ByteArrayEntity(mo10904m));
                    return httpPost;
                }
                return new HttpGet(abstractC0795l.m11025d());
            case 0:
                return new HttpGet(abstractC0795l.m11025d());
            case 1:
                HttpPost httpPost2 = new HttpPost(abstractC0795l.m11025d());
                httpPost2.addHeader("Content-Type", abstractC0795l.mo10903p());
                m10950a((HttpEntityEnclosingRequestBase) httpPost2, abstractC0795l);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(abstractC0795l.m11025d());
                httpPut.addHeader("Content-Type", abstractC0795l.mo10903p());
                m10950a((HttpEntityEnclosingRequestBase) httpPut, abstractC0795l);
                return httpPut;
            case 3:
                return new HttpDelete(abstractC0795l.m11025d());
            case 4:
                return new HttpHead(abstractC0795l.m11025d());
            case 5:
                return new HttpOptions(abstractC0795l.m11025d());
            case 6:
                return new HttpTrace(abstractC0795l.m11025d());
            case 7:
                C0823a c0823a = new C0823a(abstractC0795l.m11025d());
                c0823a.addHeader("Content-Type", abstractC0795l.mo10903p());
                m10950a(c0823a, abstractC0795l);
                return c0823a;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    private static void m10950a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, AbstractC0795l<?> abstractC0795l) {
        byte[] mo10902q = abstractC0795l.mo10902q();
        if (mo10902q != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(mo10902q));
        }
    }

    /* renamed from: a */
    protected void m10949a(HttpUriRequest httpUriRequest) {
    }

    /* renamed from: com.android.volley.toolbox.d$a */
    /* loaded from: classes.dex */
    public static final class C0823a extends HttpEntityEnclosingRequestBase {
        public C0823a() {
        }

        public C0823a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }
}
