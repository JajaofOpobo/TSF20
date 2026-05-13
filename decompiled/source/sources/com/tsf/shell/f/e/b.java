package com.tsf.shell.f.e;

import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
/* loaded from: classes.dex */
public class b {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static DynamicTextureElement e;
    public static DynamicTextureElement f;
    public static DynamicTextureElement g;
    public static DynamicTextureElement h;

    public static void a() {
        e = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_MATCH_BOX, 64, 64);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.a = b.e.id;
            }
        };
        e.setReloadThemeRunnable(runnable);
        runnable.run();
        f = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_UNMATCH_BOX, 64, 64);
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.b = b.f.id;
            }
        };
        f.setReloadThemeRunnable(runnable2);
        runnable2.run();
        g = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_TSF_RESIZE_BOX, 64, 64);
        Runnable runnable3 = new Runnable() { // from class: com.tsf.shell.f.e.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.c = b.g.id;
            }
        };
        g.setReloadThemeRunnable(runnable3);
        runnable3.run();
        h = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_BORDER_BOX, 64, 64);
        Runnable runnable4 = new Runnable() { // from class: com.tsf.shell.f.e.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.d = b.h.id;
            }
        };
        h.setReloadThemeRunnable(runnable4);
        runnable4.run();
    }

    public static com.censivn.C3DEngine.b.f.b.a a(int i, int i2) {
        return new com.censivn.C3DEngine.b.f.b.a(i, i2, new com.censivn.C3DEngine.b.f.b.b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
    }
}
