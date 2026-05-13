package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.manager.p183o.C3560a;
/* renamed from: com.tsf.shell.f.i.b.e.a */
/* loaded from: classes.dex */
public abstract class AbstractC3202a extends AbstractC3208b {
    public AbstractC3202a(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a) {
        super(launcherShortcut3DInfo, c3560a);
    }

    /* renamed from: q */
    public void m3172q() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) m3534K();
        if (this instanceof C3222g) {
            C3222g c3222g = (C3222g) this;
            if (c3222g.m3106bd() != null) {
                launcherShortcut3DInfo.onUpdateName(c3222g.m3106bd().f11172e, false);
            }
        }
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC3202a.this.mo1827k();
                    }
                });
            }
        };
        if (this instanceof C3219f) {
            if (launcherShortcut3DInfo.iconResource != null) {
                launcherShortcut3DInfo.onUpdatePhoto(null, runnable);
                return;
            }
            return;
        }
        launcherShortcut3DInfo.onUpdatePhoto(null, runnable);
    }

    /* renamed from: a */
    public void m3174a(Bitmap bitmap, String str) {
        boolean z;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) m3534K();
        if (this instanceof C3222g) {
            C3222g c3222g = (C3222g) this;
            if (c3222g.m3106bd() != null && c3222g.m3106bd().f11172e.equals(str)) {
                z = false;
                launcherShortcut3DInfo.onUpdateName(str, z);
                launcherShortcut3DInfo.onUpdatePhoto(bitmap, new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AbstractC3202a.this.mo1827k();
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
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC3202a.this.mo1827k();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m3173a(String str) {
        boolean z;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) m3534K();
        if (this instanceof C3222g) {
            C3222g c3222g = (C3222g) this;
            if (c3222g.m3106bd() != null && c3222g.m3106bd().f11172e.equals(str)) {
                z = false;
                launcherShortcut3DInfo.onUpdateName(str, z);
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC3202a.this.mo1827k();
                    }
                });
            }
        }
        z = true;
        launcherShortcut3DInfo.onUpdateName(str, z);
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.a.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3202a.this.mo1827k();
            }
        });
    }
}
