package com.tsf.shell.plugin.themepicker.wallpaper;

import android.annotation.TargetApi;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.SildingMenuLayout;
import com.tsf.shell.plugin.themepicker.utils.C3957h;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.d */
/* loaded from: classes.dex */
public class View$OnClickListenerC3963d extends Fragment implements View.OnClickListener, C3897k.InterfaceC3906h {

    /* renamed from: a */
    private int f12993a;

    /* renamed from: ai */
    private TextView f12994ai;

    /* renamed from: aj */
    private C3897k.C3905g f12995aj;

    /* renamed from: b */
    private int f12996b;

    /* renamed from: c */
    private int f12997c;

    /* renamed from: d */
    private C3968a f12998d;

    /* renamed from: e */
    private C3958a f12999e;

    /* renamed from: f */
    private GridView f13000f;

    /* renamed from: g */
    private Handler f13001g;

    /* renamed from: h */
    private ResolveInfo f13002h;

    /* renamed from: i */
    private TextView f13003i;

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        m13747h().getInt("PageIndex");
        this.f13002h = (ResolveInfo) m13747h().getParcelable("resolveInfo");
        this.f12993a = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_width_size);
        this.f12996b = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_wallpaper_height_size);
        this.f12997c = m13743j().getDimensionPixelSize(C3852f.C3856d.theme_preview_spacing);
        this.f12999e = new C3958a(this.f13002h, m13745i(), this.f12993a, this.f12996b);
        this.f12999e.m1043a(C3852f.C3857e.ic_preload_large);
        this.f12998d = new C3968a(m13745i());
        this.f13001g = new Handler();
        this.f12995aj = C3897k.m1234a(m13745i(), this.f13002h.activityInfo.packageName, this);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: c */
    public void mo983c() {
        super.mo983c();
        C3851e.m1317b("Fragment onDetach:" + this.f13002h.activityInfo.packageName);
        this.f12995aj.m1148a(true);
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3852f.C3860h.theme_perview_wallpaper_fragment, viewGroup, false);
        this.f13000f = (GridView) inflate.findViewById(C3852f.C3858f.gridView);
        this.f13000f.setAdapter((ListAdapter) this.f12998d);
        this.f13000f.setOnItemClickListener(this.f12998d);
        this.f13000f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    View$OnClickListenerC3963d.this.f12999e.m1031b(false);
                } else if (!C3957h.m1007c()) {
                    View$OnClickListenerC3963d.this.f12999e.m1031b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.f13000f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(View$OnClickListenerC3963d.this.f13000f.getWidth() / (View$OnClickListenerC3963d.this.f12993a + View$OnClickListenerC3963d.this.f12997c));
                if (floor > 0) {
                    int width = (View$OnClickListenerC3963d.this.f13000f.getWidth() / floor) - View$OnClickListenerC3963d.this.f12997c;
                    View$OnClickListenerC3963d.this.f12998d.m970b(floor);
                    View$OnClickListenerC3963d.this.f12998d.m972a(width);
                    if (C3957h.m1005e()) {
                        View$OnClickListenerC3963d.this.f13000f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        View$OnClickListenerC3963d.this.f13000f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView1)).setImageDrawable(this.f13002h.loadIcon(m13745i().getPackageManager()));
        ((TextView) inflate.findViewById(C3852f.C3858f.textView1)).setText(this.f13002h.loadLabel(m13745i().getPackageManager()));
        this.f13003i = (TextView) inflate.findViewById(C3852f.C3858f.textView2);
        this.f12994ai = (TextView) inflate.findViewById(C3852f.C3858f.textView3);
        inflate.findViewById(C3852f.C3858f.linearLayout1).setOnClickListener(this);
        ((ImageView) inflate.findViewById(C3852f.C3858f.imageView2)).setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: q */
    public void mo976q() {
        super.mo976q();
        this.f12999e.m1036a(false);
        this.f12998d.notifyDataSetChanged();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: r */
    public void mo975r() {
        super.mo975r();
        this.f12999e.m1031b(false);
        this.f12999e.m1036a(true);
        this.f12999e.m1025h();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: s */
    public void mo974s() {
        super.mo974s();
        this.f12999e.m1024i();
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.d$a */
    /* loaded from: classes.dex */
    private class C3968a extends BaseAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        private final Context f13012b;

        /* renamed from: f */
        private int f13016f;

        /* renamed from: g */
        private int[] f13017g;

        /* renamed from: c */
        private int f13013c = 0;

        /* renamed from: e */
        private int f13015e = 0;

        /* renamed from: d */
        private AbsListView.LayoutParams f13014d = new AbsListView.LayoutParams(-1, -1);

        public C3968a(Context context) {
            this.f13016f = 0;
            this.f13012b = context;
            this.f13016f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            C3851e.m1317b("mActionBarHeight:" + this.f13016f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (m973a() == 0 || this.f13017g == null) {
                return 0;
            }
            return this.f13017g.length + this.f13015e;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f13015e) {
                return null;
            }
            return Integer.valueOf(this.f13017g[i - this.f13015e]);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.f13015e) {
                return 0L;
            }
            return i - this.f13015e;
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
            return i < this.f13015e ? 1 : 0;
        }

        /* renamed from: a */
        public void m971a(List<Integer> list) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            this.f13017g = iArr;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            RecyclingImageView recyclingImageView;
            ImageView imageView;
            View view2 = view;
            if (i < this.f13015e) {
                if (view == null) {
                    view2 = new View(this.f13012b);
                }
                view2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f13016f));
                imageView = view2;
            } else {
                if (view == null) {
                    RecyclingImageView recyclingImageView2 = new RecyclingImageView(this.f13012b);
                    recyclingImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    recyclingImageView2.setLayoutParams(this.f13014d);
                    recyclingImageView = recyclingImageView2;
                } else {
                    recyclingImageView = (ImageView) view;
                }
                if (recyclingImageView.getLayoutParams().height != this.f13013c) {
                    recyclingImageView.setLayoutParams(this.f13014d);
                }
                View$OnClickListenerC3963d.this.f12999e.m1037a(Integer.valueOf(this.f13017g[i - this.f13015e]), recyclingImageView);
                imageView = recyclingImageView;
            }
            return imageView;
        }

        /* renamed from: a */
        public void m972a(int i) {
            if (i != this.f13013c) {
                this.f13013c = i;
                this.f13014d = new AbsListView.LayoutParams(-1, View$OnClickListenerC3963d.this.f12996b);
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public void m970b(int i) {
            this.f13015e = i;
        }

        /* renamed from: a */
        public int m973a() {
            return this.f13015e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            m969c(((Integer) getItem(i)).intValue());
        }

        /* renamed from: c */
        private void m969c(int i) {
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(View$OnClickListenerC3963d.this.m13745i());
            try {
                InputStream m988a = View$OnClickListenerC3963d.this.m988a(i);
                wallpaperManager.setStream(m988a);
                if (m988a != null) {
                    try {
                        m988a.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public InputStream m988a(int i) {
        try {
            return C3897k.m1236a(m13745i(), this.f13002h.activityInfo.packageName).getResources().openRawResource(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3906h
    /* renamed from: a */
    public void mo985a(final List<Integer> list, final String str, final String str2) {
        if (list != null && list.size() != 0) {
            this.f13001g.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.3
                @Override // java.lang.Runnable
                public void run() {
                    if (list != null) {
                        View$OnClickListenerC3963d.this.f12998d.m971a(list);
                    }
                    if (str != null) {
                        View$OnClickListenerC3963d.this.f13003i.setText(str);
                        View$OnClickListenerC3963d.this.f13003i.setVisibility(0);
                    }
                    if (str2 != null) {
                        View$OnClickListenerC3963d.this.f12994ai.setText(str2);
                        View$OnClickListenerC3963d.this.f12994ai.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.3.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                View$OnClickListenerC3963d.this.m13745i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                            }
                        });
                        View$OnClickListenerC3963d.this.f12994ai.setVisibility(0);
                    }
                }
            });
        }
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
            m13774a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f13002h.activityInfo.packageName)));
        }
    }
}
