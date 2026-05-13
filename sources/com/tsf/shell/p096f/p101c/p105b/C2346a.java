package com.tsf.shell.p096f.p101c.p105b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.tsf.shell.C3345g;
import com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.c.b.a */
/* loaded from: classes.dex */
public class C2346a extends C2357d implements C3105a.InterfaceC3106a {

    /* renamed from: a */
    private C2359e f7671a;

    /* renamed from: e */
    private ArrayList<C2355b> f7675e;

    /* renamed from: f */
    private ArrayList<C2355b> f7676f;

    /* renamed from: j */
    private C3145b f7680j;

    /* renamed from: l */
    private Runnable f7682l;

    /* renamed from: n */
    private int f7684n;

    /* renamed from: g */
    private boolean f7677g = true;

    /* renamed from: h */
    private Number3d f7678h = new Number3d();

    /* renamed from: i */
    private Number3d f7679i = new Number3d();

    /* renamed from: k */
    private boolean f7681k = false;

    /* renamed from: m */
    private int f7683m = -1;

    /* renamed from: c */
    private C2346a f7673c = this;

    /* renamed from: b */
    private C3105a f7672b = new C3105a(this, this) { // from class: com.tsf.shell.f.c.b.a.1
        @Override // com.tsf.shell.p096f.p153i.C3105a
        /* renamed from: a */
        public void mo2071a(C3112b c3112b) {
            c3112b.mo3504f(C2346a.this.f7673c);
        }
    };

    /* renamed from: d */
    private C0975i f7674d = new C0981k(128.0f, 128.0f) { // from class: com.tsf.shell.f.c.b.a.2
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void visible(Boolean bool) {
            super.visible(false);
        }
    };

    public C2346a(C2359e c2359e, float f, float f2, int i) {
        this.f7684n = 0;
        this.f7671a = c2359e;
        this.f7684n = i;
        this.f7674d.visible(false);
        this.f7675e = new ArrayList<>();
        this.f7676f = new ArrayList<>();
    }

    /* renamed from: c */
    public int m5768c() {
        return this.f7684n;
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return children();
    }

