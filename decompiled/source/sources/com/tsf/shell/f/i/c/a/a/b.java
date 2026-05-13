package com.tsf.shell.f.i.c.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.b;
import com.tsf.shell.f.i.c.a.j;
import java.util.Date;
/* loaded from: classes.dex */
public class b extends j {
    public static b a;
    private VObject3dContainer b;
    private d c;
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
        com.tsf.shell.f.i.c.a.a.a.c = context;
        com.tsf.shell.f.i.c.a.a.a.a = VInformation.engineDensity();
        com.tsf.shell.f.i.c.a.a.a.b = VInformation.Scale();
        com.tsf.shell.f.i.c.a.a.a.d = vTextureManager;
        a = this;
        this.b = new VObject3dContainer();
        this.c = new d(this.b);
        this.b.addChild(this.c);
        setAnimationObjectState(true);
        addChild(this.b);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        this.c.a();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
        this.c.b();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_calendar_main_bg, this.c.d);
            a(b.d.widget_preview_calendar_point, this.c.c.a);
            a(b.d.widget_preview_calendar_photo1, this.c.c.b);
            a(b.d.widget_preview_calendar_photo2, this.c.c.c);
            a(b.d.widget_preview_calendar_photo3, this.c.c.d);
            a(b.d.widget_preview_calendar_line, this.c.h);
            a(b.d.widget_preview_calendar_refresh, this.c.i);
            a(b.d.widget_preview_calendar_detil_bar, this.c.e);
            this.k.add(new a());
            c(z);
        }
    }

    /* loaded from: classes.dex */
    class a extends j.a {
        a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.j.a, com.tsf.shell.f.i.c.a.c
        public Bitmap a(Void... voidArr) {
            return b.this.e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.j.a, com.tsf.shell.f.i.c.a.c
        public void a(Bitmap bitmap) {
            b.this.a(bitmap);
            b.this.a(this);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_calendar_main_bg) {
            this.d = textureElement;
        } else if (i == b.d.widget_preview_calendar_point) {
            this.e = textureElement;
        } else if (i == b.d.widget_preview_calendar_photo1) {
            this.f = textureElement;
        } else if (i == b.d.widget_preview_calendar_photo2) {
            this.g = textureElement;
        } else if (i == b.d.widget_preview_calendar_photo3) {
            this.h = textureElement;
        } else if (i == b.d.widget_preview_calendar_line) {
            this.m = textureElement;
        } else if (i == b.d.widget_preview_calendar_refresh) {
            this.n = textureElement;
        } else if (i == b.d.widget_preview_calendar_detil_bar) {
            this.o = textureElement;
        }
    }

    public Bitmap e() {
        return g.a(this.i, new Date());
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.p = this.j.createTexture(bitmap, true);
            this.c.b.textures().addElement(this.p);
            this.c.a.b().a(this.p);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
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
