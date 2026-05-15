package com.tsf.shell.f.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    public TextureElement a;
    public TextureElement b;
    private C0116a c;
    private VRectangle d;

    /* JADX INFO: renamed from: com.tsf.shell.f.i.c.a.a$a, reason: collision with other inner class name */
    public class C0116a extends VRectangle {
        public float a;
        public float b;
        public float c;
        private float e;

        public C0116a(float f, float f2, float f3) {
            super(f, f2);
            this.a = 0.1f;
            this.b = (float) (360.0d * Math.random());
            this.e = 0.0f;
            this.c = 0.0f;
            this.e = f3;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (this.a != 0.0f) {
                this.a = ((float) (((double) this.a) + (Math.sin(Math.toRadians(this.b)) / 5.0d))) * 0.97f;
                this.c = this.b + this.a;
            }
            if (Math.abs(this.c - this.b) > 6.0f) {
                this.b = this.c;
            } else {
                this.b += (this.c - this.b) * 0.9f;
            }
            rotation().z = this.b + 180.0f + this.e;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (Math.abs(this.a) > 0.001f && !com.tsf.shell.f.i.c.a.a.h.e) {
                invalidate();
            }
        }

        public void a() {
            this.a = ((float) ((-10.0d) + (20.0d * Math.random()))) + this.a;
        }
    }

    public a(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        s_();
    }

    public void s_() {
        this.c = new C0116a(256.0f, 256.0f, 0.0f);
        this.c.position().spY(112.0f);
        this.c.moveAllPointsSP(0.0f, -112.0f, 0.0f);
        addChild(this.c);
        this.d = new VRectangle(48.0f, 48.0f, 1, 1);
        this.d.position().spY(112.0f);
        addChild(this.d);
        invalidate();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        this.c.a();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_adornment_texture_default, this.c);
            a(b.d.widget_preview_adornment_texture_thumbtack_hd, this.d);
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_adornment_texture_default) {
            this.a = textureElement;
        } else if (i == b.d.widget_preview_adornment_texture_thumbtack_hd) {
            this.b = textureElement;
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.a);
            this.c.textures().removeAll();
            this.j.deleteTexture(this.b);
            this.d.textures().removeAll();
        }
    }
}
