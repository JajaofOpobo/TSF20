package com.tsf.shell.plugin.fontspicker;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class h extends com.tsf.shell.plugin.themepicker.utils.a {
    final /* synthetic */ g a;
    private b e;
    private final WeakReference f;

    public h(g gVar, b bVar, TextView textView) {
        this.a = gVar;
        this.e = bVar;
        this.f = new WeakReference(textView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public Typeface a(Void... voidArr) {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.e.a(this.a.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public void a(Typeface typeface) {
        if (c()) {
            typeface = null;
        }
        TextView textView = (TextView) this.f.get();
        if (typeface != null && textView != null && ((h) textView.getTag()) == this) {
            textView.setTypeface(typeface);
        }
    }
}
