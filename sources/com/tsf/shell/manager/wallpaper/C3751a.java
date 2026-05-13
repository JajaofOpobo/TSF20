package com.tsf.shell.manager.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.p031b.p035c.C0936f;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.wallpaper.a */
/* loaded from: classes.dex */
public class C3751a extends VObject3dContainer {

    /* renamed from: a */
    private C3752a f12314a;

    /* renamed from: b */
    private C3753b f12315b;

    public C3751a(Context context, float f, float f2) {
        this.f12314a = new C3752a(f, f2);
        this.f12315b = new C3753b(context, f, f2);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        GLES20.glClear(1024);
        GLES20.glEnable(2960);
        GLES20.glStencilFunc(519, 0, -1);
        GLES20.glStencilOp(7682, 7682, 7682);
        this.f12314a.dispatchDraw();
        GLES20.glStencilFunc(514, 1, -1);
        GLES20.glStencilOp(7680, 7680, 7680);
        this.f12315b.dispatchDraw();
        GLES20.glDisable(2960);
    }

    /* renamed from: a */
    public void m1560a() {
        this.f12315b.m1558a();
    }

    /* renamed from: com.tsf.shell.manager.wallpaper.a$b */
    /* loaded from: classes.dex */
    public class C3753b extends VObject3dContainer {

        /* renamed from: c */
        private Context f12322c;

        /* renamed from: d */
        private float f12323d;

        /* renamed from: e */
        private float f12324e;

        /* renamed from: f */
        private float f12325f;

        /* renamed from: g */
        private float f12326g;

        /* renamed from: h */
        private C3754a[] f12327h;

        /* renamed from: i */
        private VButton f12328i;

        /* renamed from: j */
        private VButton f12329j;

        /* renamed from: k */
        private C3754a[] f12330k;

        /* renamed from: l */
        private C3752a f12331l;

        /* renamed from: m */
        private TextureElement f12332m;

        /* renamed from: n */
        private TextureElement f12333n;

        /* renamed from: o */
        private TextureElement f12334o;

        /* renamed from: p */
        private boolean f12335p = C3359a.f11092f.m1581f();

        /* renamed from: a */
        public C0936f f12320a = C0853a.m10853g();

        public C3753b(Context context, float f, float f2) {
            this.f12322c = context;
            m1557a(f, f2);
            m1551c();
        }

        /* renamed from: a */
        public void m1557a(float f, float f2) {
            this.f12323d = f;
            this.f12325f = f / 2.0f;
            this.f12324e = f2;
            this.f12326g = f2 / 2.0f;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (!this.f12335p) {
                GLES20.glBlendFunc(1, 32770);
            }
            for (C3754a c3754a : this.f12327h) {
                c3754a.m1549a();
            }
            for (C3754a c3754a2 : this.f12330k) {
                c3754a2.m1549a();
            }
            m1553b();
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (!this.f12335p) {
                GLES20.glBlendFunc(1, 771);
            }
        }

        /* renamed from: a */
        public void m1558a() {
            if (this.f12332m != null) {
                this.f12320a.m10543a(this.f12332m);
                this.f12332m = null;
            }
            if (this.f12333n != null) {
                this.f12320a.m10543a(this.f12333n);
                this.f12333n = null;
            }
            if (this.f12334o != null) {
                this.f12320a.m10543a(this.f12334o);
                this.f12334o = null;
            }
            this.f12328i.textures().removeAll();
            this.f12329j.textures().removeAll();
            this.f12331l.textures().removeAll();
        }

        /* renamed from: b */
        public void m1553b() {
            if (this.f12332m == null) {
                Bitmap m605a = C4189x.m605a(this.f12322c, C1306b.C1310d.wallpaper_living_preview_dot);
                this.f12332m = this.f12320a.m10544a(m605a, true);
                m605a.recycle();
                this.f12329j.textures().addElement(this.f12332m);
                Bitmap m605a2 = C4189x.m605a(this.f12322c, C1306b.C1310d.wallpaper_living_preview_beam);
                this.f12333n = this.f12320a.m10544a(m605a2, true);
                m605a2.recycle();
                this.f12328i.textures().addElement(this.f12333n);
                Bitmap m1555a = m1555a(C4189x.m605a(this.f12322c, C1306b.C1310d.wallpaper_living_preview_background), this.f12323d, this.f12324e);
                this.f12334o = this.f12320a.m10544a(m1555a, true);
                m1555a.recycle();
                this.f12331l.textures().addElement(this.f12334o);
            }
        }

        /* renamed from: a */
        private Bitmap m1555a(Bitmap bitmap, float f, float f2) {
            Bitmap createBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            bitmap.recycle();
            return createBitmap;
        }

