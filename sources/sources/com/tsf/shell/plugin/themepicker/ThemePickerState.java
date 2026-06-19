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
import com.tsf.shell.plugin.themepicker.ThemePickerResources;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePickerState extends BaseAdapter {
    protected List<ResolveInfo> a;
    protected PackageManager b;
    protected Context c;
    protected boolean d;

    public ThemePickerState(Context context, List<ResolveInfo> list, PackageManager packageManager, boolean z) {
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
    public Object c() {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View c() {
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(ThemePickerResources.h.slid_menu_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(ThemePickerResources.C0155f.imageView1);
        TextView textView = (TextView) view.findViewById(ThemePickerResources.C0155f.textView1);
        if (this.d) {
            if (i == 0) {
                imageView.setImageResource(ThemePickerResources.e.ic_launcher_wallpaper);
                textView.setText(ThemePickerResources.j.theme_picker_theme_picker_gallery_apps);
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
