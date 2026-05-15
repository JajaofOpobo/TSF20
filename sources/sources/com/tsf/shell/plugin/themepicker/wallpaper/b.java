package com.tsf.shell.plugin.themepicker.wallpaper;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
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
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.utils.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends Fragment implements View.OnClickListener {
    private GridView a;
    private a b;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.b = new a(i());
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.h.theme_preview_gallery_fragment, viewGroup, false);
        this.a = (GridView) viewInflate.findViewById(f.C0155f.gridView);
        this.a.setAdapter((ListAdapter) this.b);
        this.a.setOnItemClickListener(this.b);
        final int iApplyDimension = (int) TypedValue.applyDimension(1, 150.0f, j().getDisplayMetrics());
        final int dimensionPixelSize = j().getDimensionPixelSize(f.d.theme_app_height_size);
        final int iApplyDimension2 = (int) TypedValue.applyDimension(1, 10.0f, j().getDisplayMetrics());
        final int iApplyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, j().getDisplayMetrics());
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int width = b.this.a.getWidth() - iApplyDimension3;
                int iFloor = (int) Math.floor(width / (iApplyDimension + iApplyDimension2));
                if (iFloor > 0) {
                    int i = (width / iFloor) - iApplyDimension2;
                    b.this.b.b(iFloor);
                    b.this.b.a(dimensionPixelSize);
                    if (h.e()) {
                        b.this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        b.this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView1)).setImageResource(f.e.ic_launcher_wallpaper);
        ((TextView) viewInflate.findViewById(f.C0155f.textView1)).setText(f.j.theme_picker_theme_picker_gallery_apps);
        viewInflate.findViewById(f.C0155f.linearLayout1).setOnClickListener(this);
        return viewInflate;
    }

    private class a extends BaseAdapter implements AdapterView.OnItemClickListener {
        private Context b;
        private int c;
        private int d;
        private int e;
        private AbsListView.LayoutParams f;
        private ResolveInfo[] g;
        private PackageManager h;

        public a(Context context) {
            this.b = context;
            this.h = context.getPackageManager();
            this.c = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            a();
        }

        private void a() {
            int i = 0;
            List<ResolveInfo> listQueryIntentActivities = this.h.queryIntentActivities(new Intent("android.intent.action.SET_WALLPAPER"), 0);
            ArrayList arrayList = new ArrayList();
            String packageName = this.b.getPackageName();
            while (true) {
                int i2 = i;
                if (i2 < listQueryIntentActivities.size()) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    if (!resolveInfo.activityInfo.packageName.equals(packageName)) {
                        arrayList.add(resolveInfo);
                    }
                    i = i2 + 1;
                } else {
                    this.g = new ResolveInfo[arrayList.size()];
                    arrayList.toArray(this.g);
                    return;
                }
            }
        }

        public void a(int i) {
            if (i != this.e) {
                this.e = i;
                this.f = new AbsListView.LayoutParams(-1, this.e);
                notifyDataSetChanged();
            }
        }

        public void b(int i) {
            e.b("mNumColumns:" + i);
            this.d = i;
        }

        private int b() {
            return this.d;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (b() == 0 || this.g == null) {
                return 0;
            }
            return this.g.length + this.d;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.d) {
                return null;
            }
            return this.g[i - this.d];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.d) {
                return 0L;
            }
            return i - this.d;
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
            return i < this.d ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.d) {
                if (view == null) {
                    view = new View(this.b);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, this.c));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(f.h.theme_preview_gallery_app_item, viewGroup, false);
                }
                if (view.getLayoutParams().height != this.e) {
                    view.setLayoutParams(this.f);
                }
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(f.C0155f.imageView1)).setImageDrawable(resolveInfo.loadIcon(this.h));
                ((TextView) view.findViewById(f.C0155f.textView1)).setText(resolveInfo.loadLabel(this.h));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            if (resolveInfo != null) {
                Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                e.b("packageName:" + resolveInfo.activityInfo.packageName);
                b.this.i().startActivity(intent);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.linearLayout1) {
            b.a aVarI = i();
            if (aVarI instanceof SildingMenuLayout.d) {
                ((SildingMenuLayout.d) aVarI).h();
            }
        }
    }
}
