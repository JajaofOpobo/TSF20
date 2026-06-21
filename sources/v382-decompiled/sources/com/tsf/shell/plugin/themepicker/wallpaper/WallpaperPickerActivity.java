package com.tsf.shell.plugin.themepicker.wallpaper;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.ai;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.w;
import com.tsf.shell.plugin.themepicker.x;
import java.util.List;

/* loaded from: classes.dex */
public class WallpaperPickerActivity extends FragmentActivity implements View.OnClickListener, AdapterView.OnItemClickListener, ai, w {
    protected ViewPager n;
    protected TitlePageIndicator o;
    protected ListView p;
    protected x q;
    private SildingMenuLayout r;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        g.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    protected void g() {
        this.r = (SildingMenuLayout) getLayoutInflater().inflate(p.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(this.r);
        ac.b(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.ai
    public void a(List list) {
        d dVar = new d(f(), list, this);
        this.n = (ViewPager) findViewById(n.pager);
        this.n.setAdapter(dVar);
        this.p = (ListView) findViewById(n.menu_listview);
        this.q = new x(this, list, getPackageManager(), false);
        this.p.setAdapter((ListAdapter) this.q);
        this.p.setOnItemClickListener(this);
        this.o = (TitlePageIndicator) findViewById(n.indicator);
        this.o.setViewPager(this.n);
        findViewById(n.imageView1).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.imageView1) {
            this.r.a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.n.setCurrentItem(i);
        this.r.a();
    }

    @Override // com.tsf.shell.plugin.themepicker.w
    public void h() {
        this.r.a();
    }
}
