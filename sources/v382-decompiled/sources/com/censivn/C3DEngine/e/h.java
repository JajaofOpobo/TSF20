package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends a implements f {
    private i n;
    private String o;
    private com.censivn.C3DEngine.b.a.a[] p;

    public h(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
    }

    @Override // com.censivn.C3DEngine.e.a, com.censivn.C3DEngine.e.f
    public void c() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.a.openRawResource(this.a.getIdentifier(this.b, null, null)));
        this.f = new m();
        this.n = new i(this, null);
        Log.d("Censivn3D", "Start parsing MD2 file");
        try {
            this.n.a(bufferedInputStream);
            this.p = new com.censivn.C3DEngine.b.a.a[this.n.k];
            byte[] bArr = new byte[this.n.q - 68];
            bufferedInputStream.read(bArr);
            a(bufferedInputStream, bArr);
            b(bufferedInputStream, bArr);
            c(bufferedInputStream, bArr);
            d(bufferedInputStream, bArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(BufferedInputStream bufferedInputStream, byte[] bArr) {
        g gVar = new g(new ByteArrayInputStream(bArr, this.n.l - 68, bArr.length - this.n.l));
        for (int i = 0; i < this.n.f; i++) {
            String a = gVar.a(64);
            StringBuffer stringBuffer = new StringBuffer(this.c);
            stringBuffer.append(":drawable/");
            StringBuffer stringBuffer2 = new StringBuffer(a.substring(a.lastIndexOf("/") + 1, a.length()).toLowerCase());
            int lastIndexOf = stringBuffer2.lastIndexOf(".");
            if (lastIndexOf > -1) {
                stringBuffer.append(stringBuffer2.substring(0, lastIndexOf));
            } else {
                stringBuffer.append(stringBuffer2);
            }
            this.o = stringBuffer.toString();
            this.h.a(new b(this, this.o, this.o));
        }
    }

    private void b(BufferedInputStream bufferedInputStream, byte[] bArr) {
        g gVar = new g(new ByteArrayInputStream(bArr, this.n.m - 68, bArr.length - this.n.m));
        for (int i = 0; i < this.n.h; i++) {
            this.f.d.add(new Uv(gVar.readShort() / this.n.c, gVar.readShort() / this.n.d));
        }
    }

    private void c(BufferedInputStream bufferedInputStream, byte[] bArr) {
        String replaceAll;
        g gVar = new g(new ByteArrayInputStream(bArr, this.n.o - 68, bArr.length - this.n.o));
        new ArrayList();
        for (int i = 0; i < this.n.k; i++) {
            float readFloat = gVar.readFloat();
            float readFloat2 = gVar.readFloat();
            float readFloat3 = gVar.readFloat();
            float readFloat4 = gVar.readFloat();
            float readFloat5 = gVar.readFloat();
            float readFloat6 = gVar.readFloat();
            String a = gVar.a(16);
            if (a.indexOf("_") > 0) {
                replaceAll = a.subSequence(0, a.lastIndexOf("_")).toString();
            } else {
                replaceAll = a.substring(0, 6).replaceAll("[0-9]{1,2}$", "");
            }
            Log.d("Censivn3D", "frame name: " + replaceAll);
            float[] fArr = new float[this.n.g * 3];
            int i2 = 0;
            for (int i3 = 0; i3 < this.n.g; i3++) {
                int i4 = i2 + 1;
                fArr[i2] = (gVar.readUnsignedByte() * readFloat) + readFloat4;
                int i5 = i4 + 1;
                fArr[i4] = (gVar.readUnsignedByte() * readFloat2) + readFloat5;
                i2 = i5 + 1;
                fArr[i5] = (gVar.readUnsignedByte() * readFloat3) + readFloat6;
                gVar.readUnsignedByte();
                if (i == 0) {
                    this.f.c.add(new Number3d(fArr[i2 - 3], fArr[i2 - 2], fArr[i2 - 1]));
                }
            }
            this.p[i] = new com.censivn.C3DEngine.b.a.a(replaceAll, fArr);
        }
    }

    private void d(BufferedInputStream bufferedInputStream, byte[] bArr) {
        g gVar = new g(new ByteArrayInputStream(bArr, this.n.n - 68, bArr.length - this.n.n));
        int[] iArr = new int[this.n.i * 3];
        int i = 0;
        for (int i2 = 0; i2 < this.n.i; i2++) {
            int readUnsignedShort = gVar.readUnsignedShort();
            int[] iArr2 = {r7, r8, readUnsignedShort};
            iArr[i + 2] = readUnsignedShort;
            int readUnsignedShort2 = gVar.readUnsignedShort();
            iArr[i + 1] = readUnsignedShort2;
            int readUnsignedShort3 = gVar.readUnsignedShort();
            iArr[i] = readUnsignedShort3;
            i += 3;
            int[] iArr3 = {gVar.readUnsignedShort(), gVar.readUnsignedShort(), gVar.readUnsignedShort()};
            n nVar = new n();
            nVar.b = iArr2;
            nVar.c = iArr3;
            nVar.f = true;
            nVar.g = true;
            nVar.e = 3;
            nVar.h = this.o;
            this.f.b++;
            this.f.a.add(nVar);
            this.f.a(nVar);
        }
        for (int i3 = 0; i3 < this.n.k; i3++) {
            this.p[i3].a(iArr);
        }
    }
}
