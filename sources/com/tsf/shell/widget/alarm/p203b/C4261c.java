package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.C4324p;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
/* renamed from: com.tsf.shell.widget.alarm.b.c */
/* loaded from: classes.dex */
public class C4261c extends AbstractC4263e {

    /* renamed from: a */
    public AbstractC4263e.C4264a[] f13816a;

    /* renamed from: b */
    public AbstractC4263e.C4264a f13817b;

    /* renamed from: c */
    public AbstractC4263e.C4264a f13818c;

    public C4261c(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.f13816a = new AbstractC4263e.C4264a[10];
        for (int i = 0; i < 10; i++) {
            this.f13816a[i] = new AbstractC4263e.C4264a(i * 41, 0, 41, 86);
        }
        this.f13817b = new AbstractC4263e.C4264a(436, 26, 31, 43);
        this.f13818c = new AbstractC4263e.C4264a(410, 0, 26, 86);
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: a */
    protected void mo360a() {
        Bitmap m230a = C4324p.m230a(this.f13823i, "digital_clock");
        this.f13825k = this.f13824j.createTexture(m230a, false);
        m230a.recycle();
    }

    /* renamed from: b */
    public Bitmap m368b() {
        return C4324p.m230a(this.f13823i, "digital_clock");
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: c */
    protected float mo358c() {
        return 470.0f;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: d */
    protected float mo357d() {
        return 86.0f;
    }

    /* renamed from: a */
    public void m369a(VRectangle vRectangle, int i) {
        this.f13816a[i].m361a(vRectangle);
    }
}
