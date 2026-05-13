package com.tsf.shell.p096f.p153i.p161c.p162a;

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
import com.tsf.C1306b;
import java.util.ArrayList;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.f.i.c.a.h */
/* loaded from: classes.dex */
public class C3315h extends AbstractC3322j {

    /* renamed from: A */
    private VObject3dContainer f10928A;

    /* renamed from: B */
    private float f10929B;

    /* renamed from: C */
    private float f10930C;

    /* renamed from: a */
    boolean f10931a;

    /* renamed from: b */
    public TextureElement f10932b;

    /* renamed from: c */
    public TextureElement f10933c;

    /* renamed from: d */
    public TextureElement f10934d;

    /* renamed from: e */
    public TextureElement f10935e;

    /* renamed from: f */
    public TextureElement f10936f;

    /* renamed from: g */
    public TextureElement f10937g;

    /* renamed from: h */
    public TextureElement f10938h;

    /* renamed from: m */
    private final int f10939m;

    /* renamed from: n */
    private VRectangle f10940n;

    /* renamed from: o */
    private VRectangle f10941o;

    /* renamed from: p */
    private VRectangle f10942p;

    /* renamed from: q */
    private VRectangle f10943q;

    /* renamed from: r */
    private VButton f10944r;

    /* renamed from: s */
    private VButtonItem f10945s;

    /* renamed from: t */
    private VButtonItem f10946t;

    /* renamed from: u */
    private VButtonItem f10947u;

    /* renamed from: v */
    private VButton f10948v;

    /* renamed from: w */
    private VRectangle f10949w;

    /* renamed from: x */
    private ArrayList<VObject3d> f10950x;

    /* renamed from: y */
    private VObject3dContainer f10951y;

    /* renamed from: z */
    private VObject3dContainer f10952z;

    public C3315h(VTextureManager vTextureManager, Context context, float f, float f2) {
        super(vTextureManager, context);
        this.f10939m = 1000;
        this.f10929B = 1.0f;
        this.f10930C = 0.0f;
        this.f10931a = false;
        this.f10929B = f;
        this.f10930C = f2;
        m2868e();
    }

