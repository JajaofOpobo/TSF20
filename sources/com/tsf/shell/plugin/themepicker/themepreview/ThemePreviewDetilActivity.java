package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.AbstractC0105r;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import android.support.p013v7.widget.C0758q;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator;
import com.tsf.shell.plugin.themepicker.themepreview.C3918b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemePreviewDetilActivity extends FragmentActivity implements View.OnClickListener {

    /* renamed from: m */
    private static C3918b f12823m;

    /* renamed from: n */
    private LinePageIndicator f12824n;

    /* renamed from: o */
    private String f12825o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        C3851e.m1317b("ThemePreviewDetilActivity onCreate");
        m1192h();
        super.onCreate(bundle);
    }

    /* renamed from: h */
    private void m1192h() {
        setContentView(C3852f.C3860h.theme_preview_detil_activity);
        f12823m = new C3918b(this, (int) TypedValue.applyDimension(1, 160.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, getResources().getDisplayMetrics()));
        this.f12825o = getIntent().getStringExtra("packagename");
        C3851e.m1317b("Start Activity get Para:" + this.f12825o);
        C3915a c3915a = new C3915a(m13715f(), C3897k.m1238a(C3897k.m1236a(this, this.f12825o)), this.f12825o);
        ViewPager viewPager = (ViewPager) findViewById(C3852f.C3858f.pager);
        viewPager.setAdapter(c3915a);
        this.f12824n = (LinePageIndicator) findViewById(C3852f.C3858f.indicator);
        this.f12824n.setViewPager(viewPager);
        ((TextView) findViewById(C3852f.C3858f.textView1)).setText(m1195a(this.f12825o));
        findViewById(C3852f.C3858f.menu).setOnClickListener(this);
        findViewById(C3852f.C3858f.done).setOnClickListener(this);
    }

    /* renamed from: a */
    private CharSequence m1195a(String str) {
        try {
            return getPackageManager().getPackageInfo(str, 0).applicationInfo.loadLabel(getPackageManager());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.ThemePreviewDetilActivity$a */
    /* loaded from: classes.dex */
    public class C3915a extends AbstractC0105r {

        /* renamed from: b */
        private ArrayList<Integer> f12828b;

        /* renamed from: c */
        private String f12829c;

        public C3915a(AbstractC0094o abstractC0094o, ArrayList<Integer> arrayList, String str) {
            super(abstractC0094o);
            this.f12828b = arrayList;
            this.f12829c = str;
        }

        @Override // android.support.p002v4.app.AbstractC0105r
        /* renamed from: a */
        public Fragment mo990a(int i) {
            return C3916b.m1187a(this.f12829c, this.f12828b.get(i));
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: b */
        public int mo938b() {
            if (this.f12828b != null) {
                return this.f12828b.size();
            }
            return 0;
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.ThemePreviewDetilActivity$b */
    /* loaded from: classes.dex */
    public static class C3916b extends Fragment {
        /* renamed from: a */
        public static C3916b m1187a(String str, Integer num) {
            C3916b c3916b = new C3916b();
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            bundle.putInt("resource", num.intValue());
            c3916b.m13748g(bundle);
            return c3916b;
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C3852f.C3860h.theme_preview_detil_fragment_image, viewGroup, false);
            int intValue = ((Integer) m13747h().get("resource")).intValue();
            ThemePreviewDetilActivity.f12823m.m1037a(new C3918b.C3919a((String) m13747h().get("packagename"), intValue), (ImageView) viewGroup2.findViewById(C3852f.C3858f.imageView1));
            return viewGroup2;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C3852f.C3858f.menu) {
            m1197a(view);
        } else if (id == C3852f.C3858f.done) {
            m1191i();
        }
    }

    /* renamed from: i */
    private void m1191i() {
        Intent intent = new Intent();
        intent.putExtra("packagename", this.f12825o);
        intent.putExtra("oper", 1);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    private void m1197a(View view) {
        C0758q c0758q = new C0758q(this, view);
        c0758q.m11119a().add(0, 0, 0, C3852f.C3862j.theme_picker_delete_target_uninstall_label);
        c0758q.m11119a().add(0, 1, 0, C3852f.C3862j.theme_picker_info_target_label);
        c0758q.m11115a(new C0758q.InterfaceC0760b() { // from class: com.tsf.shell.plugin.themepicker.themepreview.ThemePreviewDetilActivity.1
            @Override // android.support.p013v7.widget.C0758q.InterfaceC0760b
            /* renamed from: a */
            public boolean mo1188a(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    ThemePreviewDetilActivity.this.m1190j();
                } else if (itemId == 1) {
                    ThemePreviewDetilActivity.this.m1189k();
                }
                return true;
            }
        });
        c0758q.m11113b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m1190j() {
        m1198a(this, this.f12825o);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m1189k() {
        C3917a c3917a = new C3917a();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", this.f12825o);
        c3917a.m13748g(bundle);
        c3917a.m13634a(m13715f().mo13569a(), "dialog");
    }

    /* renamed from: a */
    private void m1198a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)));
    }
}
