package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.h.a.a.a.f */
/* loaded from: classes.dex */
public class C3056f extends C0981k {

    /* renamed from: a */
    private TextureElement f9920a;

    public C3056f(float f, float f2) {
        super(f, f2, false);
        this.f9920a = new TextureElement(0, false);
        textures().addElement(this.f9920a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        Bitmap mo3707a;
        if (this.f9920a.f2529id == 0 && (mo3707a = mo3707a()) != null) {
            C0853a.m10853g().m10540a(this.f9920a, mo3707a);
            mo3707a.recycle();
        }
    }

    /* renamed from: a */
    public Bitmap mo3707a() {
        return null;
    }

    /* renamed from: d */
    public void m3706d() {
        C0853a.m10853g().m10543a(this.f9920a);
    }
}
