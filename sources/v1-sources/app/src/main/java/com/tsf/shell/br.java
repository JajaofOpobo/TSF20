package com.tsf.shell;

import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;

/* loaded from: classes.dex */
final class br implements Runnable {
    final /* synthetic */ bq a;
    private final /* synthetic */ LauncherAppWidgetInfo b;

    br(bq bqVar, LauncherAppWidgetInfo launcherAppWidgetInfo) {
        this.a = bqVar;
        this.b = launcherAppWidgetInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bl blVar;
        blVar = this.a.a.h;
        blVar.a(this.b);
    }
}
