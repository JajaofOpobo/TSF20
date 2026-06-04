package com.flurry.a.b.a.d.b.b;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public final class e extends bw {
    protected final Class a;

    public e() {
        this(null);
    }

    public e(Class cls) {
        super(Calendar.class);
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Calendar a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Date q = q(jVar, pVar);
        if (q == null) {
            return null;
        }
        if (this.a == null) {
            return pVar.a(q);
        }
        try {
            Calendar calendar = (Calendar) this.a.newInstance();
            calendar.setTimeInMillis(q.getTime());
            return calendar;
        } catch (Exception e) {
            throw pVar.a(this.a, e);
        }
    }
}
