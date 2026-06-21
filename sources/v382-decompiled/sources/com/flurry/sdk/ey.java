package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ey implements ex {
    @Override // com.flurry.sdk.ex
    public void a(OutputStream outputStream, String str) {
        if (outputStream != null && str != null) {
            byte[] bytes = str.getBytes("utf-8");
            outputStream.write(bytes, 0, bytes.length);
        }
    }

    @Override // com.flurry.sdk.ex
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fe.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
}
