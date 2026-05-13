package com.tsf.extend.wallpaper;

import android.content.ComponentName;
/* loaded from: classes.dex */
public class a extends f {
    ComponentName a;

    public String a() {
        return this.a.getPackageName();
    }

    @Override // com.tsf.extend.wallpaper.f
    public String toString() {
        String str = "";
        if (this.j != null) {
            str = this.j.toString();
        }
        return "ApplicationInfo(title=" + str + " id=" + this.b + " type=" + this.c + " container=" + this.d + " screen=" + this.e + " cellX=" + this.f + " cellY=" + this.g + " spanX=" + this.h + " spanY=" + this.i + " dropPos=" + this.k + ")";
    }
}
