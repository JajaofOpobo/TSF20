package com.tsf.shell.plugin.themepicker;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
public class c extends Fragment implements View.OnClickListener {
    private GridView a;
    private d b;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.b = new d(this, i());
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p.theme_preview_gallery_fragment, viewGroup, false);
        this.a = (GridView) inflate.findViewById(n.gridView);
        this.a.setAdapter((ListAdapter) this.b);
        this.a.setOnItemClickListener(this.b);
        final int applyDimension = (int) TypedValue.applyDimension(1, 150.0f, j().getDisplayMetrics());
        final int dimensionPixelSize = j().getDimensionPixelSize(l.theme_app_height_size);
        final int applyDimension2 = (int) TypedValue.applyDimension(1, 10.0f, j().getDisplayMetrics());
        final int applyDimension3 = (int) TypedValue.applyDimension(1, 20.0f, j().getDisplayMetrics());
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.c.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int width = c.this.a.getWidth() - applyDimension3;
                int floor = (int) Math.floor(width / (applyDimension + applyDimension2));
                if (floor > 0) {
                    int i = (width / floor) - applyDimension2;
                    c.this.b.b(floor);
                    c.this.b.a(dimensionPixelSize);
                    if (com.tsf.shell.plugin.themepicker.utils.v.e()) {
                        c.this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        c.this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        ((ImageView) inflate.findViewById(n.imageView1)).setImageResource(m.ic_launcher_wallpaper);
        ((TextView) inflate.findViewById(n.textView1)).setText(r.theme_picker_theme_picker_gallery_apps);
        inflate.findViewById(n.linearLayout1).setOnClickListener(this);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.linearLayout1) {
            ComponentCallbacks2 i = i();
            if (i instanceof w) {
                ((w) i).h();
            }
        }
    }
}
