package com.tsf.shell.widget.alarm.AlarmUtils;

import java.util.Calendar;

/* loaded from: classes.dex */
public final class b {
    private static int[] a = {2, 3, 4, 5, 6, 7, 1};
    private int b;

    public b(int i) {
        this.b = i;
    }

    private boolean a(int i) {
        return (this.b & (1 << i)) > 0;
    }

    public void a(int i, boolean z) {
        if (z) {
            this.b |= 1 << i;
        } else {
            this.b &= (1 << i) ^ (-1);
        }
    }

    public int a() {
        return this.b;
    }

    public boolean[] b() {
        boolean[] zArr = new boolean[7];
        for (int i = 0; i < 7; i++) {
            zArr[i] = a(i);
        }
        return zArr;
    }

    public boolean c() {
        return this.b != 0;
    }

    public int a(Calendar calendar) {
        if (this.b == 0) {
            return -1;
        }
        int i = (calendar.get(7) + 5) % 7;
        int i2 = 0;
        while (i2 < 7 && !a((i + i2) % 7)) {
            i2++;
        }
        return i2;
    }
}
