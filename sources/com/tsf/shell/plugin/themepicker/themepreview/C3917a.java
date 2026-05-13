package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.os.Bundle;
import android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
/* renamed from: com.tsf.shell.plugin.themepicker.themepreview.a */
/* loaded from: classes.dex */
public class C3917a extends DialogInterface$OnCancelListenerC0090k {

    /* renamed from: ai */
    private String f12830ai;

    public C3917a() {
        m13637a(1, 0);
    }

    @Override // android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k, android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        this.f12830ai = (String) m13747h().get("packagename");
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_preview_info_dialog, viewGroup);
        Context m1236a = C3897k.m1236a(m13745i(), this.f12830ai);
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText((String) m1236a.getApplicationInfo().loadLabel(m13745i().getPackageManager()));
        String m1223d = C3897k.m1223d(m1236a);
        TextView textView = (TextView) inflate.findViewById(C3852f.C3858f.textView2);
        if (m1223d != null) {
            textView.setText(m1223d);
        } else {
            textView.setVisibility(8);
        }
        String m1220f = C3897k.m1220f(m1236a);
        TextView textView2 = (TextView) inflate.findViewById(C3852f.C3858f.textView3);
        if (m1220f != null) {
            textView2.setText(m1220f);
        } else {
            textView2.setVisibility(8);
        }
        String m1221e = C3897k.m1221e(m1236a);
        TextView textView3 = (TextView) inflate.findViewById(C3852f.C3858f.textView4);
        if (m1221e != null) {
            textView3.setText(m1221e);
        } else {
            textView3.setVisibility(8);
        }
        return inflate;
    }
}
