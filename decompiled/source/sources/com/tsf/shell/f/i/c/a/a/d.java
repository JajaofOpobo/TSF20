package com.tsf.shell.f.i.c.a.a;

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
/* loaded from: classes.dex */
public class d extends VObject3dContainer {
    public static float j;
    private static float n;
    private static float o;
    public c a;
    public VRectangle b;
    public h c;
    public VButton d;
    public VRectangle e;
    public VObject3dContainer f;
    public VObject3dContainer g;
    public VRectangle h;
    public VRectangle i;
    private float t;
    private float x;
    private float y;
    private a l = new a();
    private RectF m = new RectF();
    private PointF p = new PointF();
    private PointF q = new PointF();
    private PointF r = new PointF();
    private float s = 0.12f;
    private boolean u = true;
    private boolean v = false;
    private boolean w = true;
    int k = 0;

    public void a() {
        this.a.e();
        this.u = false;
        this.s = 0.02f;
        this.l.b = 0.8f;
        this.r.x = this.k % 2 == 0 ? this.m.left : this.m.right;
        this.r.y = this.m.bottom;
        this.x = this.k % 2 == 0 ? this.r.x + 10.0f : this.r.x - 10.0f;
        this.y = this.r.y + 30.0f;
        this.l.a.set(this.x, this.y);
        a(this.l);
        a(this.k % 2 == 0 ? this.x + 500.0f : this.x - 500.0f, this.y + 3000.0f);
        this.k++;
        this.w = true;
    }

