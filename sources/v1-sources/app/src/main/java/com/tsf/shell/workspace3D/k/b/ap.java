package com.tsf.shell.workspace3D.k.b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class ap {
    public static float V;
    public static float W;
    private static SoftReference X;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static float k;
    public static float l;
    public static float m;
    public static float n;
    public static float o;
    public static float p;
    public static float q;
    public static float r;
    public static float s;
    public static float t;
    public static float u;
    public static float v;
    public static float w;
    public static float x;
    public static float y;
    public static float z;
    public static float a = 1.0f;
    public static Number3d b = new Number3d();
    public static int A = 0;
    public static int B = 0;
    private static int Y = 0;
    private static int Z = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    public static float F = 0.0f;
    public static int G = 0;
    public static int H = 0;
    private static int aa = 0;
    private static int ab = 0;
    public static int I = 0;
    public static int J = 0;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;
    public static float N = 0.0f;
    public static float O = 0.0f;
    public static float P = 0.0f;
    public static float Q = 0.0f;
    public static float R = 0.0f;
    public static float S = 0.0f;
    public static float T = 0.0f;
    public static float U = 0.0f;

    public static Bitmap a() {
        if (X == null || X.get() == null || ((Bitmap) X.get()).isRecycled()) {
            X = new SoftReference(Bitmap.createBitmap(A, B, Bitmap.Config.ARGB_8888));
        }
        return (Bitmap) X.get();
    }

    public static Bitmap a(Bitmap bitmap) {
        if (bitmap.getWidth() != E || bitmap.getHeight() != E) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, E, E, true);
            if (bitmap == createScaledBitmap) {
                return createScaledBitmap;
            }
            bitmap.recycle();
            return createScaledBitmap;
        }
        return bitmap;
    }

    public static void a(com.tsf.shell.workspace3D.k.j jVar, int i2, Runnable runnable) {
        switch (i2) {
            case 0:
                bf.s().c(jVar);
                jVar.e(false);
                jVar.a((short) 180, (short) 255, (short) 50, (short) 0);
                aq aqVar = new aq(runnable, jVar);
                Number3d A2 = bf.s().A();
                aqVar.j(0.0f);
                aqVar.k(0.0f);
                aqVar.l(0.0f);
                aqVar.f(A2.x);
                aqVar.h(A2.y);
                com.censivn.C3DEngine.g.s.a(jVar);
                com.censivn.C3DEngine.g.s.a(jVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, aqVar);
                jVar.e_();
                break;
            case 1:
                jVar.e(false);
                ar arVar = new ar(runnable, jVar);
                arVar.j(0.0f);
                arVar.k(0.0f);
                arVar.l(0.0f);
                com.censivn.C3DEngine.g.s.a(jVar);
                com.censivn.C3DEngine.g.s.a(jVar, 200, arVar);
                jVar.e_();
                break;
        }
    }

    public static void a(com.tsf.shell.workspace3D.k.j jVar, int i2, Runnable runnable, Runnable runnable2) {
        if (jVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            if (((com.tsf.shell.workspace3D.k.c.b.ac) jVar).aH().q()) {
                a(jVar, i2, runnable2);
            } else {
                com.tsf.shell.au.a(R.string.notic_delete_folder, R.string.public_action_ok, new as(jVar, i2, runnable2), new at(runnable));
            }
        }
    }

    public static com.censivn.C3DEngine.e.b b() {
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(128.0f * com.censivn.C3DEngine.a.b, 30.0f * com.censivn.C3DEngine.a.b, (byte) 0);
        bVar.F().set(0, 1.0f, 1.0f);
        bVar.F().set(1, 0.0f, 1.0f);
        bVar.F().set(2, 1.0f, 0.765625f);
        bVar.F().set(3, 0.0f, 0.765625f);
        return bVar;
    }

    public static com.censivn.C3DEngine.e.a.a c() {
        return a(f(), a);
    }

    public static void d() {
        V = com.censivn.C3DEngine.a.b;
        if (com.censivn.C3DEngine.a.b < 1.0f) {
            W = 1.0f;
        } else {
            W = com.censivn.C3DEngine.a.b;
        }
        int i2 = (int) (W * 128.0f);
        B = i2;
        A = i2;
        F = 8.0f * W;
        Y = (int) (W * 128.0f);
        Z = (int) (W * 96.0f);
        E = (int) (W * 96.0f);
        C = (int) (W * 128.0f);
        D = ((B - Z) - 2) - 2;
        int i3 = (int) (V * 128.0f);
        H = i3;
        G = i3;
        aa = (int) (V * 128.0f);
        ab = (int) (V * 96.0f);
        I = (int) (V * 96.0f);
        J = (int) (V * 128.0f);
        K = ((H - ab) - 2) - 2;
        L = (int) (23.0f * V);
        M = (int) ((-52.0f) * V);
        R = (-I) / 2.0f;
        S = I / 2.0f;
        T = L - (ab / 2);
        U = L + (ab / 2);
        N = (-aa) / 2.0f;
        O = aa / 2.0f;
        P = M - (K / 2);
        Q = L + (ab / 2);
    }

    public static float a(int i2) {
        return com.censivn.C3DEngine.a.b < 1.0f ? i2 : i2 * com.censivn.C3DEngine.a.b;
    }

    private static com.censivn.C3DEngine.e.a.a f() {
        return new com.censivn.C3DEngine.e.a.a(2, 32, A, B);
    }

    public static com.censivn.C3DEngine.e.a.a e() {
        return a(f(), 1.0f);
    }

    private static com.censivn.C3DEngine.e.a.a a(com.censivn.C3DEngine.e.a.a aVar, float f2) {
        com.censivn.C3DEngine.e.a.c a2 = aVar.a(0);
        a2.a(0, 0, 0, 0, aa, ab + 2);
        a2.m.y = L;
        a2.x = true;
        a2.a(0.0f, Y, Z + 2);
        a2.o.setAll(f2, f2, f2);
        a2.e();
        com.censivn.C3DEngine.e.a.c a3 = aVar.a(1);
        a3.a(0, 0, 0, 0, J, K + 2);
        a3.m.y = M;
        a3.x = true;
        a3.a(Z + 2, A, B);
        a3.e();
        if (k == 0.0f) {
            c = aVar.a(0).a;
            d = aVar.a(0).b;
            e = aVar.a(0).c;
            f = aVar.a(0).d;
            g = aVar.a(1).a;
            h = aVar.a(1).b;
            i = aVar.a(1).c;
            j = aVar.a(1).d;
            k = aVar.E().pxX(c);
            l = aVar.E().pxX(d);
            m = aVar.E().pxX(e);
            n = aVar.E().pxX(f);
            o = aVar.E().pxX(g);
            p = aVar.E().pxX(h);
            q = aVar.E().pxX(i);
            r = aVar.E().pxX(j);
            s = aVar.E().pxY(c);
            t = aVar.E().pxY(d);
            u = aVar.E().pxY(e);
            v = aVar.E().pxY(f);
            w = aVar.E().pxY(g);
            x = aVar.E().pxY(h);
            y = aVar.E().pxY(i);
            z = aVar.E().pxY(j);
        }
        return aVar;
    }
}
