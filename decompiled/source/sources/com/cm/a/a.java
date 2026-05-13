package com.cm.a;

import android.util.Log;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public class a {
    private int a = 0;

    public static byte[] a(String str) {
        return new a().b(str);
    }

    private byte[] b(String str) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        r2 = null;
        r2 = null;
        byte[] bArr = null;
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
                                    bArr = a(httpURLConnection.getInputStream());
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
                return bArr;
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

    private URLConnection a(URLConnection uRLConnection) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.a = 0;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 302 || responseCode == 301) {
            return a(httpURLConnection);
        }
        return uRLConnection;
    }

    private URLConnection a(HttpURLConnection httpURLConnection) {
        String headerField;
        HttpURLConnection httpURLConnection2;
        try {
            try {
                headerField = httpURLConnection.getHeaderField("location");
                httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
            } catch (Exception e) {
            }
            try {
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 302 && responseCode != 301) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return httpURLConnection2;
                    }
                    return httpURLConnection2;
                } else if (headerField.equalsIgnoreCase(httpURLConnection2.getHeaderField("location")) || this.a > 20) {
                    return null;
                } else {
                    this.a++;
                    URLConnection a = a(httpURLConnection2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return a;
                    }
                    return a;
                }
            } catch (Exception e2) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return null;
                }
                return null;
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
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
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
