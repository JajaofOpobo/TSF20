package com.cm.a;

import android.util.Log;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private int a = 0;

    public static byte[] a(String str) {
        return new a().b(str);
    }

    private byte[] b(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        bArrA = null;
        bArrA = null;
        byte[] bArrA = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection3.setConnectTimeout(60000);
                httpURLConnection3.setReadTimeout(60000);
                if (httpURLConnection3 != null) {
                    httpURLConnection = (HttpURLConnection) a((URLConnection) httpURLConnection3);
                    if (httpURLConnection != null) {
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            switch (responseCode) {
                                case VEasing.Back.easeIn /* 200 */:
                                    bArrA = a(httpURLConnection.getInputStream());
                                    break;
                            }
                            Log.e("AdwareHttpConnector", Integer.toString(responseCode));
                        } catch (Throwable th) {
                            httpURLConnection2 = httpURLConnection3;
                            th = th;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    }
                } else {
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return bArrA;
            } catch (Throwable th2) {
                httpURLConnection = null;
                httpURLConnection2 = httpURLConnection3;
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    private URLConnection a(URLConnection uRLConnection) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.a = 0;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 302 || responseCode == 301) {
            return a(httpURLConnection);
        }
        return uRLConnection;
    }

    private URLConnection a(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        String headerField;
        try {
            try {
                headerField = httpURLConnection.getHeaderField("location");
                httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
            } catch (Exception e) {
                httpURLConnection2 = null;
            }
            try {
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 302 && responseCode != 301) {
                    if (httpURLConnection == null) {
                        return httpURLConnection2;
                    }
                    httpURLConnection.disconnect();
                    return httpURLConnection2;
                }
                if (headerField.equalsIgnoreCase(httpURLConnection2.getHeaderField("location")) || this.a > 20) {
                    return null;
                }
                this.a++;
                URLConnection uRLConnectionA = a(httpURLConnection2);
                if (httpURLConnection == null) {
                    return uRLConnectionA;
                }
                httpURLConnection.disconnect();
                return uRLConnectionA;
            } catch (Exception e2) {
                if (httpURLConnection == null) {
                    return httpURLConnection2;
                }
                httpURLConnection.disconnect();
                return httpURLConnection2;
            }
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private byte[] a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
