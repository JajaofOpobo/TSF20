package com.tsf.shell.f.d.e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.g.a.h;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends h {
    public static ArrayList<Number3d> a;
    public static float b;
    public static float c;
    private static TextureElement j;
    private boolean d;
    private InterfaceC0090a f;
    private Runnable g;
    private Runnable h;
    private Runnable i;

    /* renamed from: com.tsf.shell.f.d.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0090a {
        void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable);

        void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0090a interfaceC0090a) {
        super(new com.censivn.C3DEngine.b.f.a.a(16, 30, 30));
        int i = 0;
        this.d = false;
        this.f = interfaceC0090a;
        useVBO(false);
        this.e.useVBO(false);
        if (a == null) {
            a = new ArrayList<>();
            float f = 5.0f * com.censivn.C3DEngine.b.b.a.c;
            float f2 = ((-((com.censivn.C3DEngine.b.b.a.c * 120.0f) + (3.0f * f))) / 2.0f) + ((com.censivn.C3DEngine.b.b.a.c * 30.0f) / 2.0f);
            float f3 = (((com.censivn.C3DEngine.b.b.a.c * 120.0f) + (3.0f * f)) / 2.0f) - ((com.censivn.C3DEngine.b.b.a.c * 30.0f) / 2.0f);
            b = (com.censivn.C3DEngine.b.b.a.c * 30.0f) + f3;
            c = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    Number3d number3d = new Number3d();
                    number3d.x = ((30.0f + f) * com.censivn.C3DEngine.b.b.a.c * i2) + f2;
                    number3d.y = f3 - (((30.0f + f) * com.censivn.C3DEngine.b.b.a.c) * i3);
                    a.add(number3d);
                }
            }
        }
        com.censivn.C3DEngine.b.f.a.a aVar = (com.censivn.C3DEngine.b.f.a.a) this.e;
        while (true) {
            int i4 = i;
            if (i4 < a.size()) {
                com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i4);
                a2.e(1, 1);
                Number3d number3d2 = a.get(i4);
                a2.m.x = number3d2.x;
                a2.m.y = number3d2.y;
                a2.h();
                i = i4 + 1;
            } else {
                this.g = new Runnable() { // from class: com.tsf.shell.f.d.e.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.a.a().b(a.this.h, 300L);
                    }
                };
                this.h = new Runnable() { // from class: com.tsf.shell.f.d.e.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.d = false;
                    }
                };
                this.i = new Runnable() { // from class: com.tsf.shell.f.d.e.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f.b((com.censivn.C3DEngine.b.f.a.a) a.this.e, a.this.g);
                    }
                };
                calAABB();
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (!this.d) {
            this.d = true;
            this.f.a((com.censivn.C3DEngine.b.f.a.a) this.e, this.i);
        }
    }

    public static TextureElement a() {
        if (j == null) {
            j = x.b(b.d.effect_icon_scene);
        }
        return j;
    }
}
