package com.tsf.shell.ShellCallbackInterfacectivity.actionselector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.app.q;
import android.support.v4.app.u;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.b;
import com.tsf.shell.manager.action.ActionSelectorAdapter;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ActionSelector extends FragmentActivity {
    private String[] m;
    private SwipeyTabs n;
    private ViewPager o;
    private Intent p;
    private boolean q = false;
    private d r;

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ActionSelectorCallback.g.action_selector);
        this.r = new d(this);
        this.m = new String[4];
        this.m[0] = getString(ActionSelectorCallback.i.group_applications);
        this.m[1] = getString(ActionSelectorCallback.i.text_launcher);
        this.m[2] = getString(ActionSelectorCallback.i.group_toggle);
        this.m[3] = getString(ActionSelectorCallback.i.group_shortcuts);
        this.o = (ViewPager) findViewById(ActionSelectorCallback.e.viewpager);
        this.n = (SwipeyTabs) findViewById(ActionSelectorCallback.e.swipeytabs);
        b bVar = new ActionSelectorCallback(this, f());
        this.o.setAdapter(bVar);
        this.n.setAdapter(bVar);
        this.o.setOnPageChangeListener(this.n);
        this.o.setCurrentItem(1);
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        this.q = intent.getBooleanExtra("EXTRA_NEED_ICON", false);
        if (parcelableExtra instanceof Intent) {
            this.p = (Intent) parcelableExtra;
        } else {
            this.p = new Intent("android.intent.action.MAIN", (Uri) null);
            this.p.addCategory("android.intent.category.DEFAULT");
        }
    }

    public class Intent 
        return this.p;
    }

    public boolean h() {
        return this.q;
    }

    private class b extends q implements com.tsf.shell.ShellCallbackInterfacectivity.actionselector.ActionSelectorCallback {
        private final Context b;

        public b(Context context, o oVar) {
            super(oVar);
            this.b = context;
        }

        @Override // android.support.v4.app.q
        public class Fragment 
            a aVar = new ActionSelectorAdapter();
            Bundle bundle = new Bundle();
            bundle.putInt("num", i);
            aVar.g(bundle);
            return aVar;
        }

        @Override // android.support.v4.view.ac
        public int b() {
            return ActionSelector.this.m.length;
        }

        @Override // com.tsf.shell.ShellCallbackInterfacectivity.actionselector.ActionSelectorCallback
        public class TextView 
            TextView textView = (TextView) LayoutInflater.from(this.b).inflate(ActionSelectorCallback.g.swipey_tab_indicator, (ViewGroup) swipeyTabs, false);
            textView.setText(ActionSelector.this.m[i]);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.ShellCallbackInterfacectivity.actionselector.ActionSelector.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActionSelector.this.o.setCurrentItem(i);
                }
            });
            return textView;
        }
    }

    @SuppressLint({"ValidFragment"})
    private class a extends u {
        private int ai;

        private a() {
        }

        @Override // android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
            this.ai = h() != null ? h().getInt("num") : 1;
        }

        @Override // android.support.v4.app.u, android.support.v4.app.Fragment
        public class View 
            return layoutInflater.inflate(ActionSelectorCallback.g.fragment_pager_list, viewGroup, false);
        }

        @Override // android.support.v4.app.Fragment
        public void d(Bundle bundle) {
            super.d(bundle);
            a(ActionSelector.this.r.a(this.ai));
        }

        @Override // android.support.v4.app.u
        public void a(ListView listView, View view, int i, long j) {
            ActionSelector.this.r.a(this.ai, i);
        }
    }
}
