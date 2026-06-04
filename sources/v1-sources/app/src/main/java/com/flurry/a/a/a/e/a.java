package com.flurry.a.a.a.e;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class a implements CharSequence, Comparable {
    private static final byte[] a = new byte[0];
    private byte[] b;
    private int c;
    private String d;

    public a() {
        this.b = a;
    }

    public a(String str) {
        this.b = a;
        this.b = a(str);
        this.c = this.b.length;
        this.d = str;
    }

    public a(a aVar) {
        this.b = a;
        this.c = aVar.c;
        this.b = new byte[aVar.c];
        System.arraycopy(aVar.b, 0, this.b, 0, this.c);
        this.d = aVar.d;
    }

    public final byte[] a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final a a(int i) {
        if (this.c < i) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, 0, bArr, 0, this.c);
            this.b = bArr;
        }
        this.c = i;
        this.d = null;
        return this;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.d == null) {
            try {
                this.d = new String(this.b, 0, this.c, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.c != aVar.c) {
            return false;
        }
        byte[] bArr = aVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a aVar) {
        return com.flurry.a.a.a.c.a.a(this.b, this.c, aVar.b, aVar.c);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}
