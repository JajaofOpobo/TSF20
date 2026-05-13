package com.censivn.C3DEngine.p031b.p041g;
/* renamed from: com.censivn.C3DEngine.b.g.a */
/* loaded from: classes.dex */
public class C0986a {

    /* renamed from: a */
    public static final InterfaceC1011b f2946a = new C0991b.C0994c();

    /* renamed from: b */
    public static final InterfaceC1011b f2947b = new C0991b.C0992a();

    /* renamed from: c */
    public static final InterfaceC1011b f2948c = new C0991b.C0993b();

    /* renamed from: d */
    public static final InterfaceC1011b f2949d = new C0987a.C0988a();

    /* renamed from: e */
    public static final InterfaceC1011b f2950e = new C0987a.C0990c();

    /* renamed from: f */
    public static final InterfaceC1011b f2951f = new C0987a.C0989b();

    /* renamed from: g */
    public static final InterfaceC1011b f2952g = new C0995c.C0996a();

    /* renamed from: h */
    public static final InterfaceC1011b f2953h = new C1001e.C1002a();

    /* renamed from: i */
    public static final InterfaceC1011b f2954i = new C1001e.C1005d();

    /* renamed from: j */
    public static final InterfaceC1011b f2955j = new C1001e.C1003b();

    /* renamed from: k */
    public static final InterfaceC1011b f2956k = new C1001e.C1004c();

    /* renamed from: l */
    public static final InterfaceC1011b f2957l = new C0997d.C0999b();

    /* renamed from: m */
    public static final InterfaceC1011b f2958m = new C0997d.C0998a();

    /* renamed from: n */
    public static final InterfaceC1011b f2959n = new C0997d.C1000c();

    /* renamed from: o */
    public static final InterfaceC1011b f2960o = new C1006f();

    /* renamed from: com.censivn.C3DEngine.b.g.a$b */
    /* loaded from: classes.dex */
    public static class C0991b {

        /* renamed from: com.censivn.C3DEngine.b.g.a$b$a */
        /* loaded from: classes.dex */
        public static class C0992a implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return -((float) (Math.sqrt(1.0f - (f * f)) - 1.0d));
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$b$c */
        /* loaded from: classes.dex */
        public static class C0994c implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                float f2 = f - 1.0f;
                return (float) Math.sqrt(1.0f - (f2 * f2));
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$b$b */
        /* loaded from: classes.dex */
        public static class C0993b implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                double sqrt;
                float f2 = f * 2.0f;
                if (f2 < 1.0f) {
                    sqrt = (Math.sqrt(1.0f - (f2 * f2)) - 1.0d) * (-0.5d);
                } else {
                    float f3 = f2 - 2.0f;
                    sqrt = (Math.sqrt(1.0f - (f3 * f3)) + 1.0d) * 0.5d;
                }
                return (float) sqrt;
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$d */
    /* loaded from: classes.dex */
    public static class C0997d {

        /* renamed from: com.censivn.C3DEngine.b.g.a$d$c */
        /* loaded from: classes.dex */
        public static class C1000c implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return (float) (1.0d - Math.pow(2.0d, (-10.0f) * f));
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$d$a */
        /* loaded from: classes.dex */
        public static class C0998a implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return (float) (Math.pow(2.0d, 10.0f * (f - 1.0f)) - 0.001d);
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$d$b */
        /* loaded from: classes.dex */
        public static class C0999b implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                float f2 = 2.0f * f;
                return (float) (f2 < 1.0f ? Math.pow(2.0d, (f2 - 1.0f) * 10.0f) * 0.5d : (2.0d - Math.pow(2.0d, (f2 - 1.0f) * (-10.0f))) * 0.5d);
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$a */
    /* loaded from: classes.dex */
    public static class C0987a {

        /* renamed from: a */
        private static float f2961a = 1.70158f;

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$a */
        /* loaded from: classes.dex */
        public static class C0988a implements InterfaceC1011b {

            /* renamed from: a */
            private float f2962a = C0987a.f2961a;

            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return f * f * (((this.f2962a + 1.0f) * f) - this.f2962a);
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$c */
        /* loaded from: classes.dex */
        public static class C0990c implements InterfaceC1011b {

            /* renamed from: a */
            private float f2965a = C0987a.f2961a;

            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                float f2 = f - 1.0f;
                return (((f2 * (this.f2965a + 1.0f)) + this.f2965a) * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$b */
        /* loaded from: classes.dex */
        public static class C0989b implements InterfaceC1011b {

            /* renamed from: a */
            private float f2963a = C0987a.f2961a;

            /* renamed from: b */
            private float f2964b = C0987a.f2961a * 1.525f;

            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                double d;
                float f2 = f * 2.0f;
                if (f2 < 1.0f) {
                    d = ((f2 * (this.f2964b + 1.0f)) - this.f2964b) * f2 * 0.5d * f2;
                } else {
                    float f3 = f2 - 2.0f;
                    d = ((((f3 * (this.f2964b + 1.0f)) + this.f2964b) * f3 * f3) + 2.0f) * 0.5d;
                }
                return (float) d;
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$c */
    /* loaded from: classes.dex */
    public static class C0995c {

        /* renamed from: com.censivn.C3DEngine.b.g.a$c$a */
        /* loaded from: classes.dex */
        public static class C0996a implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                float f2;
                float f3;
                float f4 = 0.0f;
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f / 1.0f == 1.0f) {
                    return 1.0f;
                }
                float f5 = 0.0f == 0.0f ? 0.3f : 0.0f;
                if (0.0f == 0.0f || 0.0f < 1.0f) {
                    f3 = f5 / 4.0f;
                    f4 = 1.0f;
                } else {
                    f3 = (f5 / 3.1415927f) * 2.0f * ((float) Math.asin(1.0f / 0.0f));
                }
                return (float) ((Math.sin((((f2 - f3) * 3.141592653589793d) * 2.0d) / f5) * f4 * Math.pow(2.0d, (-10.0f) * f2)) + 1.0d);
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$e */
    /* loaded from: classes.dex */
    public static class C1001e {

        /* renamed from: com.censivn.C3DEngine.b.g.a$e$c */
        /* loaded from: classes.dex */
        public static class C1004c implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$e$a */
        /* loaded from: classes.dex */
        public static class C1002a implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$e$d */
        /* loaded from: classes.dex */
        public static class C1005d implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$e$b */
        /* loaded from: classes.dex */
        public static class C1003b implements InterfaceC1011b {
            @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
            /* renamed from: a */
            public float mo10331a(float f) {
                return f;
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$f */
    /* loaded from: classes.dex */
    public static class C1006f implements InterfaceC1011b {
        @Override // com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b
        /* renamed from: a */
        public float mo10331a(float f) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
    }
}
