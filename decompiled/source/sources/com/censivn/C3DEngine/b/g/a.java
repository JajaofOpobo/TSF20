package com.censivn.C3DEngine.b.g;
/* loaded from: classes.dex */
public class a {
    public static final com.censivn.C3DEngine.b.g.b a = new b.c();
    public static final com.censivn.C3DEngine.b.g.b b = new b.C0032a();
    public static final com.censivn.C3DEngine.b.g.b c = new b.C0033b();
    public static final com.censivn.C3DEngine.b.g.b d = new C0030a.C0031a();
    public static final com.censivn.C3DEngine.b.g.b e = new C0030a.c();
    public static final com.censivn.C3DEngine.b.g.b f = new C0030a.b();
    public static final com.censivn.C3DEngine.b.g.b g = new c.C0034a();
    public static final com.censivn.C3DEngine.b.g.b h = new e.C0036a();
    public static final com.censivn.C3DEngine.b.g.b i = new e.d();
    public static final com.censivn.C3DEngine.b.g.b j = new e.b();
    public static final com.censivn.C3DEngine.b.g.b k = new e.c();
    public static final com.censivn.C3DEngine.b.g.b l = new d.b();
    public static final com.censivn.C3DEngine.b.g.b m = new d.C0035a();
    public static final com.censivn.C3DEngine.b.g.b n = new d.c();
    public static final com.censivn.C3DEngine.b.g.b o = new f();

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: com.censivn.C3DEngine.b.g.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0032a implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return -((float) (Math.sqrt(1.0f - (f * f)) - 1.0d));
            }
        }

        /* loaded from: classes.dex */
        public static class c implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                float f2 = f - 1.0f;
                return (float) Math.sqrt(1.0f - (f2 * f2));
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0033b implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
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

    /* loaded from: classes.dex */
    public static class d {

        /* loaded from: classes.dex */
        public static class c implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return (float) (1.0d - Math.pow(2.0d, (-10.0f) * f));
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0035a implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return (float) (Math.pow(2.0d, 10.0f * (f - 1.0f)) - 0.001d);
            }
        }

        /* loaded from: classes.dex */
        public static class b implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                float f2 = 2.0f * f;
                return (float) (f2 < 1.0f ? Math.pow(2.0d, (f2 - 1.0f) * 10.0f) * 0.5d : (2.0d - Math.pow(2.0d, (f2 - 1.0f) * (-10.0f))) * 0.5d);
            }
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0030a {
        private static float a = 1.70158f;

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0031a implements com.censivn.C3DEngine.b.g.b {
            private float a = C0030a.a;

            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return f * f * (((this.a + 1.0f) * f) - this.a);
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$c */
        /* loaded from: classes.dex */
        public static class c implements com.censivn.C3DEngine.b.g.b {
            private float a = C0030a.a;

            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                float f2 = f - 1.0f;
                return (((f2 * (this.a + 1.0f)) + this.a) * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$a$b */
        /* loaded from: classes.dex */
        public static class b implements com.censivn.C3DEngine.b.g.b {
            private float a = C0030a.a;
            private float b = C0030a.a * 1.525f;

            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                double d;
                float f2 = f * 2.0f;
                if (f2 < 1.0f) {
                    d = ((f2 * (this.b + 1.0f)) - this.b) * f2 * 0.5d * f2;
                } else {
                    float f3 = f2 - 2.0f;
                    d = ((((f3 * (this.b + 1.0f)) + this.b) * f3 * f3) + 2.0f) * 0.5d;
                }
                return (float) d;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: com.censivn.C3DEngine.b.g.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0034a implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
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

    /* loaded from: classes.dex */
    public static class e {

        /* loaded from: classes.dex */
        public static class c implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return f;
            }
        }

        /* renamed from: com.censivn.C3DEngine.b.g.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0036a implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return f;
            }
        }

        /* loaded from: classes.dex */
        public static class d implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return f;
            }
        }

        /* loaded from: classes.dex */
        public static class b implements com.censivn.C3DEngine.b.g.b {
            @Override // com.censivn.C3DEngine.b.g.b
            public float a(float f) {
                return f;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements com.censivn.C3DEngine.b.g.b {
        @Override // com.censivn.C3DEngine.b.g.b
        public float a(float f) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
    }
}
