package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;

/* loaded from: classes.dex */
public class a extends android.support.v4.app.g {
    private String aj;

    public a() {
        a(1, 0);
    }

    @Override // android.support.v4.app.g, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.aj = (String) h().get("packagename");
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p.theme_preview_info_dialog, viewGroup);
        Context a = ac.a(i(), this.aj);
        ((TextView) inflate.findViewById(n.textView1)).setText((String) a.getApplicationInfo().loadLabel(i().getPackageManager()));
        String d = ac.d(a);
        TextView textView = (TextView) inflate.findViewById(n.textView2);
        if (d != null) {
            textView.setText(d);
        } else {
            textView.setVisibility(8);
        }
        String f = ac.f(a);
        TextView textView2 = (TextView) inflate.findViewById(n.textView3);
        if (f != null) {
            textView2.setText(f);
        } else {
            textView2.setVisibility(8);
        }
        String e = ac.e(a);
        TextView textView3 = (TextView) inflate.findViewById(n.textView4);
        if (e != null) {
            textView3.setText(e);
        } else {
            textView3.setVisibility(8);
        }
        return inflate;
    }
}
