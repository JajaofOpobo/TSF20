package com.censivn.C3DEngine.e;

import android.content.res.Resources;
import android.util.Log;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.e.AbstractModelParser;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MD2Parser extends AbstractModelParser implements IModelParser {
    private MD2Header n;
    private String o;
    private com.censivn.C3DEngine.b.a.MeshData[] p;

    public MD2Parser(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
    }

    @Override // com.censivn.C3DEngine.e.AbstractModelParser, com.censivn.C3DEngine.e.IModelParser
    public void c() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.a.openRawResource(this.a.getIdentifier(this.b, null, null)));
        this.f = new MeshData();
        this.n = new MD2Header();
        Log.d("Censivn3D", "Start parsing MD2 file");
        try {
            this.n.a(bufferedInputStream);
            this.p = new com.censivn.C3DEngine.b.a.MeshData[this.n.k];
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

    private void a(BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        LittleEndianInputStream cVar = new LittleEndianInputStream(new ByteArrayInputStream(bArr, this.n.l - 68, bArr.length - this.n.l));
        for (int i = 0; i < this.n.f; i++) {
            String strA = cVar.a(64);
            StringBuffer stringBuffer = new StringBuffer(this.c);
            stringBuffer.append(":drawable/");
            StringBuffer stringBuffer2 = new StringBuffer(strA.substring(strA.lastIndexOf("/") + 1, strA.length()).toLowerCase());
            int iLastIndexOf = stringBuffer2.lastIndexOf(".");
            if (iLastIndexOf > -1) {
                stringBuffer.append(stringBuffer2.substring(0, iLastIndexOf));
            } else {
                stringBuffer.append(stringBuffer2);
            }
            this.o = stringBuffer.toString();
            this.h.a(new TextureEntry(this.o, this.o));
        }
    }

    private void b(BufferedInputStream bufferedInputStream, byte[] bArr) {
        LittleEndianInputStream cVar = new LittleEndianInputStream(new ByteArrayInputStream(bArr, this.n.m - 68, bArr.length - this.n.m));
        for (int i = 0; i < this.n.h; i++) {
            this.f.d.add(new Uv(cVar.readShort() / this.n.c, cVar.readShort() / this.n.d));
        }
    }

    private void c(BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        String strReplaceAll;
        LittleEndianInputStream cVar = new LittleEndianInputStream(new ByteArrayInputStream(bArr, this.n.o - 68, bArr.length - this.n.o));
        new ArrayList();
        for (int i = 0; i < this.n.k; i++) {
            float f = cVar.readFloat();
            float f2 = cVar.readFloat();
            float f3 = cVar.readFloat();
            float f4 = cVar.readFloat();
            float f5 = cVar.readFloat();
            float f6 = cVar.readFloat();
            String strA = cVar.a(16);
            if (strA.indexOf("_") > 0) {
                strReplaceAll = strA.subSequence(0, strA.lastIndexOf("_")).toString();
            } else {
                strReplaceAll = strA.substring(0, 6).replaceAll("[0-9]{1,2}$", "");
            }
            Log.d("Censivn3D", "frame name: " + strReplaceAll);
            float[] fArr = new float[this.n.g * 3];
            int i2 = 0;
            for (int i3 = 0; i3 < this.n.g; i3++) {
                int i4 = i2 + 1;
                fArr[i2] = (cVar.readUnsignedByte() * f) + f4;
                int i5 = i4 + 1;
                fArr[i4] = (cVar.readUnsignedByte() * f2) + f5;
                i2 = i5 + 1;
                fArr[i5] = (cVar.readUnsignedByte() * f3) + f6;
                cVar.readUnsignedByte();
                if (i == 0) {
                    this.f.c.add(new Number3d(fArr[i2 - 3], fArr[i2 - 2], fArr[i2 - 1]));
                }
            }
            this.p[i] = new com.censivn.C3DEngine.b.a.MeshData(strReplaceAll, fArr);
        }
    }

    private void d(BufferedInputStream bufferedInputStream, byte[] bArr) throws IOException {
        LittleEndianInputStream cVar = new LittleEndianInputStream(new ByteArrayInputStream(bArr, this.n.n - 68, bArr.length - this.n.n));
        int[] iArr = new int[this.n.i * 3];
        int i = 0;
        for (int i2 = 0; i2 < this.n.i; i2++) {
            int unsignedShort = cVar.readUnsignedShort();
            int[] iArr2 = {unsignedShort, unsignedShort, unsignedShort};
            iArr[i + 2] = unsignedShort;
            int unsignedShort2 = cVar.readUnsignedShort();
            iArr[i + 1] = unsignedShort2;
            int unsignedShort3 = cVar.readUnsignedShort();
            iArr[i] = unsignedShort3;
            i += 3;
            int[] iArr3 = {cVar.readUnsignedShort(), cVar.readUnsignedShort(), cVar.readUnsignedShort()};
            FaceGroup hVar = new FaceGroup();
            hVar.b = iArr2;
            hVar.c = iArr3;
            hVar.f = true;
            hVar.g = true;
            hVar.e = 3;
            hVar.h = this.o;
            this.f.b++;
            this.f.a.add(hVar);
            this.f.a(hVar);
        }
        for (int i3 = 0; i3 < this.n.k; i3++) {
            this.p[i3].a(iArr);
        }
    }

    private class MD2Header {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;

        private MD2Header() {
        }

        public void a(InputStream inputStream) throws Exception {
            this.a = MD2Parser.this.b(inputStream);
            this.b = MD2Parser.this.b(inputStream);
            if (this.a != 844121161 || this.b != 8) {
                throw new Exception("This is not a valid MD2 file.");
            }
            this.c = MD2Parser.this.b(inputStream);
            this.d = MD2Parser.this.b(inputStream);
            this.e = MD2Parser.this.b(inputStream);
            this.f = MD2Parser.this.b(inputStream);
            this.g = MD2Parser.this.b(inputStream);
            this.h = MD2Parser.this.b(inputStream);
            this.i = MD2Parser.this.b(inputStream);
            this.j = MD2Parser.this.b(inputStream);
            this.k = MD2Parser.this.b(inputStream);
            this.l = MD2Parser.this.b(inputStream);
            this.m = MD2Parser.this.b(inputStream);
            this.n = MD2Parser.this.b(inputStream);
            this.o = MD2Parser.this.b(inputStream);
            this.p = MD2Parser.this.b(inputStream);
            this.q = MD2Parser.this.b(inputStream);
        }
    }
}
