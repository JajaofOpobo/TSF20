package com.tsf.shell.e.i.c.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.R;
import com.tsf.shell.e.i.c.a.o;
import java.util.Date;

/* loaded from: classes.dex */
public class b extends o {
    public static b a;
    private VObject3dContainer b;
    private h c;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private TextureElement g;
    private TextureElement h;
    private TextureElement m;
    private TextureElement n;
    private TextureElement o;
    private TextureElement p;

    public b(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        a.c = context;
        a.a = VInformation.engineDensity();
        a.b = VInformation.Scale();
        a.d = vTextureManager;
        a = this;
        this.b = new VObject3dContainer();
        this.c = new h(this.b);
        this.b.addChild(this.c);
        setAnimationObjectState(true);
        addChild(this.b);
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
        this.c.a();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
        this.c.b();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_calendar_main_bg, this.c.d);
            a(R.drawable.widget_preview_calendar_point, this.c.c.a);
            a(R.drawable.widget_preview_calendar_photo1, this.c.c.b);
            a(R.drawable.widget_preview_calendar_photo2, this.c.c.c);
            a(R.drawable.widget_preview_calendar_photo3, this.c.c.d);
            a(R.drawable.widget_preview_calendar_line, this.c.h);
            a(R.drawable.widget_preview_calendar_refresh, this.c.i);
            a(R.drawable.widget_preview_calendar_detil_bar, this.c.e);
            this.k.add(new c(this));
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_calendar_main_bg) {
            this.d = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_calendar_point) {
            this.e = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_calendar_photo1) {
            this.f = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_calendar_photo2) {
            this.g = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_calendar_photo3) {
            this.h = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_calendar_line) {
            this.m = textureElement;
        } else if (i == R.drawable.widget_preview_calendar_refresh) {
            this.n = textureElement;
        } else if (i == R.drawable.widget_preview_calendar_detil_bar) {
            this.o = textureElement;
        }
    }

    public Bitmap e() {
        return l.a(this.i, new Date());
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.p = this.j.createTexture(bitmap, true);
            this.c.b.textures().addElement(this.p);
            this.c.a.b().a(this.p);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.d);
            this.j.deleteTexture(this.e);
            this.j.deleteTexture(this.f);
            this.j.deleteTexture(this.g);
            this.j.deleteTexture(this.h);
            this.j.deleteTexture(this.m);
            this.j.deleteTexture(this.n);
            this.j.deleteTexture(this.o);
            this.j.deleteTexture(this.p);
            this.c.c();
        }
    }
}
