package android.support.p013v7.app;
/* renamed from: android.support.v7.app.l */
/* loaded from: classes.dex */
class C0594l {

    /* renamed from: d */
    private static C0594l f1329d;

    /* renamed from: a */
    public long f1330a;

    /* renamed from: b */
    public long f1331b;

    /* renamed from: c */
    public int f1332c;

    C0594l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0594l m11932a() {
        if (f1329d == null) {
            f1329d = new C0594l();
        }
        return f1329d;
    }

    /* renamed from: a */
    public void m11931a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double sin = f2 + (0.03341960161924362d * Math.sin(f2)) + (3.4906598739326E-4d * Math.sin(2.0f * f2)) + (5.236000106378924E-6d * Math.sin(3.0f * f2)) + 1.796593063d + 3.141592653589793d;
        double d3 = (-d2) / 360.0d;
        double sin2 = (Math.sin(f2) * 0.0053d) + d3 + ((float) Math.round((f - 9.0E-4f) - d3)) + 9.0E-4f + ((-0.0069d) * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f1332c = 1;
            this.f1330a = -1L;
            this.f1331b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f1332c = 0;
            this.f1330a = -1L;
            this.f1331b = -1L;
        } else {
            float acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1330a = Math.round((acos + sin2) * 8.64E7d) + 946728000000L;
            this.f1331b = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            if (this.f1331b < j && this.f1330a > j) {
                this.f1332c = 0;
            } else {
                this.f1332c = 1;
            }
        }
    }
}
