package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.themepreview.c */
/* loaded from: classes.dex */
public class C3920c extends Fragment implements C3897k.InterfaceC3904f {

    /* renamed from: a */
    private C3918b f12834a;

    /* renamed from: b */
    private ViewGroup f12835b;

    /* renamed from: c */
    private C3923b f12836c;

    /* renamed from: d */
    private final int f12837d = 100;

    /* renamed from: e */
    private C3922a f12838e;

    /* renamed from: f */
    private int f12839f;

    /* renamed from: g */
    private int f12840g;

    /* renamed from: h */
    private int f12841h;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        C3851e.m1317b("ThemePreviewLocalFragment onCreate  ");
        this.f12834a = new C3918b(m13745i(), (int) TypedValue.applyDimension(1, 160.0f, m13743j().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, m13743j().getDisplayMetrics()));
        this.f12838e = new C3922a();
        this.f12839f = (int) TypedValue.applyDimension(1, 50.0f, m13745i().getResources().getDisplayMetrics());
        this.f12840g = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_width_size);
        this.f12841h = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_spacing);
        m1182a();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: q */
    public void mo976q() {
        C3851e.m1317b("ThemePreviewLocalFragment onResume");
        this.f12834a.m1036a(false);
        super.mo976q();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: r */
    public void mo975r() {
        C3851e.m1317b("ThemePreviewLocalFragment onPause");
        super.mo975r();
        this.f12834a.m1031b(false);
        this.f12834a.m1036a(true);
        this.f12834a.m1025h();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: s */
    public void mo974s() {
        C3851e.m1317b("ThemePreviewLocalFragment onPause");
        super.mo974s();
        this.f12834a.m1024i();
        m1179b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.c$a */
    /* loaded from: classes.dex */
    public class C3922a extends BroadcastReceiver {
        C3922a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3851e.m1317b("PackageChangeReceiver ActionCode:" + intent.getAction());
            C3920c.this.m1183M();
        }
    }

    /* renamed from: a */
    private void m1182a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        m13745i().registerReceiver(this.f12838e, intentFilter);
    }

    /* renamed from: b */
    private void m1179b() {
        m13745i().unregisterReceiver(this.f12838e);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C3851e.m1317b("ThemePreviewLocalFragment onCreateView");
        this.f12835b = (ViewGroup) layoutInflater.inflate(C3852f.C3860h.theme_preview_fragment_layout, viewGroup, false);
        m1183M();
        return this.f12835b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m1183M() {
        C3897k.m1237a(m13745i(), this);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo1168a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            m13745i().setResult(-1, intent);
            m13745i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3904f
    /* renamed from: a */
    public void mo1003a(List<ResolveInfo> list) {
        final GridView gridView = (GridView) this.f12835b.findViewById(C3852f.C3858f.gridView1);
        this.f12836c = new C3923b(list, m13745i());
        gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.c.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(gridView.getWidth() / (C3920c.this.f12840g + C3920c.this.f12841h));
                if (floor > 0) {
                    int width = (gridView.getWidth() / floor) - C3920c.this.f12841h;
                    C3920c.this.f12836c.m1172a(floor);
                    C3920c.this.f12836c.m1171b(width);
                    if (C3957h.m1005e()) {
                        gridView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        gridView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        gridView.setAdapter((ListAdapter) this.f12836c);
        gridView.setOnItemClickListener(this.f12836c);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.c$b */
    /* loaded from: classes.dex */
    private class C3923b extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private List<ResolveInfo> f12846b;

        /* renamed from: c */
        private Context f12847c;

        /* renamed from: d */
        private PackageManager f12848d;

        /* renamed from: e */
        private int f12849e = 0;

        /* renamed from: f */
        private int f12850f = 0;

        /* renamed from: g */
        private AbsListView.LayoutParams f12851g;

        public C3923b(List<ResolveInfo> list, Context context) {
            this.f12846b = list;
            this.f12847c = context;
            this.f12848d = context.getPackageManager();
        }

        /* renamed from: a */
        public void m1172a(int i) {
            this.f12849e = i;
        }

        /* renamed from: b */
        public void m1171b(int i) {
            if (i != this.f12850f) {
                this.f12850f = i;
                this.f12851g = new AbsListView.LayoutParams(-1, this.f12850f);
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f12846b != null) {
                return this.f12846b.size() + this.f12849e;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12849e) {
                return null;
            }
            return this.f12846b.get(i - this.f12849e);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12849e) {
                return 0L;
            }
            return i - this.f12849e;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i < this.f12849e ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.f12849e) {
                if (view == null) {
                    view = new View(this.f12847c);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, C3920c.this.f12839f));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(this.f12847c).inflate(C3852f.C3860h.theme_preview_grid_item, (ViewGroup) null);
                }
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                view.setTag(resolveInfo.activityInfo.packageName);
                C3920c.this.f12834a.m1037a(resolveInfo, (RecyclingImageView) view.findViewById(C3852f.C3858f.imageView1));
                ((TextView) view.findViewById(C3852f.C3858f.textView1)).setText(C3920c.this.m1177b(resolveInfo.loadLabel(this.f12848d).toString()));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            if (resolveInfo != null) {
                Intent intent = new Intent();
                intent.setClass(this.f12847c, ThemePreviewDetilActivity.class);
                intent.putExtra("packagename", resolveInfo.activityInfo.packageName);
                C3920c.this.m13745i().startActivityForResult(intent, 100);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m1177b(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
