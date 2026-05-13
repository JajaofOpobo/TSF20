package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.p184a.C3562b;
import com.tsf.shell.manager.p183o.p184a.C3563c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.a.c.j */
/* loaded from: classes.dex */
public class C2798j {

    /* renamed from: a */
    private static C3560a f9143a;

    /* renamed from: a */
    public static C0962a m4637a() {
        if (f9143a == null) {
            f9143a = new C3560a(1.0f, 1.0f, 120, 120, 250, 42, 20);
            C3563c.C3564a c3564a = new C3563c.C3564a();
            c3564a.f11838g = 32;
            f9143a.f11771ab = new C3562b(0, c3564a);
        }
        return new C3224h(f9143a).f10495k;
    }

    /* renamed from: a */
    public static void m4636a(TextureElement textureElement, int i, String str) {
        if (textureElement.f2529id == 0) {
            Bitmap m607a = i == 0 ? null : C4189x.m607a(i, f9143a.f11750H, f9143a.f11751I);
            Bitmap m2011a = f9143a.m2011a(str);
            Bitmap m2022a = f9143a.m2022a();
            Canvas canvas = new Canvas(m2022a);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            f9143a.m2017a(canvas, m607a, m2011a, true);
            AbstractC3208b.m3171a(m2022a);
            C0853a.m10853g().m10540a(textureElement, m2022a);
        }
    }
}
