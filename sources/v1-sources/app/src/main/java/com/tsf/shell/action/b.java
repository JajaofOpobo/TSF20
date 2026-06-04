package com.tsf.shell.action;

import android.content.Intent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public final class b {
    public int a;
    public String b;
    public String c;

    public b(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        try {
            if (this.c == null || this.c.length() == 0) {
                return false;
            }
            if (this.c.contains("tsf://")) {
                r.a(this.c);
            } else {
                Home.d().b(Intent.parseUri(this.c, 0));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
