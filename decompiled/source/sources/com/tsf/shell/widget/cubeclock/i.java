package com.tsf.shell.widget.cubeclock;

import android.text.format.DateFormat;
/* loaded from: classes.dex */
public class i extends e {
    public i(c cVar) {
        super(cVar);
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public int a() {
        return DateFormat.is24HourFormat(this.c.a) ? 24 : 12;
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public float[] a(int i) {
        j.a("INDEX:" + i);
        if (!DateFormat.is24HourFormat(this.c.a) && i == 0) {
            i = 12;
        }
        return this.c.e.a(i / 10, i % 10);
    }
}
