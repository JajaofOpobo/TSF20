package com.tsf.shell.a;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class e implements AdapterView.OnItemLongClickListener {
    final /* synthetic */ b a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Context c;

    e(b bVar, ArrayList arrayList, Context context) {
        this.a = bVar;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        k kVar = (k) this.b.get(i);
        b bVar = this.a;
        Context context = this.c;
        ArrayList arrayList = this.b;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setItems(new String[]{context.getString(R.string.public_action_restore), context.getString(R.string.rename_title), context.getString(R.string.pop_menu_delete)}, new f(bVar, context, arrayList, kVar)).create();
        builder.show();
        return true;
    }
}
