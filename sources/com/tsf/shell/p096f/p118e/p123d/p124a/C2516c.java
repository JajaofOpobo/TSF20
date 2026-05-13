package com.tsf.shell.p096f.p118e.p123d.p124a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.d.a.c */
/* loaded from: classes.dex */
public class C2516c extends C0980j {

    /* renamed from: b */
    private C0980j f8352b;

    /* renamed from: c */
    private ArrayList<C2524c> f8353c;

    /* renamed from: d */
    private C2516c f8354d;

    /* renamed from: e */
    private C2523b f8355e;

    /* renamed from: f */
    private C2525d f8356f;

    /* renamed from: h */
    private int f8358h;

    /* renamed from: a */
    private float f8351a = 0.0f;

    /* renamed from: g */
    private final int f8357g = 50;

    /* renamed from: com.tsf.shell.f.e.d.a.c$b */
    /* loaded from: classes.dex */
    public static class C2523b {

        /* renamed from: a */
        public float f8372a;

        /* renamed from: b */
        public float f8373b;

        /* renamed from: c */
        public float f8374c;

        /* renamed from: d */
        public float f8375d;

        /* renamed from: e */
        public int f8376e;

        /* renamed from: f */
        public float f8377f;

        /* renamed from: g */
        public int f8378g = 1;
    }

    /* renamed from: com.tsf.shell.f.e.d.a.c$c */
    /* loaded from: classes.dex */
    public static class C2524c {

        /* renamed from: a */
        public int f8379a;

        /* renamed from: b */
        public int f8380b;

        /* renamed from: c */
        public C2522a f8381c;

        /* renamed from: d */
        public ArrayList<C2524c> f8382d;

        /* renamed from: e */
        public C2516c f8383e;

        /* renamed from: f */
        public float f8384f;

        /* renamed from: g */
        public float f8385g;

        /* renamed from: h */
        public int f8386h;

        public C2524c(int i, int i2) {
            this.f8379a = i;
            this.f8380b = i2;
        }

        /* renamed from: a */
        public void mo3280a() {
        }

        /* renamed from: b */
        public boolean mo3281b() {
            return true;
        }

        /* renamed from: a */
        public void m5357a(ArrayList<C2524c> arrayList) {
            this.f8382d = arrayList;
        }

        /* renamed from: c */
        public boolean m5356c() {
            return this.f8382d != null && this.f8382d.size() > 0;
        }

        /* renamed from: a */
        public void m5358a(C2525d c2525d) {
            if (this.f8383e == null && m5356c()) {
                this.f8383e = new C2516c(c2525d);
                C2523b c2523b = new C2523b();
                c2523b.f8372a = C0892a.m10742a(-130.0f);
                c2523b.f8373b = C0892a.m10742a(128.0f);
                c2523b.f8374c = C0892a.m10742a(65.0f);
                c2523b.f8375d = C0892a.m10742a(120.0f);
                c2523b.f8376e = 38;
                c2523b.f8377f = C0892a.m10742a(54.0f);
                this.f8383e.m5366a(this.f8382d, c2523b);
            }
        }
    }

    public C2516c(C2525d c2525d) {
        this.f8356f = c2525d;
    }

