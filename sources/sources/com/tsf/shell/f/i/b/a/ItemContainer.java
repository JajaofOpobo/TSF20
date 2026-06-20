package com.tsf.shell.f.i.b.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.g.TweenManager;
import com.censivn.C3DEngine.b.g.TweenParams;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemContainer extends BaseRenderable {
    private i d;
    private BaseRenderable e;
    private BaseRenderable f;
    private boolean h;
    private GridRenderable i;
    private com.censivn.C3DEngine.c.PhysicsSystem j;
    private com.censivn.C3DEngine.c.b.SpringPhysicsSystem k;
    private TextureElement l;
    private int m;
    private int n;
    private boolean a = false;
    private TextureElement b = new TextureElement(0, false);
    private TextureElement c = new TextureElement(0, false);
    private int g = 0;
    private int o = 6;

    static /* synthetic */ int c(a aVar) {
        int i = aVar.g;
        aVar.g = i + 1;
        return i;
    }

    public ItemContainer(boolean z) {
        this.h = false;
        this.h = z;
        ItemContainer();
        ItemContainer();
    }

    public void a() {
        this.a = true;
    }

    public void b() {
        this.a = false;
    }

    public void c() {
        this.g = 0;
        d dVar = new d();
        dVar.h(0.0f);
        c.a(this.f);
        c.a(this.f, 250, dVar);
    }

    private void h() {
        System.currentTimeMillis();
        com.censivn.C3DEngine.e.IModelParser bVarA = com.censivn.C3DEngine.e.ModelParserFactory.a(ModelParserFactory.ParserType.MAX_3DS, com.censivn.C3DEngine.C3DEngine.d().getResources(), com.censivn.C3DEngine.a.GestureDetector() + ":raw/widget_airship", true);
        bVarA.c();
        this.d = bVarA.b().getChildAt(0);
        this.d.removeFromParent();
    }

    private void i() {
        float f = 150.0f;
        this.f = new BaseRenderable() { // from class: com.tsf.shell.f.i.b.a.ItemContainer.1
            private double b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (!a.this.a) {
                    position().y = ((float) Math.sin(this.b * ((double) a.this.g))) * 50.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b;
                    a.c(a.this);
                }
            }
        };
        this.e = new BaseRenderable() { // from class: com.tsf.shell.f.i.b.a.ItemContainer.2
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                com.censivn.C3DEngine.C3DEngine.e().c();
                if (!a.this.a && a.this.k != null) {
                    a.this.k.d((float) ((Math.cos(1.0d) * 2.0d) - (Math.random() * 2.0d)));
                    a.this.j.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawEnd() {
                com.censivn.C3DEngine.C3DEngine.e().d();
            }
        };
        this.d.textures().addElement(this.b);
        this.d.scale().setAll(7.0f, 7.0f, 7.0f);
        this.d.rotation().z = 28.0f;
        GridRenderable kVar = new GridRenderable(f, f) { // from class: com.tsf.shell.f.i.b.a.ItemContainer.3
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (!a.this.a) {
                    rotation().z += 25.0f;
                }
            }
        };
        kVar.position().z = -210.0f;
        kVar.textures().addElement(this.c);
        kVar.doubleSidedEnabled(true);
        this.e.addChild(this.d);
        this.f.addChild(kVar);
        this.f.addChild(this.e);
        this.f.rotation().y = 75.0f;
        this.f.scale().setAll(com.censivn.C3DEngine.b.b.ScreenConstants.b * 1.1f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 1.1f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 1.1f);
        addChild(this.f);
        this.f.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.f) { // from class: com.tsf.shell.f.i.b.a.ItemContainer.4
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                a.this.e();
            }
        });
        this.f.setAABBPX((-180.0f) * com.censivn.C3DEngine.b.b.ScreenConstants.b, (-300.0f) * com.censivn.C3DEngine.b.b.ScreenConstants.b, 0.0f, 180.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b, 100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b, 0.0f);
        if (this.h) {
            ItemContainer();
        }
        ItemContainer();
    }

    private void j() {
        this.m = this.o * (this.o + 1);
        this.n = this.m + this.o;
        this.i = new GridRenderable(250.0f, 150.0f, this.o, this.o, false);
        this.i.position().y = -150.0f;
        this.i.position().x = 30.0f;
        this.i.position().z = -10.0f;
        this.i.rotation().y = -90.0f;
        this.i.rotation().z = -2.5f;
        this.i.useVBO(false);
        this.j = new com.censivn.C3DEngine.c.PhysicsSystem(this.i);
        this.k = new com.censivn.C3DEngine.c.b.SpringPhysicsSystem(0.7f, 2.0f);
        this.j.a(this.k);
        this.k.c(-0.3f);
        this.e.addChild(this.i);
        this.e.setAnimationObjectState(true);
        this.e.setHighPriorityAnimationObjectState(false);
        ArrayList<com.censivn.C3DEngine.c.a.a.DampedSpringConstraint> arrayListB = this.k.b();
        com.censivn.C3DEngine.c.a.a.DampedSpringConstraint bVar = arrayListB.get(this.m);
        bVar.d = false;
        bVar.f = false;
        bVar.e = false;
        com.censivn.C3DEngine.c.a.a.DampedSpringConstraint bVar2 = arrayListB.get(this.n);
        bVar2.d = false;
        bVar2.f = false;
        bVar2.e = false;
        a(d());
    }

    public Bitmap c() {
                return null;
    }

    public void e() {
    }

    public void a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = x.a(ItemContainerPageItem.d.widget_airship_flag);
        }
        if (this.l == null) {
            this.l = com.censivn.C3DEngine.C3DEngine.g().a(bitmap, false);
            this.i.textures().addElement(this.l);
        } else {
            com.censivn.C3DEngine.C3DEngine.g().a(this.l, bitmap);
        }
        bitmap.recycle();
    }

    public void f() {
        if (this.b.id == 0) {
            Bitmap bitmapA = x.a(ItemContainerPageItem.d.widget_airship_body);
            com.censivn.C3DEngine.C3DEngine.g().a(this.b, bitmapA);
            bitmapA.recycle();
        }
        if (this.c.id == 0) {
            Bitmap bitmapA2 = x.a(ItemContainerPageItem.d.widget_airship_propeller);
            com.censivn.C3DEngine.C3DEngine.g().a(this.c, bitmapA2);
            bitmapA2.recycle();
        }
    }

    public void g() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.b);
        com.censivn.C3DEngine.C3DEngine.g().a(this.c);
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void destroy() {
        super.destroy();
        com.censivn.C3DEngine.C3DEngine.g().a(this.b);
        com.censivn.C3DEngine.C3DEngine.g().a(this.c);
        com.censivn.C3DEngine.C3DEngine.g().a(this.l);
    }
}
