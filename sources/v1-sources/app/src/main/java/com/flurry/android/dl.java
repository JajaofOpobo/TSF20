package com.flurry.android;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class dl {
    private static int a = 1;
    private final int b;
    private final long c;
    private final String d;
    private List e;

    dl(long j, String str) {
        int i = a;
        a = i + 1;
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = new ArrayList();
    }

    dl(DataInput dataInput) {
        this.b = dataInput.readInt();
        this.c = dataInput.readLong();
        this.d = dataInput.readUTF();
        this.e = new ArrayList();
        short readShort = dataInput.readShort();
        for (short s = 0; s < readShort; s = (short) (s + 1)) {
            this.e.add(new cg(dataInput));
        }
    }

    final void a(cg cgVar) {
        this.e.add(cgVar);
    }

    final void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b);
        dataOutput.writeLong(this.c);
        dataOutput.writeUTF(this.d);
        dataOutput.writeShort(this.e.size());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((cg) it.next()).a(dataOutput);
        }
    }

    final int a() {
        return this.b;
    }

    final String b() {
        return this.d;
    }

    final long c() {
        return this.c;
    }

    final List d() {
        return this.e;
    }
}
