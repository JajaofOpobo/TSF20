package com.tsf.shell.p096f.p153i.p155b.p158c;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p193c.C3702b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.plugin.widget.FloatingItem;
import com.tsf.shell.plugin.widget.FloatingWidgetPicker;
import org.json.JSONObject;
/* renamed from: com.tsf.shell.f.i.b.c.a */
/* loaded from: classes.dex */
public class C3134a extends C3112b implements C0913a.InterfaceC0914a {

    /* renamed from: f */
    private static C3140b f10182f;

    /* renamed from: p */
    private static double f10183p = 0.017453292519943295d;

    /* renamed from: a */
    public int f10184a;

    /* renamed from: b */
    FloatingItem f10185b;

    /* renamed from: g */
    private int f10186g;

    /* renamed from: h */
    private int f10187h;

    /* renamed from: i */
    private int f10188i;

    /* renamed from: j */
    private int f10189j;

    /* renamed from: k */
    private C0981k f10190k;

    /* renamed from: l */
    private boolean f10191l;

    /* renamed from: m */
    private boolean f10192m;

    /* renamed from: n */
    private boolean f10193n;

    /* renamed from: o */
    private float f10194o;

    /* renamed from: q */
    private boolean f10195q;

    /* renamed from: r */
    private int f10196r;

    /* renamed from: s */
    private int f10197s;

