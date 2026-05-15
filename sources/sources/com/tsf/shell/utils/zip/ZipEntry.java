package com.tsf.shell.utils.zip;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ZipEntry implements Cloneable {
    String a;
    byte[] b;

    private static native void initIDs();

    public String a() {
        return this.a;
    }

    public String toString() {
        return a();
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
