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
import com.tsf.shell.plugin.themepicker.ThemePickerResources;
import com.tsf.shell.plugin.themepicker.ThemePickerManagerndicator.TitlePageIndicator;
import com.tsf.shell.plugin.themepicker.ThemePickerRenderer;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class IconPickerActivity extends FragmentActivity implements View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, SildingMenuLayout.d, ThemePickerRenderer.f {
    public static SildingMenuLayout q;
    protected ViewPager m;
    protected TitlePageIndicator n;
    protected ListView o;
    protected g p;
    long r = 0;

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ThemePickerEvent.b("IconPickerActivity onCreate");
        IconPickerActivity();
        super.onCreate(bundle);
    }

    protected void g() {
        q = (SildingMenuLayout) getLayoutInflater().inflate(ThemePickerResources.h.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(q);
        ThemePickerRenderer.a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.ThemePickerRenderer.f
    public void a(List<ResolveInfo> list) {
        b(list);
        c cVar = new ThemePickerConfig(f(), list, this);
        this.m = (ViewPager) findViewById(ThemePickerResources.C0155ThemePickerResources.pager);
        this.m.setAdapter(cVar);
        this.o = (ListView) findViewById(ThemePickerResources.C0155ThemePickerResources.menu_listview);
        this.p = new ThemePickerState(this, list, getPackageManager(), true);
        this.o.setAdapter((ListAdapter) this.p);
        this.o.setOnItemClickListener(this);
        this.n = (TitlePageIndicator) findViewById(ThemePickerResources.C0155ThemePickerResources.indicator);
        this.n.setViewPager(this.m);
        findViewById(ThemePickerResources.C0155ThemePickerResources.imageView1).setOnClickListener(this);
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
        ThemePickerEvent.c("", "mPager onPreDraw" + (System.currentTimeMillis() - this.r));
        this.r = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == ThemePickerResources.C0155ThemePickerResources.imageView1) {
            q.a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.m.setCurrentItem(i);
        q.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
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
                    } else {
                        ThemePickerEvent.b("uri is null");
                    }
                    break;
                case 101:
                    Bundle extras = intent.getExtras();
                    Bitmap bitmap = null;
                    if (extras != null) {
                        bitmap = (Bitmap) extras.getParcelable("data");
                    }
                    a(bitmap);
                    break;
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
