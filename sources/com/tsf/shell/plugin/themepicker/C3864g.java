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
import com.tsf.shell.plugin.themepicker.C3852f;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.g */
/* loaded from: classes.dex */
public class C3864g extends BaseAdapter {

    /* renamed from: a */
    protected List<ResolveInfo> f12647a;

    /* renamed from: b */
    protected PackageManager f12648b;

    /* renamed from: c */
    protected Context f12649c;

    /* renamed from: d */
    protected boolean f12650d;

    public C3864g(Context context, List<ResolveInfo> list, PackageManager packageManager, boolean z) {
        this.f12649c = context;
        this.f12648b = packageManager;
        this.f12647a = list;
        this.f12650d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f12650d ? this.f12647a.size() + 1 : this.f12647a.size();
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
            view = LayoutInflater.from(this.f12649c).inflate(C3852f.C3860h.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(C3852f.C3858f.imageView1);
        TextView textView = (TextView) view.findViewById(C3852f.C3858f.textView1);
        if (this.f12650d) {
            if (i == 0) {
                imageView.setImageResource(C3852f.C3857e.ic_launcher_wallpaper);
                textView.setText(C3852f.C3862j.theme_picker_theme_picker_gallery_apps);
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
