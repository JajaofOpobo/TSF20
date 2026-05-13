package com.tsf.shell.widget.alarm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.p205d.C4293d;
import com.tsf.shell.widget.alarm.setting.SettingActivity;
/* renamed from: com.tsf.shell.widget.alarm.q */
/* loaded from: classes.dex */
public class C4329q extends VRectangle {

    /* renamed from: a */
    private TextureElement f14047a;

    /* renamed from: b */
    private Bitmap f14048b;

    /* renamed from: c */
    private final float f14049c;

    /* renamed from: d */
    private final float f14050d;

    /* renamed from: e */
    private Object f14051e;

    public C4329q() {
        super(240.0f, 200.0f);
        this.f14049c = 175.0f;
        this.f14050d = 80.0f;
        this.f14051e = new Object();
        AlarmWidget.m418a(this);
        m217a();
        textures().addElement(this.f14047a);
        position().spY(175.0f);
        position().spZ(80.0f);
        setMouseEventListener(new VMouseEventListener(this) { // from class: com.tsf.shell.widget.alarm.q.1
            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onSingleTapUp(MotionEvent motionEvent) {
                Intent intent = new Intent();
                intent.setClass(AlarmWidget.f13714h, SettingActivity.class);
                intent.setFlags(268435456);
                AlarmWidget.f13714h.startActivity(intent);
            }
        });
        calAABB();
    }

    /* renamed from: a */
    private void m217a() {
        byte[] m297a = C4293d.m297a(AlarmWidget.f13714h, -1);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m297a, 0, m297a.length);
        this.f14047a = AlarmWidget.f13709c.createTexture(decodeByteArray, false);
        decodeByteArray.recycle();
    }

    /* renamed from: a */
    public void m215a(Bitmap bitmap) {
        synchronized (this.f14051e) {
            if (this.f14048b != null) {
                this.f14048b.recycle();
            }
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            bitmap.recycle();
            this.f14048b = copy;
            new C4332b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.q$b */
    /* loaded from: classes.dex */
    public class C4332b extends VTweenParam {

        /* renamed from: a */
        boolean f14056a = false;

        /* renamed from: c */
        private VObject3d f14058c;

        public C4332b(VObject3d vObject3d) {
            this.f14058c = vObject3d;
            VTween.killTween(C4329q.this);
            VTween.m10747to(C4329q.this, 1000, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
            synchronized (C4329q.this.f14051e) {
                if (!C4329q.this.f14048b.isRecycled()) {
                    C4329q.this.textures().removeAll();
                    AlarmWidget.f13709c.deleteTexture(C4329q.this.f14047a);
                    C4329q.this.f14047a = AlarmWidget.f13709c.createTexture(C4329q.this.f14048b, true);
                    C4329q.this.m216a(C4329q.this.f14047a.width, C4329q.this.f14047a.height);
                    C4329q.this.textures().addElement(C4329q.this.f14047a);
                    C4329q.this.f14048b.recycle();
                } else {
                    C4305i.m259c("=========ERROR BITMAP IS RECYCLE=====");
                }
                new C4331a(this.f14058c);
            }
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onUpdate(float f) {
            if (f > 0.5d && !this.f14056a) {
                VObject3dContainer parent = this.f14058c.parent();
                if (parent != null) {
                    parent.removeChild(this.f14058c);
                    parent.addChildAt(this.f14058c, 0);
                }
                this.f14056a = true;
            }
            C4329q.this.position().spZ(((float) Math.cos(f * 3.141592653589793d)) * 80.0f);
            C4329q.this.position().spY((((float) Math.sin(f * 3.141592653589793d * 1.5d)) * 160.0f) + 175.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m216a(float f, float f2) {
        C4305i.m259c("width:" + f + "    height:" + f2);
        float f3 = AlarmWidget.f13713g / 1.2f;
        float f4 = (f / 2.0f) * f3;
        float f5 = f3 * (f2 / 2.0f);
        point().setPX(0, f4, -f5, 0.0f);
        point().setPX(1, -f4, -f5, 0.0f);
        point().setPX(2, f4, f5, 0.0f);
        point().setPX(3, -f4, f5, 0.0f);
        updatePointsVBO();
    }

    /* renamed from: com.tsf.shell.widget.alarm.q$a */
    /* loaded from: classes.dex */
    class C4331a extends VTweenParam {

        /* renamed from: a */
        boolean f14053a = false;

        /* renamed from: c */
        private VObject3d f14055c;

        public C4331a(VObject3d vObject3d) {
            this.f14055c = vObject3d;
            setEase(300);
            VTween.killTween(C4329q.this);
            VTween.m10747to(C4329q.this, 2000, this);
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onComplete() {
        }

        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
        public void onUpdate(float f) {
            if (f > 0.5d && !this.f14053a) {
                this.f14055c.setZOrderOnTop();
                this.f14053a = true;
            }
            float f2 = 1.0f - f;
            float sin = (float) Math.sin(f2 * 3.141592653589793d);
            C4329q.this.position().spZ(((float) Math.cos(f2 * 3.141592653589793d)) * 80.0f);
            C4329q.this.position().spY((sin * 80.0f) + 175.0f);
        }
    }
}
