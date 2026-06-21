package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public class x extends BaseAdapter {
    protected List a;
    protected PackageManager b;
    protected Context c;
    protected boolean d;

    public x(Context context, List list, PackageManager packageManager, boolean z) {
        this.c = context;
        this.b = packageManager;
        this.a = list;
        this.d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d ? this.a.size() + 1 : this.a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(p.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(n.imageView1);
        TextView textView = (TextView) view.findViewById(n.textView1);
        if (this.d) {
            if (i == 0) {
                imageView.setImageResource(m.ic_launcher_wallpaper);
                textView.setText(r.theme_picker_theme_picker_gallery_apps);
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
