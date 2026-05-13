package com.tsf.shell.preference.p196a.p197a.p198a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.preference.a.a.a.h */
/* loaded from: classes.dex */
public class C4017h extends AbstractC0951f {

    /* renamed from: a */
    private C0984m f13165a;

    /* renamed from: b */
    private C0981k f13166b;

    /* renamed from: d */
    private TextureElement f13167d;

    /* renamed from: e */
    private C0980j f13168e;

    /* renamed from: f */
    private C0980j f13169f;

    public C4017h(String str, float f) {
        this(str, f, C0892a.m10742a(50.0f), C0892a.m10742a(50.0f));
    }

    public C4017h(String str, float f, float f2, float f3) {
        m10628a(1);
        this.f13168e = new C0980j();
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(10.0f);
        c0907b.f2656b = C0892a.m10742a(10.0f);
        c0907b.f2663i = -C0892a.m10742a(30.0f);
        c0907b.f2665k = C0892a.m10742a(50.0f);
        this.f13168e.setLayoutParams(c0907b);
        this.f13166b = C0892a.m10741a(28.0f, 28.0f);
        this.f13167d = new TextureElement(0, false);
        this.f13166b.textures().addElement(this.f13167d);
        this.f13168e.addChild(this.f13166b);
        this.f13165a = new C0984m();
        this.f13165a.m10352b(1);
        this.f13165a.m10355a(str);
        this.f13165a.m10347d(47);
        this.f13168e.addChild(this.f13165a);
        addChild(this.f13168e);
        this.f13169f = new C0980j();
        C0907b c0907b2 = new C0907b();
        c0907b2.f2655a = f2;
        c0907b2.f2656b = f3;
        this.f13169f.setLayoutParams(c0907b2);
        this.f13169f.mouseEnabled(false);
        m891a(f);
        addChild(this.f13169f);
    }

    /* renamed from: a */
    public void m891a(float f) {
        C0907b layoutParams = this.f13169f.getLayoutParams();
        layoutParams.f2663i = (-f) / 2.0f;
        layoutParams.f2665k = f / 2.0f;
        m10615d((int) f);
    }

    /* renamed from: e */
    public C0980j m890e() {
        return this.f13169f;
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f13166b.position().f2526x = ((-i) / 2.0f) + (C0892a.m10742a(28.0f) / 2.0f);
        this.f13165a.position().f2526x = ((-i) / 2.0f) + C0892a.m10742a(48.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        Bitmap m638b = C4181q.m638b(28.0f, -1118482);
        C0853a.m10853g().m10540a(this.f13167d, m638b);
        m638b.recycle();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        this.f13165a.m10358a();
        C0853a.m10853g().m10543a(this.f13167d);
    }
}
