package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.ai;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.utils.v;
import java.util.List;

/* loaded from: classes.dex */
public class f extends Fragment implements ai {
    private d a;
    private ViewGroup b;
    private h c;
    private final int d = 100;
    private g e;
    private int f;
    private int g;
    private int h;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewLocalFragment onCreate  ");
        this.a = new d(i(), (int) TypedValue.applyDimension(1, 160.0f, j().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, j().getDisplayMetrics()));
        this.e = new g(this);
        this.f = (int) TypedValue.applyDimension(1, 50.0f, i().getResources().getDisplayMetrics());
        this.g = j().getDimensionPixelSize(com.tsf.shell.plugin.themepicker.l.theme_preview_width_size);
        this.h = j().getDimensionPixelSize(com.tsf.shell.plugin.themepicker.l.theme_preview_spacing);
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void p() {
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewLocalFragment onResume");
        this.a.a(false);
        super.p();
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewLocalFragment onPause");
        super.q();
        this.a.b(false);
        this.a.a(true);
        this.a.h();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewLocalFragment onPause");
        super.r();
        this.a.i();
        b();
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        i().registerReceiver(this.e, intentFilter);
    }

    private void b() {
        i().unregisterReceiver(this.e);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.tsf.shell.plugin.themepicker.g.b("ThemePreviewLocalFragment onCreateView");
        this.b = (ViewGroup) layoutInflater.inflate(p.theme_preview_fragment_layout, viewGroup, false);
        L();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        ac.a(i(), this);
    }

    @Override // android.support.v4.app.Fragment
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            i().setResult(-1, intent);
            i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.ai
    public void a(List list) {
        final GridView gridView = (GridView) this.b.findViewById(n.gridView1);
        this.c = new h(this, list, i());
        gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.f.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(gridView.getWidth() / (f.this.g + f.this.h));
                if (floor > 0) {
                    int width = (gridView.getWidth() / floor) - f.this.h;
                    f.this.c.a(floor);
                    f.this.c.b(width);
                    if (v.e()) {
                        gridView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        gridView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        gridView.setAdapter((ListAdapter) this.c);
        gridView.setOnItemClickListener(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