    public C3134a(ItemInfo itemInfo) {
        super(itemInfo);
        this.f10191l = false;
        this.f10192m = false;
        this.f10193n = false;
        this.f10194o = 0.0f;
        this.f10196r = 0;
        m3498i(true);
        m3505e(false);
        if (f10182f == null) {
            f10182f = new C3140b();
        }
        mo3458ac();
        this.f10194o = position().f2527y;
        if (m3534K().config == null || m3534K().config.length() < 1) {
            m3430k();
        } else if (!m3428q()) {
            C3359a.f11095i.m1647a(this);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: X */
    public void mo3440X() {
        super.mo3440X();
        m3429l();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: a */
    public void mo3439a(float f, float f2) {
        super.mo3439a(f, f2);
        m3429l();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f10190k != null && this.f10185b != null) {
            if (C3702b.f12211c) {
                this.f10190k.setAnimationObjectState(true);
                if (!this.f10191l && !this.f10192m && !this.f10193n && !m3522Y()) {
                    if (this.f10185b.f13028f) {
                        if (this.f10185b.f13036n != 0.0f) {
                            position().f2527y = this.f10194o + (((float) Math.sin(f10183p * this.f10196r)) * this.f10185b.f13036n * C0892a.f2566b);
                            this.f10196r++;
                        }
                        if (this.f10195q) {
                            position().f2526x += this.f10185b.f13027e;
                            if (position().f2526x > (this.f10185b.f13035m ? this.f10187h : this.f10186g)) {
                                if (this.f10185b.f13035m) {
                                    m3438a(this.f10190k);
                                    this.f10195q = false;
                                    return;
                                }
                                position().f2526x = this.f10188i;
                                return;
                            }
                            return;
                        }
                        position().f2526x -= this.f10185b.f13027e;
                        if (position().f2526x < (this.f10185b.f13035m ? this.f10189j : this.f10188i)) {
                            if (this.f10185b.f13035m) {
                                m3438a(this.f10190k);
                                this.f10195q = true;
                                return;
                            }
                            position().f2526x = this.f10186g;
                            return;
                        }
                        return;
                    } else if (this.f10195q) {
                        position().f2527y += this.f10185b.f13027e;
                        if (position().f2527y > this.f10186g) {
                            position().f2527y = this.f10188i;
                            return;
                        }
                        return;
                    } else {
                        position().f2527y -= this.f10185b.f13027e;
                        if (position().f2527y < this.f10188i) {
                            position().f2527y = this.f10186g;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.f10190k.getAnimationObjectState()) {
                this.f10190k.setAnimationObjectState(false);
                m3514ad();
            }
            if (!this.f10191l) {
            }
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: n_ */
    public void mo3052n_() {
        this.f10191l = true;
        super.mo3052n_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: m_ */
    public void mo3053m_() {
        super.mo3053m_();
        this.f10194o = position().f2527y;
        this.f10196r = 0;
        this.f10191l = false;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: c */
    public void mo3056c() {
        super.mo3056c();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: q_ */
    public void mo3081q_() {
        super.mo3081q_();
        this.f10192m = true;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: j */
    public void mo3083j() {
        super.mo3083j();
        this.f10192m = false;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        super.mo3055g();
        f10182f.m3424b(this);
        this.f10190k = null;
    }

    /* renamed from: k */
    public void m3430k() {
        Intent intent = new Intent();
        intent.setClass(C0853a.m10856d(), FloatingWidgetPicker.class);
        this.f10197s = Home.f7122c.mo927a(intent, (C0913a.InterfaceC0914a) this);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == this.f10197s) {
                FloatingItem floatingItem = (FloatingItem) intent.getParcelableExtra("result");
                floatingItem.m965a();
                this.f10185b = floatingItem;
                C0853a.m10865a().m10590a(new RenderRunnable(2, 1) { // from class: com.tsf.shell.f.i.b.c.a.1
                    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                    public void run() {
                        if (C3134a.this.f10185b.f13037o || !C3134a.this.m3428q()) {
                            C3359a.f11095i.m1647a(C3134a.this);
                            return;
                        }
                        C3134a.this.m3521Z();
                        C3134a.this.m3434ah();
                        C3134a.this.m3435ag();
                        C3134a.this.mo3458ac();
                    }
                });
                return;
            }
            return;
        }
        C0853a.m10865a().m10590a(new RenderRunnable(2, 1) { // from class: com.tsf.shell.f.i.b.c.a.2
            @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
            public void run() {
                C3359a.f11095i.m1647a(C3134a.this);
            }
        });
    }

    /* renamed from: l */
    private void m3429l() {
        if (this.f10185b != null) {
            if (this.f10185b.f13028f) {
                this.f10186g = (int) (C0892a.f2550A + ((this.f10190k.mo10366b() / 2.0f) * m3491u()));
                this.f10187h = (int) (C0892a.f2550A - ((this.f10190k.mo10366b() / 2.0f) * m3491u()));
                this.f10188i = (int) (C0892a.f2590z - ((this.f10190k.mo10366b() / 2.0f) * m3491u()));
                this.f10189j = (int) (C0892a.f2590z + ((this.f10190k.mo10366b() / 2.0f) * m3491u()));
                return;
            }
            this.f10186g = (int) (C0892a.f2558I + ((this.f10190k.mo10365c() / 2.0f) * m3491u()));
            this.f10187h = (int) (C0892a.f2558I - ((this.f10190k.mo10365c() / 2.0f) * m3491u()));
            this.f10188i = (int) ((-C0892a.f2558I) - ((this.f10190k.mo10365c() / 2.0f) * m3491u()));
            this.f10189j = (int) ((-C0892a.f2558I) + ((this.f10190k.mo10365c() / 2.0f) * m3491u()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public boolean m3428q() {
        if (this.f10185b == null) {
            this.f10185b = new FloatingItem(m3534K().config);
            if (this.f10185b.f13037o) {
                return false;
            }
        }
        this.f10195q = this.f10185b.f13029g;
        TextureElement m3426a = f10182f.m3426a(this);
        if (m3426a == null) {
            return false;
        }
        if (this.f10185b.f13030h) {
            this.f10190k = new C3139b(this.f10185b.f13034l, this.f10185b.f13033k, this.f10185b.f13032j, this.f10185b.f13031i, m3426a.width, m3426a.height);
        } else {
            this.f10190k = new C3138a(m3426a.width * C0892a.f2566b, m3426a.height * C0892a.f2566b, false);
        }
        this.f10190k.setAnimationObjectState(true);
        this.f10190k.setHighPriorityAnimationObjectState(false);
        this.f10190k.textures().addElement(m3426a);
        this.f10184a = m3426a.f2529id;
        this.f10190k.setMouseEventListener(new C0937a(this.f10190k) { // from class: com.tsf.shell.f.i.b.c.a.3
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C3134a.this.f10193n = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C3134a.this.f10193n = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3134a.this.m3434ah();
                C3134a.this.m3435ag();
            }
        });
        this.f10190k.doubleSidedClickEnabled(true);
        addChild(this.f10190k);
        this.f10190k.calAABB(1.0f, 1.0f, 1.0f);
        calAABB();
        m3429l();
        return true;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean calTouchCollision(float f, float f2) {
        if (this.f10190k.calTouchCollision(f, f2)) {
            return true;
        }
        return super.calTouchCollision(f, f2);
    }

    /* renamed from: a */
    private void m3438a(C0975i c0975i) {
        c0975i.doubleSidedEnabled(true);
        C1017d c1017d = new C1017d();
        if (c0975i.rotation().f2527y == 0.0f) {
            c1017d.m10305d(180.0f);
        } else {
            c1017d.m10305d(0.0f);
        }
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 300, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ag */
    public void m3435ag() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("horizontal", this.f10185b.f13028f);
            jSONObject.put("isSequence", this.f10185b.f13030h);
            jSONObject.put("positionIncrease", this.f10185b.f13029g);
            jSONObject.put("totalFrame", this.f10185b.f13031i);
            jSONObject.put("unitCount", this.f10185b.f13032j);
            jSONObject.put("unitHeight", this.f10185b.f13033k);
            jSONObject.put("unitWidth", this.f10185b.f13034l);
            jSONObject.put("currentSpeed", this.f10185b.f13027e);
            jSONObject.put("drawable", this.f10185b.f13024b);
            jSONObject.put("maxSpeed", this.f10185b.f13026d);
            jSONObject.put("miniSpeed", this.f10185b.f13025c);
            jSONObject.put("packageName", this.f10185b.f13023a);
            jSONObject.put("overturn", this.f10185b.f13035m);
            jSONObject.put("wave", this.f10185b.f13036n);
            m3534K().onUpdateConfig(jSONObject.toString());
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ah */
    public void m3434ah() {
        if (this.f10185b.f13027e == 0.0f) {
            this.f10185b.f13027e = this.f10185b.f13025c + ((float) (Math.random() * (this.f10185b.f13026d - this.f10185b.f13025c)));
            return;
        }
        this.f10185b.f13027e = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.b.c.a$a */
    /* loaded from: classes.dex */
    public class C3138a extends C0981k {
        public C3138a(float f, float f2, boolean z) {
            super(f, f2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.b.c.a$b */
    /* loaded from: classes.dex */
    public class C3139b extends C0981k {

        /* renamed from: d */
        private int f10203d;

        /* renamed from: e */
        private int f10204e;

        /* renamed from: f */
        private int f10205f;

        /* renamed from: g */
        private float f10206g;

        /* renamed from: h */
        private float f10207h;

        public C3139b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i * C0892a.f2566b, i2 * C0892a.f2566b, false);
            this.f10205f = 0;
            this.f10203d = i3;
            this.f10204e = i4;
            this.f10206g = i / i5;
            this.f10207h = i2 / i6;
            this.f10205f = (int) (Math.random() * (i4 - 1));
            m3427a();
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (!C3134a.this.f10192m && C3702b.f12211c) {
                m3427a();
            }
        }

        /* renamed from: a */
        private void m3427a() {
            int i = this.f10205f % this.f10203d;
            int i2 = this.f10205f / this.f10203d;
            uvs().set(0, this.f10206g * i, (i2 + 1) * this.f10207h);
            uvs().set(1, (i + 1) * this.f10206g, (i2 + 1) * this.f10207h);
            uvs().set(2, this.f10206g * i, this.f10207h * i2);
            uvs().set(3, (i + 1) * this.f10206g, i2 * this.f10207h);
            updateUvsVBO();
            this.f10205f++;
            if (this.f10205f >= this.f10204e) {
                this.f10205f = 0;
            }
        }
    }
}
