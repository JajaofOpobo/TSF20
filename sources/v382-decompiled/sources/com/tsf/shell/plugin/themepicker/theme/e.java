package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.m;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.r;
import com.tsf.shell.plugin.themepicker.x;
import java.util.List;

/* loaded from: classes.dex */
public class e extends x {
    public e(Context context, List list, PackageManager packageManager, boolean z) {
        super(context, list, packageManager, z);
    }

    @Override // com.tsf.shell.plugin.themepicker.x, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(p.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(n.imageView1);
        TextView textView = (TextView) view.findViewById(n.textView1);
        if (this.d) {
            if (i == 0) {
                imageView.setImageResource(m.theme_preview_tsf_ico);
                textView.setText(r.theme_picker_system);
            } else {
                ResolveInfo resolveInfo = (ResolveInfo) this.a.get(i - 1);
                imageView.setImageDrawable(resolveInfo.loadIcon(this.b));
                textView.setText(resolveInfo.loadLabel(this.b));
            }
        } else {
            ResolveInfo resolveInfo2 = (ResolveInfo) this.a.get(i);
            imageView.setImageDrawable(resolveInfo2.loadIcon(this.b));
            textView.setText(resolveInfo2.loadLabel(this.b));
        }
        return view;
    }
}
