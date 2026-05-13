package com.tsf.shell.plugin.themepicker;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.crop.CropImageActivity;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.k;
import java.util.List;
/* loaded from: classes.dex */
public class IconPickerActivity extends FragmentActivity implements View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, SildingMenuLayout.d, k.f {
    public static SildingMenuLayout q;
    protected ViewPager m;
    protected TitlePageIndicator n;
    protected ListView o;
    protected g p;
    long r = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        e.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    protected void g() {
        q = (SildingMenuLayout) getLayoutInflater().inflate(f.h.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(q);
        k.a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.k.f
    public void a(List<ResolveInfo> list) {
        b(list);
        c cVar = new c(f(), list, this);
        this.m = (ViewPager) findViewById(f.C0155f.pager);
        this.m.setAdapter(cVar);
        this.o = (ListView) findViewById(f.C0155f.menu_listview);
        this.p = new g(this, list, getPackageManager(), true);
        this.o.setAdapter((ListAdapter) this.p);
        this.o.setOnItemClickListener(this);
        this.n = (TitlePageIndicator) findViewById(f.C0155f.indicator);
        this.n.setViewPager(this.m);
        findViewById(f.C0155f.imageView1).setOnClickListener(this);
    }

    private void b(List<ResolveInfo> list) {
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                list.remove(resolveInfo);
                return;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        e.c("", "mPager onPreDraw" + (System.currentTimeMillis() - this.r));
        this.r = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.imageView1) {
            q.a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.m.setCurrentItem(i);
        q.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case 100:
                    Uri data = intent.getData();
                    if (data != null) {
                        Intent intent2 = new Intent();
                        intent2.setClass(this, CropImageActivity.class);
                        intent2.setDataAndType(data, "image/*");
                        startActivityForResult(intent2, 101);
                        return;
                    }
                    e.b("uri is null");
                    return;
                case 101:
                    Bundle extras = intent.getExtras();
                    Bitmap bitmap = null;
                    if (extras != null) {
                        bitmap = (Bitmap) extras.getParcelable("data");
                    }
                    a(bitmap);
                    return;
                default:
                    return;
            }
        }
    }

    public void a(Bitmap bitmap) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", bitmap);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // com.tsf.shell.plugin.themepicker.SildingMenuLayout.d
    public void h() {
        q.a();
    }
}
