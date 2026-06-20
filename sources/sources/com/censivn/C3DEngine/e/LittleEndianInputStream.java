package com.censivn.C3DEngine.e;

import com.flurry.android.Constants;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends InputStream implements DataInput {
    private DataInputStream a;
    private InputStream b;
    private byte[] c = new byte[8];

    public c(InputStream inputStream) {
        this.b = inputStream;
        this.a = new DataInputStream(inputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.a.readFully(this.c, 0, 2);
        return (short) (((this.c[1] & Constants.UNKNOWN) << 8) | (this.c[0] & Constants.UNKNOWN));
    }

    public String a(int i) throws IOException {
        if (i == 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.a.readFully(bArr);
        return new String(bArr, "US-ASCII");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.a.readFully(this.c, 0, 2);
        return ((this.c[1] & Constants.UNKNOWN) << 8) | (this.c[0] & Constants.UNKNOWN);
    }

    @Override // java.io.DataInput
    public final char readChar() throws IOException {
        this.a.readFully(this.c, 0, 2);
        return (char) (((this.c[1] & Constants.UNKNOWN) << 8) | (this.c[0] & Constants.UNKNOWN));
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.a.readFully(this.c, 0, 4);
        return (this.c[3] << 24) | ((this.c[2] & Constants.UNKNOWN) << 16) | ((this.c[1] & Constants.UNKNOWN) << 8) | (this.c[0] & Constants.UNKNOWN);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.a.readFully(this.c, 0, 8);
        return (((long) this.c[7]) << 56) | (((long) (this.c[6] & Constants.UNKNOWN)) << 48) | (((long) (this.c[5] & Constants.UNKNOWN)) << 40) | (((long) (this.c[4] & Constants.UNKNOWN)) << 32) | (((long) (this.c[3] & Constants.UNKNOWN)) << 24) | (((long) (this.c[2] & Constants.UNKNOWN)) << 16) | (((long) (this.c[1] & Constants.UNKNOWN)) << 8) | ((long) (this.c[0] & Constants.UNKNOWN));
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
        return this.b.read(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.a.readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return this.a.skipBytes(i);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return this.a.readByte();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.b.read();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    @Deprecated
    public final String readLine() {
        return this.a.readLine();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return this.a.readUTF();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
