package com.censivn.utils.zip;

/* loaded from: classes.dex */
public class ZipEntry implements Cloneable {
    String a;
    byte[] b;

    private static native void initIDs();

    public String toString() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object clone() {
        try {
            ZipEntry zipEntry = (ZipEntry) super.clone();
            zipEntry.b = this.b == null ? null : (byte[]) this.b.clone();
            return zipEntry;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
