package com.flurry.a.b.a.d.i;

/* loaded from: classes.dex */
public final class k {
    public static String a(com.flurry.a.b.a.d.e.f fVar, String str) {
        Package r3;
        boolean z = true;
        boolean z2 = false;
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class d = fVar.d();
            if (d != null && d.isArray() && (r3 = d.getComponentType().getPackage()) != null) {
                String name = r3.getName();
                if (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib")) {
                    z2 = true;
                }
            }
            if (z2) {
                return null;
            }
        } else if ("getMetaClass".equals(str)) {
            Class d2 = fVar.d();
            if (d2 == null || d2.isArray()) {
                z = false;
            } else {
                Package r32 = d2.getPackage();
                if (r32 == null || !r32.getName().startsWith("groovy.lang")) {
                    z = false;
                }
            }
            if (z) {
                return null;
            }
        }
        return a(str.substring(3));
    }

    public static String b(com.flurry.a.b.a.d.e.f fVar, String str) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class d = fVar.d();
        if (d == Boolean.class || d == Boolean.TYPE) {
            return a(str.substring(2));
        }
        return null;
    }

    public static String a(com.flurry.a.b.a.d.e.f fVar) {
        String a;
        String b = fVar.b();
        if (!b.startsWith("set") || (a = a(b.substring(3))) == null) {
            return null;
        }
        if ("metaClass".equals(a)) {
            Package r2 = fVar.g().getPackage();
            if (r2 != null && r2.getName().startsWith("groovy.lang")) {
                return null;
            }
        }
        return a;
    }

    private static String a(String str) {
        StringBuilder sb = null;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            if (charAt == lowerCase) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder(str);
            }
            sb.setCharAt(i, lowerCase);
        }
        return sb != null ? sb.toString() : str;
    }
}