    /* renamed from: e */
    public void mo5699e() {
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo3520a() {
        return this.f7671a.m5709j();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        this.f7675e.add(m5762j());
        super.addChild(c0975i);
        mo5699e();
        m5766g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        this.f7675e.add(m5762j());
        super.addChildAt(c0975i, i);
        mo5699e();
        m5766g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        mo5699e();
        if (removeChild) {
            m5774a(this.f7675e.remove(0));
            m5766g();
            m5764i();
            if (c0975i instanceof C3112b) {
                ((C3112b) c0975i).f10106c = false;
                ((C3112b) c0975i).m3540B();
            }
            if (c0975i instanceof AbstractC3208b) {
                ((AbstractC3208b) c0975i).m3153aM();
            } else if (c0975i instanceof C3145b) {
                ((C3145b) c0975i).m3370aM();
            }
        }
        return removeChild;
    }

    /* renamed from: j */
    private C2355b m5762j() {
        if (this.f7676f.isEmpty()) {
            return new C2355b();
        }
        C2355b remove = this.f7676f.remove(0);
        remove.m5750a();
        return remove;
    }

    /* renamed from: a */
    private void m5774a(C2355b c2355b) {
        this.f7676f.add(c2355b);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (!this.f7677g) {
            this.f7677g = true;
            for (int i = 0; i < children().size(); i++) {
                C0975i c0975i = children().get(i);
                C2355b c2355b = this.f7675e.get(i);
                if (!c2355b.f7725j) {
                    float f = c0975i instanceof C3145b ? c2355b.f7718c : c2355b.f7716a;
                    float f2 = c0975i instanceof C3145b ? c2355b.f7719d : c2355b.f7717b;
                    c0975i.position().f2526x += (f - c0975i.position().f2526x) * 0.15f;
                    c0975i.position().f2527y += (f2 - c0975i.position().f2527y) * 0.15f;
                    c0975i.rotation().f2528z += (c2355b.f7720e - c0975i.rotation().f2528z) * 0.15f;
                    Number3d scale = c0975i.scale();
                    Number3d scale2 = c0975i.scale();
                    float f3 = scale2.f2527y + ((c2355b.f7721f - c0975i.scale().f2526x) * 0.15f);
                    scale2.f2527y = f3;
                    scale.f2526x = f3;
                    float alpha = c0975i.alpha();
                    c0975i.alpha(alpha + ((c2355b.f7726k - alpha) * 0.15f));
                    if (Math.abs(c0975i.alpha() - c2355b.f7726k) < 0.2f && Math.abs(c0975i.position().f2526x - f) < 0.2f && Math.abs(c0975i.position().f2527y - f2) < 0.2f && Math.abs(c0975i.scale().f2526x - c2355b.f7721f) < 0.01f && Math.abs(c0975i.rotation().f2528z - c2355b.f7720e) < 0.2f) {
                        c0975i.position().f2526x = f;
                        c0975i.position().f2527y = f2;
                        c0975i.rotation().f2528z = c2355b.f7720e;
                        Number3d scale3 = c0975i.scale();
                        Number3d scale4 = c0975i.scale();
                        float f4 = c2355b.f7721f;
                        scale4.f2527y = f4;
                        scale3.f2526x = f4;
                        c2355b.f7725j = true;
                        c0975i.alpha(c2355b.f7726k);
                    }
                    if (c0975i.alpha() == 0.0f) {
                        c0975i.visible(false);
                    } else {
                        c0975i.visible(true);
                    }
                }
                this.f7677g = c2355b.f7725j && this.f7677g;
            }
            if (this.f7677g) {
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
        C3112b c3112b = (C3112b) interfaceC2557f;
        m5773a(c3112b);
        this.f7674d.setAABBPX(c3112b.minX(), c3112b.minY(), c3112b.minZ(), c3112b.maxX(), c3112b.maxY(), c3112b.maxZ());
    }

    /* renamed from: a */
    public boolean m5780a(int i) {
        int mo5760a = this.f7671a.m5711h().mo5760a();
        int numChildren = numChildren();
        if (children().contains(this.f7674d)) {
            numChildren--;
        }
        return numChildren + i <= mo5760a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2061a(com.tsf.shell.p096f.p118e.InterfaceC2557f r7, float r8, float r9) {
        /*
            r6 = this;
            r1 = 1
            r2 = 0
            r5 = -1
            r0 = r7
            com.censivn.C3DEngine.b.f.i r0 = (com.censivn.C3DEngine.p031b.p038f.C0975i) r0
            com.tsf.shell.f.c.b.a.a$b r3 = r6.m5771b(r0)
            boolean r0 = r7 instanceof com.tsf.shell.p096f.p153i.C3231c
            if (r0 == 0) goto L22
            int r0 = r6.f7683m
            int r4 = r3.f7703a
            if (r0 == r4) goto L18
            int r0 = r6.f7683m
            if (r0 != r5) goto L24
        L18:
            int r0 = r3.f7704b
            com.censivn.C3DEngine.api.element.Number3d r4 = r6.f7678h
            boolean r0 = r6.m5779a(r0, r7, r4)
            if (r0 == 0) goto L24
        L22:
            r1 = r2
        L23:
            return r1
        L24:
            com.tsf.shell.f.i.b.d.b r0 = r6.f7680j
            if (r0 == 0) goto L2b
            r6.m5763i(r7)
        L2b:
            boolean r0 = r7 instanceof com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
            if (r0 == 0) goto L6c
            com.tsf.shell.f.i.b.e.b r7 = (com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b) r7
            boolean r0 = r7.m3064as()
            if (r0 == 0) goto L6c
            int r0 = r7.m3063at()
            int r0 = r0 + r1
        L3c:
            boolean r0 = r6.m5780a(r0)
            if (r0 == 0) goto L23
            int r0 = r6.f7683m
            if (r0 != r5) goto L51
            int r0 = r3.f7703a
            r6.f7683m = r0
            com.censivn.C3DEngine.b.f.i r0 = r6.f7674d
            int r1 = r6.f7683m
            r6.addChildAt(r0, r1)
        L51:
            int r0 = r6.f7683m
            int r1 = r3.f7703a
            if (r0 == r1) goto L6a
            int r0 = r3.f7703a
            r6.f7683m = r0
            com.censivn.C3DEngine.b.f.i r0 = r6.f7674d
            r0.removeFromParent()
            com.censivn.C3DEngine.b.f.i r0 = r6.f7674d
            int r1 = r3.f7703a
            r6.addChildAt(r0, r1)
            r6.m5766g()
        L6a:
            r1 = r2
            goto L23
        L6c:
            r0 = r1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p101c.p105b.C2346a.mo2061a(com.tsf.shell.f.e.f, float, float):boolean");
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: c */
    public void mo3332c(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
        if (this.f7680j != null) {
            m5763i(interfaceC2557f);
        }
        m5769b((C3112b) interfaceC2557f);
        if (this.f7674d.parent() != null) {
            removeChild(this.f7674d);
        }
        this.f7683m = -1;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return interfaceC2557f instanceof C3231c;
    }

    @Override // com.tsf.shell.p096f.p101c.p105b.C2357d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
        boolean z;
        C3112b c3112b = (C3112b) interfaceC2557f;
        if (this.f7680j != null) {
            z = this.f7680j.mo2057b(interfaceC2557f);
            if (z) {
                this.f7680j.mo3139e(interfaceC2557f);
            }
            this.f7680j = null;
            if (z) {
                removeChild(this.f7674d);
            }
        } else {
            z = false;
        }
        if (!z) {
            C1014c.m10326a(c3112b);
            globalToLocal(c3112b.position());
            c3112b.removeFromParent();
            c3112b.clearDefaultColor();
            super.removeChild(this.f7674d);
            if (this.f7683m < 0) {
                this.f7683m = 0;
            } else if (this.f7683m > children().size()) {
                this.f7683m = children().size();
            }
            super.addChildAt(c3112b, this.f7683m);
            m5772a(c3112b, true);
            if (c3112b instanceof C3231c) {
                C3231c c3231c = (C3231c) c3112b;
                if (c3231c.m3064as()) {
                    Iterator<C3231c> it = c3231c.m3061av().iterator();
                    while (it.hasNext()) {
                        m5772a(it.next(), true);
                    }
                    c3231c.m3058ay();
                }
            }
            m5766g();
            m5764i();
        }
        this.f7683m = -1;
    }

    /* renamed from: f */
    public void m5767f() {
        for (int i = 0; i < children().size(); i++) {
            C0975i c0975i = children().get(i);
            C2355b c2355b = this.f7675e.get(i);
            c2355b.f7725j = true;
            c0975i.position().f2526x = c2355b.f7716a;
            c0975i.position().f2527y = c2355b.f7717b;
            c0975i.rotation().f2528z = c2355b.f7720e;
            Number3d scale = c0975i.scale();
            Number3d scale2 = c0975i.scale();
            float f = c2355b.f7721f;
            scale2.f2527y = f;
            scale.f2526x = f;
            c0975i.alpha(c2355b.f7726k);
        }
        this.f7677g = true;
        setAnimationObjectState(false);
    }

    /* renamed from: g */
    public void m5766g() {
        m5765h();
        this.f7677g = false;
        setAnimationObjectState(true);
        invalidate();
    }

    /* renamed from: h */
    public void m5765h() {
        this.f7671a.m5711h().mo5753a(this.f7675e, children().size());
    }

    /* renamed from: a */
    private boolean m5779a(int i, InterfaceC2557f interfaceC2557f, Number3d number3d) {
        return i >= 0 && numChildren() != 0 && i <= numChildren() + (-1) && m5777a(getChildAt(i), interfaceC2557f, number3d.f2526x, number3d.f2527y);
    }

    /* renamed from: a */
    private boolean m5777a(C0975i c0975i, InterfaceC2557f interfaceC2557f, float f, float f2) {
        if (!(interfaceC2557f instanceof C3145b) && (c0975i instanceof C3145b) && c0975i.calTouchCollision(f, f2)) {
            C3145b c3145b = (C3145b) c0975i;
            if (this.f7680j == null) {
                this.f7680j = c3145b;
                m5769b((C3112b) interfaceC2557f);
                this.f7680j.mo2062a(interfaceC2557f);
            }
            this.f7680j.mo3504f(interfaceC2557f);
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m5763i(InterfaceC2557f interfaceC2557f) {
        this.f7680j.mo3140d(interfaceC2557f);
        this.f7680j = null;
        m5773a((C3112b) interfaceC2557f);
    }

    /* renamed from: i */
    public void m5764i() {
        if (!this.f7671a.m5714e()) {
            if (this.f7682l == null) {
                m5761k();
            }
            if (!this.f7681k) {
                this.f7681k = true;
                C0853a.m10865a().m10583c(this.f7682l);
            }
        }
    }

    /* renamed from: k */
    private void m5761k() {
        this.f7682l = new Runnable() { // from class: com.tsf.shell.f.c.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                C0975i next;
                String str;
                C2346a.this.f7681k = false;
                final String str2 = "";
                Iterator<C0975i> it = C2346a.this.children().iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof C3112b) {
                        str = str2 + ((C3112b) next).m3534K().f2532id + ",";
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
                C0853a.m10865a().m10580e(new Runnable() { // from class: com.tsf.shell.f.c.b.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str2);
                        contentResolver.update(ContentUris.withAppendedId(C3345g.C3349d.f11068a, C2346a.this.f7684n + 1), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public void m5772a(C3112b c3112b, boolean z) {
        c3112b.mo3462a(this.f7672b);
        c3112b.f10106c = true;
        if (c3112b instanceof AbstractC3208b) {
            C1014c.m10326a(((AbstractC3208b) c3112b).f10495k);
            ((AbstractC3208b) c3112b).m3154aL();
        } else if (c3112b instanceof C3145b) {
            ((C3145b) c3112b).m3371aL();
        }
        if (!this.f7671a.m5714e() && z) {
            c3112b.m3534K().onUpdateContainer(-3);
        }
    }

    /* renamed from: b */
    private InterfaceC2351a.C2353b m5771b(C0975i c0975i) {
        this.f7678h.reset();
        c0975i.localToGlobal(this.f7678h);
        return m5781a(this.f7678h.f2526x, this.f7678h.f2527y);
    }

    /* renamed from: a */
    private InterfaceC2351a.C2353b m5781a(float f, float f2) {
        this.f7678h.setAll(f, f2, 0.0f);
        this.f7679i.setAllFrom(this.f7678h);
        globalToLocal(this.f7679i);
        this.f7671a.m5711h().mo5757a(this.f7678h);
        if (children().size() == 0) {
            InterfaceC2351a.C2353b.f7702c.f7703a = 0;
            return InterfaceC2351a.C2353b.f7702c;
        }
        return this.f7671a.m5711h().mo5756a(this.f7679i, this.f7675e, this.f7683m);
    }

    /* renamed from: a */
    private void m5773a(C3112b c3112b) {
    }

    /* renamed from: b */
    private void m5769b(C3112b c3112b) {
    }

    /* renamed from: a */
    public C2355b m5778a(C0975i c0975i) {
        int indexOf = children().indexOf(c0975i);
        if (indexOf == -1) {
            return null;
        }
        return this.f7675e.get(indexOf);
    }
}
