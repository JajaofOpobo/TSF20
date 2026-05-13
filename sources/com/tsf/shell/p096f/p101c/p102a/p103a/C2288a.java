package com.tsf.shell.p096f.p101c.p102a.p103a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p101c.p102a.C2310d;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p101c.p102a.p104b.C2308a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c.a.a.a */
/* loaded from: classes.dex */
public class C2288a {

    /* renamed from: a */
    public static C2308a f7471a = new C2308a();

    /* renamed from: b */
    public static C2289a f7472b = new C2289a();

    /* renamed from: c */
    public int f7473c;

    /* renamed from: d */
    public boolean f7474d;

    /* renamed from: e */
    public float f7475e = 0.3f;

    /* renamed from: com.tsf.shell.f.c.a.a.a$a */
    /* loaded from: classes.dex */
    public static class C2289a {

        /* renamed from: a */
        public float f7476a = 0.0f;

        /* renamed from: b */
        public float f7477b = 0.0f;

        /* renamed from: c */
        public float f7478c = 0.0f;

        /* renamed from: d */
        public float f7479d = 0.0f;

        /* renamed from: e */
        public float f7480e = 0.0f;

        /* renamed from: f */
        public float f7481f = 0.0f;
    }

    /* renamed from: a */
    public void mo5929a(ArrayList<C2310d> arrayList, ArrayList<C0975i> arrayList2, int i, float f, float f2, float f3, float f4) {
    }

    /* renamed from: a */
    public float mo5922a(int i, ArrayList<C0975i> arrayList, float f) {
        return 0.0f;
    }

    /* renamed from: a */
    public int mo5932a(Number3d number3d, ArrayList<C2310d> arrayList, int i) {
        return 0;
    }

    /* renamed from: a */
    public void mo5925a(C0975i c0975i, float f, float f2, float f3) {
    }

    /* renamed from: a */
    public float mo5935a(float f, float f2) {
        return 500.0f;
    }

    /* renamed from: a */
    public void mo5918a(C2310d c2310d, C0975i c0975i, float f, boolean z) {
    }

    /* renamed from: a */
    public boolean mo5933a(Number3d number3d, C0975i c0975i, boolean z) {
        return false;
    }

    /* renamed from: a */
    public Number3d mo5921a(C0975i c0975i) {
        return null;
    }

    /* renamed from: b */
    public Number3d mo5916b(C0975i c0975i) {
        return null;
    }

    /* renamed from: a */
    public float mo5917a(ArrayList<C0975i> arrayList, int i, float f, float f2, float f3, float f4) {
        return 0.0f;
    }

    /* renamed from: a */
    public float mo5934a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return 0.0f;
    }

    /* renamed from: a */
    public int mo5928a(ArrayList<C2310d> arrayList, ArrayList<C0975i> arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        return -1;
    }

    /* renamed from: b */
    public int mo5923b(float f, float f2) {
        return 0;
    }

    /* renamed from: a */
    public void m5948a(float f) {
        this.f7475e = f;
    }

    /* renamed from: b */
    public int m5946b(float f) {
        if (f > C2326f.f7570e) {
            if (f > C2326f.f7571f) {
                return -4;
            }
            return -3;
        }
        return 0;
    }

    /* renamed from: a */
    public C2308a m5947a(float f, float f2, float f3, float f4, int i) {
        if (f < f3) {
            f7471a.f7533a = -1;
            return f7471a;
        } else if (f > f2 - f4) {
            f7471a.f7533a = i - 1;
            f7471a.f7534b = 0.5f;
            f7471a.f7536d = ((((f2 - f3) - f4) / i) * (f7471a.f7533a + 0.5f)) + f3;
            return f7471a;
        } else {
            float f5 = ((f2 - f3) - f4) / i;
            int i2 = (int) ((f - f3) / f5);
            if (i2 > i - 1) {
                i2 = i - 1;
            }
            f7471a.f7533a = i2;
            f7471a.f7534b = ((((f - f3) - (i2 * f5)) / f5) - 0.5f) * 2.0f;
            f7471a.f7535c = f5;
            f7471a.f7536d = ((i2 + 0.5f) * f5) + f3;
            return f7471a;
        }
    }

    /* renamed from: a */
    public void mo5920a(C0980j c0980j, C0980j c0980j2) {
    }

    /* renamed from: a */
    public C2289a mo5924a(C0975i c0975i, float f, float f2, float f3, float f4) {
        return null;
    }

    /* renamed from: a */
    public int mo5926a(float f, float f2, float f3) {
        return 0;
    }
}
