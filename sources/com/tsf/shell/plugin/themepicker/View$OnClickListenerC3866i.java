package com.tsf.shell.plugin.themepicker;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
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
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.theme.ThemePickerActivity;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.i */
/* loaded from: classes.dex */
public class View$OnClickListenerC3866i extends Fragment implements View.OnClickListener, C3897k.InterfaceC3906h {

    /* renamed from: a */
    private int f12653a;

    /* renamed from: ai */
    private C3897k.C3902d f12654ai;

    /* renamed from: b */
    private int f12655b;

    /* renamed from: c */
    private C3871a f12656c;

    /* renamed from: d */
    private C3850d f12657d;

    /* renamed from: e */
    private GridView f12658e;

    /* renamed from: f */
    private Handler f12659f;

    /* renamed from: g */
    private ResolveInfo f12660g;

    /* renamed from: h */
    private TextView f12661h;

    /* renamed from: i */
    private TextView f12662i;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        m13747h().getInt("PageIndex");
        this.f12660g = (ResolveInfo) m13747h().getParcelable("resolveInfo");
        this.f12653a = m13743j().getDimensionPixelSize(C3852f.C3856d.image_thumbnail_size);
        this.f12655b = m13743j().getDimensionPixelSize(C3852f.C3856d.image_thumbnail_spacing);
        this.f12657d = new C3850d(this.f12660g, m13745i(), this.f12653a);
        this.f12657d.m1043a(C3852f.C3857e.ic_preload_large);
        this.f12656c = new C3871a(m13745i());
        this.f12659f = new Handler();
        this.f12654ai = C3897k.m1227b(m13745i(), this.f12660g.activityInfo.packageName, this);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: c */
    public void mo983c() {
        super.mo983c();
        C3851e.m1317b("Fragment onDetach:" + this.f12660g.activityInfo.packageName);
        if (this.f12654ai != null) {
            this.f12654ai.m1148a(true);
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_perview_icon_fragment, viewGroup, false);
        this.f12658e = (GridView) inflate.findViewById(C3852f.C3858f.gridView);
        this.f12658e.setAdapter((ListAdapter) this.f12656c);
        this.f12658e.setOnItemClickListener(this.f12656c);
        this.f12658e.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.i.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    View$OnClickListenerC3866i.this.f12657d.m1031b(false);
                } else if (!C3957h.m1007c()) {
                    View$OnClickListenerC3866i.this.f12657d.m1031b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.f12658e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.i.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(View$OnClickListenerC3866i.this.f12658e.getWidth() / (View$OnClickListenerC3866i.this.f12653a + View$OnClickListenerC3866i.this.f12655b));
                if (floor > 0) {
                    int width = (View$OnClickListenerC3866i.this.f12658e.getWidth() / floor) - View$OnClickListenerC3866i.this.f12655b;
                    View$OnClickListenerC3866i.this.f12656c.m1303b(floor);
                    View$OnClickListenerC3866i.this.f12656c.m1305a(width);
                    if (C3957h.m1005e()) {
                        View$OnClickListenerC3866i.this.f12658e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        View$OnClickListenerC3866i.this.f12658e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView1)).setImageDrawable(this.f12660g.loadIcon(m13745i().getPackageManager()));
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText(this.f12660g.loadLabel(m13745i().getPackageManager()));
        this.f12661h = (TextView) inflate.findViewById(C3852f.C3858f.textView2);
        this.f12662i = (TextView) inflate.findViewById(C3852f.C3858f.textView3);
        inflate.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView2)).setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: q */
    public void mo976q() {
        super.mo976q();
        this.f12657d.m1036a(false);
        this.f12656c.notifyDataSetChanged();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: r */
    public void mo975r() {
        super.mo975r();
        this.f12657d.m1031b(false);
        this.f12657d.m1036a(true);
        this.f12657d.m1025h();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: s */
    public void mo974s() {
        super.mo974s();
        this.f12657d.m1024i();
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.i$a */
    /* loaded from: classes.dex */
    private class C3871a extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private final Context f12671b;

        /* renamed from: f */
        private int f12675f;

        /* renamed from: g */
        private int[] f12676g;

        /* renamed from: h */
        private String[] f12677h;

        /* renamed from: c */
        private int f12672c = 0;

        /* renamed from: e */
        private int f12674e = 0;

        /* renamed from: d */
        private AbsListView.LayoutParams f12673d = new AbsListView.LayoutParams(-1, -1);

        public C3871a(Context context) {
            this.f12675f = 0;
            this.f12671b = context;
            this.f12675f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            C3851e.m1317b("mActionBarHeight:" + this.f12675f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (m1306a() == 0) {
                return 0;
            }
            if (this.f12676g == null && this.f12677h == null) {
                return 0;
            }
            if (this.f12676g != null) {
                return this.f12676g.length + this.f12674e;
            }
            if (this.f12677h != null) {
                return this.f12677h.length + this.f12674e;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f12674e) {
                return null;
            }
            if (this.f12676g != null) {
                return Integer.valueOf(this.f12676g[i - this.f12674e]);
            }
            if (this.f12677h != null) {
                return this.f12677h[i - this.f12674e];
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f12674e) {
                return 0L;
            }
            return i - this.f12674e;
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
            return i < this.f12674e ? 1 : 0;
        }

        /* renamed from: a */
        public void m1304a(List<Integer> list) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            this.f12676g = iArr;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            RecyclingImageView recyclingImageView;
            ImageView imageView;
            View view2 = view;
            if (i < this.f12674e) {
                if (view == null) {
                    view2 = new View(this.f12671b);
                }
                view2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f12675f));
                imageView = view2;
            } else {
                if (view == null) {
                    RecyclingImageView recyclingImageView2 = new RecyclingImageView(this.f12671b);
                    recyclingImageView2.setLayoutParams(this.f12673d);
                    recyclingImageView = recyclingImageView2;
                } else {
                    recyclingImageView = (ImageView) view;
                }
                if (recyclingImageView.getLayoutParams().height != this.f12672c) {
                    recyclingImageView.setLayoutParams(this.f12673d);
                }
                if (this.f12676g != null) {
                    View$OnClickListenerC3866i.this.f12657d.m1037a(Integer.valueOf(this.f12676g[i - this.f12674e]), recyclingImageView);
                    imageView = recyclingImageView;
                } else {
                    View$OnClickListenerC3866i.this.f12657d.m1037a(this.f12677h[i - this.f12674e], recyclingImageView);
                    imageView = recyclingImageView;
                }
            }
            return imageView;
        }

        /* renamed from: a */
        public void m1305a(int i) {
            if (i != this.f12672c) {
                this.f12672c = i;
                this.f12673d = new AbsListView.LayoutParams(-1, this.f12672c);
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public void m1303b(int i) {
            this.f12674e = i;
        }

        /* renamed from: a */
        public int m1306a() {
            return this.f12674e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Bitmap bitmap;
            Drawable drawable = ((ImageView) view).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (bitmap = ((BitmapDrawable) ((TransitionDrawable) drawable).getDrawable(1)).getBitmap()) != null && !(View$OnClickListenerC3866i.this.m13745i() instanceof ThemePickerActivity)) {
                ((IconPickerActivity) View$OnClickListenerC3866i.this.m13745i()).m1339a(bitmap);
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3906h
    /* renamed from: a */
    public void mo985a(final List<Integer> list, final String str, final String str2) {
        this.f12659f.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.i.3
            @Override // java.lang.Runnable
            public void run() {
                if (list != null) {
                    View$OnClickListenerC3866i.this.f12656c.m1304a(list);
                }
                if (str != null) {
                    View$OnClickListenerC3866i.this.f12661h.setText(str);
                    View$OnClickListenerC3866i.this.f12661h.setVisibility(0);
                }
                if (str2 != null) {
                    View$OnClickListenerC3866i.this.f12662i.setText(str2);
                    View$OnClickListenerC3866i.this.f12662i.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.i.3.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            View$OnClickListenerC3866i.this.m13745i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                        }
                    });
                    View$OnClickListenerC3866i.this.f12662i.setVisibility(0);
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.linearLayout1) {
            if (view.getId() == C3852f.C3858f.linearLayout1) {
                FragmentActivity i = m13745i();
                if (i instanceof SildingMenuLayout.InterfaceC3844d) {
                    ((SildingMenuLayout.InterfaceC3844d) i).mo1001h();
                }
            }
        } else if (view.getId() == C3852f.C3858f.imageView2) {
            m13774a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f12660g.activityInfo.packageName)));
        }
    }
}
