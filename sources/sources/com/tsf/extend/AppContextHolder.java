package com.tsf.extend;

import android.content.Context;
import com.tsf.extend.base.j.LogUtils;
import com.tsf.extend.base.j.HandlerUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppContextHolder {
    private static Context a;
    private static com.tsf.extend.base.ResultCallback b;

    public static void a(Context context) {
        a = context;
        z.a();
        com.tsf.extend.base.actstru.model.a.CalligraphyConfig.a("");
    }

    public static void a(com.tsf.extend.base.ResultCallback dVar) {
        b = dVar;
        q.a("sadqdqdq", "aid:" + com.tsf.extend.base.j.AppEnvUtils.b());
    }

    public static com.tsf.extend.base.ResultCallback a() {
        return b;
    }

    public static Context b() {
        return a;
    }
}
