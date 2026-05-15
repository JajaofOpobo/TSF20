package com.tsf.extend.wallpaper;

import android.content.ComponentName;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends f {
    ComponentName a;

    public String a() {
        return this.a.getPackageName();
    }

    @Override // com.tsf.extend.wallpaper.f
    public String toString() {
        String string = "";
        if (this.j != null) {
            string = this.j.toString();
        }
        return "ApplicationInfo(title=" + string + " id=" + this.b + " type=" + this.c + " container=" + this.d + " screen=" + this.e + " cellX=" + this.f + " cellY=" + this.g + " spanX=" + this.h + " spanY=" + this.i + " dropPos=" + this.k + ")";
    }
}
