package com.censivn.C3DEngine.p057e;

import android.content.res.Resources;
import android.util.Log;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p032a.C0891a;
import com.censivn.C3DEngine.p057e.AbstractC1084a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.e.d */
/* loaded from: classes.dex */
public class C1092d extends AbstractC1084a implements InterfaceC1090b {

    /* renamed from: n */
    private C1094a f3462n;

    /* renamed from: o */
    private String f3463o;

    /* renamed from: p */
    private C0891a[] f3464p;

    public C1092d(Resources resources, String str, boolean z) {
        super(resources, str, Boolean.valueOf(z));
    }

    @Override // com.censivn.C3DEngine.p057e.AbstractC1084a, com.censivn.C3DEngine.p057e.InterfaceC1090b
    /* renamed from: c */
    public void mo9869c() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f3428a.openRawResource(this.f3428a.getIdentifier(this.f3429b, null, null)));
        this.f3433f = new C1098g();
        this.f3462n = new C1094a();
        Log.d("Censivn3D", "Start parsing MD2 file");
        try {
            this.f3462n.m9879a(bufferedInputStream);
            this.f3464p = new C0891a[this.f3462n.f3475k];
            byte[] bArr = new byte[this.f3462n.f3481q - 68];
            bufferedInputStream.read(bArr);
            m9883a(bufferedInputStream, bArr);
            m9882b(bufferedInputStream, bArr);
            m9881c(bufferedInputStream, bArr);
            m9880d(bufferedInputStream, bArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m9883a(BufferedInputStream bufferedInputStream, byte[] bArr) {
        C1091c c1091c = new C1091c(new ByteArrayInputStream(bArr, this.f3462n.f3476l - 68, bArr.length - this.f3462n.f3476l));
        for (int i = 0; i < this.f3462n.f3470f; i++) {
            String m9884a = c1091c.m9884a(64);
            StringBuffer stringBuffer = new StringBuffer(this.f3430c);
            stringBuffer.append(":drawable/");
            StringBuffer stringBuffer2 = new StringBuffer(m9884a.substring(m9884a.lastIndexOf("/") + 1, m9884a.length()).toLowerCase());
            int lastIndexOf = stringBuffer2.lastIndexOf(".");
            if (lastIndexOf > -1) {
                stringBuffer.append(stringBuffer2.substring(0, lastIndexOf));
            } else {
                stringBuffer.append(stringBuffer2);
            }
            this.f3463o = stringBuffer.toString();
            this.f3435h.m9892a(new AbstractC1084a.C1086a(this.f3463o, this.f3463o));
        }
    }

    /* renamed from: b */
    private void m9882b(BufferedInputStream bufferedInputStream, byte[] bArr) {
        C1091c c1091c = new C1091c(new ByteArrayInputStream(bArr, this.f3462n.f3477m - 68, bArr.length - this.f3462n.f3477m));
        for (int i = 0; i < this.f3462n.f3472h; i++) {
            this.f3433f.f3513d.add(new C0879Uv(c1091c.readShort() / this.f3462n.f3467c, c1091c.readShort() / this.f3462n.f3468d));
        }
    }

    /* renamed from: c */
    private void m9881c(BufferedInputStream bufferedInputStream, byte[] bArr) {
        String replaceAll;
        C1091c c1091c = new C1091c(new ByteArrayInputStream(bArr, this.f3462n.f3479o - 68, bArr.length - this.f3462n.f3479o));
        new ArrayList();
        for (int i = 0; i < this.f3462n.f3475k; i++) {
            float readFloat = c1091c.readFloat();
            float readFloat2 = c1091c.readFloat();
            float readFloat3 = c1091c.readFloat();
            float readFloat4 = c1091c.readFloat();
            float readFloat5 = c1091c.readFloat();
            float readFloat6 = c1091c.readFloat();
            String m9884a = c1091c.m9884a(16);
            if (m9884a.indexOf("_") > 0) {
                replaceAll = m9884a.subSequence(0, m9884a.lastIndexOf("_")).toString();
            } else {
                replaceAll = m9884a.substring(0, 6).replaceAll("[0-9]{1,2}$", "");
            }
            Log.d("Censivn3D", "frame name: " + replaceAll);
            float[] fArr = new float[this.f3462n.f3471g * 3];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f3462n.f3471g; i3++) {
                int i4 = i2 + 1;
                fArr[i2] = (c1091c.readUnsignedByte() * readFloat) + readFloat4;
                int i5 = i4 + 1;
                fArr[i4] = (c1091c.readUnsignedByte() * readFloat2) + readFloat5;
                i2 = i5 + 1;
                fArr[i5] = (c1091c.readUnsignedByte() * readFloat3) + readFloat6;
                c1091c.readUnsignedByte();
                if (i == 0) {
                    this.f3433f.f3512c.add(new Number3d(fArr[i2 - 3], fArr[i2 - 2], fArr[i2 - 1]));
                }
            }
            this.f3464p[i] = new C0891a(replaceAll, fArr);
        }
    }

    /* renamed from: d */
    private void m9880d(BufferedInputStream bufferedInputStream, byte[] bArr) {
        C1091c c1091c = new C1091c(new ByteArrayInputStream(bArr, this.f3462n.f3478n - 68, bArr.length - this.f3462n.f3478n));
        int[] iArr = new int[this.f3462n.f3473i * 3];
        int i = 0;
        for (int i2 = 0; i2 < this.f3462n.f3473i; i2++) {
            int readUnsignedShort = c1091c.readUnsignedShort();
            int[] iArr2 = {r7, r8, readUnsignedShort};
            iArr[i + 2] = readUnsignedShort;
            int readUnsignedShort2 = c1091c.readUnsignedShort();
            iArr[i + 1] = readUnsignedShort2;
            int readUnsignedShort3 = c1091c.readUnsignedShort();
            iArr[i] = readUnsignedShort3;
            i += 3;
            int[] iArr3 = {c1091c.readUnsignedShort(), c1091c.readUnsignedShort(), c1091c.readUnsignedShort()};
            C1099h c1099h = new C1099h();
            c1099h.f3516b = iArr2;
            c1099h.f3517c = iArr3;
            c1099h.f3520f = true;
            c1099h.f3521g = true;
            c1099h.f3519e = 3;
            c1099h.f3522h = this.f3463o;
            this.f3433f.f3511b++;
            this.f3433f.f3510a.add(c1099h);
            this.f3433f.m9866a(c1099h);
        }
        for (int i3 = 0; i3 < this.f3462n.f3475k; i3++) {
            this.f3464p[i3].m10744a(iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.censivn.C3DEngine.e.d$a */
    /* loaded from: classes.dex */
    public class C1094a {

        /* renamed from: a */
        public int f3465a;

        /* renamed from: b */
        public int f3466b;

        /* renamed from: c */
        public int f3467c;

        /* renamed from: d */
        public int f3468d;

        /* renamed from: e */
        public int f3469e;

        /* renamed from: f */
        public int f3470f;

        /* renamed from: g */
        public int f3471g;

        /* renamed from: h */
        public int f3472h;

        /* renamed from: i */
        public int f3473i;

        /* renamed from: j */
        public int f3474j;

        /* renamed from: k */
        public int f3475k;

        /* renamed from: l */
        public int f3476l;

        /* renamed from: m */
        public int f3477m;

        /* renamed from: n */
        public int f3478n;

        /* renamed from: o */
        public int f3479o;

        /* renamed from: p */
        public int f3480p;

        /* renamed from: q */
        public int f3481q;

        private C1094a() {
        }

        /* renamed from: a */
        public void m9879a(InputStream inputStream) {
            this.f3465a = C1092d.this.m9897b(inputStream);
            this.f3466b = C1092d.this.m9897b(inputStream);
            if (this.f3465a != 844121161 || this.f3466b != 8) {
                throw new Exception("This is not a valid MD2 file.");
            }
            this.f3467c = C1092d.this.m9897b(inputStream);
            this.f3468d = C1092d.this.m9897b(inputStream);
            this.f3469e = C1092d.this.m9897b(inputStream);
            this.f3470f = C1092d.this.m9897b(inputStream);
            this.f3471g = C1092d.this.m9897b(inputStream);
            this.f3472h = C1092d.this.m9897b(inputStream);
            this.f3473i = C1092d.this.m9897b(inputStream);
            this.f3474j = C1092d.this.m9897b(inputStream);
            this.f3475k = C1092d.this.m9897b(inputStream);
            this.f3476l = C1092d.this.m9897b(inputStream);
            this.f3477m = C1092d.this.m9897b(inputStream);
            this.f3478n = C1092d.this.m9897b(inputStream);
            this.f3479o = C1092d.this.m9897b(inputStream);
            this.f3480p = C1092d.this.m9897b(inputStream);
            this.f3481q = C1092d.this.m9897b(inputStream);
        }
    }
}
