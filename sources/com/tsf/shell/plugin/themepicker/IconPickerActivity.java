package com.tsf.shell.plugin.themepicker;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.plugin.crop.CropImageActivity;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator;
import java.util.List;
/* loaded from: classes.dex */
public class IconPickerActivity extends FragmentActivity implements View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, SildingMenuLayout.InterfaceC3844d, C3897k.InterfaceC3904f {

    /* renamed from: q */
    public static SildingMenuLayout f12589q;

    /* renamed from: m */
    protected ViewPager f12590m;

    /* renamed from: n */
    protected TitlePageIndicator f12591n;

    /* renamed from: o */
    protected ListView f12592o;

    /* renamed from: p */
    protected C3864g f12593p;

    /* renamed from: r */
    long f12594r = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        C3851e.m1317b("IconPickerActivity onCreate");
        mo1209g();
        super.onCreate(bundle);
    }

    /* renamed from: g */
    protected void mo1209g() {
        f12589q = (SildingMenuLayout) getLayoutInflater().inflate(C3852f.C3860h.activity_theme_picker_with_sliding_menu, (ViewGroup) null);
        setContentView(f12589q);
        C3897k.m1237a(this, this);
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3904f
    /* renamed from: a */
    public void mo1003a(List<ResolveInfo> list) {
        m1338b(list);
        C3849c c3849c = new C3849c(m13715f(), list, this);
        this.f12590m = (ViewPager) findViewById(C3852f.C3858f.pager);
        this.f12590m.setAdapter(c3849c);
        this.f12592o = (ListView) findViewById(C3852f.C3858f.menu_listview);
        this.f12593p = new C3864g(this, list, getPackageManager(), true);
        this.f12592o.setAdapter((ListAdapter) this.f12593p);
        this.f12592o.setOnItemClickListener(this);
        this.f12591n = (TitlePageIndicator) findViewById(C3852f.C3858f.indicator);
        this.f12591n.setViewPager(this.f12590m);
        findViewById(C3852f.C3858f.imageView1).setOnClickListener(this);
    }

    /* renamed from: b */
    private void m1338b(List<ResolveInfo> list) {
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                list.remove(resolveInfo);
                return;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        C3851e.m1315c("", "mPager onPreDraw" + (System.currentTimeMillis() - this.f12594r));
        this.f12594r = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.imageView1) {
            f12589q.m1337a();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f12590m.setCurrentItem(i);
        f12589q.m1337a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
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
                    C3851e.m1317b("uri is null");
                    return;
                case 101:
                    Bundle extras = intent.getExtras();
                    Bitmap bitmap = null;
                    if (extras != null) {
                        bitmap = (Bitmap) extras.getParcelable("data");
                    }
                    m1339a(bitmap);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void m1339a(Bitmap bitmap) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", bitmap);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // com.tsf.shell.plugin.themepicker.SildingMenuLayout.InterfaceC3844d
    /* renamed from: h */
    public void mo1001h() {
        f12589q.m1337a();
    }
}
