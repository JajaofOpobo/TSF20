package com.censivn.C3DEngine.b.a;

import com.censivn.C3DEngine.api.element.Number3d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
            Number3d number3dA = a(new Number3d(this.b[i7], this.b[i7 + 1], this.b[i7 + 2]), new Number3d(this.b[i7 + 3], this.b[i7 + 4], this.b[i7 + 5]), new Number3d(this.b[i7 + 6], this.b[i7 + 7], this.b[i7 + 8]));
            int i8 = i6 + 1;
            this.c[i6] = number3dA.x;
            int i9 = i8 + 1;
            this.c[i8] = number3dA.y;
            int i10 = i9 + 1;
            this.c[i9] = number3dA.z;
            int i11 = i10 + 1;
            this.c[i10] = number3dA.x;
            int i12 = i11 + 1;
            this.c[i11] = number3dA.y;
            int i13 = i12 + 1;
            this.c[i12] = number3dA.z;
            int i14 = i13 + 1;
            this.c[i13] = number3dA.x;
            int i15 = i14 + 1;
            this.c[i14] = number3dA.y;
            i6 = i15 + 1;
            this.c[i15] = number3dA.z;
        }
    }

    public Number3d a(Number3d number3d, Number3d number3d2, Number3d number3d3) {
        Number3d number3dSubtract = Number3d.subtract(number3d2, number3d);
        Number3d number3dSubtract2 = Number3d.subtract(number3d3, number3d);
        Number3d number3d4 = new Number3d();
        number3d4.x = (number3dSubtract.y * number3dSubtract2.z) - (number3dSubtract.z * number3dSubtract2.y);
        number3d4.y = -((number3dSubtract2.z * number3dSubtract.x) - (number3dSubtract2.x * number3dSubtract.z));
        number3d4.z = (number3dSubtract.x * number3dSubtract2.y) - (number3dSubtract.y * number3dSubtract2.x);
        double dSqrt = Math.sqrt((number3d4.x * number3d4.x) + (number3d4.y * number3d4.y) + (number3d4.z * number3d4.z));
        number3d4.x = (float) (((double) number3d4.x) / dSqrt);
        number3d4.y = (float) (((double) number3d4.y) / dSqrt);
        number3d4.z = (float) (((double) number3d4.z) / dSqrt);
        return number3d4;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a(this.a, (float[]) this.b.clone(), (float[]) this.c.clone());
    }
}
