package com.tsf.shell.plugin.widgetpicker;

import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

/* loaded from: classes.dex */
public class j {
    private String b;
    private Drawable c;
    private Drawable d;
    public Bundle a = null;
    private ComponentName e = null;
    private int f = 0;
    private int g = 0;

    public j(String str, Drawable drawable, Drawable drawable2) {
        this.b = str;
        this.c = drawable;
        this.d = drawable2;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void b(int i) {
        this.f = i;
    }

    public final void a(ComponentName componentName) {
        this.e = componentName;
    }

    public final ComponentName f() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public Drawable c() {
        return this.c;
    }

    public final Drawable g() {
        return this.d;
    }

    public final int h() {
        return this.g;
    }

    public final int i() {
        return this.f;
    }
}
