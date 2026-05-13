package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3296e;
/* renamed from: com.tsf.shell.f.i.c.a.a.d */
/* loaded from: classes.dex */
public class C3244d extends VObject3dContainer {

    /* renamed from: j */
    public static float f10643j;

    /* renamed from: n */
    private static float f10644n;

    /* renamed from: o */
    private static float f10645o;

    /* renamed from: a */
    public C3239c f10646a;

    /* renamed from: b */
    public VRectangle f10647b;

    /* renamed from: c */
    public C3252h f10648c;

    /* renamed from: d */
    public VButton f10649d;

    /* renamed from: e */
    public VRectangle f10650e;

    /* renamed from: f */
    public VObject3dContainer f10651f;

    /* renamed from: g */
    public VObject3dContainer f10652g;

    /* renamed from: h */
    public VRectangle f10653h;

    /* renamed from: i */
    public VRectangle f10654i;

    /* renamed from: t */
    private float f10662t;

    /* renamed from: x */
    private float f10666x;

    /* renamed from: y */
    private float f10667y;

    /* renamed from: l */
    private C3248a f10656l = new C3248a();

    /* renamed from: m */
    private RectF f10657m = new RectF();

    /* renamed from: p */
    private PointF f10658p = new PointF();

    /* renamed from: q */
    private PointF f10659q = new PointF();

    /* renamed from: r */
    private PointF f10660r = new PointF();

    /* renamed from: s */
    private float f10661s = 0.12f;

    /* renamed from: u */
    private boolean f10663u = true;

    /* renamed from: v */
    private boolean f10664v = false;

    /* renamed from: w */
    private boolean f10665w = true;

    /* renamed from: k */
    int f10655k = 0;

    /* renamed from: a */
    public void m3022a() {
        this.f10646a.m3033e();
        this.f10663u = false;
        this.f10661s = 0.02f;
        this.f10656l.f10672b = 0.8f;
        this.f10660r.x = this.f10655k % 2 == 0 ? this.f10657m.left : this.f10657m.right;
        this.f10660r.y = this.f10657m.bottom;
        this.f10666x = this.f10655k % 2 == 0 ? this.f10660r.x + 10.0f : this.f10660r.x - 10.0f;
        this.f10667y = this.f10660r.y + 30.0f;
        this.f10656l.f10671a.set(this.f10666x, this.f10667y);
        m3019a(this.f10656l);
        m3021a(this.f10655k % 2 == 0 ? this.f10666x + 500.0f : this.f10666x - 500.0f, this.f10667y + 3000.0f);
        this.f10655k++;
        this.f10665w = true;
    }

