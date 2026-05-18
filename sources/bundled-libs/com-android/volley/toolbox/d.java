package com.android.volley.toolbox;

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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements f {
    protected final HttpClient a;

    public d(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.f
    public HttpResponse a(com.android.volley.l<?> lVar, Map<String, String> map) {
        HttpUriRequest httpUriRequestB = b(lVar, map);
        a(httpUriRequestB, map);
        a(httpUriRequestB, lVar.i());
        a(httpUriRequestB);
        HttpParams params = httpUriRequestB.getParams();
        int iT = lVar.t();
        HttpConnectionParams.setConnectionTimeout(params, ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
        HttpConnectionParams.setSoTimeout(params, iT);
        return this.a.execute(httpUriRequestB);
    }

    static HttpUriRequest b(com.android.volley.l<?> lVar, Map<String, String> map) {
        switch (lVar.a()) {
            case ItemInfo.NO_ID /* -1 */:
                byte[] bArrM = lVar.m();
                if (bArrM != null) {
                    HttpPost httpPost = new HttpPost(lVar.d());
                    httpPost.addHeader("Content-Type", lVar.l());
                    httpPost.setEntity(new ByteArrayEntity(bArrM));
                    return httpPost;
                }
                return new HttpGet(lVar.d());
            case 0:
                return new HttpGet(lVar.d());
            case 1:
                HttpPost httpPost2 = new HttpPost(lVar.d());
                httpPost2.addHeader("Content-Type", lVar.p());
                a(httpPost2, lVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(lVar.d());
                httpPut.addHeader("Content-Type", lVar.p());
                a(httpPut, lVar);
                return httpPut;
            case 3:
                return new HttpDelete(lVar.d());
            case 4:
                return new HttpHead(lVar.d());
            case 5:
                return new HttpOptions(lVar.d());
            case 6:
                return new HttpTrace(lVar.d());
            case 7:
                a aVar = new a(lVar.d());
                aVar.addHeader("Content-Type", lVar.p());
                a(aVar, lVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, com.android.volley.l<?> lVar) {
        byte[] bArrQ = lVar.q();
        if (bArrQ != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(bArrQ));
        }
    }

    protected void a(HttpUriRequest httpUriRequest) {
    }

    public static final class a extends HttpEntityEnclosingRequestBase {
        public a() {
        }

        public a(String str) {
            setURI(URI.create(str));
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return "PATCH";
        }
    }
}
