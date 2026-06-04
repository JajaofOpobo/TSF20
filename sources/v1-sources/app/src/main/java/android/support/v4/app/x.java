package android.support.v4.app;

/* loaded from: classes.dex */
final class x implements Runnable {
    final /* synthetic */ w a;

    x(w wVar) {
        this.a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.Q.focusableViewAvailable(this.a.Q);
    }
}
