package com.tsf.shell.e.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends j {
    public g() {
        this.c = 0;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public int b(float f, float f2) {
        return b(f);
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public int a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        float minY;
        int b = b(f5, f6);
        if (b == 0) {
            com.tsf.shell.e.c.a.b.a a = a(f6, f, f2, f3, i);
            if (a.a == -1 || a.a == -2) {
                a(arrayList, arrayList2, i, f, f2, f3, f4);
            } else {
                int i2 = a.a;
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList2.get(i2);
                com.tsf.shell.e.c.a.d dVar = (com.tsf.shell.e.c.a.d) arrayList.get(i2);
                float abs = Math.abs(a.b);
                float f7 = 1.4f - (0.2f * abs);
                float f8 = (f4 * f7) / 2.0f;
                if (a.b > 0.0f) {
                    minY = ((a.d + (a.c / 2.0f)) - (jVar.maxY() * f7)) - f8;
                } else {
                    minY = ((a.d - (a.c / 2.0f)) - (jVar.minY() * f7)) + f8;
                }
                dVar.b = ((minY - a.d) * abs) + a.d;
                dVar.d = f7;
                dVar.f = (dVar.b + (jVar.minY() * f7)) - f8;
                dVar.e = dVar.b + (jVar.maxY() * f7) + f8;
                dVar.c = 0.0f;
                dVar.i = 255.0f;
                a(dVar, jVar, f7, true);
                dVar.h = false;
                if (i2 > 0) {
                    com.tsf.shell.e.c.a.d dVar2 = (com.tsf.shell.e.c.a.d) arrayList.get(i2 - 1);
                    a(dVar, dVar2, (com.censivn.C3DEngine.b.f.j) arrayList2.get(i2 - 1), 1.0f - (a.b * 0.2f), f4);
                    a(dVar2, f2, f3, 0.0f, f);
                    float f9 = dVar2.d;
                    if (i2 > 1) {
                        int i3 = i2 - 2;
                        float f10 = f9;
                        com.tsf.shell.e.c.a.d dVar3 = dVar2;
                        while (true) {
                            if (i3 <= -1) {
                                break;
                            }
                            com.tsf.shell.e.c.a.d dVar4 = (com.tsf.shell.e.c.a.d) arrayList.get(i3);
                            com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) arrayList2.get(i3);
                            float f11 = f10 - 0.4f;
                            a(dVar3, dVar4, jVar2, f11, f4);
                            a(dVar4, f2, f3, 0.0f, f);
                            if (f11 - 0.4f < this.e && i3 > 0) {
                                float maxY = (((dVar3.f - (jVar2.maxY() * this.e)) - ((this.e * f4) / 2.0f)) + (jVar2.minY() * this.e)) - ((this.e * f4) / 2.0f);
                                com.tsf.shell.e.c.a.d dVar5 = (com.tsf.shell.e.c.a.d) arrayList.get(i3 - 1);
                                if (maxY > dVar5.e) {
                                    a(dVar3, dVar4, jVar2, (dVar3.f - dVar5.e) / ((jVar2.maxY() - jVar2.minY()) + f4), f4);
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
                    com.tsf.shell.e.c.a.d dVar6 = (com.tsf.shell.e.c.a.d) arrayList.get(i2 + 1);
                    b(dVar, dVar6, (com.censivn.C3DEngine.b.f.j) arrayList2.get(i2 + 1), (a.b * 0.2f) + 1.0f, f4);
                    a(dVar6, f2, f3, 0.0f, f);
                    float f12 = dVar6.d;
                    if (i2 < i - 2) {
                        int i4 = i2 + 2;
                        while (true) {
                            int i5 = i4;
                            float f13 = f12;
                            com.tsf.shell.e.c.a.d dVar7 = dVar6;
                            if (i5 >= i) {
                                break;
                            }
                            dVar6 = (com.tsf.shell.e.c.a.d) arrayList.get(i5);
                            com.censivn.C3DEngine.b.f.j jVar3 = (com.censivn.C3DEngine.b.f.j) arrayList2.get(i5);
                            float f14 = f13 - 0.4f;
                            b(dVar7, dVar6, jVar3, f14, f4);
                            a(dVar6, f2, f3, 0.0f, f);
                            if (f14 - 0.4f < this.e && i5 < i - 1) {
                                float minY2 = ((this.e * f4) / 2.0f) + (dVar7.e - (jVar3.minY() * this.e)) + ((this.e * f4) / 2.0f) + (jVar3.maxY() * this.e);
                                com.tsf.shell.e.c.a.d dVar8 = (com.tsf.shell.e.c.a.d) arrayList.get(i5 + 1);
                                if (minY2 < dVar8.f) {
                                    b(dVar7, dVar6, jVar3, (dVar8.f - dVar7.e) / ((jVar3.maxY() - jVar3.minY()) + f4), f4);
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
            return a.a;
        }
        return b;
    }

    private void a(com.tsf.shell.e.c.a.d dVar, float f, float f2, float f3, float f4) {
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
            float f6 = dVar.e;
            dVar.h = false;
        } else {
            dVar.i = 255.0f;
            dVar.h = false;
        }
    }

    private void a(com.tsf.shell.e.c.a.d dVar, com.tsf.shell.e.c.a.d dVar2, com.censivn.C3DEngine.b.f.j jVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        dVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        dVar2.b = (dVar.f - (jVar.maxY() * f)) - f3;
        dVar2.f = (dVar2.b + (jVar.minY() * f)) - f3;
        dVar2.e = f3 + dVar2.b + (jVar.maxY() * f);
        dVar2.c = 0.0f;
        a(dVar2, jVar, f, true);
        dVar2.h = false;
    }

    private void b(com.tsf.shell.e.c.a.d dVar, com.tsf.shell.e.c.a.d dVar2, com.censivn.C3DEngine.b.f.j jVar, float f, float f2) {
        if (f < this.e) {
            f = this.e;
        }
        dVar2.d = f;
        float f3 = (f2 * f) / 2.0f;
        dVar2.b = (dVar.e - (jVar.minY() * f)) + f3;
        dVar2.f = (dVar2.b + (jVar.minY() * f)) - f3;
        dVar2.e = f3 + dVar2.b + (jVar.maxY() * f);
        dVar2.c = 0.0f;
        a(dVar2, jVar, f, true);
        dVar2.h = false;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public void a(ArrayList arrayList, ArrayList arrayList2, int i, float f, float f2, float f3, float f4) {
        float a = a(i, arrayList2, f4);
        float f5 = (f - f2) - f3;
        float f6 = f5 / a;
        float f7 = f6 > 1.0f ? 1.0f : f6;
        if (96.0f * com.censivn.C3DEngine.b.b.a.b * f7 < com.tsf.shell.e.c.a.f.d * 0.75f) {
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
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList2.get(i2);
                com.tsf.shell.e.c.a.d dVar = (com.tsf.shell.e.c.a.d) arrayList.get(i2);
                dVar.b = f11 - jVar.minY();
                dVar.f = (dVar.b + jVar.minY()) - f9;
                dVar.e = dVar.b + jVar.maxY() + f9;
                dVar.c = 0.0f;
                dVar.i = 255.0f;
                a(dVar, jVar, f7, false);
                dVar.g = a(dVar, jVar, f7);
                dVar.d = f7;
                dVar.h = false;
                i2++;
                f11 = jVar.maxY() + dVar.b + f8;
            }
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) arrayList2.get(i3);
            com.tsf.shell.e.c.a.d dVar2 = (com.tsf.shell.e.c.a.d) arrayList.get(i3);
            dVar2.b = f2 - (jVar2.minY() * f7);
            dVar2.f = (dVar2.b + (jVar2.minY() * f7)) - f9;
            dVar2.e = dVar2.b + (jVar2.maxY() * f7) + f9;
            dVar2.c = 0.0f;
            dVar2.i = 255.0f;
            a(dVar2, jVar2, f7, false);
            dVar2.g = a(dVar2, jVar2, f7);
            dVar2.d = f7;
            dVar2.h = false;
            f2 = (jVar2.maxY() * f7) + dVar2.b + f8;
        }
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public int a(Number3d number3d, ArrayList arrayList, int i) {
        float f = number3d.y;
        com.tsf.shell.e.c.a.d dVar = (com.tsf.shell.e.c.a.d) arrayList.get(0);
        com.tsf.shell.e.c.a.d dVar2 = (com.tsf.shell.e.c.a.d) arrayList.get(i - 1);
        if (f < dVar.f) {
            return -1;
        }
        if (f < dVar.b) {
            return 0;
        }
        if (f > dVar2.e) {
            return -2;
        }
        if (f > dVar2.b) {
            return i - 1;
        }
        int i2 = 1;
        com.tsf.shell.e.c.a.d dVar3 = dVar;
        while (i2 < i) {
            com.tsf.shell.e.c.a.d dVar4 = (com.tsf.shell.e.c.a.d) arrayList.get(i2);
            if (f >= dVar3.b && f <= dVar4.b) {
                return f > dVar3.e ? i2 : i2 - 1;
            }
            i2++;
            dVar3 = dVar4;
        }
        return 0;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public void a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3) {
        jVar.setAABBPX(-2.1474836E9f, 0.0f + f, 0.0f, com.censivn.C3DEngine.b.b.a.b * 83.0f, f3 - f2, 0.0f);
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(float f, float f2) {
        return ((com.censivn.C3DEngine.b.b.a.E / 2) - com.tsf.shell.e.c.a.f.a) - f2;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public boolean a(Number3d number3d, com.censivn.C3DEngine.b.f.j jVar, boolean z) {
        if (number3d.y < jVar.position().y) {
            return z;
        }
        return !z;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public float a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent.getY() + f) - motionEvent2.getY();
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public b a(com.censivn.C3DEngine.b.f.j jVar, float f, float f2, float f3, float f4) {
        float asin;
        b bVar = a.b;
        if (((-com.censivn.C3DEngine.b.b.a.C) - com.tsf.shell.e.c.a.f.a) + jVar.position().y > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(r0 / f) / 0.017453292519943295d)) + 90.0f;
        }
        bVar.a = f4;
        bVar.b = ((asin - (f4 - f2)) + f2) - f3;
        bVar.d = (0.0f - (f4 / 2.0f)) + f2;
        bVar.e = ((0.0f - (f4 - f2)) - (bVar.b / 2.0f)) - f3;
        return bVar;
    }

    @Override // com.tsf.shell.e.c.a.a.a
    public int a(float f, float f2, float f3) {
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
