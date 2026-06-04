package com.flurry.a.b.a.d.h;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {
    final k a;

    public m(k kVar) {
        this.a = kVar;
    }

    public final com.flurry.a.b.a.g.a a(String str) {
        n nVar = new n(str.trim());
        com.flurry.a.b.a.g.a a = a(nVar);
        if (nVar.hasMoreTokens()) {
            throw a(nVar, "Unexpected tokens after complete type");
        }
        return a;
    }

    private com.flurry.a.b.a.g.a a(n nVar) {
        if (!nVar.hasMoreTokens()) {
            throw a(nVar, "Unexpected end-of-string");
        }
        Class a = a(nVar.nextToken(), nVar);
        if (nVar.hasMoreTokens()) {
            String nextToken = nVar.nextToken();
            if ("<".equals(nextToken)) {
                k kVar = this.a;
                ArrayList arrayList = new ArrayList();
                while (nVar.hasMoreTokens()) {
                    arrayList.add(a(nVar));
                    if (!nVar.hasMoreTokens()) {
                        break;
                    }
                    String nextToken2 = nVar.nextToken();
                    if (">".equals(nextToken2)) {
                        return kVar.a(a, arrayList);
                    }
                    if (!",".equals(nextToken2)) {
                        throw a(nVar, "Unexpected token '" + nextToken2 + "', expected ',' or '>')");
                    }
                }
                throw a(nVar, "Unexpected end-of-string");
            }
            nVar.a(nextToken);
        }
        return this.a.b(a);
    }

    private static Class a(String str, n nVar) {
        try {
            return Class.forName(str, true, Thread.currentThread().getContextClassLoader());
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw a(nVar, "Can not locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    private static IllegalArgumentException a(n nVar, String str) {
        return new IllegalArgumentException("Failed to parse type '" + nVar.a() + "' (remaining: '" + nVar.b() + "'): " + str);
    }
}
