package com.tsf.shell.widget.cubeclock.p208a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.cubeclock.C4382c;
import com.tsf.shell.widget.cubeclock.C4390j;
import com.tsf.shell.widget.cubeclock.C4395o;
import com.tsf.shell.widget.cubeclock.C4404r;
import com.tsf.shell.widget.cubeclock.provider.C4399a;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.widget.cubeclock.a.a */
/* loaded from: classes.dex */
public class C4374a extends VObject3dContainer {

    /* renamed from: b */
    private TextureElement f14152b;

    /* renamed from: d */
    private TextureElement f14154d;

    /* renamed from: e */
    private TextureElement f14155e;

    /* renamed from: f */
    private TextureElement f14156f;

    /* renamed from: g */
    private C4378b f14157g;

    /* renamed from: h */
    private VObject3d f14158h;

    /* renamed from: i */
    private VRectangle f14159i;

    /* renamed from: j */
    private C4399a f14160j;

    /* renamed from: k */
    private C4382c f14161k;

    /* renamed from: c */
    private boolean f14153c = false;

    /* renamed from: a */
    public float f14151a = 1.0f;

    public C4374a(C4382c c4382c) {
        this.f14161k = c4382c;
        this.f14160j = this.f14161k.f14209q;
        this.f14161k.f14195c.addObject(this);
        visible(false);
        rotation().f2526x = 90.0f;
        m97e();
        VRectangle vRectangle = new VRectangle(588.0f / this.f14161k.f14206n, 144.0f / this.f14161k.f14206n);
        vRectangle.textures().addElement(this.f14152b);
        vRectangle.position().spY(-125.0f);
        addChild(vRectangle);
        this.f14157g = new C4378b(this.f14161k);
        this.f14157g.position().spX(-20.0f);
        this.f14157g.position().spY(-135.0f);
        addChild(this.f14157g);
        this.f14158h = new VRectangle(49.0f / this.f14161k.f14206n, 49.0f / this.f14161k.f14206n);
        this.f14158h.textures().addElement(this.f14154d);
        this.f14158h.position().spX(185.0f);
        this.f14158h.position().spY(-135.0f);
        this.f14158h.visible(false);
        addChild(this.f14158h);
        this.f14159i = new VRectangle(49.0f / this.f14161k.f14206n, 49.0f / this.f14161k.f14206n);
        this.f14159i.textures().addElement(this.f14155e);
        this.f14159i.position().spX(185.0f);
        this.f14159i.position().spY(-135.0f);
        this.f14159i.visible(false);
        addChild(this.f14159i);
        VRectangle vRectangle2 = new VRectangle(49.0f / this.f14161k.f14206n, 49.0f / this.f14161k.f14206n);
        vRectangle2.textures().addElement(this.f14156f);
        vRectangle2.position().spX(185.0f);
        vRectangle2.position().spY(-135.0f);
        addChild(vRectangle2);
        this.f14161k.f14195c.addObject(this.f14158h);
        this.f14161k.f14195c.addObject(this.f14159i);
        this.f14161k.f14195c.addObject(vRectangle2);
        VMouseEventListener vMouseEventListener = new VMouseEventListener(vRectangle2) { // from class: com.tsf.shell.widget.cubeclock.a.a.1
            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onDown(MotionEvent motionEvent) {
                C4374a.this.f14161k.f14205m.interceptMouseEventLongPressOnTimes();
                C4374a.this.m104a(true);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C4374a.this.m109a(f2);
                C4374a.this.f14157g.m95a(C4374a.this.f14151a);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onUp(MotionEvent motionEvent) {
                C4374a.this.m104a(false);
            }
        };
        vRectangle2.calAABB();
        vRectangle2.setMouseEventListener(vMouseEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m109a(float f) {
        this.f14151a += f / 200.0f;
        if (this.f14151a > 1.0f) {
            this.f14151a = 1.0f;
        } else if (this.f14151a < 0.2f) {
            this.f14151a = 0.2f;
        }
        C4390j.m53a("Brightness:" + this.f14151a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m104a(boolean z) {
        if (z) {
            this.f14158h.visible(true);
            this.f14159i.visible(true);
            VTween.killTween(this.f14158h);
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setSPY(-70.0f);
            vTweenParam.setAlpha(255);
            VTween.m10747to(this.f14158h, 300, vTweenParam);
            VTween.killTween(this.f14159i);
            VTweenParam vTweenParam2 = new VTweenParam();
            vTweenParam2.setSPY(-200.0f);
            vTweenParam2.setAlpha(255);
            VTween.m10747to(this.f14159i, 300, vTweenParam2);
            return;
        }
        VTween.killTween(this.f14158h);
        VTween.killTween(this.f14159i);
        VTweenParam vTweenParam3 = new VTweenParam();
        vTweenParam3.setCompleteRunnable(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                C4374a.this.f14158h.visible(false);
                C4374a.this.f14159i.visible(false);
            }
        });
        vTweenParam3.setSPY(-135.0f);
        vTweenParam3.setAlpha(0);
        VTween.m10747to(this.f14158h, 800, vTweenParam3);
        VTween.m10747to(this.f14159i, 800, vTweenParam3);
    }

    /* renamed from: e */
    private void m97e() {
        Bitmap m20a = C4404r.m20a(this.f14161k.f14193a, C4395o.C4396a.cube_clock_widget_setting_bg);
        this.f14152b = this.f14161k.f14194b.createTexture(m20a, true);
        m20a.recycle();
        Bitmap m20a2 = C4404r.m20a(this.f14161k.f14193a, C4395o.C4396a.cube_clock_plus);
        this.f14154d = this.f14161k.f14194b.createTexture(m20a2, true);
        m20a2.recycle();
        Bitmap m20a3 = C4404r.m20a(this.f14161k.f14193a, C4395o.C4396a.cube_clock_minus);
        this.f14155e = this.f14161k.f14194b.createTexture(m20a3, true);
        m20a3.recycle();
        Bitmap m20a4 = C4404r.m20a(this.f14161k.f14193a, C4395o.C4396a.cube_clock_light);
        this.f14156f = this.f14161k.f14194b.createTexture(m20a4, true);
        m20a4.recycle();
    }

    /* renamed from: a */
    public void m110a() {
        if (this.f14153c) {
            m101c();
        } else {
            m103b();
        }
    }

    /* renamed from: b */
    public void m103b() {
        this.f14153c = true;
        this.f14161k.f14205m.interceptMouseEventScroll(true);
        this.f14161k.f14202j.m34a(60000);
        VTween.killTween(this);
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setEase(300);
        vTweenParam.setRotationX(0.0f);
        vTweenParam.setAlpha(255);
        VTween.m10747to(this, 1500, vTweenParam);
        visible(true);
        this.f14161k.f14205m.m80a(true);
    }

    /* renamed from: c */
    public void m101c() {
        this.f14153c = false;
        this.f14161k.f14205m.interceptMouseEventScroll(false);
        this.f14161k.f14202j.m31b(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
        this.f14161k.f14205m.m80a(false);
        VTween.killTween(this);
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setCompleteRunnable(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.a.3
            @Override // java.lang.Runnable
            public void run() {
                C4374a.this.visible(false);
            }
        });
        vTweenParam.setRotationX(90.0f);
        vTweenParam.setAlpha(0);
        VTween.m10747to(this, VEasing.Linear.easeNone, vTweenParam);
        m108a(this.f14157g.m96a());
    }

    /* renamed from: a */
    private void m108a(int i) {
        this.f14160j.f14279a = i;
        this.f14160j.m36b();
    }

    /* renamed from: d */
    public void m99d() {
        if (this.f14153c) {
            m101c();
        }
    }
}
