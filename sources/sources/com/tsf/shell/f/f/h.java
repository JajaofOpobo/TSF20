package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.e;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    public static com.censivn.C3DEngine.b.f.b.a a;
    private static e.a g;
    private static TextureElement d = null;
    private static boolean e = true;
    private static boolean f = false;
    public static int b = (int) com.censivn.C3DEngine.b.b.a.a(182.0f);
    public static int c = (int) com.censivn.C3DEngine.b.b.a.a(30.0f);

    public static void a() {
        e = com.tsf.shell.manager.b.e.y();
        TextureElement textureElementB = b();
        a = new com.censivn.C3DEngine.b.f.b.a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 1.0f, new com.censivn.C3DEngine.b.f.b.b(c, b - c, c, b - c, textureElementB.width, textureElementB.height));
        a.b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        a.c(com.censivn.C3DEngine.b.b.a.B);
        a.textures().addElement(textureElementB);
        g = new a();
        com.tsf.shell.manager.a.b.a(g);
    }

    public static void a(int i, int i2, int i3, int i4) {
        a.b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        a.c(com.censivn.C3DEngine.b.b.a.B);
    }

    public static TextureElement b() {
        if (d == null) {
            d = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_FRAME_BACKGROUND, b, b);
        }
        return d;
    }

    public static void a(boolean z) {
        f = z;
    }

    public static boolean c() {
        return e && !f;
    }

    public static void b(boolean z) {
        e = z;
    }

    public static void d() {
        com.tsf.shell.manager.b.e.f(e);
    }

    static class a implements e.a {
        a() {
        }

        @Override // com.censivn.C3DEngine.b.c.e.a
        public void a(int i, int i2, int i3, int i4) {
            h.a(i, i2, i3, i4);
        }
    }
}
