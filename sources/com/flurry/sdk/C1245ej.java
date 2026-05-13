package com.flurry.sdk;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* renamed from: com.flurry.sdk.ej */
/* loaded from: classes.dex */
public class C1245ej implements X509TrustManager {

    /* renamed from: a */
    private X509TrustManager f3980a;

    public C1245ej(KeyStore keyStore) {
        this.f3980a = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.f3980a = (X509TrustManager) trustManagers[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f3980a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr != null && x509CertificateArr.length == 1) {
            x509CertificateArr[0].checkValidity();
        } else {
            this.f3980a.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f3980a.getAcceptedIssuers();
    }
}
