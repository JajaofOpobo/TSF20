package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.C4305i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.widget.alarm.b.e */
/* loaded from: classes.dex */
public abstract class AbstractC4263e {

    /* renamed from: i */
    protected Context f13823i;

    /* renamed from: j */
    protected VTextureManager f13824j;

    /* renamed from: k */
    protected TextureElement f13825k;

    /* renamed from: l */
    protected float f13826l;

    /* renamed from: m */
    protected float f13827m;

    /* renamed from: n */
    protected List<TextureElement> f13828n = new ArrayList();

    /* renamed from: a */
    protected abstract void mo360a();

    /* renamed from: c */
    protected abstract float mo358c();

    /* renamed from: d */
    protected abstract float mo357d();

    public AbstractC4263e(Context context, VTextureManager vTextureManager) {
        this.f13823i = context;
        this.f13824j = vTextureManager;
        mo363h_();
        m366e();
        mo360a();
    }

    /* renamed from: h_ */
    protected void mo363h_() {
    }

    /* renamed from: e */
    private void m366e() {
        this.f13826l = mo358c();
        this.f13827m = mo357d();
    }

    /* renamed from: g */
    public TextureElement m365g() {
        return this.f13825k;
    }

    /* renamed from: com.tsf.shell.widget.alarm.b.e$a */
    /* loaded from: classes.dex */
    public class C4264a {

        /* renamed from: a */
        public int f13829a;

        /* renamed from: b */
        public int f13830b;

        /* renamed from: c */
        public int f13831c;

        /* renamed from: d */
        public int f13832d;

        /* renamed from: e */
        public C0879Uv[] f13833e = new C0879Uv[4];

        public C4264a(int i, int i2, int i3, int i4) {
            this.f13829a = i;
            this.f13830b = i2;
            this.f13831c = i3;
            this.f13832d = i4;
            C0879Uv[] c0879UvArr = this.f13833e;
            C0879Uv c0879Uv = new C0879Uv();
            c0879UvArr[0] = c0879Uv;
            c0879Uv.f2530u = (this.f13829a + this.f13831c) / AbstractC4263e.this.f13826l;
            c0879Uv.f2531v = (this.f13830b + this.f13832d) / AbstractC4263e.this.f13827m;
            C0879Uv[] c0879UvArr2 = this.f13833e;
            C0879Uv c0879Uv2 = new C0879Uv();
            c0879UvArr2[1] = c0879Uv2;
            c0879Uv2.f2530u = this.f13829a / AbstractC4263e.this.f13826l;
            c0879Uv2.f2531v = (this.f13830b + this.f13832d) / AbstractC4263e.this.f13827m;
            C0879Uv[] c0879UvArr3 = this.f13833e;
            C0879Uv c0879Uv3 = new C0879Uv();
            c0879UvArr3[2] = c0879Uv3;
            c0879Uv3.f2530u = (this.f13829a + this.f13831c) / AbstractC4263e.this.f13826l;
            c0879Uv3.f2531v = this.f13830b / AbstractC4263e.this.f13827m;
            C0879Uv[] c0879UvArr4 = this.f13833e;
            C0879Uv c0879Uv4 = new C0879Uv();
            c0879UvArr4[3] = c0879Uv4;
            c0879Uv4.f2530u = this.f13829a / AbstractC4263e.this.f13826l;
            c0879Uv4.f2531v = this.f13830b / AbstractC4263e.this.f13827m;
        }

        /* renamed from: a */
        public void m361a(VRectangle vRectangle) {
            for (int i = 0; i < 4; i++) {
                vRectangle.m10748uv().set(i, this.f13833e[i]);
            }
        }
    }

    /* renamed from: h */
    public void m364h() {
        if (this.f13825k != null) {
            this.f13828n.add(this.f13825k);
        }
    }

    /* renamed from: i */
    public void m362i() {
        int i = 0;
        while (!this.f13828n.isEmpty()) {
            this.f13824j.deleteTexture(this.f13828n.remove(0));
            i++;
        }
        C4305i.m259c("=========TextureItem Recycler : " + i + "=============");
    }
}
