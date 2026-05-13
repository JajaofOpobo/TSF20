package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.g;
import java.util.List;
/* loaded from: classes.dex */
public class d extends g {
    public d(Context context, List<ResolveInfo> list, PackageManager packageManager, boolean z) {
        super(context, list, packageManager, z);
    }

    @Override // com.tsf.shell.plugin.themepicker.g, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(f.h.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(f.C0155f.imageView1);
        TextView textView = (TextView) view.findViewById(f.C0155f.textView1);
        if (this.d) {
            if (i == 0) {
                imageView.setImageResource(f.e.theme_preview_tsf_ico);
                textView.setText(f.j.theme_picker_system);
            } else {
                ResolveInfo resolveInfo = this.a.get(i - 1);
                imageView.setImageDrawable(resolveInfo.loadIcon(this.b));
                textView.setText(resolveInfo.loadLabel(this.b));
            }
        } else {
            ResolveInfo resolveInfo2 = this.a.get(i);
            imageView.setImageDrawable(resolveInfo2.loadIcon(this.b));
            textView.setText(resolveInfo2.loadLabel(this.b));
        }
        return view;
    }
}
