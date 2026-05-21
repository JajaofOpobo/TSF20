package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends k {
    private String ai;

    public a() {
        a(1, 0);
    }

    @Override // android.support.v4.app.k, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.ai = (String) h().get("packagename");
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.h.theme_preview_info_dialog, viewGroup);
        Context contextA = com.tsf.shell.plugin.themepicker.k.a(i(), this.ai);
        ((TextView) viewInflate.findViewById(f.C0155f.textView1)).setText((String) contextA.getApplicationInfo().loadLabel(i().getPackageManager()));
        String strD = com.tsf.shell.plugin.themepicker.k.d(contextA);
        TextView textView = (TextView) viewInflate.findViewById(f.C0155f.textView2);
        if (strD != null) {
            textView.setText(strD);
        } else {
            textView.setVisibility(8);
        }
        String strF = com.tsf.shell.plugin.themepicker.k.f(contextA);
        TextView textView2 = (TextView) viewInflate.findViewById(f.C0155f.textView3);
        if (strF != null) {
            textView2.setText(strF);
        } else {
            textView2.setVisibility(8);
        }
        String strE = com.tsf.shell.plugin.themepicker.k.e(contextA);
        TextView textView3 = (TextView) viewInflate.findViewById(f.C0155f.textView4);
        if (strE != null) {
            textView3.setText(strE);
        } else {
            textView3.setVisibility(8);
        }
        return viewInflate;
    }
}
