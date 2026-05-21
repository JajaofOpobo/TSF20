package com.tsf.shell.f.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.b;
import java.util.ArrayList;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h extends j {
    private VObject3dContainer A;
    private float B;
    private float C;
    boolean a;
    public TextureElement b;
    public TextureElement c;
    public TextureElement d;
    public TextureElement e;
    public TextureElement f;
    public TextureElement g;
    public TextureElement h;
    private final int m;
    private VRectangle n;
    private VRectangle o;
    private VRectangle p;
    private VRectangle q;
    private VButton r;
    private VButtonItem s;
    private VButtonItem t;
    private VButtonItem u;
    private VButton v;
    private VRectangle w;
    private ArrayList<VObject3d> x;
    private VObject3dContainer y;
    private VObject3dContainer z;

    public h(VTextureManager vTextureManager, Context context, float f, float f2) {
        super(vTextureManager, context);
        this.m = 1000;
        this.B = 1.0f;
        this.C = 0.0f;
        this.a = false;
        this.B = f;
        this.C = f2;
        e();
    }

    private void e() {
        this.z = new VObject3dContainer();
        this.A = new VObject3dContainer();
        m();
        l();
        this.z.addChild(this.A);
        addChild(this.z);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        e.a("scaleAndMovePreview");
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                h.this.k();
            }
        };
        vTweenParam.setScaleX(this.B);
        vTweenParam.setScaleY(this.B);
        vTweenParam.setScaleZ(this.B);
        VTween.to(this.A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam();
        vTweenParam2.setY(this.C);
        VTween.to(this.z, 500, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        e.a("restoreScaleAndMove");
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.2.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        h.this.h();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.to(h.this, 1, vTweenParam2);
            }
        };
        vTweenParam.setScaleX(1.0f);
        vTweenParam.setScaleY(1.0f);
        vTweenParam.setScaleZ(1.0f);
        VTween.to(this.A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam();
        vTweenParam2.setY(0.0f);
        VTween.to(this.z, VEasing.Linear.easeNone, vTweenParam2);
    }

    private void j() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.A);
        VTween.to(this.A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                h.this.v.setZOrderOnTop();
                h.this.r.setZOrderOnTop();
                h.this.y.visible(false);
                h.this.i();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                h.this.o.rotation().x = h.this.n.rotation().x;
                h.this.p.rotation().x = h.this.n.rotation().x;
                h.this.q.rotation().x = h.this.n.rotation().x;
                h.this.y.rotation().x = h.this.n.rotation().x + 180.0f;
                if (f > 0.5f) {
                    h.this.b(true);
                }
            }
        };
        vTweenParam2.setRotationX(0.0f);
        VTween.killTween(this.n);
        VTween.to(this.n, 500, vTweenParam2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.x.get(i2);
                VTweenParam vTweenParam3 = new VTweenParam();
                vTweenParam3.setRotationX(0.0f);
                vTweenParam3.setEase(300);
                vTweenParam3.setTimeout((i2 * 50) + 250);
                VTween.killTween(vObject3d);
                VTween.to(vObject3d, 2000, vTweenParam3);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setRotationY(-30.0f);
        VTween.killTween(this.A);
        VTween.to(this.A, 800, vTweenParam);
        this.y.visible(true);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                h.this.a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                h.this.o.rotation().x = h.this.n.rotation().x;
                h.this.p.rotation().x = h.this.n.rotation().x;
                h.this.q.rotation().x = h.this.n.rotation().x;
                h.this.y.rotation().x = h.this.n.rotation().x + 180.0f;
                if (f > 0.5f) {
                    h.this.b(false);
                }
            }
        };
        vTweenParam2.setRotationX(180.0f);
        vTweenParam2.setEase(300);
        VTween.killTween(this.n);
        VTween.to(this.n, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.x.get(i2);
                VTweenParam vTweenParam3 = new VTweenParam();
                vTweenParam3.setRotationX((i2 * 15) - 45);
                vTweenParam3.setEase(300);
                vTweenParam3.setTimeout((i2 * 50) + 0);
                VTween.killTween(vObject3d);
                VTween.to(vObject3d, 2000, vTweenParam3);
                i = i2 + 1;
            } else {
                this.w.rotation().x = 15;
                return;
            }
        }
    }

    public void b(boolean z) {
        if (z && this.a) {
            this.a = false;
            this.p.setZOrderOnTop();
            this.q.setZOrderOnTop();
            this.v.setZOrderOnTop();
            this.r.setZOrderOnTop();
            this.n.setZOrderOnTop();
            this.o.setZOrderOnTop();
            return;
        }
        if (!z && !this.a) {
            this.a = true;
            this.n.setZOrderOnTop();
            this.o.setZOrderOnTop();
            this.v.setZOrderOnTop();
            this.r.setZOrderOnTop();
            this.p.setZOrderOnTop();
            this.q.setZOrderOnTop();
        }
    }

    private void l() {
        this.y = new VObject3dContainer();
        this.y.rotation().x = 180.0f;
        this.w = new VRectangle(247.5f, 49.0f);
        this.w.moveAllPointsSP(0.0f, 428.0f, 0.0f);
        this.w.position().spY(50.0f);
        this.w.rotation().x = 25.0f;
        this.x = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            VRectangle vRectangle = new VRectangle(400.0f, 400.0f, 1, 1);
            vRectangle.moveAllPointsSP(0.0f, 200.0f, 0.0f);
            vRectangle.position().spY(64.0f);
            this.x.add(vRectangle);
            if (i == 4) {
                this.y.addChild(this.w);
            }
            this.y.addChild(vRectangle);
        }
        this.A.addChild(this.y);
    }

    private void m() {
        this.n = new VRectangle(512.0f, 64.0f, 1, 1);
        this.n.doubleSidedEnabled(true);
        this.n.moveAllPointsSP(0.0f, 32, 7);
        this.n.calAABB();
        this.n.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 6, 16, 2);
        this.o = new VRectangle(512.0f, 96.0f, 1, 1);
        this.o.doubleSidedEnabled(true);
        this.o.moveAllPointsSP(0.0f, (-48.0f) + 0, 7);
        this.o.calAABB();
        this.o.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 8, 16, 3);
        this.p = new VRectangle(512.0f, 64.0f, 1, 1);
        this.p.doubleSidedEnabled(true);
        this.p.moveAllPointsSP(0.0f, 32, -7);
        this.p.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 11, 16, 2);
        this.q = new VRectangle(512.0f, 96.0f, 1, 1);
        this.q.doubleSidedEnabled(true);
        this.q.moveAllPointsSP(0.0f, (-48.0f) + 0, -7);
        this.q.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 13, 16, 3);
        this.A.addChild(this.p);
        this.A.addChild(this.q);
        this.A.addChild(this.n);
        this.A.addChild(this.o);
        this.r = new VButton(3, 64, ItemInfo.APP_VERSION_NAME);
        this.r.position().spZ(10.0f);
        this.r.useVBO(false);
        this.s = this.r.getItem(0);
        this.s.position().spX(-125.0f);
        this.s.setTextureAllAndMathSizeSP(6, 0, 1, 1);
        this.s.updateAll();
        this.t = this.r.getItem(1);
        this.t.setTextureAllAndMathSizeSP(0, 0, 3, 1);
        this.t.updateAll();
        this.u = this.r.getItem(2);
        this.u.position().spX(125.0f);
        this.u.setTextureAllAndMathSizeSP(7, 0, 1, 1);
        this.u.updateAll();
        this.v = new VButton(3, 64, ItemInfo.APP_VERSION_NAME);
        VButtonItem item = this.v.getItem(0);
        item.position().spX(-125.0f);
        item.setTextureAllAndMathSizeSP(6, 1, 1, 1);
        item.updateAll();
        VButtonItem item2 = this.v.getItem(1);
        item2.setTextureAllAndMathSizeSP(0, 1, 3, 1);
        item2.updateAll();
        VButtonItem item3 = this.v.getItem(2);
        item3.position().spX(125.0f);
        item3.setTextureAllAndMathSizeSP(7, 1, 1, 1);
        item3.updateAll();
        this.v.position().z = 0.0f;
        this.A.addChild(this.v);
        this.A.addChild(this.r);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_music_p1, this.x.get(0));
            a(b.d.widget_preview_music_p2, this.x.get(1));
            a(b.d.widget_preview_music_p3, this.x.get(2));
            a(b.d.widget_preview_music_p4, this.x.get(3));
            a(b.d.widget_preview_music_p5, this.x.get(4));
            a(b.d.widget_preview_music_title, this.w);
            a(b.d.widget_preview_music_control, this.n, this.o, this.p, this.q, this.r, this.v);
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_music_p1) {
            this.b = textureElement;
            return;
        }
        if (i == b.d.widget_preview_music_p2) {
            this.c = textureElement;
            return;
        }
        if (i == b.d.widget_preview_music_p3) {
            this.d = textureElement;
            return;
        }
        if (i == b.d.widget_preview_music_p4) {
            this.e = textureElement;
            return;
        }
        if (i == b.d.widget_preview_music_p5) {
            this.f = textureElement;
        } else if (i == b.d.widget_preview_music_title) {
            this.g = textureElement;
        } else if (i == b.d.widget_preview_music_control) {
            this.h = textureElement;
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        int i = 0;
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.g);
            this.j.deleteTexture(this.b);
            this.j.deleteTexture(this.c);
            this.j.deleteTexture(this.d);
            this.j.deleteTexture(this.e);
            this.j.deleteTexture(this.f);
            this.j.deleteTexture(this.h);
            this.w.textures().removeAll();
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    this.x.get(i2).textures().removeAll();
                    i = i2 + 1;
                } else {
                    this.n.textures().removeAll();
                    this.o.textures().removeAll();
                    this.p.textures().removeAll();
                    this.q.textures().removeAll();
                    this.r.textures().removeAll();
                    this.v.textures().removeAll();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        j();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
        int i = 0;
        e.a("restore");
        VTween.killTween(this.A);
        VTween.killTween(this.z);
        VTween.killTween(this.y);
        VTween.killTween(this.n);
        VTween.killTween(this.A);
        VTween.killTween(this.A);
        VTween.killTween(this);
        this.A.scale().x = this.B;
        this.A.scale().y = this.B;
        this.A.scale().z = this.B;
        this.z.position().y = this.C;
        this.A.rotation().y = -30.0f;
        this.y.visible(true);
        this.n.rotation().x = 180.0f;
        this.o.rotation().x = this.n.rotation().x;
        this.p.rotation().x = this.n.rotation().x;
        this.q.rotation().x = this.n.rotation().x;
        this.y.rotation().x = this.n.rotation().x + 180.0f;
        b(false);
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.x.get(i2);
                vObject3d.rotation().x = (i2 * 15) - 45;
                VTween.killTween(vObject3d);
                i = i2 + 1;
            } else {
                this.w.rotation().x = 15;
                return;
            }
        }
    }
}
