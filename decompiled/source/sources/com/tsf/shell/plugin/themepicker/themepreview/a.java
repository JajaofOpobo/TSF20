package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
/* loaded from: classes.dex */
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
        View inflate = layoutInflater.inflate(f.h.theme_preview_info_dialog, viewGroup);
        Context a = com.tsf.shell.plugin.themepicker.k.a(i(), this.ai);
        ((TextView) inflate.findViewById(f.C0155f.textView1)).setText((String) a.getApplicationInfo().loadLabel(i().getPackageManager()));
        String d = com.tsf.shell.plugin.themepicker.k.d(a);
        TextView textView = (TextView) inflate.findViewById(f.C0155f.textView2);
        if (d != null) {
            textView.setText(d);
        } else {
            textView.setVisibility(8);
        }
        String f = com.tsf.shell.plugin.themepicker.k.f(a);
        TextView textView2 = (TextView) inflate.findViewById(f.C0155f.textView3);
        if (f != null) {
            textView2.setText(f);
        } else {
            textView2.setVisibility(8);
        }
        String e = com.tsf.shell.plugin.themepicker.k.e(a);
        TextView textView3 = (TextView) inflate.findViewById(f.C0155f.textView4);
        if (e != null) {
            textView3.setText(e);
        } else {
            textView3.setVisibility(8);
        }
        return inflate;
    }
}
