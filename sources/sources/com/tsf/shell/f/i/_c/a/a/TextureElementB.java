package com.tsf.shell.f.i._c.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.f.i._c.a.FolderSceneNodesyncTextureNode;
import java.util.Date;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TextureElementB extends j {
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

    public TextureElementB(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        com.tsf.shell.f.i._c.a.a.TextureElementA.c = context;
        com.tsf.shell.f.i._c.a.a.TextureElementA.a = VInformation.engineDensity();
        com.tsf.shell.f.i._c.a.a.TextureElementA.b = VInformation.Scale();
        com.tsf.shell.f.i._c.a.a.TextureElementA.d = vTextureManager;
        a = this;
        this.b = new VObject3dContainer();
        this.c = new PendingWidgetGroup(this.b);
        this.b.addChild(this.c);
        setAnimationObjectState(true);
        addChild(this.b);
    }

    @Override // com.tsf.shell.f.i._c.a.ITextureCallback
    public void b() {
        this.c.a();
    }

    @Override // com.tsf.shell.f.i._c.a.ITextureCallback
    public void c() {
        this.c.b();
    }

    @Override // com.tsf.shell.f.i._c.a.ITextureCallback
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(DeferredWidgetGroup.d.widget_preview_calendar_main_bg, this.c.d);
            a(DeferredWidgetGroup.d.widget_preview_calendar_point, this.c.c.a);
            a(DeferredWidgetGroup.d.widget_preview_calendar_photo1, this.c.c.b);
            a(DeferredWidgetGroup.d.widget_preview_calendar_photo2, this.c.c.c);
            a(DeferredWidgetGroup.d.widget_preview_calendar_photo3, this.c.c.d);
            a(DeferredWidgetGroup.d.widget_preview_calendar_line, this.c.h);
            a(DeferredWidgetGroup.d.widget_preview_calendar_refresh, this.c.i);
            a(DeferredWidgetGroup.d.widget_preview_calendar_detil_bar, this.c.e);
            this.k.add(new a());
            c(z);
        }
    }

    class a extends j.a {
        a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i._c.a.FolderSceneNodesyncTextureNode.a, com.tsf.shell.f.i._c.a.c
        public Bitmap c() {
                        return DeferredWidgetGroup.this.e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i._c.a.FolderSceneNodesyncTextureNode.a, com.tsf.shell.f.i._c.a.c
        public void a(Bitmap bitmap) {
            DeferredWidgetGroup.this.a(bitmap);
            DeferredWidgetGroup.this.a(this);
        }
    }

    @Override // com.tsf.shell.f.i._c.a.FolderSceneNodesyncTextureNode, com.tsf.shell.f.i._c.a.IAsyncTaskListener
    public void a(int i, TextureElement textureElement) {
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_main_bg) {
            this.d = textureElement;
            return;
        }
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_point) {
            this.e = textureElement;
            return;
        }
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_photo1) {
            this.f = textureElement;
            return;
        }
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_photo2) {
            this.g = textureElement;
            return;
        }
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_photo3) {
            this.h = textureElement;
            return;
        }
        if (i == DeferredWidgetGroup.d.widget_preview_calendar_line) {
            this.m = textureElement;
        } else if (i == DeferredWidgetGroup.d.widget_preview_calendar_refresh) {
            this.n = textureElement;
        } else if (i == DeferredWidgetGroup.d.widget_preview_calendar_detil_bar) {
            this.o = textureElement;
        }
    }

    public Bitmap c() {
                return WidgetGroupBase.a(this.i, new Date());
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.p = this.j.createTexture(bitmap, true);
            this.c.b.textures().addElement(this.p);
            this.c.a.b().a(this.p);
        }
    }

    @Override // com.tsf.shell.f.i._c.a.FolderSceneNodesyncTextureNode, com.tsf.shell.f.i._c.a.ITextureCallback
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
