package com.tsf.shell.f.i.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PendingItemGroup extends ItemGroupBase {
    private BaseRenderable k;
    private GridRenderable l;
    private GridRenderable m;
    private GridRenderable n;
    private GridRenderable o;
    private TextureElement p = new TextureElement(0, false);
    private TextureElement q = new TextureElement(0, false);
    private TextureElement r = new TextureElement(0, false);

    public PendingItemGroup() {
        b(true);
    }

    @Override // com.tsf.shell.f.i.c.ItemGroupBase, com.tsf.shell.f.i.c.ItemLabelProvider
    public void b() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.p);
        com.censivn.C3DEngine.C3DEngine.g().a(this.q);
        com.censivn.C3DEngine.C3DEngine.g().a(this.r);
    }

    private void p() {
        if (this.p.id == 0) {
            Bitmap bitmapA = x.a(DeferredItemGroup.d.cloud2);
            com.censivn.C3DEngine.C3DEngine.g().a(this.p, bitmapA);
            bitmapA.recycle();
            Bitmap bitmapA2 = x.a(DeferredItemGroup.d.animals4);
            com.censivn.C3DEngine.C3DEngine.g().a(this.r, bitmapA2);
            bitmapA2.recycle();
            Bitmap bitmapA3 = x.a(DeferredItemGroup.d.animals3);
            com.censivn.C3DEngine.C3DEngine.g().a(this.q, bitmapA3);
            bitmapA3.recycle();
        }
    }

    @Override // com.tsf.shell.f.i.c.ItemGroupBase
    public i a(boolean z) {
        if (this.k == null) {
            this.k = q();
        } else {
            PendingItemGroup();
        }
        return this.k;
    }

    private BaseRenderable q() {
        PendingItemGroup();
        j jVar = new BaseRenderable();
        this.l = new GridRenderable(242.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 150.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, false) { // from class: com.tsf.shell.f.i.c.PendingItemGroup.1
            float a = 30.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
            int d = 10;
            double e = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                position().y = this.a + (((float) Math.sin(this.e * ((double) this.d))) * 10.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
                this.d++;
            }
        };
        this.m = new AnimatedItemGroup(com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 200.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 3.0f, true, true);
        this.m.position().z = 100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
        this.n = new AnimatedItemGroup(com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 180.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 3.0f, false, true);
        this.n.position().z = (-100.0f) * com.censivn.C3DEngine.b.b.ScreenConstants.c;
        this.o = new AnimatedItemGroup(com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 54.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 70.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 0.4f, true, false);
        this.o.position().y = (-100.0f) * com.censivn.C3DEngine.b.b.ScreenConstants.c;
        this.l.textures().addElement(this.p);
        this.m.textures().addElement(this.q);
        this.n.textures().addElement(this.q);
        this.o.textures().addElement(this.r);
        jVar.addChild(this.n);
        jVar.addChild(this.l);
        jVar.addChild(this.m);
        jVar.addChild(this.o);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        iVar.doubleSidedEnabled(true);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        if (iVar.rotation().y == 0.0f) {
            dVar.d(180.0f);
        } else {
            dVar.d(0.0f);
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(iVar, 300, dVar);
    }

    class a extends GridRenderable {
        float a;
        int d;
        double e;
        float f;
        float g;
        boolean h;
        boolean i;
        float j;

        public a(float f, float f2, float f3, float f4, boolean z, boolean z2) {
            super(f, f2, false);
            this.a = 30.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
            this.d = 10;
            this.e = 0.017453292519943295d;
            this.h = true;
            this.i = false;
            this.i = z2;
            this.h = z;
            this.j = f4;
            this.f = f3;
            this.g = -f3;
            doubleSidedEnabled(true);
            if (z) {
                position().x = this.g;
                this.d = 90;
            } else {
                position().x = this.f;
                rotation().y = 180.0f;
                this.d = 180;
            }
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.i) {
                position().y = this.a + (((float) Math.sin(this.e * ((double) this.d))) * 30.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
                this.d += 2;
            }
            if (this.h) {
                position().x += this.j;
                if (position().x > this.f) {
                    PendingItemGroup.this.a(this);
                    this.h = false;
                    return;
                }
                return;
            }
            position().x -= this.j;
            if (position().x < this.g) {
                PendingItemGroup.this.a(this);
                this.h = true;
            }
        }
    }
}