    private void a(float f, float f2) {
        float height;
        float f3;
        float f4;
        if (f2 > 0.0f) {
            if (Math.abs(f) > f2) {
                if (f > 0.0f) {
                    this.x = this.m.right;
                } else {
                    this.x = this.m.left;
                }
                this.y = (this.x * f2) / f;
            } else {
                this.y = this.m.top;
                com.tsf.shell.f.i.c.a.e.a("IS THIS FLITER?");
            }
        } else if (Math.abs(f) > (-f2)) {
            if (f > 0.0f) {
                this.x = this.m.right;
            } else {
                this.x = this.m.left;
            }
            this.y = (this.x * f2) / f;
        } else {
            this.y = this.m.bottom;
        }
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.a.d.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                d.this.c.b();
                b.a.a();
            }
        };
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                f4 = this.m.width();
            } else {
                f4 = -this.m.width();
            }
            f3 = f4;
            height = (f2 * f4) / f;
        } else {
            if (f2 > 0.0f) {
                height = -this.m.height();
            } else {
                height = this.m.height();
            }
            f3 = (f * height) / f2;
        }
        vTweenParam.setAlpha(-20);
        vTweenParam.setX(f3);
        vTweenParam.setY(height);
        vTweenParam.setTimeout(1000);
        VTween.killTween(this.a);
        VTween.to(this.a, 1000, vTweenParam);
    }

    public void b() {
        VTween.killTween(this.a);
        this.a.alpha(0);
    }

    public d(VObject3dContainer vObject3dContainer) {
        j = com.tsf.shell.f.i.c.a.a.a.a / 1.8f;
        this.t = j / com.tsf.shell.f.i.c.a.a.a.b;
        n = 545.0f * j;
        o = 350.0f * j;
        this.m.top = o / 2.0f;
        this.m.bottom = (-o) / 2.0f;
        this.m.left = (-n) / 2.0f;
        this.m.right = n / 2.0f;
        this.a = new c(15);
        this.a.setAnimationObjectState(true);
        this.a.a(this.m);
        this.a.a(false);
        this.a.e();
        this.d = new VButton(3, 64, 448);
        this.d.scale().setAll(j, j, 1.0f);
        VButtonItem item = this.d.getItem(0);
        item.position().pxX(160.0f - 320.0f);
        item.setTextureAllAndSetSizePX(0, 0, 5, 8, 320, ItemInfo.APP_VERSION_NAME);
        item.updatePointMatrix();
        item.updateTextureMatrix();
        float f = 320.0f - 320.0f;
        VButtonItem item2 = this.d.getItem(1);
        item2.position().pxX(f + 64.0f);
        item2.setTextureAllAndSetSizePX(2, 0, 2, 8, ItemInfo.APP_INTENT, ItemInfo.APP_VERSION_NAME);
        item2.updatePointMatrix();
        item2.updateTextureMatrix();
        VButtonItem item3 = this.d.getItem(2);
        item3.position().pxX(f + 128.0f + 96.0f);
        item3.setTextureAllAndSetSizePX(4, 0, 3, 8, 192, ItemInfo.APP_VERSION_NAME);
        item3.updatePointMatrix();
        item3.updateTextureMatrix();
        this.b = new VRectangle(545.0f * this.t, 350.0f * this.t, 1, 1);
        this.b.useVBO(false);
        this.b.position().x = 0.0f;
        this.b.position().y = 47.0f * j;
        this.g = new VObject3dContainer() { // from class: com.tsf.shell.f.i.c.a.a.d.2
            @Override // com.censivn.C3DEngine.api.core.VObject3d
            public void onDrawStart() {
                d.this.a.d();
            }
        };
        this.f = new VObject3dContainer() { // from class: com.tsf.shell.f.i.c.a.a.d.3
            @Override // com.censivn.C3DEngine.api.core.VObject3d
            public void onDrawStart() {
                if (!d.this.u) {
                    if (Math.abs(d.this.x - d.this.l.a.x) >= 1.0f || Math.abs(d.this.y - d.this.l.a.y) >= 1.0f || d.this.v) {
                        float f2 = (d.this.y - d.this.l.a.y) * d.this.s;
                        d.this.l.a.set(((d.this.x - d.this.l.a.x) * d.this.s) + d.this.l.a.x, f2 + d.this.l.a.y);
                        d.this.a(d.this.l);
                    } else {
                        d.this.a.c();
                        d.this.a.visible(false);
                        d.this.u = true;
                        if (!d.this.w) {
                            com.tsf.shell.f.i.c.a.e.a("FINISH AND CHANGE TEXTURE");
                            d.this.w = true;
                        }
                    }
                }
                d.this.a.c();
            }
        };
        PositionNumber3d position = this.f.position();
        PositionNumber3d position2 = this.g.position();
        float f2 = 47.0f * j;
        position2.y = f2;
        position.y = f2;
        this.h = new VRectangle(576.0f * this.t, this.t * 64.0f, 1, 1);
        this.h.position().x = 17.0f * j;
        this.h.position().y = 208.0f * j;
        this.e = new VRectangle(448.0f * this.t, 128.0f * this.t, 1, 1);
        this.e.position().x = (-80.0f) * j;
        this.e.position().y = (-192.0f) * j;
        this.e.calAABB();
        this.i = new VRectangle(320.0f * this.t, this.t * 64.0f, 1, 1);
        this.i.position().y = 273.0f * j;
        this.i.position().x = (-135.0f) * j;
        this.c = new h(j, this.t);
        this.c.position().x = 200.0f * j;
        this.c.position().y = (-168.0f) * j;
        addChild(this.i);
        addChild(this.d);
        addChild(this.e);
        addChild(this.b);
        addChild(this.f);
        addChild(this.h);
        addChild(this.c);
        addChild(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        double width = (this.m.width() / 2.0f) * Math.max(1.0f - aVar.b, 0.0f);
        this.q.set(aVar.a);
        this.p.x = this.q.x - this.r.x;
        this.p.y = this.q.y - this.r.y;
        a(this.q, this.p, width);
    }

    private void a(PointF pointF, PointF pointF2, double d) {
        if (pointF.x > this.m.right) {
            pointF.x = this.m.right;
        } else if (pointF.x < this.m.left) {
            pointF.x = this.m.left;
        }
        if (pointF.y > this.m.top) {
            pointF.y = this.m.top;
        } else if (pointF.y < this.m.bottom) {
            pointF.y = this.m.bottom;
        }
        double sqrt = Math.sqrt((pointF2.x * pointF2.x) + (pointF2.y * pointF2.y));
        if (sqrt != 0.0d) {
            pointF2.x = (float) (pointF2.x / sqrt);
            pointF2.y = (float) (pointF2.y / sqrt);
            this.a.a(pointF, pointF2, d);
            return;
        }
        this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {
        PointF a;
        float b;

        private a() {
            this.a = new PointF();
        }
    }

    public void c() {
        this.a.b().c();
        this.d.textures().removeAll();
        this.b.textures().removeAll();
        this.h.textures().removeAll();
        this.e.textures().removeAll();
        this.i.textures().removeAll();
        this.c.a();
    }
}
