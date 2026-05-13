package com.tsf.shell.widget.alarm.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.widget.alarm.setting.a */
/* loaded from: classes.dex */
public class C4362a extends BaseAdapter {

    /* renamed from: a */
    ArrayList<C4284a> f14119a = new ArrayList<>();

    /* renamed from: b */
    private boolean f14120b = false;

    public C4362a() {
        m151a();
    }

    /* renamed from: a */
    public void m149a(ArrayList<C4284a> arrayList) {
        this.f14119a.clear();
        this.f14119a = null;
        this.f14119a = arrayList;
        notifyDataSetChanged();
        this.f14120b = false;
    }

    /* renamed from: a */
    public void m151a() {
        if (!this.f14120b) {
            this.f14119a.clear();
            this.f14119a = C4370d.m121a();
            notifyDataSetChanged();
            this.f14120b = true;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14119a.size() + 1;
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
            view = LayoutInflater.from(SettingActivity.f14091a).inflate(C4314m.C4318d.list_item_icon, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(C4314m.C4317c.imageView1);
        if (i == 0) {
            m150a(SettingActivity.f14091a.getString(C4314m.C4320f.autosetmylocation), view);
            imageView.setImageResource(C4314m.C4316b.activity_list_location_ico);
        } else {
            C4284a c4284a = this.f14119a.get(i - 1);
            m150a(c4284a.f13881a + "," + c4284a.f13882b, view);
            view.setTag(this.f14119a.get(i - 1));
            imageView.setImageResource(C4314m.C4316b.activity_list_city_ico);
        }
        return view;
    }

    /* renamed from: a */
    private void m150a(String str, View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(str);
    }
}
