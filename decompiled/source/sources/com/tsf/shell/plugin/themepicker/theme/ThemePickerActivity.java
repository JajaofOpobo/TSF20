package com.tsf.shell.plugin.themepicker.theme;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.themepicker.IconPickerActivity;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.k;
import java.util.List;
/* loaded from: classes.dex */
public class ThemePickerActivity extends IconPickerActivity implements View.OnClickListener, AdapterView.OnItemClickListener, k.f {
    public static String s = "selected_package_name";
    private List<ResolveInfo> t;

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity
    protected void g() {
        q = (SildingMenuLayout) getLayoutInflater().inflate(f.h.activity_theme_picker_with_sliding_menu_ok, (ViewGroup) null);
        setContentView(q);
        k.a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, com.tsf.shell.plugin.themepicker.k.f
    public void a(List<ResolveInfo> list) {
        b(list);
        this.t = list;
        c cVar = new c(f(), list, this);
        this.m = (ViewPager) findViewById(f.C0155f.pager);
        this.m.setAdapter(cVar);
        this.o = (ListView) findViewById(f.C0155f.menu_listview);
        this.p = new d(this, list, getPackageManager(), true);
        this.o.setAdapter((ListAdapter) this.p);
        this.o.setOnItemClickListener(this);
        this.n = (TitlePageIndicator) findViewById(f.C0155f.indicator);
        this.n.setViewPager(this.m);
        findViewById(f.C0155f.imageView1).setOnClickListener(this);
        q.findViewById(f.C0155f.linearLayout1).setOnClickListener(this);
    }

    private void b(List<ResolveInfo> list) {
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                list.remove(resolveInfo);
                return;
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.m.setCurrentItem(i);
        q.a();
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.imageView1) {
            q.a();
        } else if (view.getId() == f.C0155f.linearLayout1) {
            int currentItem = this.m.getCurrentItem();
            if (currentItem == 0) {
                a("");
            } else {
                a(this.t.get(currentItem - 1).activityInfo.packageName);
            }
        }
    }

    public void a(String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(s, str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
