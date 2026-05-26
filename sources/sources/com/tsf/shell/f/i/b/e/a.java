package com.tsf.shell.f.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class a extends b {
    public a(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar) {
        super(launcherShortcut3DInfo, aVar);
    }

    public void q() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) K();
        if (this instanceof g) {
            g gVar = (g) this;
            if (gVar.bd() != null) {
                launcherShortcut3DInfo.onUpdateName(gVar.bd().e, false);
            }
        }
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.k();
                    }
                });
            }
        };
        if (this instanceof f) {
            if (launcherShortcut3DInfo.iconResource != null) {
                launcherShortcut3DInfo.onUpdatePhoto(null, runnable);
                return;
            }
            return;
        }
        launcherShortcut3DInfo.onUpdatePhoto(null, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Bitmap r5, java.lang.String r6) {
        /*
            r4 = this;
            com.censivn.C3DEngine.api.element.info.ItemInfo r0 = r4.K()
            com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo r0 = (com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo) r0
            r2 = 1
            boolean r1 = r4 instanceof com.tsf.shell.f.i.b.e.g
            if (r1 == 0) goto L2d
            r1 = r4
            com.tsf.shell.f.i.b.e.g r1 = (com.tsf.shell.f.i.b.e.g) r1
            com.tsf.shell.manager.a.f r3 = r1.bd()
            if (r3 == 0) goto L2d
            com.tsf.shell.manager.a.f r1 = r1.bd()
            java.lang.String r1 = r1.e
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L2d
            r1 = 0
        L21:
            r0.onUpdateName(r6, r1)
            com.tsf.shell.f.i.b.e.a$2 r1 = new com.tsf.shell.f.i.b.e.a$2
            r1.<init>()
            r0.onUpdatePhoto(r5, r1)
            return
        L2d:
            r1 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.b.e.a.a(android.graphics.Bitmap, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r5) {
        /*
            r4 = this;
            com.censivn.C3DEngine.api.element.info.ItemInfo r0 = r4.K()
            com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo r0 = (com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo) r0
            r2 = 1
            boolean r1 = r4 instanceof com.tsf.shell.f.i.b.e.g
            if (r1 == 0) goto L31
            r1 = r4
            com.tsf.shell.f.i.b.e.g r1 = (com.tsf.shell.f.i.b.e.g) r1
            com.tsf.shell.manager.a.f r3 = r1.bd()
            if (r3 == 0) goto L31
            com.tsf.shell.manager.a.f r1 = r1.bd()
            java.lang.String r1 = r1.e
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L31
            r1 = 0
        L21:
            r0.onUpdateName(r5, r1)
            com.tsf.shell.f.i.b.e.a$3 r0 = new com.tsf.shell.f.i.b.e.a$3
            r0.<init>()
            com.censivn.C3DEngine.b.c.c r1 = com.censivn.C3DEngine.a.a()
            r1.c(r0)
            return
        L31:
            r1 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.b.e.a.a(java.lang.String):void");
    }
}
