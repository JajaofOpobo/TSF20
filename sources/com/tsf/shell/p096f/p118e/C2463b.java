package com.tsf.shell.p096f.p118e;

import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
/* renamed from: com.tsf.shell.f.e.b */
/* loaded from: classes.dex */
public class C2463b {

    /* renamed from: a */
    public static int f8091a;

    /* renamed from: b */
    public static int f8092b;

    /* renamed from: c */
    public static int f8093c;

    /* renamed from: d */
    public static int f8094d;

    /* renamed from: e */
    public static DynamicTextureElement f8095e;

    /* renamed from: f */
    public static DynamicTextureElement f8096f;

    /* renamed from: g */
    public static DynamicTextureElement f8097g;

    /* renamed from: h */
    public static DynamicTextureElement f8098h;

    /* renamed from: a */
    public static void m5513a() {
        f8095e = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_MATCH_BOX, 64, 64);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                C2463b.f8091a = C2463b.f8095e.f2529id;
            }
        };
        f8095e.setReloadThemeRunnable(runnable);
        runnable.run();
        f8096f = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_UNMATCH_BOX, 64, 64);
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.b.2
            @Override // java.lang.Runnable
            public void run() {
                C2463b.f8092b = C2463b.f8096f.f2529id;
            }
        };
        f8096f.setReloadThemeRunnable(runnable2);
        runnable2.run();
        f8097g = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_TSF_RESIZE_BOX, 64, 64);
        Runnable runnable3 = new Runnable() { // from class: com.tsf.shell.f.e.b.3
            @Override // java.lang.Runnable
            public void run() {
                C2463b.f8093c = C2463b.f8097g.f2529id;
            }
        };
        f8097g.setReloadThemeRunnable(runnable3);
        runnable3.run();
        f8098h = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_BORDER_BOX, 64, 64);
        Runnable runnable4 = new Runnable() { // from class: com.tsf.shell.f.e.b.4
            @Override // java.lang.Runnable
            public void run() {
                C2463b.f8094d = C2463b.f8098h.f2529id;
            }
        };
        f8098h.setReloadThemeRunnable(runnable4);
        runnable4.run();
    }

    /* renamed from: a */
    public static C0967a m5512a(int i, int i2) {
        return new C0967a(i, i2, new C0968b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
    }
}
