package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.app.r;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.q;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.themepreview.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemePreviewDetilActivity extends FragmentActivity implements View.OnClickListener {
    private static com.tsf.shell.plugin.themepicker.themepreview.b m;
    private LinePageIndicator n;
    private String o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewDetilActivity onCreate");
        h();
        super.onCreate(bundle);
    }

    private void h() {
        setContentView(f.h.theme_preview_detil_activity);
        m = new com.tsf.shell.plugin.themepicker.themepreview.b(this, (int) TypedValue.applyDimension(1, 160.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, getResources().getDisplayMetrics()));
        this.o = getIntent().getStringExtra("packagename");
        com.tsf.shell.plugin.themepicker.e.b("Start Activity get Para:" + this.o);
        a aVar = new a(f(), k.a(k.a(this, this.o)), this.o);
        ViewPager viewPager = (ViewPager) findViewById(f.C0155f.pager);
        viewPager.setAdapter(aVar);
        this.n = (LinePageIndicator) findViewById(f.C0155f.indicator);
        this.n.setViewPager(viewPager);
        ((TextView) findViewById(f.C0155f.textView1)).setText(a(this.o));
        findViewById(f.C0155f.menu).setOnClickListener(this);
        findViewById(f.C0155f.done).setOnClickListener(this);
    }

    private CharSequence a(String str) {
        try {
            return getPackageManager().getPackageInfo(str, 0).applicationInfo.loadLabel(getPackageManager());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends r {
        private ArrayList<Integer> b;
        private String c;

        public a(o oVar, ArrayList<Integer> arrayList, String str) {
            super(oVar);
            this.b = arrayList;
            this.c = str;
        }

        @Override // android.support.v4.app.r
        public Fragment a(int i) {
            return b.a(this.c, this.b.get(i));
        }

        @Override // android.support.v4.view.ac
        public int b() {
            if (this.b != null) {
                return this.b.size();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Fragment {
        public static b a(String str, Integer num) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            bundle.putInt("resource", num.intValue());
            bVar.g(bundle);
            return bVar;
        }

        @Override // android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // android.support.v4.app.Fragment
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(f.h.theme_preview_detil_fragment_image, viewGroup, false);
            int intValue = ((Integer) h().get("resource")).intValue();
            ThemePreviewDetilActivity.m.a(new b.a((String) h().get("packagename"), intValue), (ImageView) viewGroup2.findViewById(f.C0155f.imageView1));
            return viewGroup2;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.C0155f.menu) {
            a(view);
        } else if (id == f.C0155f.done) {
            i();
        }
    }

    private void i() {
        Intent intent = new Intent();
        intent.putExtra("packagename", this.o);
        intent.putExtra("oper", 1);
        setResult(-1, intent);
        finish();
    }

    private void a(View view) {
        q qVar = new q(this, view);
        qVar.a().add(0, 0, 0, f.j.theme_picker_delete_target_uninstall_label);
        qVar.a().add(0, 1, 0, f.j.theme_picker_info_target_label);
        qVar.a(new q.b() { // from class: com.tsf.shell.plugin.themepicker.themepreview.ThemePreviewDetilActivity.1
            @Override // android.support.v7.widget.q.b
            public boolean a(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    ThemePreviewDetilActivity.this.j();
                } else if (itemId == 1) {
                    ThemePreviewDetilActivity.this.k();
                }
                return true;
            }
        });
        qVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        a(this, this.o);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        com.tsf.shell.plugin.themepicker.themepreview.a aVar = new com.tsf.shell.plugin.themepicker.themepreview.a();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", this.o);
        aVar.g(bundle);
        aVar.a(f().a(), "dialog");
    }

    private void a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
    }
}
