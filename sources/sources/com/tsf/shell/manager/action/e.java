package com.tsf.shell.manager.action;

import android.content.Intent;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    public int a;
    public String b;
    public String c;

    public e(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public boolean a() {
        try {
            if (this.c == null || this.c.length() == 0) {
                return false;
            }
            if (this.c.contains("tsf://")) {
                com.tsf.shell.manager.a.d.a(this.c);
            } else {
                Home.b().a(Intent.parseUri(this.c, 0), (Object) null);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
