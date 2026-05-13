package com.tsf.shell.manager.p187r;

import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p158c.C3134a;
/* renamed from: com.tsf.shell.manager.r.a */
/* loaded from: classes.dex */
public class C3613a {

    /* renamed from: a */
    public static int[] f11969a = new int[2];

    /* renamed from: b */
    public static float[] f11970b = new float[2];

    /* renamed from: a */
    public static boolean m1888a(int[] iArr) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        int i8 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        if (i3 < C0892a.f2586v) {
            i5 -= C0892a.f2586v - i3;
            i3 = C0892a.f2586v;
            z = true;
        } else if (i3 > C0892a.f2588x - i7) {
            i3 = C0892a.f2588x - i7;
            z = true;
        } else {
            z = false;
        }
        if (i3 + i5 > C0892a.f2588x) {
            i5 = C0892a.f2588x - i3;
            z = true;
        } else if (i5 < i7) {
            i3 -= i7 - i5;
            i5 = i7;
            z = true;
        }
        if (i4 < C0892a.f2587w) {
            i2 = i6 - (C0892a.f2587w - i4);
            i = C0892a.f2587w;
            z2 = true;
        } else if (i4 > C0892a.f2589y - i8) {
            i = C0892a.f2589y - i8;
            i2 = i6;
            z2 = true;
        } else {
            i = i4;
            z2 = z;
            i2 = i6;
        }
        if (i + i2 > C0892a.f2589y) {
            i2 = C0892a.f2589y - i;
            z2 = true;
        } else if (i2 < i8) {
            i -= i8 - i2;
            i2 = i8;
            z2 = true;
        }
        if (z2) {
            iArr[0] = i3;
            iArr[1] = i;
            iArr[2] = i5;
            iArr[3] = i2;
        }
        return z2;
    }

    /* renamed from: b */
    public static boolean m1887b(int[] iArr) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        int i9 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        if (i4 < C0892a.f2586v) {
            i4 = C0892a.f2586v;
            z = true;
        } else if (i4 > C0892a.f2588x - i8) {
            i4 = C0892a.f2588x - i8;
            z = true;
        } else {
            z = false;
        }
        if (i4 + i6 > C0892a.f2588x) {
            i = C0892a.f2588x - i4;
            z2 = true;
        } else if (i6 < i8) {
            i = i8;
            z2 = true;
        } else {
            z2 = z;
            i = i6;
        }
        if (i5 < C0892a.f2587w) {
            i2 = C0892a.f2587w;
            z3 = true;
        } else if (i5 > C0892a.f2589y - i9) {
            i2 = C0892a.f2589y - i9;
            z3 = true;
        } else {
            z3 = z2;
            i2 = i5;
        }
        if (i2 + i7 > C0892a.f2589y) {
            i3 = C0892a.f2589y - i2;
            z4 = true;
        } else if (i7 < i9) {
            i3 = i9;
            z4 = true;
        } else {
            z4 = z3;
            i3 = i7;
        }
        if (z4) {
            iArr[0] = i4;
            iArr[1] = i2;
            iArr[2] = i;
            iArr[3] = i3;
        }
        return z4;
    }

    /* renamed from: c */
    public static boolean m1886c(int[] iArr) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        int i9 = (int) C3359a.f11094h.f9606d.f9443a.f9463d;
        if (i6 > C0892a.f2580p) {
            i8 = C0892a.f2580p;
            z = true;
        } else if (i6 < i8) {
            z = true;
        } else {
            i8 = i6;
            z = false;
        }
        if (i4 < C0892a.f2586v) {
            i = C0892a.f2586v;
            z2 = true;
        } else if (i4 + i8 > C0892a.f2588x) {
            i = C0892a.f2588x - i8;
            z2 = true;
        } else {
            z2 = z;
            i = i4;
        }
        if (i7 > C0892a.f2581q) {
            i2 = C0892a.f2581q;
            z3 = true;
        } else if (i7 < i9) {
            i2 = i9;
            z3 = true;
        } else {
            z3 = z2;
            i2 = i7;
        }
        if (i5 < C0892a.f2587w) {
            i3 = C0892a.f2587w;
            z4 = true;
        } else if (i5 + i2 > C0892a.f2589y) {
            i3 = C0892a.f2589y - i2;
            z4 = true;
        } else {
            z4 = z3;
            i3 = i5;
        }
        if (z4) {
            iArr[0] = i;
            iArr[1] = i3;
            iArr[2] = i8;
            iArr[3] = i2;
        }
        return z4;
    }

    /* renamed from: a */
    public static float[] m1891a(C3112b c3112b, float f, float f2) {
        float[] fArr = {f, f2};
        float m3491u = c3112b.m3491u();
        if (!(c3112b instanceof C3134a)) {
            if ((c3112b.maxX() * m3491u) + f > C0892a.f2550A) {
                fArr[0] = C0892a.f2550A - (c3112b.maxX() * m3491u);
            } else if ((c3112b.minX() * m3491u) + f < C0892a.f2590z) {
                fArr[0] = C0892a.f2590z - (c3112b.minX() * m3491u);
            }
            if ((c3112b.maxY() * m3491u) + f2 > C0892a.f2583s) {
                fArr[1] = C0892a.f2583s - (m3491u * c3112b.maxY());
            } else if ((c3112b.minY() * m3491u) + f2 < C0892a.f2585u) {
                fArr[1] = C0892a.f2585u - (m3491u * c3112b.minY());
            }
        } else {
            if (f > C0892a.f2550A) {
                fArr[0] = C0892a.f2550A;
            } else if (f < C0892a.f2590z) {
                fArr[0] = C0892a.f2590z;
            }
            if ((c3112b.maxY() * m3491u) + f2 > C0892a.f2583s) {
                fArr[1] = C0892a.f2583s - (m3491u * c3112b.maxY());
            } else if ((c3112b.minY() * m3491u) + f2 < C0892a.f2585u) {
                fArr[1] = C0892a.f2585u - (m3491u * c3112b.minY());
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public static void m1892a(ItemInfo itemInfo, Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        itemInfo.screen = cursor.getInt(i2);
        itemInfo.f2532id = i;
        int[] m1889a = m1889a(cursor.getString(i3), 0);
        itemInfo.cellX = m1889a[0];
        itemInfo.cellXH = m1889a[1];
        int[] m1889a2 = m1889a(cursor.getString(i4), 0);
        itemInfo.cellY = m1889a2[0];
        itemInfo.cellYH = m1889a2[1];
        int[] m1889a3 = m1889a(cursor.getString(i5), 100);
        itemInfo.width = m1889a3[0];
        itemInfo.widthH = m1889a3[1];
        int[] m1889a4 = m1889a(cursor.getString(i6), 100);
        itemInfo.height = m1889a4[0];
        itemInfo.heightH = m1889a4[1];
        float[] m1890a = m1890a(cursor.getString(i7), 1.0f);
        itemInfo.scale = m1890a[0];
        itemInfo.scaleH = m1890a[1];
        int[] m1889a5 = m1889a(cursor.getString(i8), 0);
        itemInfo.rotation = m1889a5[0];
        itemInfo.rotationH = m1889a5[1];
    }

    /* renamed from: a */
    private static int[] m1889a(String str, int i) {
        if (str == null) {
            f11969a[0] = i;
            f11969a[1] = i;
        } else {
            try {
                String[] split = str.split(",");
                if (split.length == 1) {
                    int[] iArr = f11969a;
                    int[] iArr2 = f11969a;
                    int parseInt = Integer.parseInt(split[0]);
                    iArr2[1] = parseInt;
                    iArr[0] = parseInt;
                } else {
                    f11969a[0] = Integer.parseInt(split[0]);
                    f11969a[1] = Integer.parseInt(split[1]);
                }
            } catch (Exception e) {
                f11969a[0] = i;
                f11969a[1] = i;
            }
        }
        return f11969a;
    }

    /* renamed from: a */
    private static float[] m1890a(String str, float f) {
        if (str == null) {
            f11970b[0] = f;
            f11970b[1] = f;
        } else {
            try {
                String[] split = str.split(",");
                if (split.length == 1) {
                    float[] fArr = f11970b;
                    float[] fArr2 = f11970b;
                    float parseFloat = Float.parseFloat(split[0]);
                    fArr2[1] = parseFloat;
                    fArr[0] = parseFloat;
                } else {
                    f11970b[0] = Float.parseFloat(split[0]);
                    f11970b[1] = Float.parseFloat(split[1]);
                }
            } catch (Exception e) {
                f11970b[0] = f;
                f11970b[1] = f;
            }
        }
        return f11970b;
    }
}