        /* renamed from: c */
        private void m1551c() {
            this.f12331l = new C3752a(this.f12323d, this.f12324e);
            addChild(this.f12331l);
            this.f12327h = new C3754a[20];
            this.f12328i = new VButton(20, 100, 100, 100, null, true);
            addChild(this.f12328i);
            for (int i = 0; i < 20; i++) {
                this.f12327h[i] = new C3754a(this.f12328i.getItem(i));
            }
            this.f12330k = new C3754a[10];
            this.f12329j = new VButton(10, 100, 100, 100, null, true);
            addChild(this.f12329j);
            for (int i2 = 0; i2 < 10; i2++) {
                this.f12330k[i2] = new C3754a(this.f12329j.getItem(i2));
            }
        }

        /* renamed from: a */
        public float m1556a(float f, float f2, boolean z) {
            float random = (float) (f + (Math.random() * f2));
            if (z && Math.random() > 0.5d) {
                return random * (-1.0f);
            }
            return random;
        }

        /* renamed from: com.tsf.shell.manager.wallpaper.a$b$a */
        /* loaded from: classes.dex */
        public class C3754a {

            /* renamed from: a */
            float f12336a;

            /* renamed from: b */
            float f12337b;

            /* renamed from: g */
            VButtonItem f12342g;

            /* renamed from: c */
            float f12338c = 0.0f;

            /* renamed from: d */
            float f12339d = 0.0f;

            /* renamed from: e */
            float f12340e = 0.0f;

            /* renamed from: f */
            float f12341f = 0.0f;

            /* renamed from: h */
            float f12343h = 3.2962964f;

            /* renamed from: i */
            float f12344i = 50.0f;

            public C3754a(VButtonItem vButtonItem) {
                this.f12336a = 0.0f;
                this.f12337b = 0.0f;
                this.f12342g = vButtonItem;
                this.f12342g.alpha(C3753b.this.m1556a(50.0f, 100.0f, false));
                this.f12336a = C3753b.this.m1556a(-C3753b.this.f12325f, C3753b.this.f12325f, true);
                this.f12337b = C3753b.this.m1556a(-C3753b.this.f12326g, C3753b.this.f12326g, true);
                float m1556a = C3753b.this.m1556a(0.1f, 0.9f, false);
                this.f12342g.scale().setAll(m1556a, m1556a, m1556a);
                this.f12342g.setTextureAllAndMathSizePX(0, 0, 1, 1);
                this.f12342g.updateAll();
                m1548b();
            }

            /* renamed from: b */
            private void m1548b() {
                this.f12340e = C3753b.this.m1556a(0.3f, 0.8f, false);
                this.f12339d = this.f12340e / this.f12343h;
            }

            /* renamed from: a */
            public void m1549a() {
                this.f12336a += this.f12339d;
                this.f12337b += this.f12340e;
                this.f12342g.position().pxX(this.f12336a);
                this.f12342g.position().pxY(this.f12337b);
                this.f12342g.updateAll();
                if (this.f12336a > C3753b.this.f12325f + this.f12344i || this.f12337b > C3753b.this.f12326g + this.f12344i) {
                    this.f12336a = C3753b.this.m1556a(0.0f, (-C3753b.this.f12323d) - this.f12344i, false);
                    this.f12337b = C3753b.this.m1556a((-C3753b.this.f12326g) - this.f12344i, (-C3753b.this.f12326g) - this.f12344i, false);
                    m1548b();
                }
            }
        }
    }

    /* renamed from: com.tsf.shell.manager.wallpaper.a$a */
    /* loaded from: classes.dex */
    public static class C3752a extends VRectangle {

        /* renamed from: a */
        private float f12316a;

        /* renamed from: b */
        private float f12317b;

        /* renamed from: c */
        private float f12318c;

        /* renamed from: d */
        private float f12319d;

        public C3752a(float f, float f2) {
            super(f, f2);
            this.f12316a = 0.0f;
            this.f12317b = 0.0f;
            this.f12318c = 0.0f;
            this.f12319d = 0.0f;
            m1559a(f, f2);
        }

        /* renamed from: a */
        public void m1559a(float f, float f2) {
            this.f12316a = f2;
            this.f12317b = f;
            this.f12319d = f2 / 2.0f;
            this.f12318c = f / 2.0f;
            point().setPX(0, this.f12318c, -this.f12319d, 0.0f);
            point().setPX(1, -this.f12318c, -this.f12319d, 0.0f);
            point().setPX(2, this.f12318c, this.f12319d, 0.0f);
            point().setPX(3, -this.f12318c, this.f12319d, 0.0f);
            updatePointsVBO();
        }
    }
}
