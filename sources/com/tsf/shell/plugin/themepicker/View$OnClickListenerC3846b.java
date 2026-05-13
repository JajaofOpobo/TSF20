package com.tsf.shell.plugin.themepicker;

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
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.b */
/* loaded from: classes.dex */
public class View$OnClickListenerC3846b extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private GridView f12625a;

    /* renamed from: b */
    private C3848a f12626b;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        this.f12626b = new C3848a(m13745i());
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_preview_gallery_fragment, viewGroup, false);
        this.f12625a = (GridView) inflate.findViewById(C3852f.C3858f.gridView);
        this.f12625a.setAdapter((ListAdapter) this.f12626b);
        this.f12625a.setOnItemClickListener(this.f12626b);
        final int applyDimension = (int) TypedValue.applyDimension(1, 150.0f, m13743j().getDisplayMetrics());
        final int dimensionPixelSize = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_app_height_size);
        final int applyDimension2 = (int) TypedValue.applyDimension(1, 10.0f, m13743j().getDisplayMetrics());
        final int applyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, m13743j().getDisplayMetrics());
        this.f12625a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int width = View$OnClickListenerC3846b.this.f12625a.getWidth() - applyDimension3;
                int floor = (int) Math.floor(width / (applyDimension + applyDimension2));
                if (floor > 0) {
                    int i = (width / floor) - applyDimension2;
                    View$OnClickListenerC3846b.this.f12626b.m1324b(floor);
                    View$OnClickListenerC3846b.this.f12626b.m1326a(dimensionPixelSize);
                    if (C3957h.m1005e()) {
                        View$OnClickListenerC3846b.this.f12625a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        View$OnClickListenerC3846b.this.f12625a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView1)).setImageResource(C3852f.C3857e.ic_launcher_wallpaper);
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText(C3852f.C3862j.theme_picker_theme_picker_gallery_apps);
        inflate.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
        return inflate;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.b$a */
    /* loaded from: classes.dex */
    private class C3848a extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private Context f12633b;

        /* renamed from: c */
        private int f12634c;

        /* renamed from: d */
        private int f12635d;

        /* renamed from: e */
        private int f12636e;

        /* renamed from: f */
        private AbsListView.LayoutParams f12637f;

        /* renamed from: g */
        private ResolveInfo[] f12638g;

        /* renamed from: h */
        private PackageManager f12639h;

        public C3848a(Context context) {
            this.f12633b = context;
            this.f12639h = context.getPackageManager();
            this.f12634c = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            m1327a();
        }

        /* renamed from: a */
        private void m1327a() {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            List<ResolveInfo> queryIntentActivities = this.f12639h.queryIntentActivities(intent, 0);
            this.f12638g = new ResolveInfo[queryIntentActivities.size()];
            queryIntentActivities.toArray(this.f12638g);
        }

        /* renamed from: a */
        public void m1326a(int i) {
            if (i != this.f12636e) {
                this.f12636e = i;
                this.f12637f = new AbsListView.LayoutParams(-1, this.f12636e);
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public void m1324b(int i) {
            C3851e.m1317b("mNumColumns:" + i);
            this.f12635d = i;
        }

        /* renamed from: b */
        private int m1325b() {
            return this.f12635d;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (m1325b() == 0 || this.f12638g == null) {
                return 0;
            }
            return this.f12638g.length + this.f12635d;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12635d) {
                return null;
            }
            return this.f12638g[i - this.f12635d];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12635d) {
                return 0L;
            }
            return i - this.f12635d;
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
            return i < this.f12635d ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.f12635d) {
                if (view == null) {
                    view = new View(this.f12633b);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, this.f12634c));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C3852f.C3860h.theme_preview_gallery_app_item, viewGroup, false);
                }
                if (view.getLayoutParams().height != this.f12636e) {
                    view.setLayoutParams(this.f12637f);
                }
                ResolveInfo resolveInfo = this.f12638g[i - this.f12635d];
                ((ImageView) view.findViewById(C3852f.C3858f.imageView1)).setImageDrawable(resolveInfo.loadIcon(this.f12639h));
                ((TextView) view.findViewById(C3852f.C3858f.textView1)).setText(resolveInfo.loadLabel(this.f12639h));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ResolveInfo resolveInfo = this.f12638g[i - this.f12635d];
            Intent intent = new Intent();
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            View$OnClickListenerC3846b.this.m13745i().startActivityForResult(intent, 100);
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
