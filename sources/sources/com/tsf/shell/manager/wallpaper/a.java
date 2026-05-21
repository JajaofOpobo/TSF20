package com.tsf.shell.manager.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.b.c.f;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends VObject3dContainer {
    private C0148a a;
    private b b;

    public a(Context context, float f, float f2) {
        this.a = new C0148a(f, f2);
        this.b = new b(context, f, f2);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        GLES20.glClear(1024);
        GLES20.glEnable(2960);
        GLES20.glStencilFunc(519, 0, -1);
        GLES20.glStencilOp(7682, 7682, 7682);
        this.a.dispatchDraw();
        GLES20.glStencilFunc(514, 1, -1);
        GLES20.glStencilOp(7680, 7680, 7680);
        this.b.dispatchDraw();
        GLES20.glDisable(2960);
    }

    public void a() {
        this.b.a();
    }

    public class b extends VObject3dContainer {
        private Context c;
        private float d;
        private float e;
        private float f;
        private float g;
        private C0149a[] h;
        private VButton i;
        private VButton j;
        private C0149a[] k;
        private C0148a l;
        private TextureElement m;
        private TextureElement n;
        private TextureElement o;
        private boolean p = com.tsf.shell.manager.a.f.f();
        public f a = com.censivn.C3DEngine.a.g();

        public b(Context context, float f, float f2) {
            this.c = context;
            a(f, f2);
            c();
        }

        public void a(float f, float f2) {
            this.d = f;
            this.f = f / 2.0f;
            this.e = f2;
            this.g = f2 / 2.0f;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (!this.p) {
                GLES20.glBlendFunc(1, 32770);
            }
            for (C0149a c0149a : this.h) {
                c0149a.a();
            }
            for (C0149a c0149a2 : this.k) {
                c0149a2.a();
            }
            b();
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (!this.p) {
                GLES20.glBlendFunc(1, 771);
            }
        }

        public void a() {
            if (this.m != null) {
                this.a.a(this.m);
                this.m = null;
            }
            if (this.n != null) {
                this.a.a(this.n);
                this.n = null;
            }
            if (this.o != null) {
                this.a.a(this.o);
                this.o = null;
            }
            this.i.textures().removeAll();
            this.j.textures().removeAll();
            this.l.textures().removeAll();
        }

        public void b() {
            if (this.m == null) {
                Bitmap bitmapA = x.a(this.c, b.d.wallpaper_living_preview_dot);
                this.m = this.a.a(bitmapA, true);
                bitmapA.recycle();
                this.j.textures().addElement(this.m);
                Bitmap bitmapA2 = x.a(this.c, b.d.wallpaper_living_preview_beam);
                this.n = this.a.a(bitmapA2, true);
                bitmapA2.recycle();
                this.i.textures().addElement(this.n);
                Bitmap bitmapA3 = a(x.a(this.c, b.d.wallpaper_living_preview_background), this.d, this.e);
                this.o = this.a.a(bitmapA3, true);
                bitmapA3.recycle();
                this.l.textures().addElement(this.o);
            }
        }

        private Bitmap a(Bitmap bitmap, float f, float f2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            bitmap.recycle();
            return bitmapCreateBitmap;
        }

        private void c() {
            this.l = new C0148a(this.d, this.e);
            addChild(this.l);
            this.h = new C0149a[20];
            this.i = new VButton(20, 100, 100, 100, null, true);
            addChild(this.i);
            for (int i = 0; i < 20; i++) {
                this.h[i] = new C0149a(this.i.getItem(i));
            }
            this.k = new C0149a[10];
            this.j = new VButton(10, 100, 100, 100, null, true);
            addChild(this.j);
            for (int i2 = 0; i2 < 10; i2++) {
                this.k[i2] = new C0149a(this.j.getItem(i2));
            }
        }

        public float a(float f, float f2, boolean z) {
            float fRandom = (float) (((double) f) + (Math.random() * ((double) f2)));
            if (z && Math.random() > 0.5d) {
                return fRandom * (-1.0f);
            }
            return fRandom;
        }

        /* JADX INFO: renamed from: com.tsf.shell.manager.wallpaper.a$b$a, reason: collision with other inner class name */
        public class C0149a {
            float a;
            float b;
            VButtonItem g;
            float c = 0.0f;
            float d = 0.0f;
            float e = 0.0f;
            float f = 0.0f;
            float h = 3.2962964f;
            float i = 50.0f;

            public C0149a(VButtonItem vButtonItem) {
                this.a = 0.0f;
                this.b = 0.0f;
                this.g = vButtonItem;
                this.g.alpha(b.this.a(50.0f, 100.0f, false));
                this.a = b.this.a(-b.this.f, b.this.f, true);
                this.b = b.this.a(-b.this.g, b.this.g, true);
                float fA = b.this.a(0.1f, 0.9f, false);
                this.g.scale().setAll(fA, fA, fA);
                this.g.setTextureAllAndMathSizePX(0, 0, 1, 1);
                this.g.updateAll();
                b();
            }

            private void b() {
                this.e = b.this.a(0.3f, 0.8f, false);
                this.d = this.e / this.h;
            }

            public void a() {
                this.a += this.d;
                this.b += this.e;
                this.g.position().pxX(this.a);
                this.g.position().pxY(this.b);
                this.g.updateAll();
                if (this.a > b.this.f + this.i || this.b > b.this.g + this.i) {
                    this.a = b.this.a(0.0f, (-b.this.d) - this.i, false);
                    this.b = b.this.a((-b.this.g) - this.i, (-b.this.g) - this.i, false);
                    b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.wallpaper.a$a, reason: collision with other inner class name */
    public static class C0148a extends VRectangle {
        private float a;
        private float b;
        private float c;
        private float d;

        public C0148a(float f, float f2) {
            super(f, f2);
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            a(f, f2);
        }

        public void a(float f, float f2) {
            this.a = f2;
            this.b = f;
            this.d = f2 / 2.0f;
            this.c = f / 2.0f;
            point().setPX(0, this.c, -this.d, 0.0f);
            point().setPX(1, -this.c, -this.d, 0.0f);
            point().setPX(2, this.c, this.d, 0.0f);
            point().setPX(3, -this.c, this.d, 0.0f);
            updatePointsVBO();
        }
    }
}
