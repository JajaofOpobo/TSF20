package com.tsf.shell.f.i.b.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
/* loaded from: classes.dex */
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

    public void a(Bitmap bitmap, String str) {
        boolean z;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) K();
        if (this instanceof g) {
            g gVar = (g) this;
            if (gVar.bd() != null && gVar.bd().e.equals(str)) {
                z = false;
                launcherShortcut3DInfo.onUpdateName(str, z);
                launcherShortcut3DInfo.onUpdatePhoto(bitmap, new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                a.this.k();
                            }
                        });
                    }
                });
            }
        }
        z = true;
        launcherShortcut3DInfo.onUpdateName(str, z);
        launcherShortcut3DInfo.onUpdatePhoto(bitmap, new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.k();
                    }
                });
            }
        });
    }

    public void a(String str) {
        boolean z;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) K();
        if (this instanceof g) {
            g gVar = (g) this;
            if (gVar.bd() != null && gVar.bd().e.equals(str)) {
                z = false;
                launcherShortcut3DInfo.onUpdateName(str, z);
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.k();
                    }
                });
            }
        }
        z = true;
        launcherShortcut3DInfo.onUpdateName(str, z);
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.3
            @Override // java.lang.Runnable
            public void run() {
                a.this.k();
            }
        });
    }
}
