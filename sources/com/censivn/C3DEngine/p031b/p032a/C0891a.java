package com.censivn.C3DEngine.p031b.p032a;

import com.censivn.C3DEngine.api.element.Number3d;
/* renamed from: com.censivn.C3DEngine.b.a.a */
/* loaded from: classes.dex */
public class C0891a {

    /* renamed from: a */
    private String f2546a;

    /* renamed from: b */
    private float[] f2547b;

    /* renamed from: c */
    private float[] f2548c;

    /* renamed from: d */
    private int[] f2549d;

    public C0891a(String str, float[] fArr) {
        this.f2546a = str;
        this.f2547b = fArr;
    }

    public C0891a(String str, float[] fArr, float[] fArr2) {
        this(str, fArr);
        this.f2548c = fArr2;
    }

    /* renamed from: a */
    public void m10744a(int[] iArr) {
        this.f2549d = iArr;
        float[] fArr = this.f2547b;
        this.f2547b = new float[iArr.length * 3];
        int i = 0;
        for (int i2 : iArr) {
            int i3 = i2 * 3;
            int i4 = i + 1;
            this.f2547b[i] = fArr[i3];
            int i5 = i4 + 1;
            this.f2547b[i4] = fArr[i3 + 1];
            i = i5 + 1;
            this.f2547b[i5] = fArr[i3 + 2];
        }
        this.f2548c = new float[this.f2547b.length];
        int length = this.f2547b.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 9) {
            Number3d m10745a = m10745a(new Number3d(this.f2547b[i7], this.f2547b[i7 + 1], this.f2547b[i7 + 2]), new Number3d(this.f2547b[i7 + 3], this.f2547b[i7 + 4], this.f2547b[i7 + 5]), new Number3d(this.f2547b[i7 + 6], this.f2547b[i7 + 7], this.f2547b[i7 + 8]));
            int i8 = i6 + 1;
            this.f2548c[i6] = m10745a.f2526x;
            int i9 = i8 + 1;
            this.f2548c[i8] = m10745a.f2527y;
            int i10 = i9 + 1;
            this.f2548c[i9] = m10745a.f2528z;
            int i11 = i10 + 1;
            this.f2548c[i10] = m10745a.f2526x;
            int i12 = i11 + 1;
            this.f2548c[i11] = m10745a.f2527y;
            int i13 = i12 + 1;
            this.f2548c[i12] = m10745a.f2528z;
            int i14 = i13 + 1;
            this.f2548c[i13] = m10745a.f2526x;
            int i15 = i14 + 1;
            this.f2548c[i14] = m10745a.f2527y;
            i6 = i15 + 1;
            this.f2548c[i15] = m10745a.f2528z;
        }
    }

    /* renamed from: a */
    public Number3d m10745a(Number3d number3d, Number3d number3d2, Number3d number3d3) {
        Number3d subtract = Number3d.subtract(number3d2, number3d);
        Number3d subtract2 = Number3d.subtract(number3d3, number3d);
        Number3d number3d4 = new Number3d();
        number3d4.f2526x = (subtract.f2527y * subtract2.f2528z) - (subtract.f2528z * subtract2.f2527y);
        number3d4.f2527y = -((subtract2.f2528z * subtract.f2526x) - (subtract2.f2526x * subtract.f2528z));
        number3d4.f2528z = (subtract.f2526x * subtract2.f2527y) - (subtract.f2527y * subtract2.f2526x);
        double sqrt = Math.sqrt((number3d4.f2526x * number3d4.f2526x) + (number3d4.f2527y * number3d4.f2527y) + (number3d4.f2528z * number3d4.f2528z));
        number3d4.f2526x = (float) (number3d4.f2526x / sqrt);
        number3d4.f2527y = (float) (number3d4.f2527y / sqrt);
        number3d4.f2528z = (float) (number3d4.f2528z / sqrt);
        return number3d4;
    }

    /* renamed from: a */
    public C0891a clone() {
        return new C0891a(this.f2546a, (float[]) this.f2547b.clone(), (float[]) this.f2548c.clone());
    }
}
