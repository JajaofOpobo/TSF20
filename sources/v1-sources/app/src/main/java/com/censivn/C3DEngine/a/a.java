package com.censivn.C3DEngine.a;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
public final class a {
    private String a;
    private float[] b;
    private float[] c;
    private int[] d;

    public final /* synthetic */ Object clone() {
        return new a(this.a, (float[]) this.b.clone(), (float[]) this.c.clone());
    }

    public a(String str, float[] fArr) {
        this.a = str;
        this.b = fArr;
    }

    private a(String str, float[] fArr, float[] fArr2) {
        this(str, fArr);
        this.c = fArr2;
    }

    public final void a(int[] iArr) {
        int i = 0;
        this.d = iArr;
        float[] fArr = this.b;
        this.b = new float[iArr.length * 3];
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = i3 * 3;
            int i5 = i2 + 1;
            this.b[i2] = fArr[i4];
            int i6 = i5 + 1;
            this.b[i5] = fArr[i4 + 1];
            i2 = i6 + 1;
            this.b[i6] = fArr[i4 + 2];
        }
        this.c = new float[this.b.length];
        int length = this.b.length;
        for (int i7 = 0; i7 < length; i7 += 9) {
            Number3d number3d = new Number3d(this.b[i7], this.b[i7 + 1], this.b[i7 + 2]);
            Number3d number3d2 = new Number3d(this.b[i7 + 3], this.b[i7 + 4], this.b[i7 + 5]);
            Number3d number3d3 = new Number3d(this.b[i7 + 6], this.b[i7 + 7], this.b[i7 + 8]);
            Number3d subtract = Number3d.subtract(number3d2, number3d);
            Number3d subtract2 = Number3d.subtract(number3d3, number3d);
            Number3d number3d4 = new Number3d();
            number3d4.x = (subtract.y * subtract2.z) - (subtract.z * subtract2.y);
            number3d4.y = -((subtract2.z * subtract.x) - (subtract2.x * subtract.z));
            number3d4.z = (subtract.x * subtract2.y) - (subtract2.x * subtract.y);
            double sqrt = Math.sqrt((number3d4.x * number3d4.x) + (number3d4.y * number3d4.y) + (number3d4.z * number3d4.z));
            number3d4.x = (float) (number3d4.x / sqrt);
            number3d4.y = (float) (number3d4.y / sqrt);
            number3d4.z = (float) (number3d4.z / sqrt);
            int i8 = i + 1;
            this.c[i] = number3d4.x;
            int i9 = i8 + 1;
            this.c[i8] = number3d4.y;
            int i10 = i9 + 1;
            this.c[i9] = number3d4.z;
            int i11 = i10 + 1;
            this.c[i10] = number3d4.x;
            int i12 = i11 + 1;
            this.c[i11] = number3d4.y;
            int i13 = i12 + 1;
            this.c[i12] = number3d4.z;
            int i14 = i13 + 1;
            this.c[i13] = number3d4.x;
            int i15 = i14 + 1;
            this.c[i14] = number3d4.y;
            i = i15 + 1;
            this.c[i15] = number3d4.z;
        }
    }
}
