package com.tsf.shell.d;

/* loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ c a;
    private int b;

    d(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
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

    public void a() {
        int windowAttachCount;
        windowAttachCount = this.a.getWindowAttachCount();
        this.b = windowAttachCount;
    }
}
