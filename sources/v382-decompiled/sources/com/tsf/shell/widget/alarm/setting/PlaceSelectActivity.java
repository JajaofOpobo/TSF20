package com.tsf.shell.widget.alarm.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
public class PlaceSelectActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private g a;
    private ListView b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ad.activity_place_select_layout);
        findViewById(ac.relativeLayout1).setOnClickListener(this);
        this.a = new g(this);
        this.b = (ListView) findViewById(ac.searchcity_list);
        this.b.setAdapter((ListAdapter) this.a);
        this.b.setOnItemClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == ac.relativeLayout1) {
            Intent intent = new Intent();
            intent.setClass(this, PlaceSearchActivity.class);
            startActivity(intent);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            a(null);
        } else {
            a((com.tsf.shell.widget.alarm.d.a) view.getTag());
        }
    }

    private void a(com.tsf.shell.widget.alarm.d.a aVar) {
        if (aVar == null) {
            u.c("PositionOnChange item null");
            j.a = true;
        } else {
            u.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            j.a = false;
            j.c = aVar.a;
            j.d = aVar.c;
            d.a(aVar);
        }
        j.a(this).c();
        finish();
    }
}
