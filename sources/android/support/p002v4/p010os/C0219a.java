package android.support.p002v4.p010os;

import android.os.AsyncTask;
import android.os.Build;
/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public final class C0219a {
    /* renamed from: a */
    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> m13215a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (Build.VERSION.SDK_INT >= 11) {
            C0220b.m13214a(asyncTask, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }
}
