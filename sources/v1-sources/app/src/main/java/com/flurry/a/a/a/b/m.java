package com.flurry.a.a.a.b;

import com.flurry.a.a.a.c.t;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class m {
    private final c a;
    private com.flurry.a.a.a.c b;

    protected m(c cVar) {
        this.a = cVar;
    }

    protected m(com.flurry.a.a.a.c cVar, c cVar2) {
        this(cVar2);
        this.b = cVar;
    }

    public final void a(Object obj, t tVar) {
        b(this.b, obj, tVar);
    }

    private void b(com.flurry.a.a.a.c cVar, Object obj, t tVar) {
        try {
            switch (n.a[cVar.a().ordinal()]) {
                case 1:
                    c cVar2 = this.a;
                    c.b();
                    for (com.flurry.a.a.a.m mVar : cVar.b()) {
                        c cVar3 = this.a;
                        mVar.a();
                        try {
                            b(mVar.c(), c.a(obj, mVar.b()), tVar);
                        } catch (NullPointerException e) {
                            throw a(e, " in field " + mVar.a());
                        }
                    }
                    return;
                case 2:
                    a(cVar, obj, tVar);
                    return;
                case 3:
                    c(cVar, obj, tVar);
                    return;
                case 4:
                    d(cVar, obj, tVar);
                    return;
                case 5:
                    int a = this.a.a(cVar, obj);
                    tVar.b(a);
                    b((com.flurry.a.a.a.c) cVar.k().get(a), obj, tVar);
                    return;
                case 6:
                    tVar.b(((p) obj).b(), 0, cVar.l());
                    return;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    b(obj, tVar);
                    return;
                case ThemeParser.TYPE_FOLDER /* 8 */:
                    tVar.a((ByteBuffer) obj);
                    return;
                case 9:
                    tVar.c(((Number) obj).intValue());
                    return;
                case 10:
                    tVar.b(((Long) obj).longValue());
                    return;
                case 11:
                    tVar.a(((Float) obj).floatValue());
                    return;
                case 12:
                    tVar.a(((Double) obj).doubleValue());
                    return;
                case 13:
                    tVar.a(((Boolean) obj).booleanValue());
                    return;
                case 14:
                    tVar.a();
                    return;
                default:
                    throw new com.flurry.a.a.a.b("Not a " + cVar + ": " + obj);
            }
        } catch (NullPointerException e2) {
            throw a(e2, " of " + cVar.g());
        }
        throw a(e2, " of " + cVar.g());
    }

    private static NullPointerException a(NullPointerException nullPointerException, String str) {
        NullPointerException nullPointerException2 = new NullPointerException(nullPointerException.getMessage() + str);
        Throwable cause = nullPointerException.getCause();
        Throwable th = nullPointerException;
        if (cause != null) {
            th = nullPointerException.getCause();
        }
        nullPointerException2.initCause(th);
        return nullPointerException2;
    }

    protected void a(com.flurry.a.a.a.c cVar, Object obj, t tVar) {
        tVar.a(cVar.c(obj.toString()));
    }

    private void c(com.flurry.a.a.a.c cVar, Object obj, t tVar) {
        com.flurry.a.a.a.c i = cVar.i();
        long size = ((Collection) obj).size();
        tVar.b();
        tVar.a(size);
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            tVar.c();
            b(i, it.next(), tVar);
        }
        tVar.d();
    }

    private void d(com.flurry.a.a.a.c cVar, Object obj, t tVar) {
        com.flurry.a.a.a.c j = cVar.j();
        int size = ((Map) obj).size();
        tVar.e();
        tVar.a(size);
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            tVar.c();
            b(entry.getKey(), tVar);
            b(j, entry.getValue(), tVar);
        }
        tVar.f();
    }

    private static void b(Object obj, t tVar) {
        tVar.a((CharSequence) obj);
    }
}
