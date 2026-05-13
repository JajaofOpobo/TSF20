package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.utils.C3946c;
import com.tsf.shell.plugin.themepicker.utils.C3950d;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.themepreview.d */
/* loaded from: classes.dex */
public class C3924d extends Fragment implements C3897k.InterfaceC3900b {

    /* renamed from: a */
    private C3950d f12852a;

    /* renamed from: b */
    private ViewGroup f12853b;

    /* renamed from: c */
    private C3927b f12854c;

    /* renamed from: d */
    private final String f12855d = "http://gcm.tsfui.com/recommend_theme.xml";

    /* renamed from: e */
    private final int f12856e = 100;

    /* renamed from: f */
    private C3926a f12857f;

    /* renamed from: g */
    private int f12858g;

    /* renamed from: h */
    private int f12859h;

    /* renamed from: i */
    private int f12860i;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        C3946c.C3948a c3948a = new C3946c.C3948a(m13745i(), "thumbs");
        c3948a.m1059a(0.25f);
        this.f12852a = new C3950d(m13745i(), 480, 720);
        this.f12852a.m1042a(m13745i().m13715f(), c3948a);
        this.f12857f = new C3926a();
        this.f12858g = (int) TypedValue.applyDimension(1, 50.0f, m13745i().getResources().getDisplayMetrics());
        this.f12859h = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_width_size);
        this.f12860i = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_spacing);
        m1169a();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: q */
    public void mo976q() {
        this.f12852a.m1036a(false);
        super.mo976q();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: r */
    public void mo975r() {
        C3851e.m1317b("ThemePreviewLocalFragment onPause");
        super.mo975r();
        this.f12852a.m1031b(false);
        this.f12852a.m1036a(true);
        this.f12852a.m1025h();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: s */
    public void mo974s() {
        super.mo974s();
        this.f12852a.m1024i();
        m1164b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.d$a */
    /* loaded from: classes.dex */
    public class C3926a extends BroadcastReceiver {
        C3926a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3851e.m1317b("PackageChangeReceiver ActionCode:" + intent.getAction());
            C3924d.this.m1170M();
        }
    }

    /* renamed from: a */
    private void m1169a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        m13745i().registerReceiver(this.f12857f, intentFilter);
    }

    /* renamed from: b */
    private void m1164b() {
        m13745i().unregisterReceiver(this.f12857f);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C3851e.m1317b("ThemePreviewLocalFragment onCreateView");
        this.f12853b = (ViewGroup) layoutInflater.inflate(C3852f.C3860h.theme_preview_fragment_layout, viewGroup, false);
        m1170M();
        return this.f12853b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m1170M() {
        C3897k.m1235a(m13745i(), "http://gcm.tsfui.com/recommend_theme.xml", this);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo1168a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            m13745i().setResult(-1, intent);
            m13745i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3900b
    /* renamed from: a */
    public void mo1165a(List<C3897k.C3903e> list) {
        if (list != null) {
            final GridView gridView = (GridView) this.f12853b.findViewById(C3852f.C3858f.gridView1);
            this.f12854c = new C3927b(list, m13745i());
            gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.d.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                @TargetApi(16)
                public void onGlobalLayout() {
                    int floor = (int) Math.floor(gridView.getWidth() / (C3924d.this.f12859h + C3924d.this.f12860i));
                    if (floor > 0) {
                        int width = (gridView.getWidth() / floor) - C3924d.this.f12860i;
                        C3924d.this.f12854c.m1155a(floor);
                        C3924d.this.f12854c.m1154b(width);
                        if (C3957h.m1005e()) {
                            gridView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            gridView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                    }
                }
            });
            gridView.setAdapter((ListAdapter) this.f12854c);
            gridView.setOnItemClickListener(this.f12854c);
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.d$b */
    /* loaded from: classes.dex */
    private class C3927b extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private List<C3897k.C3903e> f12865b;

        /* renamed from: c */
        private Context f12866c;

        /* renamed from: d */
        private int f12867d = 0;

        /* renamed from: e */
        private int f12868e = 0;

        /* renamed from: f */
        private AbsListView.LayoutParams f12869f;

        public C3927b(List<C3897k.C3903e> list, Context context) {
            this.f12865b = list;
            this.f12866c = context;
        }

        /* renamed from: a */
        public void m1155a(int i) {
            this.f12867d = i;
        }

        /* renamed from: b */
        public void m1154b(int i) {
            if (i != this.f12868e) {
                this.f12868e = i;
                this.f12869f = new AbsListView.LayoutParams(-1, this.f12868e);
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f12865b != null) {
                return this.f12865b.size() + this.f12867d;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12867d) {
                return null;
            }
            return this.f12865b.get(i - this.f12867d);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12867d) {
                return 0L;
            }
            return i - this.f12867d;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i < this.f12867d ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.f12867d) {
                if (view == null) {
                    view = new View(this.f12866c);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, C3924d.this.f12858g));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(this.f12866c).inflate(C3852f.C3860h.theme_preview_grid_item, (ViewGroup) null);
                }
                C3897k.C3903e c3903e = (C3897k.C3903e) getItem(i);
                view.setTag(c3903e.f12797b);
                C3924d.this.f12852a.m1037a(c3903e.f12798c, (RecyclingImageView) view.findViewById(C3852f.C3858f.imageView1));
                ((TextView) view.findViewById(C3852f.C3858f.textView1)).setText(C3924d.this.m1159c(c3903e.f12796a));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3897k.C3903e c3903e = (C3897k.C3903e) getItem(i);
            if (c3903e != null) {
                C3924d.this.m1161b(c3903e.f12797b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1161b(String str) {
        m13774a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m1159c(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
