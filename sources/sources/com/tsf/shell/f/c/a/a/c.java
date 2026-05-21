package com.tsf.shell.f.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.c.a.a.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends d {
    @Override // com.tsf.shell.f.c.a.a.a
    public int b(float f, float f2) {
        return b(f2);
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public int a(ArrayList<com.tsf.shell.f.c.a.d> arrayList, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        float fMinX;
        int iB = b(f5, f6);
        if (iB == 0) {
            com.tsf.shell.f.c.a.b.a aVarA = a(f5, f, f2, f3, i);
            if (aVarA.a == -1 || aVarA.a == -2) {
                a(arrayList, arrayList2, i, f, f2, f3, f4);
            } else {
                int i2 = aVarA.a;
                com.censivn.C3DEngine.b.f.i iVar = arrayList2.get(i2);
                com.tsf.shell.f.c.a.d dVar = arrayList.get(i2);
                float fAbs = Math.abs(aVarA.b);
                float f7 = 1.4f - (0.2f * fAbs);
                float f8 = (f4 * f7) / 2.0f;
                if (aVarA.b > 0.0f) {
                    fMinX = ((aVarA.d + (aVarA.c / 2.0f)) - (iVar.maxX() * f7)) - f8;
                } else {
                    fMinX = ((aVarA.d - (aVarA.c / 2.0f)) - (iVar.minX() * f7)) + f8;
                }
                dVar.a = ((fMinX - aVarA.d) * fAbs) + aVarA.d;
                dVar.d = f7;
                dVar.f = (dVar.a + (iVar.minX() * f7)) - f8;
                dVar.e = dVar.a + (iVar.maxX() * f7) + f8;
                dVar.c = 0.0f;
                dVar.i = 255.0f;
                a(dVar, iVar, f7, true);
                dVar.h = false;
                if (i2 > 0) {
                    com.tsf.shell.f.c.a.d dVar2 = arrayList.get(i2 - 1);
                    a(dVar, dVar2, arrayList2.get(i2 - 1), 1.0f - (aVarA.b * 0.2f), f4);
                    a(dVar2, f2, f3, 0.0f, f);
                    float f9 = dVar2.d;
                    if (i2 > 1) {
                        int i3 = i2 - 2;
                        float f10 = f9;
                        com.tsf.shell.f.c.a.d dVar3 = dVar2;
                        while (true) {
                            if (i3 <= -1) {
                                break;
                            }
                            com.tsf.shell.f.c.a.d dVar4 = arrayList.get(i3);
                            com.censivn.C3DEngine.b.f.i iVar2 = arrayList2.get(i3);
                            float f11 = f10 - 0.4f;
                            a(dVar3, dVar4, iVar2, f11, f4);
                            a(dVar4, f2, f3, 0.0f, f);
                            if (f11 - 0.4f < this.e && i3 > 0) {
                                float fMaxX = (((dVar3.f - (iVar2.maxX() * this.e)) - ((this.e * f4) / 2.0f)) + (iVar2.minX() * this.e)) - ((this.e * f4) / 2.0f);
                                com.tsf.shell.f.c.a.d dVar5 = arrayList.get(i3 - 1);
                                if (fMaxX > dVar5.e) {
                                    a(dVar3, dVar4, iVar2, (dVar3.f - dVar5.e) / ((iVar2.maxX() - iVar2.minX()) + f4), f4);
                                    a(dVar4, f2, f3, 0.0f, f);
                                    break;
                                }
                            }
                            i3--;
                            dVar3 = dVar4;
                            f10 = dVar4.d;
                        }
                    }
                }
                if (i2 < i - 1) {
                    com.tsf.shell.f.c.a.d dVar6 = arrayList.get(i2 + 1);
                    b(dVar, dVar6, arrayList2.get(i2 + 1), (aVarA.b * 0.2f) + 1.0f, f4);
                    a(dVar6, f2, f3, 0.0f, f);
                    float f12 = dVar6.d;
                    if (i2 < i - 2) {
                        int i4 = i2 + 2;
                        while (true) {
                            int i5 = i4;
                            float f13 = f12;
                            com.tsf.shell.f.c.a.d dVar7 = dVar6;
                            if (i5 >= i) {
                                break;
                            }
                            dVar6 = arrayList.get(i5);
                            com.censivn.C3DEngine.b.f.i iVar3 = arrayList2.get(i5);
                            float f14 = f13 - 0.4f;
                            b(dVar7, dVar6, iVar3, f14, f4);
                            a(dVar6, f2, f3, 0.0f, f);
                            if (f14 - 0.4f < this.e && i5 < i - 1) {
                                float fMinX2 = ((this.e * f4) / 2.0f) + (dVar7.e - (iVar3.minX() * this.e)) + ((this.e * f4) / 2.0f) + (iVar3.maxX() * this.e);
                                com.tsf.shell.f.c.a.d dVar8 = arrayList.get(i5 + 1);
                                if (fMinX2 < dVar8.f) {
                                    b(dVar7, dVar6, iVar3, (dVar8.f - dVar7.e) / ((iVar3.maxX() - iVar3.minX()) + f4), f4);
                                    a(dVar6, f2, f3, 0.0f, f);
                                    break;
                                }
                            }
                            f12 = dVar6.d;
                            i4 = i5 + 1;
                        }
                    }
                }
            }
            return aVarA.a;
        }
        return iB;
    }

    private void a(com.tsf.shell.f.c.a.d dVar, float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        if (dVar.f < f) {
            if (dVar.f < 0.0f) {
                dVar.i = 0.0f;
            } else {
                dVar.i = (dVar.f / f) * 255.0f;
            }
            dVar.h = false;
            return;
        }
        if (dVar.e > f5) {
            if (dVar.e > f4) {
            }
            dVar.h = false;
        } else {
            dVar.i = 255.0f;
            dVar.h = false;
        }
    }

    private void a(com.tsf.shell.f.c.a.d dVar, com.tsf.shell.f.c.a.d dVar2, com.censivn.C3DEngine.b.f.i iVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        dVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        dVar2.a = (dVar.f - (iVar.maxX() * f)) - f3;
        dVar2.f = (dVar2.a + (iVar.minX() * f)) - f3;
        dVar2.e = f3 + dVar2.a + (iVar.maxX() * f);
        dVar2.c = 0.0f;
        a(dVar2, iVar, f, true);
        dVar2.h = false;
    }

    private void b(com.tsf.shell.f.c.a.d dVar, com.tsf.shell.f.c.a.d dVar2, com.censivn.C3DEngine.b.f.i iVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        dVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        dVar2.a = (dVar.e - (iVar.minX() * f)) + f3;
        dVar2.f = (dVar2.a + (iVar.minX() * f)) - f3;
        dVar2.e = f3 + dVar2.a + (iVar.maxX() * f);
        dVar2.c = 0.0f;
        a(dVar2, iVar, f, true);
        dVar2.h = false;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public void a(ArrayList<com.tsf.shell.f.c.a.d> arrayList, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList2, int i, float f, float f2, float f3, float f4) {
        float fA = a(i, arrayList2, f4);
        float f5 = (f - f2) - f3;
        float f6 = f5 / fA;
        float f7 = f6 > 1.0f ? 1.0f : f6;
        if (96.0f * com.censivn.C3DEngine.b.b.a.b * f7 < com.tsf.shell.f.c.a.f.d * 0.75f) {
            this.d = true;
        } else {
            this.d = false;
        }
        float f8 = f4 * f7;
        float f9 = f8 / 2.0f;
        if (f7 == 1.0f) {
            float f10 = f2 + ((f5 - fA) / 2.0f);
            int i2 = 0;
            float fMaxX = f10;
            while (i2 < i) {
                com.censivn.C3DEngine.b.f.i iVar = arrayList2.get(i2);
                com.tsf.shell.f.c.a.d dVar = arrayList.get(i2);
                dVar.a = fMaxX - iVar.minX();
                dVar.f = (dVar.a + iVar.minX()) - f9;
                dVar.e = dVar.a + iVar.maxX() + f9;
                dVar.c = 0.0f;
                dVar.i = 255.0f;
                a(dVar, iVar, f7, false);
                dVar.g = a(dVar, iVar, f7);
                dVar.d = f7;
                dVar.h = false;
                i2++;
                fMaxX = iVar.maxX() + dVar.a + f8;
            }
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            com.censivn.C3DEngine.b.f.i iVar2 = arrayList2.get(i3);
            com.tsf.shell.f.c.a.d dVar2 = arrayList.get(i3);
            dVar2.a = f2 - (iVar2.minX() * f7);
            dVar2.f = (dVar2.a + (iVar2.minX() * f7)) - f9;
            dVar2.e = dVar2.a + (iVar2.maxX() * f7) + f9;
            dVar2.c = 0.0f;
            dVar2.i = 255.0f;
            a(dVar2, iVar2, f7, false);
            dVar2.g = a(dVar2, iVar2, f7);
            dVar2.d = f7;
            dVar2.h = false;
            f2 = (iVar2.maxX() * f7) + dVar2.a + f8;
        }
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public int a(Number3d number3d, ArrayList<com.tsf.shell.f.c.a.d> arrayList, int i) {
        float f = number3d.x;
        com.tsf.shell.f.c.a.d dVar = arrayList.get(0);
        com.tsf.shell.f.c.a.d dVar2 = arrayList.get(i - 1);
        if (f < dVar.f) {
            return -1;
        }
        if (f < dVar.a) {
            return 0;
        }
        if (f > dVar2.e) {
            return -2;
        }
        if (f > dVar2.a) {
            return i - 1;
        }
        int i2 = 1;
        com.tsf.shell.f.c.a.d dVar3 = dVar;
        while (i2 < i) {
            com.tsf.shell.f.c.a.d dVar4 = arrayList.get(i2);
            if (f >= dVar3.a && f <= dVar4.a) {
                return f > dVar3.e ? i2 : i2 - 1;
            }
            i2++;
            dVar3 = dVar4;
        }
        return 0;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public void a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3) {
        iVar.setAABBPX(0.0f + f, -2.1474836E9f, 0.0f, f3 - f2, com.censivn.C3DEngine.b.b.a.b * 83.0f, 0.0f);
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public float a(float f, float f2) {
        return ((com.censivn.C3DEngine.b.b.a.D / 2) - com.tsf.shell.f.c.a.f.a) - f;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public boolean a(Number3d number3d, com.censivn.C3DEngine.b.f.i iVar, boolean z) {
        if (number3d.x < iVar.position().x) {
            return z;
        }
        return !z;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public float a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getX() + f) - motionEvent.getX();
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public a.C0080a a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3, float f4) {
        float fAsin;
        a.C0080a c0080a = a.b;
        if (((-com.censivn.C3DEngine.b.b.a.z) - com.tsf.shell.f.c.a.f.a) + iVar.position().x > f) {
            fAsin = 180.0f;
        } else {
            fAsin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        c0080a.a = f4;
        c0080a.b = ((fAsin - (f4 - f2)) + f2) - f3;
        c0080a.d = ((f4 / 2.0f) - 90.0f) - f2;
        c0080a.e = ((f4 - f2) - 90.0f) + (c0080a.b / 2.0f) + f3;
        return c0080a;
    }

    @Override // com.tsf.shell.f.c.a.a.a
    public int a(float f, float f2, float f3) {
        if (f > f2 - 20.0f && f < f2 + 20.0f) {
            return 2;
        }
        if ((f <= f3 - 20.0f || f >= f3 + 20.0f) && f > f2 && f < f3) {
        }
        return 1;
    }
}
