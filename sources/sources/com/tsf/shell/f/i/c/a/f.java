package com.tsf.shell.f.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.effects.VEffectsStack;
import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.api.effects.modifiers.VTwist;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends j {
    public TextureElement a;
    public TextureElement b;
    private VRectangle c;
    private VRectangle d;
    private VTwist e;
    private VEffectsStack f;
    private VObject3dContainer g;
    private VValueTweenTarget h;

    public f(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.h = new VValueTweenTarget();
        h();
    }

    private void h() {
        this.g = new VObject3dContainer();
        this.c = new VRectangle(256.0f, 256.0f, 4, 4);
        this.d = new VRectangle(256.0f, 256.0f, 4, 4, true);
        this.d.position().x = -2.0f;
        this.d.visible(false);
        this.g.addChild(this.c);
        this.g.addChild(this.d);
        this.e = new VTwist(0.0f);
        this.e.setCenter(new Vector3(0.0f, -128.0f, 0.0f));
        this.f = new VEffectsStack(this.c);
        this.f.addModifier(this.e);
        addChild(this.g);
    }

    private void i() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setScaleX(1.2f);
        vTweenParam.setScaleY(1.2f);
        vTweenParam.setScaleX(1.2f);
        VTween.to(this.g, 900, vTweenParam);
        this.d.visible(true);
        this.c.rotation().y = 0.0f;
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.1.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        f.this.j();
                    }
                };
                vTweenParam3.setTimeout(1000);
                VTween.killTween(f.this.g);
                VTween.to(f.this.g, 1, vTweenParam3);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                f.this.e();
            }
        };
        vTweenParam2.setEase(VEasing.Back.easeOut);
        vTweenParam2.setRotationY(180.0f);
        VTween.to(this.c, 900, vTweenParam2);
        VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                f.this.e.setAngle((float) (((double) f) * 0.5d));
                f.this.f.apply();
                f.this.c.updatePointsVBO();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                f.this.k();
            }
        };
        vTweenParam3.setEase(VEasing.Linear.easeNone);
        VTween.to(this.h, VEasing.Back.easeIn, vTweenParam3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setScaleX(1.0f);
        vTweenParam.setScaleY(1.0f);
        vTweenParam.setScaleX(1.0f);
        VTween.to(this.g, 1100, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                f.this.d.visible(false);
                f.this.a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                f.this.e();
            }
        };
        vTweenParam2.setEase(VEasing.Back.easeOut);
        vTweenParam2.setRotationY(0.0f);
        VTween.to(this.c, 1100, vTweenParam2);
        VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                f.this.e.setAngle((float) (((double) f) * 0.5d));
                f.this.f.apply();
                f.this.c.updatePointsVBO();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                f.this.k();
            }
        };
        vTweenParam3.setEase(VEasing.Linear.easeNone);
        VTween.to(this.h, 300, vTweenParam3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.5
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                f.this.e.setAngle((float) (((double) (1.0f - f)) * 0.5d));
                f.this.f.apply();
                f.this.c.updatePointsVBO();
            }
        };
        vTweenParam.setEase(VEasing.Linear.easeNone);
        VTween.to(this.h, VEasing.Linear.easeNone, vTweenParam);
    }

    public void e() {
        int size = this.c.point().size();
        for (int i = 0; i < size; i++) {
            this.d.point().setSP(i, this.c.point().getAsNumber3dSP(i));
        }
        this.d.rotation().y = this.c.rotation().y + 180.0f;
        this.d.updatePointsVBO();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        i();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
        VTween.killTween(this.h);
        VTween.killTween(this.c);
        VTween.killTween(this.g);
        this.g.scale().setAll(1.0f, 1.0f, 1.0f);
        this.c.rotation().y = 0.0f;
        this.d.visible(false);
        this.e.setAngle(0.0f);
        this.f.apply();
        this.c.updatePointsVBO();
        e();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_memo_bg_logo, this.c);
            a(b.d.widget_preview_memo_bg, this.d);
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_memo_bg_logo) {
            this.a = textureElement;
        } else if (i == b.d.widget_preview_memo_bg) {
            this.b = textureElement;
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.a);
            this.j.deleteTexture(this.b);
            this.c.textures().removeAll();
            this.d.textures().removeAll();
        }
    }
}
