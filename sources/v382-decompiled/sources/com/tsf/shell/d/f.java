package com.tsf.shell.d;

import android.view.ContextMenu;

/* loaded from: classes.dex */
public final class f implements ContextMenu.ContextMenuInfo {
    public b a;
    public int b;
    public int c;
    public int d;
    public int e;
    public e f;

    public String toString() {
        return "Cell[view=" + (this.a == null ? "null" : this.a.getClass()) + ", x=" + this.b + ", y=" + this.c + "]";
    }
}
