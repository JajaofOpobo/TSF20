package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3864g;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.theme.d */
/* loaded from: classes.dex */
public class C3913d extends C3864g {
    public C3913d(Context context, List<ResolveInfo> list, PackageManager packageManager, boolean z) {
        super(context, list, packageManager, z);
    }

    @Override // com.tsf.shell.plugin.themepicker.C3864g, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f12649c).inflate(C3852f.C3860h.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(C3852f.C3858f.imageView1);
        TextView textView = (TextView) view.findViewById(C3852f.C3858f.textView1);
        if (this.f12650d) {
            if (i == 0) {
                imageView.setImageResource(C3852f.C3857e.theme_preview_tsf_ico);
                textView.setText(C3852f.C3862j.theme_picker_system);
            } else {
                ResolveInfo resolveInfo = this.f12647a.get(i - 1);
                imageView.setImageDrawable(resolveInfo.loadIcon(this.f12648b));
                textView.setText(resolveInfo.loadLabel(this.f12648b));
            }
        } else {
            ResolveInfo resolveInfo2 = this.f12647a.get(i);
            imageView.setImageDrawable(resolveInfo2.loadIcon(this.f12648b));
            textView.setText(resolveInfo2.loadLabel(this.f12648b));
        }
        return view;
    }
}
