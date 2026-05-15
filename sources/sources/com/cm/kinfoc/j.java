package com.cm.kinfoc;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j {
    boolean a;
    private r g;
    private final String c = "https://helptsflauncher1.ksmobile.com/c/";
    private final String d = "https://helptsflauncher1.ksmobile.com/c/";
    private final String e = "http://119.147.146.243/c/";
    private final String f = "kctrl.dat";
    boolean b = false;

    public j(Context context) {
        this.a = false;
        try {
            this.g = new r(com.cm.kinfoc.a.b.A().e().getAbsolutePath() + File.separatorChar + "kctrl.dat");
            this.a = true;
        } catch (IOException e) {
            this.a = false;
            e.printStackTrace();
        }
    }

    public int a() {
        if (this.a) {
            return this.g.a("common", "product", 0);
        }
        return 0;
    }

    public int b() {
        if (this.a) {
            return this.g.a("common", "validity", 0);
        }
        return 0;
    }

    public int a(String str) {
        if (this.a) {
            return this.g.a(str, "probability", 10000);
        }
        return 10000;
    }

    public int b(String str) {
        if (this.a) {
            return this.g.a(str, "userprobability", 10000);
        }
        return 10000;
    }

    public String a(int i) {
        if (this.a) {
            if (this.b) {
                return "http://119.147.146.243/c/";
            }
            return this.g.a("common", "server" + i, "https://helptsflauncher1.ksmobile.com/c/");
        }
        return "https://helptsflauncher1.ksmobile.com/c/";
    }

    public String c() {
        return "https://helptsflauncher1.ksmobile.com/c/";
    }

    public void a(boolean z) {
        this.b = z;
    }
}
