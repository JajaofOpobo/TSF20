package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.r;

/* loaded from: classes.dex */
public class ThemePreviewDetilActivity extends FragmentActivity implements View.OnClickListener {
    private static d n;
    private LinePageIndicator o;
    private String p;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewDetilActivity onCreate");
        h();
        super.onCreate(bundle);
    }

    private void h() {
        setContentView(p.theme_preview_detil_activity);
        n = new d(this, (int) TypedValue.applyDimension(1, 160.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, getResources().getDisplayMetrics()));
        this.p = getIntent().getStringExtra("packagename");
        com.tsf.shell.plugin.themepicker.g.b("Start Activity get Para:" + this.p);
        b bVar = new b(this, f(), ac.a(ac.a(this, this.p)), this.p);
        ViewPager viewPager = (ViewPager) findViewById(n.pager);
        viewPager.setAdapter(bVar);
        this.o = (LinePageIndicator) findViewById(n.indicator);
        this.o.setViewPager(viewPager);
        ((TextView) findViewById(n.textView1)).setText(b(this.p));
        findViewById(n.menu).setOnClickListener(this);
        findViewById(n.done).setOnClickListener(this);
    }

    private CharSequence b(String str) {
        try {
            return getPackageManager().getPackageInfo(str, 0).applicationInfo.loadLabel(getPackageManager());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == n.menu) {
            a(view);
        } else if (id == n.done) {
            i();
        }
    }

    private void i() {
        Intent intent = new Intent();
        intent.putExtra("packagename", this.p);
        intent.putExtra("oper", 1);
        setResult(-1, intent);
        finish();
    }

    private void a(View view) {
        android.support.v7.widget.g gVar = new android.support.v7.widget.g(this, view);
        gVar.a().add(0, 0, 0, r.theme_picker_delete_target_uninstall_label);
        gVar.a().add(0, 1, 0, r.theme_picker_info_target_label);
        gVar.a(new android.support.v7.widget.i() { // from class: com.tsf.shell.plugin.themepicker.themepreview.ThemePreviewDetilActivity.1
            @Override // android.support.v7.widget.i
            public boolean a(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId != 0) {
                    if (itemId == 1) {
                        ThemePreviewDetilActivity.this.k();
                    }
                } else {
                    ThemePreviewDetilActivity.this.j();
                }
                return true;
            }
        });
        gVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        a(this, this.p);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", this.p);
        aVar.g(bundle);
        aVar.a(f().a(), "dialog");
    }

    private void a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
    }
}
