package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.flurry.sdk.ey */
/* loaded from: classes.dex */
public class C1269ey implements InterfaceC1268ex<String> {
    @Override // com.flurry.sdk.InterfaceC1268ex
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo9195a(OutputStream outputStream, String str) {
        if (outputStream != null && str != null) {
            byte[] bytes = str.getBytes("utf-8");
            outputStream.write(bytes, 0, bytes.length);
        }
    }

    @Override // com.flurry.sdk.InterfaceC1268ex
    /* renamed from: b */
    public String mo9196a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1277fe.m9151a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
