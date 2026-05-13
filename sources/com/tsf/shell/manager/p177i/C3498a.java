package com.tsf.shell.manager.p177i;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.C2931f;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.i.a */
/* loaded from: classes.dex */
public class C3498a {

    /* renamed from: a */
    public static final int f11563a = C0892a.m10735b(122.0f);

    /* renamed from: b */
    public static final int f11564b = C0892a.m10735b(34.0f);

    /* renamed from: c */
    private static TextureElement f11565c = new TextureElement(0, false);

    /* renamed from: d */
    private static C0981k f11566d = m2189b();

    /* renamed from: a */
    public static Bitmap m2192a() {
        return C4189x.m607a(C1306b.C1310d.prime_effect, f11563a, f11564b);
    }

    /* renamed from: a */
    public static void m2191a(C2931f c2931f, float f) {
        if (c2931f.m4269f()) {
            f11566d.position().f2527y = f;
            f11566d.dispatchDraw();
        }
    }

    /* renamed from: a */
    public static void m2190a(boolean z, float f) {
        if (z) {
            f11566d.position().f2527y = f;
            f11566d.dispatchDraw();
        }
    }

    /* renamed from: b */
    public static C0981k m2189b() {
        C0981k c0981k = new C0981k(f11563a, f11564b, false) { // from class: com.tsf.shell.manager.i.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C3498a.f11565c.f2529id == 0) {
                    C0853a.m10853g().m10540a(C3498a.f11565c, C3498a.m2192a());
                }
            }
        };
        c0981k.textures().addElement(f11565c);
        return c0981k;
    }
}
