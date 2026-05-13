package com.tsf.shell.manager.i;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.f.f.f;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a {
    public static final int a = com.censivn.C3DEngine.b.b.a.b(122.0f);
    public static final int b = com.censivn.C3DEngine.b.b.a.b(34.0f);
    private static TextureElement c = new TextureElement(0, false);
    private static k d = b();

    public static Bitmap a() {
        return x.a(b.d.prime_effect, a, b);
    }

    public static void a(f fVar, float f) {
        if (fVar.f()) {
            d.position().y = f;
            d.dispatchDraw();
        }
    }

    public static void a(boolean z, float f) {
        if (z) {
            d.position().y = f;
            d.dispatchDraw();
        }
    }

    public static k b() {
        k kVar = new k(a, b, false) { // from class: com.tsf.shell.manager.i.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (a.c.id == 0) {
                    com.censivn.C3DEngine.a.g().a(a.c, a.a());
                }
            }
        };
        kVar.textures().addElement(c);
        return kVar;
    }
}
