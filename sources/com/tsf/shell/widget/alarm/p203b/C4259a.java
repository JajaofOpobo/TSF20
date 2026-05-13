package com.tsf.shell.widget.alarm.p203b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.C4324p;
import com.tsf.shell.widget.alarm.p203b.AbstractC4263e;
/* renamed from: com.tsf.shell.widget.alarm.b.a */
/* loaded from: classes.dex */
public class C4259a extends AbstractC4263e {

    /* renamed from: a */
    public static int f13804a = 198;

    /* renamed from: b */
    public static int f13805b = 69;

    /* renamed from: c */
    public AbstractC4263e.C4264a f13806c;

    /* renamed from: d */
    public AbstractC4263e.C4264a f13807d;

    /* renamed from: e */
    public AbstractC4263e.C4264a f13808e;

    /* renamed from: f */
    public AbstractC4263e.C4264a f13809f;

    /* renamed from: g */
    public AbstractC4263e.C4264a f13810g;

    /* renamed from: h */
    public AbstractC4263e.C4264a f13811h;

    public C4259a(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.f13806c = new AbstractC4263e.C4264a(0, 0, 68, 68);
        this.f13807d = new AbstractC4263e.C4264a(68, 0, 68, 68);
        this.f13808e = new AbstractC4263e.C4264a(172, 35, 25, 31);
        this.f13809f = new AbstractC4263e.C4264a(172, 2, 25, 31);
        this.f13810g = new AbstractC4263e.C4264a(137, 35, 33, 31);
        this.f13811h = new AbstractC4263e.C4264a(137, 2, 33, 31);
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: a */
    protected void mo360a() {
        Bitmap m373b = m373b();
        this.f13825k = this.f13824j.createTexture(m373b, false);
        m373b.recycle();
    }

    /* renamed from: b */
    public Bitmap m373b() {
        return C4324p.m230a(this.f13823i, "alarm_btn");
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: c */
    protected float mo358c() {
        return 198.0f;
    }

    @Override // com.tsf.shell.widget.alarm.p203b.AbstractC4263e
    /* renamed from: d */
    protected float mo357d() {
        return 69.0f;
    }
}
