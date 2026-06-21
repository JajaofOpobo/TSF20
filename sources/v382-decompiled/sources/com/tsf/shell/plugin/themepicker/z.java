package com.tsf.shell.plugin.themepicker;

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
import java.util.List;

/* loaded from: classes.dex */
public class z extends Fragment implements View.OnClickListener, ak {
    private int a;
    private ag aj;
    private int b;
    private aa c;
    private f d;
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
        this.a = j().getDimensionPixelSize(l.image_thumbnail_size);
        this.b = j().getDimensionPixelSize(l.image_thumbnail_spacing);
        this.d = new f(this.g, i(), this.a);
        this.d.a(m.ic_preload_large);
        this.c = new aa(this, i());
        this.f = new Handler();
        this.aj = ac.b(i(), this.g.activityInfo.packageName, this);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
        g.b("Fragment onDetach:" + this.g.activityInfo.packageName);
        if (this.aj != null) {
            this.aj.a(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p.theme_perview_icon_fragment, viewGroup, false);
        this.e = (GridView) inflate.findViewById(n.gridView);
        this.e.setAdapter((ListAdapter) this.c);
        this.e.setOnItemClickListener(this.c);
        this.e.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.z.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    z.this.d.b(false);
                } else if (!com.tsf.shell.plugin.themepicker.utils.v.c()) {
                    z.this.d.b(true);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.z.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(z.this.e.getWidth() / (z.this.a + z.this.b));
                if (floor > 0) {
                    int width = (z.this.e.getWidth() / floor) - z.this.b;
                    z.this.c.b(floor);
                    z.this.c.a(width);
                    if (com.tsf.shell.plugin.themepicker.utils.v.e()) {
                        z.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        z.this.e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(n.imageView1)).setImageDrawable(this.g.loadIcon(i().getPackageManager()));
        ((TextView) inflate.findViewById(n.textView1)).setText(this.g.loadLabel(i().getPackageManager()));
        this.h = (TextView) inflate.findViewById(n.textView2);
        this.i = (TextView) inflate.findViewById(n.textView3);
        inflate.findViewById(n.linearLayout1).setOnClickListener(this);
        ((ImageView) inflate.findViewById(n.imageView2)).setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void p() {
        super.p();
        this.d.a(false);
        this.c.notifyDataSetChanged();
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        super.q();
        this.d.b(false);
        this.d.a(true);
        this.d.h();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        super.r();
        this.d.i();
    }

    @Override // com.tsf.shell.plugin.themepicker.ak
    public void a(final List list, final String str, final String str2) {
        this.f.post(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.z.3
            @Override // java.lang.Runnable
            public void run() {
                if (list != null) {
                    z.this.c.a(list);
                }
                if (str != null) {
                    z.this.h.setText(str);
                    z.this.h.setVisibility(0);
                }
                if (str2 != null) {
                    z.this.i.setText(str2);
                    TextView textView = z.this.i;
                    final String str3 = str2;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.z.3.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            z.this.i().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                        }
                    });
                    z.this.i.setVisibility(0);
                }
            }
        });
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
            a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.g.activityInfo.packageName)));
        }
    }
}
