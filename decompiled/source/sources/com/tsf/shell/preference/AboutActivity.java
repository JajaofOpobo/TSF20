package com.tsf.shell.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class AboutActivity extends FragmentActivity {
    TabHost m;
    ViewPager n;
    a o;

    public static void a(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.d(), AboutActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b.g.fragment_tabs_pager);
        this.m = (TabHost) findViewById(16908306);
        this.m.setup();
        this.n = (ViewPager) findViewById(b.e.pager);
        this.o = new a(this, this.m, this.n);
        this.o.a(this.m.newTabSpec("translations").setIndicator(x.c(b.i.text_translations)), com.tsf.shell.preference.widget.a.class, (Bundle) null);
        if (bundle != null) {
            this.m.setCurrentTabByTag(bundle.getString("tab"));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("tab", this.m.getCurrentTabTag());
    }

    /* loaded from: classes.dex */
    public static class a extends q implements ViewPager.e, TabHost.OnTabChangeListener {
        private final Context a;
        private final TabHost b;
        private final ViewPager c;
        private final ArrayList<b> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b {
            private final String a;
            private final Class<?> b;
            private final Bundle c;

            b(String str, Class<?> cls, Bundle bundle) {
                this.a = str;
                this.b = cls;
                this.c = bundle;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.preference.AboutActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0160a implements TabHost.TabContentFactory {
            private final Context a;

            public C0160a(Context context) {
                this.a = context;
            }

            @Override // android.widget.TabHost.TabContentFactory
            public View createTabContent(String str) {
                View view = new View(this.a);
                view.setMinimumWidth(0);
                view.setMinimumHeight(0);
                return view;
            }
        }

        public a(FragmentActivity fragmentActivity, TabHost tabHost, ViewPager viewPager) {
            super(fragmentActivity.f());
            this.d = new ArrayList<>();
            this.a = fragmentActivity;
            this.b = tabHost;
            this.c = viewPager;
            this.b.setOnTabChangedListener(this);
            this.c.setAdapter(this);
            this.c.setOnPageChangeListener(this);
        }

        public void a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
            tabSpec.setContent(new C0160a(this.a));
            this.d.add(new b(tabSpec.getTag(), cls, bundle));
            this.b.addTab(tabSpec);
            c();
        }

        @Override // android.support.v4.view.ac
        public int b() {
            return this.d.size();
        }

        @Override // android.support.v4.app.q
        public Fragment a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("index", i);
            return Fragment.a(this.a, this.d.get(i).b.getName(), bundle);
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            this.c.setCurrentItem(this.b.getCurrentTab());
        }

        @Override // android.support.v4.view.ViewPager.e
        public void a(int i, float f, int i2) {
        }

        @Override // android.support.v4.view.ViewPager.e
        public void b_(int i) {
            TabWidget tabWidget = this.b.getTabWidget();
            int descendantFocusability = tabWidget.getDescendantFocusability();
            tabWidget.setDescendantFocusability(393216);
            this.b.setCurrentTab(i);
            tabWidget.setDescendantFocusability(descendantFocusability);
        }

        @Override // android.support.v4.view.ViewPager.e
        public void c_(int i) {
        }
    }
}
