package com.tsf.shell.e.i.b.c;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.widget.FloatingItem;
import com.tsf.shell.plugin.widget.FloatingWidgetPicker;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.tsf.shell.e.i.c implements com.censivn.C3DEngine.b.c.b {
    private static d f;
    private static double p = 0.017453292519943295d;
    public int a;
    FloatingItem b;
    private int g;
    private int h;
    private int i;
    private int j;
    private m k;
    private boolean l;
    private boolean m;
    private boolean n;
    private float o;
    private boolean q;
    private int r;
    private int s;

    public a(ItemInfo itemInfo) {
        super(itemInfo);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0.0f;
        this.r = 0;
        i(true);
        e(false);
        if (f == null) {
            f = new d();
        }
        ac();
        this.o = position().y;
        if (K().config == null || K().config.length() < 1) {
            k();
        } else if (!q()) {
            com.tsf.shell.manager.a.i.a(this);
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void X() {
        super.X();
        l();
    }

    @Override // com.tsf.shell.e.i.c
    public void a(float f2, float f3) {
        super.a(f2, f3);
        l();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.k != null && this.b != null) {
            if (com.tsf.shell.manager.r.c.b.c) {
                this.k.setAnimationObjectState(true);
                if (!this.l && !this.m && !this.n && !Y()) {
                    if (this.b.f) {
                        if (this.b.n != 0.0f) {
                            position().y = this.o + (((float) Math.sin(p * this.r)) * this.b.n * com.censivn.C3DEngine.b.b.a.b);
                            this.r++;
                        }
                        if (this.q) {
                            position().x += this.b.e;
                            if (position().x > (this.b.m ? this.h : this.g)) {
                                if (this.b.m) {
                                    a(this.k);
                                    this.q = false;
                                    return;
                                } else {
                                    position().x = this.i;
                                    return;
                                }
                            }
                            return;
                        }
                        position().x -= this.b.e;
                        if (position().x < (this.b.m ? this.j : this.i)) {
                            if (this.b.m) {
                                a(this.k);
                                this.q = true;
                                return;
                            } else {
                                position().x = this.g;
                                return;
                            }
                        }
                        return;
                    }
                    if (this.q) {
                        position().y += this.b.e;
                        if (position().y > this.g) {
                            position().y = this.i;
                            return;
                        }
                        return;
                    }
                    position().y -= this.b.e;
                    if (position().y < this.i) {
                        position().y = this.g;
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.k.getAnimationObjectState()) {
                this.k.setAnimationObjectState(false);
                ad();
            }
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void l_() {
        this.l = true;
        super.l_();
    }

    @Override // com.tsf.shell.e.i.c
    public void k_() {
        super.k_();
        this.o = position().y;
        this.r = 0;
        this.l = false;
    }

    @Override // com.tsf.shell.e.i.c
    public void c() {
        super.c();
    }

    @Override // com.tsf.shell.e.i.c
    public void o_() {
        super.o_();
        this.m = true;
    }

    @Override // com.tsf.shell.e.i.c
    public void j() {
        super.j();
        this.m = false;
    }

    @Override // com.tsf.shell.e.i.c
    public void g() {
        super.g();
        f.b(this);
        this.k = null;
    }

    public void k() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), FloatingWidgetPicker.class);
        this.s = Home.c.a(intent, (com.censivn.C3DEngine.b.c.b) this);
    }

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2;
        int i4 = 1;
        if (i2 == -1) {
            if (i == this.s) {
                FloatingItem floatingItem = (FloatingItem) intent.getParcelableExtra("result");
                floatingItem.a();
                this.b = floatingItem;
                com.censivn.C3DEngine.a.a().a(new RenderRunnable(i3, i4) { // from class: com.tsf.shell.e.i.b.c.a.1
                    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                    public void run() {
                        if (a.this.b.o || !a.this.q()) {
                            com.tsf.shell.manager.a.i.a(a.this);
                            return;
                        }
                        a.this.Z();
                        a.this.ah();
                        a.this.ag();
                        a.this.ac();
                    }
                });
                return;
            }
            return;
        }
        com.censivn.C3DEngine.a.a().a(new RenderRunnable(i3, i4) { // from class: com.tsf.shell.e.i.b.c.a.2
            @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
            public void run() {
                com.tsf.shell.manager.a.i.a(a.this);
            }
        });
    }

    private void l() {
        if (this.b != null) {
            if (this.b.f) {
                this.g = (int) (com.censivn.C3DEngine.b.b.a.A + ((this.k.b() / 2.0f) * u()));
                this.h = (int) (com.censivn.C3DEngine.b.b.a.A - ((this.k.b() / 2.0f) * u()));
                this.i = (int) (com.censivn.C3DEngine.b.b.a.z - ((this.k.b() / 2.0f) * u()));
                this.j = (int) (com.censivn.C3DEngine.b.b.a.z + ((this.k.b() / 2.0f) * u()));
                return;
            }
            this.g = (int) (com.censivn.C3DEngine.b.b.a.I + ((this.k.c() / 2.0f) * u()));
            this.h = (int) (com.censivn.C3DEngine.b.b.a.I - ((this.k.c() / 2.0f) * u()));
            this.i = (int) ((-com.censivn.C3DEngine.b.b.a.I) - ((this.k.c() / 2.0f) * u()));
            this.j = (int) ((-com.censivn.C3DEngine.b.b.a.I) + ((this.k.c() / 2.0f) * u()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (this.b == null) {
            this.b = new FloatingItem(K().config);
            if (this.b.o) {
                return false;
            }
        }
        this.q = this.b.g;
        TextureElement a = f.a(this);
        if (a == null) {
            return false;
        }
        if (this.b.h) {
            this.k = new c(this, this.b.l, this.b.k, this.b.j, this.b.i, a.width, a.height);
        } else {
            this.k = new b(this, a.width * com.censivn.C3DEngine.b.b.a.b, a.height * com.censivn.C3DEngine.b.b.a.b, false);
        }
        this.k.setAnimationObjectState(true);
        this.k.setHighPriorityAnimationObjectState(false);
        this.k.textures().addElement(a);
        this.a = a.id;
        this.k.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.k) { // from class: com.tsf.shell.e.i.b.c.a.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                a.this.n = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                a.this.n = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.ah();
                a.this.ag();
            }
        });
        this.k.doubleSidedClickEnabled(true);
        addChild(this.k);
        this.k.calAABB(1.0f, 1.0f, 1.0f);
        calAABB();
        l();
        return true;
    }

    @Override // com.tsf.shell.e.i.c, com.censivn.C3DEngine.b.f.j
    public boolean calTouchCollision(float f2, float f3) {
        if (this.k.calTouchCollision(f2, f3)) {
            return true;
        }
        return super.calTouchCollision(f2, f3);
    }

    private void a(j jVar) {
        jVar.doubleSidedEnabled(true);
        x xVar = new x();
        if (jVar.rotation().y == 0.0f) {
            xVar.d(180.0f);
        } else {
            xVar.d(0.0f);
        }
        w.a(jVar);
        w.a(jVar, 300, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("horizontal", this.b.f);
            jSONObject.put("isSequence", this.b.h);
            jSONObject.put("positionIncrease", this.b.g);
            jSONObject.put("totalFrame", this.b.i);
            jSONObject.put("unitCount", this.b.j);
            jSONObject.put("unitHeight", this.b.k);
            jSONObject.put("unitWidth", this.b.l);
            jSONObject.put("currentSpeed", this.b.e);
            jSONObject.put("drawable", this.b.b);
            jSONObject.put("maxSpeed", this.b.d);
            jSONObject.put("miniSpeed", this.b.c);
            jSONObject.put("packageName", this.b.a);
            jSONObject.put("overturn", this.b.m);
            jSONObject.put("wave", this.b.n);
            K().onUpdateConfig(jSONObject.toString());
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (this.b.e == 0.0f) {
            this.b.e = this.b.c + ((float) (Math.random() * (this.b.d - this.b.c)));
        } else {
            this.b.e = 0.0f;
        }
    }
}
