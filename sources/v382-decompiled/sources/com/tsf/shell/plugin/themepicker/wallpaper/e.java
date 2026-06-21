package com.tsf.shell.plugin.themepicker.wallpaper;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.aj;
import com.tsf.shell.plugin.themepicker.ak;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.l;
import com.tsf.shell.plugin.themepicker.m;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.utils.v;
import com.tsf.shell.plugin.themepicker.w;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class e extends Fragment implements View.OnClickListener, ak {
    private int a;
    private TextView aj;
    private aj ak;
    private int b;
    private int c;
    private f d;
    private a e;
    private GridView f;
    private Handler g;
    private ResolveInfo h;
    private TextView i;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        h().getInt("PageIndex");
        this.h = (ResolveInfo) h().getParcelable("resolveInfo");
        this.a = j().getDimensionPixelSize(l.theme_preview_width_size);
        this.b = j().getDimensionPixelSize(l.theme_wallpaper_height_size);
        this.c = j().getDimensionPixelSize(l.theme_preview_spacing);
        this.e = new a(this.h, i(), this.a, this.b);
        this.e.a(m.ic_preload_large);
        this.d = new f(this, i());
        this.g = new Handler();
        this.ak = ac.a(i(), this.h.activityInfo.packageName, this);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
        g.b("Fragment onDetach:" + this.h.activityInfo.packageName);
        this.ak.a(true);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p.theme_perview_wallpaper_fragment, viewGroup, false);
        this.f = (GridView) inflate.findViewById(n.gridView);
        this.f.setAdapter((ListAdapter) this.d);
        this.f.setOnItemClickListener(this.d);
        this.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.e.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    e.this.e.b(false);
                } else if (!v.c()) {
                    e.this.e.b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.e.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(e.this.f.getWidth() / (e.this.a + e.this.c));
                if (floor > 0) {
                    int width = (e.this.f.getWidth() / floor) - e.this.c;
                    e.this.d.b(floor);
                    e.this.d.a(width);
                    if (v.e()) {
                        e.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        e.this.f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(n.imageView1)).setImageDrawable(this.h.loadIcon(i().getPackageManager()));
        ((TextView) inflate.findViewById(n.textView1)).setText(this.h.loadLabel(i().getPackageManager()));
        this.i = (TextView) inflate.findViewById(n.textView2);
        this.aj = (TextView) inflate.findViewById(n.textView3);
        inflate.findViewById(n.linearLayout1).setOnClickListener(this);
        ((ImageView) inflate.findViewById(n.imageView2)).setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void p() {
        super.p();
        this.e.a(false);
        this.d.notifyDataSetChanged();
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        super.q();
        this.e.b(false);
        this.e.a(true);
        this.e.h();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        super.r();
        this.e.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream a(int i) {
        try {
            return ac.a(i(), this.h.activityInfo.packageName).getResources().openRawResource(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.ak
    public void a(final List list, final String str, final String str2) {
        if (list != null && list.size() != 0) {
            this.g.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.e.3
                @Override // java.lang.Runnable
                public void run() {
                    if (list != null) {
                        e.this.d.a(list);
                    }
                    if (str != null) {
                        e.this.i.setText(str);
                        e.this.i.setVisibility(0);
                    }
                    if (str2 != null) {
                        e.this.aj.setText(str2);
                        TextView textView = e.this.aj;
                        final String str3 = str2;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.wallpaper.e.3.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                e.this.i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                            }
                        });
                        e.this.aj.setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.linearLayout1) {
            if (view.getId() == n.linearLayout1) {
                ComponentCallbacks2 i = i();
                if (i instanceof w) {
                    ((w) i).h();
                    return;
                }
                return;
            }
            return;
        }
        if (view.getId() == n.imageView2) {
            a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.h.activityInfo.packageName)));
        }
    }
}
