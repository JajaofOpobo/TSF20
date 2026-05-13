package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3864g;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import java.util.List;
/* loaded from: classes.dex */
public class WallpaperPickerActivity extends FragmentActivity implements View.OnClickListener, AdapterView.OnItemClickListener, SildingMenuLayout.InterfaceC3844d, C3897k.InterfaceC3904f {

    /* renamed from: m */
    protected ViewPager f12967m;

    /* renamed from: n */
    protected TitlePageIndicator f12968n;

    /* renamed from: o */
    protected ListView f12969o;

    /* renamed from: p */
    protected C3864g f12970p;

    /* renamed from: q */
    private SildingMenuLayout f12971q;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        C3851e.m1317b("IconPickerActivity onCreate");
        m1002g();
        super.onCreate(bundle);
    }

    /* renamed from: g */
    protected void m1002g() {
        this.f12971q = (SildingMenuLayout) getLayoutInflater().inflate(C3852f.C3860h.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(this.f12971q);
        C3897k.m1229b(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3904f
    /* renamed from: a */
    public void mo1003a(List<ResolveInfo> list) {
        C3962c c3962c = new C3962c(m13715f(), list, this);
        this.f12967m = (ViewPager) findViewById(C3852f.C3858f.pager);
        this.f12967m.setAdapter(c3962c);
        this.f12969o = (ListView) findViewById(C3852f.C3858f.menu_listview);
        this.f12970p = new C3864g(this, list, getPackageManager(), false);
        this.f12969o.setAdapter((ListAdapter) this.f12970p);
        this.f12969o.setOnItemClickListener(this);
        this.f12968n = (TitlePageIndicator) findViewById(C3852f.C3858f.indicator);
        this.f12968n.setViewPager(this.f12967m);
        findViewById(C3852f.C3858f.imageView1).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.imageView1) {
            this.f12971q.m1337a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f12967m.setCurrentItem(i);
        this.f12971q.m1337a();
    }

    @Override // com.tsf.shell.plugin.themepicker.SildingMenuLayout.InterfaceC3844d
    /* renamed from: h */
    public void mo1001h() {
        this.f12971q.m1337a();
    }
}
