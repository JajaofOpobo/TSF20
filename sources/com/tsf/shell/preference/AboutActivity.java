package com.tsf.shell.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v4.app.AbstractC0104q;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.ViewPager;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.preference.widget.C4088a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class AboutActivity extends FragmentActivity {

    /* renamed from: m */
    TabHost f13064m;

    /* renamed from: n */
    ViewPager f13065n;

    /* renamed from: o */
    C3976a f13066o;

    /* renamed from: a */
    public static void m942a(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClass(C0853a.m10856d(), AboutActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1306b.C1313g.fragment_tabs_pager);
        this.f13064m = (TabHost) findViewById(16908306);
        this.f13064m.setup();
        this.f13065n = (ViewPager) findViewById(C1306b.C1311e.pager);
        this.f13066o = new C3976a(this, this.f13064m, this.f13065n);
        this.f13066o.m939a(this.f13064m.newTabSpec("translations").setIndicator(C4189x.m588c(C1306b.C1315i.text_translations)), C4088a.class, (Bundle) null);
        if (bundle != null) {
            this.f13064m.setCurrentTabByTag(bundle.getString("tab"));
        }
    }

    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("tab", this.f13064m.getCurrentTabTag());
    }

    /* renamed from: com.tsf.shell.preference.AboutActivity$a */
    /* loaded from: classes.dex */
    public static class C3976a extends AbstractC0104q implements ViewPager.InterfaceC0245e, TabHost.OnTabChangeListener {

        /* renamed from: a */
        private final Context f13067a;

        /* renamed from: b */
        private final TabHost f13068b;

        /* renamed from: c */
        private final ViewPager f13069c;

        /* renamed from: d */
        private final ArrayList<C3978b> f13070d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.preference.AboutActivity$a$b */
        /* loaded from: classes.dex */
        public static final class C3978b {

            /* renamed from: a */
            private final String f13072a;

            /* renamed from: b */
            private final Class<?> f13073b;

            /* renamed from: c */
            private final Bundle f13074c;

            C3978b(String str, Class<?> cls, Bundle bundle) {
                this.f13072a = str;
                this.f13073b = cls;
                this.f13074c = bundle;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.preference.AboutActivity$a$a */
        /* loaded from: classes.dex */
        public static class C3977a implements TabHost.TabContentFactory {

            /* renamed from: a */
            private final Context f13071a;

            public C3977a(Context context) {
                this.f13071a = context;
            }

            @Override // android.widget.TabHost.TabContentFactory
            public View createTabContent(String str) {
                View view = new View(this.f13071a);
                view.setMinimumWidth(0);
                view.setMinimumHeight(0);
                return view;
            }
        }

        public C3976a(FragmentActivity fragmentActivity, TabHost tabHost, ViewPager viewPager) {
            super(fragmentActivity.m13715f());
            this.f13070d = new ArrayList<>();
            this.f13067a = fragmentActivity;
            this.f13068b = tabHost;
            this.f13069c = viewPager;
            this.f13068b.setOnTabChangedListener(this);
            this.f13069c.setAdapter(this);
            this.f13069c.setOnPageChangeListener(this);
        }

        /* renamed from: a */
        public void m939a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
            tabSpec.setContent(new C3977a(this.f13067a));
            this.f13070d.add(new C3978b(tabSpec.getTag(), cls, bundle));
            this.f13068b.addTab(tabSpec);
            m12941c();
        }

        @Override // android.support.p002v4.view.AbstractC0299ac
        /* renamed from: b */
        public int mo938b() {
            return this.f13070d.size();
        }

        @Override // android.support.p002v4.app.AbstractC0104q
        /* renamed from: a */
        public Fragment mo941a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("index", i);
            return Fragment.m13775a(this.f13067a, this.f13070d.get(i).f13073b.getName(), bundle);
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            this.f13069c.setCurrentItem(this.f13068b.getCurrentTab());
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: a */
        public void mo940a(int i, float f, int i2) {
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: b_ */
        public void mo937b_(int i) {
            TabWidget tabWidget = this.f13068b.getTabWidget();
            int descendantFocusability = tabWidget.getDescendantFocusability();
            tabWidget.setDescendantFocusability(393216);
            this.f13068b.setCurrentTab(i);
            tabWidget.setDescendantFocusability(descendantFocusability);
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: c_ */
        public void mo936c_(int i) {
        }
    }
}
