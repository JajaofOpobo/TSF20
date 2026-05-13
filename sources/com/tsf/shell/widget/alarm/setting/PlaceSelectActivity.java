package com.tsf.shell.widget.alarm.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PlaceSelectActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private C4351a f14087a;

    /* renamed from: b */
    private ListView f14088b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4314m.C4318d.activity_place_select_layout);
        findViewById(C4314m.C4317c.relativeLayout1).setOnClickListener(this);
        this.f14087a = new C4351a();
        this.f14088b = (ListView) findViewById(C4314m.C4317c.searchcity_list);
        this.f14088b.setAdapter((ListAdapter) this.f14087a);
        this.f14088b.setOnItemClickListener(this);
    }

    /* renamed from: com.tsf.shell.widget.alarm.setting.PlaceSelectActivity$a */
    /* loaded from: classes.dex */
    class C4351a extends BaseAdapter {

        /* renamed from: a */
        ArrayList<C4284a> f14089a = new ArrayList<>();

        public C4351a() {
            m175a();
        }

        /* renamed from: a */
        public void m175a() {
            this.f14089a.clear();
            this.f14089a = C4370d.m121a();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f14089a.size() + 1;
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
                m174a(SettingActivity.f14091a.getString(C4314m.C4320f.autosetmylocation), view);
                imageView.setImageResource(C4314m.C4316b.activity_list_location_ico);
            } else {
                C4284a c4284a = this.f14089a.get(i - 1);
                m174a(c4284a.f13881a + "," + c4284a.f13882b, view);
                view.setTag(this.f14089a.get(i - 1));
                imageView.setImageResource(C4314m.C4316b.activity_list_city_ico);
            }
            return view;
        }

        /* renamed from: a */
        private void m174a(String str, View view) {
            ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C4314m.C4317c.relativeLayout1) {
            Intent intent = new Intent();
            intent.setClass(this, PlaceSearchActivity.class);
            startActivity(intent);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            m176a(null);
        } else {
            m176a((C4284a) view.getTag());
        }
    }

    /* renamed from: a */
    private void m176a(C4284a c4284a) {
        if (c4284a == null) {
            C4305i.m259c("PositionOnChange item null");
            C4371e.f14137a = true;
        } else {
            C4305i.m259c("PositionOnChange item " + c4284a.f13881a + " code:" + c4284a.f13883c);
            C4371e.f14137a = false;
            C4371e.f14139c = c4284a.f13881a;
            C4371e.f14140d = c4284a.f13883c;
            C4370d.m120a(c4284a);
        }
        C4371e.m118a(this).m116c();
        finish();
    }
}
