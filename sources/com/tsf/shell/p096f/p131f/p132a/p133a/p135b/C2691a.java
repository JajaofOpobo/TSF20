package com.tsf.shell.p096f.p131f.p132a.p133a.p135b;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c;
/* renamed from: com.tsf.shell.f.f.a.a.b.a */
/* loaded from: classes.dex */
public class C2691a extends C2693b {

    /* renamed from: d */
    private static final float f8862d = C0892a.m10742a(70.0f);

    /* renamed from: b */
    private C0981k f8863b;

    /* renamed from: c */
    private TextureElement f8864c;

    /* renamed from: e */
    private int f8865e;

    public C2691a(C2684c c2684c, int i) {
        super(c2684c);
        this.f8864c = new TextureElement(0, false);
        this.f8865e = i;
        this.f8863b = new C0981k(f8862d, f8862d, false) { // from class: com.tsf.shell.f.f.a.a.b.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2691a.this.f8864c.f2529id == 0) {
                    C0853a.m10853g().m10542a(C2691a.this.f8864c, C2691a.this.f8865e);
                }
            }
        };
        this.f8863b.textures().addElement(this.f8864c);
        m4903a(this.f8863b);
    }

    /* renamed from: a */
    public void m4907a() {
        if (this.f8864c.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f8864c);
        }
    }
}
