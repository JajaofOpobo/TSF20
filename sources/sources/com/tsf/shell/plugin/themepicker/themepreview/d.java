package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
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
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import com.tsf.shell.plugin.themepicker.utils.c;
import com.tsf.shell.plugin.themepicker.utils.h;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends Fragment implements k.b {
    private com.tsf.shell.plugin.themepicker.utils.d a;
    private ViewGroup b;
    private b c;
    private final String d = "http://gcm.tsfui.com/recommend_theme.xml";
    private final int e = 100;
    private a f;
    private int g;
    private int h;
    private int i;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        c.a aVar = new c.a(i(), "thumbs");
        aVar.a(0.25f);
        this.a = new com.tsf.shell.plugin.themepicker.utils.d(i(), 480, 720);
        this.a.a(i().f(), aVar);
        this.f = new a();
        this.g = (int) TypedValue.applyDimension(1, 50.0f, i().getResources().getDisplayMetrics());
        this.h = j().getDimensionPixelSize(f.d.theme_preview_width_size);
        this.i = j().getDimensionPixelSize(f.d.theme_preview_spacing);
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        this.a.a(false);
        super.q();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onPause");
        super.r();
        this.a.b(false);
        this.a.a(true);
        this.a.h();
    }

    @Override // android.support.v4.app.Fragment
    public void s() {
        super.s();
        this.a.i();
        b();
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.tsf.shell.plugin.themepicker.e.b("PackageChangeReceiver ActionCode:" + intent.getAction());
            d.this.M();
        }
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
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onCreateView");
        this.b = (ViewGroup) layoutInflater.inflate(f.h.theme_preview_fragment_layout, viewGroup, false);
        M();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        k.a(i(), "http://gcm.tsfui.com/recommend_theme.xml", this);
    }

    @Override // android.support.v4.app.Fragment
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            i().setResult(-1, intent);
            i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.k.b
    public void a(List<k.e> list) {
        if (list != null) {
            final GridView gridView = (GridView) this.b.findViewById(f.C0155f.gridView1);
            this.c = new b(list, i());
            gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.d.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                @TargetApi(16)
                public void onGlobalLayout() {
                    int iFloor = (int) Math.floor(gridView.getWidth() / (d.this.h + d.this.i));
                    if (iFloor > 0) {
                        int width = (gridView.getWidth() / iFloor) - d.this.i;
                        d.this.c.a(iFloor);
                        d.this.c.b(width);
                        if (h.e()) {
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

    private class b extends BaseAdapter implements AdapterView.OnItemClickListener {
        private List<k.e> b;
        private Context c;
        private int d = 0;
        private int e = 0;
        private AbsListView.LayoutParams f;

        public b(List<k.e> list, Context context) {
            this.b = list;
            this.c = context;
        }

        public void a(int i) {
            this.d = i;
        }

        public void b(int i) {
            if (i != this.e) {
                this.e = i;
                this.f = new AbsListView.LayoutParams(-1, this.e);
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.b != null) {
                return this.b.size() + this.d;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.d) {
                return null;
            }
            return this.b.get(i - this.d);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.d) {
                return 0L;
            }
            return i - this.d;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i < this.d ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.d) {
                if (view == null) {
                    view = new View(this.c);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, d.this.g));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(this.c).inflate(f.h.theme_preview_grid_item, (ViewGroup) null);
                }
                k.e eVar = (k.e) getItem(i);
                view.setTag(eVar.b);
                d.this.a.a(eVar.c, (RecyclingImageView) view.findViewById(f.C0155f.imageView1));
                ((TextView) view.findViewById(f.C0155f.textView1)).setText(d.this.c(eVar.a));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            k.e eVar = (k.e) getItem(i);
            if (eVar != null) {
                d.this.b(eVar.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
