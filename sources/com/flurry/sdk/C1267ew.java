package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.flurry.sdk.ew */
/* loaded from: classes.dex */
public class C1267ew implements InterfaceC1268ex<byte[]> {
    @Override // com.flurry.sdk.InterfaceC1268ex
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo9195a(OutputStream outputStream, byte[] bArr) {
        if (outputStream != null && bArr != null) {
            outputStream.write(bArr, 0, bArr.length);
        }
    }

    @Override // com.flurry.sdk.InterfaceC1268ex
    /* renamed from: b */
    public byte[] mo9196a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1277fe.m9151a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
