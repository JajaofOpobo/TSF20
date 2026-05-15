package com.tsf.shell.plugin.themepicker.wallpaper;

import android.annotation.TargetApi;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
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
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import com.tsf.shell.plugin.themepicker.utils.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends Fragment implements View.OnClickListener, k.h {
    private int a;
    private TextView ai;
    private k.g aj;
    private int b;
    private int c;
    private a d;
    private com.tsf.shell.plugin.themepicker.wallpaper.a e;
    private GridView f;
    private Handler g;
    private ResolveInfo h;
    private TextView i;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        h().getInt("PageIndex");
        this.h = (ResolveInfo) h().getParcelable("resolveInfo");
        this.a = j().getDimensionPixelSize(f.d.theme_preview_width_size);
        this.b = j().getDimensionPixelSize(f.d.theme_wallpaper_height_size);
        this.c = j().getDimensionPixelSize(f.d.theme_preview_spacing);
        this.e = new com.tsf.shell.plugin.themepicker.wallpaper.a(this.h, i(), this.a, this.b);
        this.e.a(f.e.ic_preload_large);
        this.d = new a(i());
        this.g = new Handler();
        this.aj = k.a(i(), this.h.activityInfo.packageName, this);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
        e.b("Fragment onDetach:" + this.h.activityInfo.packageName);
        this.aj.a(true);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.h.theme_perview_wallpaper_fragment, viewGroup, false);
        this.f = (GridView) viewInflate.findViewById(f.C0155f.gridView);
        this.f.setAdapter((ListAdapter) this.d);
        this.f.setOnItemClickListener(this.d);
        this.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    d.this.e.b(false);
                } else if (!h.c()) {
                    d.this.e.b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int iFloor = (int) Math.floor(d.this.f.getWidth() / (d.this.a + d.this.c));
                if (iFloor > 0) {
                    int width = (d.this.f.getWidth() / iFloor) - d.this.c;
                    d.this.d.b(iFloor);
                    d.this.d.a(width);
                    if (h.e()) {
                        d.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        d.this.f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView1)).setImageDrawable(this.h.loadIcon(i().getPackageManager()));
        ((TextView) viewInflate.findViewById(f.C0155f.textView1)).setText(this.h.loadLabel(i().getPackageManager()));
        this.i = (TextView) viewInflate.findViewById(f.C0155f.textView2);
        this.ai = (TextView) viewInflate.findViewById(f.C0155f.textView3);
        viewInflate.findViewById(f.C0155f.linearLayout1).setOnClickListener(this);
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView2)).setOnClickListener(this);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        super.q();
        this.e.a(false);
        this.d.notifyDataSetChanged();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        super.r();
        this.e.b(false);
        this.e.a(true);
        this.e.h();
    }

    @Override // android.support.v4.app.Fragment
    public void s() {
        super.s();
        this.e.i();
    }

    private class a extends BaseAdapter implements AdapterView.OnItemClickListener {
        private final Context b;
        private int f;
        private int[] g;
        private int c = 0;
        private int e = 0;
        private AbsListView.LayoutParams d = new AbsListView.LayoutParams(-1, -1);

        public a(Context context) {
            this.f = 0;
            this.b = context;
            this.f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
            e.b("mActionBarHeight:" + this.f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (a() == 0 || this.g == null) {
                return 0;
            }
            return this.g.length + this.e;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.e) {
                return null;
            }
            return Integer.valueOf(this.g[i - this.e]);
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

        public void a(List<Integer> list) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            this.g = iArr;
            notifyDataSetChanged();
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
                    recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    recyclingImageView.setLayoutParams(this.d);
                    imageView = recyclingImageView;
                } else {
                    imageView = (ImageView) view;
                }
                if (imageView.getLayoutParams().height != this.c) {
                    imageView.setLayoutParams(this.d);
                }
                d.this.e.a(Integer.valueOf(this.g[i - this.e]), imageView);
                view2 = imageView;
            }
            return view2;
        }

        public void a(int i) {
            if (i != this.c) {
                this.c = i;
                this.d = new AbsListView.LayoutParams(-1, d.this.b);
                notifyDataSetChanged();
            }
        }

        public void b(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c(((Integer) getItem(i)).intValue());
        }

        private void c(int i) {
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(d.this.i());
            try {
                InputStream inputStreamA = d.this.a(i);
                wallpaperManager.setStream(inputStreamA);
                if (inputStreamA != null) {
                    try {
                        inputStreamA.close();
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
    public InputStream a(int i) {
        try {
            return k.a(i(), this.h.activityInfo.packageName).getResources().openRawResource(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.k.h
    public void a(final List<Integer> list, final String str, final String str2) {
        if (list != null && list.size() != 0) {
            this.g.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.3
                @Override // java.lang.Runnable
                public void run() {
                    if (list != null) {
                        d.this.d.a(list);
                    }
                    if (str != null) {
                        d.this.i.setText(str);
                        d.this.i.setVisibility(0);
                    }
                    if (str2 != null) {
                        d.this.ai.setText(str2);
                        d.this.ai.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.d.3.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                d.this.i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                            }
                        });
                        d.this.ai.setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.linearLayout1) {
            if (view.getId() == f.C0155f.linearLayout1) {
                b.a aVarI = i();
                if (aVarI instanceof SildingMenuLayout.d) {
                    ((SildingMenuLayout.d) aVarI).h();
                    return;
                }
                return;
            }
            return;
        }
        if (view.getId() == f.C0155f.imageView2) {
            a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.h.activityInfo.packageName)));
        }
    }
}
