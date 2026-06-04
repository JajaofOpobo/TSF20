package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class y implements AdapterView.OnItemClickListener {
    final /* synthetic */ w a;

    y(w wVar) {
        this.a = wVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.a(i);
    }
}