    /* renamed from: a */
    public void m5366a(ArrayList<C2524c> arrayList, C2523b c2523b) {
        this.f8355e = c2523b;
        this.f8353c = arrayList;
        this.f8352b = new C0980j();
        int i = 0;
        Iterator<C2524c> it = this.f8353c.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                final C2524c next = it.next();
                final C2522a c2522a = new C2522a(next.f8379a, next.f8380b, c2523b);
                C0937a c0937a = new C0937a(c2522a) { // from class: com.tsf.shell.f.e.d.a.c.1
                    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                    /* renamed from: a */
                    public void mo502a(MotionEvent motionEvent) {
                        if (next.m5356c()) {
                            next.m5358a(C2516c.this.f8356f);
                            next.f8383e.removeFromParent();
                            next.f8383e.m5373a();
                            c2522a.addChild(next.f8383e);
                            C2516c.this.f8354d = next.f8383e;
                            C2516c.this.m5371a(c2522a);
                            C2516c.this.m5372a(next.f8386h, C0892a.m10742a(500.0f));
                        } else {
                            C2516c.this.f8356f.m5349d();
                        }
                        next.mo3280a();
                    }
                };
                next.f8381c = c2522a;
                next.f8386h = i2;
                c2522a.setMouseEventListener(c0937a);
                i = i2 + 1;
            } else {
                addChild(this.f8352b);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5372a(int i, float f) {
        int size = this.f8353c.size();
        int i2 = i + 1;
        this.f8358h = i2;
        if (i2 < size) {
            int i3 = 0;
            for (int i4 = size - 1; i4 >= i2; i4--) {
                C2524c c2524c = this.f8353c.get(i4);
                C2522a c2522a = c2524c.f8381c;
                C1017d c1017d = new C1017d();
                c1017d.mo10301f(c2524c.f8385g);
                c1017d.mo10298h(c2524c.f8384f - f);
                c1017d.m10314a(50);
                c1017d.m10313a(C0986a.f2946a);
                C1014c.m10326a(c2522a);
                C1014c.m10325a(c2522a, VEasing.Linear.easeNone, c1017d);
                i3++;
            }
        }
    }

    /* renamed from: d */
    private void m5363d() {
        int size = this.f8353c.size();
        int i = this.f8358h;
        if (i < size) {
            int i2 = 0;
            for (int i3 = i; i3 < size; i3++) {
                C2524c c2524c = this.f8353c.get(i3);
                C2522a c2522a = c2524c.f8381c;
                C1017d c1017d = new C1017d();
                c1017d.m10314a(255);
                c1017d.m10309b(i2 * 80);
                c1017d.mo10301f(c2524c.f8385g);
                c1017d.mo10298h(c2524c.f8384f);
                c1017d.m10313a(C0986a.f2946a);
                C1014c.m10326a(c2522a);
                C1014c.m10325a(c2522a, VEasing.Linear.easeNone, c1017d);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void m5373a() {
        Iterator<C2524c> it = this.f8353c.iterator();
        while (it.hasNext()) {
            C2524c next = it.next();
            next.f8381c.removeFromParent();
            if (next.mo3281b()) {
                this.f8352b.addChild(next.f8381c);
            }
        }
        this.f8351a = m5364c();
        m5361f();
        this.f8352b.position().f2526x = 0.0f;
        this.f8352b.position().f2527y = 0.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f8352b.numChildren()) {
                C2522a c2522a = (C2522a) this.f8352b.getChildAt(i2);
                C1017d c1017d = new C1017d();
                c1017d.mo10301f(0.0f);
                c1017d.m10314a(255);
                c1017d.m10309b(i2 * 80);
                c1017d.m10313a(C0986a.f2946a);
                C1014c.m10326a(c2522a);
                C1014c.m10325a(c2522a, VEasing.Linear.easeNone, c1017d);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean m5365b() {
        if (this.f8354d != null) {
            this.f8354d.m5365b();
            this.f8354d = null;
            m5362e();
            m5363d();
            return false;
        }
        for (int i = 0; i < this.f8352b.numChildren(); i++) {
            final C2522a c2522a = (C2522a) this.f8352b.getChildAt(i);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.c.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c2522a.m5359b();
                }
            };
            c1017d.mo10301f(-this.f8351a);
            c1017d.m10314a(0);
            if (i == this.f8352b.numChildren() - 1) {
                c1017d.m10311a(new Runnable() { // from class: com.tsf.shell.f.e.d.a.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C2516c.this.removeFromParent();
                    }
                });
            }
            C1014c.m10326a(c2522a);
            C1014c.m10325a(c2522a, 500, c1017d);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5371a(C2522a c2522a) {
        for (int i = 0; i < this.f8352b.numChildren(); i++) {
            C2522a c2522a2 = (C2522a) this.f8352b.getChildAt(i);
            if (c2522a2 != c2522a) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.c.4
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1017d.m10314a(50);
                C1014c.m10326a(c2522a2);
                C1014c.m10325a(c2522a2, 500, c1017d);
                c2522a2.mouseEnabled(false);
            } else {
                c2522a2.mouseSkip(true);
            }
        }
    }

    /* renamed from: e */
    private void m5362e() {
        for (int i = 0; i < this.f8352b.numChildren(); i++) {
            C2522a c2522a = (C2522a) this.f8352b.getChildAt(i);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.c.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                }
            };
            c1017d.m10314a(255);
            C1014c.m10326a(c2522a);
            C1014c.m10325a(c2522a, 500, c1017d);
            c2522a.mouseSkip(false);
            c2522a.mouseEnabled(true);
        }
    }

    /* renamed from: c */
    public float m5364c() {
        if (this.f8351a == 0.0f) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f8352b.numChildren()) {
                    break;
                }
                float m5360a = ((C2522a) this.f8352b.getChildAt(i2)).m5360a();
                if (m5360a > this.f8351a) {
                    this.f8351a = m5360a;
                }
                i = i2 + 1;
            }
        }
        return this.f8351a;
    }

    /* renamed from: f */
    private void m5361f() {
        float f = this.f8355e.f8372a;
        float f2 = this.f8355e.f8373b;
        int size = this.f8353c.size();
        float f3 = f;
        for (int i = 0; i < size; i++) {
            C2524c c2524c = this.f8353c.get(i);
            C2522a c2522a = c2524c.f8381c;
            c2522a.position().f2527y = f3;
            c2524c.f8384f = f3;
            c2524c.f8385g = 0.0f;
            c2522a.position().f2526x = -this.f8351a;
            c2522a.alpha(0.0f);
            f3 -= f2;
        }
    }

    /* renamed from: com.tsf.shell.f.e.d.a.c$a */
    /* loaded from: classes.dex */
    public static class C2522a extends C0980j {

        /* renamed from: a */
        int f8367a;

        /* renamed from: b */
        private C0984m f8368b;

        /* renamed from: c */
        private C0981k f8369c;

        /* renamed from: d */
        private TextureElement f8370d = new TextureElement(0, false);

        /* renamed from: e */
        private float f8371e;

        public C2522a(int i, int i2, C2523b c2523b) {
            this.f8367a = i2;
            this.f8369c = new C0981k(c2523b.f8374c, c2523b.f8374c, false);
            this.f8369c.position().f2526x = (this.f8369c.mo10366b() / 2.0f) + c2523b.f8375d;
            this.f8369c.textures().addElement(this.f8370d);
            addChild(this.f8369c);
            this.f8368b = new C0984m();
            this.f8368b.m10349c(i);
            this.f8368b.m10347d(c2523b.f8376e);
            this.f8368b.m10352b(1);
            this.f8368b.position().f2526x = this.f8369c.position().f2526x + c2523b.f8377f;
            this.f8368b.m10353b();
            addChild(this.f8368b);
            this.f8371e = this.f8368b.position().f2526x + this.f8368b.maxX();
            if (c2523b.f8378g == 1) {
                setAABBPX(0.0f, (-c2523b.f8373b) / 2.0f, 0.0f, this.f8371e, c2523b.f8373b / 2.0f, 0.0f);
            } else {
                this.f8369c.position().f2526x -= this.f8371e / 2.0f;
                this.f8368b.position().f2526x -= this.f8371e / 2.0f;
                setAABBPX((-this.f8371e) / 2.0f, (-c2523b.f8373b) / 2.0f, 0.0f, this.f8371e / 2.0f, c2523b.f8373b / 2.0f, 0.0f);
            }
            C3567c.m1967a(this, C3567c.f11849h);
        }

        /* renamed from: a */
        public float m5360a() {
            return this.f8371e;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f8370d.f2529id == 0) {
                Bitmap m609a = C4189x.m609a(this.f8367a);
                C0853a.m10853g().m10540a(this.f8370d, m609a);
                m609a.recycle();
            }
        }

        /* renamed from: b */
        public void m5359b() {
            if (this.f8370d.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f8370d);
            }
            this.f8368b.m10358a();
        }
    }
}
