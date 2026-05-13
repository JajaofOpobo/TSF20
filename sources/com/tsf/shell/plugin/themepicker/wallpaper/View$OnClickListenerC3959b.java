package com.tsf.shell.plugin.themepicker.wallpaper;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.b */
/* loaded from: classes.dex */
public class View$OnClickListenerC3959b extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private GridView f12975a;

    /* renamed from: b */
    private C3961a f12976b;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        this.f12976b = new C3961a(m13745i());
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_preview_gallery_fragment, viewGroup, false);
        this.f12975a = (GridView) inflate.findViewById(C3852f.C3858f.gridView);
        this.f12975a.setAdapter((ListAdapter) this.f12976b);
        this.f12975a.setOnItemClickListener(this.f12976b);
        final int applyDimension = (int) TypedValue.applyDimension(1, 150.0f, m13743j().getDisplayMetrics());
        final int dimensionPixelSize = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_app_height_size);
        final int applyDimension2 = (int) TypedValue.applyDimension(1, 10.0f, m13743j().getDisplayMetrics());
        final int applyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, m13743j().getDisplayMetrics());
        this.f12975a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int width = View$OnClickListenerC3959b.this.f12975a.getWidth() - applyDimension3;
                int floor = (int) Math.floor(width / (applyDimension + applyDimension2));
                if (floor > 0) {
                    int i = (width / floor) - applyDimension2;
                    View$OnClickListenerC3959b.this.f12976b.m991b(floor);
                    View$OnClickListenerC3959b.this.f12976b.m993a(dimensionPixelSize);
                    if (C3957h.m1005e()) {
                        View$OnClickListenerC3959b.this.f12975a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        View$OnClickListenerC3959b.this.f12975a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView1)).setImageResource(C3852f.C3857e.ic_launcher_wallpaper);
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText(C3852f.C3862j.theme_picker_theme_picker_gallery_apps);
        inflate.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.b$a */
    /* loaded from: classes.dex */
    private class C3961a extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private Context f12983b;

        /* renamed from: c */
        private int f12984c;

        /* renamed from: d */
        private int f12985d;

        /* renamed from: e */
        private int f12986e;

        /* renamed from: f */
        private AbsListView.LayoutParams f12987f;

        /* renamed from: g */
        private ResolveInfo[] f12988g;

        /* renamed from: h */
        private PackageManager f12989h;

        public C3961a(Context context) {
            this.f12983b = context;
            this.f12989h = context.getPackageManager();
            this.f12984c = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            m994a();
        }

        /* renamed from: a */
        private void m994a() {
            int i = 0;
            List<ResolveInfo> queryIntentActivities = this.f12989h.queryIntentActivities(new Intent("android.intent.action.SET_WALLPAPER"), 0);
            ArrayList arrayList = new ArrayList();
            String packageName = this.f12983b.getPackageName();
            while (true) {
                int i2 = i;
                if (i2 < queryIntentActivities.size()) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                    if (!resolveInfo.activityInfo.packageName.equals(packageName)) {
                        arrayList.add(resolveInfo);
                    }
                    i = i2 + 1;
                } else {
                    this.f12988g = new ResolveInfo[arrayList.size()];
                    arrayList.toArray(this.f12988g);
                    return;
                }
            }
        }

        /* renamed from: a */
        public void m993a(int i) {
            if (i != this.f12986e) {
                this.f12986e = i;
                this.f12987f = new AbsListView.LayoutParams(-1, this.f12986e);
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public void m991b(int i) {
            C3851e.m1317b("mNumColumns:" + i);
            this.f12985d = i;
        }

        /* renamed from: b */
        private int m992b() {
            return this.f12985d;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (m992b() == 0 || this.f12988g == null) {
                return 0;
            }
            return this.f12988g.length + this.f12985d;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12985d) {
                return null;
            }
            return this.f12988g[i - this.f12985d];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12985d) {
                return 0L;
            }
            return i - this.f12985d;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i < this.f12985d ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.f12985d) {
                if (view == null) {
                    view = new View(this.f12983b);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, this.f12984c));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C3852f.C3860h.theme_preview_gallery_app_item, viewGroup, false);
                }
                if (view.getLayoutParams().height != this.f12986e) {
                    view.setLayoutParams(this.f12987f);
                }
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C3852f.C3858f.imageView1)).setImageDrawable(resolveInfo.loadIcon(this.f12989h));
                ((TextView) view.findViewById(C3852f.C3858f.textView1)).setText(resolveInfo.loadLabel(this.f12989h));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            if (resolveInfo != null) {
                Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                C3851e.m1317b("packageName:" + resolveInfo.activityInfo.packageName);
                View$OnClickListenerC3959b.this.m13745i().startActivity(intent);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.linearLayout1) {
            FragmentActivity i = m13745i();
            if (i instanceof SildingMenuLayout.InterfaceC3844d) {
                ((SildingMenuLayout.InterfaceC3844d) i).mo1001h();
            }
        }
    }
}
