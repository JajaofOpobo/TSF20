package com.android.volley.toolbox;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l extends ByteArrayOutputStream {
    private final b a;

    public l(b bVar, int i) {
        this.a = bVar;
        this.buf = this.a.a(Math.max(i, ItemInfo.APP_VERSION_CODE));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.a.a(this.buf);
    }

    private void a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] bArrA = this.a.a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, bArrA, 0, this.count);
            this.a.a(this.buf);
            this.buf = bArrA;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
