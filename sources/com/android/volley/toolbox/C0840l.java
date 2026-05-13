package com.android.volley.toolbox;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.ByteArrayOutputStream;
/* renamed from: com.android.volley.toolbox.l */
/* loaded from: classes.dex */
public class C0840l extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C0816b f2399a;

    public C0840l(C0816b c0816b, int i) {
        this.f2399a = c0816b;
        this.buf = this.f2399a.m10973a(Math.max(i, (int) ItemInfo.APP_VERSION_CODE));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2399a.m10972a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2399a.m10972a(this.buf);
    }

    /* renamed from: a */
    private void m10901a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] m10973a = this.f2399a.m10973a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, m10973a, 0, this.count);
            this.f2399a.m10972a(this.buf);
            this.buf = m10973a;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m10901a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m10901a(1);
        super.write(i);
    }
}
