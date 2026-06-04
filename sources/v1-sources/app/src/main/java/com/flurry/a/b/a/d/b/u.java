package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.b.b.ap;
import com.flurry.a.b.a.d.b.b.ar;
import com.flurry.a.b.a.d.b.b.as;
import com.flurry.a.b.a.d.b.b.at;
import com.flurry.a.b.a.d.b.b.au;
import com.flurry.a.b.a.d.b.b.av;
import com.flurry.a.b.a.d.b.b.aw;
import com.flurry.a.b.a.d.b.b.ax;
import com.flurry.a.b.a.d.b.b.ay;
import com.flurry.a.b.a.d.b.b.az;
import com.flurry.a.b.a.d.b.b.ba;
import com.flurry.a.b.a.d.b.b.bc;
import com.flurry.a.b.a.d.b.b.bd;
import com.flurry.a.b.a.d.b.b.be;
import com.flurry.a.b.a.d.b.b.bz;
import com.flurry.a.b.a.d.b.b.cb;
import com.flurry.a.b.a.d.b.b.cc;
import com.flurry.a.b.a.d.b.b.cd;
import com.flurry.a.b.a.d.b.b.x;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class u {
    final HashMap a = new HashMap();

    private u() {
        a(new cd());
        bz bzVar = new bz();
        a(bzVar, String.class);
        a(bzVar, CharSequence.class);
        a(new com.flurry.a.b.a.d.b.b.f());
        a(new at(Boolean.class, null));
        a(new au(Byte.class, null));
        a(new bc(Short.class, null));
        a(new av(Character.class, null));
        a(new ay(Integer.class, null));
        a(new az(Long.class, null));
        a(new ax(Float.class, null));
        a(new aw(Double.class, null));
        a(new at(Boolean.TYPE, Boolean.FALSE));
        a(new au(Byte.TYPE, (byte) 0));
        a(new bc(Short.TYPE, (short) 0));
        a(new av(Character.TYPE, (char) 0));
        a(new ay(Integer.TYPE, 0));
        a(new az(Long.TYPE, 0L));
        a(new ax(Float.TYPE, Float.valueOf(0.0f)));
        a(new aw(Double.TYPE, Double.valueOf(0.0d)));
        a(new ba());
        a(new ar());
        a(new as());
        a(new com.flurry.a.b.a.d.b.b.e());
        a(new com.flurry.a.b.a.d.b.b.i());
        a(new com.flurry.a.b.a.d.b.b.e(GregorianCalendar.class), GregorianCalendar.class);
        a(new bd());
        a(new cb());
        Iterator it = com.flurry.a.b.a.d.b.b.n.c().iterator();
        while (it.hasNext()) {
            a((com.flurry.a.b.a.d.b.b.n) it.next());
        }
        a(new be());
        a(new com.flurry.a.b.a.d.b.b.a());
        a(new cc());
        a(new x());
    }

    public static HashMap a() {
        return new u().a;
    }

    private void a(ap apVar) {
        a(apVar, apVar.d());
    }

    private void a(ap apVar, Class cls) {
        this.a.put(new com.flurry.a.b.a.d.h.b(cls), apVar);
    }
}
