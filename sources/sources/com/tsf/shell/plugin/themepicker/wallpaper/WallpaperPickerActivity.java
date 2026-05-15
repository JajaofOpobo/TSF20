package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.k;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperPickerActivity extends FragmentActivity implements View.OnClickListener, AdapterView.OnItemClickListener, SildingMenuLayout.d, k.f {
    protected ViewPager m;
    protected TitlePageIndicator n;
    protected ListView o;
    protected g p;
    private SildingMenuLayout q;

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        e.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    protected void g() {
        this.q = (SildingMenuLayout) getLayoutInflater().inflate(f.h.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(this.q);
        k.b(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.k.f
    public void a(List<ResolveInfo> list) {
        c cVar = new c(f(), list, this);
        this.m = (ViewPager) findViewById(f.C0155f.pager);
        this.m.setAdapter(cVar);
        this.o = (ListView) findViewById(f.C0155f.menu_listview);
        this.p = new g(this, list, getPackageManager(), false);
        this.o.setAdapter((ListAdapter) this.p);
        this.o.setOnItemClickListener(this);
        this.n = (TitlePageIndicator) findViewById(f.C0155f.indicator);
        this.n.setViewPager(this.m);
        findViewById(f.C0155f.imageView1).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.imageView1) {
            this.q.a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.m.setCurrentItem(i);
        this.q.a();
    }

    @Override // com.tsf.shell.plugin.themepicker.SildingMenuLayout.d
    public void h() {
        this.q.a();
    }
}