    /* renamed from: e */
    private void m2868e() {
        this.f10952z = new VObject3dContainer();
        this.f10928A = new VObject3dContainer();
        m2856m();
        m2857l();
        this.f10952z.addChild(this.f10928A);
        addChild(this.f10952z);
        mo2832c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m2864h() {
        C3296e.m2908a("scaleAndMovePreview");
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3315h.this.m2858k();
            }
        };
        vTweenParam.setScaleX(this.f10929B);
        vTweenParam.setScaleY(this.f10929B);
        vTweenParam.setScaleZ(this.f10929B);
        VTween.m10747to(this.f10928A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam();
        vTweenParam2.setY(this.f10930C);
        VTween.m10747to(this.f10952z, 500, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m2862i() {
        C3296e.m2908a("restoreScaleAndMove");
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.2.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        C3315h.this.m2864h();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.m10747to(C3315h.this, 1, vTweenParam2);
            }
        };
        vTweenParam.setScaleX(1.0f);
        vTweenParam.setScaleY(1.0f);
        vTweenParam.setScaleZ(1.0f);
        VTween.m10747to(this.f10928A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam();
        vTweenParam2.setY(0.0f);
        VTween.m10747to(this.f10952z, VEasing.Linear.easeNone, vTweenParam2);
    }

    /* renamed from: j */
    private void m2860j() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.f10928A);
        VTween.m10747to(this.f10928A, 500, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3315h.this.f10948v.setZOrderOnTop();
                C3315h.this.f10944r.setZOrderOnTop();
                C3315h.this.f10951y.visible(false);
                C3315h.this.m2862i();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3315h.this.f10941o.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10942p.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10943q.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10951y.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x + 180.0f;
                if (f > 0.5f) {
                    C3315h.this.m2871b(true);
                }
            }
        };
        vTweenParam2.setRotationX(0.0f);
        VTween.killTween(this.f10940n);
        VTween.m10747to(this.f10940n, 500, vTweenParam2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.f10950x.get(i2);
                VTweenParam vTweenParam3 = new VTweenParam();
                vTweenParam3.setRotationX(0.0f);
                vTweenParam3.setEase(300);
                vTweenParam3.setTimeout((i2 * 50) + 250);
                VTween.killTween(vObject3d);
                VTween.m10747to(vObject3d, 2000, vTweenParam3);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m2858k() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setRotationY(-30.0f);
        VTween.killTween(this.f10928A);
        VTween.m10747to(this.f10928A, 800, vTweenParam);
        this.f10951y.visible(true);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.h.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3315h.this.mo2855a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3315h.this.f10941o.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10942p.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10943q.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x;
                C3315h.this.f10951y.rotation().f2526x = C3315h.this.f10940n.rotation().f2526x + 180.0f;
                if (f > 0.5f) {
                    C3315h.this.m2871b(false);
                }
            }
        };
        vTweenParam2.setRotationX(180.0f);
        vTweenParam2.setEase(300);
        VTween.killTween(this.f10940n);
        VTween.m10747to(this.f10940n, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.f10950x.get(i2);
                VTweenParam vTweenParam3 = new VTweenParam();
                vTweenParam3.setRotationX((i2 * 15) - 45);
                vTweenParam3.setEase(300);
                vTweenParam3.setTimeout((i2 * 50) + 0);
                VTween.killTween(vObject3d);
                VTween.m10747to(vObject3d, 2000, vTweenParam3);
                i = i2 + 1;
            } else {
                this.f10949w.rotation().f2526x = 15;
                return;
            }
        }
    }

    /* renamed from: b */
    public void m2871b(boolean z) {
        if (z && this.f10931a) {
            this.f10931a = false;
            this.f10942p.setZOrderOnTop();
            this.f10943q.setZOrderOnTop();
            this.f10948v.setZOrderOnTop();
            this.f10944r.setZOrderOnTop();
            this.f10940n.setZOrderOnTop();
            this.f10941o.setZOrderOnTop();
        } else if (!z && !this.f10931a) {
            this.f10931a = true;
            this.f10940n.setZOrderOnTop();
            this.f10941o.setZOrderOnTop();
            this.f10948v.setZOrderOnTop();
            this.f10944r.setZOrderOnTop();
            this.f10942p.setZOrderOnTop();
            this.f10943q.setZOrderOnTop();
        }
    }

    /* renamed from: l */
    private void m2857l() {
        this.f10951y = new VObject3dContainer();
        this.f10951y.rotation().f2526x = 180.0f;
        this.f10949w = new VRectangle(247.5f, 49.0f);
        this.f10949w.moveAllPointsSP(0.0f, 428.0f, 0.0f);
        this.f10949w.position().spY(50.0f);
        this.f10949w.rotation().f2526x = 25.0f;
        this.f10950x = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            VRectangle vRectangle = new VRectangle(400.0f, 400.0f, 1, 1);
            vRectangle.moveAllPointsSP(0.0f, 200.0f, 0.0f);
            vRectangle.position().spY(64.0f);
            this.f10950x.add(vRectangle);
            if (i == 4) {
                this.f10951y.addChild(this.f10949w);
            }
            this.f10951y.addChild(vRectangle);
        }
        this.f10928A.addChild(this.f10951y);
    }

    /* renamed from: m */
    private void m2856m() {
        this.f10940n = new VRectangle(512.0f, 64.0f, 1, 1);
        this.f10940n.doubleSidedEnabled(true);
        this.f10940n.moveAllPointsSP(0.0f, 32, 7);
        this.f10940n.calAABB();
        this.f10940n.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 6, 16, 2);
        this.f10941o = new VRectangle(512.0f, 96.0f, 1, 1);
        this.f10941o.doubleSidedEnabled(true);
        this.f10941o.moveAllPointsSP(0.0f, (-48.0f) + 0, 7);
        this.f10941o.calAABB();
        this.f10941o.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 8, 16, 3);
        this.f10942p = new VRectangle(512.0f, 64.0f, 1, 1);
        this.f10942p.doubleSidedEnabled(true);
        this.f10942p.moveAllPointsSP(0.0f, 32, -7);
        this.f10942p.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 11, 16, 2);
        this.f10943q = new VRectangle(512.0f, 96.0f, 1, 1);
        this.f10943q.doubleSidedEnabled(true);
        this.f10943q.moveAllPointsSP(0.0f, (-48.0f) + 0, -7);
        this.f10943q.setTexturePosition(32, ItemInfo.APP_VERSION_NAME, 0, 13, 16, 3);
        this.f10928A.addChild(this.f10942p);
        this.f10928A.addChild(this.f10943q);
        this.f10928A.addChild(this.f10940n);
        this.f10928A.addChild(this.f10941o);
        this.f10944r = new VButton(3, 64, ItemInfo.APP_VERSION_NAME);
        this.f10944r.position().spZ(10.0f);
        this.f10944r.useVBO(false);
        this.f10945s = this.f10944r.getItem(0);
        this.f10945s.position().spX(-125.0f);
        this.f10945s.setTextureAllAndMathSizeSP(6, 0, 1, 1);
        this.f10945s.updateAll();
        this.f10946t = this.f10944r.getItem(1);
        this.f10946t.setTextureAllAndMathSizeSP(0, 0, 3, 1);
        this.f10946t.updateAll();
        this.f10947u = this.f10944r.getItem(2);
        this.f10947u.position().spX(125.0f);
        this.f10947u.setTextureAllAndMathSizeSP(7, 0, 1, 1);
        this.f10947u.updateAll();
        this.f10948v = new VButton(3, 64, ItemInfo.APP_VERSION_NAME);
        VButtonItem item = this.f10948v.getItem(0);
        item.position().spX(-125.0f);
        item.setTextureAllAndMathSizeSP(6, 1, 1, 1);
        item.updateAll();
        VButtonItem item2 = this.f10948v.getItem(1);
        item2.setTextureAllAndMathSizeSP(0, 1, 3, 1);
        item2.updateAll();
        VButtonItem item3 = this.f10948v.getItem(2);
        item3.position().spX(125.0f);
        item3.setTextureAllAndMathSizeSP(7, 1, 1, 1);
        item3.updateAll();
        this.f10948v.position().f2528z = 0.0f;
        this.f10928A.addChild(this.f10948v);
        this.f10928A.addChild(this.f10944r);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_music_p1, this.f10950x.get(0));
            mo2854a(C1306b.C1310d.widget_preview_music_p2, this.f10950x.get(1));
            mo2854a(C1306b.C1310d.widget_preview_music_p3, this.f10950x.get(2));
            mo2854a(C1306b.C1310d.widget_preview_music_p4, this.f10950x.get(3));
            mo2854a(C1306b.C1310d.widget_preview_music_p5, this.f10950x.get(4));
            mo2854a(C1306b.C1310d.widget_preview_music_title, this.f10949w);
            mo2854a(C1306b.C1310d.widget_preview_music_control, this.f10940n, this.f10941o, this.f10942p, this.f10943q, this.f10944r, this.f10948v);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_music_p1) {
            this.f10932b = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_p2) {
            this.f10933c = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_p3) {
            this.f10934d = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_p4) {
            this.f10935e = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_p5) {
            this.f10936f = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_title) {
            this.f10937g = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_music_control) {
            this.f10938h = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        int i = 0;
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10937g);
            this.f10961j.deleteTexture(this.f10932b);
            this.f10961j.deleteTexture(this.f10933c);
            this.f10961j.deleteTexture(this.f10934d);
            this.f10961j.deleteTexture(this.f10935e);
            this.f10961j.deleteTexture(this.f10936f);
            this.f10961j.deleteTexture(this.f10938h);
            this.f10949w.textures().removeAll();
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    this.f10950x.get(i2).textures().removeAll();
                    i = i2 + 1;
                } else {
                    this.f10940n.textures().removeAll();
                    this.f10941o.textures().removeAll();
                    this.f10942p.textures().removeAll();
                    this.f10943q.textures().removeAll();
                    this.f10944r.textures().removeAll();
                    this.f10948v.textures().removeAll();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        m2860j();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        int i = 0;
        C3296e.m2908a("restore");
        VTween.killTween(this.f10928A);
        VTween.killTween(this.f10952z);
        VTween.killTween(this.f10951y);
        VTween.killTween(this.f10940n);
        VTween.killTween(this.f10928A);
        VTween.killTween(this.f10928A);
        VTween.killTween(this);
        this.f10928A.scale().f2526x = this.f10929B;
        this.f10928A.scale().f2527y = this.f10929B;
        this.f10928A.scale().f2528z = this.f10929B;
        this.f10952z.position().f2527y = this.f10930C;
        this.f10928A.rotation().f2527y = -30.0f;
        this.f10951y.visible(true);
        this.f10940n.rotation().f2526x = 180.0f;
        this.f10941o.rotation().f2526x = this.f10940n.rotation().f2526x;
        this.f10942p.rotation().f2526x = this.f10940n.rotation().f2526x;
        this.f10943q.rotation().f2526x = this.f10940n.rotation().f2526x;
        this.f10951y.rotation().f2526x = this.f10940n.rotation().f2526x + 180.0f;
        m2871b(false);
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                VObject3d vObject3d = this.f10950x.get(i2);
                vObject3d.rotation().f2526x = (i2 * 15) - 45;
                VTween.killTween(vObject3d);
                i = i2 + 1;
            } else {
                this.f10949w.rotation().f2526x = 15;
                return;
            }
        }
    }
}
