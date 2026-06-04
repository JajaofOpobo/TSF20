package com.flurry.a.a.a;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes.dex */
public final class y {
    private w a = new w();
    private boolean b = true;

    public final c a(String str) {
        try {
            return a(c.a.a((Reader) new StringReader(str)));
        } catch (IOException e) {
            throw new af(e);
        }
    }

    private c a(com.flurry.a.b.a.j jVar) {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2;
        ThreadLocal threadLocal3;
        threadLocal = c.k;
        boolean booleanValue = ((Boolean) threadLocal.get()).booleanValue();
        try {
            try {
                threadLocal3 = c.k;
                threadLocal3.set(Boolean.valueOf(this.b));
                return c.a(c.b.a(jVar), this.a);
            } catch (com.flurry.a.b.a.i e) {
                throw new af(e);
            }
        } finally {
            threadLocal2 = c.k;
            threadLocal2.set(Boolean.valueOf(booleanValue));
        }
    }
}
