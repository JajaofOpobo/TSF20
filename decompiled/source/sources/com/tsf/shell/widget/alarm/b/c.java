package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.b.e;
import com.tsf.shell.widget.alarm.p;
/* loaded from: classes.dex */
public class c extends e {
    public e.a[] a;
    public e.a b;
    public e.a c;

    public c(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.a = new e.a[10];
        for (int i = 0; i < 10; i++) {
            this.a[i] = new e.a(i * 41, 0, 41, 86);
        }
        this.b = new e.a(436, 26, 31, 43);
        this.c = new e.a(410, 0, 26, 86);
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected void a() {
        Bitmap a = p.a(this.i, "digital_clock");
        this.k = this.j.createTexture(a, false);
        a.recycle();
    }

    public Bitmap b() {
        return p.a(this.i, "digital_clock");
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float c() {
        return 470.0f;
    }

    @Override // com.tsf.shell.widget.alarm.b.e
    protected float d() {
        return 86.0f;
    }

    public void a(VRectangle vRectangle, int i) {
        this.a[i].a(vRectangle);
    }
}
