package com.p019a.p020a;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
/* renamed from: com.a.a.b */
/* loaded from: classes.dex */
public class C0776b {

    /* renamed from: a */
    private static String f2243a = "Net";

    /* renamed from: a */
    public static InputStream m11054a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (execute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = execute.getEntity();
        if (entity != null) {
            return entity.getContent();
        }
        throw new IOException();
    }
}
