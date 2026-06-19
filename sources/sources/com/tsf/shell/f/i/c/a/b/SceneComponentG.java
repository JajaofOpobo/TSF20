package com.tsf.shell.f.i.c.a.b;

import android.text.format.DateFormat;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneComponentG extends DeferredItemGroup {
    @Override // com.tsf.shell.f.i.c.a.b.SceneComponentB
    public int a() {
        return DateFormat.is24HourFormat(FolderItemGroup.c) ? 24 : 12;
    }

    @Override // com.tsf.shell.f.i.c.a.b.SceneComponentB
    public float[] a(int i) {
        if (!DateFormat.is24HourFormat(FolderItemGroup.c) && i == 0) {
            i = 12;
        }
        return FolderItemGroup.f.a(i / 10, i % 10);
    }
}
