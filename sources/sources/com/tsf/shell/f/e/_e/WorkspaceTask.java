package com.tsf.shell.f.e._e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspaceTask implements Runnable {
    com.tsf.shell.f.e.SelectionFrameLayoutItem b;

    @Override // java.lang.Runnable
    public void run() {
        if (this.b != null) {
            a(this.b);
            this.b = null;
        }
    }

    public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
    }
}
