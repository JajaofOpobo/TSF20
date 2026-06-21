package com.tsf.shell.plugin.themepicker.theme;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
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
import com.tsf.shell.plugin.themepicker.IconPickerActivity;
import com.tsf.shell.plugin.themepicker.l;
import com.tsf.shell.plugin.themepicker.m;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.r;
import com.tsf.shell.plugin.themepicker.utils.v;
import java.util.List;

/* loaded from: classes.dex */
public class b extends Fragment implements View.OnClickListener {
    private PackageManager a;
    private GridView b;
    private int c;
    private int d;
    private a e;
    private c f;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.a = i().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = this.a.queryIntentActivities(intent, 0);
        this.c = j().getDimensionPixelSize(l.image_thumbnail_size);
        this.d = j().getDimensionPixelSize(l.image_thumbnail_spacing);
        this.e = new a(this.a, i());
        this.e.a(m.ic_preload_large);
        this.f = new c(this, i(), queryIntentActivities);
    }

    @Override // android.support.v4.app.Fragment
    public void c() {
        super.c();
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p.theme_perview_icon_fragment, viewGroup, false);
        this.b = (GridView) inflate.findViewById(n.gridView);
        this.b.setAdapter((ListAdapter) this.f);
        this.b.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.tsf.shell.plugin.themepicker.theme.b.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i != 2) {
                    b.this.e.b(false);
                } else if (!v.c()) {
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
                int floor = (int) Math.floor(b.this.b.getWidth() / (b.this.c + b.this.d));
                if (floor > 0) {
                    int width = (b.this.b.getWidth() / floor) - b.this.d;
                    b.this.f.b(floor);
                    b.this.f.a(width);
                    if (v.e()) {
                        b.this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        b.this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(n.imageView1)).setImageResource(m.theme_preview_tsf_ico);
        ((TextView) inflate.findViewById(n.textView1)).setText(r.theme_picker_system);
        inflate.findViewById(n.linearLayout1).setOnClickListener(this);
        inflate.findViewById(n.imageView2).setVisibility(8);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.linearLayout1) {
            IconPickerActivity.r.a();
        }
    }
}
