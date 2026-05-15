package com.tsf.extend;

import android.content.Context;
import com.tsf.extend.base.j.q;
import com.tsf.extend.base.j.z;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private static Context a;
    private static com.tsf.extend.base.d b;

    public static void a(Context context) {
        a = context;
        z.a();
        com.tsf.extend.base.actstru.model.a.a.a("");
    }

    public static void a(com.tsf.extend.base.d dVar) {
        b = dVar;
        q.a("sadqdqdq", "aid:" + com.tsf.extend.base.j.d.b());
    }

    public static com.tsf.extend.base.d a() {
        return b;
    }

    public static Context b() {
        return a;
    }
}
