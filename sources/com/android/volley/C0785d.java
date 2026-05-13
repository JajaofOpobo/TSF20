package com.android.volley;
/* renamed from: com.android.volley.d */
/* loaded from: classes.dex */
public class C0785d implements InterfaceC0806p {

    /* renamed from: a */
    private int f2265a;

    /* renamed from: b */
    private int f2266b;

    /* renamed from: c */
    private final int f2267c;

    /* renamed from: d */
    private final float f2268d;

    public C0785d() {
        this(2500, 1, 1.0f);
    }

    public C0785d(int i, int i2, float f) {
        this.f2265a = i;
        this.f2267c = i2;
        this.f2268d = f;
    }

    @Override // com.android.volley.InterfaceC0806p
    /* renamed from: a */
    public int mo10996a() {
        return this.f2265a;
    }

    @Override // com.android.volley.InterfaceC0806p
    /* renamed from: b */
    public int mo10994b() {
        return this.f2266b;
    }

    @Override // com.android.volley.InterfaceC0806p
    /* renamed from: a */
    public void mo10995a(C0809s c0809s) {
        this.f2266b++;
        this.f2265a = (int) (this.f2265a + (this.f2265a * this.f2268d));
        if (!m11043c()) {
            throw c0809s;
        }
    }

    /* renamed from: c */
    protected boolean m11043c() {
        return this.f2266b <= this.f2267c;
    }
}
