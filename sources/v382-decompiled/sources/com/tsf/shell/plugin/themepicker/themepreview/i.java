package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
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
import com.tsf.shell.plugin.themepicker.ae;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.utils.m;
import com.tsf.shell.plugin.themepicker.utils.o;
import com.tsf.shell.plugin.themepicker.utils.v;
import java.util.List;

/* loaded from: classes.dex */
public class i extends Fragment implements ae {
    private o a;
    private ViewGroup b;
    private k c;
    private final String d = "http://gcm.tsfui.com/recommend_theme.xml";
    private final int e = 100;
    private j f;
    private int g;
    private int h;
    private int i;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        m mVar = new m(i(), "thumbs");
        mVar.a(0.25f);
        this.a = new o(i(), 480, 720);
        this.a.a(i().f(), mVar);
        this.f = new j(this);
        this.g = (int) TypedValue.applyDimension(1, 50.0f, i().getResources().getDisplayMetrics());
        this.h = j().getDimensionPixelSize(com.tsf.shell.plugin.themepicker.l.theme_preview_width_size);
        this.i = j().getDimensionPixelSize(com.tsf.shell.plugin.themepicker.l.theme_preview_spacing);
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void p() {
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
        i().registerReceiver(this.f, intentFilter);
    }

    private void b() {
        i().unregisterReceiver(this.f);
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
        ac.a(i(), "http://gcm.tsfui.com/recommend_theme.xml", this);
    }

    @Override // android.support.v4.app.Fragment
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            i().setResult(-1, intent);
            i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.ae
    public void a(List list) {
        if (list != null) {
            final GridView gridView = (GridView) this.b.findViewById(n.gridView1);
            this.c = new k(this, list, i());
            gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.i.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                @TargetApi(16)
                public void onGlobalLayout() {
                    int floor = (int) Math.floor(gridView.getWidth() / (i.this.h + i.this.i));
                    if (floor > 0) {
                        int width = (gridView.getWidth() / floor) - i.this.i;
                        i.this.c.a(floor);
                        i.this.c.b(width);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
