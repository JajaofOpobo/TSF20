package com.tsf.shell.plugin.themepicker.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
class i extends FilterOutputStream {
    final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i(h hVar, OutputStream outputStream) {
        super(outputStream);
        this.a = hVar;
    }

    /* synthetic */ i(h hVar, OutputStream outputStream, i iVar) {
        this(hVar, outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            this.a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            this.a.c = true;
        }
    }
}
