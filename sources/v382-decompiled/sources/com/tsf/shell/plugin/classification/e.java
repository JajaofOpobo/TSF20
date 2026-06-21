package com.tsf.shell.plugin.classification;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class e {
    public Map a = new HashMap();
    public f[] b;

    public e(Context context) {
    }

    public void a() {
        this.b = new f[this.a.size()];
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                this.b[i2] = (f) ((Map.Entry) it.next()).getValue();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
