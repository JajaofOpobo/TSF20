package com.flurry.sdk;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
/* renamed from: com.flurry.sdk.eh */
/* loaded from: classes.dex */
public class C1243eh implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
