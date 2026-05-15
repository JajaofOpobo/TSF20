package com.tsf.shell.plugin.themepicker.theme;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.IconPickerActivity;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import com.tsf.shell.plugin.themepicker.utils.h;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends Fragment implements View.OnClickListener {
    private PackageManager a;
    private GridView b;
    private int c;
    private int d;
    private com.tsf.shell.plugin.themepicker.theme.a e;
    private a f;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.a = i().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = this.a.queryIntentActivities(intent, 0);
        this.c = j().getDimensionPixelSize(f.d.image_thumbnail_size);
        this.d = j().getDimensionPixelSize(f.d.image_thumbnail_spacing);
        this.e = new com.tsf.shell.plugin.themepicker.theme.a(this.a, i());
        this.e.a(f.e.ic_preload_large);
        this.f = new a(i(), listQueryIntentActivities);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.h.theme_perview_icon_fragment, viewGroup, false);
        this.b = (GridView) viewInflate.findViewById(f.C0155f.gridView);
        this.b.setAdapter((ListAdapter) this.f);
        this.b.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.theme.b.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    b.this.e.b(false);
                } else if (!h.c()) {
                    b.this.e.b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.theme.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int iFloor = (int) Math.floor(b.this.b.getWidth() / (b.this.c + b.this.d));
                if (iFloor > 0) {
                    int width = (b.this.b.getWidth() / iFloor) - b.this.d;
                    b.this.f.b(iFloor);
                    b.this.f.a(width);
                    if (h.e()) {
                        b.this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        b.this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView1)).setImageResource(f.e.theme_preview_tsf_ico);
        ((TextView) viewInflate.findViewById(f.C0155f.textView1)).setText(f.j.theme_picker_system);
        viewInflate.findViewById(f.C0155f.linearLayout1).setOnClickListener(this);
        viewInflate.findViewById(f.C0155f.imageView2).setVisibility(8);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.linearLayout1) {
            IconPickerActivity.q.a();
        }
    }

    private class a extends BaseAdapter {
        private final Context b;
        private int f;
        private List<ResolveInfo> g;
        private int c = 0;
        private int e = 0;
        private AbsListView.LayoutParams d = new AbsListView.LayoutParams(-1, -1);

        public a(Context context, List<ResolveInfo> list) {
            this.f = 0;
            this.g = list;
            this.b = context;
            this.f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            e.b("mActionBarHeight:" + this.f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (a() == 0 || this.g == null) {
                return 0;
            }
            return this.g.size() + this.e;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.e) {
                return null;
            }
            return this.g.get(i - this.e);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.e) {
                return 0L;
            }
            return i - this.e;
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
            return i < this.e ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            View view2;
            View view3 = view;
            if (i < this.e) {
                if (view == null) {
                    view3 = new View(this.b);
                }
                view3.setLayoutParams(new AbsListView.LayoutParams(-1, this.f));
                view2 = view3;
            } else {
                if (view == null) {
                    RecyclingImageView recyclingImageView = new RecyclingImageView(this.b);
                    recyclingImageView.setLayoutParams(this.d);
                    imageView = recyclingImageView;
                } else {
                    imageView = (ImageView) view;
                }
                if (imageView.getLayoutParams().height != this.c) {
                    imageView.setLayoutParams(this.d);
                }
                b.this.e.a(this.g.get(i - this.e), imageView);
                view2 = imageView;
            }
            return view2;
        }

        public void a(int i) {
            if (i != this.c) {
                this.c = i;
                this.d = new AbsListView.LayoutParams(-1, this.c);
                notifyDataSetChanged();
            }
        }

        public void b(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }
    }
}
