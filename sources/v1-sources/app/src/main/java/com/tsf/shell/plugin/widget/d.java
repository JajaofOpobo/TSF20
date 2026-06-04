package com.tsf.shell.plugin.widget;

import java.util.Comparator;

/* loaded from: classes.dex */
final class d implements Comparator {
    final /* synthetic */ FloatingWidgetPicker a;

    d(FloatingWidgetPicker floatingWidgetPicker) {
        this.a = floatingWidgetPicker;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        FloatingWidgetPicker floatingWidgetPicker = this.a;
        int a = FloatingWidgetPicker.a((c) obj);
        FloatingWidgetPicker floatingWidgetPicker2 = this.a;
        return a - FloatingWidgetPicker.a((c) obj2);
    }
}
