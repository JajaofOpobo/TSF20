package com.tsf.shell.p096f.p101c.p102a.p103a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p101c.p102a.C2310d;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2288a;
import com.tsf.shell.p096f.p101c.p102a.p104b.C2308a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c.a.a.e */
/* loaded from: classes.dex */
public class C2293e extends C2297i {
    public C2293e() {
        this.f7473c = 0;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: b */
    public int mo5923b(float f, float f2) {
        return m5946b(f);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public int mo5928a(ArrayList<C2310d> arrayList, ArrayList<C0975i> arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        float maxY;
        int mo5923b = mo5923b(f5, f6);
        if (mo5923b == 0) {
            C2308a a = m5947a(-f6, f, f2, f3, i);
            if (a.f7533a == -1 || a.f7533a == -2) {
                mo5929a(arrayList, arrayList2, i, f, f2, f3, f4);
            } else {
                int i2 = a.f7533a;
                C0975i c0975i = arrayList2.get(i2);
                C2310d c2310d = arrayList.get(i2);
                float abs = Math.abs(a.f7534b);
                float f7 = 1.4f - (0.2f * abs);
                float f8 = (f4 * f7) / 2.0f;
                if (a.f7534b > 0.0f) {
                    maxY = (((-a.f7536d) - (a.f7535c / 2.0f)) - (c0975i.minY() * f7)) + f8;
                } else {
                    maxY = (((-a.f7536d) + (a.f7535c / 2.0f)) - (c0975i.maxY() * f7)) - f8;
                }
                c2310d.f7538b = ((maxY + a.f7536d) * abs) + (-a.f7536d);
                c2310d.f7540d = f7;
                c2310d.f7542f = c2310d.f7538b + (c0975i.maxY() * f7) + f8;
                c2310d.f7541e = (c2310d.f7538b + (c0975i.minY() * f7)) - f8;
                c2310d.f7539c = 0.0f;
                c2310d.f7545i = 255.0f;
                mo5918a(c2310d, c0975i, f7, true);
                c2310d.f7544h = false;
                if (i2 > 0) {
                    C2310d c2310d2 = arrayList.get(i2 - 1);
                    m5937a(c2310d, c2310d2, arrayList2.get(i2 - 1), 1.0f - (a.f7534b * 0.2f), f4);
                    m5938a(c2310d2, f2, f3, 0.0f, f);
                    float f9 = c2310d2.f7540d;
                    if (i2 > 1) {
                        int i3 = i2 - 2;
                        float f10 = f9;
                        C2310d c2310d3 = c2310d2;
                        while (true) {
                            if (i3 <= -1) {
                                break;
                            }
                            C2310d c2310d4 = arrayList.get(i3);
                            C0975i c0975i2 = arrayList2.get(i3);
                            float f11 = f10 - 0.4f;
                            m5937a(c2310d3, c2310d4, c0975i2, f11, f4);
                            m5938a(c2310d4, f2, f3, 0.0f, f);
                            if (f11 - 0.4f < this.f7475e && i3 > 0) {
                                float minY = ((this.f7475e * f4) / 2.0f) + (c2310d3.f7542f - (c0975i2.minY() * this.f7475e)) + ((this.f7475e * f4) / 2.0f) + (c0975i2.maxY() * this.f7475e);
                                C2310d c2310d5 = arrayList.get(i3 - 1);
                                if (minY < c2310d5.f7541e) {
                                    m5937a(c2310d3, c2310d4, c0975i2, (c2310d5.f7541e - c2310d3.f7542f) / ((c0975i2.maxY() - c0975i2.minY()) + f4), f4);
                                    m5938a(c2310d4, f2, f3, 0.0f, f);
                                    break;
                                }
                            }
                            i3--;
                            c2310d3 = c2310d4;
                            f10 = c2310d4.f7540d;
                        }
                    }
                }
                if (i2 < i - 1) {
                    C2310d c2310d6 = arrayList.get(i2 + 1);
                    m5936b(c2310d, c2310d6, arrayList2.get(i2 + 1), (a.f7534b * 0.2f) + 1.0f, f4);
                    m5938a(c2310d6, f2, f3, 0.0f, f);
                    float f12 = c2310d6.f7540d;
                    if (i2 < i - 2) {
                        int i4 = i2 + 2;
                        while (true) {
                            int i5 = i4;
                            float f13 = f12;
                            C2310d c2310d7 = c2310d6;
                            if (i5 >= i) {
                                break;
                            }
                            c2310d6 = arrayList.get(i5);
                            C0975i c0975i3 = arrayList2.get(i5);
                            float f14 = f13 - 0.4f;
                            m5936b(c2310d7, c2310d6, c0975i3, f14, f4);
                            m5938a(c2310d6, f2, f3, 0.0f, f);
                            if (f14 - 0.4f < this.f7475e && i5 < i - 1) {
                                float maxY2 = (((c2310d7.f7541e - (c0975i3.maxY() * this.f7475e)) - ((this.f7475e * f4) / 2.0f)) + (c0975i3.minY() * this.f7475e)) - ((this.f7475e * f4) / 2.0f);
                                C2310d c2310d8 = arrayList.get(i5 + 1);
                                if (maxY2 > c2310d8.f7542f) {
                                    m5936b(c2310d7, c2310d6, c0975i3, (c2310d7.f7541e - c2310d8.f7542f) / ((c0975i3.maxY() - c0975i3.minY()) + f4), f4);
                                    m5938a(c2310d6, f2, f3, 0.0f, f);
                                    break;
                                }
                            }
                            f12 = c2310d6.f7540d;
                            i4 = i5 + 1;
                        }
                    }
                }
            }
            return a.f7533a;
        }
        return mo5923b;
    }

    /* renamed from: a */
    private void m5938a(C2310d c2310d, float f, float f2, float f3, float f4) {
        float f5 = -(f4 - f2);
        if (c2310d.f7542f > (-f)) {
            if (c2310d.f7542f > 0.0f) {
                c2310d.f7545i = 0.0f;
            } else {
                c2310d.f7545i = (c2310d.f7542f / (-f)) * 255.0f;
            }
            c2310d.f7544h = false;
        } else if (c2310d.f7541e < f5) {
            if (c2310d.f7541e < (-f4)) {
            }
            c2310d.f7544h = false;
        } else {
            c2310d.f7545i = 255.0f;
            c2310d.f7544h = false;
        }
    }

    /* renamed from: a */
    private void m5937a(C2310d c2310d, C2310d c2310d2, C0975i c0975i, float f, float f2) {
        if (f < this.f7475e) {
            f = this.f7475e;
        }
        c2310d2.f7540d = f;
        float f3 = (f2 * f) / 2.0f;
        c2310d2.f7538b = (c2310d.f7542f - (c0975i.minY() * f)) + f3;
        c2310d2.f7542f = c2310d2.f7538b + (c0975i.maxY() * f) + f3;
        c2310d2.f7541e = (c2310d2.f7538b + (c0975i.minY() * f)) - f3;
        c2310d2.f7539c = 0.0f;
        mo5918a(c2310d2, c0975i, f, true);
        c2310d2.f7544h = false;
    }

    /* renamed from: b */
    private void m5936b(C2310d c2310d, C2310d c2310d2, C0975i c0975i, float f, float f2) {
        if (f < this.f7475e) {
            f = this.f7475e;
        }
        c2310d2.f7540d = f;
        float f3 = (f2 * f) / 2.0f;
        c2310d2.f7538b = (c2310d.f7541e - (c0975i.maxY() * f)) - f3;
        c2310d2.f7542f = c2310d2.f7538b + (c0975i.maxY() * f) + f3;
        c2310d2.f7541e = (c2310d2.f7538b + (c0975i.minY() * f)) - f3;
        c2310d2.f7539c = 0.0f;
        mo5918a(c2310d2, c0975i, f, true);
        c2310d2.f7544h = false;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5929a(ArrayList<C2310d> arrayList, ArrayList<C0975i> arrayList2, int i, float f, float f2, float f3, float f4) {
        float a = mo5922a(i, arrayList2, f4);
        float f5 = (f - f2) - f3;
        float f6 = f5 / a;
        float f7 = f6 > 1.0f ? 1.0f : f6;
        if (96.0f * C0892a.f2566b * f7 < C2326f.f7569d * 0.75f) {
            this.f7474d = true;
        } else {
            this.f7474d = false;
        }
        float f8 = f4 * f7;
        float f9 = f8 / 2.0f;
        if (f7 == 1.0f) {
            float f10 = f5 - a;
            int i2 = 0;
            float f11 = (-f2) - (f10 / 2.0f);
            while (i2 < i) {
                C0975i c0975i = arrayList2.get(i2);
                C2310d c2310d = arrayList.get(i2);
                c2310d.f7538b = f11 - c0975i.maxY();
                c2310d.f7542f = c2310d.f7538b + c0975i.maxY() + f9;
                c2310d.f7541e = (c2310d.f7538b + c0975i.minY()) - f9;
                c2310d.f7539c = 0.0f;
                c2310d.f7545i = 255.0f;
                mo5918a(c2310d, c0975i, f7, false);
                c2310d.f7543g = mo5919a(c2310d, c0975i, f7);
                c2310d.f7540d = f7;
                c2310d.f7544h = false;
                i2++;
                f11 = (c0975i.minY() + c2310d.f7538b) - f8;
            }
            return;
        }
        int i3 = 0;
        float f12 = (-f2) - C3566b.f11839a.f11767Y;
        while (i3 < i) {
            C0975i c0975i2 = arrayList2.get(i3);
            C2310d c2310d2 = arrayList.get(i3);
            c2310d2.f7538b = f12 - (c0975i2.maxY() * f7);
            c2310d2.f7542f = c2310d2.f7538b + (c0975i2.maxY() * f7) + f9;
            c2310d2.f7541e = (c2310d2.f7538b + (c0975i2.minY() * f7)) - f9;
            c2310d2.f7539c = 0.0f;
            c2310d2.f7545i = 255.0f;
            mo5918a(c2310d2, c0975i2, f7, false);
            c2310d2.f7543g = mo5919a(c2310d2, c0975i2, f7);
            c2310d2.f7540d = f7;
            c2310d2.f7544h = false;
            i3++;
            f12 = ((c0975i2.minY() * f7) + c2310d2.f7538b) - f8;
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public int mo5932a(Number3d number3d, ArrayList<C2310d> arrayList, int i) {
        float f = number3d.f2527y;
        C2310d c2310d = arrayList.get(0);
        C2310d c2310d2 = arrayList.get(i - 1);
        if (f > c2310d.f7542f) {
            return -1;
        }
        if (f > c2310d.f7538b) {
            return 0;
        }
        if (f < c2310d2.f7541e) {
            return -2;
        }
        if (f < c2310d2.f7538b) {
            return i - 1;
        }
        int i2 = 1;
        C2310d c2310d3 = c2310d;
        while (i2 < i) {
            C2310d c2310d4 = arrayList.get(i2);
            if (f <= c2310d3.f7538b && f >= c2310d4.f7538b) {
                return f < c2310d3.f7541e ? i2 : i2 - 1;
            }
            i2++;
            c2310d3 = c2310d4;
        }
        return 0;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public void mo5925a(C0975i c0975i, float f, float f2, float f3) {
        c0975i.setAABBPX(-2.1474836E9f, (-f3) + f2, 0.0f, C0892a.f2566b * 83.0f, 0.0f - f, 0.0f);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public float mo5935a(float f, float f2) {
        return ((C0892a.f2554E / 2) - C2326f.f7566a) + f2;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public boolean mo5933a(Number3d number3d, C0975i c0975i, boolean z) {
        return number3d.f2527y < c0975i.position().f2527y ? !z : z;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public float mo5934a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getY() + f) - motionEvent.getY();
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public C2288a.C2289a mo5924a(C0975i c0975i, float f, float f2, float f3, float f4) {
        float asin;
        C2288a.C2289a c2289a = C2288a.f7472b;
        float f5 = (C0892a.f2551B - C2326f.f7566a) - c0975i.position().f2527y;
        if (f5 > f) {
            asin = 180.0f;
        } else {
            asin = ((float) (Math.asin(f5 / f) / 0.017453292519943295d)) + 90.0f;
        }
        c2289a.f7476a = f4;
        c2289a.f7477b = ((asin - (f4 - f2)) + f2) - f3;
        c2289a.f7479d = ((f4 / 2.0f) - 180.0f) - f2;
        c2289a.f7480e = ((f4 - f2) - 180.0f) + (c2289a.f7477b / 2.0f) + f3;
        return c2289a;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.p103a.C2288a
    /* renamed from: a */
    public int mo5926a(float f, float f2, float f3) {
        return (f <= f2 - 20.0f || f >= f2 + 20.0f) ? 1 : 2;
    }
}
