package com.tsf.shell.p096f.p107d.p116e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.e.a */
/* loaded from: classes.dex */
public class C2437a extends C3020h {

    /* renamed from: a */
    public static ArrayList<Number3d> f8032a;

    /* renamed from: b */
    public static float f8033b;

    /* renamed from: c */
    public static float f8034c;

    /* renamed from: j */
    private static TextureElement f8035j;

    /* renamed from: d */
    private boolean f8036d;

    /* renamed from: f */
    private InterfaceC2441a f8037f;

    /* renamed from: g */
    private Runnable f8038g;

    /* renamed from: h */
    private Runnable f8039h;

    /* renamed from: i */
    private Runnable f8040i;

    /* renamed from: com.tsf.shell.f.d.e.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2441a {
        void a(C0962a c0962a, Runnable runnable);

        void b(C0962a c0962a, Runnable runnable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437a(InterfaceC2441a interfaceC2441a) {
        super(new C0962a(16, 30, 30));
        int i = 0;
        this.f8036d = false;
        this.f8037f = interfaceC2441a;
        useVBO(false);
        this.f9833e.useVBO(false);
        if (f8032a == null) {
            f8032a = new ArrayList<>();
            float f = 5.0f * C0892a.f2567c;
            float f2 = ((-((C0892a.f2567c * 120.0f) + (3.0f * f))) / 2.0f) + ((C0892a.f2567c * 30.0f) / 2.0f);
            float f3 = (((C0892a.f2567c * 120.0f) + (3.0f * f)) / 2.0f) - ((C0892a.f2567c * 30.0f) / 2.0f);
            f8033b = (C0892a.f2567c * 30.0f) + f3;
            f8034c = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    Number3d number3d = new Number3d();
                    number3d.f2526x = ((30.0f + f) * C0892a.f2567c * i2) + f2;
                    number3d.f2527y = f3 - (((30.0f + f) * C0892a.f2567c) * i3);
                    f8032a.add(number3d);
                }
            }
        }
        C0962a c0962a = (C0962a) this.f9833e;
        while (true) {
            int i4 = i;
            if (i4 < f8032a.size()) {
                C0964b m10456a = c0962a.m10456a(i4);
                m10456a.m10412e(1, 1);
                Number3d number3d2 = f8032a.get(i4);
                m10456a.f2853m.f2526x = number3d2.f2526x;
                m10456a.f2853m.f2527y = number3d2.f2527y;
                m10456a.m10408h();
                i = i4 + 1;
            } else {
                this.f8038g = new Runnable() { // from class: com.tsf.shell.f.d.e.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0853a.m10865a().m10584b(C2437a.this.f8039h, 300L);
                    }
                };
                this.f8039h = new Runnable() { // from class: com.tsf.shell.f.d.e.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2437a.this.f8036d = false;
                    }
                };
                this.f8040i = new Runnable() { // from class: com.tsf.shell.f.d.e.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C2437a.this.f8037f.b((C0962a) C2437a.this.f9833e, C2437a.this.f8038g);
                    }
                };
                calAABB();
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (!this.f8036d) {
            this.f8036d = true;
            this.f8037f.a((C0962a) this.f9833e, this.f8040i);
        }
    }

    /* renamed from: a */
    public static TextureElement m5555a() {
        if (f8035j == null) {
            f8035j = C4189x.m593b(C1306b.C1310d.effect_icon_scene);
        }
        return f8035j;
    }
}
