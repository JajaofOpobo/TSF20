package com.tsf.shell.h;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ g a;
    private int b;

    i(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int windowAttachCount;
        boolean z;
        if (this.a.getParent() != null && this.a.hasWindowFocus()) {
            int i = this.b;
            windowAttachCount = this.a.getWindowAttachCount();
            if (i == windowAttachCount) {
                z = this.a.a;
                if (!z && this.a.performLongClick()) {
                    this.a.a = true;
                }
            }
        }
    }

    public final void a() {
        int windowAttachCount;
        windowAttachCount = this.a.getWindowAttachCount();
        this.b = windowAttachCount;
    }
}
