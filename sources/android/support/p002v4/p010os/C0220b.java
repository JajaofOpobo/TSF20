package android.support.p002v4.p010os;

import android.os.AsyncTask;
/* renamed from: android.support.v4.os.b */
/* loaded from: classes.dex */
class C0220b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <Params, Progress, Result> void m13214a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
