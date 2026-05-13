package com.tsf.shell.activity.actionselector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.AbstractC0104q;
import android.support.p002v4.app.C0114u;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.C1306b;
import com.tsf.shell.manager.action.C3392d;
/* loaded from: classes.dex */
public class ActionSelector extends FragmentActivity {

    /* renamed from: m */
    private String[] f7263m;

    /* renamed from: n */
    private SwipeyTabs f7264n;

    /* renamed from: o */
    private ViewPager f7265o;

    /* renamed from: p */
    private Intent f7266p;

    /* renamed from: q */
    private boolean f7267q = false;

    /* renamed from: r */
    private C3392d f7268r;

    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1306b.C1313g.action_selector);
        this.f7268r = new C3392d(this);
        this.f7263m = new String[4];
        this.f7263m[0] = getString(C1306b.C1315i.group_applications);
        this.f7263m[1] = getString(C1306b.C1315i.text_launcher);
        this.f7263m[2] = getString(C1306b.C1315i.group_toggle);
        this.f7263m[3] = getString(C1306b.C1315i.group_shortcuts);
        this.f7265o = (ViewPager) findViewById(C1306b.C1311e.viewpager);
        this.f7264n = (SwipeyTabs) findViewById(C1306b.C1311e.swipeytabs);
        C2217b c2217b = new C2217b(this, m13715f());
        this.f7265o.setAdapter(c2217b);
        this.f7264n.setAdapter(c2217b);
        this.f7265o.setOnPageChangeListener(this.f7264n);
        this.f7265o.setCurrentItem(1);
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        this.f7267q = intent.getBooleanExtra("EXTRA_NEED_ICON", false);
        if (parcelableExtra instanceof Intent) {
            this.f7266p = (Intent) parcelableExtra;
            return;
        }
        this.f7266p = new Intent("android.intent.action.MAIN", (Uri) null);
        this.f7266p.addCategory("android.intent.category.DEFAULT");
    }

    /* renamed from: g */
    public Intent m6074g() {
        return this.f7266p;
    }

    /* renamed from: h */
    public boolean m6073h() {
        return this.f7267q;
    }

    /* renamed from: com.tsf.shell.activity.actionselector.ActionSelector$b */
    /* loaded from: classes.dex */
    private class C2217b extends AbstractC0104q implements InterfaceC2220b {

        /* renamed from: b */
        private final Context f7272b;

        public C2217b(Context context, AbstractC0094o abstractC0094o) {
            super(abstractC0094o);
            this.f7272b = context;
        }

        @Override // android.support.p002v4.app.AbstractC0104q
        /* renamed from: a */
        public Fragment mo941a(int i) {
            C2216a c2216a = new C2216a();
            Bundle bundle = new Bundle();
            bundle.putInt("num", i);
            c2216a.m13748g(bundle);
            return c2216a;
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: b */
        public int mo938b() {
            return ActionSelector.this.f7263m.length;
        }

        @Override // com.tsf.shell.activity.actionselector.InterfaceC2220b
        /* renamed from: a */
        public TextView mo6061a(final int i, SwipeyTabs swipeyTabs) {
            TextView textView = (TextView) LayoutInflater.from(this.f7272b).inflate(C1306b.C1313g.swipey_tab_indicator, (ViewGroup) swipeyTabs, false);
            textView.setText(ActionSelector.this.f7263m[i]);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.activity.actionselector.ActionSelector.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActionSelector.this.f7265o.setCurrentItem(i);
                }
            });
            return textView;
        }
    }

    @SuppressLint({"ValidFragment"})
    /* renamed from: com.tsf.shell.activity.actionselector.ActionSelector$a */
    /* loaded from: classes.dex */
    private class C2216a extends C0114u {

        /* renamed from: ai */
        private int f7269ai;

        private C2216a() {
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
            this.f7269ai = m13747h() != null ? m13747h().getInt("num") : 1;
        }

        @Override // android.support.p002v4.app.C0114u, android.support.p002v4.app.Fragment
        /* renamed from: a */
        public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1306b.C1313g.fragment_pager_list, viewGroup, false);
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: d */
        public void mo6071d(Bundle bundle) {
            super.mo6071d(bundle);
            m13464a(ActionSelector.this.f7268r.m2660a(this.f7269ai));
        }

        @Override // android.support.p002v4.app.C0114u
        /* renamed from: a */
        public void mo6072a(ListView listView, View view, int i, long j) {
            ActionSelector.this.f7268r.m2659a(this.f7269ai, i);
        }
    }
}
