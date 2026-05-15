package com.tsf.shell.manager.r;

import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.f.i.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static int[] a = new int[2];
    public static float[] b = new float[2];

    public static boolean a(int[] iArr) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = (int) com.tsf.shell.manager.a.h.d.a.d;
        int i8 = (int) com.tsf.shell.manager.a.h.d.a.d;
        if (i3 < com.censivn.C3DEngine.b.b.a.v) {
            i5 -= com.censivn.C3DEngine.b.b.a.v - i3;
            i3 = com.censivn.C3DEngine.b.b.a.v;
            z = true;
        } else if (i3 > com.censivn.C3DEngine.b.b.a.x - i7) {
            i3 = com.censivn.C3DEngine.b.b.a.x - i7;
            z = true;
        } else {
            z = false;
        }
        if (i3 + i5 > com.censivn.C3DEngine.b.b.a.x) {
            i5 = com.censivn.C3DEngine.b.b.a.x - i3;
            z = true;
        } else if (i5 < i7) {
            i3 -= i7 - i5;
            i5 = i7;
            z = true;
        }
        if (i4 < com.censivn.C3DEngine.b.b.a.w) {
            i2 = i6 - (com.censivn.C3DEngine.b.b.a.w - i4);
            i = com.censivn.C3DEngine.b.b.a.w;
            z2 = true;
        } else if (i4 > com.censivn.C3DEngine.b.b.a.y - i8) {
            i = com.censivn.C3DEngine.b.b.a.y - i8;
            i2 = i6;
            z2 = true;
        } else {
            i = i4;
            z2 = z;
            i2 = i6;
        }
        if (i + i2 > com.censivn.C3DEngine.b.b.a.y) {
            i2 = com.censivn.C3DEngine.b.b.a.y - i;
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

    public static boolean b(int[] iArr) {
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
        int i8 = (int) com.tsf.shell.manager.a.h.d.a.d;
        int i9 = (int) com.tsf.shell.manager.a.h.d.a.d;
        if (i4 < com.censivn.C3DEngine.b.b.a.v) {
            i4 = com.censivn.C3DEngine.b.b.a.v;
            z = true;
        } else if (i4 > com.censivn.C3DEngine.b.b.a.x - i8) {
            i4 = com.censivn.C3DEngine.b.b.a.x - i8;
            z = true;
        } else {
            z = false;
        }
        if (i4 + i6 > com.censivn.C3DEngine.b.b.a.x) {
            i = com.censivn.C3DEngine.b.b.a.x - i4;
            z2 = true;
        } else if (i6 < i8) {
            i = i8;
            z2 = true;
        } else {
            z2 = z;
            i = i6;
        }
        if (i5 < com.censivn.C3DEngine.b.b.a.w) {
            i2 = com.censivn.C3DEngine.b.b.a.w;
            z3 = true;
        } else if (i5 > com.censivn.C3DEngine.b.b.a.y - i9) {
            i2 = com.censivn.C3DEngine.b.b.a.y - i9;
            z3 = true;
        } else {
            z3 = z2;
            i2 = i5;
        }
        if (i2 + i7 > com.censivn.C3DEngine.b.b.a.y) {
            i3 = com.censivn.C3DEngine.b.b.a.y - i2;
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

    public static boolean c(int[] iArr) {
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
        int i8 = (int) com.tsf.shell.manager.a.h.d.a.d;
        int i9 = (int) com.tsf.shell.manager.a.h.d.a.d;
        if (i6 > com.censivn.C3DEngine.b.b.a.p) {
            i8 = com.censivn.C3DEngine.b.b.a.p;
            z = true;
        } else if (i6 < i8) {
            z = true;
        } else {
            i8 = i6;
            z = false;
        }
        if (i4 < com.censivn.C3DEngine.b.b.a.v) {
            i = com.censivn.C3DEngine.b.b.a.v;
            z2 = true;
        } else if (i4 + i8 > com.censivn.C3DEngine.b.b.a.x) {
            i = com.censivn.C3DEngine.b.b.a.x - i8;
            z2 = true;
        } else {
            z2 = z;
            i = i4;
        }
        if (i7 > com.censivn.C3DEngine.b.b.a.q) {
            i2 = com.censivn.C3DEngine.b.b.a.q;
            z3 = true;
        } else if (i7 < i9) {
            i2 = i9;
            z3 = true;
        } else {
            z3 = z2;
            i2 = i7;
        }
        if (i5 < com.censivn.C3DEngine.b.b.a.w) {
            i3 = com.censivn.C3DEngine.b.b.a.w;
            z4 = true;
        } else if (i5 + i2 > com.censivn.C3DEngine.b.b.a.y) {
            i3 = com.censivn.C3DEngine.b.b.a.y - i2;
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

    public static float[] a(b bVar, float f, float f2) {
        float[] fArr = {f, f2};
        float fU = bVar.u();
        if (bVar instanceof com.tsf.shell.f.i.b.c.a) {
            if (f > com.censivn.C3DEngine.b.b.a.A) {
                fArr[0] = com.censivn.C3DEngine.b.b.a.A;
            } else if (f < com.censivn.C3DEngine.b.b.a.z) {
                fArr[0] = com.censivn.C3DEngine.b.b.a.z;
            }
            if ((bVar.maxY() * fU) + f2 > com.censivn.C3DEngine.b.b.a.s) {
                fArr[1] = com.censivn.C3DEngine.b.b.a.s - (fU * bVar.maxY());
            } else if ((bVar.minY() * fU) + f2 < com.censivn.C3DEngine.b.b.a.u) {
                fArr[1] = com.censivn.C3DEngine.b.b.a.u - (fU * bVar.minY());
            }
        } else {
            if ((bVar.maxX() * fU) + f > com.censivn.C3DEngine.b.b.a.A) {
                fArr[0] = com.censivn.C3DEngine.b.b.a.A - (bVar.maxX() * fU);
            } else if ((bVar.minX() * fU) + f < com.censivn.C3DEngine.b.b.a.z) {
                fArr[0] = com.censivn.C3DEngine.b.b.a.z - (bVar.minX() * fU);
            }
            if ((bVar.maxY() * fU) + f2 > com.censivn.C3DEngine.b.b.a.s) {
                fArr[1] = com.censivn.C3DEngine.b.b.a.s - (fU * bVar.maxY());
            } else if ((bVar.minY() * fU) + f2 < com.censivn.C3DEngine.b.b.a.u) {
                fArr[1] = com.censivn.C3DEngine.b.b.a.u - (fU * bVar.minY());
            }
        }
        return fArr;
    }

    public static void a(ItemInfo itemInfo, Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        itemInfo.screen = cursor.getInt(i2);
        itemInfo.id = i;
        int[] iArrA = a(cursor.getString(i3), 0);
        itemInfo.cellX = iArrA[0];
        itemInfo.cellXH = iArrA[1];
        int[] iArrA2 = a(cursor.getString(i4), 0);
        itemInfo.cellY = iArrA2[0];
        itemInfo.cellYH = iArrA2[1];
        int[] iArrA3 = a(cursor.getString(i5), 100);
        itemInfo.width = iArrA3[0];
        itemInfo.widthH = iArrA3[1];
        int[] iArrA4 = a(cursor.getString(i6), 100);
        itemInfo.height = iArrA4[0];
        itemInfo.heightH = iArrA4[1];
        float[] fArrA = a(cursor.getString(i7), 1.0f);
        itemInfo.scale = fArrA[0];
        itemInfo.scaleH = fArrA[1];
        int[] iArrA5 = a(cursor.getString(i8), 0);
        itemInfo.rotation = iArrA5[0];
        itemInfo.rotationH = iArrA5[1];
    }

    private static int[] a(String str, int i) {
        if (str == null) {
            a[0] = i;
            a[1] = i;
        } else {
            try {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length == 1) {
                    int[] iArr = a;
                    int[] iArr2 = a;
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    iArr2[1] = i2;
                    iArr[0] = i2;
                } else {
                    a[0] = Integer.parseInt(strArrSplit[0]);
                    a[1] = Integer.parseInt(strArrSplit[1]);
                }
            } catch (Exception e) {
                a[0] = i;
                a[1] = i;
            }
        }
        return a;
    }

    private static float[] a(String str, float f) {
        if (str == null) {
            b[0] = f;
            b[1] = f;
        } else {
            try {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length == 1) {
                    float[] fArr = b;
                    float[] fArr2 = b;
                    float f2 = Float.parseFloat(strArrSplit[0]);
                    fArr2[1] = f2;
                    fArr[0] = f2;
                } else {
                    b[0] = Float.parseFloat(strArrSplit[0]);
                    b[1] = Float.parseFloat(strArrSplit[1]);
                }
            } catch (Exception e) {
                b[0] = f;
                b[1] = f;
            }
        }
        return b;
    }
}
