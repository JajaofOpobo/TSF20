package com.flurry.a.b.a.d.b.b;

import java.util.Date;

/* loaded from: classes.dex */
public abstract class ap extends com.flurry.a.b.a.d.w {
    protected final Class q;

    protected ap(Class cls) {
        this.q = cls;
    }

    protected ap(com.flurry.a.b.a.g.a aVar) {
        this.q = aVar == null ? null : aVar.p();
    }

    public final Class d() {
        return this.q;
    }

    @Override // com.flurry.a.b.a.d.w
    public Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.d(jVar, pVar);
    }

    protected final boolean d(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_TRUE) {
            return true;
        }
        if (e != com.flurry.a.b.a.o.VALUE_FALSE && e != com.flurry.a.b.a.o.VALUE_NULL) {
            if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
                if (jVar.q() == com.flurry.a.b.a.l.INT) {
                    return jVar.t() != 0;
                }
                return a(jVar);
            }
            if (e == com.flurry.a.b.a.o.VALUE_STRING) {
                String trim = jVar.k().trim();
                if ("true".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || trim.length() == 0) {
                    return Boolean.FALSE.booleanValue();
                }
                throw pVar.b(this.q, "only \"true\" or \"false\" recognized");
            }
            throw pVar.a(this.q, e);
        }
        return false;
    }

    protected final Boolean e(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (e == com.flurry.a.b.a.o.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
            if (jVar.q() == com.flurry.a.b.a.l.INT) {
                return jVar.t() == 0 ? Boolean.FALSE : Boolean.TRUE;
            }
            return Boolean.valueOf(a(jVar));
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Boolean) b();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if ("true".equals(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equals(trim)) {
                return Boolean.FALSE;
            }
            if (trim.length() == 0) {
                return (Boolean) b();
            }
            throw pVar.b(this.q, "only \"true\" or \"false\" recognized");
        }
        throw pVar.a(this.q, e);
    }

    private static boolean a(com.flurry.a.b.a.j jVar) {
        if (jVar.q() == com.flurry.a.b.a.l.LONG) {
            return (jVar.u() == 0 ? Boolean.FALSE : Boolean.TRUE).booleanValue();
        }
        String k = jVar.k();
        if ("0.0".equals(k) || "0".equals(k)) {
            return Boolean.FALSE.booleanValue();
        }
        return Boolean.TRUE.booleanValue();
    }

    protected final Byte f(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Byte valueOf;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Byte.valueOf(jVar.r());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            try {
                if (trim.length() == 0) {
                    valueOf = (Byte) b();
                } else {
                    int a = com.flurry.a.b.a.c.e.a(trim);
                    if (a < -128 || a > 127) {
                        throw pVar.b(this.q, "overflow, value can not be represented as 8-bit value");
                    }
                    valueOf = Byte.valueOf((byte) a);
                }
                return valueOf;
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Byte value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Byte) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final Short g(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Short valueOf;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Short.valueOf(jVar.s());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            try {
                if (trim.length() == 0) {
                    valueOf = (Short) b();
                } else {
                    int a = com.flurry.a.b.a.c.e.a(trim);
                    if (a < -32768 || a > 32767) {
                        throw pVar.b(this.q, "overflow, value can not be represented as 16-bit value");
                    }
                    valueOf = Short.valueOf((short) a);
                }
                return valueOf;
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Short value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Short) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final short h(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i = i(jVar, pVar);
        if (i < -32768 || i > 32767) {
            throw pVar.b(this.q, "overflow, value can not be represented as 16-bit value");
        }
        return (short) i;
    }

    protected final int i(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.t();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            try {
                int length = trim.length();
                if (length > 9) {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong < -2147483648L || parseLong > 2147483647L) {
                        throw pVar.b(this.q, "Overflow: numeric value (" + trim + ") out of range of int (-2147483648 - 2147483647)");
                    }
                    return (int) parseLong;
                }
                if (length != 0) {
                    return com.flurry.a.b.a.c.e.a(trim);
                }
                return 0;
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid int value");
            }
        }
        if (e != com.flurry.a.b.a.o.VALUE_NULL) {
            throw pVar.a(this.q, e);
        }
        return 0;
    }

    protected final Integer j(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Integer.valueOf(jVar.t());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            try {
                int length = trim.length();
                if (length > 9) {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong < -2147483648L || parseLong > 2147483647L) {
                        throw pVar.b(this.q, "Overflow: numeric value (" + trim + ") out of range of Integer (-2147483648 - 2147483647)");
                    }
                    return Integer.valueOf((int) parseLong);
                }
                if (length == 0) {
                    return (Integer) b();
                }
                return Integer.valueOf(com.flurry.a.b.a.c.e.a(trim));
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Integer value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Integer) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final Long k(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Long.valueOf(jVar.u());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return (Long) b();
            }
            try {
                return Long.valueOf(com.flurry.a.b.a.c.e.b(trim));
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Long value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Long) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final long l(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.u();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return 0L;
            }
            try {
                return com.flurry.a.b.a.c.e.b(trim);
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid long value");
            }
        }
        if (e != com.flurry.a.b.a.o.VALUE_NULL) {
            throw pVar.a(this.q, e);
        }
        return 0L;
    }

    protected final Float m(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Float.valueOf(jVar.w());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return (Float) b();
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Float.valueOf(Float.NEGATIVE_INFINITY);
                    }
                    break;
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Float.valueOf(Float.POSITIVE_INFINITY);
                    }
                    break;
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Float.valueOf(Float.NaN);
                    }
                    break;
            }
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Float value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Float) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final float n(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.w();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return 0.0f;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Float.NEGATIVE_INFINITY;
                    }
                    break;
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Float.POSITIVE_INFINITY;
                    }
                    break;
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Float.NaN;
                    }
                    break;
            }
            try {
                return Float.parseFloat(trim);
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid float value");
            }
        }
        if (e != com.flurry.a.b.a.o.VALUE_NULL) {
            throw pVar.a(this.q, e);
        }
        return 0.0f;
    }

    protected final Double o(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return Double.valueOf(jVar.x());
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return (Double) b();
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Double.valueOf(Double.NEGATIVE_INFINITY);
                    }
                    break;
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Double.valueOf(Double.POSITIVE_INFINITY);
                    }
                    break;
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Double.valueOf(Double.NaN);
                    }
                    break;
            }
            try {
                return Double.valueOf(a(trim));
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid Double value");
            }
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Double) b();
        }
        throw pVar.a(this.q, e);
    }

    protected final double p(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT || e == com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT) {
            return jVar.x();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return 0.0d;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Double.NEGATIVE_INFINITY;
                    }
                    break;
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Double.POSITIVE_INFINITY;
                    }
                    break;
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Double.NaN;
                    }
                    break;
            }
            try {
                return a(trim);
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid double value");
            }
        }
        if (e != com.flurry.a.b.a.o.VALUE_NULL) {
            throw pVar.a(this.q, e);
        }
        return 0.0d;
    }

    protected final Date q(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Date a;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_NUMBER_INT) {
            return new Date(jVar.u());
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            return (Date) b();
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            try {
                String trim = jVar.k().trim();
                if (trim.length() == 0) {
                    a = (Date) b();
                } else {
                    a = pVar.a(trim);
                }
                return a;
            } catch (IllegalArgumentException e2) {
                throw pVar.b(this.q, "not a valid representation (error: " + e2.getMessage() + ")");
            }
        }
        throw pVar.a(this.q, e);
    }

    private static double a(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    protected void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj, String str) {
        if (obj == null) {
            obj = this.q;
        }
        pVar.a(jVar);
        if (pVar.a(com.flurry.a.b.a.d.o.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw pVar.a(obj, str);
        }
        jVar.d();
    }
}
