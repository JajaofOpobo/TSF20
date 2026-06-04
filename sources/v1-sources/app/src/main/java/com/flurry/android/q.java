package com.flurry.android;

/* loaded from: classes.dex */
public enum q {
    BANNER_TOP(1),
    BANNER_BOTTOM(2),
    FULLSCREEN(3);

    private int d;

    q(int i) {
        this.d = i;
    }

    final int a() {
        return this.d;
    }

    static q a(i iVar) {
        String obj = iVar.e().toString();
        String[] split = iVar.f().toString().split("-");
        if (obj.equals("takeover")) {
            return FULLSCREEN;
        }
        if (split[0].equals("b")) {
            return BANNER_BOTTOM;
        }
        return BANNER_TOP;
    }
}
