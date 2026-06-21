package com.tsf.shell.widget.alarm.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.ab;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import java.util.ArrayList;

/* loaded from: classes.dex */
class e extends BaseAdapter {
    ArrayList a = new ArrayList();
    final /* synthetic */ PlaceSearchActivity b;

    public e(PlaceSearchActivity placeSearchActivity) {
        this.b = placeSearchActivity;
    }

    public void a(ArrayList arrayList) {
        if (arrayList == null) {
            this.a.clear();
        } else {
            this.a.clear();
            this.a = null;
            this.a = arrayList;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
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
            view = LayoutInflater.from(SettingActivity.a).inflate(ad.list_item_icon, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(ac.imageView1);
        com.tsf.shell.widget.alarm.d.a aVar = (com.tsf.shell.widget.alarm.d.a) this.a.get(i);
        a(String.valueOf(aVar.a) + "," + aVar.b, view);
        view.setTag(this.a.get(i));
        imageView.setImageResource(ab.activity_list_city_ico);
        return view;
    }

    private void a(String str, View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(str);
    }
}
