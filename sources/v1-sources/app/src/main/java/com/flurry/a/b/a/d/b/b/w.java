package com.flurry.a.b.a.d.b.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w extends n {
    @Override // com.flurry.a.b.a.d.b.b.n
    protected final /* synthetic */ Object a(Object obj, com.flurry.a.b.a.d.p pVar) {
        if (!(obj instanceof byte[])) {
            super.a(obj, pVar);
            return null;
        }
        byte[] bArr = (byte[]) obj;
        if (bArr.length != 16) {
            pVar.b("Can only construct UUIDs from 16 byte arrays; got " + bArr.length + " bytes");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        return new UUID(dataInputStream.readLong(), dataInputStream.readLong());
    }

    @Override // com.flurry.a.b.a.d.b.b.n
    protected final /* synthetic */ Object a(String str) {
        return UUID.fromString(str);
    }

    public w() {
        super(UUID.class);
    }
}
