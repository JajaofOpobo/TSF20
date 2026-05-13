package com.tsf.shell.p096f.p153i.p161c.p162a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.c.a.j */
/* loaded from: classes.dex */
public abstract class AbstractC3322j extends VObject3dContainer implements InterfaceC3321i, InterfaceC3324k {

    /* renamed from: i */
    protected Context f10960i;

    /* renamed from: j */
    protected VTextureManager f10961j;

    /* renamed from: k */
    protected ArrayList<C3323a> f10962k = new ArrayList<>();

    /* renamed from: l */
    protected boolean f10963l = false;

    /* renamed from: a */
    private boolean f10958a = false;

    /* renamed from: b */
    private long f10959b = 0;

    /* renamed from: d */
    public abstract void mo2831d();

    public AbstractC3322j(VTextureManager vTextureManager, Context context) {
        this.f10960i = context;
        this.f10961j = vTextureManager;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2854a(int i, VObject3d... vObject3dArr) {
        m2853a(this, i, vObject3dArr);
    }

    /* renamed from: a */
    protected void m2853a(InterfaceC3321i interfaceC3321i, int i, VObject3d... vObject3dArr) {
        this.f10962k.add(new C3323a(interfaceC3321i, i, vObject3dArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m2851c(boolean z) {
        if (z) {
            Iterator it = ((ArrayList) this.f10962k.clone()).iterator();
            while (it.hasNext()) {
                ((C3323a) it.next()).m2842e();
            }
            this.f10962k.clear();
            return;
        }
        Iterator<C3323a> it2 = this.f10962k.iterator();
        while (it2.hasNext()) {
            it2.next().m2937b((Object[]) new Void[0]);
        }
    }

    /* renamed from: a */
    public void m2852a(C3323a c3323a) {
        C3296e.m2908a("onTaskFinish:" + c3323a);
        this.f10962k.remove(c3323a);
        if (this.f10962k.size() == 0) {
            mo2850f();
            m2849g();
        }
    }

    /* renamed from: f */
    public void mo2850f() {
    }

    /* renamed from: g */
    public void m2849g() {
        C3296e.m2908a("-----------Finish Tasks Mission");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.tsf.shell.f.i.c.a.j$a */
    /* loaded from: classes.dex */
    public class C3323a extends AbstractC3275c<Void, Bitmap> {

        /* renamed from: d */
        protected int f10964d;

        /* renamed from: e */
        protected VObject3d[] f10965e;

        /* renamed from: f */
        protected InterfaceC3321i f10966f;

        public C3323a() {
        }

        public C3323a(InterfaceC3321i interfaceC3321i, int i, VObject3d... vObject3dArr) {
            this.f10964d = i;
            this.f10965e = vObject3dArr;
            C3296e.m2908a("targetObject3d:" + this.f10965e.length);
            this.f10966f = interfaceC3321i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public Bitmap mo2846a(Void... voidArr) {
            return C3325l.m2840a(AbstractC3322j.this.f10960i, this.f10964d);
        }

        /* renamed from: e */
        public void m2842e() {
            mo2847a(mo2846a(new Void[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public void mo2847a(Bitmap bitmap) {
            TextureElement createTexture = AbstractC3322j.this.f10961j.createTexture(bitmap, true);
            for (VObject3d vObject3d : this.f10965e) {
                vObject3d.textures().addElement(createTexture);
            }
            bitmap.recycle();
            this.f10966f.mo2836a(this.f10964d, createTexture);
            AbstractC3322j.this.m2852a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo2843b(Bitmap bitmap) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
    }

    /* renamed from: a */
    public void mo2855a() {
        C3296e.m2908a("animationComplete");
        if (this.f10958a) {
            mo2831d();
        }
    }
}
