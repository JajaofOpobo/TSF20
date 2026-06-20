package com.tsf.shell.f.e._d.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.f.LabelRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DropIndicatorState extends BaseRenderable {
    private BaseRenderable b;
    private ArrayList<C0092c> c;
    private c d;
    private b e;
    private d f;
    private int h;
    private float a = 0.0f;
    private final int g = 50;

    public static class b {
        public float a;
        public float b;
        public float c;
        public float d;
        public int e;
        public float f;
        public int g = 1;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.e._d.a.DropIndicatorState$c, reason: collision with other inner class name */
    public static class C0092c {
        public int a;
        public int b;
        public a c;
        public ArrayList<C0092c> d;
        public c e;
        public float f;
        public float g;
        public int h;

        public C0092c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
        }

        public boolean b() {
            return true;
        }

        public void a(ArrayList<C0092c> arrayList) {
            this.d = arrayList;
        }

        public boolean c() {
            return this.d != null && this.d.size() > 0;
        }

        public void a(d dVar) {
            if (this.e == null && c()) {
                this.e = new c(dVar);
                b bVar = new DropIndicatorRenderer();
                bVar.a = com.censivn.C3DEngine.b.b.A.a(-130.0f);
                bVar.b = com.censivn.C3DEngine.b.b.A.a(128.0f);
                bVar.c = com.censivn.C3DEngine.b.b.A.a(65.0f);
                bVar.d = com.censivn.C3DEngine.b.b.A.a(120.0f);
                bVar.e = 38;
                bVar.f = com.censivn.C3DEngine.b.b.A.a(54.0f);
                this.e.a(this.d, bVar);
            }
        }
    }

    public DropIndicatorState(d dVar) {
        this.f = dVar;
    }

    public void a(ArrayList<C0092c> arrayList, b bVar) {
        this.e = bVar;
        this.c = arrayList;
        this.b = new BaseRenderable();
        int i = 0;
        Iterator<C0092c> it = this.c.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                final C0092c next = it.next();
                final a aVar = new DropIndicatorContainer(next.a, next.b, bVar);
                com.censivn.C3DEngine.b.d.a aVar2 = new com.censivn.C3DEngine.b.d.a(aVar) { // from class: com.tsf.shell.f.e._d.a.DropIndicatorState.1
                    @Override // com.censivn.C3DEngine.b.d.a
                    public void a(MotionEvent motionEvent) {
                        if (next.c()) {
                            next.a(c.this.f);
                            next.e.removeFromParent();
                            next.e.a();
                            aVar.addChild(next.e);
                            c.this.d = next.e;
                            c.this.a(aVar);
                            c.this.a(next.h, com.censivn.C3DEngine.b.b.A.a(500.0f));
                        } else {
                            c.this.f.d();
                        }
                        next.a();
                    }
                };
                next.c = aVar;
                next.h = i2;
                aVar.setMouseEventListener(aVar2);
                i = i2 + 1;
            } else {
                addChild(this.b);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, float f) {
        int size = this.c.size();
        int i2 = i + 1;
        this.h = i2;
        if (i2 < size) {
            int i3 = 0;
            for (int i4 = size - 1; i4 >= i2; i4--) {
                C0092c c0092c = this.c.get(i4);
                a aVar = c0092c.c;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.f(c0092c.g);
                dVar.h(c0092c.f - f);
                dVar.a(50);
                dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar, VEasing.Linear.easeNone, dVar);
                i3++;
            }
        }
    }

    private void d() {
        int size = this.c.size();
        int i = this.h;
        if (i < size) {
            int i2 = 0;
            for (int i3 = i; i3 < size; i3++) {
                C0092c c0092c = this.c.get(i3);
                a aVar = c0092c.c;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.a(255);
                dVar.b(i2 * 80);
                dVar.f(c0092c.g);
                dVar.h(c0092c.f);
                dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar, VEasing.Linear.easeNone, dVar);
                i2++;
            }
        }
    }

    public void a() {
        for (C0092c c0092c : this.c) {
            c0092c.c.removeFromParent();
            if (c0092c.b()) {
                this.b.addChild(c0092c.c);
            }
        }
        this.a = c();
        C0092c();
        this.b.position().x = 0.0f;
        this.b.position().y = 0.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.b.numChildren()) {
                a aVar = (DropIndicatorContainer) this.b.getChildAt(i2);
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.f(0.0f);
                dVar.a(255);
                dVar.b(i2 * 80);
                dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar, VEasing.Linear.easeNone, dVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public boolean b() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
            C0092c();
            C0092c();
            return false;
        }
        for (int i = 0; i < this.b.numChildren(); i++) {
            final a aVar = (DropIndicatorContainer) this.b.getChildAt(i);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorState.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    aVar.b();
                }
            };
            dVar.f(-this.a);
            dVar.a(0);
            if (i == this.b.numChildren() - 1) {
                dVar.a(new Runnable() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorState.3
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.removeFromParent();
                    }
                });
            }
            com.censivn.C3DEngine.b.g.TweenUtils.a(aVar);
            com.censivn.C3DEngine.b.g.TweenUtils.a(aVar, 500, dVar);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        for (int i = 0; i < this.b.numChildren(); i++) {
            a aVar2 = (DropIndicatorContainer) this.b.getChildAt(i);
            if (aVar2 != aVar) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorState.4
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                    }
                };
                dVar.a(50);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar2);
                com.censivn.C3DEngine.b.g.TweenUtils.a(aVar2, 500, dVar);
                aVar2.mouseEnabled(false);
            } else {
                aVar2.mouseSkip(true);
            }
        }
    }

    private void e() {
        for (int i = 0; i < this.b.numChildren(); i++) {
            a aVar = (DropIndicatorContainer) this.b.getChildAt(i);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._d.a.DropIndicatorState.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                }
            };
            dVar.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(aVar);
            com.censivn.C3DEngine.b.g.TweenUtils.a(aVar, 500, dVar);
            aVar.mouseSkip(false);
            aVar.mouseEnabled(true);
        }
    }

    public float c() {
        if (this.a == 0.0f) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.b.numChildren()) {
                    break;
                }
                float fA = ((DropIndicatorContainer) this.b.getChildAt(i2)).a();
                if (fA > this.a) {
                    this.a = fA;
                }
                i = i2 + 1;
            }
        }
        return this.a;
    }

    private void f() {
        float f = this.e.a;
        float f2 = this.e.b;
        int size = this.c.size();
        float f3 = f;
        for (int i = 0; i < size; i++) {
            C0092c c0092c = this.c.get(i);
            a aVar = c0092c.c;
            aVar.position().y = f3;
            c0092c.f = f3;
            c0092c.g = 0.0f;
            aVar.position().x = -this.a;
            aVar.alpha(0.0f);
            f3 -= f2;
        }
    }

    public static class a extends BaseRenderable {
        int a;
        private LabelRenderable b;
        private GridRenderable c;
        private TextureElement d = new TextureElement(0, false);
        private float e;

        public a(int i, int i2, b bVar) {
            this.a = i2;
            this.c = new GridRenderable(bVar.c, bVar.c, false);
            this.c.position().x = (this.c.b() / 2.0f) + bVar.d;
            this.c.textures().addElement(this.d);
            addChild(this.c);
            this.b = new LabelRenderable();
            this.b.c(i);
            this.b.d(bVar.e);
            this.b.b(1);
            this.b.position().x = this.c.position().x + bVar.f;
            this.b.b();
            addChild(this.b);
            this.e = this.b.position().x + this.b.maxX();
            if (bVar.g == 1) {
                setAABBPX(0.0f, (-bVar.b) / 2.0f, 0.0f, this.e, bVar.b / 2.0f, 0.0f);
            } else {
                this.c.position().x -= this.e / 2.0f;
                this.b.position().x -= this.e / 2.0f;
                setAABBPX((-this.e) / 2.0f, (-bVar.b) / 2.0f, 0.0f, this.e / 2.0f, bVar.b / 2.0f, 0.0f);
            }
            com.tsf.shell.manager.o.ThemeColorConstants.a(this, com.tsf.shell.manager.o.ThemeColorConstants.h);
        }

        public float a() {
            return this.e;
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.d.id == 0) {
                Bitmap bitmapA = x.a(this.a);
                com.censivn.C3DEngine.C3DEngine.g().a(this.d, bitmapA);
                bitmapA.recycle();
            }
        }

        public void b() {
            if (this.d.id != 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.d);
            }
            this.b.a();
        }
    }
}
