package com.tsf.shell.f.e.g.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends c {
    private a mTitleContainer = new a() { // from class: com.tsf.shell.f.e.g.a.d.1
        @Override // com.tsf.shell.f.e.g.a.d.a
        public void a() {
            d.this.onRequestExit();
        }
    };

    public void onRequestExit() {
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void recycle() {
        this.mTitleContainer.d();
        super.recycle();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        this.mTitleContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mTitleContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    public void setTitle(int i) {
        this.mTitleContainer.a(i);
    }

    public void setTitle(String str) {
        this.mTitleContainer.a(str);
    }

    public void addIcon(i iVar) {
        this.mTitleContainer.a(iVar);
    }

    public void removeIcon() {
        this.mTitleContainer.b();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getMenuContainer() {
        return this.mTitleContainer;
    }

    class a extends j {
        private TextureElement a = new TextureElement(0, false);
        private k c;
        private i d;
        private m e;

        public a() {
            c();
        }

        public void a() {
        }

        public void a(int i) {
            a(x.c(i));
        }

        public void a(String str) {
            this.e.a(str);
            this.e.b();
            e();
        }

        public void a(i iVar) {
            b();
            this.d = iVar;
            this.d.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(90.0f);
            this.d.removeFromParent();
            addChild(this.d);
            e();
        }

        public void b() {
            if (this.d != null) {
                this.d.removeFromParent();
                this.d = null;
            }
        }

        private void e() {
            if (this.d != null && this.d.parent() == this) {
                this.e.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f) + com.censivn.C3DEngine.b.b.a.a(110.0f);
            } else {
                this.e.position().x = this.c.position().x + com.censivn.C3DEngine.b.b.a.a(12.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f);
            }
            float fA = com.censivn.C3DEngine.b.b.a.a(160.0f);
            setAABBPX(0.0f, (-fA) / 2.0f, 0.0f, this.e.maxX() + this.e.position().x, fA / 2.0f, 0.0f);
        }

        public void c() {
            this.c = new k(com.censivn.C3DEngine.b.b.a.a(24.0f), com.censivn.C3DEngine.b.b.a.a(45.0f), false) { // from class: com.tsf.shell.f.e.g.a.d.a.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    if (a.this.a.id == 0) {
                        Bitmap bitmapA = x.a(b.d.scrollcontainer_arrow);
                        com.censivn.C3DEngine.a.g().a(a.this.a, bitmapA);
                        bitmapA.recycle();
                    }
                }
            };
            this.c.textures().addElement(this.a);
            addChild(this.c);
            this.c.position().x = com.censivn.C3DEngine.b.b.a.a(20.0f) + com.censivn.C3DEngine.b.b.a.a(12.0f);
            this.c.rotation().z = 180.0f;
            this.e = new m();
            this.e.d(42);
            this.e.e(-1);
            this.e.b(1);
            addChild(this.e);
            com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.h);
            b(this);
        }

        public void d() {
            this.e.a();
            com.censivn.C3DEngine.a.g().a(this.a);
        }

        public void b(i iVar) {
            iVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.f.e.g.a.d.a.2
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    a.this.a();
                }
            });
        }
    }
}
