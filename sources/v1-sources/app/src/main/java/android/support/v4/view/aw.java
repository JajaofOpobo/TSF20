package android.support.v4.view;

/* loaded from: classes.dex */
final class aw implements Runnable {
    final /* synthetic */ ViewPager a;

    aw(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(0);
        this.a.d();
    }
}
