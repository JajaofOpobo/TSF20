package com.flurry.sdk;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.HttpParams;
/* renamed from: com.flurry.sdk.ek */
/* loaded from: classes.dex */
public final class C1246ek {

    /* renamed from: a */
    private static SchemeRegistry f3981a;

    /* renamed from: a */
    private static synchronized SchemeRegistry m9279a() {
        SchemeRegistry schemeRegistry;
        synchronized (C1246ek.class) {
            if (f3981a != null) {
                schemeRegistry = f3981a;
            } else {
                f3981a = new SchemeRegistry();
                f3981a.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                if (C1258eo.m9220d()) {
                    f3981a.register(new Scheme("https", new C1244ei(), 443));
                } else {
                    f3981a.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
                }
                schemeRegistry = f3981a;
            }
        }
        return schemeRegistry;
    }

    /* renamed from: a */
    public static HttpClient m9278a(HttpParams httpParams) {
        return new DefaultHttpClient(new SingleClientConnManager(httpParams, m9279a()), httpParams);
    }
}
