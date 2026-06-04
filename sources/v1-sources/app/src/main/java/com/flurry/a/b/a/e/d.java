package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends s {
    static final d c = new d(new byte[0]);
    final byte[] d;

    private d(byte[] bArr) {
        this.d = bArr;
    }

    public static d a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return c;
        }
        return new d(bArr);
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return com.flurry.a.b.a.b.a().a(this.d, false);
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.a(this.d);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return Arrays.equals(((d) obj).d, this.d);
    }

    public final int hashCode() {
        if (this.d == null) {
            return -1;
        }
        return this.d.length;
    }

    @Override // com.flurry.a.b.a.e.s, com.flurry.a.b.a.h
    public final String toString() {
        return com.flurry.a.b.a.b.a().a(this.d, true);
    }
}
