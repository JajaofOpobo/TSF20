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
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.theme.ThemePickerActivity;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends Fragment implements View.OnClickListener, k.h {
    private int a;
    private k.d ai;
    private int b;
    private a c;
    private d d;
    private GridView e;
    private Handler f;
    private ResolveInfo g;
    private TextView h;
    private TextView i;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        h().getInt("PageIndex");
        this.g = (ResolveInfo) h().getParcelable("resolveInfo");
        this.a = j().getDimensionPixelSize(f.d.image_thumbnail_size);
        this.b = j().getDimensionPixelSize(f.d.image_thumbnail_spacing);
        this.d = new d(this.g, i(), this.a);
        this.d.a(f.e.ic_preload_large);
        this.c = new a(i());
        this.f = new Handler();
        this.ai = k.b(i(), this.g.activityInfo.packageName, this);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
        e.b("Fragment onDetach:" + this.g.activityInfo.packageName);
        if (this.ai != null) {
            this.ai.a(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.h.theme_perview_icon_fragment, viewGroup, false);
        this.e = (GridView) viewInflate.findViewById(f.C0155f.gridView);
        this.e.setAdapter((ListAdapter) this.c);
        this.e.setOnItemClickListener(this.c);
        this.e.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.i.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    i.this.d.b(false);
                } else if (!com.tsf.shell.plugin.themepicker.utils.h.c()) {
                    i.this.d.b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.i.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int iFloor = (int) Math.floor(i.this.e.getWidth() / (i.this.a + i.this.b));
                if (iFloor > 0) {
                    int width = (i.this.e.getWidth() / iFloor) - i.this.b;
                    i.this.c.b(iFloor);
                    i.this.c.a(width);
                    if (com.tsf.shell.plugin.themepicker.utils.h.e()) {
                        i.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        i.this.e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView1)).setImageDrawable(this.g.loadIcon(i().getPackageManager()));
        ((TextView) viewInflate.findViewById(f.C0155f.textView1)).setText(this.g.loadLabel(i().getPackageManager()));
        this.h = (TextView) viewInflate.findViewById(f.C0155f.textView2);
        this.i = (TextView) viewInflate.findViewById(f.C0155f.textView3);
        viewInflate.findViewById(f.C0155f.linearLayout1).setOnClickListener(this);
        ((ImageView) viewInflate.findViewById(f.C0155f.imageView2)).setOnClickListener(this);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        super.q();
        this.d.a(false);
        this.c.notifyDataSetChanged();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        super.r();
        this.d.b(false);
        this.d.a(true);
        this.d.h();
    }

    @Override // android.support.v4.app.Fragment
    public void s() {
        super.s();
        this.d.i();
    }

    private class a extends BaseAdapter implements AdapterView.OnItemClickListener {
        private final Context b;
        private int f;
        private int[] g;
        private String[] h;
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
            if (a() == 0) {
                return 0;
            }
            if (this.g == null && this.h == null) {
                return 0;
            }
            if (this.g != null) {
                return this.g.length + this.e;
            }
            if (this.h != null) {
                return this.h.length + this.e;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.e) {
                return null;
            }
            if (this.g != null) {
                return Integer.valueOf(this.g[i - this.e]);
            }
            if (this.h != null) {
                return this.h[i - this.e];
            }
            return null;
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
                    recyclingImageView.setLayoutParams(this.d);
                    imageView = recyclingImageView;
                } else {
                    imageView = (ImageView) view;
                }
                if (imageView.getLayoutParams().height != this.c) {
                    imageView.setLayoutParams(this.d);
                }
                if (this.g != null) {
                    i.this.d.a(Integer.valueOf(this.g[i - this.e]), imageView);
                    view2 = imageView;
                } else {
                    i.this.d.a(this.h[i - this.e], imageView);
                    view2 = imageView;
                }
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

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Bitmap bitmap;
            Drawable drawable = ((ImageView) view).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (bitmap = ((BitmapDrawable) ((TransitionDrawable) drawable).getDrawable(1)).getBitmap()) != null && !(i.this.i() instanceof ThemePickerActivity)) {
                ((IconPickerActivity) i.this.i()).a(bitmap);
            }
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.k.h
    public void a(final List<Integer> list, final String str, final String str2) {
        this.f.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.i.3
            @Override // java.lang.Runnable
            public void run() {
                if (list != null) {
                    i.this.c.a(list);
                }
                if (str != null) {
                    i.this.h.setText(str);
                    i.this.h.setVisibility(0);
                }
                if (str2 != null) {
                    i.this.i.setText(str2);
                    i.this.i.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.i.3.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            i.this.i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                        }
                    });
                    i.this.i.setVisibility(0);
                }
            }
        });
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
            a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.g.activityInfo.packageName)));
        }
    }
}
