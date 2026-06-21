package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class bg extends bn {
    public static final bo a;
    private static final bh g;
    private final String b;
    private final CharSequence c;
    private final CharSequence[] d;
    private final boolean e;
    private final Bundle f;

    @Override // android.support.v4.app.bn
    public String a() {
        return this.b;
    }

    @Override // android.support.v4.app.bn
    public CharSequence b() {
        return this.c;
    }

    @Override // android.support.v4.app.bn
    public CharSequence[] c() {
        return this.d;
    }

    @Override // android.support.v4.app.bn
    public boolean d() {
        return this.e;
    }

    @Override // android.support.v4.app.bn
    public Bundle e() {
        return this.f;
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            g = new bi();
        } else if (Build.VERSION.SDK_INT >= 16) {
            g = new bk();
        } else {
            g = new bj();
        }
        a = new bo() { // from class: android.support.v4.app.bg.1
        };
    }
}
