package com.a.a;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static String a = "Net";

    public static InputStream a(String str) throws IOException {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse httpResponseExecute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = httpResponseExecute.getEntity();
        if (entity != null) {
            return entity.getContent();
        }
        throw new IOException();
    }
}
