package com.tsf.shell.preference.p196a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.preference.a.b */
/* loaded from: classes.dex */
public class C4077b extends AbstractC0951f {

    /* renamed from: a */
    private C0984m f13280a;

    /* renamed from: b */
    private C0981k f13281b;

    /* renamed from: d */
    private TextureElement f13282d;

    /* renamed from: e */
    private C0980j f13283e;

    /* renamed from: f */
    private C0980j f13284f;

    public C4077b(float f) {
        m10615d((int) f);
        m10628a(1);
        this.f13283e = new C0980j();
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(10.0f);
        c0907b.f2656b = C0892a.m10742a(20.0f);
        c0907b.f2663i = -28.5f;
        c0907b.f2665k = 28.5f;
        this.f13283e.setLayoutParams(c0907b);
        this.f13281b = C0892a.m10741a(57.0f, 57.0f);
        this.f13282d = new TextureElement(0, false);
        this.f13281b.textures().addElement(this.f13282d);
        this.f13283e.addChild(this.f13281b);
        this.f13280a = new C0984m();
        this.f13280a.m10352b(1);
        this.f13280a.m10349c(C1306b.C1315i.text_demo);
        this.f13280a.m10347d(50);
        this.f13283e.addChild(this.f13280a);
        addChild(this.f13283e);
        this.f13284f = new C0980j();
        C0907b c0907b2 = new C0907b();
        c0907b2.f2655a = C0892a.m10742a(20.0f);
        c0907b2.f2656b = C0892a.m10742a(20.0f);
        c0907b2.f2663i = -C0892a.m10742a(f / 2.0f);
        c0907b2.f2665k = C0892a.m10742a(f / 2.0f);
        this.f13284f.setLayoutParams(c0907b2);
        this.f13284f.mouseEnabled(false);
        addChild(this.f13284f);
    }

    /* renamed from: e */
    public C0980j m818e() {
        return this.f13284f;
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f13281b.position().f2526x = ((-i) / 2.0f) + (C0892a.m10742a(57.0f) / 2.0f);
        this.f13280a.position().f2526x = ((-i) / 2.0f) + C0892a.m10742a(77.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        Bitmap m608a = C4189x.m608a(C1306b.C1310d.preference_video_ico, C0892a.m10742a(57.0f), C0892a.m10742a(57.0f));
        C0853a.m10853g().m10540a(this.f13282d, m608a);
        m608a.recycle();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        this.f13280a.m10358a();
        C0853a.m10853g().m10543a(this.f13282d);
    }
}
