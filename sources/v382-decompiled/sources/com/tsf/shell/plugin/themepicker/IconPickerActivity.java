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
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.plugin.crop.CropImageActivity;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class IconPickerActivity extends FragmentActivity implements View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, ai, w {
    public static SildingMenuLayout r;
    protected ViewPager n;
    protected TitlePageIndicator o;
    protected ListView p;
    protected x q;
    long s = 0;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        g.b("IconPickerActivity onCreate");
        g();
        super.onCreate(bundle);
    }

    protected void g() {
        r = (SildingMenuLayout) getLayoutInflater().inflate(p.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(r);
        ac.a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.ai
    public void a(List list) {
        b(list);
        e eVar = new e(f(), list, this);
        this.n = (ViewPager) findViewById(n.pager);
        this.n.setAdapter(eVar);
        this.p = (ListView) findViewById(n.menu_listview);
        this.q = new x(this, list, getPackageManager(), true);
        this.p.setAdapter((ListAdapter) this.q);
        this.p.setOnItemClickListener(this);
        this.o = (TitlePageIndicator) findViewById(n.indicator);
        this.o.setViewPager(this.n);
        findViewById(n.imageView1).setOnClickListener(this);
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

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        g.c("", "mPager onPreDraw" + (System.currentTimeMillis() - this.s));
        this.s = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.imageView1) {
            r.a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.n.setCurrentItem(i);
        r.a();
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
                        startActivityForResult(intent2, VEasing.Circ.easeOut);
                        break;
                    } else {
                        g.b("uri is null");
                        break;
                    }
                case VEasing.Circ.easeOut /* 101 */:
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

    @Override // com.tsf.shell.plugin.themepicker.w
    public void h() {
        r.a();
    }
}
