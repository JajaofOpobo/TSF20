package com.tsf.shell.widget.cubeclock.a;

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
import com.tsf.shell.widget.cubeclock.c;
import com.tsf.shell.widget.cubeclock.j;
import com.tsf.shell.widget.cubeclock.o;
import com.tsf.shell.widget.cubeclock.r;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends VObject3dContainer {
    private TextureElement b;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private b g;
    private VObject3d h;
    private VRectangle i;
    private com.tsf.shell.widget.cubeclock.provider.a j;
    private c k;
    private boolean c = false;
    public float a = 1.0f;

    public a(c cVar) {
        this.k = cVar;
        this.j = this.k.q;
        this.k.c.addObject(this);
        visible(false);
        rotation().x = 90.0f;
        e();
        VRectangle vRectangle = new VRectangle(588.0f / this.k.n, 144.0f / this.k.n);
        vRectangle.textures().addElement(this.b);
        vRectangle.position().spY(-125.0f);
        addChild(vRectangle);
        this.g = new b(this.k);
        this.g.position().spX(-20.0f);
        this.g.position().spY(-135.0f);
        addChild(this.g);
        this.h = new VRectangle(49.0f / this.k.n, 49.0f / this.k.n);
        this.h.textures().addElement(this.d);
        this.h.position().spX(185.0f);
        this.h.position().spY(-135.0f);
        this.h.visible(false);
        addChild(this.h);
        this.i = new VRectangle(49.0f / this.k.n, 49.0f / this.k.n);
        this.i.textures().addElement(this.e);
        this.i.position().spX(185.0f);
        this.i.position().spY(-135.0f);
        this.i.visible(false);
        addChild(this.i);
        VRectangle vRectangle2 = new VRectangle(49.0f / this.k.n, 49.0f / this.k.n);
        vRectangle2.textures().addElement(this.f);
        vRectangle2.position().spX(185.0f);
        vRectangle2.position().spY(-135.0f);
        addChild(vRectangle2);
        this.k.c.addObject(this.h);
        this.k.c.addObject(this.i);
        this.k.c.addObject(vRectangle2);
        VMouseEventListener vMouseEventListener = new VMouseEventListener(vRectangle2) { // from class: com.tsf.shell.widget.cubeclock.a.a.1
            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onDown(MotionEvent motionEvent) {
                a.this.k.m.interceptMouseEventLongPressOnTimes();
                a.this.a(true);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                a.this.a(f2);
                a.this.g.a(a.this.a);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onUp(MotionEvent motionEvent) {
                a.this.a(false);
            }
        };
        vRectangle2.calAABB();
        vRectangle2.setMouseEventListener(vMouseEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        this.a += f / 200.0f;
        if (this.a > 1.0f) {
            this.a = 1.0f;
        } else if (this.a < 0.2f) {
            this.a = 0.2f;
        }
        j.a("Brightness:" + this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.h.visible(true);
            this.i.visible(true);
            VTween.killTween(this.h);
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setSPY(-70.0f);
            vTweenParam.setAlpha(255);
            VTween.to(this.h, 300, vTweenParam);
            VTween.killTween(this.i);
            VTweenParam vTweenParam2 = new VTweenParam();
            vTweenParam2.setSPY(-200.0f);
            vTweenParam2.setAlpha(255);
            VTween.to(this.i, 300, vTweenParam2);
            return;
        }
        VTween.killTween(this.h);
        VTween.killTween(this.i);
        VTweenParam vTweenParam3 = new VTweenParam();
        vTweenParam3.setCompleteRunnable(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.this.h.visible(false);
                a.this.i.visible(false);
            }
        });
        vTweenParam3.setSPY(-135.0f);
        vTweenParam3.setAlpha(0);
        VTween.to(this.h, 800, vTweenParam3);
        VTween.to(this.i, 800, vTweenParam3);
    }

    private void e() {
        Bitmap bitmapA = r.a(this.k.a, o.a.cube_clock_widget_setting_bg);
        this.b = this.k.b.createTexture(bitmapA, true);
        bitmapA.recycle();
        Bitmap bitmapA2 = r.a(this.k.a, o.a.cube_clock_plus);
        this.d = this.k.b.createTexture(bitmapA2, true);
        bitmapA2.recycle();
        Bitmap bitmapA3 = r.a(this.k.a, o.a.cube_clock_minus);
        this.e = this.k.b.createTexture(bitmapA3, true);
        bitmapA3.recycle();
        Bitmap bitmapA4 = r.a(this.k.a, o.a.cube_clock_light);
        this.f = this.k.b.createTexture(bitmapA4, true);
        bitmapA4.recycle();
    }

    public void a() {
        if (this.c) {
            c();
        } else {
            b();
        }
    }

    public void b() {
        this.c = true;
        this.k.m.interceptMouseEventScroll(true);
        this.k.j.a(60000);
        VTween.killTween(this);
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setEase(300);
        vTweenParam.setRotationX(0.0f);
        vTweenParam.setAlpha(255);
        VTween.to(this, 1500, vTweenParam);
        visible(true);
        this.k.m.a(true);
    }

    public void c() {
        this.c = false;
        this.k.m.interceptMouseEventScroll(false);
        this.k.j.b(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
        this.k.m.a(false);
        VTween.killTween(this);
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setCompleteRunnable(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.a.3
            @Override // java.lang.Runnable
            public void run() {
                a.this.visible(false);
            }
        });
        vTweenParam.setRotationX(90.0f);
        vTweenParam.setAlpha(0);
        VTween.to(this, VEasing.Linear.easeNone, vTweenParam);
        a(this.g.a());
    }

    private void a(int i) {
        this.j.a = i;
        this.j.b();
    }

    public void d() {
        if (this.c) {
            c();
        }
    }
}
