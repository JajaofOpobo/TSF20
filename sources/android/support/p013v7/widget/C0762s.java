package android.support.p013v7.widget;
/* renamed from: android.support.v7.widget.s */
/* loaded from: classes.dex */
class C0762s {

    /* renamed from: a */
    private int f2177a = 0;

    /* renamed from: b */
    private int f2178b = 0;

    /* renamed from: c */
    private int f2179c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2180d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2181e = 0;

    /* renamed from: f */
    private int f2182f = 0;

    /* renamed from: g */
    private boolean f2183g = false;

    /* renamed from: h */
    private boolean f2184h = false;

    /* renamed from: a */
    public int m11111a() {
        return this.f2177a;
    }

    /* renamed from: b */
    public int m11108b() {
        return this.f2178b;
    }

    /* renamed from: c */
    public int m11106c() {
        return this.f2183g ? this.f2178b : this.f2177a;
    }

    /* renamed from: d */
    public int m11105d() {
        return this.f2183g ? this.f2177a : this.f2178b;
    }

    /* renamed from: a */
    public void m11110a(int i, int i2) {
        this.f2179c = i;
        this.f2180d = i2;
        this.f2184h = true;
        if (this.f2183g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2177a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2178b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2177a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2178b = i2;
        }
    }

    /* renamed from: b */
    public void m11107b(int i, int i2) {
        this.f2184h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2181e = i;
            this.f2177a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2182f = i2;
            this.f2178b = i2;
        }
    }

    /* renamed from: a */
    public void m11109a(boolean z) {
        if (z != this.f2183g) {
            this.f2183g = z;
            if (this.f2184h) {
                if (z) {
                    this.f2177a = this.f2180d != Integer.MIN_VALUE ? this.f2180d : this.f2181e;
                    this.f2178b = this.f2179c != Integer.MIN_VALUE ? this.f2179c : this.f2182f;
                    return;
                }
                this.f2177a = this.f2179c != Integer.MIN_VALUE ? this.f2179c : this.f2181e;
                this.f2178b = this.f2180d != Integer.MIN_VALUE ? this.f2180d : this.f2182f;
                return;
            }
            this.f2177a = this.f2181e;
            this.f2178b = this.f2182f;
        }
    }
}
