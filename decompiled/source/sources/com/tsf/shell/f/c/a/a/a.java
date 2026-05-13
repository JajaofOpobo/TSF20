package com.tsf.shell.f.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    public static com.tsf.shell.f.c.a.b.a a = new com.tsf.shell.f.c.a.b.a();
    public static C0080a b = new C0080a();
    public int c;
    public boolean d;
    public float e = 0.3f;

    /* renamed from: com.tsf.shell.f.c.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0080a {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 0.0f;
    }

    public void a(ArrayList<com.tsf.shell.f.c.a.d> arrayList, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList2, int i, float f, float f2, float f3, float f4) {
    }

    public float a(int i, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, float f) {
        return 0.0f;
    }

    public int a(Number3d number3d, ArrayList<com.tsf.shell.f.c.a.d> arrayList, int i) {
        return 0;
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3) {
    }

    public float a(float f, float f2) {
        return 500.0f;
    }

    public void a(com.tsf.shell.f.c.a.d dVar, com.censivn.C3DEngine.b.f.i iVar, float f, boolean z) {
    }

    public boolean a(Number3d number3d, com.censivn.C3DEngine.b.f.i iVar, boolean z) {
        return false;
    }

    public Number3d a(com.censivn.C3DEngine.b.f.i iVar) {
        return null;
    }

    public Number3d b(com.censivn.C3DEngine.b.f.i iVar) {
        return null;
    }

    public float a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, int i, float f, float f2, float f3, float f4) {
        return 0.0f;
    }

    public float a(float f, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return 0.0f;
    }

    public int a(ArrayList<com.tsf.shell.f.c.a.d> arrayList, ArrayList<com.censivn.C3DEngine.b.f.i> arrayList2, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        return -1;
    }

    public int b(float f, float f2) {
        return 0;
    }

    public void a(float f) {
        this.e = f;
    }

    public int b(float f) {
        if (f > com.tsf.shell.f.c.a.f.e) {
            if (f > com.tsf.shell.f.c.a.f.f) {
                return -4;
            }
            return -3;
        }
        return 0;
    }

    public com.tsf.shell.f.c.a.b.a a(float f, float f2, float f3, float f4, int i) {
        if (f < f3) {
            a.a = -1;
            return a;
        } else if (f > f2 - f4) {
            a.a = i - 1;
            a.b = 0.5f;
            a.d = ((((f2 - f3) - f4) / i) * (a.a + 0.5f)) + f3;
            return a;
        } else {
            float f5 = ((f2 - f3) - f4) / i;
            int i2 = (int) ((f - f3) / f5);
            if (i2 > i - 1) {
                i2 = i - 1;
            }
            a.a = i2;
            a.b = ((((f - f3) - (i2 * f5)) / f5) - 0.5f) * 2.0f;
            a.c = f5;
            a.d = ((i2 + 0.5f) * f5) + f3;
            return a;
        }
    }

    public void a(j jVar, j jVar2) {
    }

    public C0080a a(com.censivn.C3DEngine.b.f.i iVar, float f, float f2, float f3, float f4) {
        return null;
    }

    public int a(float f, float f2, float f3) {
        return 0;
    }
}
