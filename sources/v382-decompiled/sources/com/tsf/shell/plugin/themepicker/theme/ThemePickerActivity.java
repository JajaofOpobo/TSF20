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
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.ai;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ThemePickerActivity extends IconPickerActivity implements View.OnClickListener, AdapterView.OnItemClickListener, ai {
    public static String t = "selected_package_name";
    private List u;

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity
    protected void g() {
        r = (SildingMenuLayout) getLayoutInflater().inflate(p.activity_theme_picker_with_sliding_menu_ok, (ViewGroup) null);
        setContentView(r);
        ac.a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, com.tsf.shell.plugin.themepicker.ai
    public void a(List list) {
        b(list);
        this.u = list;
        d dVar = new d(f(), list, this);
        this.n = (ViewPager) findViewById(n.pager);
        this.n.setAdapter(dVar);
        this.p = (ListView) findViewById(n.menu_listview);
        this.q = new e(this, list, getPackageManager(), true);
        this.p.setAdapter((ListAdapter) this.q);
        this.p.setOnItemClickListener(this);
        this.o = (TitlePageIndicator) findViewById(n.indicator);
        this.o.setViewPager(this.n);
        findViewById(n.imageView1).setOnClickListener(this);
        r.findViewById(n.linearLayout1).setOnClickListener(this);
    }

    private void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                list.remove(resolveInfo);
                return;
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.n.setCurrentItem(i);
        r.a();
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.imageView1) {
            r.a();
            return;
        }
        if (view.getId() == n.linearLayout1) {
            int currentItem = this.n.getCurrentItem();
            if (currentItem == 0) {
                b("");
            } else {
                b(((ResolveInfo) this.u.get(currentItem - 1)).activityInfo.packageName);
            }
        }
    }

    public void b(String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(t, str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
