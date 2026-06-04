package com.tsf.shell.workspace3D.e.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.workspace3D.e.o;
import com.tsf.shell.workspace3D.e.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends e {
    @Override // com.tsf.shell.workspace3D.e.b.a
    public int b(float f, float f2) {
        return b(f2);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final int a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        float al;
        int b = b(f5, f6);
        if (b == 0) {
            com.tsf.shell.workspace3D.e.c.a a = a(f5, f, f2, f3, i);
            if (a.a == -1 || a.a == -2) {
                a(arrayList, arrayList2, i, f, f2, f3, f4);
            } else {
                int i2 = a.a;
                r rVar = (r) arrayList2.get(i2);
                o oVar = (o) arrayList.get(i2);
                float abs = Math.abs(a.b);
                float f7 = 1.4f - (0.2f * abs);
                float f8 = (f4 * f7) / 2.0f;
                if (a.b > 0.0f) {
                    al = ((a.d + (a.c / 2.0f)) - (rVar.ao() * f7)) - f8;
                } else {
                    al = ((a.d - (a.c / 2.0f)) - (rVar.al() * f7)) + f8;
                }
                oVar.a = ((al - a.d) * abs) + a.d;
                oVar.d = f7;
                oVar.f = (oVar.a + (rVar.al() * f7)) - f8;
                oVar.e = oVar.a + (rVar.ao() * f7) + f8;
                oVar.c = 0.0f;
                oVar.i = 255.0f;
                a(oVar, rVar, f7, true);
                oVar.h = false;
                if (i2 > 0) {
                    o oVar2 = (o) arrayList.get(i2 - 1);
                    a(oVar, oVar2, (r) arrayList2.get(i2 - 1), 1.0f - (a.b * 0.2f), f4);
                    a(oVar2, f2, f3, f);
                    float f9 = oVar2.d;
                    if (i2 > 1) {
                        int i3 = i2 - 2;
                        o oVar3 = oVar2;
                        while (true) {
                            if (i3 < 0) {
                                break;
                            }
                            o oVar4 = (o) arrayList.get(i3);
                            r rVar2 = (r) arrayList2.get(i3);
                            float f10 = f9 - 0.4f;
                            a(oVar3, oVar4, rVar2, f10, f4);
                            a(oVar4, f2, f3, f);
                            if (f10 - 0.4f < this.e && i3 > 0) {
                                float ao = (((oVar3.f - (rVar2.ao() * this.e)) - ((this.e * f4) / 2.0f)) + (rVar2.al() * this.e)) - ((this.e * f4) / 2.0f);
                                o oVar5 = (o) arrayList.get(i3 - 1);
                                if (ao > oVar5.e) {
                                    a(oVar3, oVar4, rVar2, (oVar3.f - oVar5.e) / ((rVar2.ao() - rVar2.al()) + f4), f4);
                                    a(oVar4, f2, f3, f);
                                    break;
                                }
                            }
                            f9 = oVar4.d;
                            i3--;
                            oVar3 = oVar4;
                        }
                    }
                }
                if (i2 < i - 1) {
                    o oVar6 = (o) arrayList.get(i2 + 1);
                    b(oVar, oVar6, (r) arrayList2.get(i2 + 1), (a.b * 0.2f) + 1.0f, f4);
                    a(oVar6, f2, f3, f);
                    float f11 = oVar6.d;
                    if (i2 < i - 2) {
                        int i4 = i2 + 2;
                        while (true) {
                            int i5 = i4;
                            o oVar7 = oVar6;
                            if (i5 >= i) {
                                break;
                            }
                            oVar6 = (o) arrayList.get(i5);
                            r rVar3 = (r) arrayList2.get(i5);
                            float f12 = f11 - 0.4f;
                            b(oVar7, oVar6, rVar3, f12, f4);
                            a(oVar6, f2, f3, f);
                            if (f12 - 0.4f < this.e && i5 < i - 1) {
                                float al2 = ((this.e * f4) / 2.0f) + (oVar7.e - (rVar3.al() * this.e)) + ((this.e * f4) / 2.0f) + (rVar3.ao() * this.e);
                                o oVar8 = (o) arrayList.get(i5 + 1);
                                if (al2 < oVar8.f) {
                                    b(oVar7, oVar6, rVar3, (oVar8.f - oVar7.e) / ((rVar3.ao() - rVar3.al()) + f4), f4);
                                    a(oVar6, f2, f3, f);
                                    break;
                                }
                            }
                            f11 = oVar6.d;
                            i4 = i5 + 1;
                        }
                    }
                }
            }
            return a.a;
        }
        return b;
    }

    private static void a(o oVar, float f, float f2, float f3) {
        float f4 = f3 - f2;
        if (oVar.f < f) {
            if (oVar.f < 0.0f) {
                oVar.i = 0.0f;
            } else {
                oVar.i = (oVar.f / f) * 255.0f;
            }
            oVar.h = false;
            return;
        }
        if (oVar.e > f4) {
            float f5 = oVar.e;
            oVar.h = false;
        } else {
            oVar.i = 255.0f;
            oVar.h = false;
        }
    }

    private void a(o oVar, o oVar2, r rVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        oVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        oVar2.a = (oVar.f - (rVar.ao() * f)) - f3;
        oVar2.f = (oVar2.a + (rVar.al() * f)) - f3;
        oVar2.e = f3 + oVar2.a + (rVar.ao() * f);
        oVar2.c = 0.0f;
        a(oVar2, rVar, f, true);
        oVar2.h = false;
    }

    private void b(o oVar, o oVar2, r rVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        oVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        oVar2.a = (oVar.e - (rVar.al() * f)) + f3;
        oVar2.f = (oVar2.a + (rVar.al() * f)) - f3;
        oVar2.e = f3 + oVar2.a + (rVar.ao() * f);
        oVar2.c = 0.0f;
        a(oVar2, rVar, f, true);
        oVar2.h = false;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final void a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4) {
        float a = a(i, arrayList2, f4);
        float f5 = (f - f2) - f3;
        float f6 = f5 / a;
        float f7 = f6 > 1.0f ? 1.0f : f6;
        if (96.0f * com.censivn.C3DEngine.a.b * f7 < p.d * 0.75f) {
            this.d = true;
        } else {
            this.d = false;
        }
        float f8 = f4 * f7;
        float f9 = f8 / 2.0f;
        if (f7 == 1.0f) {
            float f10 = f2 + ((f5 - a) / 2.0f);
            int i2 = 0;
            float f11 = f10;
            while (i2 < i) {
                r rVar = (r) arrayList2.get(i2);
                o oVar = (o) arrayList.get(i2);
                oVar.a = f11 - rVar.al();
                oVar.f = (oVar.a + rVar.al()) - f9;
                oVar.e = oVar.a + rVar.ao() + f9;
                oVar.c = 0.0f;
                oVar.i = 255.0f;
                a(oVar, rVar, f7, false);
                oVar.g = a(oVar, rVar, f7);
                oVar.d = f7;
                oVar.h = false;
                i2++;
                f11 = rVar.ao() + oVar.a + f8;
            }
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            r rVar2 = (r) arrayList2.get(i3);
            o oVar2 = (o) arrayList.get(i3);
            oVar2.a = f2 - (rVar2.al() * f7);
            oVar2.f = (oVar2.a + (rVar2.al() * f7)) - f9;
            oVar2.e = oVar2.a + (rVar2.ao() * f7) + f9;
            oVar2.c = 0.0f;
            oVar2.i = 255.0f;
            a(oVar2, rVar2, f7, false);
            oVar2.g = a(oVar2, rVar2, f7);
            oVar2.d = f7;
            oVar2.h = false;
            f2 = oVar2.a + (rVar2.ao() * f7) + f8;
        }
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final int a(Number3d number3d, ArrayList arrayList, int i) {
        float f = number3d.x;
        o oVar = (o) arrayList.get(0);
        o oVar2 = (o) arrayList.get(i - 1);
        if (f < oVar.f) {
            return -1;
        }
        if (f < oVar.a) {
            return 0;
        }
        if (f > oVar2.e) {
            return -2;
        }
        if (f > oVar2.a) {
            return i - 1;
        }
        int i2 = 1;
        o oVar3 = oVar;
        while (i2 < i) {
            o oVar4 = (o) arrayList.get(i2);
            if (f >= oVar3.a && f <= oVar4.a) {
                return f > oVar3.e ? i2 : i2 - 1;
            }
            i2++;
            oVar3 = oVar4;
        }
        return 0;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public void a(r rVar, float f, float f2, float f3) {
        rVar.b(0.0f + f, -2.1474836E9f, 0.0f, f3 - f2, com.censivn.C3DEngine.a.b * 83.0f);
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(float f, float f2) {
        return ((com.censivn.C3DEngine.a.j / 2) - p.a) - f;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final boolean a(Number3d number3d, r rVar, boolean z) {
        if (number3d.x < rVar.L().x) {
            return z;
        }
        return !z;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public final float a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getX() + f) - motionEvent.getX();
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public b a(r rVar, float f) {
        float asin;
        b bVar = a.b;
        if (((-com.censivn.C3DEngine.a.e) - p.a) + rVar.L().x > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        bVar.a = 24.0f;
        bVar.b = ((asin - 16.0f) + 8.0f) - 4.0f;
        bVar.d = -86.0f;
        bVar.e = (-74.0f) + (bVar.b / 2.0f) + 4.0f;
        return bVar;
    }

    @Override // com.tsf.shell.workspace3D.e.b.a
    public int c(float f, float f2) {
        if (f > f2 - 20.0f && f < f2 + 20.0f) {
            return 2;
        }
        if ((f <= -20.0f || f >= 20.0f) && f > f2 && f < 0.0f) {
        }
        return 1;
    }
}
