package com.tsf.shell.plugin.widgetpicker;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class d extends j {
    private final ArrayList b;
    private String c;

    public d(String str, Drawable drawable, Drawable drawable2) {
        super(str, drawable, drawable2);
        this.b = new ArrayList();
    }

    public final ArrayList a() {
        return this.b;
    }

    @Override // com.tsf.shell.plugin.widgetpicker.j
    public final String b() {
        return this.b.size() == 1 ? ((j) this.b.get(0)).b() : super.b();
    }

    @Override // com.tsf.shell.plugin.widgetpicker.j
    public final Drawable c() {
        return this.b.size() == 1 ? ((j) this.b.get(0)).c() : super.c();
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String d() {
        return this.c;
    }

    public final void e() {
        Collections.sort(this.b, new e(this));
    }
}
