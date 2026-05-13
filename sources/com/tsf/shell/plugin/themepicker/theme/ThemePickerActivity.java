package com.tsf.shell.plugin.themepicker.theme;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p002v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.IconPickerActivity;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import java.util.List;
/* loaded from: classes.dex */
public class ThemePickerActivity extends IconPickerActivity implements View.OnClickListener, AdapterView.OnItemClickListener, C3897k.InterfaceC3904f {

    /* renamed from: s */
    public static String f12802s = "selected_package_name";

    /* renamed from: t */
    private List<ResolveInfo> f12803t;

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity
    /* renamed from: g */
    protected void mo1209g() {
        f12589q = (SildingMenuLayout) getLayoutInflater().inflate(C3852f.C3860h.activity_theme_picker_with_sliding_menu_ok, (ViewGroup) null);
        setContentView(f12589q);
        C3897k.m1237a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3904f
    /* renamed from: a */
    public void mo1003a(List<ResolveInfo> list) {
        m1210b(list);
        this.f12803t = list;
        C3912c c3912c = new C3912c(m13715f(), list, this);
        this.f12590m = (ViewPager) findViewById(C3852f.C3858f.pager);
        this.f12590m.setAdapter(c3912c);
        this.f12592o = (ListView) findViewById(C3852f.C3858f.menu_listview);
        this.f12593p = new C3913d(this, list, getPackageManager(), true);
        this.f12592o.setAdapter((ListAdapter) this.f12593p);
        this.f12592o.setOnItemClickListener(this);
        this.f12591n = (TitlePageIndicator) findViewById(C3852f.C3858f.indicator);
        this.f12591n.setViewPager(this.f12590m);
        findViewById(C3852f.C3858f.imageView1).setOnClickListener(this);
        f12589q.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
    }

    /* renamed from: b */
    private void m1210b(List<ResolveInfo> list) {
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                list.remove(resolveInfo);
                return;
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f12590m.setCurrentItem(i);
        f12589q.m1337a();
    }

    @Override // com.tsf.shell.plugin.themepicker.IconPickerActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.imageView1) {
            f12589q.m1337a();
        } else if (view.getId() == C3852f.C3858f.linearLayout1) {
            int currentItem = this.f12590m.getCurrentItem();
            if (currentItem == 0) {
                m1211a("");
            } else {
                m1211a(this.f12803t.get(currentItem - 1).activityInfo.packageName);
            }
        }
    }

    /* renamed from: a */
    public void m1211a(String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(f12802s, str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
