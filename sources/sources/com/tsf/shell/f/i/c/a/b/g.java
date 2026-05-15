package com.tsf.shell.f.i.c.a.b;

import android.text.format.DateFormat;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends b {
    @Override // com.tsf.shell.f.i.c.a.b.b
    public int a() {
        return DateFormat.is24HourFormat(c.c) ? 24 : 12;
    }

    @Override // com.tsf.shell.f.i.c.a.b.b
    public float[] a(int i) {
        if (!DateFormat.is24HourFormat(c.c) && i == 0) {
            i = 12;
        }
        return c.f.a(i / 10, i % 10);
    }
}
