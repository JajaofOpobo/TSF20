package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import android.text.format.DateFormat;
/* renamed from: com.tsf.shell.f.i.c.a.b.g */
/* loaded from: classes.dex */
public class C3265g extends AbstractC3259b {
    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3259b
    /* renamed from: a */
    public int mo2946a() {
        return DateFormat.is24HourFormat(C3260c.f10740c) ? 24 : 12;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.p164b.AbstractC3259b
    /* renamed from: a */
    public float[] mo2945a(int i) {
        if (!DateFormat.is24HourFormat(C3260c.f10740c) && i == 0) {
            i = 12;
        }
        return C3260c.f10743f.m2957a(i / 10, i % 10);
    }
}
