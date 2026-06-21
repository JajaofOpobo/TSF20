package com.tsf.shell.plugin.themepicker.themepreview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;

/* loaded from: classes.dex */
public class c extends Fragment {
    public static c a(String str, Integer num) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", str);
        bundle.putInt("resource", num.intValue());
        cVar.g(bundle);
        return cVar;
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d dVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(p.theme_preview_detil_fragment_image, viewGroup, false);
        ImageView imageView = (ImageView) viewGroup2.findViewById(n.imageView1);
        String str = (String) h().get("packagename");
        int intValue = ((Integer) h().get("resource")).intValue();
        dVar = ThemePreviewDetilActivity.n;
        dVar.a(new e(str, intValue), imageView);
        return viewGroup2;
    }
}
