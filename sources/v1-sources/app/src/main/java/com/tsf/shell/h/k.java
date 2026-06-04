package com.tsf.shell.h;

import android.view.ContextMenu;

/* loaded from: classes.dex */
public final class k implements ContextMenu.ContextMenuInfo {
    public d a;
    public int b;
    public int c;
    public int d;
    public int e;
    public j f;

    public final String toString() {
        return "Cell[view=" + (this.a == null ? "null" : this.a.getClass()) + ", x=" + this.b + ", y=" + this.c + "]";
    }
}
