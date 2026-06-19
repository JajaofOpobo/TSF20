package com.tsf.shell.widget.alarm.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.AlarmResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmSettingAdapter extends BaseAdapter {
    ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> a = new ArrayList<>();
    private boolean b = false;

    public AlarmSettingAdapter() {
        AlarmSettingAdapter();
    }

    public void a(ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> arrayList) {
        this.a.clear();
        this.a = null;
        this.a = arrayList;
        notifyDataSetChanged();
        this.b = false;
    }

    public void a() {
        if (!this.b) {
            this.a.clear();
            this.a = AlarmSettingData.a();
            notifyDataSetChanged();
            this.b = true;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size() + 1;
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
            view = LayoutInflater.from(SettingActivity.a).inflate(m.d.list_item_icon, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(m.c.imageView1);
        if (i == 0) {
            a(SettingActivity.a.getString(m.f.autosetmylocation), view);
            imageView.setImageResource(m.b.activity_list_location_ico);
        } else {
            com.tsf.shell.widget.alarm.d.AlarmConfigEmpty aVar = this.a.get(i - 1);
            a(aVar.a + "," + aVar.b, view);
            view.setTag(this.a.get(i - 1));
            imageView.setImageResource(m.b.activity_list_city_ico);
        }
        return view;
    }

    private void a(String str, View view) {
        ((TextView) view.findViewById(m.c.textView1)).setText(str);
    }
}
