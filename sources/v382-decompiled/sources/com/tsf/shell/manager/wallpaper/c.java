package com.tsf.shell.manager.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.b.c.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class c extends VObject3dContainer {
    final /* synthetic */ a b;
    private Context c;
    private float d;
    private float e;
    private float f;
    private float g;
    private d[] h;
    private VButton i;
    private VButton j;
    private d[] k;
    private b l;
    private TextureElement m;
    private TextureElement n;
    private TextureElement o;
    private boolean p = com.tsf.shell.manager.a.f.f();
    public m a = com.censivn.C3DEngine.a.g();

    public c(a aVar, Context context, float f, float f2) {
        this.b = aVar;
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
        for (d dVar : this.h) {
            dVar.a();
        }
        for (d dVar2 : this.k) {
            dVar2.a();
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
            Bitmap a = x.a(this.c, R.drawable.wallpaper_living_preview_dot);
            this.m = this.a.a(a, true);
            a.recycle();
            this.j.textures().addElement(this.m);
            Bitmap a2 = x.a(this.c, R.drawable.wallpaper_living_preview_beam);
            this.n = this.a.a(a2, true);
            a2.recycle();
            this.i.textures().addElement(this.n);
            Bitmap a3 = a(x.a(this.c, R.drawable.wallpaper_living_preview_background), this.d, this.e);
            this.o = this.a.a(a3, true);
            a3.recycle();
            this.l.textures().addElement(this.o);
        }
    }

    private Bitmap a(Bitmap bitmap, float f, float f2) {
        Bitmap createBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    private void c() {
        this.l = new b(this.d, this.e);
        addChild(this.l);
        this.h = new d[20];
        this.i = new VButton(20, 100, 100, 100, null, true);
        addChild(this.i);
        for (int i = 0; i < 20; i++) {
            this.h[i] = new d(this, this.i.getItem(i));
        }
        this.k = new d[10];
        this.j = new VButton(10, 100, 100, 100, null, true);
        addChild(this.j);
        for (int i2 = 0; i2 < 10; i2++) {
            this.k[i2] = new d(this, this.j.getItem(i2));
        }
    }

    public float a(float f, float f2, boolean z) {
        float random = (float) (f + (Math.random() * f2));
        if (z && Math.random() > 0.5d) {
            return random * (-1.0f);
        }
        return random;
    }
}
