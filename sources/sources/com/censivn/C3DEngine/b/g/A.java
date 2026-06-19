package com.censivn.C3DEngine.b.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class A {
    public static final A.b a = new b.C();
    public static final A.b b = new b.C0032a();
    public static final A.b c = new b.C0033b();
    public static final A.b d = new C0030a.C0031a();
    public static final A.b e = new C0030a.C();
    public static final A.b f = new C0030a.b();
    public static final A.b g = new c.C0034a();
    public static final A.b h = new e.C0036a();
    public static final A.b i = new e.d();
    public static final A.b j = new e.b();
    public static final A.b k = new e.c();
    public static final A.b l = new d.b();
    public static final A.b m = new d.C0035a();
    public static final A.b n = new d.C();
    public static final A.b o = new f();

    public static interface b {
        float a(float f);

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$b$a, reason: collision with other inner class name */
        public static class C0032a implements A.b {
            @Override // com.censivn.C3DEngine.b.g.A.b
            public float a(float f) {
                return -((float) (Math.sqrt(1.0f - (f * f)) - 1.0d));
            }
        }

        public static class C implements A.b {
            @Override // com.censivn.C3DEngine.b.g.A.b
            public float a(float f) {
                float f2 = f - 1.0f;
                return (float) Math.sqrt(1.0f - (f2 * f2));
            }
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$b$b, reason: collision with other inner class name */
        public static class C0033b implements A.b {
            @Override // com.censivn.C3DEngine.b.g.A.b
            public float a(float f) {
                double dSqrt;
                float f2 = f * 2.0f;
                if (f2 < 1.0f) {
                    dSqrt = (Math.sqrt(1.0f - (f2 * f2)) - 1.0d) * (-0.5d);
                } else {
                    float f3 = f2 - 2.0f;
                    dSqrt = (Math.sqrt(1.0f - (f3 * f3)) + 1.0d) * 0.5d;
                }
                return (float) dSqrt;
            }
        }
    }

    public static class d {

        public static class C implements A.b {
            @Override // A.b
            public float a(float f) {
                return (float) (1.0d - Math.pow(2.0d, (-10.0f) * f));
            }
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$d$a, reason: collision with other inner class name */
        public static class C0035a implements A.b {
            @Override // A.b
            public float a(float f) {
                return (float) (Math.pow(2.0d, 10.0f * (f - 1.0f)) - 0.001d);
            }
        }

        public static class b implements A.b {
            @Override // A.b
            public float a(float f) {
                return (float) (2.0f * f < 1.0f ? Math.pow(2.0d, (f - 1.0f) * 10.0f) * 0.5d : (2.0d - Math.pow(2.0d, (f - 1.0f) * (-10.0f))) * 0.5d);
            }
        }
    }

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$a, reason: collision with other inner class name */
    public static class C0030a {
        private static float a = 1.70158f;

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$a$a, reason: collision with other inner class name */
        public static class C0031a implements A.b {
            private float a = C0030a.a;

            @Override // A.b
            public float a(float f) {
                return f * f * (((this.a + 1.0f) * f) - this.a);
            }
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$a$c */
        public static class C implements A.b {
            private float a = C0030a.a;

            @Override // A.b
            public float a(float f) {
                float f2 = f - 1.0f;
                return (((f2 * (this.a + 1.0f)) + this.a) * f2 * f2) + 1.0f;
            }
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$a$b */
        public static class b implements A.b {
            private float a = C0030a.a;
            private float b = C0030a.a * 1.525f;

            @Override // A.b
            public float a(float f) {
                double d;
                float f2 = f * 2.0f;
                if (f2 < 1.0f) {
                    d = ((double) ((f2 * (this.b + 1.0f)) - this.b)) * ((double) f2) * 0.5d * ((double) f2);
                } else {
                    float f3 = f2 - 2.0f;
                    d = ((double) ((((f3 * (this.b + 1.0f)) + this.b) * f3 * f3) + 2.0f)) * 0.5d;
                }
                return (float) d;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$c$a, reason: collision with other inner class name */
        public static class C0034a implements A.b {
            @Override // A.b
            public float a(float f) {
                float fAsin;
                float f2 = 0.0f;
                if (f == 0.0f) {
                    return 0.0f;
                }
                float f3 = f / 1.0f;
                if (f3 == 1.0f) {
                    return 1.0f;
                }
                float f4 = 0.0f == 0.0f ? 0.3f : 0.0f;
                if (0.0f == 0.0f || 0.0f < 1.0f) {
                    fAsin = f4 / 4.0f;
                    f2 = 1.0f;
                } else {
                    fAsin = (f4 / 3.1415927f) * 2.0f * ((float) Math.asin(1.0f / 0.0f));
                }
                return (float) ((Math.sin(((((double) (f3 - fAsin)) * 3.141592653589793d) * 2.0d) / ((double) f4)) * ((double) f2) * Math.pow(2.0d, (-10.0f) * f3)) + 1.0d);
            }
        }
    }

    public static class e {

        public static class C implements A.b {
            @Override // A.b
            public float a(float f) {
                return f;
            }
        }

        /* JADX INFO: renamed from: com.censivn.C3DEngine.b.g.A$e$a, reason: collision with other inner class name */
        public static class C0036a implements A.b {
            @Override // A.b
            public float a(float f) {
                return f;
            }
        }

        public static class c implements A.b {
            @Override // A.b
            public float a(float f) {
                return f;
            }
        }

        public static class d implements A.b {
            @Override // A.b
            public float a(float f) {
                return f;
            }
        }

        public static class b implements A.b {
            @Override // A.b
            public float a(float f) {
                return f;
            }
        }
    }

    public static class f implements A.b {
        @Override // A.b
        public float a(float f) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
    }
}
