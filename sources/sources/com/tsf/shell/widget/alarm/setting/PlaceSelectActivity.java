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
import com.tsf.shell.widget.alarm.AlarmState;
import com.tsf.shell.widget.alarm.AlarmResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PlaceSelectActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private a a;
    private ListView b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.d.activity_place_select_layout);
        findViewById(m.c.relativeLayout1).setOnClickListener(this);
        this.a = new AlarmSettingAdapter();
        this.b = (ListView) findViewById(m.c.searchcity_list);
        this.b.setAdapter((ListAdapter) this.a);
        this.b.setOnItemClickListener(this);
    }

    class a extends BaseAdapter {
        ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> a = new ArrayList<>();

        public a() {
            a();
        }

        public void a() {
            this.a.clear();
            this.a = AlarmSettingData.a();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size() + 1;
        }

        @Override // android.widget.Adapter
        public class Object 
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public class View 
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == m.c.relativeLayout1) {
            Intent intent = new Intent();
            intent.setClass(this, PlaceSearchActivity.class);
            startActivity(intent);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            a(null);
        } else {
            a((com.tsf.shell.widget.alarm.d.AlarmConfigEmpty) view.getTag());
        }
    }

    private void a(com.tsf.shell.widget.alarm.d.AlarmConfigEmpty aVar) {
        if (aVar == null) {
            i.c("PositionOnChange item null");
            AlarmSettingTheme.a = true;
        } else {
            i.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            AlarmSettingTheme.a = false;
            AlarmSettingTheme.c = aVar.a;
            AlarmSettingTheme.d = aVar.c;
            AlarmSettingData.a(aVar);
        }
        AlarmSettingTheme.a(this).c();
        finish();
    }
}
