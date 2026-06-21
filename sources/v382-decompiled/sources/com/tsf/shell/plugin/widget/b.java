package com.tsf.shell.plugin.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
class b extends BaseAdapter {
    final /* synthetic */ FloatingWidgetPicker a;

    b(FloatingWidgetPicker floatingWidgetPicker) {
        this.a = floatingWidgetPicker;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.a.a.size() == 0) {
            return 0;
        }
        return ((a) this.a.a.get(FloatingWidgetPicker.b)).d.size();
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
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.plugin_floating_widget_picker_content_list_item, (ViewGroup) null);
        }
        ((ImageView) view.findViewById(R.id.imageView1)).setImageBitmap(((a) this.a.a.get(FloatingWidgetPicker.b)).a(i));
        return view;
    }
}