    /* renamed from: a */
    private void m3021a(float f, float f2) {
        float height;
        float f3;
        float f4;
        if (f2 > 0.0f) {
            if (Math.abs(f) > f2) {
                if (f > 0.0f) {
                    this.f10666x = this.f10657m.right;
                } else {
                    this.f10666x = this.f10657m.left;
                }
                this.f10667y = (this.f10666x * f2) / f;
            } else {
                this.f10667y = this.f10657m.top;
                C3296e.m2908a("IS THIS FLITER?");
            }
        } else if (Math.abs(f) > (-f2)) {
            if (f > 0.0f) {
                this.f10666x = this.f10657m.right;
            } else {
                this.f10666x = this.f10657m.left;
            }
            this.f10667y = (this.f10666x * f2) / f;
        } else {
            this.f10667y = this.f10657m.bottom;
        }
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.a.d.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3244d.this.f10648c.m2998b();
                C3237b.f10578a.mo2855a();
            }
        };
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                f4 = this.f10657m.width();
            } else {
                f4 = -this.f10657m.width();
            }
            f3 = f4;
            height = (f2 * f4) / f;
        } else {
            if (f2 > 0.0f) {
                height = -this.f10657m.height();
            } else {
                height = this.f10657m.height();
            }
            f3 = (f * height) / f2;
        }
        vTweenParam.setAlpha(-20);
        vTweenParam.setX(f3);
        vTweenParam.setY(height);
        vTweenParam.setTimeout(1000);
        VTween.killTween(this.f10646a);
        VTween.m10747to(this.f10646a, 1000, vTweenParam);
    }

    /* renamed from: b */
    public void m3015b() {
        VTween.killTween(this.f10646a);
        this.f10646a.alpha(0);
    }

    public C3244d(VObject3dContainer vObject3dContainer) {
        f10643j = C3236a.f10574a / 1.8f;
        this.f10662t = f10643j / C3236a.f10575b;
        f10644n = 545.0f * f10643j;
        f10645o = 350.0f * f10643j;
        this.f10657m.top = f10645o / 2.0f;
        this.f10657m.bottom = (-f10645o) / 2.0f;
        this.f10657m.left = (-f10644n) / 2.0f;
        this.f10657m.right = f10644n / 2.0f;
        this.f10646a = new C3239c(15);
        this.f10646a.setAnimationObjectState(true);
        this.f10646a.m3040a(this.f10657m);
        this.f10646a.m3037a(false);
        this.f10646a.m3033e();
        this.f10649d = new VButton(3, 64, 448);
        this.f10649d.scale().setAll(f10643j, f10643j, 1.0f);
        VButtonItem item = this.f10649d.getItem(0);
        item.position().pxX(160.0f - 320.0f);
        item.setTextureAllAndSetSizePX(0, 0, 5, 8, 320, ItemInfo.APP_VERSION_NAME);
        item.updatePointMatrix();
        item.updateTextureMatrix();
        float f = 320.0f - 320.0f;
        VButtonItem item2 = this.f10649d.getItem(1);
        item2.position().pxX(f + 64.0f);
        item2.setTextureAllAndSetSizePX(2, 0, 2, 8, ItemInfo.APP_INTENT, ItemInfo.APP_VERSION_NAME);
        item2.updatePointMatrix();
        item2.updateTextureMatrix();
        VButtonItem item3 = this.f10649d.getItem(2);
        item3.position().pxX(f + 128.0f + 96.0f);
        item3.setTextureAllAndSetSizePX(4, 0, 3, 8, 192, ItemInfo.APP_VERSION_NAME);
        item3.updatePointMatrix();
        item3.updateTextureMatrix();
        this.f10647b = new VRectangle(545.0f * this.f10662t, 350.0f * this.f10662t, 1, 1);
        this.f10647b.useVBO(false);
        this.f10647b.position().f2526x = 0.0f;
        this.f10647b.position().f2527y = 47.0f * f10643j;
        this.f10652g = new VObject3dContainer() { // from class: com.tsf.shell.f.i.c.a.a.d.2
            @Override // com.censivn.C3DEngine.api.core.VObject3d
            public void onDrawStart() {
                C3244d.this.f10646a.m3034d();
            }
        };
        this.f10651f = new VObject3dContainer() { // from class: com.tsf.shell.f.i.c.a.a.d.3
            @Override // com.censivn.C3DEngine.api.core.VObject3d
            public void onDrawStart() {
                if (!C3244d.this.f10663u) {
                    if (Math.abs(C3244d.this.f10666x - C3244d.this.f10656l.f10671a.x) >= 1.0f || Math.abs(C3244d.this.f10667y - C3244d.this.f10656l.f10671a.y) >= 1.0f || C3244d.this.f10664v) {
                        float f2 = (C3244d.this.f10667y - C3244d.this.f10656l.f10671a.y) * C3244d.this.f10661s;
                        C3244d.this.f10656l.f10671a.set(((C3244d.this.f10666x - C3244d.this.f10656l.f10671a.x) * C3244d.this.f10661s) + C3244d.this.f10656l.f10671a.x, f2 + C3244d.this.f10656l.f10671a.y);
                        C3244d.this.m3019a(C3244d.this.f10656l);
                    } else {
                        C3244d.this.f10646a.m3035c();
                        C3244d.this.f10646a.visible(false);
                        C3244d.this.f10663u = true;
                        if (!C3244d.this.f10665w) {
                            C3296e.m2908a("FINISH AND CHANGE TEXTURE");
                            C3244d.this.f10665w = true;
                        }
                    }
                }
                C3244d.this.f10646a.m3035c();
            }
        };
        PositionNumber3d position = this.f10651f.position();
        PositionNumber3d position2 = this.f10652g.position();
        float f2 = 47.0f * f10643j;
        position2.f2527y = f2;
        position.f2527y = f2;
        this.f10653h = new VRectangle(576.0f * this.f10662t, this.f10662t * 64.0f, 1, 1);
        this.f10653h.position().f2526x = 17.0f * f10643j;
        this.f10653h.position().f2527y = 208.0f * f10643j;
        this.f10650e = new VRectangle(448.0f * this.f10662t, 128.0f * this.f10662t, 1, 1);
        this.f10650e.position().f2526x = (-80.0f) * f10643j;
        this.f10650e.position().f2527y = (-192.0f) * f10643j;
        this.f10650e.calAABB();
        this.f10654i = new VRectangle(320.0f * this.f10662t, this.f10662t * 64.0f, 1, 1);
        this.f10654i.position().f2527y = 273.0f * f10643j;
        this.f10654i.position().f2526x = (-135.0f) * f10643j;
        this.f10648c = new C3252h(f10643j, this.f10662t);
        this.f10648c.position().f2526x = 200.0f * f10643j;
        this.f10648c.position().f2527y = (-168.0f) * f10643j;
        addChild(this.f10654i);
        addChild(this.f10649d);
        addChild(this.f10650e);
        addChild(this.f10647b);
        addChild(this.f10651f);
        addChild(this.f10653h);
        addChild(this.f10648c);
        addChild(this.f10652g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3019a(C3248a c3248a) {
        double width = (this.f10657m.width() / 2.0f) * Math.max(1.0f - c3248a.f10672b, 0.0f);
        this.f10659q.set(c3248a.f10671a);
        this.f10658p.x = this.f10659q.x - this.f10660r.x;
        this.f10658p.y = this.f10659q.y - this.f10660r.y;
        m3020a(this.f10659q, this.f10658p, width);
    }

    /* renamed from: a */
    private void m3020a(PointF pointF, PointF pointF2, double d) {
        if (pointF.x > this.f10657m.right) {
            pointF.x = this.f10657m.right;
        } else if (pointF.x < this.f10657m.left) {
            pointF.x = this.f10657m.left;
        }
        if (pointF.y > this.f10657m.top) {
            pointF.y = this.f10657m.top;
        } else if (pointF.y < this.f10657m.bottom) {
            pointF.y = this.f10657m.bottom;
        }
        double sqrt = Math.sqrt((pointF2.x * pointF2.x) + (pointF2.y * pointF2.y));
        if (sqrt != 0.0d) {
            pointF2.x = (float) (pointF2.x / sqrt);
            pointF2.y = (float) (pointF2.y / sqrt);
            this.f10646a.m3041a(pointF, pointF2, d);
            return;
        }
        this.f10646a.m3033e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.d$a */
    /* loaded from: classes.dex */
    public class C3248a {

        /* renamed from: a */
        PointF f10671a;

        /* renamed from: b */
        float f10672b;

        private C3248a() {
            this.f10671a = new PointF();
        }
    }

    /* renamed from: c */
    public void m3012c() {
        this.f10646a.m3036b().m3001c();
        this.f10649d.textures().removeAll();
        this.f10647b.textures().removeAll();
        this.f10653h.textures().removeAll();
        this.f10650e.textures().removeAll();
        this.f10654i.textures().removeAll();
        this.f10648c.m2999a();
    }
}
