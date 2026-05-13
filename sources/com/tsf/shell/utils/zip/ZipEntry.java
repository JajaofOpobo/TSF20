package com.tsf.shell.utils.zip;
/* loaded from: classes.dex */
public class ZipEntry implements Cloneable {

    /* renamed from: a */
    String f13505a;

    /* renamed from: b */
    byte[] f13506b;

    private static native void initIDs();

    /* renamed from: a */
    public String m582a() {
        return this.f13505a;
    }

    public String toString() {
        return m582a();
    }

    public int hashCode() {
        return this.f13505a.hashCode();
    }

    public Object clone() {
        try {
            ZipEntry zipEntry = (ZipEntry) super.clone();
            zipEntry.f13506b = this.f13506b == null ? null : (byte[]) this.f13506b.clone();
            return zipEntry;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
