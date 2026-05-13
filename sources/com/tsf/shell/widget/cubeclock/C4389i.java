package com.tsf.shell.widget.cubeclock;

import android.text.format.DateFormat;
/* renamed from: com.tsf.shell.widget.cubeclock.i */
/* loaded from: classes.dex */
public class C4389i extends AbstractC4384e {
    public C4389i(C4382c c4382c) {
        super(c4382c);
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: a */
    public int mo14a() {
        return DateFormat.is24HourFormat(this.f14229c.f14193a) ? 24 : 12;
    }

    @Override // com.tsf.shell.widget.cubeclock.AbstractC4384e
    /* renamed from: a */
    public float[] mo13a(int i) {
        C4390j.m53a("INDEX:" + i);
        if (!DateFormat.is24HourFormat(this.f14229c.f14193a) && i == 0) {
            i = 12;
        }
        return this.f14229c.f14197e.m45a(i / 10, i % 10);
    }
}
