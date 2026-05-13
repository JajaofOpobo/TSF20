package com.censivn.C3DEngine.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
/* loaded from: classes.dex */
public class a {
    private String a;
    private float[] b;
    private float[] c;
    private int[] d;

    public a(String str, float[] fArr) {
        this.a = str;
        this.b = fArr;
    }

    public a(String str, float[] fArr, float[] fArr2) {
        this(str, fArr);
        this.c = fArr2;
    }

    public void a(int[] iArr) {
        this.d = iArr;
        float[] fArr = this.b;
        this.b = new float[iArr.length * 3];
        int i = 0;
        for (int i2 : iArr) {
            int i3 = i2 * 3;
            int i4 = i + 1;
            this.b[i] = fArr[i3];
            int i5 = i4 + 1;
            this.b[i4] = fArr[i3 + 1];
            i = i5 + 1;
            this.b[i5] = fArr[i3 + 2];
        }
        this.c = new float[this.b.length];
        int length = this.b.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 9) {
            Number3d a = a(new Number3d(this.b[i7], this.b[i7 + 1], this.b[i7 + 2]), new Number3d(this.b[i7 + 3], this.b[i7 + 4], this.b[i7 + 5]), new Number3d(this.b[i7 + 6], this.b[i7 + 7], this.b[i7 + 8]));
            int i8 = i6 + 1;
            this.c[i6] = a.x;
            int i9 = i8 + 1;
            this.c[i8] = a.y;
            int i10 = i9 + 1;
            this.c[i9] = a.z;
            int i11 = i10 + 1;
            this.c[i10] = a.x;
            int i12 = i11 + 1;
            this.c[i11] = a.y;
            int i13 = i12 + 1;
            this.c[i12] = a.z;
            int i14 = i13 + 1;
            this.c[i13] = a.x;
            int i15 = i14 + 1;
            this.c[i14] = a.y;
            i6 = i15 + 1;
            this.c[i15] = a.z;
        }
    }

    public Number3d a(Number3d number3d, Number3d number3d2, Number3d number3d3) {
        Number3d subtract = Number3d.subtract(number3d2, number3d);
        Number3d subtract2 = Number3d.subtract(number3d3, number3d);
        Number3d number3d4 = new Number3d();
        number3d4.x = (subtract.y * subtract2.z) - (subtract.z * subtract2.y);
        number3d4.y = -((subtract2.z * subtract.x) - (subtract2.x * subtract.z));
        number3d4.z = (subtract.x * subtract2.y) - (subtract.y * subtract2.x);
        double sqrt = Math.sqrt((number3d4.x * number3d4.x) + (number3d4.y * number3d4.y) + (number3d4.z * number3d4.z));
        number3d4.x = (float) (number3d4.x / sqrt);
        number3d4.y = (float) (number3d4.y / sqrt);
        number3d4.z = (float) (number3d4.z / sqrt);
        return number3d4;
    }

    /* renamed from: a */
    public a clone() {
        return new a(this.a, (float[]) this.b.clone(), (float[]) this.c.clone());
    }
}
