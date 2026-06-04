package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class ai extends Thread {
    final /* synthetic */ ShellWallpaperManager a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ShellWallpaperManager shellWallpaperManager, String str, int i, int i2) {
        super(str);
        this.a = shellWallpaperManager;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (com.tsf.shell.a.t.C() == ShellWallpaperManager.a) {
            this.a.h.suggestDesiredDimensions(this.b * 2, this.c);
        } else {
            this.a.h.suggestDesiredDimensions(this.b, this.c);
        }
    }
}
