package com.tsf.shell.f.i._c.a.b;

import android.text.format.DateFormat;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneComponentG extends DeferredWidgetGroup {
    @Override // com.tsf.shell.f.i._c.a.b.SceneComponentB
    public int a() {
        return DateFormat.is24HourFormat(FolderWidgetGroup.c) ? 24 : 12;
    }

    @Override // com.tsf.shell.f.i._c.a.b.SceneComponentB
    public float[] a(int i) {
        if (!DateFormat.is24HourFormat(FolderWidgetGroup.c) && i == 0) {
            i = 12;
        }
        return FolderWidgetGroup.f.a(i / 10, i % 10);
    }
}
