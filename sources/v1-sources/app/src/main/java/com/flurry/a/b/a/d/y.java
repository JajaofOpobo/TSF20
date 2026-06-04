package com.flurry.a.b.a.d;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class y extends com.flurry.a.b.a.m {
    protected LinkedList b;

    public y(String str) {
        super(str);
    }

    public y(String str, Throwable th) {
        super(str, th);
    }

    public y(String str, com.flurry.a.b.a.g gVar) {
        super(str, gVar);
    }

    public y(String str, com.flurry.a.b.a.g gVar, Throwable th) {
        super(str, gVar, th);
    }

    public static y a(com.flurry.a.b.a.j jVar, String str) {
        return new y(str, jVar.h());
    }

    public static y a(com.flurry.a.b.a.j jVar, String str, Throwable th) {
        return new y(str, jVar.h(), th);
    }

    public static y a(Throwable th, Object obj, String str) {
        return a(th, new z(obj, str));
    }

    public static y a(Throwable th, Object obj, int i) {
        return a(th, new z(obj, i));
    }

    private static y a(Throwable th, z zVar) {
        y yVar;
        if (th instanceof y) {
            yVar = (y) th;
        } else {
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                message = "(was " + th.getClass().getName() + ")";
            }
            yVar = new y(message, null, th);
        }
        yVar.a(zVar);
        return yVar;
    }

    public final void a(Object obj, String str) {
        a(new z(obj, str));
    }

    public final void a(z zVar) {
        if (this.b == null) {
            this.b = new LinkedList();
        }
        if (this.b.size() < 1000) {
            this.b.addFirst(zVar);
        }
    }

    @Override // com.flurry.a.b.a.m, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.b == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        a(sb);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.flurry.a.b.a.m, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    private void a(StringBuilder sb) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(((z) it.next()).toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }
}
