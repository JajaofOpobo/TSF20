package com.tsf.shell.workspace3D;

import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* loaded from: classes.dex */
public final class be {
    public static int a = 50;
    public static int[] b = new int[2];
    public static float[] c = new float[2];

    public static boolean a(int[] iArr) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        if (i3 < 0) {
            i5 += i3;
            i3 = 0;
            z = true;
        } else if (i3 > com.censivn.C3DEngine.a.l - a) {
            i3 = com.censivn.C3DEngine.a.l - a;
            z = true;
        } else {
            z = false;
        }
        if (i3 + i5 > com.censivn.C3DEngine.a.l) {
            i5 = com.censivn.C3DEngine.a.l - i3;
            z = true;
        } else if (i5 < a) {
            i5 = a;
            z = true;
        }
        if (i4 < com.censivn.C3DEngine.a.i) {
            i2 = i6 - (com.censivn.C3DEngine.a.i - i4);
            i = com.censivn.C3DEngine.a.i;
            z2 = true;
        } else if (i4 > com.censivn.C3DEngine.a.m - a) {
            z2 = true;
            i2 = i6;
            i = com.censivn.C3DEngine.a.m - a;
        } else {
            i = i4;
            z2 = z;
            i2 = i6;
        }
        if (i + i2 > com.censivn.C3DEngine.a.m) {
            i2 = com.censivn.C3DEngine.a.m - i;
            z2 = true;
        } else if (i2 < a) {
            i2 = a;
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
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        if (i3 < 0) {
            i3 = 0;
            z = true;
        } else if (i3 > com.censivn.C3DEngine.a.l - a) {
            i3 = com.censivn.C3DEngine.a.l - a;
            z = true;
        } else {
            z = false;
        }
        if (i3 + i5 > com.censivn.C3DEngine.a.l) {
            i5 = com.censivn.C3DEngine.a.l - i3;
            z = true;
        } else if (i5 < a) {
            i5 = a;
            z = true;
        }
        if (i4 < 0) {
            i = 0;
            z2 = true;
        } else if (i4 > com.censivn.C3DEngine.a.m - a) {
            i = com.censivn.C3DEngine.a.m - a;
            z2 = true;
        } else {
            z2 = z;
            i = i4;
        }
        if (i + i6 > com.censivn.C3DEngine.a.m) {
            i2 = com.censivn.C3DEngine.a.m - i;
            z3 = true;
        } else if (i6 < a) {
            i2 = a;
            z3 = true;
        } else {
            z3 = z2;
            i2 = i6;
        }
        if (z3) {
            iArr[0] = i3;
            iArr[1] = i;
            iArr[2] = i5;
            iArr[3] = i2;
        }
        return z3;
    }

