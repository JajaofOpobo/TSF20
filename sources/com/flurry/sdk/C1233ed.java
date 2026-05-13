package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;
/* renamed from: com.flurry.sdk.ed */
/* loaded from: classes.dex */
public class C1233ed extends MessageDigest {

    /* renamed from: a */
    private CRC32 f3960a;

    public C1233ed() {
        super("CRC");
        this.f3960a = new CRC32();
    }

    @Override // java.security.MessageDigestSpi
    protected void engineReset() {
        this.f3960a.reset();
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte b) {
        this.f3960a.update(b);
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f3960a.update(bArr, i, i2);
    }

    @Override // java.security.MessageDigestSpi
    protected byte[] engineDigest() {
        long value = this.f3960a.getValue();
        return new byte[]{(byte) (((-16777216) & value) >> 24), (byte) ((16711680 & value) >> 16), (byte) ((65280 & value) >> 8), (byte) ((value & 255) >> 0)};
    }

    /* renamed from: a */
    public byte[] m9297a() {
        return engineDigest();
    }

    /* renamed from: b */
    public int m9296b() {
        return ByteBuffer.wrap(engineDigest()).getInt();
    }
}
