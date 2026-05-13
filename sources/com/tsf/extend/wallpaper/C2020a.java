package com.tsf.extend.wallpaper;

import android.content.ComponentName;
/* renamed from: com.tsf.extend.wallpaper.a */
/* loaded from: classes.dex */
public class C2020a extends C2069f {

    /* renamed from: a */
    ComponentName f6580a;

    /* renamed from: a */
    public String m6707a() {
        return this.f6580a.getPackageName();
    }

    @Override // com.tsf.extend.wallpaper.C2069f
    public String toString() {
        String str = "";
        if (this.f6757j != null) {
            str = this.f6757j.toString();
        }
        return "ApplicationInfo(title=" + str + " id=" + this.f6749b + " type=" + this.f6750c + " container=" + this.f6751d + " screen=" + this.f6752e + " cellX=" + this.f6753f + " cellY=" + this.f6754g + " spanX=" + this.f6755h + " spanY=" + this.f6756i + " dropPos=" + this.f6758k + ")";
    }
}
