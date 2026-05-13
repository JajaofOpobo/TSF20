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
/* renamed from: com.tsf.shell.plugin.notice.d */
/* loaded from: classes.dex */
public class C3816d {
    /* renamed from: a */
    public static byte[] m1373a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (execute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = execute.getEntity();
        if (entity != null) {
            InputStream content = entity.getContent();
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = content.read(bArr, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
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

    /* renamed from: b */
    public static InputStream m1372b(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (execute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = execute.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }
}
