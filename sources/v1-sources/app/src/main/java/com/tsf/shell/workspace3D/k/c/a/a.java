package com.tsf.shell.workspace3D.k.c.a;

import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.widget.FloatingItem;
import com.tsf.shell.plugin.widget.FloatingWidgetPicker;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements com.tsf.shell.a {
    private static i a;
    private static double k = 0.017453292519943295d;
    private int b;
    private int c;
    private int d;
    private int e;
    private h f;
    private com.censivn.C3DEngine.e.b g;
    private boolean h = false;
    private boolean i = false;
    private float j = 0.0f;
    private boolean l;
    private int m;

    public com.tsf.shell.workspace3D.k.j getWidget(Context context) {
        if (a == null) {
            a = new i();
        }
        this.f = new b(this);
        this.f.l(false);
        return this.f;
    }

    public final void a() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), FloatingWidgetPicker.class);
        this.m = Home.d().a(intent, this);
    }

    @Override // com.tsf.shell.a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == this.m) {
                FloatingItem floatingItem = (FloatingItem) intent.getParcelableExtra("result");
                floatingItem.a();
                this.f.B = floatingItem;
                com.censivn.C3DEngine.a.a().a((RenderRunnable) new c(this));
                return;
            }
            return;
        }
        com.censivn.C3DEngine.a.a().a((RenderRunnable) new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f != null && this.f.B != null) {
            if (this.f.B.f) {
                this.b = (int) (com.censivn.C3DEngine.a.f + ((this.g.n_() / 2.0f) * this.f.aN()));
                this.c = (int) (com.censivn.C3DEngine.a.f - ((this.g.n_() / 2.0f) * this.f.aN()));
                this.d = (int) (com.censivn.C3DEngine.a.e - ((this.g.n_() / 2.0f) * this.f.aN()));
                this.e = (int) (com.censivn.C3DEngine.a.e + ((this.g.n_() / 2.0f) * this.f.aN()));
                return;
            }
            this.b = (int) (com.censivn.C3DEngine.a.o + ((this.g.o_() / 2.0f) * this.f.aN()));
            this.c = (int) (com.censivn.C3DEngine.a.o - ((this.g.o_() / 2.0f) * this.f.aN()));
            this.d = (int) ((-com.censivn.C3DEngine.a.o) - ((this.g.o_() / 2.0f) * this.f.aN()));
            this.e = (int) ((-com.censivn.C3DEngine.a.o) + ((this.g.o_() / 2.0f) * this.f.aN()));
        }
    }

    static /* synthetic */ boolean l(a aVar) {
        if (aVar.f.B == null) {
            aVar.f.B = new FloatingItem(aVar.f.be().config);
            if (aVar.f.B.o) {
                return false;
            }
        }
        aVar.l = aVar.f.B.g;
        TextureElement a2 = a.a(aVar.f);
        if (a2 == null) {
            return false;
        }
        if (aVar.f.B.h) {
            aVar.g = new g(aVar, aVar.f.B.l, aVar.f.B.k, aVar.f.B.j, aVar.f.B.i, a2.width, a2.height);
        } else {
            aVar.g = new f(aVar, a2.width * com.censivn.C3DEngine.a.b, a2.height * com.censivn.C3DEngine.a.b);
        }
        aVar.g.a_(true);
        aVar.g.v();
        aVar.g.z().c(a2);
        aVar.g.ar();
        aVar.f.A = a2.id;
        aVar.g.a((l) new e(aVar, aVar.g));
        aVar.g.ak();
        aVar.f.d(aVar.g);
        aVar.f.ar();
        aVar.d();
        return true;
    }

    static /* synthetic */ void a(r rVar) {
        rVar.b(true);
        u uVar = new u();
        if (rVar.M().y == 0.0f) {
            uVar.d(180.0f);
        } else {
            uVar.d(0.0f);
        }
        s.a(rVar);
        s.a(rVar, 300, uVar);
    }

    static /* synthetic */ void p(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("horizontal", aVar.f.B.f);
            jSONObject.put("isSequence", aVar.f.B.h);
            jSONObject.put("positionIncrease", aVar.f.B.g);
            jSONObject.put("totalFrame", aVar.f.B.i);
            jSONObject.put("unitCount", aVar.f.B.j);
            jSONObject.put("unitHeight", aVar.f.B.k);
            jSONObject.put("unitWidth", aVar.f.B.l);
            jSONObject.put("currentSpeed", aVar.f.B.e);
            jSONObject.put("drawable", aVar.f.B.b);
            jSONObject.put("maxSpeed", aVar.f.B.d);
            jSONObject.put("miniSpeed", aVar.f.B.c);
            jSONObject.put("packageName", aVar.f.B.a);
            jSONObject.put("overturn", aVar.f.B.m);
            jSONObject.put("wave", aVar.f.B.n);
            aVar.f.be().config = jSONObject.toString();
            aVar.f.bs();
        } catch (Exception e) {
        }
    }

    static /* synthetic */ void o(a aVar) {
        if (aVar.f.B.e != 0.0f) {
            aVar.f.B.e = 0.0f;
        } else {
            aVar.f.B.e = aVar.f.B.c + ((float) (Math.random() * (aVar.f.B.d - aVar.f.B.c)));
        }
    }
}
