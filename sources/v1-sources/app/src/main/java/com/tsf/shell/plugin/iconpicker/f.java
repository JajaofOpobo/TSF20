package com.tsf.shell.plugin.iconpicker;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class f extends d {
    @Override // com.tsf.shell.plugin.iconpicker.d, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        ((GridView) a.findViewById(R.id.icongrid)).setSelector(new ColorDrawable(0));
        return a;
    }

    @Override // com.tsf.shell.plugin.iconpicker.d, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }
}
