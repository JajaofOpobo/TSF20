package com.tsf.shell.plugin.themepicker.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tsf.shell.plugin.themepicker.C3851e;
/* renamed from: com.tsf.shell.plugin.themepicker.utils.g */
/* loaded from: classes.dex */
public class C3956g extends BitmapDrawable {

    /* renamed from: a */
    private int f12964a;

    /* renamed from: b */
    private int f12965b;

    /* renamed from: c */
    private boolean f12966c;

    public C3956g(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.f12964a = 0;
        this.f12965b = 0;
    }

    /* renamed from: a */
    public void m1012a(boolean z) {
        synchronized (this) {
            if (z) {
                this.f12965b++;
                this.f12966c = true;
            } else {
                this.f12965b--;
            }
        }
        m1013a();
    }

    /* renamed from: b */
    public void m1010b(boolean z) {
        synchronized (this) {
            if (z) {
                this.f12964a++;
            } else {
                this.f12964a--;
            }
        }
        m1013a();
    }

    /* renamed from: a */
    private synchronized void m1013a() {
        if (this.f12964a <= 0 && this.f12965b <= 0 && this.f12966c && m1011b()) {
            C3851e.m1318a("CountingBitmapDrawable", "No longer being used or cached so recycling. " + toString());
            getBitmap().recycle();
        }
    }

    /* renamed from: b */
    private synchronized boolean m1011b() {
        boolean z;
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            z = bitmap.isRecycled() ? false : true;
        }
        return z;
    }
}
