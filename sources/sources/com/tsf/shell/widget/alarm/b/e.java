package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class e {
    protected Context i;
    protected VTextureManager j;
    protected TextureElement k;
    protected float l;
    protected float m;
    protected List<TextureElement> n = new ArrayList();

    protected abstract void a();

    protected abstract float c();

    protected abstract float d();

    public e(Context context, VTextureManager vTextureManager) {
        this.i = context;
        this.j = vTextureManager;
        h_();
        e();
        a();
    }

    protected void h_() {
    }

    private void e() {
        this.l = c();
        this.m = d();
    }

    public TextureElement g() {
        return this.k;
    }

    public class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public Uv[] e = new Uv[4];

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            Uv[] uvArr = this.e;
            Uv uv = new Uv();
            uvArr[0] = uv;
            uv.u = (this.a + this.c) / e.this.l;
            uv.v = (this.b + this.d) / e.this.m;
            Uv[] uvArr2 = this.e;
            Uv uv2 = new Uv();
            uvArr2[1] = uv2;
            uv2.u = this.a / e.this.l;
            uv2.v = (this.b + this.d) / e.this.m;
            Uv[] uvArr3 = this.e;
            Uv uv3 = new Uv();
            uvArr3[2] = uv3;
            uv3.u = (this.a + this.c) / e.this.l;
            uv3.v = this.b / e.this.m;
            Uv[] uvArr4 = this.e;
            Uv uv4 = new Uv();
            uvArr4[3] = uv4;
            uv4.u = this.a / e.this.l;
            uv4.v = this.b / e.this.m;
        }

        public void a(VRectangle vRectangle) {
            for (int i = 0; i < 4; i++) {
                vRectangle.uv().set(i, this.e[i]);
            }
        }
    }

    public void h() {
        if (this.k != null) {
            this.n.add(this.k);
        }
    }

    public void i() {
        int i = 0;
        while (!this.n.isEmpty()) {
            this.j.deleteTexture(this.n.remove(0));
            i++;
        }
        i.c("=========TextureItem Recycler : " + i + "=============");
    }
}
