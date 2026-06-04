package com.tsf.shell.a;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.tsf.shell.R;
import com.tsf.shell.au;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class c implements AdapterView.OnItemClickListener {
    final /* synthetic */ b a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ ArrayList c;

    c(b bVar, Context context, ArrayList arrayList) {
        this.a = bVar;
        this.b = context;
        this.c = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        au.a(this.b, R.string.public_action_confirm, R.string.notic_restore_desktop_message, new d(this, this.c, i, this.b), null);
    }
}
