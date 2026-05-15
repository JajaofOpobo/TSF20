package com.tsf.shell.plugin.notice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public static byte[] a(String str) throws IOException {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse httpResponseExecute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = httpResponseExecute.getEntity();
        if (entity != null) {
            InputStream content = entity.getContent();
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = content.read(bArr, 0, 1024);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    try {
                        content.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                throw e2;
            }
        }
        throw new IOException();
    }

    public static InputStream b(String str) throws IOException {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse httpResponseExecute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = httpResponseExecute.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }
}