    public static boolean c(int[] iArr) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        if (i5 > com.censivn.C3DEngine.a.l) {
            i = com.censivn.C3DEngine.a.l;
            z = true;
        } else if (i5 < a) {
            i = a;
            z = true;
        } else {
            i = i5;
            z = false;
        }
        if (i3 < 0) {
            i3 = 0;
            z = true;
        } else if (i3 + i > com.censivn.C3DEngine.a.l) {
            i3 = com.censivn.C3DEngine.a.l - i;
            z = true;
        }
        if (i6 > com.censivn.C3DEngine.a.k) {
            i6 = com.censivn.C3DEngine.a.k;
            z = true;
        } else if (i6 < a) {
            i6 = a;
            z = true;
        }
        if (i4 < 0) {
            i2 = 0;
            z2 = true;
        } else if (i4 + i6 > com.censivn.C3DEngine.a.m) {
            i2 = com.censivn.C3DEngine.a.m - i6;
            z2 = true;
        } else {
            z2 = z;
            i2 = i4;
        }
        if (z2) {
            iArr[0] = i3;
            iArr[1] = i2;
            iArr[2] = i;
            iArr[3] = i6;
        }
        return z2;
    }

    public static float[] a(com.tsf.shell.workspace3D.k.j jVar) {
        return a(jVar, true);
    }

    public static float[] a(com.tsf.shell.workspace3D.k.j jVar, boolean z) {
        float[] fArr = {jVar.L().x, jVar.L().y};
        float aN = jVar.aN();
        int i = z ? com.censivn.C3DEngine.a.o : com.censivn.C3DEngine.a.g;
        if (jVar instanceof com.tsf.shell.workspace3D.k.c.a.h) {
            if (jVar.L().x > com.censivn.C3DEngine.a.f) {
                fArr[0] = com.censivn.C3DEngine.a.f;
            } else if (jVar.L().x < com.censivn.C3DEngine.a.e) {
                fArr[0] = com.censivn.C3DEngine.a.e;
            }
            if (jVar.L().y + (jVar.ap() * aN) > i) {
                fArr[1] = i - (aN * jVar.ap());
            } else if (jVar.L().y + (jVar.am() * aN) < com.censivn.C3DEngine.a.h) {
                fArr[1] = com.censivn.C3DEngine.a.h - (aN * jVar.am());
            }
        } else {
            if (jVar.L().x + (jVar.ao() * aN) > com.censivn.C3DEngine.a.f) {
                fArr[0] = com.censivn.C3DEngine.a.f - (jVar.ao() * aN);
            } else if (jVar.L().x + (jVar.al() * aN) < com.censivn.C3DEngine.a.e) {
                fArr[0] = com.censivn.C3DEngine.a.e - (jVar.al() * aN);
            }
            if (jVar.L().y + (jVar.ap() * aN) > i) {
                fArr[1] = i - (aN * jVar.ap());
            } else if (jVar.L().y + (jVar.am() * aN) < com.censivn.C3DEngine.a.h) {
                fArr[1] = com.censivn.C3DEngine.a.h - (aN * jVar.am());
            }
        }
        return fArr;
    }

    public static void a(ItemInfo itemInfo, Cursor cursor, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        itemInfo.screen = cursor.getInt(i);
        itemInfo.id = j;
        int[] a2 = a(cursor.getString(i2), 0);
        itemInfo.cellX = a2[0];
        itemInfo.cellXH = a2[1];
        int[] a3 = a(cursor.getString(i3), 0);
        itemInfo.cellY = a3[0];
        itemInfo.cellYH = a3[1];
        int[] a4 = a(cursor.getString(i4), 100);
        itemInfo.width = a4[0];
        itemInfo.widthH = a4[1];
        int[] a5 = a(cursor.getString(i5), 100);
        itemInfo.height = a5[0];
        itemInfo.heightH = a5[1];
        float[] a6 = a(cursor.getString(i6));
        itemInfo.scale = a6[0];
        itemInfo.scaleH = a6[1];
        int[] a7 = a(cursor.getString(i7), 0);
        itemInfo.rotation = a7[0];
        itemInfo.rotationH = a7[1];
    }

    private static int[] a(String str, int i) {
        if (str == null) {
            b[0] = i;
            b[1] = i;
        } else {
            try {
                String[] split = str.split(",");
                if (split.length == 1) {
                    int[] iArr = b;
                    int[] iArr2 = b;
                    int parseInt = Integer.parseInt(split[0]);
                    iArr2[1] = parseInt;
                    iArr[0] = parseInt;
                } else {
                    b[0] = Integer.parseInt(split[0]);
                    b[1] = Integer.parseInt(split[1]);
                }
            } catch (Exception e) {
                b[0] = i;
                b[1] = i;
            }
        }
        return b;
    }

    private static float[] a(String str) {
        if (str == null) {
            c[0] = 1.0f;
            c[1] = 1.0f;
        } else {
            try {
                String[] split = str.split(",");
                if (split.length == 1) {
                    float[] fArr = c;
                    float[] fArr2 = c;
                    float parseFloat = Float.parseFloat(split[0]);
                    fArr2[1] = parseFloat;
                    fArr[0] = parseFloat;
                } else {
                    c[0] = Float.parseFloat(split[0]);
                    c[1] = Float.parseFloat(split[1]);
                }
            } catch (Exception e) {
                c[0] = 1.0f;
                c[1] = 1.0f;
            }
        }
        return c;
    }
}
