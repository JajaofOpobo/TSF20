package com.censivn.C3DEngine.p031b.p038f;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.f.g */
/* loaded from: classes.dex */
public class C0973g extends C0981k {

    /* renamed from: a */
    private int f2912a;

    /* renamed from: d */
    private TextureElement f2913d;

    public C0973g() {
        super(0.0f, 0.0f, false);
        this.f2913d = new TextureElement(0, false);
        textures().addElement(this.f2913d);
    }

    /* renamed from: a */
    public void m10375a(int i) {
        this.f2912a = i;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f2913d.f2529id == 0) {
            Bitmap m609a = C4189x.m609a(this.f2912a);
            C0853a.m10853g().m10540a(this.f2913d, m609a);
            m609a.recycle();
            mo893a(this.f2913d);
        }
    }

    /* renamed from: a */
    public void mo893a(TextureElement textureElement) {
    }

    /* renamed from: a */
    public void m10376a() {
        if (this.f2913d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f2913d);
        }
    }
}
