package com.censivn.C3DEngine.b;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {
    private ArrayList a;
    private HashMap b;
    private ArrayList c;
    private boolean[] d;
    private boolean[] e;

    public j() {
        a();
    }

    private void a() {
        Log.v("x", "ManagedLightList.reset()");
        this.c = new ArrayList();
        for (int i = 0; i < 8; i++) {
            this.c.add(Integer.valueOf(i));
        }
        this.b = new HashMap();
        this.d = new boolean[8];
        this.e = new boolean[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.d[i2] = false;
            this.e[i2] = true;
        }
        this.a = new ArrayList();
    }
}
