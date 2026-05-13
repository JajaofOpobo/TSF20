package com.tsf.shell.f.i.c.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class j extends VObject3dContainer implements i, k {
    protected Context i;
    protected VTextureManager j;
    protected ArrayList<a> k = new ArrayList<>();
    protected boolean l = false;
    private boolean a = false;
    private long b = 0;

    public abstract void d();

    public j(VTextureManager vTextureManager, Context context) {
        this.i = context;
        this.j = vTextureManager;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, VObject3d... vObject3dArr) {
        a(this, i, vObject3dArr);
    }

    protected void a(i iVar, int i, VObject3d... vObject3dArr) {
        this.k.add(new a(iVar, i, vObject3dArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(boolean z) {
        if (z) {
            Iterator it = ((ArrayList) this.k.clone()).iterator();
            while (it.hasNext()) {
                ((a) it.next()).e();
            }
            this.k.clear();
            return;
        }
        Iterator<a> it2 = this.k.iterator();
        while (it2.hasNext()) {
            it2.next().b((Object[]) new Void[0]);
        }
    }

    public void a(a aVar) {
        e.a("onTaskFinish:" + aVar);
        this.k.remove(aVar);
        if (this.k.size() == 0) {
            f();
            g();
        }
    }

    public void f() {
    }

    public void g() {
        e.a("-----------Finish Tasks Mission");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public class a extends c<Void, Bitmap> {
        protected int d;
        protected VObject3d[] e;
        protected i f;

        public a() {
        }

        public a(i iVar, int i, VObject3d... vObject3dArr) {
            this.d = i;
            this.e = vObject3dArr;
            e.a("targetObject3d:" + this.e.length);
            this.f = iVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.c
        public Bitmap a(Void... voidArr) {
            return l.a(j.this.i, this.d);
        }

        public void e() {
            a(a(new Void[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.c
        public void a(Bitmap bitmap) {
            TextureElement createTexture = j.this.j.createTexture(bitmap, true);
            for (VObject3d vObject3d : this.e) {
                vObject3d.textures().addElement(createTexture);
            }
            bitmap.recycle();
            this.f.a(this.d, createTexture);
            j.this.a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.f.i.c.a.c
        public void b(Bitmap bitmap) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public void a(int i, TextureElement textureElement) {
    }

    public void a() {
        e.a("animationComplete");
        if (this.a) {
            d();
        }
    }
}
