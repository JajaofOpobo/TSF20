package com.flurry.sdk;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class eh implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
