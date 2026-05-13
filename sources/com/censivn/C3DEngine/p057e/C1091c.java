package com.censivn.C3DEngine.p057e;

import com.flurry.android.Constants;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
/* renamed from: com.censivn.C3DEngine.e.c */
/* loaded from: classes.dex */
public class C1091c extends InputStream implements DataInput {

    /* renamed from: a */
    private DataInputStream f3459a;

    /* renamed from: b */
    private InputStream f3460b;

    /* renamed from: c */
    private byte[] f3461c = new byte[8];

    public C1091c(InputStream inputStream) {
        this.f3460b = inputStream;
        this.f3459a = new DataInputStream(inputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f3459a.available();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f3459a.readFully(this.f3461c, 0, 2);
        return (short) (((this.f3461c[1] & Constants.UNKNOWN) << 8) | (this.f3461c[0] & Constants.UNKNOWN));
    }

    /* renamed from: a */
    public String m9884a(int i) {
        if (i == 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f3459a.readFully(bArr);
        return new String(bArr, "US-ASCII");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f3459a.readFully(this.f3461c, 0, 2);
        return ((this.f3461c[1] & Constants.UNKNOWN) << 8) | (this.f3461c[0] & Constants.UNKNOWN);
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f3459a.readFully(this.f3461c, 0, 2);
        return (char) (((this.f3461c[1] & Constants.UNKNOWN) << 8) | (this.f3461c[0] & Constants.UNKNOWN));
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f3459a.readFully(this.f3461c, 0, 4);
        return (this.f3461c[3] << 24) | ((this.f3461c[2] & Constants.UNKNOWN) << 16) | ((this.f3461c[1] & Constants.UNKNOWN) << 8) | (this.f3461c[0] & Constants.UNKNOWN);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f3459a.readFully(this.f3461c, 0, 8);
        return (this.f3461c[7] << 56) | ((this.f3461c[6] & Constants.UNKNOWN) << 48) | ((this.f3461c[5] & Constants.UNKNOWN) << 40) | ((this.f3461c[4] & Constants.UNKNOWN) << 32) | ((this.f3461c[3] & Constants.UNKNOWN) << 24) | ((this.f3461c[2] & Constants.UNKNOWN) << 16) | ((this.f3461c[1] & Constants.UNKNOWN) << 8) | (this.f3461c[0] & Constants.UNKNOWN);
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f3460b.read(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f3459a.readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f3459a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return this.f3459a.skipBytes(i);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return this.f3459a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return this.f3459a.readByte();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f3460b.read();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return this.f3459a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    @Deprecated
    public final String readLine() {
        return this.f3459a.readLine();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return this.f3459a.readUTF();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3459a.close();
    }
}
