package com.tsf.shell.plugin.themepicker.theme;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
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
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.IconPickerActivity;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.theme.b */
/* loaded from: classes.dex */
public class View$OnClickListenerC3908b extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private PackageManager f12805a;

    /* renamed from: b */
    private GridView f12806b;

    /* renamed from: c */
    private int f12807c;

    /* renamed from: d */
    private int f12808d;

    /* renamed from: e */
    private C3907a f12809e;

    /* renamed from: f */
    private C3911a f12810f;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        this.f12805a = m13745i().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = this.f12805a.queryIntentActivities(intent, 0);
        this.f12807c = m13743j().getDimensionPixelSize(C3852f.C3856d.image_thumbnail_size);
        this.f12808d = m13743j().getDimensionPixelSize(C3852f.C3856d.image_thumbnail_spacing);
        this.f12809e = new C3907a(this.f12805a, m13745i());
        this.f12809e.m1043a(C3852f.C3857e.ic_preload_large);
        this.f12810f = new C3911a(m13745i(), queryIntentActivities);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: c */
    public void mo983c() {
        super.mo983c();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_perview_icon_fragment, viewGroup, false);
        this.f12806b = (GridView) inflate.findViewById(C3852f.C3858f.gridView);
        this.f12806b.setAdapter((ListAdapter) this.f12810f);
        this.f12806b.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.theme.b.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    View$OnClickListenerC3908b.this.f12809e.m1031b(false);
                } else if (!C3957h.m1007c()) {
                    View$OnClickListenerC3908b.this.f12809e.m1031b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.f12806b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.theme.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(View$OnClickListenerC3908b.this.f12806b.getWidth() / (View$OnClickListenerC3908b.this.f12807c + View$OnClickListenerC3908b.this.f12808d));
                if (floor > 0) {
                    int width = (View$OnClickListenerC3908b.this.f12806b.getWidth() / floor) - View$OnClickListenerC3908b.this.f12808d;
                    View$OnClickListenerC3908b.this.f12810f.m1200b(floor);
                    View$OnClickListenerC3908b.this.f12810f.m1201a(width);
                    if (C3957h.m1005e()) {
                        View$OnClickListenerC3908b.this.f12806b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        View$OnClickListenerC3908b.this.f12806b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView1)).setImageResource(C3852f.C3857e.theme_preview_tsf_ico);
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText(C3852f.C3862j.theme_picker_system);
        inflate.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
        inflate.findViewById(C3852f.C3858f.imageView2).setVisibility(8);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.linearLayout1) {
            IconPickerActivity.f12589q.m1337a();
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.theme.b$a */
    /* loaded from: classes.dex */
    private class C3911a extends BaseAdapter {

        /* renamed from: b */
        private final Context f12814b;

        /* renamed from: f */
        private int f12818f;

        /* renamed from: g */
        private List<ResolveInfo> f12819g;

        /* renamed from: c */
        private int f12815c = 0;

        /* renamed from: e */
        private int f12817e = 0;

        /* renamed from: d */
        private AbsListView.LayoutParams f12816d = new AbsListView.LayoutParams(-1, -1);

        public C3911a(Context context, List<ResolveInfo> list) {
            this.f12818f = 0;
            this.f12819g = list;
            this.f12814b = context;
            this.f12818f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            C3851e.m1317b("mActionBarHeight:" + this.f12818f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (m1202a() == 0 || this.f12819g == null) {
                return 0;
            }
            return this.f12819g.size() + this.f12817e;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12817e) {
                return null;
            }
            return this.f12819g.get(i - this.f12817e);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12817e) {
                return 0L;
            }
            return i - this.f12817e;
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
            return i < this.f12817e ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            RecyclingImageView recyclingImageView;
            ImageView imageView;
            View view2 = view;
            if (i < this.f12817e) {
                if (view == null) {
                    view2 = new View(this.f12814b);
                }
                view2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f12818f));
                imageView = view2;
            } else {
                if (view == null) {
                    RecyclingImageView recyclingImageView2 = new RecyclingImageView(this.f12814b);
                    recyclingImageView2.setLayoutParams(this.f12816d);
                    recyclingImageView = recyclingImageView2;
                } else {
                    recyclingImageView = (ImageView) view;
                }
                if (recyclingImageView.getLayoutParams().height != this.f12815c) {
                    recyclingImageView.setLayoutParams(this.f12816d);
                }
                View$OnClickListenerC3908b.this.f12809e.m1037a(this.f12819g.get(i - this.f12817e), recyclingImageView);
                imageView = recyclingImageView;
            }
            return imageView;
        }

        /* renamed from: a */
        public void m1201a(int i) {
            if (i != this.f12815c) {
                this.f12815c = i;
                this.f12816d = new AbsListView.LayoutParams(-1, this.f12815c);
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public void m1200b(int i) {
            this.f12817e = i;
        }

        /* renamed from: a */
        public int m1202a() {
            return this.f12817e;
        }
    }
}
