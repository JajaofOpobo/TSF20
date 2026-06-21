package com.tsf.shell.plugin.classification;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {
    public String a;
    public ArrayList b = new ArrayList();
    public int c;

    public f(String str, int i) {
        this.a = "";
        this.c = 0;
        this.a = str;
        this.c = i;
    }

    public void a() {
        com.tsf.shell.plugin.themepicker.g.b("folder Name:" + this.a + "   type:" + this.c);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.plugin.themepicker.g.b("package Name:" + ((String) it.next()));
        }
    }
}
