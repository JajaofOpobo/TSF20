package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageConfig {
    public static com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable a;
    private static TransitionConfig.a g;
    private static TextureElement d = null;
    private static boolean e = true;
    private static boolean f = false;
    public static int b = (int) com.censivn.C3DEngine.b.b.ScreenConstants.a(182.0f);
    public static int c = (int) com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);

    public static void a() {
        e = com.tsf.shell.manager.b.ConfigManager.y();
        TextureElement textureElementB = b();
        a = new com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G, 1.0f, new com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds(c, b - c, c, b - c, textureElementB.width, textureElementB.height));
        a.b(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
        a.c(com.censivn.C3DEngine.b.b.ScreenConstants.B);
        PageShaderNode.textures().addElement(textureElementB);
        g = new PageShaderNode();
        com.tsf.shell.manager.app.ObserverManager.a(g);
    }

    public static void a(int i, int i2, int i3, int i4) {
        a.b(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
        a.c(com.censivn.C3DEngine.b.b.ScreenConstants.B);
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
        com.tsf.shell.manager.b.ConfigManager.f(TransitionConfig);
    }

    static class A implements TransitionConfig.a {
        A() {
        }

        @Override // com.censivn.C3DEngine.b.c.WindowManager.a
        public void a(int i, int i2, int i3, int i4) {
            h.a(i, i2, i3, i4);
        }
    }
}
