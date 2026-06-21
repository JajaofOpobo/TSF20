package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes.dex */
public class m {
    public int a = 5120;
    public int b = 10485760;
    public File c;
    public Bitmap.CompressFormat d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;

    public m(Context context, String str) {
        Bitmap.CompressFormat compressFormat;
        compressFormat = l.a;
        this.d = compressFormat;
        this.e = 70;
        this.f = true;
        this.g = true;
        this.h = false;
        this.c = l.a(context, str);
    }

    public void a(float f) {
        if (f < 0.01f || f > 0.8f) {
            throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
        }
        this.a = Math.round((Runtime.getRuntime().maxMemory() * f) / 1024.0f);
    }
}
