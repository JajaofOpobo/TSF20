package com.tsf.shell.p096f.p153i.p161c.p162a.p165c;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j;
/* renamed from: com.tsf.shell.f.i.c.a.c.c */
/* loaded from: classes.dex */
public class C3290c extends AbstractC3322j {

    /* renamed from: a */
    private C3285a f10860a;

    public C3290c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10860a = new C3285a();
        ((C0980j) getVirtualTarget()).addChild(this.f10860a);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        this.f10860a.m2925d();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        this.f10860a.m2928b();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        this.f10860a.m2926c();
    }
}
